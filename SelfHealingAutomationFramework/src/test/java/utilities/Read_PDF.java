package utilities;

import java.io.BufferedInputStream;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import org.apache.pdfbox.pdmodel.*;
import org.apache.pdfbox.text.PDFTextStripper;
import org.testng.annotations.Test;

public class Read_PDF {
	
	@Test
	public void readPDFEngine() {
		
		try {
			URL readUrl = new URL("https://www.betterteam.com/downloads/job-application-form-template-download-standard-20170814.pdf");
			InputStream is = readUrl.openStream();
			BufferedInputStream biStream = new BufferedInputStream(is);
			PDDocument pdDocument=null;
			pdDocument = PDDocument.load(biStream);
			String pdfContent=new PDFTextStripper().getText(pdDocument);
			System.out.println(pdfContent);
			
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
	}

}
