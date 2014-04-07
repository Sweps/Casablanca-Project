/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package domain;

import dataSource.DBFacade;

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
        if (email != null && !(email.isEmpty()))
        {
          this.email = email;
        }
      }

    public String getAddress()
      {
        return address;
      }

    public void setAddress(String address)
      {
        if (address != null && !(address.isEmpty()))
          {
            this.address = address;
          }
      }

    public String getCountry()
      {
        return country;
      }

    public void setCountry(String country)
      {
        if (country != null && !(country.isEmpty()) )
          {
               this.country = country;
          }
      }

    public long getId()
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

    public void setPhonenumber(int i) {
        this.phonenumber = i;
      }
    
    
    
  }

