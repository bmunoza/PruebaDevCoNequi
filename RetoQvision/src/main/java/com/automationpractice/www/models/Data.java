package com.automationpractice.www.models;

public enum Data {


    FILE_NAME("Comprobante.png"),
    AFFAIR_EMAIL("Comprobante compra"),
    MESSAGE_SEND("Mensaje enviado.");

    private String information;

    private Data(String information){
        this.information = information;
    }

    public String getString(){
        return information;
    }
}
