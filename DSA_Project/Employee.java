package DSA_Project;
public class Employee {

    static String name;
    static int empId;
    static double salary;
    static String jobPosition ;
    static Date hireDate;
    static String contactNumber;
    static Address address;
   
    Employee(String name,int empId,double salary,String jobPosition,String contactNumber,Date hireDate,Address address){
        this.name=name;
        this.empId=empId;
        this.salary=salary;
        this.jobPosition=jobPosition;
        this.contactNumber=contactNumber;
        this.hireDate=hireDate;
        this.address=address;
    
    }
    public void EmployeeDetails() {
        System.out.println("Name: "+name+"\nempId:"+empId+"\nSalary: "+salary+"\nJob Position: "+jobPosition+"\nHire Date: "+hireDate.Day+"/"+hireDate.Month+"/"+hireDate.Year+"\nContact Number: "+contactNumber+"\nAddress: "+address.street+"\n"+address.city+"\n"+address.state);
    
    }
    Employee(){

    }


 
}

class Date{
    public static int Day,Month,Year;
    Date(int Day,int Month,int Year){
        this.Day=Day;
        this.Month=Month;
        this.Year=Year;
    }

}
class Address{
    String street,city,state;
    Address(String street,String city,String state){
        this.street=street;
        this.city=city;
        this.state=state;
    }

}