package com.francescodisalesgithub.JBrute.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "dictionary")
public class Dictionary
{
    @Id
    @Column(name = "mnemonic_name")
    private String mnemonicName;
    @Column(name = "name")
    private String name;

    public Dictionary()
    {

    }

    public Dictionary(String mnemonicName, String name)
    {
        this.mnemonicName = mnemonicName;
        this.name = name;
    }


    public String getMnemonicName() {
        return mnemonicName;
    }

    public void setMnemonicName(String mnemonicName) {
        this.mnemonicName = mnemonicName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
