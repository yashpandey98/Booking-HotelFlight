package com.nagarro.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.nagarro.model.Hotel;

public interface HotelDao extends JpaRepository<Hotel, Integer>{

	@Query("SELECT h FROM Hotel h WHERE " +
            "h.hotelName LIKE CONCAT('%',:query, '%')" +
            "Or h.city LIKE CONCAT('%', :query, '%')")
	List<Hotel> searchHotels(String query);

}
