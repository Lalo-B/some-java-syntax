//
/*
A C# program consists of the following parts :

Namespace declaration
A class
Class methods
Class attributes
A Main method
Statements and Expressions
Comments

ex.
using System;

namespace HelloWorldApplication {
   class HelloWorld {
      static void Main(string[] args) {
         Console.WriteLine("Hello World");
         Console.ReadKey();
      }
   }
}

Let us break each line and understand the significance :

The first line of the program using System; - the using keyword is used to include the System namespace in the program. A program generally has multiple using statements.
The next line has the namespace declaration. A namespace is a collection of classes. The HelloWorldApplication namespace contains the class HelloWorld.
The next line has a class declaration, the class HelloWorld contains the data and method definitions that your program uses. Classes generally contain multiple methods. Methods define the behavior of the class. However, the HelloWorld class has only one method Main.
The next line defines the Main method, which is the entry point for all C# programs. The Main method states what the class does when executed.
The next line /*...*/ /* is ignored by the compiler and it is put to add comments in the program.
The Main method specifies its behavior with the statement Console.WriteLine("Hello World");
WriteLine is a method of the Console class defined in the System namespace. This statement causes the message "Hello, World!" to be displayed on the screen.
The last line Console.ReadKey(); is for the VS.NET Users. This makes the program wait for a key press and it prevents the screen from running and closing quickly when the program is launched from Visual Studio .NET.

c# do while loop syntax:
do {
   statement(s);
} while( condition );

Comparing Strings:

using System;

namespace StringApplication {

   class StringProg {

      static void Main(string[] args) {
         string str1 = "This is test";
         string str2 = "This is text";

         if (String.Compare(str1, str2) == 0) { // Using Compare method
            Console.WriteLine(str1 + " and " + str2 +  " are equal.");
         } else {
            Console.WriteLine(str1 + " and " + str2 + " are not equal.");
         }
         Console.ReadKey() ;
      }
   }
}
*/
