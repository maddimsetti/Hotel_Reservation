package com.hotelreservation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

/**
 * @description create Class for Testing the Hotel Reservation Service
 *
 */
public class MyHotelReservationTest {

    /**
     * @description create Method for Testing the Hotel Reservation Service by Adding the Hotel to The ArrayList
     *
     */
    @Test
    public void givenHotelNamesAndTheirRewardAddedToList() {
        MyHotels hotel1 = new MyHotels("LakeWood",110);
        MyHotelReservationService hotelReservationService = new MyHotelReservationService();
        hotelReservationService.add(hotel1);           //Adding First Hotel to list
        List<MyHotels> list = hotelReservationService.getHotels();
        Assertions.assertTrue(list.contains(hotel1));  //Testing the Hotel1 available or not
    }
    /**
     * @description create Main Method for Passing Welcome Message For Hotel Reservation System
     *
     */
    public static void main (String[] args) {
        System.out.println("Welcome To Hotel Reservation System Program");
    }
}
