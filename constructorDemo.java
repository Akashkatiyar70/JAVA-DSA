public class constructorDemo{
    public static void main(String[] args) {
        Student s= new Student(101,45.2f);
        Student s2=new Student(102);
        Student s3=new Student();

        s.displayStudent();
        s2.displayStudent();
        s3.displayStudent();
    }      
}
class Student{
    private int rollno;
    private float marks;

    public Student(){
        rollno=1;
        marks=50f;
    }
    public Student(int r){
        rollno=r;
        marks=50f;
    }
    public Student(int r,float m){
        rollno=r;
        marks=m;}
        public void displayStudent(){
            System.out.println("RollNo:"+rollno+"marks:"+marks);
        }
    
}