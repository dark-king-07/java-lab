package varun;
import java.util.*;
public class VideoMethods 
{
    ArrayList<Video> MovieList = new ArrayList<Video>();
	public void AddMovies()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter movie name");
		String n = sc.nextLine();
		sc.nextLine();
		System.out.println("Enter movie status");
		boolean s = sc.nextBoolean();
		System.out.println("Enter movie rating");
		double r = sc.nextDouble();
		Video v = new Video(n,s,r);
		MovieList.add(v);
		System.out.println("Library initialized");
	}
	public void DisplayAll()
	{
		if(MovieList.isEmpty())
		  System.out.println("No movies");
		else
		{
			for(Video m : MovieList)
			{
				System.out.println("Name:"+m.getName() +"\nStatus:"+m.getStatus() +"\nRating:"+m.getRating() +"\n");
			}
		}
	}
	public void RentOut()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter movie name");
		String n = sc.nextLine();
		if(MovieList.isEmpty())
			  System.out.println("No movies");
		else
		 {
			for(Video v : MovieList)
			{
		      if(v.getName().equalsIgnoreCase(n))
			   {
						   v.setStatus(false);
						   System.out.println("Movie successfully rented out");
						   return;
			    }
			 }
				System.out.println("No such movie");
				return;
		  }
	}
	public void CollectIn()
	{
		Scanner sc = new Scanner(System.in);
		boolean flag = false;
		System.out.println("Enter movie name");
		String n = sc.nextLine();
		sc.nextLine();
		System.out.println("Enter movie rating");
		double ra = sc.nextDouble();
		if(MovieList.isEmpty())
			  System.out.println("No movies");
		else
		 {
		    for(Video v : MovieList)
			{
		    	if(v.getName().equalsIgnoreCase(n))
			    {
				  v.setStatus(true);
				  flag=true;
				  v.setRating(Math.round((v.getRating()+ra)/2));
				  System.out.println("Movie successfully returned");
				  return;
			     }
		     }
		  }
		if(!flag)
		 {
			 System.out.println("Movie is unavailable");
		 }
	}
}
