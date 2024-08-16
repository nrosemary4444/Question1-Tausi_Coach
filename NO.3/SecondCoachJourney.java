/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package vu.secondcoachjourney;

/**
 *
 * @author HP
 */
import java.text.DecimalFormat;
public class SecondCoachJourney {

    public static void main(String[] args) {
        int totalDistance = 10000; // in km
        double speedMps = 225.5; // in meters per second
        double speedKmph = speedMps * 3.6; // convert m/s to km/h

        double travelTime = totalDistance / speedKmph;

        // Assuming the coach starts at 09:00 hrs
        double startTime = 9.00;

        double arrivalTime = startTime + travelTime;

        DecimalFormat df = new DecimalFormat("#.00");
        System.out.println("The approximate arrival time is " + df.format(arrivalTime) + " hrs.");
    }
}
