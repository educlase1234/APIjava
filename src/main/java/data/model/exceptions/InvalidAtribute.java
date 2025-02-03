package data.model.exceptions;



public class InvalidAtribute extends RuntimeException{
    private static final String DESCRIPTION ="Atributo inválido";
    public InvalidAtribute(Object object ){
        super(DESCRIPTION+" :"+object);
    }
}
