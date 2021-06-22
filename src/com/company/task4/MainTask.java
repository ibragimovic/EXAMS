package com.company.task4;

public class MainTask {
    public static void main(String[] args) {

        Phone phone = new Phone();
        Som som20 = new Som();

        LeftPocket leftPocket = new LeftPocket(phone);
        RightPocket rightPocket = new RightPocket(som20);

    }
}
