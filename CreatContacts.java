
import java.util.*;
 
public class CreatContacts
{
	public static void main(String arg[])
	{
		Scanner scann =new Scanner(System.in);
		System.out.println("Enter the first name");
		String firstName = scann.nextLine();
		System.out.println("Enter the last name");
		String lastName = scann.nextLine();
		System.out.println("Enter the address");
		String address = scann.nextLine();
		System.out.println("Enter the city");
		String city = scann.nextLine();
		System.out.println("Enter the state");
		String state = scann.nextLine();
		System.out.println("Enter the email");
		String email = scann.nextLine();
		System.out.println("Enter the zip");
		int zip = scann.nextInt();
		System.out.println("Enter the phone number");
		long phoneNumber = scann.nextLong();
		
	}
}
class Contacts
{
	
	private String firstName;
	private	String lastnames; 
	private	String address;
	private	String city; 
	private	String state;
	private	int zip;
	private	long phoneNumber;
	private	String email;
	public Contacts next;
	/////////////////////////////////////////////Set methods//////////////////////////////////
	
 	public void setFirstName(String a)
	{
		this.firstName = a;
	}
	public void setLastNames(String lastnames)
	{
		this.lastnames = lastnames;
	}
	public void setAddress(String address)
	{
		this.address = address;
	}
	public void setCity(String city)
	{
		this.city = city;
	}
	public void setState(String state)
	{
		this.state = state;
	}
	public void setZip(int zip)
	{
		this.zip = zip;
	}
	public void setPhoneNumber(long phoneNumber)
	{
		this.phoneNumber = phoneNumber;
	}
	public void setEmail(String email)
	{
		this.email = email;
	}
	/////////////////////////////////////////////get methods//////////////////////////////////
	public String getFirstName()
	{
		
		return firstName;
	}
	public String getLastNames()
	{
		return lastnames;
	}
	public String getAddress()
	{
		return address;
	}
	public String getCity()
	{
		return city;
	}
	public String getState()
	{
		return state;
	}
	public int getZip()
	{
		return zip;
	}
	public long getPhoneNumber()
	{
		return phoneNumber;
	}
	public String getEmail()
	{
		return email;
	}
}
