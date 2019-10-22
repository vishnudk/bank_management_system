import java.io.Serializable;

class Bank implements Serializable{

    private String FirstName, LastName, FatherName, MotherName, HouseName,dob, Password;

    Number phno;


    public Bank(String firstname, String lastname, String fathername, String mothername, String houseName, String dob, Number phno){
        this.FirstName = firstname;
        this.LastName = lastname;
        this.FatherName = fathername;
        this.MotherName = mothername;
        this.HouseName = houseName;
        this.dob = dob;
        this.phno = phno;
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

    public void setPhno(Number no)
    {
        this.phno = no;
    }

    public Number getPhno()
    {
        return phno;
    }

    public void setPassword(String name)
    {
        this.Password = name;
    }


}
