package Railway;

public class StationOld {

	private String station_id;
	private String location;
	private String station_name;
	private int no_of_platforms;
	
	StationOld(String station_id, String location, String station_name, int no_of_platforms) {
		
		this.station_id = station_id;
		this.location = location;
		this.station_name = station_name;
		this.no_of_platforms = no_of_platforms;
	}
	public String getStation_id() {
		return station_id;
	}
	public void setStation_id(String station_id) {
		this.station_id = station_id;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getStation_name() {
		return station_name;
	}
	public void setStation_name(String station_name) {
		this.station_name = station_name;
	}
	public int getNo_of_platforms() {
		return no_of_platforms;
	}
	public void setNo_of_platforms(int no_of_platforms) {
		this.no_of_platforms = no_of_platforms;
    }
}
