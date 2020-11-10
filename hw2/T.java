package hw2;


public class T implements Comparable<T>{
	private int var;
	private String name;
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getVar() {
		return var;
	}

	public void setVar(int var) {
		this.var = var;
	}
	

	public T() {
		super();
	}

	public T(int var,String name) {
		super();
		this.var = var;
		this.name= name;
	}

	@Override
	public String toString() {
		return "T [var=" + var + "]";
	}

	@Override
	public int compareTo(T o) {
		// TODO Auto-generated method stub
		if(this.var>o.var) {
			return -1;
		}
		else if(this.var< o.var) {
			
		}
		return 0;
	}
	
	
}