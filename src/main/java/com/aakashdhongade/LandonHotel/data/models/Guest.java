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
@Table(name = "GUEST")
public class Guest {
    
   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   @Column(name = "GUEST_ID")
   private long GUEST_ID;
   @Column(name="FIRST_NAME")
   private String FIRST_NAME;
   @Column(name="LAST_NAME")
   private String LAST_NAME;
   @Column(name="EMAIL_ADDRESS")
   private String EMAIL_ADDRESS;
   @Column(name="ADDRESS")
   private String ADDRESS;
   @Column(name="COUNTRY")
   private String COUNTRY;
   @Column(name="STATE")
   private String STATE;
   @Column(name="PHONE_NUMBER")
   private Integer PHONE_NUMBER;

    public long getGUEST_ID() {
        return GUEST_ID;
    }

    public void setGUEST_ID(long GUEST_ID) {
        this.GUEST_ID = GUEST_ID;
    }

    public String getFIRST_NAME() {
        return FIRST_NAME;
    }

    public void setFIRST_NAME(String FIRST_NAME) {
        this.FIRST_NAME = FIRST_NAME;
    }

    public String getLAST_NAME() {
        return LAST_NAME;
    }

    public void setLAST_NAME(String LAST_NAME) {
        this.LAST_NAME = LAST_NAME;
    }

    public String getEMAIL_ADDRESS() {
        return EMAIL_ADDRESS;
    }

    public void setEMAIL_ADDRESS(String EMAIL_ADDRESS) {
        this.EMAIL_ADDRESS = EMAIL_ADDRESS;
    }

    public String getADDRESS() {
        return ADDRESS;
    }

    public void setADDRESS(String ADDRESS) {
        this.ADDRESS = ADDRESS;
    }

    public String getCOUNTRY() {
        return COUNTRY;
    }

    public void setCOUNTRY(String COUNTRY) {
        this.COUNTRY = COUNTRY;
    }

    public String getSTATE() {
        return STATE;
    }

    public void setSTATE(String STATE) {
        this.STATE = STATE;
    }

    public Integer getPHONE_NUMBER() {
        return PHONE_NUMBER;
    }

    public void setPHONE_NUMBER(Integer PHONE_NUMBER) {
        this.PHONE_NUMBER = PHONE_NUMBER;
    }
   
    
}
