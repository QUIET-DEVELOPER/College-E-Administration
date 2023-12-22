import java.util.Scanner;
public class Main {
	EAdmin service=new EAdmin();
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
	 
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		EAdmin service=new EAdmin();
		
		do {
			menu();
			System.out.println("Enter your Choice");
			int choice=sc.nextInt();
			switch(choice) {
			
			case 1:
				System.out.println("Add departments");
				service.adddept();
				break;
			case 2:
				System.out.println("Delete departments");
				service.deletedep();
				break;
			case 3:
				System.out.println("view All departments");
				service.viewAlldept();
				break;
            case 4:
				System.out.println("Add courses");
				service.addCourse();
				break;
			case 5:
				System.out.println("Delete courses");
				service.deleteCourse();
				break;
			case 6:
				System.out.println("view All courses");
				service.viewAllCourse();
				break;
			case 7:
				System.out.println("Thank you for using application!!");
				System.exit(0);
				
			default:
				System.out.println("Please enter valid choice");
				break;
			
			
			}
			
		}while(true);
	}

}
