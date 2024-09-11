
public class EmployeeDemo{
    public static void main (String [] args){
        Employee E1=new Employee();
        FullTimeEmployee ft1=new FullTimeEmployee();
        E1.setEmployee("E102","katiyar");
        ft1.setFullTimeEmployee("E101","akash",15000);

        E1.printEmployee();        
        ft1.printEmployee();

    }}
    class Employee{ 
    protected String empId;
    protected String empName;
    public void setEmployee(String empId,String empName){
        this.empId=empId;
        this.empName=empName;

    }
    public void printEmployee()
{
System.out.println("Employee Id:"+empId);
System.out.println("Employee Name :" +this.empName);
}        
}   


class FullTimeEmployee extends Employee{
    //  private String empId;
    //  private String empName;

    private  double salary;
    public void setFullTimeEmployee(String empId,String empName,double salary){
        // setEmployee(empId,empName);
        this.empId=empId; 
        this.empName=empName;        //empId has private access in Employee
        this.salary=salary;
    }
    public void printFullTimeEmployee(){
        printEmployee();
        System.out.println("Employee salary" + this.salary);
    }

}