package com.javaCourse;


//Напишите класс Кондиционер,
// он может быть включен или выключен,
// у него должна быть указана текущая рабочая температура
// (даже если выключен),
// у кондинционера должна быть указана фирма и модель.
//
// Его можно включать и выключать,
// при попытке включить включенный или выключить
// выключенный кондиционер необходимо
// вывести в консоль сообщение о невозможности так сделать.
// Должна быть возможность повысить или понизить температуру на 1 градус.
// Должна быть возможность сразу выставить конкретную температуру.
// Должен быть метод, печатающий информацию о состоянии кондиционера (вкл/выкл, рабочая температура).
// Каждое действие желательно сопровождать сообщением в консоль.

public class AC {
    public int temperature;
    public String brand;
    public Long model;
    public Boolean mode;

    // Getting constructor
    public AC(int temperature, String brand,
              long model) {
        this.temperature = temperature;
        this.brand = brand;
        this.model = model;
        this.mode = false;

    }

    public static void main(String[] args) {
        AC ac1 = new AC(23, "LG",
                100000);

        ac1.setTemperature(12);
        ac1.changeTemperature(65);
        ac1.turnAcOn();
        ac1.turnACOff();
        ac1.printInfoAC();

    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        if (temperature == 23 && temperature <= 100) {
            this.temperature = temperature;

        }

    }

    public boolean getMode() {
        return mode;
    }

    // Checking if AC is ON, if not we turn it ON
    public void turnAcOn() {
        if (mode) {
            System.out.println("AC is OFF, you have to turn it ON");
            return;
        }
        mode = true;
        System.out.println("You turned AC ON, not need to change the mode");
    }

    // Checking if AC is OFF
    public void turnACOff() {
        if (!mode) {
            System.out.println("AC is OFF, not need to change the mode");
            return;
        }
    }

    // Change the temperature
    public void changeTemperature(int temp) {
        this.temperature = temp + 12;
        System.out.println("We have changed temperature to " + temperature);


    }

    public void setUpTemperature(int temperature) {
        this.temperature = temperature;
        System.out.println("We set AC to " + temperature);
    }

    public void printInfoAC() {
        System.out.print("AC: " + brand + "" + " - "
                + model);
        if (mode) {
            System.out.println("AC if OFF");
        } else {
            System.out.println("AC is ON");

        }
    }


}
