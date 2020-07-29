
import java.util.ArrayList;

 // @author carl-
 
public class Plane {
    private int rows;
    private int cols;
    private ArrayList<Seat> seats;

    public Plane(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        this.seats = new ArrayList<>();
    }
    
    public void initseats() {
        for(int row = 1; row<= this.rows ; row++) {
            for(int j = 1; j <= this.cols; j++) {
                String col = convertToLetter(j);
                this.seats.add(new Seat(row,col));
            }
        }
        
        
    }
    
    public String convertToLetter(int num) {
        switch(num) {
            case 1: return "A";
            case 2: return "B";
            case 3: return "C";
            case 4: return "D";
            case 5: return "E";
            case 6: return "F";
            case 7: return "G";
            case 8: return "H";
            case 9: return "X";
        }
        return null;
    }
    public int getRows() {
        return rows;
    }

    public int getCols() {
        return cols;
    }

    public ArrayList<Seat> getSeats() {
        return seats;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }

    public void setCols(int cols) {
        this.cols = cols;
    }

    public void setSeats(ArrayList<Seat> seats) {
        this.seats = seats;
    }
    
    public void addPassenger() {
        
    }

    @Override
    public String toString() {
        //String mapa = "";
        //agregar
        return "Falta";
    }
    
    
}


