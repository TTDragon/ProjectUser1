package com.company;

public class AuthirizationChecker extends User {
    private String newpassword;
    private String nowpassword;
    private String password;
    private Boolean result;

    public AuthirizationChecker(String login, String password) {
        super(login, password);
        nowpassword = password;
    }
    public void setPassword(String password)
    {
        this.password = password;
        newpassword = password;
    }

    public String getNowPassword()
    {
        return nowpassword;
    }

    public String getNewPassword()
    {
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

    public boolean getResultCompare()
    {
        return result;
    }

}
