package com.francescodisalesgithub.JBrute.model;

import javax.persistence.Column;

public class Platform
{
    private String site;
    private String url;
    private String cookieValue;
    private String bodyRequest;
    private String wrongLoginMessage;

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
