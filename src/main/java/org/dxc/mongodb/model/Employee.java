package org.dxc.mongodb.model;



import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Document(collection="employee")
public class Employee {
	@Id
	@Field(name="_id")
	private ObjectId objectId;
	@Field(name="employeeid")
	private double employeeId;
	@Field(name="firstname")
	private String firstName;
	@Field(name="lastname")
	private String lastName;
	@Field(name="jobtitle")
	private String jobTitle;
	private double salary;

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", jobTitle=" + jobTitle + ", salary=" + salary + "]";
	}
	
	
	
	
	}