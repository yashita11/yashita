import java.util.Scanner;



class information{
    String name;
    String father;
    String mother;
    int age;
    String clas;
    String subject;
    String address;
    int phone;

}
public class normal{

    public static void main(String[] args) {
        normal student  = new normal();
        Scanner object = new Scanner(System.in);
        System.out.println("enter the name" );
         String name = object.next();
         System.out.println("enter the father's name");
         String father = object.next();
         System.out.println("enter the mother's name");
         String mother = object.next();
         System.out.println("enter the age");
         int age = object.nextInt();
         System.out.println("enter the class");
         String clas = object.next();
         System.out.println("enter the subject");
         String subject = object.next();
         System.out.println("enter the address");
         String address = object.next();
         System.out.println("enter the phone no.");
         int phone = object.nextInt();






         System.out.println("student information");

         System.out.println( " student name :-  "   + name);
         System.out.println( " student father's name :- "   + father);
         System.out.println( " student mother's name :- "   + mother);
         System.out.println("  student age :- "    + age);
         System.out.println(" student class :- "   + clas);
         System.out.println( "  student subject :- "   + subject);
         System.out.println(" student address :- "   + address);
         System.out.println(" student phone number :- "   + phone);

  
    }
}