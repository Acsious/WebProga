package com.example.lab_5;

import java.text.DateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.Locale;


public class ServerTime {
   public ServerTime(){}

    Locale locale = new Locale("ru","RU");

    private Date date =  new Date();

    public String getDate(){
     return DateFormat.getDateTimeInstance(DateFormat.MEDIUM, DateFormat.MEDIUM, locale).format(date);
    }
}
