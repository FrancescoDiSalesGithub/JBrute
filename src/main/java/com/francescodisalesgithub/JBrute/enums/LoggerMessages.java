package com.francescodisalesgithub.JBrute.enums;

public enum LoggerMessages
{

    USERNAME_NULL("Username is null");
    String message;
    private LoggerMessages(String message)
    {
        this.message = message;
    }

    @Override
    public String toString()
    {
        return this.message;
    }
}
