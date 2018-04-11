/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aakashdhongade.LandonHotel.controllers;

import com.aakashdhongade.LandonHotel.controllers.services.DateService;
import com.aakashdhongade.LandonHotel.controllers.services.ReservationService;
import com.aakashdhongade.LandonHotel.data.models.NewDate;
import com.aakashdhongade.LandonHotel.viewClasses.RoomReservation;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Aakash
 */
@Controller
public class ReservationController {
    
    @Autowired
    private ReservationService reservationService;
    @Autowired
    private DateService dateService;
    
    @RequestMapping(value = "/reservations",method=RequestMethod.GET)
   public String getReservations(@RequestParam(value="date",required = false) String dateString, Model model )
   {
       List<RoomReservation> roomReservationsList=reservationService.getReservationsForDate(dateString);
      System.out.println("Aakash"+roomReservationsList.toString());
       model.addAttribute("roomReservations", roomReservationsList);;
       return "reservations";
   }
   @RequestMapping(value = "/reservations",method=RequestMethod.POST)
   public String postReservations(@RequestBody NewDate newDate )
   {
       return newDate.toString();
   }
}   
