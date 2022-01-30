// ------------------------ I N F O R M A T I O N ------------------------\
//			   -> Alle Dateipfade  müssen angepasst werden!
// -----------------------------------------------------------------------\
package passwortGenerator;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GUIPasswortGenerator extends JFrame implements ActionListener
{
	private static final long serialVersionUID = -6888987401477749147L;
	JButton button_16;
    JButton button_32;
    JButton button_64;
    JButton button_128;
    JButton button_G;
    JLabel InfotextPG;
    JButton button_CPW;
    JLabel Label;
    JLabel InfotextIhrPW;
    JLabel InfotextIhrPW2;
    JLabel InfotextIhrPW3;
    JPanel Panel;
    JLabel l1;
    
    public static void main(String[] args)
    {
		GUIPasswortGenerator PANEL1 = new GUIPasswortGenerator();
		PANEL1.setLocation(300, 300);
    	PANEL1.setVisible(true);
    	PANEL1.setResizable(false);
    	PANEL1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public GUIPasswortGenerator(){
    	this.setTitle("Passwort Generator");
    	this.setSize(1000,600);
    	this.setLayout(null);
    	this.getContentPane().setBackground(Color.DARK_GRAY);
    	
    	Panel = new JPanel();

    	// Leeres JLabel-Objekt wird erzeugt
    	Label = new JLabel();

    	//Buttons werden erstellt
    	button_CPW = new JButton("Jetzt Passwort erstellen");

    	//Buttons werden dem Listener zugeordnet
    	button_CPW.addActionListener(this);

    	button_CPW.setBounds(380, 400, 250, 50);
    	
    	JLabel Bild1 = new JLabel("");
    	Bild1.setIcon(new ImageIcon("C:\\Users\\tobias\\Desktop\\Projekt\\abdruck.png"));
    	Bild1.setBounds(400, 150, 200, 200);
    	this.add(Bild1);
    	
    	JLabel Bild2 = new JLabel("");
    	Bild2.setIcon(new ImageIcon("C:\\Users\\tobias\\Desktop\\Projekt\\ueberschrift.png"));
    	Bild2.setBounds(360, -10, 400, 200);
    	this.add(Bild2);
    	
    	JLabel Bild3 = new JLabel("");
    	Bild3.setIcon(new ImageIcon("C:\\Users\\tobias\\Desktop\\Projekt\\schloss.png"));
    	Bild3.setBounds(800, -10, 400, 200);
    	this.add(Bild3);
    	
    	button_CPW.setBackground(Color.GRAY);
    	//JLabel wird dem Panel hinzugefügt
    	this.add(Panel);
    	this.add(button_CPW);

    	}
    
    public void actionPerformed (ActionEvent ae)
	{
		Label.setBounds(380, 300, 250, 50);
		JFrame PWmitte = new JFrame("Passwort Generator");
    	// Button abfragen (Passwort Generrieren)
        if(ae.getSource() == this.button_CPW)
    	{
        this.setVisible(false);
    	PWmitte.setLocation(300, 300);
    	PWmitte.setVisible(true);
    	PWmitte.setResizable(false);
    	PWmitte.setSize(1000, 600);
    	PWmitte.setLayout(null);
    	PWmitte.getContentPane().setBackground(Color.DARK_GRAY);
    	
    	button_16 = new JButton("🔒 16 Ziffern (Schwach)");
    	button_16.addActionListener(this);
    	button_16.setBounds(360, 200, 300, 50);
    	PWmitte.add(button_16);
    	
    	button_32 = new JButton("🔒 32 Ziffern (Stark)");
    	button_32.addActionListener(this);
    	button_32.setBounds(360, 260, 300, 50);
    	PWmitte.add(button_32);
    	
    	button_64 = new JButton("🔒 64 Ziffern (Sehr Stark)");
    	button_64.addActionListener(this);
    	button_64.setBounds(360, 320, 300, 50);
    	PWmitte.add(button_64);
    	
    	button_128 = new JButton("🔒 128 Ziffern (Ultra Stark)");
    	button_128.addActionListener(this);
    	button_128.setBounds(360, 380, 300, 50);
    	PWmitte.add(button_128);
    	
    	InfotextPG = new JLabel();
    	InfotextPG.setText(("Wählen sie die Gewünschte Passwort Stärke aus."));
    	InfotextPG.setBounds(370, 80, 500, 200);
    	InfotextPG.setForeground(Color.WHITE);
    	PWmitte.add(InfotextPG);
    	
    	JLabel Bild2 = new JLabel("");
    	Bild2.setIcon(new ImageIcon("C:\\Users\\tobias\\Desktop\\Projekt\\ueberschrift.png"));
    	Bild2.setBounds(360, -10, 400, 200);
    	PWmitte.add(Bild2);
    	
    	JLabel Bild3 = new JLabel("");
    	Bild3.setIcon(new ImageIcon("C:\\Users\\tobias\\Desktop\\Projekt\\schloss.png"));
    	Bild3.setBounds(800, -10, 400, 200);
    	PWmitte.add(Bild3);
    	
    	}
     // Button abfragen (Passwortstärke - 16)
        else if(ae.getSource() == this.button_16)
    	{
        	PWmitte.setVisible(false);
        	JFrame PWende_16 = new JFrame("Passwort Generator");
        	PWende_16.setLocation(300, 300);
        	PWende_16.setResizable(false);
        	PWende_16.setVisible(true);
        	PWende_16.setSize(1000, 600);
        	PWende_16.setLayout(null);
        	PWende_16.getContentPane().setBackground(Color.DARK_GRAY);
        	
        	InfotextPG = new JLabel();
        	InfotextPG.setText(("Ihr Passwort wurde erfolgreich erstellt ink. QR-Code."));
        	InfotextPG.setBounds(350, 80, 500, 200);
        	InfotextPG.setForeground(Color.WHITE);
        	PWende_16.add(InfotextPG);
        	
        	InfotextIhrPW = new JLabel();
        	InfotextIhrPW.setText(("Ihr Passwort lautet:"));
        	InfotextIhrPW.setForeground(Color.WHITE);
        	InfotextIhrPW.setBounds(435, 350, 500, 200);
        	PWende_16.add(InfotextIhrPW);
        	
        	InfotextIhrPW2 = new JLabel();
        	InfotextIhrPW2.setText(PasswortGenerator.passwortGenerieren16());
        	InfotextIhrPW2.setForeground(Color.WHITE);
        	InfotextIhrPW2.setBounds(435, 400, 500, 200);
        	PWende_16.add(InfotextIhrPW2);
      	
        	InfotextIhrPW3 = new JLabel();
        	InfotextIhrPW3.setText("Ihr Passwort ist Schwach!");
        	InfotextIhrPW3.setForeground(Color.RED);
        	InfotextIhrPW3.setBounds(415, 450, 500, 200);
        	PWende_16.add(InfotextIhrPW3);
        	
        	JLabel Bild2 = new JLabel("");
        	Bild2.setIcon(new ImageIcon("C:\\Users\\tobias\\Desktop\\Projekt\\ueberschrift.png"));
        	Bild2.setBounds(350, -10, 400, 200);
        	PWende_16.add(Bild2);
        	
        	JLabel Bild3 = new JLabel("");
        	Bild3.setIcon(new ImageIcon("C:\\Users\\tobias\\Desktop\\Projekt\\schloss.png"));
        	Bild3.setBounds(800, -10, 400, 200);
        	PWende_16.add(Bild3);
        	
        	JLabel QR = new JLabel("");
        	QR.setIcon(new ImageIcon("C:\\Users\\tobias\\Desktop\\Projekt\\QRcode16.png"));
        	QR.setBounds(390, 200, 200, 200);
        	PWende_16.add(QR);
        	
        }
     // Button abfragen (Passwortstärke - 32)
        else if(ae.getSource() == this.button_32)
    	{
       	
        	Panel.setVisible(false);
        	JFrame PWende_32 = new JFrame("Passwort Generator");
        	PWende_32.setLocation(300, 300);
        	PWende_32.setResizable(false);
        	PWende_32.setVisible(true);
        	PWende_32.setSize(1000, 600);
        	PWende_32.setLayout(null);
        	PWende_32.getContentPane().setBackground(Color.DARK_GRAY);
        	
        	InfotextPG = new JLabel();
        	InfotextPG.setText(("Ihr Passwort wurde erfolgreich erstellt ink. QR-Code."));
        	InfotextPG.setBounds(350, 80, 500, 200);
        	InfotextPG.setForeground(Color.WHITE);
        	PWende_32.add(InfotextPG);
        		
        	InfotextIhrPW = new JLabel();
        	InfotextIhrPW.setText(("Ihr Passwort lautet:"));
        	InfotextIhrPW.setForeground(Color.WHITE);
        	InfotextIhrPW.setBounds(435, 350, 500, 200);
        	PWende_32.add(InfotextIhrPW);
        	
        	InfotextIhrPW2 = new JLabel();
        	InfotextIhrPW2.setText(PasswortGenerator.passwortGenerieren32());
        	InfotextIhrPW2.setForeground(Color.WHITE);
        	InfotextIhrPW2.setBounds(390, 400, 500, 200);
        	PWende_32.add(InfotextIhrPW2);
        	
        	InfotextIhrPW3 = new JLabel();
        	InfotextIhrPW3.setText("Ihr Passwort ist Stark!");
        	InfotextIhrPW3.setForeground(Color.ORANGE);
        	InfotextIhrPW3.setBounds(415, 450, 500, 200);
        	PWende_32.add(InfotextIhrPW3);
        	
        	JLabel Bild2 = new JLabel("");
        	Bild2.setIcon(new ImageIcon("C:\\Users\\tobias\\Desktop\\Projekt\\ueberschrift.png"));
        	Bild2.setBounds(350, -10, 400, 200);
        	PWende_32.add(Bild2);
        	
        	JLabel Bild3 = new JLabel("");
        	Bild3.setIcon(new ImageIcon("C:\\Users\\tobias\\Desktop\\Projekt\\schloss.png"));
        	Bild3.setBounds(800, -10, 400, 200);
        	PWende_32.add(Bild3);
        	
        	JLabel QR = new JLabel("");
        	QR.setIcon(new ImageIcon("C:\\Users\\tobias\\Desktop\\Projekt\\QRcode32.png"));
        	QR.setBounds(390, 200, 200, 200);
        	PWende_32.add(QR);
  	
        }
     // Button abfragen (Passwortstärke - 64)
        else if(ae.getSource() == this.button_64)
    	{
       	
        	Panel.setVisible(false);
        	JFrame PWende_64 = new JFrame("Passwort Generator");
        	PWende_64.setLocation(300, 300);
        	PWende_64.setResizable(false);
        	PWende_64.setVisible(true);
        	PWende_64.setSize(1000, 600);
        	PWende_64.setLayout(null);
        	PWende_64.getContentPane().setBackground(Color.DARK_GRAY);
        	
        	InfotextPG = new JLabel();
        	InfotextPG.setText(("Ihr Passwort wurde erfolgreich erstellt ink. QR-Code."));
        	InfotextPG.setBounds(350, 80, 500, 200);
        	InfotextPG.setForeground(Color.WHITE);
        	PWende_64.add(InfotextPG);
        	
        	InfotextIhrPW = new JLabel();
        	InfotextIhrPW.setText(("Ihr Passwort lautet:"));
        	InfotextIhrPW.setForeground(Color.WHITE);
        	InfotextIhrPW.setBounds(435, 350, 500, 200);
        	PWende_64.add(InfotextIhrPW);
        	
        	InfotextIhrPW2 = new JLabel();
        	InfotextIhrPW2.setText(PasswortGenerator.passwortGenerieren64());
        	InfotextIhrPW2.setForeground(Color.WHITE);
        	InfotextIhrPW2.setBounds(290, 400, 500, 200);
        	PWende_64.add(InfotextIhrPW2);
        	
        	InfotextIhrPW3 = new JLabel();
        	InfotextIhrPW3.setText("Ihr Passwort ist Sehr Stark!");
        	InfotextIhrPW3.setForeground(Color.GREEN);
        	InfotextIhrPW3.setBounds(405, 450, 500, 200);
        	PWende_64.add(InfotextIhrPW3);
        	
        	JLabel Bild2 = new JLabel("");
        	Bild2.setIcon(new ImageIcon("C:\\Users\\tobias\\Desktop\\Projekt\\ueberschrift.png"));
        	Bild2.setBounds(350, -10, 400, 200);
        	PWende_64.add(Bild2);
        	
        	JLabel Bild3 = new JLabel("");
        	Bild3.setIcon(new ImageIcon("C:\\Users\\tobias\\Desktop\\Projekt\\schloss.png"));
        	Bild3.setBounds(800, -10, 400, 200);
        	PWende_64.add(Bild3);
        	
        	JLabel QR = new JLabel("");
        	QR.setIcon(new ImageIcon("C:\\Users\\tobias\\Desktop\\Projekt\\QRcode64.png"));
        	QR.setBounds(390, 200, 200, 200);
        	PWende_64.add(QR);
        	
        }
     // Button abfragen (Passwortstärke - 128)
        else if(ae.getSource() == this.button_128)
    	{
       	
        	Panel.setVisible(false);
        	JFrame PWende_128 = new JFrame("Passwort Generator");
        	PWende_128.setLocation(300, 300);
        	PWende_128.setResizable(false);
        	PWende_128.setVisible(true);
        	PWende_128.setSize(1000, 600);
        	PWende_128.setLayout(null);
        	PWende_128.getContentPane().setBackground(Color.DARK_GRAY);
        	
        	InfotextPG = new JLabel();
        	InfotextPG.setText(("Ihr Passwort wurde erfolgreich erstellt ink. QR-Code."));
        	InfotextPG.setBounds(350, 80, 500, 200);
        	InfotextPG.setForeground(Color.WHITE);
        	PWende_128.add(InfotextPG);

        	InfotextIhrPW = new JLabel();
        	InfotextIhrPW.setText(("Ihr Passwort lautet:"));
        	InfotextIhrPW.setForeground(Color.WHITE);
        	InfotextIhrPW.setBounds(435, 350, 500, 200);
        	PWende_128.add(InfotextIhrPW);
        	
        	InfotextIhrPW2 = new JLabel();
        	InfotextIhrPW2.setText(PasswortGenerator.passwortGenerieren128());
        	InfotextIhrPW2.setForeground(Color.WHITE);
        	InfotextIhrPW2.setBounds(95, 400, 900, 200);
        	PWende_128.add(InfotextIhrPW2);
        	
        	InfotextIhrPW3 = new JLabel();
        	InfotextIhrPW3.setText("Ihr Passwort ist Ultra Stark!");
        	InfotextIhrPW3.setForeground(Color.MAGENTA);
        	InfotextIhrPW3.setBounds(405, 450, 500, 200);
        	PWende_128.add(InfotextIhrPW3);
        	
        	JLabel Bild2 = new JLabel("");
        	Bild2.setIcon(new ImageIcon("C:\\Users\\tobias\\Desktop\\Projekt\\ueberschrift.png"));
        	Bild2.setBounds(350, -10, 400, 200);
        	PWende_128.add(Bild2);
        	
        	JLabel Bild3 = new JLabel("");
        	Bild3.setIcon(new ImageIcon("C:\\Users\\tobias\\Desktop\\Projekt\\schloss.png"));
        	Bild3.setBounds(800, -10, 400, 200);
        	PWende_128.add(Bild3);
        	
        	JLabel QR = new JLabel("");
        	QR.setIcon(new ImageIcon("C:\\Users\\tobias\\Desktop\\Projekt\\QRcode128.png"));
        	QR.setBounds(390, 200, 200, 200);
        	PWende_128.add(QR);
        	
        }

    }
    
}
