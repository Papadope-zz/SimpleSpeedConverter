
package speedconverter;


public class SpeedConverter {

    
    public static void main(String[] args) {

        long miles = Methods.toMilesPerHour(10.5);
        System.out.println("Miles : " + miles);
        
        Methods.printConversion(10.5);
    }
    
}
