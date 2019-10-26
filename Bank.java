package gasd;

import java.io.Serializable;

class Bank implements Serializable{

    private String FirstName, LastName, FatherName, MotherName, HouseName,dob, Password,Username,sex;

    String phno;

Bank()
{
	
}
    public Bank(String firstname, String lastname, String fathername, String mothername, String houseName, String dob, String phno,String UserName,String sex){
        this.FirstName = firstname;
        this.LastName = lastname;
        this.FatherName = fathername;
        this.MotherName = mothername;
        this.HouseName = houseName;
        this.dob = dob;
        this.phno = phno;
        this.sex=sex;
    }


    public String getFirstName()
    {
        return FirstName;
    }

    public void setFirstName(String name)
    {
        this.FirstName = name;
    }

    public String getLastName()
    {
        return LastName;
    }

    public void setLastName(String name)
    {
        this.LastName = name;
    }

    public String getFatherName()
    {
        return FatherName;
    }

    public void setFatherName(String name)
    {
        this.FatherName = name;
    }
    public String getMotherName()
    {
        return MotherName;
    }
    public void setMotherName(String name)
    {
        this.MotherName = name;
    }
    public String getHouseName()
    {
        return HouseName;
    }
    public void setHosueName(String name)
    {
        this.HouseName = name;

    }
    public void setDob(String name)
    {
        this.dob = name;
    }

    public String getDob()
    {
        return dob;
    }

    public void setPhno(String no)
    {
        this.phno = no;
    }

    public String getPhno()
    {
        return phno;
    }
public String getSex()
{
	return sex;
}
    public void setPassword(String name)
    {
        this.Password = name;
    }
    
    public String getPassword()
    {
    	return Password;
    }
    
    public void setusername(String name)
    {
    	this.Username = name;
    }
    
    public String getUsername()
    {
    	return Username;
    }
    
    


}