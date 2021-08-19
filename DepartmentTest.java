public class DepartmentTest
{
	public void m1()
	{
		Department itdept = new Department();
		itdept .empId = 101;
		itdept .empName = "Vaidehi";		
		System.out.println(itdept .empId);
		System.out.println(itdept .empName);
		
	}
	public void m2()
	{
		Department csdept = new Department();
		csdept .empId = 102;
		csdept .empName = "John";		
		System.out.println(csdept .empId);
		System.out.println(csdept .empName);
		
	}
	public static void main(String args[])
	{
		DepartmentTest dt = new DepartmentTest();
		dt.m1();
		dt.m2();
	
	}
}
