

// class Test {

//    public static void main(String args[]) {
//       int x = 30;
//       int y = 10;

//       if( x == 30 ) {
//          if( y == 10 ) {
//             System.out.print("X = 30 and Y = 10");
//          }
//       }
//    }
// }

/*
example of switch cases. notice how b case doesnt have anything itll just go
onto next case until a break is reached

public class Test {

   public static void main(String args[]) {
      // char grade = args[0].charAt(0);
      char grade = 'C';

      switch(grade) {
         case 'A' :
            System.out.println("Excellent!");
            break;
         case 'B' :
         case 'C' :
            System.out.println("Well done");
            break;
         case 'D' :
            System.out.println("You passed");
         case 'F' :
            System.out.println("Better try again");
            break;
         default :
            System.out.println("Invalid grade");
      }
      System.out.println("Your grade is " + grade);
   }
}


while loop example:
public class Test {

   public static void main(String args[]) {
      int x = 10;

      while( x < 20 ) {
         System.out.print("value of x : " + x );
         x++;
         System.out.print("\n");
      }
   }
}

for loop example:
public class Test {

   public static void main(String args[]) {

      for(int x = 10; x < 20; x = x + 1) {
         System.out.print("value of x : " + x );
         System.out.print("\n");
      }
   }
}

do while loop example: guaranteed to run once

public class Test {

   public static void main(String args[]) {
      int x = 10;

      do {
         System.out.print("value of x : " + x );
         x++;
         System.out.print("\n");
      }while( x < 20 );
   }
}


enhanced for loop loops through objects:

public class Test {

   public static void main(String args[]) {
      int [] numbers = {10, 20, 30, 40, 50};

      for(int x : numbers ) {
         System.out.print( x );
         System.out.print(",");
      }
      System.out.print("\n");
      String [] names = {"James", "Larry", "Tom", "Lacy"};

      for( String name : names ) {
         System.out.print( name );
         System.out.print(",");
      }
   }
}

to import define the package using package keyword then name it

you can also use the 'fully qualified name' to import it but you need to always
use the full name

sequence is important. must be package then import then class

interface:
an intergace is written in a file with a .java extension, with the name of the
interfave matching the name of the file.
the byte code appears in a .class file

cant instantiate an interface, interface does not have constructors
all interface methods are abstract ?????
interface isnt extended by a class its implemented by a class

interface key word used to declare an interface ---> not instantiated?
public interface Name{...}
implicitly abstract -->? what does this mean?


exception example:

public class ExcepTest {

   public static void main(String args[]) {
      int a[] = new int[2]; // Size 2
      try {
         System.out.println("Access element three :" + a[3]); // Accessing 3rd element
      } catch (ArrayIndexOutOfBoundsException e) {
         System.out.println("Exception thrown  :" + e);
      }finally { // Always executed no matter what!
         a[0] = 6;
         System.out.println("First element value: " + a[0]);
         System.out.println("The finally statement is executed");
      }
   }
}
Output :
Exception thrown  :java.lang.ArrayIndexOutOfBoundsException: 3
First element value: 6
The finally statement is executed




Example of List, Set, Map
import java.util.*; // All the classes and interfaces are part of the util package
public class CollectionsDemo {

   public static void main(String[] args) {
      // ArrayList
      List a1 = new ArrayList();
      a1.add("Zara");
      a1.add("Mahnaz");
      a1.add("Ayan");
      System.out.println(" ArrayList Elements");
      System.out.print("\t" + a1);

      // LinkedList
      List l1 = new LinkedList();
      l1.add("Zara");
      l1.add("Mahnaz");
      l1.add("Ayan");
      System.out.println();
      System.out.println(" LinkedList Elements");
      System.out.print("\t" + l1);

      // HashSet
      Set s1 = new HashSet();
      s1.add("Zara");
      s1.add("Mahnaz");
      s1.add("Ayan");
      System.out.println();
      System.out.println(" Set Elements");
      System.out.print("\t" + s1);

      // HashMap
      Map m1 = new HashMap();
      m1.put("Zara", "8");
      m1.put("Mahnaz", "31");
      m1.put("Ayan", "12");
      m1.put("Daisy", "14");
      System.out.println();
      System.out.println(" Map Elements");
      System.out.print("\t" + m1);
   }
}
*/

// public class Bank {
//    double interestRate = 0.1;
//    public void getRatesOfInterest(){
//       System.out.println("interst rate: "+ interestRate);
//    }
// }

// class SBI extends Bank{}

public class Student {
   int studentId;
   String studentName;
   String collegeName;
   String address;

   public String getName() {
      System.out.println(studentName);
      return studentName;
   }

   public String getCollege() {
      return collegeName;
   }

   public String getAddress() {
      return address;
   }

   public int getId() {
      return studentId;
   }

   public String setName(String name) {
      this.studentName = name;
      return this.studentName;
   }

   // or instead of returning you can do it like this
   /*
    * public void setName(String name){
    * this.studentName = name;
    * }
    */
   public String setCollege(String college) {
      this.collegeName = college;
      return this.collegeName;
   }
   public int setId(int id) {
      this.studentId = id;
      return this.studentId;
   }
   public String setAddress(String addy) {
      this.address = addy;
      return this.address;
   }
   public static void main(String args[]){
      Student s=new Student();
      s.setName("lalo");
      s.getName();
   }
}
