/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;

/**
 *
 * @author Sumesh
 */
public class Airliner {
    private String airlinerName;
    private int airlinerNoOfAirplanes;
    
    public ArrayList<Flight> flightList;
    
    public Airliner(String airlinerName){
        
       flightList = new ArrayList<Flight>();
       this.airlinerName = airlinerName;                     
    }   

    public ArrayList<Flight> getFlightList() {
        return flightList;
    }
    
    public void setFlightList(ArrayList<Flight> flightList) {
        this.flightList = flightList;
    }
    
    public String getAirlinerName() {
        return airlinerName;
    }

    public void setAirlinerName(String airlinerName) {
        this.airlinerName = airlinerName;
    }      

    public int getAirlinerNoOfAirplanes() {
        return airlinerNoOfAirplanes;
    }

    public void setAirlinerNoOfAirplanes(int airlinerNoOfAirplanes) {
        this.airlinerNoOfAirplanes = airlinerNoOfAirplanes;
    }   
    
    public Flight addFlight(String airlinerName, String flightNumber, String source, String destination, String departureTime, String arrivalTime, double flightPrice, int totalSeats) {
       Flight flight = new Flight(airlinerName, flightNumber, source, destination, departureTime, arrivalTime, flightPrice, totalSeats);
       flightList.add(flight);
       return flight;
    }
    
    public void deleteFlight(Flight flight) {
        flightList.remove(flight);
    }   
    
     
    @Override
    public String toString() {
        return airlinerName;
    }
    
}
