package com.company;

import java.util.Locale;

public class Humen extends User{
    private String name;
    private String firstname;
    private String secondname;
    private String login;

    public Humen(String name , String firstname , String secondname , String login , String password) {
        super(login, password);
        this.name = name;
        this.firstname = firstname;
        this.secondname = secondname;
        this.login = login;
    }

    public  String getName()
    {
        return this.name;
    }
    public  String getFirstname()
    {
        return this.firstname;
    }

    public  String getSecondname()
    {
        return this.secondname;
    }

    public  void setName(String name)
    {
        this.name = name;
    }

    public  void setFirstname(String firstname)
    {
        this.firstname = firstname ;
    }

    public  void setSecondname(String secondname)
    {
        this.secondname = secondname;
    }
}
