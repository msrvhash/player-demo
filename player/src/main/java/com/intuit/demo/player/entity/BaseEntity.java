package com.intuit.demo.player.entity;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Field;

import lombok.Data;

@Data
public class BaseEntity {
	
	@Id
	@Field("_id")
	public ObjectId id;
	
	 // ObjectId needs to be converted to string
	  public String getId() { return id.toHexString(); }
	  public void setId(String id) { this.id = new ObjectId(id); }

}
