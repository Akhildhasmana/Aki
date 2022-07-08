package Book_Myshow_Utility;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentManager {

	private static ExtentReports reports;

	public static ExtentReports getReport() {
		if (reports == null) {
			reports = new ExtentReports();

			ExtentSparkReporter reportSetting = new ExtentSparkReporter(
				(System.getProperty("user.dir") + "\\new test"));
					
					//(System.getProperty("D:\\java\\files\\reports" + "\\new test")));		
			reportSetting.config().setReportName("New test");
			reportSetting.config().setDocumentTitle("New test result");
			reportSetting.config().setTheme(Theme.STANDARD);
			reportSetting.config().setEncoding("utf-8");

			reports.attachReporter(reportSetting);
			return reports;

		}

		return reports;
	}

}
