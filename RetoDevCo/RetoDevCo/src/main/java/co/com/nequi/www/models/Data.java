package co.com.nequi.www.models;

public enum Data {


    AMOUNT_MONEY("10"),
    TRANSACTION_MESSAGE("Prueba"),
    TRANSACTION_MESSAGE_ERROR("Los envíos de tu cuenta Nequi a tí mismo no están permitidos.\n\nMejor intenta enviarle plata a un amigo.");

    private String information;

    Data(String information){
        this.information = information;
    }

    public String getData(){
        return information;
    }
}
