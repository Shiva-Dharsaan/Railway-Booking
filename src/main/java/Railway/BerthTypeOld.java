package Railway;

public class BerthTypeOld {

	private String berth_type;
	private int no_of_seats;
	private String compartment_type;
	
	public BerthTypeOld(String berth_type, int no_of_seats, String compartment_type) {
		this.berth_type = berth_type;
		this.no_of_seats = no_of_seats;
		this.compartment_type = compartment_type;
		
    
	}

	public String getBerth_type() {
		return berth_type;
	}

	public void setBerth_type(String berth_type) {
		this.berth_type = berth_type;
	}

	public int getNo_of_seats() {
		return no_of_seats;
	}

	public void setNo_of_seats(int no_of_seats) {
		this.no_of_seats = no_of_seats;
	}

	public String getCompartment_type() {
		return compartment_type;
	}

	public void setCompartment_type(String compartment_type) {
		this.compartment_type = compartment_type;
	}
}
