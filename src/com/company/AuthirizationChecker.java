package com.company;

public class AuthirizationChecker extends Humen{
    private String newpassword;
    private String nowpassword;
    private Boolean result;
    private String password;

    public AuthirizationChecker(String name, String firstname, String secondname, String login, String password) {
        super(name, firstname, secondname, login, password);
        this.nowpassword = password;
    }

    public String getNowPassword()
    {
        return nowpassword;
    }

    public void setPassword(String password)
    {
        this.password = password;
    }

    public String getNewPassword()
    {
       newpassword = password;
        return newpassword;
    }

    public void PasswordChecker(String newpassword, String nowpassword)
    {
        if (newpassword.equals(nowpassword))
        {
           this.result = true;
        }
        else
        {
            this.result = false;
        }
    }

    public boolean getResultChecker()
    {
      return result;
    }
}
