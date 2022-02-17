/* This program converts units of inches and Mils (on mil-dot sights) into a range measurements in yards, RangeCalcMetric.java has the metric units and RangeCalcHalfnHalf uses inches for the reference and uses meters for the range */

import java.util.Scanner;  
public class RangeCalc
{
    public static void main(String[] args){
    float sizeInInches;
    float sizeInYards;
    float sizeInMils;
    float altitudeDifference;
    
    Scanner myObj = new Scanner(System.in);  
    System.out.println("What is the size of the reference in inches?");
    sizeInInches = myObj.nextFloat();

    sizeInYards = sizeInInches / 36;    //convert inches to yards for the calculation

    System.out.println("What is the size of the reference in mils");
    sizeInMils = myObj.nextFloat();

    System.out.println("What is the difference in altitude between you and your target");
    altitudeDifference = myObj.nextFloat();  


    System.out.println(sizeInYards*1000/sizeInMils+altitudeDifference + "Yards"); //Computes and prints the range including altitude difference
    }
}
