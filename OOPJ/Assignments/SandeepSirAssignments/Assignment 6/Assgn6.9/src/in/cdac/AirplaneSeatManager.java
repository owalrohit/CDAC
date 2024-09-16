package in.cdac;

public class AirplaneSeatManager {
    private SeatStatus[][] seats;
    private int rows;
    private int columns;
    // Constructor to initialize the seating arrangement
    public AirplaneSeatManager(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        seats = new SeatStatus[rows][columns];
        initializeSeats();
    }
    // Initialize all seats as available
    private void initializeSeats() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                seats[i][j] = SeatStatus.AVAILABLE;
            }
        }
    }
    
    // Helper method to check if the seat is within valid range
    private boolean isValidSeat(int row, int column) {
        return row >= 0 && row < rows && column >= 0 && column < columns;
    }

    // Book a seat (mark it as BOOKED)
    public boolean bookSeat(int row, int column) {
        if (isValidSeat(row, column) && seats[row][column] == SeatStatus.AVAILABLE) {
            seats[row][column] = SeatStatus.BOOKED;
            return true;
        }
        return false;
    }
    // Cancel a seat booking (mark it as AVAILABLE)
    public boolean cancelSeat(int row, int column) {
        if (isValidSeat(row, column) && seats[row][column] == SeatStatus.BOOKED) {
            seats[row][column] = SeatStatus.AVAILABLE;
            return true;
        }
        return false;
    }
    // Check if a specific seat is available
    public boolean isSeatAvailable(int row, int column) {
        if (isValidSeat(row, column)) {
            return seats[row][column] == SeatStatus.AVAILABLE;
        }
        return false;
    }
    // Display the current seating chart
    public void displaySeats() {
        System.out.println("\nCurrent Seating Chart:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(seats[i][j].getSymbol() + " ");
            }
            System.out.println();
        }
    }
   
}
