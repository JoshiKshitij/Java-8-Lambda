package com.ghost.basics.OptionalClass;

import java.util.ArrayList;
import java.util.List;

public class Company {
	
	List<Department> listOfDepartments = new ArrayList<Department>();

	public List<Department> getListOfDepartments() {
		return listOfDepartments;
	}

	public void addListOfDepartments(Department department) {
		this.listOfDepartments.add(department);
	}
	
	
}
