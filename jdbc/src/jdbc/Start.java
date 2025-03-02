package jdbc;
import java.io.*;

import com.student.manage.Student;
import com.student.manage.StudentController;

public class Start {
    public static void main(String[] args) throws IOException {
        System.out.println("Welcome to Student Management App");

        // Corrected class name
       BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            System.out.println("Press 1 to add student");
            System.out.println("Press 2 to delete student");
            System.out.println("Press 3 to display student");
            System.out.println("Press 4 to exit");

            System.out.print("Enter your choice: ");
            int c = Integer.parseInt(br.readLine()); // Taking user input
            
            if(c==1) {
            	//adding student 
            	System.out.println("Enter Student Name:");
            	String name=br.readLine();
            	System.out.println("Enter Division:");
            	String division=br.readLine();
            	System.out.println("Enter CGPA:");
            	String cgpa=br.readLine();
            	
            	
            	Student st=new Student(name, division, cgpa);
            	System.out.println("Stud:"+st);
            	
            	Boolean answer=StudentController.insertStudent(st);
            	if(answer) {
            		System.out.println("Student Entry Added Sucessfully!!");
            	}else {
					System.out.println("Error while Addin Student in DB");
				}
            }
            else if (c==2) {
				//deleting student
            	System.out.println("Enter the Roll Number of Student to Delete:");
            	int roll=Integer.parseInt(br.readLine());
            	Boolean answer=StudentController.deleteStudent(roll);
            	if(answer) {
            		System.out.println("Student Entry Deleted Sucessfully!!");
            	}else {
					System.out.println("Error while Deleting Student in DB");
				}
            	
			}
            else if(c==3) {
				//displaying student
            	StudentController.displayStudents();
			}
            else if (c==4) {
				//exiting the student
            	break;
            	
			}
            else {
				
			}
            
           
        }
        System.out.println("Thanks for using our app");
       
       
    }
}
