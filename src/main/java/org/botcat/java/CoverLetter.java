package org.botcat.java;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;

public class CoverLetter {

	public static void main(String[] args) throws IOException {

		content("QA Lead", "Nordia");
		content("QA Test Automation Enginner", "OP");
		content("Lead Developer", "OP");

	}

	public static void content(String Role, String Company) {
		try {
			// Create a new document
			XWPFDocument document = new XWPFDocument();

			// Create a paragraph
			XWPFParagraph paragraph = document.createParagraph();

			// Create a run (a run is a region of text with a common set of properties)
			XWPFRun run = paragraph.createRun();

			// Add text to the run
			run.setText("Hi,");
			run.addBreak();
			run.addBreak();
			run.setText("I am writing to express my interest in the " + Role
					+ " role at "+Company+", as advertised. With a proven track record of 9 years as a Lead QA Test Automation Engineer, I bring to the table extensive expertise in Test Architecture, Framework Development, Test Automation, and Cloud DevOps transformations while Working in OP.");
			run.addBreak();
			run.addBreak();
			run.setText(
					"I have been working for OP for the last 5 years in the Cards area and am leading the New card applications team since the Inception of the product[Saana project] . Currently I am part of the CCAM Centralized Cards Application Maintenance team and actively looking for the opportunities .Please note that I would not be needing a sponsorship as I already possess a valid work visa in Finland."
							+ "");
			run.addBreak();
			run.addBreak();
			run.setText(
					"My skill set includes expertise in Java, Test automation engineering ,Selenium, Cucumber BDD, AWS code pipeline, UI Automation, AWS IAC K-plussa application, Robot Framework ,API Automation using Rest Assured, Cloud Test Automation, CI/CD using Jenkins , and proficiency in Review, Defect tracking, and reporting. I am confident that my experience and skills make me a valuable candidate for the current role.");
			run.addBreak();
			run.addBreak();
			run.setText(
					"I look forward to the opportunity to discuss how my skills and experiences align with the needs in "
							+ Company
							+ ". Thank you for considering my application. I am excited about the possibility of contributing to your team and helping "
							+ Company + " achieve its goals." + "");
			run.addBreak();
			run.addBreak();
			run.setText("Thanks and Regards,");
			run.addBreak();
			run.setText("Sunny Ravindra Bharne,");
			run.addBreak();
			run.setText("QA Test Automation Enginner,");
			run.addBreak();
			run.addBreak();
			run.setText("Linkdin : " + "https://www.linkedin.com/in/sunnybharne/");
			run.addBreak();
			run.setText("Website: " + "https://www.botcat.org");

			try (FileOutputStream fos = new FileOutputStream("/Users/sunnybharne/Library/Mobile Documents/com~apple~CloudDocs/Docs/Resume/"+Company + "_letter.docx")) {
				document.write(fos);
			}

			System.out.println(Company+Role+" : DOCX created successfully.");

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
