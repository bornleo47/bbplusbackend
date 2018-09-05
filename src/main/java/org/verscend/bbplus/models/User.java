package org.verscend.bbplus.models;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.verscend.bbplus.privilege.Role;

@Entity
public class User implements Serializable {

	private static final long serialVersionUID = 20172018L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long userId;
	private String username;
	private String password;
	private String firstName;
	private String middleName;
	private String lastName;
	@Temporal(TemporalType.DATE)
	private Date dateOfBirth;
	private String address;
	private String gender;
	private String email;
	private String phoneNo;

	@OneToOne
	@JoinColumn(name = "bloodGroupId")
	private BloodGroup bloodGroup;

	@OneToOne
	@JoinColumn(name = "districtId")
	private District district;

	@OneToOne
	private Role role;

	private boolean eanbled = true;

	public User() {
	}

	public User(long userId, String username, String password, String firstName, String middleName, String lastName,
			Date dateOfBirth, String address, String gender, String email, String phoneNo, BloodGroup bloodGroup,
			District district, Role role, boolean eanbled) {
		super();
		this.userId = userId;
		this.username = username;
		this.password = password;
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
		this.address = address;
		this.gender = gender;
		this.email = email;
		this.phoneNo = phoneNo;
		this.bloodGroup = bloodGroup;
		this.district = district;
		this.role = role;
		this.eanbled = eanbled;
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public BloodGroup getBloodGroup() {
		return bloodGroup;
	}

	public void setBloodGroup(BloodGroup bloodGroup) {
		this.bloodGroup = bloodGroup;
	}

	public District getDistrict() {
		return district;
	}

	public void setDistrict(District district) {
		this.district = district;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public boolean isEanbled() {
		return eanbled;
	}

	public void setEanbled(boolean eanbled) {
		this.eanbled = eanbled;
	}

}