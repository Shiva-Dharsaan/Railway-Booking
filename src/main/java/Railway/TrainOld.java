package Railway;

public class TrainOld {
		private String starting_location;
		private String ending_location;
		private String departing_time;
		private String arrival_time;
		private int no_of_compartments;
		
		public TrainOld(String starting_location, String ending_location, String departing_time,
				String arrival_time,  int no_of_compartments) {
			
			this.starting_location = starting_location;
			this.ending_location = ending_location;
			this.departing_time = departing_time;
			this.arrival_time = arrival_time;
			this.no_of_compartments = no_of_compartments;
		}
		
		

		public String getStarting_location() {
			return starting_location;
		}

		public void setStarting_location(String starting_location) {
			this.starting_location = starting_location;
		}

		public String getEnding_location() {
			return ending_location;
		}

		public void setEnding_location(String ending_location) {
			this.ending_location = ending_location;
		}

		public String getDeparting_time() {
			return departing_time;
		}

		public void setDeparting_time(String departing_time) {
			this.departing_time = departing_time;
		}

		public String getArrival_time() {
			return arrival_time;
		}

		public void setArrival_time(String arrival_time) {
			this.arrival_time = arrival_time;
		}


		public int getNo_of_compartments() {
			return no_of_compartments;
		}

		public void setNo_of_compartments(int no_of_compartments) {
			this.no_of_compartments = no_of_compartments;
		}


}
