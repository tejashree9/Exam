package com.cts.bankmanagement.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;
import org.hibernate.validator.constraints.Range;


@Entity
@Table(name="TRAINER_INFO")
public class TrainerInfo implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -8867454386576858156L;

	@Id
	@Range(min=100000 ,max=999999, message="Should be 6 digit")
	@Column(name="TRAINER_ID")
	private int trainerId;

	 @NotEmpty(message="Not Empty Trainer Name")
	 @NotNull(message="Trainer name can not be empty.")
	@Column(name="TRAINER_NAME")
	private String trainerName;
	
	@Column(name="COLLEGE_NAME")
	private String collegeName;

	@Column(name="DOMAIN")
	private String domain;

	
	@OneToMany
	@JoinColumn(name = "TRAINER_ID")
	private List<ScheduleTraining> trainerInfoList = new ArrayList<ScheduleTraining>();

	
	public int getTrainerId() {
		return trainerId;
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

	public TrainerInfo() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "TraininInfo [trainerId=" + trainerId + ", trainerName="
				+ trainerName + ", collegeName=" + collegeName + ", domain="
				+ domain + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((collegeName == null) ? 0 : collegeName.hashCode());
		result = prime * result + ((domain == null) ? 0 : domain.hashCode());
		result = prime * result + trainerId;
		result = prime * result
				+ ((trainerName == null) ? 0 : trainerName.hashCode());
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
		TrainerInfo other = (TrainerInfo) obj;
		if (collegeName == null) {
			if (other.collegeName != null)
				return false;
		} else if (!collegeName.equals(other.collegeName))
			return false;
		if (domain == null) {
			if (other.domain != null)
				return false;
		} else if (!domain.equals(other.domain))
			return false;
		if (trainerId != other.trainerId)
			return false;
		if (trainerName == null) {
			if (other.trainerName != null)
				return false;
		} else if (!trainerName.equals(other.trainerName))
			return false;
		return true;
	}

	public TrainerInfo(int trainerId, String trainerName, String collegeName,
			String domain) {
		super();
		this.trainerId = trainerId;
		this.trainerName = trainerName;
		this.collegeName = collegeName;
		this.domain = domain;
	}

	
	
}
