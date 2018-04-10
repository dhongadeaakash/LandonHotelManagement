/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aakashdhongade.LandonHotel.data.models;

import java.sql.Date;
import javax.persistence.*;

/**
 *
 * @author Aakash
 */
@Entity
@Table(name = "RESERVATION")
public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "RESERVATION_ID")
    private long RESERVATION_ID;
    @Column(name = "Room_ID")
    private long ROOM_ID;
    @Column(name = "GUEST_ID")
    private long GUEST_ID;
    @Column(name = "RES_DATE")
    private Date date;
    
    
    public long getRESERVATION_ID() {
        return RESERVATION_ID;
    }

    public void setRESERVATION_ID(long RESERVATION_ID) {
        this.RESERVATION_ID = RESERVATION_ID;
    }

    public long getROOM_ID() {
        return ROOM_ID;
    }

    public void setROOM_ID(long ROOM_ID) {
        this.ROOM_ID = ROOM_ID;
    }

    public long getGUEST_ID() {
        return GUEST_ID;
    }

    public void setGUEST_ID(long GUEST_ID) {
        this.GUEST_ID = GUEST_ID;
    }

    public Date getRES_DATE() {
        return date;
    }

    public void setRES_DATE(Date RES_DATE) {
        this.date = RES_DATE;
    }
    
    
}
