import java.util.LinkedList;
class Employee{
    private String empname;
    private String empdesignation;
    private String empemail;

Employee(String empname,String empdesignation,String empemail){
    super();
    this.empname=empname;
    this.empdesignation=empdesignation;
    this.empemail=empemail;
}
public String getempname(){
    return empname;
}
public String getempdesignation(){
    return empdesignation;
}
public String getempemail(){
    return empemail;
}
public String toString(){
    return "Employee empname= "+empname +"empdesigntaion= "+empdesignation +"empemail= "+empemail;
}
}
public class ExampleOfanLinkedList {
    public static void main(String[] args) {
        
    Employee e1=new Employee("manasa", "student", "chall@271005");
    Employee e2=new Employee("kavitha", "wastefellow", "kavitha@250905");
    Employee e3=new Employee("likitha", "candyhearts", "candy@040305");
    LinkedList<Employee> ll=new LinkedList<>();
    ll.add(e1);
    ll.add(e2);
    ll.add(e3);
    for(Object i:ll){
        System.out.println(i);
    }
}

    
}