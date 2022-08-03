package com.francescodisalesgithub.JBrute.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity(name = "platforms")
@Table(schema = "brute",name="platforms")
@Data
public class Platform
{


    @Column(name = "site")
    @Id
    private String site;
    @Column(name = "url")
    private String url;
    @Column(name="cookie_value")
    private String cookieValue;
    @Column(name = "body_request")
    private String bodyRequest;
    @Column(name = "wrong_login_message")
    private String wrongLoginMessage;

    public Platform()
    {

    }

    public Platform(String site, String url, String cookieValue, String bodyRequest, String wrongLoginMessage) {
        this.site = site;
        this.url = url;
        this.cookieValue = cookieValue;
        this.bodyRequest = bodyRequest;
        this.wrongLoginMessage = wrongLoginMessage;
    }

 
}
