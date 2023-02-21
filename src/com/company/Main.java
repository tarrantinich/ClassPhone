package com.company;

public class Main {

    public static void main(String[] args) {

        Phone phone1 = new Phone("+79152305865", "iphone 14");
        Phone phone2 = new Phone("+79036923495", "huawei honor 70");
        Phone phone3 = new Phone("+74955568623", "panasonic");

        phone1.setWeight("50");
        phone2.setWeight("250");
        phone3.setWeight("500");

        System.out.println(phone1);
        System.out.println(phone2);
        System.out.println(phone3);

        phone1.receiveCall("Миша");
        phone1.receiveCall("Коллектор", "+79253665926");
        phone1.sendMessage("+79163692587");
    }
}
