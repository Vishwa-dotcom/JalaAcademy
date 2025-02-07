package SelFrameworkDesign.Tests;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.HashMap;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

import SelFrameworkDesign.Methods.BaseTest;
import SelFrameworkDesign.Methods.homePageM;
import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;

public class createEmployeeExcel extends BaseTest {
	
	@SuppressWarnings("resource")
	@Description("Creating Employee Hash Map ")
	@Feature("Employee")
	@Severity(SeverityLevel.NORMAL)
	@Story("Creating and validating Employee")
	@Test
	public static void importData() throws Exception {
		
		
		
		File file = new File("C:\\Users\\Vishwanath.Bidarolli\\neww\\eclipse-workspace\\SelFrameworkDesign\\resource\\Jala Academy.xlsx");
		FileInputStream fis = new FileInputStream(file);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheet("Sheet1");
		int rowCount = sheet.getLastRowNum();
		for(int i =0; i<rowCount; i++) {
			int columnCount = sheet.getRow(i).getLastCellNum();

			XSSFRow cellData=sheet.getRow(i);
			
			String firstName=cellData.getCell(0).getStringCellValue().toString();
			String lastName=cellData.getCell(1).getStringCellValue().toString();
			String email=cellData.getCell(2).getStringCellValue().toString();
			String mobileno=cellData.getCell(3).getStringCellValue();
			String dob=cellData.getCell(4).getStringCellValue();
			String gender=cellData.getCell(4).getStringCellValue().toString();
			String country=cellData.getCell(5).getStringCellValue().toString();
			String city=cellData.getCell(6).getStringCellValue().toString();
			//String skill=cellData.getCell(8).getStringCellValue();
			wb.close();			
			homePageM.clickEmployeeLink();
			homePageM.clickCreateLink();
			homePageM.enterFirstName(firstName);
			homePageM.enterLastName(lastName);
			homePageM.enterEmail(email);
			homePageM.enterMobileNo(mobileno);
			homePageM.DOB(dob);
			homePageM.genderSelectFeMale();
			homePageM.addAddress("Test");
			homePageM.selectCountry();
			homePageM.selectCity();
			homePageM.selectSkill();
			homePageM.clickSave();
			
			
		}
		
		
	}
}
