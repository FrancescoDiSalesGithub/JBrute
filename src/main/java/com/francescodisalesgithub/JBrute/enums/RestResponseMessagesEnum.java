package com.francescodisalesgithub.JBrute.enums;

public enum RestResponseMessagesEnum
{
    USER_NOT_INSERTED("Utente non inserito"),
    USER_NOT_FOUND("Utente non trovato");
    
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
