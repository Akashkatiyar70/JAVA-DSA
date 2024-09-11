
    class Student{
        int rollno;
        static int passingMarks;   
        float Marks;

        public static void setpassingMarks(int pm){
            passingMarks=pm;
        // rollno=101; //non-static variable rollno cannot be referenced from a static context
        }
        public void set(int rollno,float marks){
            this.rollno=rollno;
            this.Marks=marks;
        }
        public void display(){
            System.out.println("RollNo:"+rollno);
            System.out.println("marks:"+Marks);
            if(Marks<passingMarks)
            System.out.println("Grade:fail");
            else
            System.out.println("Grade:pass");
        }
    }
     public class staticDemo{
    public static void main (String[] args){
        Student.setpassingMarks(40);
        Student s1=new Student();
        Student s2=new Student();
    
        s1.set(101,49);
        s2.set(102,22);
        s1.display();
        s2.display();
    }
}

