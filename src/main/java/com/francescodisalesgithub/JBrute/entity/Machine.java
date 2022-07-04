package com.francescodisalesgithub.JBrute.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "machine")
public class Machine
{
    @Column(name = "ip")
    @Id
    private String ip;
    @Column(name="hostname")
    private String hostname;
    @Column(name = "operative_system")
    private String operativeSystem;

    public Machine(String ip, String hostname, String operativeSystem) {
        this.ip = ip;
        this.hostname = hostname;
        this.operativeSystem = operativeSystem;
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
}
