package capitulo.pkg10.ejercicio.pkg5;

public class Capitulo10Ejercicio5 {
    
    public static void main(String[] args) {
        CabinRental c1=new CabinRental(15);
        System.out.println(c1.getCabinNumber()+" "+c1.getWeeklyRentalRate());
        CabinRental c2=new CabinRental(1);
        System.out.println(c2.getCabinNumber()+" "+c2.getWeeklyRentalRate());
        HolidayCabinRental c3=new HolidayCabinRental(1);
        HolidayCabinRental c4=new HolidayCabinRental(5);
        System.out.println(c3.getCabinNumber()+" "+c3.getWeeklyRentalRate());
        System.out.println(c4.getCabinNumber()+" "+c4.getWeeklyRentalRate());
        
    }
    
}
