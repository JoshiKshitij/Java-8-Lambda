package com.ghost.basics.OptionalClass;

public class Department {

	private String name;
	private Manager manager;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Manager getManager() {
		return manager;
	}

	public void setManager(Manager manager) {
		this.manager = manager;
	}

	@Override
	public String toString() {
		return "Department [name=" + name + ", manager=" + manager + "]";
	}

	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Department(String name, Manager manager) {
		super();
		this.name = name;
		this.manager = manager;
	}

}
