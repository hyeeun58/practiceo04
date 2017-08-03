package prob04;

public class Depart extends Employee 
{
	private String department;
	
	// 생성자
	public Depart(String name, int salary, String part)
	{
		super(name, salary);
		this.department = part;
	}
	
	// 메소드
	public void getInformation()
	{
		System.out.println( "이름:" + getName() + "   연봉:" + getSalary()  + "   부서:" + department);
	}
}
