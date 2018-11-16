package com.artoo.esaf;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class CreditScoreSection implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@org.kie.api.definition.type.Label("Section Score")
	private java.lang.Double section_score;
	@org.kie.api.definition.type.Label("Section Name")
	private java.lang.String section_name;

	@org.kie.api.definition.type.Label(value = "Parameters")
	private java.util.List<com.artoo.esaf.CreditScoringParameter> parameters;

	public CreditScoreSection() {
	}

	public java.lang.Double getSection_score() {
		return this.section_score;
	}

	public void setSection_score(java.lang.Double section_score) {
		this.section_score = section_score;
	}

	public java.lang.String getSection_name() {
		return this.section_name;
	}

	public void setSection_name(java.lang.String section_name) {
		this.section_name = section_name;
	}

	public java.util.List<com.artoo.esaf.CreditScoringParameter> getParameters() {
		return this.parameters;
	}

	public void setParameters(
			java.util.List<com.artoo.esaf.CreditScoringParameter> parameters) {
		this.parameters = parameters;
	}

	public CreditScoreSection(java.lang.Double section_score,
			java.lang.String section_name,
			java.util.List<com.artoo.esaf.CreditScoringParameter> parameters) {
		this.section_score = section_score;
		this.section_name = section_name;
		this.parameters = parameters;
	}

}