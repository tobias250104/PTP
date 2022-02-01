package tobiasMog;

public class MAINPasswortGenerator
{

	public static void main(String[] args) 
	{
		// Wert darf nicht unter 8 fallen sonst Error meldung!
		PasswortGenerator pw_check =new PasswortGenerator(8);
		System.out.println("Ihr Passwort lautet: "+pw_check);
	}
	
}
