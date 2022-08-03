package com.francescodisalesgithub.JBrute.model;

import lombok.Data;

@Data
public class Platform
{
    private String site;
    private String url;
    private String cookieValue;
    private String bodyRequest;
    private String wrongLoginMessage;

}
