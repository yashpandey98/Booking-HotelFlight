package com.nagarro.model;

import java.util.Calendar;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "booking_details")

public class BookingDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@OneToMany(mappedBy = "id", cascade = CascadeType.PERSIST, fetch = FetchType.LAZY)
	@Column(name="user_id")
	//@JoinColumn(name = "user_id", referencedColumnName = "id")
	private List<User> userId;
	@OneToMany(mappedBy = "id", cascade = CascadeType.PERSIST, fetch = FetchType.LAZY)
	@Column(name="room_id")
	//@JoinColumn(name = "room_id", referencedColumnName = "id")
	private List<Room> roomId;
	@OneToMany(mappedBy = "id", cascade = CascadeType.PERSIST, fetch = FetchType.LAZY)
	@Column(name="hotel_id")
	//@JoinColumn(name = "hotel_id", referencedColumnName = "id")
	private List<Hotel> hotelId;
	private Calendar checkIn;
	private Calendar checkOut;
	private int noOfRooms;
	private int noOfGuests;

	public BookingDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BookingDetails(int id, List<User> userId, List<Room> roomId, List<Hotel> hotelId, Calendar checkIn,
			Calendar checkOut, int noOfRooms, int noOfGuests) {
		super();
		this.id = id;
		this.userId = userId;
		this.roomId = roomId;
		this.hotelId = hotelId;
		this.checkIn = checkIn;
		this.checkOut = checkOut;
		this.noOfRooms = noOfRooms;
		this.noOfGuests = noOfGuests;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public List<User> getUserId() {
		return userId;
	}

	public void setUserId(List<User> userId) {
		this.userId = userId;
	}

	public List<Room> getRoomId() {
		return roomId;
	}

	public void setRoomId(List<Room> roomId) {
		this.roomId = roomId;
	}

	public List<Hotel> getHotelId() {
		return hotelId;
	}

	public void setHotelId(List<Hotel> hotelId) {
		this.hotelId = hotelId;
	}

	public Calendar getCheckIn() {
		return checkIn;
	}

	public void setCheckIn(Calendar checkIn) {
		this.checkIn = checkIn;
	}

	public Calendar getCheckOut() {
		return checkOut;
	}

	public void setCheckOut(Calendar checkOut) {
		this.checkOut = checkOut;
	}

	public int getNoOfRooms() {
		return noOfRooms;
	}

	public void setNoOfRooms(int noOfRooms) {
		this.noOfRooms = noOfRooms;
	}

	public int getNoOfGuests() {
		return noOfGuests;
	}

	public void setNoOfGuests(int noOfGuests) {
		this.noOfGuests = noOfGuests;
	}

}
