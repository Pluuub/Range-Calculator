/* This program converts units of centimeters and Mils (on mil-dot sights) into a range measurements in meters, RangeCalc.java has the imperial units and RangeCalcHalfnHalf.java uses inches for the reference and uses meters for the range */

import java.util.Scanner;  
public class RangeCalcMetric
{
    public static void main(String[] args){
    float sizeInCentimeters;
    float sizeInMeters;
    float sizeInMils;
    float altitudeDifference;
    
    Scanner myObj = new Scanner(System.in);  
    System.out.println("What is the size of the reference in centimeters?");
    sizeInCentimeters = myObj.nextFloat();

    sizeInMeters = sizeInCentimeters / 100;    //convert Centimeters to Meters for the calculation

    System.out.println("What is the size of the reference in mils");
    sizeInMils = myObj.nextFloat();

    System.out.println("What is the difference in altitude between you and your target");
    altitudeDifference = myObj.nextFloat();  


    System.out.println(sizeInMeters*1000/sizeInMils+altitudeDifference + "Meters"); //Computes and prints the range including altitude difference
    }
}
