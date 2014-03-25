/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package domain;

/**
 *
 * @author Phill
 */
public class Guest
  {
    private String firstname, lastname, email, address, country;
    private int version, phonenumber;
    private long id;
    
    public Guest(String firstname, String lastname, int phonenumber)
      {
        this.firstname = firstname;
        this.lastname = lastname;
        this.phonenumber = phonenumber;
      }

    public String getEmail()
      {
        return email;
      }

    public String getFirstname()
      {
        return firstname;
      }

    public String getLastname()
      {
        return lastname;
      }

    public void setEmail(String email)
      {
        this.email = email;
      }

    public String getAddress()
      {
        return address;
      }

    public void setAddress(String address)
      {
        this.address = address;
      }

    public String getCountry()
      {
        return country;
      }

    public void setCountry(String country)
      {
        this.country = country;
      }

    public Long getId()
      {
        return id;
      }

    public void setId(long id)
      {
        this.id = id;
      }

    public int getVersion()
      {
        return version;
      }

    public void setVersion(int version)
      {
        this.version = version;
      }

    public int getPhonenumber()
      {
        return phonenumber;
      }

    public void setPhonenumber(int phonenumber)
      {
        this.phonenumber = phonenumber;
      }
    
    
  }

