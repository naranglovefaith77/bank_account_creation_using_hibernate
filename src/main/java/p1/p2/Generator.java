package p1.p2;
import java.util.Random;

public class Generator {

	
	public void accountNoGenerator()
	{
	
		Random rand = new Random();
	    String card = "BE";
	    for (int i = 0; i < 14; i++)
	    {
	        int n = rand.nextInt(10) + 0;
	        card += Integer.toString(n);
	    }
	    for (int i = 0; i < 16; i++)
	    {
	        if(i % 4 == 0)
	          System.out.print(" ");
	        System.out.print(card.charAt(i));
	    }
	}

}
