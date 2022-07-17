package com.francescodisalesgithub.JBrute.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "platforms")
@Table(schema = "brute",name="platforms")
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

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getCookieValue() {
        return cookieValue;
    }

    public void setCookieValue(String cookieValue) {
        this.cookieValue = cookieValue;
    }

    public String getBodyRequest() {
        return bodyRequest;
    }

    public void setBodyRequest(String bodyRequest) {
        this.bodyRequest = bodyRequest;
    }

    public String getWrongLoginMessage() {
        return wrongLoginMessage;
    }

    public void setWrongLoginMessage(String wrongLoginMessage) {
        this.wrongLoginMessage = wrongLoginMessage;
    }
}
