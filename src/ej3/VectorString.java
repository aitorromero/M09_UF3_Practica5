package ej3;

import java.io.Serializable;

public class VectorString implements Serializable{
    String[] v;
    
    public VectorString(String[] v){
        this.v=v;
    }

    public String[] getV() {
        return v;
    }

    public void setV(String[] v) {
        this.v = v;
    }
    /*
    public String impirmit(){
        String r = "";
        for (String v : v) {
            v+=v;
        }
    }
    */
}
