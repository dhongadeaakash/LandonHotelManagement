/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aakashdhongade.LandonHotel.controllers.services;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.springframework.stereotype.Service;

/**
 *
 * @author Aakash
 */
@Service
public class DateService {
    
    private static final DateFormat DATE_FORMAT = new SimpleDateFormat("yyyy-MM-dd");
    
   public Date createDateFromString(String dateString)
   {
       Date date=null;
        if(dateString==null || dateString=="")
        {
         return new Date();
        }
        else{
       
            try
            {
                date=DATE_FORMAT.parse(dateString);
            }
            catch(ParseException pe)
            {
                System.out.println(new Date().toString()+pe);
                return new Date();  
            }
        }
     
       return date;
   }
}
