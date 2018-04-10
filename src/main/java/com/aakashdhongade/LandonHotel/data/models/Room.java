/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aakashdhongade.LandonHotel.data.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Aakash
 */
@Entity
@Table(name = "ROOM")
public class Room {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ROOM_ID")
    private long ROOM_ID;
    @Column(name = "NAME")
    private String NAME;
    @Column(name = "ROOM_NUMBER")
    private Integer ROOM_NUMBER;
    @Column(name = "BED_INFO")
    private String BED_INFO;

    public long getROOM_ID() {
        return ROOM_ID;
    }

    public void setROOM_ID(long ROOM_ID) {
        this.ROOM_ID = ROOM_ID;
    }

    public String getNAME() {
        return NAME;
    }

    public void setNAME(String NAME) {
        this.NAME = NAME;
    }

    public Integer getROOM_NUMBER() {
        return ROOM_NUMBER;
    }

    public void setROOM_NUMBER(Integer ROOM_NUMBER) {
        this.ROOM_NUMBER = ROOM_NUMBER;
    }

    public String getBED_INFO() {
        return BED_INFO;
    }

    public void setBED_INFO(String BED_INFO) {
        this.BED_INFO = BED_INFO;
    }
    
}
