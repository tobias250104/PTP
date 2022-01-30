package passwortGenerator;

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
	
	public static void main(String[] args) 
    {
		
    }

	public static String passwortGenerieren16() 
    {

    	StringBuilder result = new StringBuilder(16);
        
        String buchstaben1 = randomGenerator(buchstaben, 2);
        result.append(buchstaben1);

        String buchstaben2 = randomGenerator(buchstaben, 2);
        result.append(buchstaben2);

        String zahlen1 = randomGenerator(zahlen, 2);
        result.append(zahlen1);

        String sonderzeichen1 = randomGenerator(sonderzeichen, 2);
        result.append(sonderzeichen1);

        String create = randomGenerator(passwortcreator, 16 - 8);
        result.append(create);

        String passwort1 = result.toString();

       System.out.format("%-15s<-> %s%n", "Passwort", passwort1);
       System.out.format("%-15s<-> %s%n", "Passwort Länge", passwort1.length());
       System.out.format("%-15s<-> %s%n%n%n", "Passwortstärke", "Schwach");
       
       String myCodeText = "Ihr Passwort lautet:" + passwort1;
      	String filePath = "C:\\Users\\tobias\\Desktop\\Projekt\\QRcode16.png";
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

              System.out.println("QR-Code wurde erstellt \n");

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
       
       return passwort1;
    
    }

	public static String passwortGenerieren32() 
    {

    	StringBuilder result = new StringBuilder(32);
        
        String buchstaben1 = randomGenerator(buchstaben, 2);
        result.append(buchstaben1);

        String buchstaben2 = randomGenerator(buchstaben, 2);
        result.append(buchstaben2);

        String zahlen1 = randomGenerator(zahlen, 2);
        result.append(zahlen1);

        String sonderzeichen1 = randomGenerator(sonderzeichen, 2);
        result.append(sonderzeichen1);

        String create = randomGenerator(passwortcreator, 32 - 8);
        result.append(create);

        String passwort2 = result.toString();

       System.out.format("%-15s<-> %s%n", "Passwort", passwort2);
       System.out.format("%-15s<-> %s%n", "Passwort Länge", passwort2.length());
       System.out.format("%-15s<-> %s%n%n%n", "Passwortstärke", "Stark");
        
       
       String myCodeText = "Ihr Passwort lautet:" + passwort2;
     	String filePath = "C:\\Users\\tobias\\Desktop\\Projekt\\QRcode32.png";
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

             System.out.println("QR-Code wurde erstellt \n");

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
        
        return passwort2;
         
    }

	public static String passwortGenerieren64() 
    {

    	StringBuilder result = new StringBuilder(64);
        
        String buchstaben1 = randomGenerator(buchstaben, 2);
        result.append(buchstaben1);

        String buchstaben2 = randomGenerator(buchstaben, 2);
        result.append(buchstaben2);

        String zahlen1 = randomGenerator(zahlen, 2);
        result.append(zahlen1);

        String sonderzeichen1 = randomGenerator(sonderzeichen, 2);
        result.append(sonderzeichen1);

        String create = randomGenerator(passwortcreator, 64 - 8);
        result.append(create);

        String passwort3 = result.toString();

       System.out.format("%-15s<-> %s%n", "Passwort", passwort3);
       System.out.format("%-15s<-> %s%n", "Passwort Länge", passwort3.length());
       System.out.format("%-15s<-> %s%n%n%n", "Passwortstärke", "Sehr Stark");
        
       String myCodeText = "Ihr Passwort lautet:" + passwort3;
     	String filePath = "C:\\Users\\tobias\\Desktop\\Projekt\\QRcode64.png";
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

             System.out.println("QR-Code wurde erstellt \n");

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
       
        return passwort3;
  
    }
	
    public static String passwortGenerieren128() 
    {

    	StringBuilder result = new StringBuilder(128);
        
        String buchstaben1 = randomGenerator(buchstaben, 2);
        result.append(buchstaben1);

        String buchstaben2 = randomGenerator(buchstaben, 2);
        result.append(buchstaben2);

        String zahlen1 = randomGenerator(zahlen, 2);
        result.append(zahlen1);

        String sonderzeichen1 = randomGenerator(sonderzeichen, 2);
        result.append(sonderzeichen1);

        String create = randomGenerator(passwortcreator, 128 - 8);
        result.append(create);

        String passwort4 = result.toString();

       System.out.format("%-15s<-> %s%n", "Passwort", passwort4);
       System.out.format("%-15s<-> %s%n", "Passwort Länge", passwort4.length());
       System.out.format("%-15s<-> %s%n%n%n", "Passwortstärke", "Ultra Stark");
        
       String myCodeText = "Ihr Passwort lautet:" + passwort4;
     	String filePath = "C:\\Users\\tobias\\Desktop\\Projekt\\QRcode128.png";
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

             System.out.println("QR-Code wurde erstellt \n");

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

        return passwort4;
        
    }

    private static String randomGenerator(String input, int size) 
    {

        if (input == null || input.length() <= 0)
            throw new IllegalArgumentException("Auswahl nicht erkannt!");
        if (size < 1) throw new IllegalArgumentException("Es ist ein Fehler aufgetreten!");

        StringBuilder result = new StringBuilder(size);
        for (int i = 0; i < size; i++) 
        {
            int index = random.nextInt(input.length());
            result.append(input.charAt(index));
        }
        return result.toString();
    }

}
