package models.metadata;

import java.util.ArrayList;

public class TwoDVarZonalMean {

	private String dataSource = "";
	private String variableName = "";
	private String startYearMonth = "";
	private String endYearMonth = "";
	private String selectMonths = "";
	private ArrayList<String> month = new ArrayList<String>();
	private String startLat = "";
	private String endLat = "";
	private String variableScale = "";
	private String executionPurpose = "";
	private String image = "";
	private String dataURL = "";
	private String serviceResponseText = "";
	
	public String getDataSource() {
		return dataSource;
	}
	public void setDataSource(String dataSource) {
		this.dataSource = dataSource;
	}
	public String getVariableName() {
		return variableName;
	}
	public void setVariableName(String variableName) {
		this.variableName = variableName;
	}
	public String getStartYearMonth() {
		return startYearMonth;
	}
	public void setStartYearMonth(String startYearMonth) {
		this.startYearMonth = startYearMonth;
	}
	public String getEndYearMonth() {
		return endYearMonth;
	}
	public void setEndYearMonth(String endYearMonth) {
		this.endYearMonth = endYearMonth;
	}
	public String getSelectMonths() {
		return selectMonths;
	}
	public void setSelectMonths(String selectMonths) {
		this.selectMonths = selectMonths;
	}
	public void changeSelectMonths(){

		if(month.contains("1")&&month.contains("2")&&month.contains("3")&&month.contains("4")&&month.contains("5")&&month.contains("6")&&month.contains("7")&&month.contains("8")&&month.contains("9")&&month.contains("10")&&month.contains("11")&&month.contains("12")){
			this.selectMonths = "select all";
		}
		else if(month.contains("6") && month.contains("7") && month.contains("8")){
			this.selectMonths = "Summer:Jun-Jul-Aug";
		}
		else if(month.contains("9") && month.contains("10") && month.contains("11")){
			this.selectMonths = "Autumn:Sep-Oct-Nov";
		}
		else if(month.contains("12") && month.contains("1") && month.contains("2")){
			this.selectMonths = "Winter:Dec-Jan-Feb";
		}
		else if(month.contains("3") && month.contains("4") && month.contains("5")){
			this.selectMonths = "Spring:Mar-Apr-May";
		}
		else{
			this.selectMonths = "select none";
		}
		
	}
	public String getMonth() {
		return month.toString().replace("[", "").replace("]", "");
	}
	public void setMonth(ArrayList<String> month) {
		this.month = month;
	}
	public void addMonth(String oneMonth){
		month.add(oneMonth);
	}
	public String getStartLat() {
		return startLat;
	}
	public void setStartLat(String startLat) {
		this.startLat = startLat;
	}
	public String getEndLat() {
		return endLat;
	}
	public void setEndLat(String endLat) {
		this.endLat = endLat;
	}
	public String getVariableScale() {
		return variableScale;
	}
	public void setVariableScale(String variableScale) {
		this.variableScale = variableScale;
	}
	public String getExecutionPurpose() {
		return executionPurpose;
	}
	public void setExecutionPurpose(String executionPurpose) {
		this.executionPurpose = executionPurpose;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getDataURL() {
		return dataURL;
	}
	public void setDataURL(String dataURL) {
		this.dataURL = dataURL;
	}
	public String getServiceResponseText() {
		return serviceResponseText;
	}
	public void setServiceResponseText(String serviceResponseText) {
		this.serviceResponseText = serviceResponseText;
	}
	
}
