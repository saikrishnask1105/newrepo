package DemoProject.SpringDependency;

public class Student1 {
	
	private Laptop lap1 ;

	
	
	public Student1(Laptop lap1) {
		super();
		this.lap1 = lap1;
	}



	public void display1()
	{
		lap1.laptop();
	}

}
