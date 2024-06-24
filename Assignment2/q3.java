import java.util.Arrays;

class Employee{
	int eid;
	String name;
	double salary;
public Employee(int eid,String name,double salary)
{
	this.eid=eid;
	this.name=name;
	this.salary=salary;
	
}
@Override
public String toString() {
	// TODO Auto-generated method stub
	return "salary:"+salary;
}


}


public class q3 {

	public static void insertion(Employee arr[])
	{
		
			int comp=0;
			for(int i = 0; i < arr.length-1; i++) {
				for(int j = i+1; j > 0; j--) {
					comp++;
					if(arr[j].salary < arr[j-1].salary) {
						double temp = arr[j].salary;
						arr[j].salary = arr[j-1].salary;
						arr[j-1].salary = temp;
					}else {
						break;
					}
				}
			}
				System.out.println(Arrays.toString(arr));
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1=new Employee(1,"e1", 2000.0);
		Employee e2=new Employee(2,"e2", 3000.0);
		Employee e3=new Employee(3,"e3", 1000.0);
		Employee e4=new Employee(4,"e31", 2200.0);
		Employee e5=new Employee(6,"e3", 2000.0);
		Employee e6=new Employee(9,"e6", 2001.0);
		Employee e7=new Employee(10,"e12", 2030.0);
		Employee [] arr= {e1,e2,e3,e4,e5,e6,e7};
		insertion(arr);
		

	}
	


}
