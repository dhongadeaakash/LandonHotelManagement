/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aakashdhongade.LandonHotel.data.models;

import com.aakashdhongade.LandonHotel.controllers.services.DateService;
import java.util.Date;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author Aakash
 */
public class NewDate {
    
    Date newDate;

    @Autowired
    DateService dateService;
            
    @Override
    public String toString() {
        return "NewDate{" + "newDate=" + newDate + '}';
    }

    public Date getNewDate() {
        return newDate;
    }

    public void setNewDate(Date newDate) {
       
        this.newDate = newDate;
    }
}
