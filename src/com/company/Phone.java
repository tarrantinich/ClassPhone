package com.company;

public class Phone {
    private String number;
    private String model;
    private String weight;

    protected Phone(String number, String model, String weight) {
        this(number, model);
        this.weight = weight;
    }

    protected Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone() {
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getModel() {
        return model;
    }

    public String getWeight() {
        return weight;
    }
    
    public String getNumber() {
        return number;
    }

    public void receiveCall(String name) {
        System.out.println("Звонит " + name);
    }

    public void receiveCall(String name, String phoneNumber) {
        System.out.println("Звонит " + name + " " + phoneNumber);
    }

    public void sendMessage(String phoneNumber, String... vars) {
        System.out.println("Отправить сообщение для номера " + phoneNumber);
    }

    @Override
    public String toString() {
        return String.format("%s %s %s", " Номер: " + number + ",", "модель: " + model + ",", "масса: " + weight + '\n');
    }
}
