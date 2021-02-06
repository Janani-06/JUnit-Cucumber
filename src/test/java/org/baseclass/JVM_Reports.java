package org.baseclass;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JVM_Reports {
	
	public static void generateJVM_Reports(String jsonFile) {
		
		File f= new File("C:\\Users\\Janani\\eclipse-workspace\\AppiumwithCucumber\\src\\test\\resources\\Reports");
		Configuration c= new Configuration(f, "Snapdeal;");
		c.addClassifications("Sprint", "2" );
		c.addClassifications("Android", "9");
		
		List<String> l= new ArrayList<String>();
		l.add(jsonFile);
		
		ReportBuilder r= new ReportBuilder(l, c);
		r.generateReports();

	}

}
