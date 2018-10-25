/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ultrasophisticatedapp;

import org.me.image.Image;
import java.io.IOException;
import java.io.PrintWriter;
import javax.xml.ws.WebServiceRef;
import org.me.image.Image;
import org.me.image.ImageWS_Service;
import java.util.ArrayList;
import java.lang.String;

/**
 *
 * @author aleix
 */
public class UltraSophisticatedApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       // java.lang.Object a = new Image(); 
       
        java.util.List<java.lang.Object> list = new ArrayList<>();
        list = listImages();
        Image a = new Image(); 
        a = (Image)list.get(1);
        System.out.println("La meva llista es: " + a);
        
    }

    private static java.util.List<java.lang.Object> listImages() {
        org.me.image.ImageWS_Service service = new org.me.image.ImageWS_Service();
        org.me.image.ImageWS port = service.getImageWSPort();
        return port.listImages();
    }

    private static int modifyImage(org.me.image.Image imatge) {
        org.me.image.ImageWS_Service service = new org.me.image.ImageWS_Service();
        org.me.image.ImageWS port = service.getImageWSPort();
        return port.modifyImage(imatge);
    }

    private static int registerImage(org.me.image.Image imatge) {
        org.me.image.ImageWS_Service service = new org.me.image.ImageWS_Service();
        org.me.image.ImageWS port = service.getImageWSPort();
        return port.registerImage(imatge);
    }

    private static java.util.List<java.lang.Object> searchByTitle(java.lang.String titol) {
        org.me.image.ImageWS_Service service = new org.me.image.ImageWS_Service();
        org.me.image.ImageWS port = service.getImageWSPort();
        return port.searchByTitle(titol);
    }

    private static java.util.List<java.lang.Object> searchbyAuthor(java.lang.String autor) {
        org.me.image.ImageWS_Service service = new org.me.image.ImageWS_Service();
        org.me.image.ImageWS port = service.getImageWSPort();
        return port.searchbyAuthor(autor);
    }

    private static java.util.List<java.lang.Object> searchbyCreaDate(java.lang.String datacreacio) {
        org.me.image.ImageWS_Service service = new org.me.image.ImageWS_Service();
        org.me.image.ImageWS port = service.getImageWSPort();
        return port.searchbyCreaDate(datacreacio);
    }

    private static Image searchbyId(int idImatge) {
        org.me.image.ImageWS_Service service = new org.me.image.ImageWS_Service();
        org.me.image.ImageWS port = service.getImageWSPort();
        return port.searchbyId(idImatge);
    }

    private static java.util.List<java.lang.Object> searchbyKeywords(java.lang.String paraulaclau) {
        org.me.image.ImageWS_Service service = new org.me.image.ImageWS_Service();
        org.me.image.ImageWS port = service.getImageWSPort();
        return port.searchbyKeywords(paraulaclau);
    }
    
}
