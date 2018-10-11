package com.artoo.esaf;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Output implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@org.kie.api.definition.type.Label(value = "overall_score")
	private java.lang.Double overall_score;
	@org.kie.api.definition.type.Label(value = "borrower_charc")
	private java.lang.Double borrower_charc;
	@org.kie.api.definition.type.Label(value = "financial_charc")
	private java.lang.Double financial_charc;
	@org.kie.api.definition.type.Label(value = "transactional_charc")
	private java.lang.Double transactional_charc;
	@org.kie.api.definition.type.Label(value = "property_charac")
	private java.lang.Double property_charac;

	public Output() {
	}

	public java.lang.Double getOverall_score() {
		return this.overall_score;
	}

	public void setOverall_score(java.lang.Double overall_score) {
		this.overall_score = overall_score;
	}

	public java.lang.Double getBorrower_charc() {
		return this.borrower_charc;
	}

	public void setBorrower_charc(java.lang.Double borrower_charc) {
		this.borrower_charc = borrower_charc;
	}

	public java.lang.Double getFinancial_charc() {
		return this.financial_charc;
	}

	public void setFinancial_charc(java.lang.Double financial_charc) {
		this.financial_charc = financial_charc;
	}

	public java.lang.Double getTransactional_charc() {
		return this.transactional_charc;
	}

	public void setTransactional_charc(java.lang.Double transactional_charc) {
		this.transactional_charc = transactional_charc;
	}

	public java.lang.Double getProperty_charac() {
		return this.property_charac;
	}

	public void setProperty_charac(java.lang.Double property_charac) {
		this.property_charac = property_charac;
	}

	public Output(java.lang.Double overall_score,
			java.lang.Double borrower_charc, java.lang.Double financial_charc,
			java.lang.Double transactional_charc,
			java.lang.Double property_charac) {
		this.overall_score = overall_score;
		this.borrower_charc = borrower_charc;
		this.financial_charc = financial_charc;
		this.transactional_charc = transactional_charc;
		this.property_charac = property_charac;
	}

}