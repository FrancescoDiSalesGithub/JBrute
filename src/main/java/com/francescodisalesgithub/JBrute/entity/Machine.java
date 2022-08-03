package com.francescodisalesgithub.JBrute.entity;


import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.Data;

@Entity(name = "machine")
@Table(schema = "brute",name="machine")
@Data
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

    
}
