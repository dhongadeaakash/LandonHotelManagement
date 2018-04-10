/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aakashdhongade.LandonHotel.controllers.services;

import com.aakashdhongade.LandonHotel.data.models.Guest;
import com.aakashdhongade.LandonHotel.data.repository.GuestRepository;
import com.aakashdhongade.LandonHotel.data.repository.ReservationRepository;
import com.aakashdhongade.LandonHotel.data.repository.RoomRepository;
import com.aakashdhongade.LandonHotel.viewClasses.RoomReservation;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Aakash
 */
@Service
public class ReservationService {

    private GuestRepository guestRepository;
    private RoomRepository roomRepository;
    private ReservationRepository reservationRepository;
    private DateService dateService;
    
    
    @Autowired
    public ReservationService(GuestRepository guestRepository, RoomRepository roomRepository, ReservationRepository reservationRepository, DateService dateService) {
        this.guestRepository = guestRepository;
        this.roomRepository = roomRepository;
        this.reservationRepository = reservationRepository;
        this.dateService = dateService;
    }
    
    public List<RoomReservation> getReservationsForDate(String dateString) {
        
       Date date = dateService.createDateFromString(dateString);
       Map<Long,RoomReservation> roomReservationsMap = new HashMap();
       
       roomRepository.findAll().forEach( room ->{
       RoomReservation roomReservation = new RoomReservation();
       roomReservation.setRoomId(room.getROOM_ID());
       roomReservation.setRoomName(room.getNAME());
       roomReservation.setRoomNumber(""+room.getROOM_NUMBER());
       roomReservationsMap.put(room.getROOM_ID(), roomReservation);
       });
       
       reservationRepository.findByDate(new java.sql.Date(date.getTime())).forEach(reservation->{
       
       Guest guest = guestRepository.findById(reservation.getGUEST_ID()).get();
       if(guest!=null)
       {
           RoomReservation roomReservation = roomReservationsMap.get(reservation.getROOM_ID());
           roomReservation.setDate(date);
           roomReservation.setFirstName(guest.getFIRST_NAME());
           roomReservation.setLastName(guest.getLAST_NAME());
           roomReservation.setGuestId(guest.getGUEST_ID());
       }
       });
       List<RoomReservation> roomReservations = new ArrayList<>();
       for(Long roomID:roomReservationsMap.keySet())
       {
           roomReservations.add(roomReservationsMap.get(roomID));
       }
           return roomReservations;
    }
    
    
}
    