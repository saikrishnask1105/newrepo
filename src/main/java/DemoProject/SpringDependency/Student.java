package DemoProject.SpringDependency;

public class Student {

	private int id ;
	private String name ;
	
    private Laptop lap ;
    
	
	
//	public void setId(int id) {
//		this.id = id;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
//	public void setLap(Laptop lap) {
//		this.lap = lap;
//	}

	 



	public void display()
	{
		System.out.println(id + " " + name);
		lap.laptop();
		
	}



    public Student(int id, String name, Laptop lap) {
	super();
	this.id = id;
	this.name = name;
	this.lap = lap;
}


	
}
