package com.tutorialspoint.Beans;


public class InintDestroyBean {
    private String message;
    private String roll;

    public void init() {
        this.setRoll("4541");
    }

    public void setMessage(String message){
        this.message  = message;
    }

    public void getMessage(){
        System.out.println("Your Message : " + message);
    }

    public String getRoll() {
        return roll;
    }

    public void setRoll(String roll) {
        this.roll = roll;
    }

    public void destroy() {
        System.out.println("Destroy");
    }
}
