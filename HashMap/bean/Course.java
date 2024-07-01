package com.sistemi.informativi.bean;

import java.util.Objects;

public class Course {
	
	private String code;
	
	private String title;
	
	private String Location;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getLocation() {
		return Location;
	}

	public void setLocation(String location) {
		Location = location;
	}

	public Course(String code, String title, String location) {
		
		this.code = code;
		this.title = title;
		Location = location;
	}

	public Course() {
		
	}

	@Override
	public String toString() {
		return "course [code=" + code + ", title=" + title + ", Location=" + Location + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(Location, code, title);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Course other = (Course) obj;
		return Objects.equals(Location, other.Location) && Objects.equals(code, other.code)
				&& Objects.equals(title, other.title);
	}
	
	
}
