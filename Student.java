 //HashCode Method
 class Student{
        int rollno;
    String name;

    public Student(int rollno,String name){
        this.rollno=rollno;
        this.name=name;                                                                                                                                                                                                                                                                                                                                                                                                                            

    }
    public String toString(){
        return "RollNo:" +rollno+"Name:"+name;
    }
    public int hashCode(){
        return rollno;
    }

    public static void main(String [] args){
        Student s1=new Student (101,"Akash");
        System.out .println(s1);
        // String hash_s1=String.valueOf(s1.hashCode());
        // System.out.println(Integer.toHexString(s1.hashCode()));
        System.out.println(s1.hashCode());

    }
}