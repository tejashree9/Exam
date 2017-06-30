package com.cts.bankmanagement.vo;


import java.util.Date;

import javax.validation.constraints.Future;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;
import org.hibernate.validator.constraints.Range;
import org.springframework.format.annotation.DateTimeFormat;

public class TrainerVO {

	@Range(min=100000 ,max=999999, message="Should be 6 digit")
	 private int trainerId;
	 
	 @NotEmpty(message="Not Empty Trainer Name")
	 @NotNull(message="Trainer name can not be empty.")
	 private String trainerName;
	 private String collegeName;
	 private String domain;
	 private int duration;
	 @DateTimeFormat(pattern = "dd/MM/yyyy")
	 @Future(message="Enter Date Greater than current Date")
		private Date startDate;
		
		private int scheduleId;

		public int getTrainerId() {
			return trainerId;
		}

		public TrainerVO() {
			super();
			// TODO Auto-generated constructor stub
		}

		public void setTrainerId(int trainerId) {
			this.trainerId = trainerId;
		}

		public String getTrainerName() {
			return trainerName;
		}

		public void setTrainerName(String trainerName) {
			this.trainerName = trainerName;
		}

		public String getCollegeName() {
			return collegeName;
		}

		public void setCollegeName(String collegeName) {
			this.collegeName = collegeName;
		}

		public String getDomain() {
			return domain;
		}

		public void setDomain(String domain) {
			this.domain = domain;
		}

		public int getDuration() {
			return duration;
		}

		public void setDuration(int duration) {
			this.duration = duration;
		}

		public Date getStartDate() {
			return startDate;
		}

		public void setStartDate(Date startDate) {
			this.startDate = startDate;
		}

		public int getScheduleId() {
			return scheduleId;
		}

		public void setScheduleId(int scheduleId) {
			this.scheduleId = scheduleId;
		}

		public TrainerVO(int trainerId, String trainerName, String collegeName,
				String domain, int duration, Date startDate, int scheduleId) {
			super();
			this.trainerId = trainerId;
			this.trainerName = trainerName;
			this.collegeName = collegeName;
			this.domain = domain;
			this.duration = duration;
			this.startDate = startDate;
			this.scheduleId = scheduleId;
		}
		
	
}
