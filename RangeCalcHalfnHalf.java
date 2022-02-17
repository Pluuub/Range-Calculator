/* This program converts units of inches and Mils (on mil-dot sights) into a range measurements in meters, RangeCalc.java and RangeCalcMetric has the imperial and metric units respectively*/

import java.util.Scanner;  
public class RangeCalcHalfnHalf
{
    public static void main(String[] args){
    float sizeInInches;
    float sizeInMeters;
    float sizeInMils;
    float altitudeDifference;
    
    Scanner myObj = new Scanner(System.in);  
    System.out.println("What is the size of the reference in inches?");
    sizeInInches = myObj.nextFloat();

    sizeInMeters = sizeInInches / 39.3701f;    //convert inches to Meters for the calculation

    System.out.println("What is the size of the reference in mils");
    sizeInMils = myObj.nextFloat();

    System.out.println("What is the difference in altitude between you and your target in meters");
    altitudeDifference = myObj.nextFloat();  


    System.out.println(sizeInMeters*1000/sizeInMils+altitudeDifference + "Meters"); //Computes and prints the range including altitude difference
    }
}
