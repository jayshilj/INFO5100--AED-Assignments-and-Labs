/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.Date;

/**
 *
 * @author welcome
 */
public class Airliner {
    
    private String airlinerId;
    private String airlinerName;
   private String email;
    private String contactNum;
    private String numFlights;
    private String date;

    public String getAirlinerId() {
        return airlinerId;
    }

    public void setAirlinerId(String airlinerId) {
        this.airlinerId = airlinerId;
    }

    public String getAirlinerName() {
        return airlinerName;
    }

    public void setAirlinerName(String airlinerName) {
        this.airlinerName = airlinerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContactNum() {
        return contactNum;
    }

    public void setContactNum(String contactNum) {
        this.contactNum = contactNum;
    }

    public String getNumFlights() {
        return numFlights;
    }

    public void setNumFlights(String numFlights) {
        this.numFlights = numFlights;
    }

   

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

   
        //To change body of generated methods, choose Tools | Templates.

    @Override
    public String toString() {
        return this.date;
    }

    
    
}
