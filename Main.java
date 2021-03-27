package student;
import java.util.*;
import student.Student;
public class Main{
    private static int uid = 1000;
    private  static boolean teachbng = false;
     private static boolean teacheng = false;
      private static boolean teachmath = false;
    
    public static void main(String[] args) 
    {
       ArrayList<Student> students = new ArrayList<Student>();
       Scanner input = new Scanner(System.in);

       int menuChoice = 6;
       do {
           System.out.println("\t\t\tStudentRecord");
           System.out.println("\t\t1. Add Student\t2. Edit Students\t3. Delete Student\t4. View Students\t5. View report\t6. Exit");
           try {
               System.out.println("Enter a choice: ");
               menuChoice = Integer.parseInt(input.nextLine());
           } catch (NumberFormatException e) {
               continue;
           }

           if (menuChoice==1)
           {
               System.out.println("Enter class of student : 1. Eight  \t  2.Nine   \t   3.Ten");
               String Class = input.nextLine();
               
               System.out.println("Name:");
               String name = input.nextLine();
               
               System.out.println("do you teach bangla? write yes or no \n");
               String sub = input.nextLine();
               if("yes".equals(sub))teachbng = true;
               
               System.out.println("do you teach english? write yes or no \n");
                sub = input.nextLine();
               if("yes".equals(sub))teacheng = true;
               
                System.out.println("do you teach english? write yes or no \n");
                sub = input.nextLine();
               if("yes".equals(sub))teachmath = true;
            
               Subject subject = new Subject(teachbng,teacheng,teachmath);
               
               try{
                   Student student;
                    uid += 1;
                student = new Student(uid,Class,name,subject);
               students.add(student);
               
               }catch(Exception e){
                   System.out.println("wrong data!! Try again");
               }
           } else if (menuChoice==2) {
               
               System.out.println("Enter student id to edit the student : ");
               String stdId = input.nextLine();
                
               for (Student student : students)
               {
                   if(student.getId().equals(stdId) )
                   {
                       //updating days
                       System.out.println("enter number of days you taught :");
                       int days = input.nextInt();
                       student.updateDays(days);
                       
                       
                       //updating marks
                       if(student.subjects.bng){
                           System.out.println("enter  marks in bangla ");
                           double marks = input.nextDouble();
                           student.subjects.updateBngMarks(marks);
                       }
                        if(student.subjects.eng){
                           System.out.println("enter  marks in english ");
                           double marks = input.nextDouble();
                           student.subjects.updateEngMarks(marks);
                       }
                         if(student.subjects.math){
                           System.out.println("enter  marks in math ");
                           double marks = input.nextDouble();
                           student.subjects.updateMathMarks(marks);
                         }
                      
                   } 
               }
               
           }else if (menuChoice == 3) {
               System.out.println("Enter student id to remove a student : ");
               String stdId = input.nextLine();
               for ( Iterator<Student> it =students.iterator();it.hasNext();)
               { 
                   Student student = it.next();
                   if(student.getId().equals(stdId) )
                   {
                       System.out.println("Removing " + student);
                       it.remove();
                   } 
               }
           }
           else if (menuChoice == 4) {
              System.out.println("Enter class name");
              String entry = input.nextLine();
               for (Student student : students)
               {
                   if(student.getclass().equals(entry) )
                   {
                   System.out.println(student);
                   }
                    
               }
              
           }
            else if (menuChoice == 5) {
              System.out.println("Showing all information : \n");
               for (Student student : students)
               {
                   System.out.println(student);
                    
               }
              
           }
       } while (menuChoice<6);
    }
    
    
    
    public void updateMarks(Subject sub){
        
    }
    public void updateDays(Subject sub){
        
    }
}