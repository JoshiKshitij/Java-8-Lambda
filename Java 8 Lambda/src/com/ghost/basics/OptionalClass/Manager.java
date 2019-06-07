package com.ghost.basics.OptionalClass;

public class Manager {

	private String name;
	private int id;

	@Override
	public String toString() {
		return "Manager [name=" + name + ", id=" + id + "]";
	}

	public Manager() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Manager(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
