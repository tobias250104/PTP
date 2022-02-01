package tobiasMog;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.security.SecureRandom;
import java.util.EnumMap;
import java.util.Map;

import javax.imageio.ImageIO;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.WriterException;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.QRCodeWriter;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;

public class PasswortGenerator 
{

	@SuppressWarnings("unused")
	private static final long serialVersionUID = 1L;
	private static String buchstaben = "abcdefghijklmnopqrstuvwxyz";
    private static String zahlen = "0123456789";
    private static String sonderzeichen = ",?/*~$^+=<>!@#&()–[{}]:;'";
    private static String passwortcreator = buchstaben + buchstaben + zahlen + sonderzeichen;
    private static SecureRandom random = new SecureRandom();
    private static int anzahl;
    private String passwort;
    
    public PasswortGenerator()
    {
    	anzahl=0;
    }
    
    public PasswortGenerator(int anzahl)
	{
		this.setAnzahl(anzahl);
	}
    
    
    public double getAnzahl()
	{
		return anzahl;
	}
	
	public void setAnzahl(int anzahl)
	{
		
		if(anzahl <9)
		{
			System.out.println("Fehler, die Zahl darf nicht unter 8 fallen!");
		}
		
		else
		{
		StringBuilder result = new StringBuilder(anzahl);
        
        String buchstaben1 = randomGenerator(buchstaben, 2);
        result.append(buchstaben1);

        String buchstaben2 = randomGenerator(buchstaben, 2);
        result.append(buchstaben2);

        String zahlen1 = randomGenerator(zahlen, 2);
        result.append(zahlen1);

        String sonderzeichen1 = randomGenerator(sonderzeichen, 2);
        result.append(sonderzeichen1);

        String create = randomGenerator(passwortcreator, anzahl - 8);
        result.append(create);

        String ergebnis1 = result.toString();

        //   System.out.format("%-15s<-> %s%n", "Passwort", passwort4);
        //   System.out.format("%-15s<-> %s%n", "Passwort Länge", passwort4.length());
        //   System.out.format("%-15s<-> %s%n%n%n", "Passwortstärke", "Ultra Stark");
        
       String myCodeText = "Ihr Passwort lautet:" + ergebnis1;
     	String filePath = "E:\\Projekt\\QRcode.png";
     	int size = 200;
         String crunchifyFileType = "png";
         File crunchifyFile = new File(filePath);
         try 
         {

             Map<EncodeHintType, Object> crunchifyHintType = new EnumMap<EncodeHintType, Object>(EncodeHintType.class);
             crunchifyHintType.put(EncodeHintType.CHARACTER_SET, "UTF-8");
             crunchifyHintType.put(EncodeHintType.MARGIN, 1);

  			@SuppressWarnings("unused")
  			Object put = crunchifyHintType.put(EncodeHintType.ERROR_CORRECTION, ErrorCorrectionLevel.H);

             QRCodeWriter mYQRCodeWriter = new QRCodeWriter(); 
             BitMatrix crunchifyBitMatrix = mYQRCodeWriter.encode(myCodeText, BarcodeFormat.QR_CODE, size,
                     size, crunchifyHintType);
             int CrunchifyWidth = crunchifyBitMatrix.getWidth();

             BufferedImage crunchifyImage = new BufferedImage(CrunchifyWidth, CrunchifyWidth,
                     BufferedImage.TYPE_INT_RGB);

             crunchifyImage.createGraphics();

             Graphics2D crunchifyGraphics = (Graphics2D) crunchifyImage.getGraphics();

             crunchifyGraphics.setColor(Color.white);
             crunchifyGraphics.fillRect(0, 0, CrunchifyWidth, CrunchifyWidth);
             crunchifyGraphics.setColor(Color.BLUE);

             for (int i = 0; i < CrunchifyWidth; i++) 
             {
                 for (int j = 0; j < CrunchifyWidth; j++) 
                 {
                     if (crunchifyBitMatrix.get(i, j)) 
                     {
                         crunchifyGraphics.fillRect(i, j, 1, 1);
                     }
                 }
             }

             ImageIO.write(crunchifyImage, crunchifyFileType, crunchifyFile);

             //     System.out.println("QR-Code wurde erstellt!");

         }

         catch (WriterException e) 
         {
             System.out.println("\nERROR - QR-Code konnte nicht erstellt werden!\n");
             e.printStackTrace();
         } 
         catch (IOException e) 
         {
             e.printStackTrace();
         }

		passwort = ergebnis1;
	  }
	}
    
    private static String randomGenerator(String input, int size) 
    {

        if (input == null || input.length() <= 0)
            throw new IllegalArgumentException("Nicht erkannt");
        if (size < 1) throw new IllegalArgumentException("Hoppala, da ist ein Fehler aufgetreten.");

        StringBuilder result = new StringBuilder(size);
        for (int i = 0; i < size; i++) 
        {
            int index = random.nextInt(input.length());
            result.append(input.charAt(index));
        }
        return result.toString();
    }

	
	public String toString()
	{
		return passwort;
	}
	
	public static void main(String[] args) 
	{

	}
    
}
