package Railway;

public class CompartmentTypeOld {

	private String compartment_type;
	private int no_of_seats;
	private double price_of_seats;
	
	public CompartmentTypeOld(String compartment_type, int no_of_seats, double price_of_seats) {
		this.compartment_type = compartment_type;
		this.no_of_seats = no_of_seats;
		this.price_of_seats = price_of_seats;
		
	
	}

	public String getCompartment_type() {
		return compartment_type;
	}

	public void setCompartment_type(String compartment_type) {
		this.compartment_type = compartment_type;
	}

	public int getNo_of_seats() {
		return no_of_seats;
	}

	public void setNo_of_seats(int no_of_seats) {
		this.no_of_seats = no_of_seats;
	}

	public double getPrice_of_seats() {
		return price_of_seats;
	}

	public void setPrice_of_seats(double price_of_seats) {
		this.price_of_seats = price_of_seats;
    }
}
