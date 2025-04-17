/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gestion.absence;

/**
 *
 * @author najar
 */
public class GestionAbsence {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
Connexion conn = new Connexion();
conn.maConnexion();
Authentification auth=new Authentification();
auth.setVisible(true);

        }
    
}
