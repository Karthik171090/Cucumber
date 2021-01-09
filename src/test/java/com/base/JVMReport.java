package com.base;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JVMReport {
public static void generateJVMReport(String json) {
File f = new File(System.getProperty("user.dir")+ "\\src\\test\\resources\\Reports");
Configuration c = new Configuration(f, "Adactin Hotel Site");
c.addClassifications("Platform name", "Windows");
c.addClassifications("Browser name", "Chrome");
c.addClassifications("Browser version", "87.0");
c.addClassifications("Sprint", "18");
List<String> jSonFiles= new ArrayList<String>();
jSonFiles.add(json);
ReportBuilder r = new ReportBuilder(jSonFiles, c);
r.generateReports();



}
}
