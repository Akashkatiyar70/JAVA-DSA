public class InheritanceDemo{
    public static void main (String[] args){
    person p1=new person();
    Employee e1=new Employee();
    FullTimeEmployee ft1=new FullTimeEmployee();
    partTimeEmployee pt1=new partTimeEmployee();
    p1.setperson("akash","kannauj");
    e1.setEmployee("vikas","kanpur","22","finence");
    ft1.setFullTimeEmployee("Aayush", "jaipur","E342","it",60000);
    pt1.setpartTimeEmployee("akash","alighag","E123","HR",1500,20);     
    System.out.println("person........");
    p1.displayperson();
    System.out.println("Employee.........");
    e1.displayemployee();
    System.out.println("FullTimeEmployee........");
    ft1.displayFullTimeemployee();
    System.out.println("partTimeEmployee........");
    pt1.displaypartTimeemployee();
}
}

class person{
    protected String name;
    protected String address;

    public void setperson(String name, String address){
        this.name=name;
        this.address=address;

    }
    public void displayperson(){
        System.out.println("Name:"+name);
        System.out.println("Adderss:"+address);
    }
}
class Employee extends person{
    protected String empId;
    protected String department;

    public void setEmployee(String name, String adderss,String empId, String department){
    setperson(name,adderss);
    this.empId=empId;
    this.department=department;
}
public void displayemployee(){
    displayperson();
    System.out.println("empId:" +empId);
    System.out.println("department:"+department);
}
}
class FullTimeEmployee extends Employee{
    double salary;
    public void setFullTimeEmployee(String name,String adderss, String  empId,String department,double salary){
    setEmployee(name,adderss,empId,department);
    this.salary=salary;
 

}
public  void displayFullTimeemployee(){
    displayemployee();
    System.out.println("salary:"+salary);
}
}
    
class partTimeEmployee extends Employee{
    double perHour;
    int hour;
    public void setpartTimeEmployee(String name,String adderss, String  empId,String department,double perHour,int hour){
    setEmployee(name,adderss,empId,department);
    this.perHour=perHour;
    this.hour=hour;

}
public  void displaypartTimeemployee(){
    displayemployee();
    System.out.println("perHour:"+perHour);
    System.out.println("hous:"+hour);
    System.out.println("ways given:"+(perHour*hour));

}
}