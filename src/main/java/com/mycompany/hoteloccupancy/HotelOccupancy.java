/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.hoteloccupancy;
import java.util.Scanner;

/**
 *
 * @author tatianaeng
 */
public class HotelOccupancy
{

    public static void main(String[] args)
    {
        // variables
        double numberOfFloors;
        double numberOfRooms;
        int floor;
        double numberOfRoomsOccupied;
        double totalNumberOfRooms = 0;
        double totalNumberRoomsOccupied = 0;
        double totalNumberOfVacantRooms;
        double occupancyRate;
        
        // create scanner object
        Scanner keyboard = new Scanner(System.in);
        
        // ask user how many floors there are in the hotel
        System.out.println("How many floors are there in the hotel?");
        
        // read user input
        numberOfFloors = keyboard.nextDouble();
        
        // input validation: do not accept a value less than 1
        while (numberOfFloors < 1)
        {
            // display an error message to the user and ask for a new number
            System.out.println("There must be at least 1 floor in this hotel. Please enter a different number.");
            
            // read user input
            numberOfFloors = keyboard.nextDouble();
        }
        
        /* create a loop that iterates once for each floor
        during each iteration, ask the user for the number of rooms on each floor and the number that are occupied
        input validation: do not accept a value indicating fewer than 10 rooms on a floor */
        for (floor = 1; floor <= numberOfFloors; floor++)
        {
            // ask user for number of rooms on each floor
            System.out.printf("How many rooms are there on floor %d?\n", floor);
            
            // read user input
            numberOfRooms = keyboard.nextDouble();
            
            // input validation: no fewer than 10 rooms on a floor
            while (numberOfRooms < 10)
            {
                // display an error message and ask the user to enter a different number
                System.out.println("There are at least 10 rooms on each floor. Please enter a different number.");
                
                // read user input
                numberOfRooms = keyboard.nextDouble();
            }
            
            // ask user for number of occupied rooms on that floor
            System.out.printf("How many rooms are occupied on floor %d?\n", floor);
            
            // read user input
            numberOfRoomsOccupied = keyboard.nextDouble();
            
            // keep track of the total number of rooms in the hotel
            totalNumberOfRooms = totalNumberOfRooms + numberOfRooms;
            
            // keep track of the total number of rooms that are occupied
            totalNumberRoomsOccupied = totalNumberRoomsOccupied + numberOfRoomsOccupied; // equivalent to saying totalNumberRoomsOccupied += numberOfRoomsOccupied
        }
        
        // calculate the number of rooms in the hotel that are vacant
        totalNumberOfVacantRooms = totalNumberOfRooms - totalNumberRoomsOccupied;
        //System.out.println(totalNumberOfVacantRooms + " vacant rooms");
                
        // calculate the hotel's occupancy rate
        occupancyRate = (totalNumberRoomsOccupied / totalNumberOfRooms) * 100;
        //System.out.println("Occupancy rate is " + occupancyRate + "%");
        
        // after all iterations, display the number of rooms the hotel has, the number that are occupied, the number that are vacant, and the occupancy rate for the hotel.
        System.out.printf("The hotel has %.0f rooms.\n%.0f rooms are occupied, and %.0f rooms are vacant.\nThe occupacy rate is %.0f%%.",
                totalNumberOfRooms, totalNumberRoomsOccupied, totalNumberOfVacantRooms, occupancyRate);
        
    }
}