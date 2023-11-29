package fr.iut.editeur.commande;

import fr.iut.editeur.document.Document;

/**
 * La classe permet de clear le texte dans le document
 */
public class CommandeClear extends CommandeDocument {

    /**
     * C'est le contructeur, il utilise les attributs de son parent ( super )
     * @param document
     * @param parameters
     */
    public CommandeClear(Document document, String[] parameters) {
        super(document, parameters);
    }


    /**
     * la méthode permet d'executer la commande clear
     */
    @Override
    public void executer() {
        if(parameters.length < 1 ) {
            System.err.println("Format attendu : clear");
            return;
        }
        this.document.clear();
        super.executer();
    }
}
