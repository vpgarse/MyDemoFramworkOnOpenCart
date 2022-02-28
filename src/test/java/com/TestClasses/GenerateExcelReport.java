/**
 * 
 */
package com.TestClasses;

import org.automationtesting.excelreport.Xl;

/**
 * @author Vaibhav Garse
 *
 */
public class GenerateExcelReport {

	public static void main(String[] args) throws Exception {
		
		 Xl.generateReport(".\\data", "Excel-report.xlsx");

	}

}
