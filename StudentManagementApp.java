import java.util.*;

class Student 
{
    String name,rollNumber,grade, address;

    public Student(String name, String rollNumber, String grade, String address) 
	{
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
        this.address = address;
    }

    public String getName() 
	{
        return name;
    }

    public String getRollNumber() 
	{
        return rollNumber;
    }

    public String getGrade() 
	{
        return grade;
    }

    public String getaddress() 
	{
        return address;
    }
	
    public String toString() 
	{
        return "Name: " + name + "\nRoll Number: " + rollNumber + "\nGrade: " + grade + "\naddress: " + address ;
    }
}

class StudentManagementSystem 
{
    private ArrayList<Student> students = new ArrayList<>();

    public void addStudent(Student student) 
	{
        students.add(student);
    }

    public void removeStudent(String rollNumber) 
	{
        students.removeIf(student -> student.getRollNumber().equals(rollNumber));
    }

    public Student searchStudent(String rollNumber) 
	{
        for (Student student : students) 
		{
            if (student.getRollNumber().equals(rollNumber)) 
			{
                return student;
            }
        }
        return null;
    }

    public void displayAllStudents() 
	{
        for (Student student : students) 
		{
			System.out.println("++++++++++++++++++");
            System.out.println(student);
        }
    }
}

public class StudentManagementApp 
{
    public static void main(String[]x) 
	{
        Scanner sc = new Scanner(System.in);
        StudentManagementSystem sms = new StudentManagementSystem();

        while (true) {
            System.out.println("-----------------------------");
            System.out.println("Student Management System");
            System.out.println("-----------------------------");
            System.out.println("1. Add Student");
            System.out.println("2. Remove Student");
            System.out.println("3. Search Student");
            System.out.println("4. Display All Students");
            System.out.println("5. Exit");
			System.out.println("-----------------------------");
			System.out.print("");
            System.out.print("Enter your choice: ");
            String ch = sc.nextLine();
			System.out.println("***********************");
            switch (ch) {
                case "1":
                    System.out.print("Enter student name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter roll number: ");
                    String rollNumber = sc.nextLine();
                    System.out.print("Enter grade: ");
                    String grade = sc.nextLine();
                    System.out.print("Enter student address: ");
                    String address = sc.nextLine();

                    if (!name.isEmpty() && !rollNumber.isEmpty() && !grade.isEmpty()) 
					{
                        Student student = new Student(name, rollNumber, grade, address);
                        sms.addStudent(student);
						System.out.println("***********************************");
                        System.out.println("Student added successfully.");
						System.out.println("***********************************");
                    } 
					else 
					{
						System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
                        System.out.println("Please fill in all required fields.");
						System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
                    }
                    break;

                case "2":
                    System.out.print("Enter roll number of student to remove: ");
                    String rollToRemove = sc.nextLine();
                    sms.removeStudent(rollToRemove);
					System.out.println("***********************************");
                    System.out.println("Student removed.");
					System.out.println("***********************************");
                    break;

                case "3":
                    System.out.print("Enter roll number of student to search: ");
                    String rollToSearch = sc.nextLine();
                    Student foundStudent = sms.searchStudent(rollToSearch);

                    if (foundStudent != null) 
					{
                        System.out.println(foundStudent);
                    } 
					else 
					{
                        System.out.println("Student not found.");
                    }
                    break;

                case "4":
                    sms.displayAllStudents();
                    break;

                case "5":
                    System.out.println(">>>App Exited Successfully<<<");
                    System.exit(0);

                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }
}