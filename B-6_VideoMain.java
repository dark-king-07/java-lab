package varun;
import java.util.*;
public class VideoMain 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
        VideoMethods m = new VideoMethods();
        System.out.println("%%%%%%%%%% MOVIE RENTAL CENTER %%%%%%%%%%");
    	System.out.println("1.ADD");
    	System.out.println("2.DISPLAY");
    	System.out.println("3.RENT");
    	System.out.println("4.COLLECT");
    	System.out.println("5.EXIT");
        while(true)
        {
        	System.out.println("ENTER YOUR CHOICE");
        	int ch = sc.nextInt();
        	switch(ch)
        	{
        	     case 1: m.AddMovies();
                         break;
        	     case 2: m.DisplayAll();
                         break;   
        	     case 3: m.RentOut();
                 		 break;
        	     case 4: m.CollectIn();
                 		 break;
        	     case 5: System.out.println("EXIT");
        	    	     System.exit(0);
        	    	     break;
                 default:System.out.println("WRONG CHOICE.TRY AGAIN");
	        }
        }
	}
}
	
