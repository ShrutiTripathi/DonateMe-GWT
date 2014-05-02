package com.jkt.donateme.client.model;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement(name = "register")

public class BeneficiaryDetailsFields implements Serializable {

	private static final long serialVersionUID = 1L;
	private String relationToBeneficiary;	
	private String firstName;
	private String lastName;
	private String email;
	private String city;
	private String state ;
	private String zip ;
	private String addressLine1 ;
	private String addressLine2 ;
	private String phoneNumber ;
	private String titleOfYourPage;
	private String donationNeeded;
	private String profileSummary;
	private String containerId;
	private String valueHolder;
	private String reasonsforRaisingFunds;
	//ankita
	private String doctorName;
	private String hospitalName;
	private String diseaseName;
	private String uploadYourProfilePicturePanel;
	
	public String getTitleOfYourPage() {
		return titleOfYourPage;
	}
	public void setTitleOfYourPage(String titleOfYourPage) {
		this.titleOfYourPage = titleOfYourPage;
	}
	public String getDonationNeeded() {
		return donationNeeded;
	}
	public void setDonationNeeded(String donationNeeded) {
		this.donationNeeded = donationNeeded;
	}
	public String getProfileSummary() {
		return profileSummary;
	}
	public void setProfileSummary(String profileSummary) {
		this.profileSummary = profileSummary;
	}
	public String getContainerId() {
		return containerId;
	}
	public void setContainerId(String containerId) {
		this.containerId = containerId;
	}
	public String getValueHolder() {
		return valueHolder;
	}
	public void setValueHolder(String valueHolder) {
		this.valueHolder = valueHolder;
	}
	public String getReasonsforRaisingFunds() {
		return reasonsforRaisingFunds;
	}
	public void setReasonsforRaisingFunds(String reasonsforRaisingFunds) {
		this.reasonsforRaisingFunds = reasonsforRaisingFunds;
	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
	public String getAddressLine1() {
		return addressLine1;
	}
	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}
	public String getAddressLine2() {
		return addressLine2;
	}
	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public String getRelationToBeneficiary() {
		return relationToBeneficiary;
	}
	public void setRelationToBeneficiary(String relationToBeneficiary) {
		this.relationToBeneficiary = relationToBeneficiary;
	}
	public String getDoctorName() {
		return doctorName;
	}
	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}
	
	
	public String getHospitalName() {
		return hospitalName;
	}
	public void setHospitalName(String hospitalName) {
		this.hospitalName = hospitalName;
	}
	
	
	public String getDiseaseName() {
		return diseaseName;
	}
	public void setDiseaseName(String diseaseName) {
		this.diseaseName = diseaseName;
	}
	
	public String getUploadYourProfilePicturePanel() {
		return uploadYourProfilePicturePanel;
	}
	public void setUploadYourProfilePicturePanel(
			String uploadYourProfilePicturePanel) {
		this.uploadYourProfilePicturePanel = uploadYourProfilePicturePanel;
	}
	
}
