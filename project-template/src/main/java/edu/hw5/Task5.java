package edu.hw5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task5 {
    public static String ValidationRussianLicensePlates(String licensePlate){
        Pattern carPattern = Pattern.compile("^[АВЕКМНОРСТУХ]\\d{3}[АВЕКМНОРСТУХ]{2}\\d{2,3}$");
        Pattern motoPattern = Pattern.compile("^\\d{4}[АВЕКМНОРСТУХ]{2}\\d{2,3}$");
        Matcher matcherCar = carPattern.matcher(licensePlate);
        Matcher matcherMoto = motoPattern.matcher(licensePlate);
        if(matcherCar.find()){
            return "Car";
        }
        else if(matcherMoto.find()){
            return "Moto";
        }
        return "incorrect license plate";
    }
}
