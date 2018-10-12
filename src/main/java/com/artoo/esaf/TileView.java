package com.artoo.esaf;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class TileView implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@org.kie.api.definition.type.Label("loan_type")
	private java.lang.String loan_type;
	@org.kie.api.definition.type.Label("person_applicant_present_home_address_years")
	private java.lang.String person_applicant_present_home_address_years;
	@org.kie.api.definition.type.Label("person_applicant_years_of_experience")
	private java.lang.String person_applicant_years_of_experience;
	@org.kie.api.definition.type.Label("collateral_asset_type")
	private java.lang.String collateral_asset_type;
	@org.kie.api.definition.type.Label("collateral_asset_age")
	private java.lang.Integer collateral_asset_age;
	@org.kie.api.definition.type.Label("experience_in_business")
	private java.lang.String experience_in_business;
	@org.kie.api.definition.type.Label("foir")
	private Double foir;
	@org.kie.api.definition.type.Label("ltv")
	private java.lang.Double ltv;
	@org.kie.api.definition.type.Label("vintage_esaf")
	private java.lang.String vintage_esaf;
	@org.kie.api.definition.type.Label("business_location")
	private java.lang.String business_location;
	@org.kie.api.definition.type.Label("house_pledging")
	private java.lang.String house_pledging;
	@org.kie.api.definition.type.Label("business_group")
	private java.lang.String business_group;
	@org.kie.api.definition.type.Label("borrower_history")
	private java.lang.String borrower_history;
	@org.kie.api.definition.type.Label("property_value")
	private java.lang.String property_value;
	@org.kie.api.definition.type.Label("property_pledged")
	private java.lang.String property_pledged;

	public TileView() {
	}

	public java.lang.String getLoan_type() {
		return this.loan_type;
	}

	public void setLoan_type(java.lang.String loan_type) {
		this.loan_type = loan_type;
	}

	public java.lang.String getPerson_applicant_present_home_address_years() {
		return this.person_applicant_present_home_address_years;
	}

	public void setPerson_applicant_present_home_address_years(
			java.lang.String person_applicant_present_home_address_years) {
		this.person_applicant_present_home_address_years = person_applicant_present_home_address_years;
	}

	public java.lang.String getPerson_applicant_years_of_experience() {
		return this.person_applicant_years_of_experience;
	}

	public void setPerson_applicant_years_of_experience(
			java.lang.String person_applicant_years_of_experience) {
		this.person_applicant_years_of_experience = person_applicant_years_of_experience;
	}

	public java.lang.String getCollateral_asset_type() {
		return this.collateral_asset_type;
	}

	public void setCollateral_asset_type(java.lang.String collateral_asset_type) {
		this.collateral_asset_type = collateral_asset_type;
	}

	public java.lang.Integer getCollateral_asset_age() {
		return this.collateral_asset_age;
	}

	public void setCollateral_asset_age(java.lang.Integer collateral_asset_age) {
		this.collateral_asset_age = collateral_asset_age;
	}

	public java.lang.String getExperience_in_business() {
		return this.experience_in_business;
	}

	public void setExperience_in_business(
			java.lang.String experience_in_business) {
		this.experience_in_business = experience_in_business;
	}

	public java.lang.Double getLtv() {
		return this.ltv;
	}

	public void setLtv(java.lang.Double ltv) {
		this.ltv = ltv;
	}

	public java.lang.String getVintage_esaf() {
		return this.vintage_esaf;
	}

	public void setVintage_esaf(java.lang.String vintage_esaf) {
		this.vintage_esaf = vintage_esaf;
	}

	public java.lang.String getBusiness_location() {
		return this.business_location;
	}

	public void setBusiness_location(java.lang.String business_location) {
		this.business_location = business_location;
	}

	public java.lang.String getHouse_pledging() {
		return this.house_pledging;
	}

	public void setHouse_pledging(java.lang.String house_pledging) {
		this.house_pledging = house_pledging;
	}

	public java.lang.String getBusiness_group() {
		return this.business_group;
	}

	public void setBusiness_group(java.lang.String business_group) {
		this.business_group = business_group;
	}

	public java.lang.String getBorrower_history() {
		return this.borrower_history;
	}

	public void setBorrower_history(java.lang.String borrower_history) {
		this.borrower_history = borrower_history;
	}

	public java.lang.String getProperty_value() {
		return this.property_value;
	}

	public void setProperty_value(java.lang.String property_value) {
		this.property_value = property_value;
	}

	public java.lang.String getProperty_pledged() {
		return this.property_pledged;
	}

	public void setProperty_pledged(java.lang.String property_pledged) {
		this.property_pledged = property_pledged;
	}

	public java.lang.Double getFoir() {
		return this.foir;
	}

	public void setFoir(java.lang.Double foir) {
		this.foir = foir;
	}

	public TileView(java.lang.String loan_type,
			java.lang.String person_applicant_present_home_address_years,
			java.lang.String person_applicant_years_of_experience,
			java.lang.String collateral_asset_type,
			java.lang.Integer collateral_asset_age,
			java.lang.String experience_in_business, java.lang.Double foir,
			java.lang.Double ltv, java.lang.String vintage_esaf,
			java.lang.String business_location,
			java.lang.String house_pledging, java.lang.String business_group,
			java.lang.String borrower_history, java.lang.String property_value,
			java.lang.String property_pledged) {
		this.loan_type = loan_type;
		this.person_applicant_present_home_address_years = person_applicant_present_home_address_years;
		this.person_applicant_years_of_experience = person_applicant_years_of_experience;
		this.collateral_asset_type = collateral_asset_type;
		this.collateral_asset_age = collateral_asset_age;
		this.experience_in_business = experience_in_business;
		this.foir = foir;
		this.ltv = ltv;
		this.vintage_esaf = vintage_esaf;
		this.business_location = business_location;
		this.house_pledging = house_pledging;
		this.business_group = business_group;
		this.borrower_history = borrower_history;
		this.property_value = property_value;
		this.property_pledged = property_pledged;
	}

}