package com.company;

public class UpFirstLetter extends Humen{
    private String upname;
    private String upfirstname;
    private String upsecondname;
    public UpFirstLetter(String name, String firstname, String secondname, String login, String password) {
        super(name, firstname, secondname, login, password);
        upname = name;
        upfirstname = firstname;
        upsecondname = secondname;
    }

    public String getUpname()
    {
        return upname.substring(0,1).toUpperCase() + upname.substring(1);
    }

    public String getUpfirstname()
    {
        return upfirstname.substring(0,1).toUpperCase() + upfirstname.substring(1);
    }

    public String getUpsecondname()
    {
        return upsecondname.substring(0,1).toUpperCase()  + upsecondname.substring(1);
    }

    public void setUpname(String upname)
    {
        this.upname = upname.substring(0,1).toUpperCase() + upname.substring(1);
    }

    public void setUpfirstname(String upfirstname)
    {
        this.upfirstname = upfirstname.substring(0,1).toUpperCase() + upfirstname.substring(1);
    }

    public void setUpsecondname(String upsecondname)
    {
        this.upsecondname = upsecondname.substring(0,1).toUpperCase()  + upsecondname.substring(1);
    }
}
