import java.util.Scanner;

// Main class for the College E-Administration system
public class Main {
	EAdmin service=new EAdmin(); // Creating an instance of EAdmin

	// Method to display the menu options
	public static void menu() {
        System.out.println("****************Welcome To COLLEGE E-ADMINISTRATION *********** "
        		+ "\n1. Add department"
        		+ "\n2. Delete department"
        		+ "\n3. View All departments"
                        + "\n4. Add course "
        		+ "\n5. Delete courses"
        		+ "\n6. View All courses"
        		+ "\n7. Exit ");
	}
        // Main method to run the application
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in); // Scanner object for user input
		EAdmin service=new EAdmin(); // Creating an instance of EAdmin
		
		// Main loop to display menu and handle user choices
		do {
			menu();
			System.out.println("Enter your Choice");
			int choice=sc.nextInt(); // Reading user's choice
			switch(choice) {
			
			case 1:
				System.out.println("Add departments");
				service.adddept(); // Calling method to add department
				break;
			case 2:
				System.out.println("Delete departments");
				service.deletedep(); // Calling method to delete department
				break;
			case 3:
				System.out.println("view All departments");
				service.viewAlldept(); // Calling method to view all departments
				break;
                        case 4:
				System.out.println("Add courses");
				service.addCourse(); // Calling method to add course
				break;
			case 5:
				System.out.println("Delete courses");
				service.deleteCourse(); // Calling method to delete course
				break;
			case 6:
				System.out.println("view All courses");
				service.viewAllCourse(); // Calling method to view all courses
				break;
			case 7:
				System.out.println("Thank you for using application!!");
				System.exit(0); // Exiting the application
				
			default: // Handling invalid input
				System.out.println("Please enter valid choice"); 
				break;
					
			}
			
		}while(true); // Infinite loop to keep the application running
	}

}
