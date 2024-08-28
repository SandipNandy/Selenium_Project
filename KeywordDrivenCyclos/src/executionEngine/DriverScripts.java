package executionEngine;
import Config.ActionKeyword;
import Utility.ExcelUtils;

public class DriverScripts {
	 public static void main(String[] args) throws Exception {
	     // Declaring the path of the Excel file with the name of the Excel file
		 
	     String sPath = "..//KeywordDrivenCyclos//src//dataEngine//DataEngine.xlsx";
	 
	     // Here we are passing the Excel path and SheetName as arguments to connect with Excel file 
	     ExcelUtils.setExcelFile(sPath, "Sheet1");
	 
	     //Hard coded values are used for Excel row & columns for now
	     //In later chapters we will replace these hard coded values with varibales
	     //This is the loop for reading the values of the column 3 (Action Keyword) row by row
	     for (int iRow=1;iRow<=14;iRow++){
	     //Storing the value of excel cell in sActionKeyword string variable
	     String sActionKeyword = ExcelUtils.getCellData(iRow, 3);
	 
	     //Comparing the value of Excel cell with all the project keywords
	     if(sActionKeyword.equals("openBrowser")){
	                        //This will execute if the excel cell value is 'openBrowser'
	     //Action Keyword is called here to perform action
	     ActionKeyword.openBrowser();}
	     else if(sActionKeyword.equals("navigate")){
	     ActionKeyword.navigate();}
	     /*else if(sActionKeyword.equals("click_MyAccount")){
	     ActionKeyword.click_MyAccount();}*/
	     else if(sActionKeyword.equals("click_Admin")){
	     ActionKeyword.click_Admin();}
	     else if(sActionKeyword.equals("click_Password")){
	     ActionKeyword.click_Password();}
	     else if(sActionKeyword.equals("Submit")){
	     ActionKeyword.Submit();}
	     else if(sActionKeyword.equals("Account")){
		     ActionKeyword.Account();}
	     else if(sActionKeyword.equals("Member_Payment")){
		     ActionKeyword.Member_Payment();}
	     else if(sActionKeyword.equals("Login_Recipint")){
		     ActionKeyword.Login_Recipint();
		     Thread.sleep(2000);}
	     else if(sActionKeyword.equals("Login_RecipintName")){
		     ActionKeyword.Login_RecipintName();}
	     else if(sActionKeyword.equals("Amount")){
		     ActionKeyword.Amount();}
	     else if(sActionKeyword.equals("Description")){
		     ActionKeyword.Description();}
	     else if(sActionKeyword.equals("Submit2")){
		     ActionKeyword.Submit2();
		     Thread.sleep(2000);}
	     else if(sActionKeyword.equals("Submit3")){
		     ActionKeyword.Submit3();
		     Thread.sleep(2000);
		     } 
	     else if (sActionKeyword.equals("LogOut")){
	    	 ActionKeyword.LogOut();
	     }
	     else if(sActionKeyword.equals("closeBrowser")){
	     ActionKeyword.closeBrowser();}
	     /*else if(sActionKeyword.equals("click_Logout")){
	     ActionKeyword.click_Logout();}
	     else if(sActionKeyword.equals("closeBrowser")){
	     ActionKeyword.closeBrowser();}*/
	 
	     }
	     }
	 }
	 

	
