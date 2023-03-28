package com.nagarro.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "room")
public class Room {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private int hotelId;
	private String roomType;
	private boolean roomAvlb;
	private int price;

	public Room() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Room(int id, int hotelId, String roomType, boolean roomAvlb, int price) {
		super();
		this.id = id;
		this.hotelId = hotelId;
		this.roomType = roomType;
		this.roomAvlb = roomAvlb;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getHotelId() {
		return hotelId;
	}

	public void setHotelId(int hotelId) {
		this.hotelId = hotelId;
	}

	public String getRoomType() {
		return roomType;
	}

	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}

	public boolean isRoomAvlb() {
		return roomAvlb;
	}

	public void setRoomAvlb(boolean roomAvlb) {
		this.roomAvlb = roomAvlb;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

}
