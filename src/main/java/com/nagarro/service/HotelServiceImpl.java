package com.nagarro.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.nagarro.dao.HotelDao;
import com.nagarro.model.Hotel;

public class HotelServiceImpl implements HotelService{

	@Autowired
	HotelDao hotelDao;
	
	public List<Hotel> searchHotels(String query) {
		List<Hotel> hotels = hotelDao.searchHotels(query);
		return hotels;
	}

	public Hotel createHotel(Hotel hotel) {
		return hotelDao.save(hotel);
	}

}
