package fr.iut.editeur.commande;

import fr.iut.editeur.document.Document;

/**
 * La classe permet d'ajouter du texte à partir d'une commande.
 */

public class CommandeAjouter extends CommandeDocument {

    /**
     * @param document
     * @param parameters
     */
    public CommandeAjouter(Document document, String[] parameters) {
        super(document, parameters);
    }


    /**
     * La méthode permet d'executer la commande d'ajouter
     */
    @Override
    public void executer() {
        if(parameters.length < 2) {
            System.err.println("Format attendu : ajouter;texte");
            return;
        }
        String texte = parameters[1];
        this.document.ajouter(texte);
        super.executer();
    }

}
