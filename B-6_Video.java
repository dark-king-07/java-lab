package varun;

public class Video 
{
    String name;
    boolean status;
    double rating;
    public Video(String n , boolean s , double r)
    {
    	name = n;
    	status = s;
    	rating = r;
    }
    public void setName(String n)
    {
    	name = n;
    }
    public String getName()
    {
    	return name;
    }
    public void setStatus(boolean s)
    {
    	status = s;
    }
    public boolean getStatus()
    {
    	return status;
    }
    public void setRating(double r)
    {
    	rating = r;
    }
    public double getRating()
    {
    	return rating;
    }
}
