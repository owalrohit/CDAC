package in.cdac;

public class Main {

	public static void main(String[] args) {
		System.out.println("Airplane Seat Management System");
		
		int rows = AirplaneSeatManagerUtil.getInput("Enter number of rows : ");
		int columns = AirplaneSeatManagerUtil.getInput("Enter number of columns : ");
		
		AirplaneSeatManager manager  = new AirplaneSeatManager(rows, columns);
		
		boolean exit=false;
		
		while(!exit) {
			AirplaneSeatManagerUtil.displayMenu();
			int choice = AirplaneSeatManagerUtil.getInput("");
			
			switch (choice) {
			case 1:
                int bookRow = AirplaneSeatManagerUtil.getInput("Enter row to book: ");
                int bookCol = AirplaneSeatManagerUtil.getInput("Enter column to book: ");
                if (manager.bookSeat(bookRow, bookCol)) {
                    System.out.println("Seat booked successfully.");
                } else {
                    System.out.println("Seat already booked or invalid seat.");
                }

				break;
			case 2:
                int cancelRow = AirplaneSeatManagerUtil.getInput("Enter row to cancel: ");
                int cancelCol = AirplaneSeatManagerUtil.getInput("Enter column to cancel: ");
                if (manager.cancelSeat(cancelRow, cancelCol)) {
                    System.out.println("Booking canceled successfully.");
                } else {
                    System.out.println("No booking found or invalid seat.");
                }

				
				break;

			case 3:
                int checkRow = AirplaneSeatManagerUtil.getInput("Enter row to check: ");
                int checkCol = AirplaneSeatManagerUtil.getInput("Enter column to check: ");
                if (manager.isSeatAvailable(checkRow, checkCol)) {
                    System.out.println("Seat is available.");
                } else {
                    System.out.println("Seat is not available.");
                }

	
				break;

			case 4:
                manager.displaySeats();
				break;

			case 5:
				exit = true;
                System.out.println("Exit");
				break;
			
			}
		}
	}
}
