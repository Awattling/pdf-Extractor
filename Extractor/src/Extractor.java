
/**
 * @author Austin Wattling
 *
 */
import java.io.File;
import java.io.IOException; 
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;

public class Extractor {

    
   public static void main (String args[]) throws IOException {
      
	   File file = new File("p1.pdf");
      //Creating PDF document object 
      PDDocument document = PDDocument.load(file);
      
      PDFTextStripper stripper = new PDFTextStripper();
      String text = stripper.getText(document);
      System.out.println(text);
      document.close();
   }
}
