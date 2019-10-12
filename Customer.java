package aaa;

public class Customer
{
	private int userid;
	private String password;
	private String email;
	private String contact;
	
	public Customer() 
			{
				super();
			}
	public Customer(int userid, String password, String email, String contact)
	{
		super();
		this.userid = userid;
		this.password = password;
		this.email = email;
		this.contact = contact;
		
	}
	public int getUserid()
	{
		return userid;
	}
	public void setUserid(int userid) 
	{
		this.userid = userid;
	}
	public String getPassword()
	{
		return password;
	}
	public void setPassword(String password) 
	{
		this.password = password;
	}
	public String getEmail() 
	{
		return email;
	}
	public void setEmail(String email)
	{
		this.email = email;
	}
	public String getContact()
	{
		return contact;
	}
	public void setContact(String contact)
	{
		this.contact = contact;
	}
	@Override
	public String toString() {
		return "Customer [userid=" + userid + ", password=" + password + ", email=" + email + ", contact=" + contact
				+ "]";
	}
	
	
}
