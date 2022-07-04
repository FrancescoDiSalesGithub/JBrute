package com.francescodisalesgithub.JBrute.enums;

public enum RestResponseMessagesEnum
{
    ERROR_DATABASE("Error on db"),
    USER_NOT_INSERTED("User not inserted in the db"),
    USER_NOT_FOUND("User not found");

    String message;
    private RestResponseMessagesEnum(String message)
    {
        this.message = message;
    }

    @Override
    public String toString()
    {
        return this.message;
    }

}
