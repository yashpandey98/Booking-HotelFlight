package com.nagarro.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nagarro.model.Room;

public interface RoomDao extends JpaRepository<Room, Integer>{

}
