import java.util.HashSet;
import java.util.Scanner;

public class EAdmin {
    HashSet<Admin> dept=new HashSet<Admin>();
	HashSet<Admin> course = new HashSet<Admin>();
	
	Admin course1 = new Admin(2914,"DBMS");
	Admin course2 = new Admin(1234, "Python");

	
	Admin dep1=new Admin(05, "CSE");
	Admin dep2=new Admin(04, "ECE");

	Scanner sc=new Scanner(System.in);
	int id;
	String name;
	
	public EAdmin() {
		
		dept.add(dep1);
		dept.add(dep2);
		course.add(course1);
		course.add(course2);
	}

	// view all courses
	public void viewAllCourse() {
		for(Admin crse:course) {
			System.out.println(crse);
		}
	}
	//view all departments
	public void viewAlldept() {
		for(Admin dep:dept) {
			System.out.println(dep);
		}
	}
	//delete department
	public void deletedep() {
		System.out.println("Enter id");
		id=sc.nextInt();
		boolean found=false;
		Admin empdelete=null;
		for(Admin dep:dept) {
			if(dep.getId()==id) {
				empdelete=dep;
				found=true;
			}
		}
		if(!found) {
			System.out.println("Department is not present");
		}
		else {
			dept.remove(empdelete);
			System.out.println("Department deleted successfully!!");
		}
	}

	//delete courses
	public void deleteCourse() {
		System.out.println("Enter id");
		id=sc.nextInt();
		boolean found=false;
		Admin empdelete=null;
		for(Admin crse:course) {
			if(crse.getId()==id) {
				empdelete=crse;
				found=true;
			}
		}
		if(!found) {
			System.out.println("course is not present");
		}
		else {
			course.remove(empdelete);
			System.out.println("course deleted successfully!!");
		}
	}

	//add departments
	public void adddept() {
		System.out.println("Enter department id:");
		id=sc.nextInt();
		System.out.println("Enter department name");
		name=sc.next();
		
		Admin dep=new Admin(id, name);
		
		dept.add(dep);
		System.out.println(dep);
		System.out.println("Department addeed successsfully");
		
	}

	//add courses
	public void addCourse() {
		System.out.println("Enter Course id:");
		id=sc.nextInt();
		System.out.println("Enter Course name");
		name=sc.next();
		
		Admin course1=new Admin(id, name);
		
		course.add(course1);
		System.out.println(course);
		System.out.println("course addeed successsfully");
		
	}
}