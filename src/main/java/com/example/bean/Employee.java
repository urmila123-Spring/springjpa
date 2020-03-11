package com.example.bean;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;



@Entity
@Table(name="EMPLOYEE")
public class Employee {
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Id
	private int id;
	@NotNull(message="name is mandatory")
	private String name;
	@NotNull(message="Please enter acess time")
    private String  Swipein;
	@NotNull(message="Please enter swipe out  time")
    private String  Swipeout;
    @NotBlank
	private Date createdate;
    @NotNull(message="Please enter location time")
	private String LocationName;
	
	
	
	
	public int getId() {
		return id;
	}




	public void setId(int id) {
		this.id = id;
	}




	public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}




	public String getSwipein() {
		return Swipein;
	}




	public void setSwipein(String swipein) {
		Swipein = swipein;
	}




	public String getSwipeout() {
		return Swipeout;
	}




	public void setSwipeout(String swipeout) {
		Swipeout = swipeout;
	}




	public Date getCreatedate() {
		return createdate;
	}




	public void setCreatedate(Date createdate) {
		this.createdate = createdate;
	}




	public String getLocationName() {
		return LocationName;
	}




	public void setLocationName(String locationName) {
		LocationName = locationName;
	}




	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", Swipein=" + Swipein + ", Swipeout=" + Swipeout + ", date="
				+ createdate + ", LocationName=" + LocationName + "]";
	}
}
	