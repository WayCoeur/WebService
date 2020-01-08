package javaClient;

import javaClient.stub.Hotel;
import javaClient.stub.HotelService;


public class client {
	
	
	public static void main(String[] args) {
		Hotel hotel = new HotelService().getHotelPort();
		System.out.println(hotel.getChambre(1));

	}
}
