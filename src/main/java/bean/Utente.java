package bean;

import java.util.*;

/**
 * 
 */
public class Utente {

    /**
     * Default constructor
     */
    public Utente() {
    }

    /**
     * 
     */
    public String nome;

    /**
     * 
     */
    public String cognome;

    /**
     * 
     */
    public String biografia;

    /**
     * 
     */
    public String geolocalizzazione;

    /**
     * 
     */
    public Set<String> elencoSocials;

    /**
     * 
     */
    public String fotoProfilo;

    /**
     * 
     */
    public Recensione elencoRecensioni;

    /**
     * 
     */
    public Set<Asta> elencoAste;

    /**
     * 
     */
    public boolean isAmministratore;

    /**
     * 
     */
    private String email;

    /**
     * 
     */
    private String password;

    /**
     * 
     */
    public Notifica elencoNotifiche;



    /**
     * 
     */
    public Set<Asta> partecipa;









    /**
     * 
     */
    public Recensione scrive;






    /**
     * 
     */
    public void creaNuovaAsta() {
        // TODO implement here
    }

    /**
     * 
     */
    public void scriviRecensione() {
        // TODO implement here
    }

    /**
     * 
     */
    public void modificaProfiloUtente() {
        // TODO implement here
    }

    
    public void effettuareLogin() {
        // TODO implement here
    }

    /**
     * 
     */
    public void visualizzaProfilo() {
        // TODO implement here
    }

    /**
     * 
     */
    public void calcolaMediaStelle() {
        // TODO implement here
    }

}