package test_suites;

import java.io.IOException;
import java.security.GeneralSecurityException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Utils.SheetsQuickStart;

public class Testcase1 {

	@Test(dataProvider = "DataSet", priority = 2, description = "Test ages of user")
	public void loginPageTitleTes2t(String s1, String s2) {
		System.out.println(s1 + "," + s2);
	}

	@DataProvider(name = "DataSet")
	public String[][] getDataFromDataprovider() throws IOException {
		// passig the path to datafile to retrieve a object[][] array
		SheetsQuickStart sheet = new SheetsQuickStart();
		try {
			sheet.readGoogleSheet();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (GeneralSecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return sheet.getDataSetObj();
	}

}
