package capitulo.pkg10.ejercicio.pkg5;

public class CabinRental {
    private Integer cabinNumber;
    private Double weeklyRentalRate;

    public CabinRental(Integer cabinNumber){
        this.cabinNumber=cabinNumber;
        if(cabinNumber==1||cabinNumber==2||cabinNumber==3){
            weeklyRentalRate=950.00;
        }
        else{
            weeklyRentalRate=1100.00;
        }
    }
    
    public Integer getCabinNumber() {
        return cabinNumber;
    }

    public Double getWeeklyRentalRate() {
        return weeklyRentalRate;
    }
    protected void Holidayrental(){
        weeklyRentalRate+=150.00;
    }
}
