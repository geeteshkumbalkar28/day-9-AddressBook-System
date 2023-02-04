
import java.util.*;
 
public class AddressBookMain
{
	public static void main(String arg[])
	{
		Scanner scann =new Scanner(System.in);
		AddressBookMain addressBook = new AddressBookMain();
		InsertInformation insertInfo = new InsertInformation();
		
					
		int choice=1;
		while(choice!=0)
		{
			System.out.println("");
			System.out.println("Enetr your choice");
			System.out.println("1 : Insert the Contacts");
			System.out.println("2 : Display all address in contact book");
			System.out.println("3 : Edit existing contact person using their name");
			System.out.println("4 : Delete existing contact person using their name");
			System.out.println("9 : Terminate the application");
			
			choice = scann.nextInt();
			String poss;
			switch(choice)
			{
				case 1 :	
					
					String pos = scann.nextLine();
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
					insertInfo.insertData(firstName,lastName,address,city,state,email,zip,phoneNumber);
				
				break;
				case 2:
					insertInfo.display();
					
				break;
				case 3:
				    poss = scann.nextLine();
					System.out.println("Enter the name of that person that you want to edit contact");
					String fName = scann.nextLine();
					//call to InsertInformation class 
					insertInfo.editContactPerson(fName);
				break;
				
				case 4:
					
				    poss = scann.nextLine();
					System.out.println("Enter the name of that person that you want to delete form contact");
					String firstN = scann.nextLine();
					
					insertInfo.deletePersonInformation(firstN);
					
					
				break;
				case 9:
					choice=0;
					System.out.println();
					System.out.println("----------------------Thank You For Using This Application---------------------");
				break;
				/*case 10:
				{
					System.out.println(insertInfo.ReturnObject());
					
					DeleteInformation obj1 = new DeleteInformation();
					obj1.printObject();
					break;
				}*/
				default:
				
					System.out.println();
					System.out.println("-------Invalid Choice-------");
					
					
			}
		}
		
		
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
class InsertInformation
{
	public Contacts head;
	
	InsertInformation()
	{
		head = null;
	}
	public void insertData(String firstName,String lastName,String address,String city,String state,String email,int zip,long phoneNumber)
	{
		Contacts contacts = new Contacts();
		
		contacts.setFirstName(firstName);
		contacts.setLastNames(lastName);
		contacts.setAddress(address);
		contacts.setCity(city);
		contacts.setState(state);
		contacts.setEmail(email);
		contacts.setZip(zip);
		contacts.setPhoneNumber(phoneNumber);
		
		if(head == null)
		{
			head = contacts;
		}
		else
		{
			Contacts temp = head;
			while(temp.next != null)
			{
				temp=temp.next;
			}
			temp.next = contacts;
			
		}
	}/*
	public Contacts ReturnObject()
	{
		return head;
	}*/
	public void display()
	{
		Contacts temp = head;
		int counter = 0;
		System.out.println("-------------------Display Contacts----------------------");
		System.out.println();
		while(temp != null)
		{
			++counter;
			System.out.println("-- Display "+counter+" Person in Address Book----------");
			System.out.println(" First name :"+temp.getFirstName());
			System.out.println(" Last name  :"+temp.getLastNames());
			System.out.println(" Address    :"+temp.getAddress());
			System.out.println(" City       :"+temp.getCity());
			System.out.println(" State      :"+temp.getState());
			System.out.println(" Email ID   :"+temp.getEmail());
			System.out.println(" Zip        :"+temp.getZip());
			System.out.println(" Phone no   :"+temp.getPhoneNumber());
			System.out.println();
			
			temp=temp.next;
		}
		//System.out.println("--------------------------------head value--- :"+head);
	}
	
	public void editContactPerson(String name)
	{
		Contacts temp = head;
		Scanner scan = new Scanner(System.in);
		boolean checkConditionGoneToLoop=false;
		while(temp != null)
		{
			if((temp.getFirstName()).equals(name))
			{
				
				System.out.println("Enter the first name");
				String firstName = scan.nextLine();
				temp.setFirstName(firstName);
				
				System.out.println("Enter the last name");
				String lastName = scan.nextLine();
				temp.setLastNames(lastName);
				
				System.out.println("Enter the address");
				String address = scan.nextLine();
				temp.setAddress(address);
			
			
				System.out.println("Enter the city");
				String city = scan.nextLine();
				temp.setCity(city);
				
				System.out.println("Enter the state");
				String state = scan.nextLine();
				temp.setState(state);
				
				System.out.println("Enter the email");
				String email = scan.nextLine();
				temp.setEmail(email);
				
				System.out.println("Enter the zip");
				int zip = scan.nextInt();
				temp.setZip(zip);
				
				System.out.println("Enter the phone number");
				long phoneNumber = scan.nextLong();
				temp.setPhoneNumber(phoneNumber);
				
				checkConditionGoneToLoop = true;
				break;
			}
			
			temp = temp.next;
		}
		if(checkConditionGoneToLoop == false)
		{
			System.out.println("-----------------------------------------------------");
			System.out.println("There is no person exist in the address book");
			System.out.println("-----------------------------------------------------");
			
		}
	}
	public int checkPosition(String name)
	{
		
		Contacts temp = head;
		Scanner scan = new Scanner(System.in);
		boolean checkConditionGoneToLoop=false;
		int checkPersonPosition=0;
		while(temp != null)
		{
			++checkPersonPosition;
			if((temp.getFirstName()).equals(name))
			{
				
				checkConditionGoneToLoop=true;
				break;
			}
			
			temp = temp.next;
		}
		if(checkConditionGoneToLoop == false)
		{
			System.out.println("-----------------------------------------------------");
			System.out.println("There is no person exist in the address book");
			System.out.println("-----------------------------------------------------");
			
			return 0;
		}
		return checkPersonPosition;
	}
	public int countTotalContacts()
	{
		Contacts temp = head;
		int checkPersonPosition=0;
		while(temp != null)
		{
			++checkPersonPosition;
			temp = temp.next;
		}
		return checkPersonPosition;
		
	}
	///////////////////////////delete///////////////////////////////
	public void deletePersonInformation(String name)
	{
		Contacts temp = head;
		 
		int personPositionUsingName = checkPosition(name);
		int totalContacts = countTotalContacts();
		
		if((personPositionUsingName == 0) || (personPositionUsingName < 1))
		{
			return;
		}
		if(personPositionUsingName == 1)
		{
			
			if(totalContacts == 1)
			{
				head = null;
			}
			else 
			{
				head = temp.next; 
			}
			
			System.out.println("-----------------------------------------------------------------------------");
			System.out.println("Contact "+personPositionUsingName+" has deleted successfully");
			System.out.println("-----------------------------------------------------------------------------");
		}
		else if(personPositionUsingName == totalContacts)
		{
			while(temp.next.next != null)
			{
				temp = temp.next;
			}
			temp.next  = null;
			
			System.out.println("-----------------------------------------------------------------------------");
			System.out.println("Contact "+personPositionUsingName+" has deleted successfully");
			System.out.println("-----------------------------------------------------------------------------");
		}
		else 
		{
			
			for(int i = 1; i < personPositionUsingName-1;i++)
			{
				temp = temp.next;
			}
			temp.next = temp.next.next;
			System.out.println();
			System.out.println("-----------------------------------------------------------------------------");
			System.out.println("Contact "+personPositionUsingName+" has deleted successfully");
			System.out.println("-----------------------------------------------------------------------------");
	
		}
	}

	
}
/*
class DeleteInformation extends InsertInformation
{
		DeleteInformation obj = new DeleteInformation();
		public void printObject()
		{
			
		System.out.println(obj.ReturnObject());
		}
	
	
}*/