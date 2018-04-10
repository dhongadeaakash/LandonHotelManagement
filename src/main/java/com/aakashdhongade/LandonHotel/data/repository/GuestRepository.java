/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aakashdhongade.LandonHotel.data.repository;

import com.aakashdhongade.LandonHotel.data.models.Guest;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Aakash
 */
@Repository
public interface GuestRepository extends PagingAndSortingRepository<Guest,Long> {
    
}
