package com.company;
import static java.lang.System.out;

public class Model extends SiemensMobile {

    public String model;
    public Model(String model, Boolean connected, String dunno){
        super(dunno);
        this.model = model;
        this.Connected = connected;
    }
    @Override
    public void print() {
        out.println("Model: "+model+" Conected: "+Connected + " Dunno? : "+dunno);
    }
}
