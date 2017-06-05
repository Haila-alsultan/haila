import java.util.*;
import java.util.*;
public class test{
static Scanner input=new Scanner (System.in);
public static void main (String[]args){
Student[] studentList=new Student[100];
boolean rebeat=true;
int choose,n;

try{
//read from file
File f=new File("student.txt");
FileInputStream IF=new FileInputStream(f);
DataInputStrem DF=new DataInputStrem(IF);
Student s;
//n=DF.indexOf("-");
String name=DF.readString();
int id=DF.readInt();
double gpa=DF.readDouble();
s=new Student(name,id,gpa);
studentList.addStudent(s);
for(int i=0;<studentList.length;i++)
System.out.println(studentList[i].toString());}
//close file***
catch(NullPointerException e){
System.out.println("");}
//catch for file

try{
while(repeat){
System.out.println("1.add a new student:");
System.out.println("2.Delete a student:");
System.out.println("3.Display the information of all students :");
System.out.println("4.Exit")
choose=input.nextInt();}
switch(choose){

case 1:
System.out.println("Enter the student name:");
name=input.next();
System.out.println("Enter the id:");
id=input.nextInt();
System.out.println("Enter the student gpa:");
gpa=input.nextDouble();
Student s=new Student(name,id,gpa);
addStudent(s);
break;

case 2:
System.out.println("Enter the student's id you want to remove it:");
id=input.nextInt();
removeStudent(id);
break;

case 3:
for(int i=0;i<studentList.length;i++)
System.out.println(studentList[i].toString());
break;

case 4:

//write in file
break;
}
//}
}
catch(InputMismatchException e){
System.out.println("Invalid input");}

}}