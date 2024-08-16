/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package vu.tausicoachstop;

/**
 *
 * @author HP
 */
public class TausiCoachStop {
public static void main(String[] args) {
        int totalDistance = 10000;
        int passengerStopInterval = 150;
        int refuelStopInterval = 200;

        int stopsForPassengers = totalDistance / passengerStopInterval;
        int stopsForRefueling = totalDistance / refuelStopInterval;

        // We need to subtract the overlapping stops
        int lcm = lcm(passengerStopInterval, refuelStopInterval);
        int overlappingStops = totalDistance / lcm;

        int totalStops = (stopsForPassengers + stopsForRefueling) - overlappingStops;

        System.out.println("The train should stop " + totalStops + " times.");
    }

    // Method to calculate LCM
    public static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }

    // Method to calculate GCD using Euclidean algorithm
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
    
}
