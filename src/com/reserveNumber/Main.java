package com.reserveNumber;

import com.reserveNumber.classes.Bill;
import com.reserveNumber.classes.Client;
import com.reserveNumber.classes.Hotel;
import com.reserveNumber.classes.Room;
import com.reserveNumber.services.PaymentService;

public class Main {
    public static void main(String[] args) {
        Bill loriBill = new Bill(30000);
        Client loriClient = new Client("Lori", "Cat", "lori@gmail.com", "+12345", loriBill);

        Bill baxterBill = new Bill(40000);
        Client baxterClient = new Client("Baxter", "Dog", "baxter@gmail.com", "+54321", baxterBill);

        Room startRoom = new Room(1, 1000, true);
        Room standartRoom = new Room(2, 2000, true);
        Room luxRoom = new Room(2, 5000, true);
        Room extraLuxRoom = new Room(3, 10000, true);

        Room[] hiltonRooms = { startRoom, standartRoom, luxRoom, extraLuxRoom };

        Hotel hiltonHotel = new Hotel("Hilton", hiltonRooms);

        PaymentService paymentService = new PaymentService();

        System.out.println(hiltonHotel.getRooms()[0].getCost());
    }
}
