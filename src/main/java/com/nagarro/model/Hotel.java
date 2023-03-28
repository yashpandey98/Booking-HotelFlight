package com.nagarro.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "hotel")
public class Hotel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String hotelName;
	private String city;
	private int totNoOfRooms;
	private int totNoOfRoomsAvlb;

	public Hotel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Hotel(int id, String hotelName, String city, int totNoOfRooms, int totNoOfRoomsAvlb) {
		super();
		this.id = id;
		this.hotelName = hotelName;
		this.city = city;
		this.totNoOfRooms = totNoOfRooms;
		this.totNoOfRoomsAvlb = totNoOfRoomsAvlb;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getHotelName() {
		return hotelName;
	}

	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getTotNoOfRooms() {
		return totNoOfRooms;
	}

	public void setTotNoOfRooms(int totNoOfRooms) {
		this.totNoOfRooms = totNoOfRooms;
	}

	public int getTotNoOfRoomsAvlb() {
		return totNoOfRoomsAvlb;
	}

	public void setTotNoOfRoomsAvlb(int totNoOfRoomsAvlb) {
		this.totNoOfRoomsAvlb = totNoOfRoomsAvlb;
	}

}
