// WishMessageGenerator.java (target class)
package com.bhuwan.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component("wmg")
public class WishMessageGenerator {
    @Autowired
    private LocalDateTime date;

    public String generateWishMessage(String username){
    //        get current hour of the day
        int hrs =  date.getHour(); // in 24hrs format
        if(hrs < 12)
            return "GoodMorning " + username;
        else if(hrs <16)
            return "GoodAfternoon " + username;
        else if(hrs <20)
            return "GoodEvening " + username;
        else
            return "GoodNight " + username;
    }
}
