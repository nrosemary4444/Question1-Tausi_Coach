/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package vu.tausitraveltime;

/**
 *
 * @author HP
 */
import java.text.DecimalFormat;
public class TausiTravelTime {
public static void main(String[] args) {
        int totalDistance = 10000;
        int speed = 250; // in km/hr
        int stopTimeMinutes = 5;
        int passengerStopInterval = 150;
        int refuelStopInterval = 200;

        int stopsForPassengers = totalDistance / passengerStopInterval;
        int stopsForRefueling = totalDistance / refuelStopInterval;

        int lcm = lcm(passengerStopInterval, refuelStopInterval);
        int overlappingStops = totalDistance / lcm;

        int totalStops = (stopsForPassengers + stopsForRefueling) - overlappingStops;

        double travelTime = (double) totalDistance / speed;
        double totalStopTime = totalStops * (stopTimeMinutes / 60.0); // convert minutes to hours
        double totalTime = travelTime + totalStopTime;

        // Format the output to 2 decimal places
        DecimalFormat df = new DecimalFormat("#.00");
        System.out.println("The total time taken to travel from Kampala to Kabale is " + df.format(totalTime) + " hours.");
    }

    public static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }

    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
     
}