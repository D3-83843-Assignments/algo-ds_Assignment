package Assignment1;

class Employee{
	int empid;
	String name;
	double salary;
	
	public Employee( int empid,String name,double salary)
	{
		this.empid=empid;
		this.name=name;
		this.salary=salary;
		
	}
}
public class Question4 {

	public static int sortEmp(Employee[]arr,int n,int empid)
	{
		for(int i=0;i<n;i++) {
			if(arr[i].empid==empid)
			{
				return i;
			}
		}
		
		return -1  ;	
	}
	
	public static int sortEmp(Employee[]arr,int n,String name)
	{
		for(int i=0;i<n;i++) {
			if(arr[i].name.equals(name))
			{
				
				return i;
			}
		}
		return -1;
	}
	
	public static int sortEmp(Employee[]arr,int n,double salary)
	{
		for(int i=0;i<n;i++) {
			if(arr[i].salary==salary)
			{
				return i;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp1=new Employee(1,"e1",2000.2);
		Employee emp2=new Employee(3,"e2",2001.2);
		Employee emp3=new Employee(5,"e3",4000.2);
		Employee emp4=new Employee(7,"e4",5000.2);
		Employee emp5=new Employee(2,"e5",6000.2);
		Employee emp6=new Employee(9,"e6",7000.2);
		Employee emp7=new Employee(4,"e7",9000.2);
		
		Employee arr[]= {emp1,emp2,emp3,emp4,emp5,emp6,emp7};
		int empidIndex= sortEmp(arr, 7, 7);
		System.out.println("Employee found at :" +empidIndex+"by empid");
		int empName= sortEmp(arr, 7, "e4");
		System.out.println("Employee found at :" +empName+"by empname");
		int empsSalary= sortEmp(arr, 7, 7000.2);
		System.out.println("Employee found at index :" +empsSalary+"by empsalary");
		
		
	}

}
