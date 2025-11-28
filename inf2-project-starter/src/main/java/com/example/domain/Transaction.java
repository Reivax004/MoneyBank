package com.example.domain;

import java.sql.Date;

import jakarta.persistence.*;

@Entity
@Table(name = "transactions")
public class Transaction {

    @Id @GeneratedValue
    private Long id;    

    private Double price;
    private Date date;
    private String  currency;
    private Type type;

    public Transaction() {}

    public User(String price, Date date, String currency, Type type) {
        this.price = price;
        this.date = date;
        this.currency = currency;
        this.type = type;
    }

    public Long getId() { return id; }
    public String getPrice() { return price; }
    public String getDate() { return date; }
    public String getCurrency() { return currency; }
    public Date getType() { return type; }
    
    public void setLastName(String lastname) { this.lastname = lastname; }
    public void setFirstName(String firstname) { this.firstname = firstname; }
    public void setEmail(String email) { this.email = email; }
    public void setPassword(String password) { this.password = password;}
}
