package com.login;

public class LoginSystem {
	private static LoginSystem instance;
    private String loggedInuser;
    
    private LoginSystem()
    {
       loggedInuser = null; 
    }
    public static LoginSystem getUser()
    {
      if(instance == null)
      {
        instance = new LoginSystem();
      }
      return instance;
    }
    
    public void login(String Username)
    {
      if(loggedInuser == null)
      {
        loggedInuser = Username;
        System.out.println("user logged in successfully ::::"+ Username);
      }
      else 
      {
        System.out.println("Another user is already logged in. Login failed ::"+ Username);
      }
    }
    
    public void logout()
    {
      if(loggedInuser != null)
      { 
        System.out.println("another user is ::"+ loggedInuser + " logout" );
        loggedInuser = null;
      }
      else
      {
        System.out.println("no one....can assign a user in the system");
      }
    }
}
