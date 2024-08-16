/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package vu.tausireturn;

/**
 *
 * @author HP
 */
import java.text.DecimalFormat;
public class TausiReturn {

    public static void main(String[] args) {
        int totalDistance = 10000;
        int speed = 250; // in km/hr
        int stopTimeMinutes = 5;
        int refuelStopInterval = 200;

        int stopsForRefueling = totalDistance / refuelStopInterval;

        double travelTime = (double) totalDistance / speed;
        double totalStopTime = stopsForRefueling * (stopTimeMinutes / 60.0); // convert minutes to hours
        double totalTime = travelTime + totalStopTime;

        DecimalFormat df = new DecimalFormat("#.00");
        System.out.println("The total time taken on the return journey is " + df.format(totalTime) + " hours.");
    }
}
