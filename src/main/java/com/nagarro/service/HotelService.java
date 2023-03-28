package com.nagarro.service;

import java.util.List;

import com.nagarro.model.Hotel;

public interface HotelService {

	List<Hotel> searchHotels(String query);

	Hotel createHotel(Hotel hotel);

}
