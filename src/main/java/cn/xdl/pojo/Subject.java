package cn.xdl.pojo;

import java.io.Serializable;

public class Subject implements Serializable{
	private int id;
	private String name;
	private int directionId;
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
	public int getDirectionId() {
		return directionId;
	}
	public void setDirectionId(int directionId) {
		this.directionId = directionId;
	}
	
}
