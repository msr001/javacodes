// 7.	Write a java program with class variable that is available for all instances of a class. 
// Use static variable declaration. Observe the changes that occur in the object’s member variable values. 





class Students{
    static String college = "Jain collage";
    String name;
    int rollno ;

    Students(String name, int rollno){
        this.name = name;
        this.rollno = rollno;
    }
    public void display(){
        System.out.printf( "College name is %s \n name of student is %s\n rollno is %d\n",college,name,rollno);
    }
}


public class _7_Static{
     //        ^ remove this _7_ before runninng
    public static void main(String[] args) {
        System.out.println( "Student information ->>" );
        Students s1 = new Students("Sing",111);
        Students s2 = new Students("Sami",120);
        s1.display();
        s2.display();
        // now i am goona change the college name because me and my gf decided to change collage together
        // you got problems let me code ;);
        System.out.println( "Static object change by one of object " );
        s1.college= "MSRCASC";
        s1.display();
        s2.display();
        
    }
}




