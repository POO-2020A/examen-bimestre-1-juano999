
import java.util.Scanner;

 // @author carl-
 
public class UserInterface {
    
    private Scanner scanner;

    public UserInterface(Scanner scanner) {
        
        this.scanner = scanner;
    }
    
    public void start() {
        
        int rows = validRows();
        
        
        int cols = validCols();
        Plane avion = new Plane(rows, cols);
        avion.initseats();
        System.out.println("Este es el mapa del avion:");
        System.out.println(avion); //falta
        
        while(true) {
                    
            int op = menu();
            switch(op) {
                case 1:
                {
                    ingresarPasajero(avion);
                    break;
                }
                case 2:
                {
                    consultarAsiento(avion);
                    break;
                }
                case 3:
                {
                    consultarPasajero(avion);
                    break;
                }
            }
        }
        
        
        
        
        
    }
    public int menu() {
        System.out.println("¿Que desea hacer?");
        System.out.println("1. Ingresar Pasajero");
        System.out.println("2. Cosultar asiento");
        System.out.println("3. consultar Pasajero");
        System.out.print("Ingrese la opcion: ");
        return Integer.valueOf(scanner.nextLine());
        
    }
    public int validRows() {
        int rows;
        do {
            System.out.println("Ingrese la cantidad de filas:");
            rows = Integer.valueOf(scanner.nextLine());
           
        } while(rows > 20);
        return rows;
    }
    
    public int validCols() {
        int cols;
        do {
            System.out.println("Ingrese la cantidad de columnas:");
            cols = Integer.valueOf(scanner.nextLine());
           
        } while(cols > 8);
        return cols;
    }
    
    public void ingresarPasajero(Plane avion) {
        System.out.println("Ingresar un pasajero:");
        System.out.print("Ingrese el nombre del pasajero: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese el apellido del pasajero: ");
        String apellido = scanner.nextLine();
        System.out.print("Ingrese la fila del Asiento: ");
        int fila = Integer.valueOf(scanner.nextLine());
        System.out.print("Ingrese la columna del Asiento: ");
        String columna = scanner.nextLine();
       int numCol = convertToNum(columna);

        int index = index(avion, fila, numCol);
       
        if (avion.getSeats().get(index).isFree()) {
            Passenger newPasajero = new Passenger(nombre, apellido);
            avion.getSeats().get(index).setPassenger(newPasajero);
        } else {
            System.out.println("El asiento esta ocupado");
        }
        
    }
    public void consultarAsiento(Plane avion) {
        System.out.println("Consulta de Asiento");
        System.out.print("INgrese fila del asiento: ");
        int fila = Integer.valueOf(scanner.nextLine());
        System.out.print("INgrese columna del asiento: ");
        String columna = scanner.nextLine();
        
    }
    public void consultarPasajero(Plane avion) {
        System.out.println("Consulta de Pasajero");
        System.out.print("Ingrese el nombre y apellido: ");
        String nombre = scanner.nextLine();
        String partes[] = nombre.split(" ");
        Passenger compared = new Passenger(partes[0], partes[1]);
        if(avion.getSeats().contains(compared)) {
            System.out.println("El pasajero se encuantra en: ");
        }
        
    }
    
    public int index(Plane avion, int fila, int columna) {
        int cont = 0;
        for(int row = 1; row<= avion.getRows() ; row++) {
            
            for(int j = 1; j <= avion.getCols(); j++) {
                if(fila == row && columna == j) {
                    return cont;
                }
                cont++;
            }
        }
        return cont;
    }
    
    public int  convertToNum(String letra) {
        switch(letra) {
            case"A": return 1;
            case"B": return 2;
            case"C": return 3;
            case"D": return 4;
            case"E": return 5;
            case"F": return 6;
            case"G": return 7;
            case"H": return 8;
            
        }
        return -1;
    }
}
