package com.francescodisalesgithub.JBrute.entity;


import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity(name = "machine")
@Table(schema = "brute",name="machine")
public class Machine
{
    @Column(name = "ip")
    @Id
    private String ip;
    @Column(name="hostname")
    private String hostname;
    @Column(name = "operative_system")
    private String operativeSystem;

    @ManyToMany(targetEntity=User.class)
    private Set<User> users = new HashSet<User>();
    
    public Machine(String ip, String hostname, String operativeSystem,Set<User> users) {
        this.ip = ip;
        this.hostname = hostname;
        this.operativeSystem = operativeSystem;
        this.users = users;
    }

    public Machine()
    {

    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getHostname() {
        return hostname;
    }

    public void setHostname(String hostname) {
        this.hostname = hostname;
    }

    public String getOperativeSystem() {
        return operativeSystem;
    }

    public void setOperativeSystem(String operativeSystem) {
        this.operativeSystem = operativeSystem;
    }

	public Set<User> getUsers() {
		return users;
	}

	public void setUsers(Set<User> users) {
		this.users = users;
	}
    
    
}
