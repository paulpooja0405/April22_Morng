package nayaKuchTo;

public class Whatsapp3 extends Whatsapp1 {
	
	public void call()
	{
		System.out.println("Whatsapp3 audio call");
	}
	
	public static void main (String [] args){
		{
			Whatsapp3 s = new Whatsapp3();
			s.dp();
			s.call();
			
		}

	}
}
