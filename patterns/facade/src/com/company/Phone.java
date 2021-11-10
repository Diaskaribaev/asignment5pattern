package com.company;

public class Phone {

    private PhoneColor pcolor;
    private PhoneCapacity pcap;
    private PhoneOS pos;

    Phone() {
        pcolor = new PhoneColor();
        pcap = new PhoneCapacity();
        pos = new PhoneOS();
    }

    void PhoneCharacter(String color, String capacity,String os) {
        System.out.println("Characteristic of the Phone");
        pcolor.setColor(color);
        pcap.setCapacity(capacity);
        pos.setOS(os);
        System.out.println();
    }

}
