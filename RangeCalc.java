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

    sizeInYards = sizeInInches / 36;

    System.out.println("What is the size of the reference in mils");
    sizeInMils = myObj.nextFloat();

    System.out.println("What is the difference in altitude between you and your target");
    altitudeDifference = myObj.nextFloat();  


    System.out.println(sizeInYards*1000/sizeInMils+altitudeDifference);
    }
}