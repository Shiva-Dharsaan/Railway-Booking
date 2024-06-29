package Railway;

public class CompartmentsOld {
	private String compartment_id;
	private int seats_available;
	private int train_id;
	private String compartment_type;
	private int lbseats_available;
	private int mbseats_available;
	private int ubseats_available;
	
	public CompartmentsOld(String compartment_id, int seats_available, int train_id, String compartment_type,int lbseats_available, int mbseats_available, int ubseats_available) {
		this.compartment_id = compartment_id;
		this.seats_available = seats_available;
		this.train_id = train_id;
		this.compartment_type = compartment_type;
		this.lbseats_available = lbseats_available;
		this.mbseats_available = mbseats_available;
		this.ubseats_available = ubseats_available;
		
	
	}
	
	public int getLbseats_available() {
			return lbseats_available;
		}
	public void setLbseats_available(int lbseats_available) {
			this.lbseats_available = lbseats_available;
		}
	public int getMbseats_available() {
			return mbseats_available;
		}
	public void setMbseats_available(int mbseats_available) {
			this.mbseats_available = mbseats_available;
		}
	public int getUbseats_available() {
			return ubseats_available;
		}
	public void setUbseats_available(int ubseats_available) {
			this.ubseats_available = ubseats_available;
		}

	public String getCompartment_id() {
		return compartment_id;
	}

	public void setCompartment_id(String compartment_id) {
		this.compartment_id = compartment_id;
	}

	public int getSeats_available() {
		return seats_available;
	}

	public void setSeats_available(int seats_available) {
		this.seats_available = seats_available;
	}

	public int getTrain_id() {
		return train_id;
	}

	public void setTrain_id(int train_id) {
		this.train_id = train_id;
	}

	public String getCompartment_type() {
		return compartment_type;
	}

	public void setCompartment_type(String compartment_type) {
		this.compartment_type = compartment_type;
	}
	

}
