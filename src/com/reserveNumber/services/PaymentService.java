package com.reserveNumber.services;

import com.reserveNumber.classes.Client;
import com.reserveNumber.classes.Room;

public class PaymentService {
    public void pay(Client client, Room room) {
        int currentAmount = client.getBill().getAmount();
        int costOfRoom = room.getCost();
        System.out.println("Платеж за номер отеля, счет клиента: " + currentAmount);
        if (currentAmount < room.getCost()) {
            System.out.println("Платеж невозможен, у клиента нехватает денег. Цена: " + costOfRoom);

        } else {
            client.getBill().setAmount(currentAmount - costOfRoom);
            System.out.println("Платеж успешен, счет клиента: " + currentAmount);
        }

    }
}
