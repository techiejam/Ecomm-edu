package com.masai.model;


import lombok.*;

import javax.persistence.*;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;


@Data
@AllArgsConstructor
@NoArgsConstructor

@Entity
public class User {
	
	

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer userId;
    private String userName;
    private String userPassword;
    @OneToOne(cascade = CascadeType.ALL)
    private Address address;
    @OneToMany(cascade =CascadeType.ALL,mappedBy = "user")
    private List<Cart>carts=new ArrayList<>();
    @OneToMany(cascade = CascadeType.ALL,mappedBy = "user")
    private List<UserSession>userSessions=new ArrayList<>();
   
//    @OneToMany(cascade = CascadeType.ALL,mappedBy = "user")
//    private List<Orders> orders =new ArrayList<>();
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public List<Cart> getCarts() {
		return carts;
	}
	public void setCarts(List<Cart> carts) {
		this.carts = carts;
	}
	public List<UserSession> getUserSessions() {
		return userSessions;
	}
	public void setUserSessions(List<UserSession> userSessions) {
		this.userSessions = userSessions;
	}
	
	

}
