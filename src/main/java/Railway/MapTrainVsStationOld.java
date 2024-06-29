package Railway;

public class MapTrainVsStationOld {
	private String station_id;
	private int train_id;
	private String arrival_time;
	
	public MapTrainVsStationOld(String station_id, int train_id, String arrival_time) {
		this.station_id = station_id;
		this.train_id = train_id;
		this.arrival_time = arrival_time;
	}

	public String getStation_id() {
		return station_id;
	}

	public void setStation_id(String station_id) {
		this.station_id = station_id;
	}

	public  int getTrain_id() {
		return train_id;
	}

	public void setTrain_id(int train_id) {
		this.train_id = train_id;
	}

	public String getArrival_time() {
		return arrival_time;
	}

	public void setArrival_time(String arrival_time) {
		this.arrival_time = arrival_time;
	}
	


}
