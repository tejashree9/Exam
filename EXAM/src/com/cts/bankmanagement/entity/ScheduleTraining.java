package com.cts.bankmanagement.entity;

import java.io.Serializable;


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.Future;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="TRAINING_SCHEDULE")
public class ScheduleTraining implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3589910558286769970L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="SCHEDULE_ID")
	private int scheduleId;
	
	 @DateTimeFormat(pattern = "dd/MM/yyyy")
	 @Future(message="Enter Date Greater than current Date")
	@Column(name="START_DATE")
	private Date startDate;
	
	@Column(name="DURATION")
	private int duration;
	
	@ManyToOne
	@JoinColumn(name="TRAINER_ID")
	private TrainerInfo trainerInfo;

	public int getScheduleId() {
		return scheduleId;
	}

	public void setScheduleId(int scheduleId) {
		this.scheduleId = scheduleId;
	}

	public Date getStratDate() {
		return startDate;
	}

	public void setStratDate(Date stratDate) {
		this.startDate = stratDate;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public TrainerInfo getTrainerInfo() {
		return trainerInfo;
	}

	public void setTrainerInfo(TrainerInfo trainerInfo) {
		this.trainerInfo = trainerInfo;
	}

	@Override
	public String toString() {
		return "ScheduleTraining [scheduleId=" + scheduleId + ", stratDate="
				+ startDate + ", duration=" + duration + ", trainerInfo="
				+ trainerInfo + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + duration;
		result = prime * result + scheduleId;
		result = prime * result
				+ ((startDate == null) ? 0 : startDate.hashCode());
		result = prime * result
				+ ((trainerInfo == null) ? 0 : trainerInfo.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ScheduleTraining other = (ScheduleTraining) obj;
		if (duration != other.duration)
			return false;
		if (scheduleId != other.scheduleId)
			return false;
		if (startDate == null) {
			if (other.startDate != null)
				return false;
		} else if (!startDate.equals(other.startDate))
			return false;
		if (trainerInfo == null) {
			if (other.trainerInfo != null)
				return false;
		} else if (!trainerInfo.equals(other.trainerInfo))
			return false;
		return true;
	}

	public ScheduleTraining(int scheduleId, Date stratDate, int duration,
			TrainerInfo trainerInfo) {
		super();
		this.scheduleId = scheduleId;
		this.startDate = stratDate;
		this.duration = duration;
		this.trainerInfo = trainerInfo;
	}

	public ScheduleTraining() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

}
