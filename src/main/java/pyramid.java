/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author amrad
 */
public class pyramid {
    private String pharaoh;
    private String modern_name;
    private String site;
    private double height;
    pyramid(String Pharaoh, String Modern_name, String site, double height){
        this.pharaoh=Pharaoh;
        this.modern_name=Modern_name;
        this.site=site;
        this.height=height;
    }
    public String getPharaoh() {
        return pharaoh;
    }
    public void setPharaoh(String pharaoh) {
        pharaoh = pharaoh;
    }
    public String getModern_name() {
        return modern_name;
    }
    public void setModern_name(String modern_name) {
        modern_name = modern_name;
    }
    public String getSite() {
        return site;
    }
    public void setSite(String site) {
        this.site = site;
    }
    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }
}