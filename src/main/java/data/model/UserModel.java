package data.model;

import data.model.exceptions.InvalidAtribute;

public class UserModel {
    private Integer id;
    private String email;
    private String name;
    private String surname;
    public UserModel(String email , String name , String surname){
        setEmail(email);
        this.name=name;
        this.surname=surname;
    }

    public void setEmail(String email) {
        if (email==null||!email.matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$")){
            throw new InvalidAtribute(email);
        }
        this.email=email;
    }


    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Integer getId() {
        return id;
    }

    @Override
    public String toString() {
        return "User "+getName()+" "+getSurname()+" email: "+getEmail();
    }
}
