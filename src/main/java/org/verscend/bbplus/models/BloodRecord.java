package org.verscend.bbplus.models;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class BloodRecord {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int bloodRecordId;

	@OneToOne
	private BloodGroup bloodGroup;
	private long pint;
	private String donorName;
	private Date entryDate = new Date();
	private long phone;

	public BloodRecord() {
	}

	public BloodRecord(int bloodRecordId, BloodGroup bloodGroup, long pint, String donorName, Date entryDate,
			long phone) {
		super();
		this.bloodRecordId = bloodRecordId;
		this.bloodGroup = bloodGroup;
		this.pint = pint;
		this.donorName = donorName;
		this.entryDate = entryDate;
		this.phone = phone;
	}

	public int getBloodRecordId() {
		return bloodRecordId;
	}

	public void setBloodRecordId(int bloodRecordId) {
		this.bloodRecordId = bloodRecordId;
	}

	public BloodGroup getBloodGroup() {
		return bloodGroup;
	}

	public void setBloodGroup(BloodGroup bloodGroup) {
		this.bloodGroup = bloodGroup;
	}

	public long getPint() {
		return pint;
	}

	public void setPint(long pint) {
		this.pint = pint;
	}

	public String getDonorName() {
		return donorName;
	}

	public void setDonorName(String donorName) {
		this.donorName = donorName;
	}

	public Date getEntryDate() {
		return entryDate;
	}

	public void setEntryDate(Date entryDate) {
		this.entryDate = entryDate;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

}