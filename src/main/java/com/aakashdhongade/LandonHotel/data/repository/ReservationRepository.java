/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aakashdhongade.LandonHotel.data.repository;

import com.aakashdhongade.LandonHotel.data.models.Reservation;
import java.util.Date;
import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Aakash
 */
@Repository
public interface ReservationRepository extends CrudRepository<Reservation, Long> {
List<Reservation> findByDate(Date date);    
}
