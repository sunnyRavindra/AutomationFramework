package listeners;

import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.testng.IReporter;
import org.testng.IResultMap;
import org.testng.ISuite;
import org.testng.ISuiteResult;
import org.testng.ITestContext;
import org.testng.ITestNGMethod;
import org.testng.xml.XmlSuite;
import utils.CreatePDFReport;

public class ReporterListener extends CreatePDFReport implements IReporter {

	@Override
	public void generateReport(List<XmlSuite> xmlSuites, List<ISuite> suites, String outputDirectory) {
		for (ISuite ist : suites) {
			try {

				openPdfPath();
				// *************//
				Map<String, ISuiteResult> resultSuiteMap = ist.getResults();
				Set<String> key = resultSuiteMap.keySet();
				for (String k : key) {
					ITestContext context = resultSuiteMap.get(k).getTestContext();
					System.out.println("Suite Name- " + context.getName() + "\n Report output Directory- "
							+ context.getOutputDirectory() + "\n Suite Name- " + context.getSuite().getName()
							+ "\n Start Date Time for Execution- " + context.getStartDate()
							+ "\n End Date Time for Execution- " + context.getEndDate());

					addParagraph("Suite Name- " + context.getName() + "\n Report output Directory- "
							+ context.getOutputDirectory() + "\n Suite Name- " + context.getSuite().getName()
							+ "\n Start Date Time for Execution- " + context.getStartDate()
							+ "\n End Date Time for Execution- " + context.getEndDate());
					IResultMap resultMap = context.getFailedTests();

					Collection<ITestNGMethod> failedMethods = resultMap.getAllMethods();
					System.out.println("------Failed Test Case-----");

					for (ITestNGMethod imd : failedMethods) {
						System.out.println(
								"Test Case Name- " + imd.getMethodName() + "\n Description- " + imd.getDescription()
										+ "\n Priority- " + imd.getPriority() + "\n Date- " + new Date(imd.getDate()));

						addParagraph(
								"Test Case Name- " + imd.getMethodName() + "\n Description- " + imd.getDescription()
										+ "\n Priority- " + imd.getPriority() + "\n Date- " + new Date(imd.getDate()));
					}

					IResultMap passedTest = context.getPassedTests();
					Collection<ITestNGMethod> passedMethods = passedTest.getAllMethods();
					System.out.println("------Passed Test Case-----");
					for (ITestNGMethod imd1 : passedMethods) {
						System.out.println("Test Case Name- " + imd1.getMethodName() + "\n Description- "
								+ imd1.getDescription() + "\n Priority- " + imd1.getPriority() + "\n Date- "
								+ new Date(imd1.getDate()));

						addParagraph("Test Case Name- " + imd1.getMethodName() + "\n Description- "
								+ imd1.getDescription() + "\n Priority- " + imd1.getPriority() + "\n Date- "
								+ new Date(imd1.getDate()));
					}
				}
				// Closing PDF file
				closePdf();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}
