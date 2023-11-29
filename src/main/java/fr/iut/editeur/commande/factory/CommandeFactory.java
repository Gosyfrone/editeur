package fr.iut.editeur.commande.factory;

import fr.iut.editeur.commande.*;
import fr.iut.editeur.document.Document;

/**
 * la classe permet de récupérer les commandes et les transmettre aux bonnes classes
 */
public class CommandeFactory {

    private static CommandeFactory instance;

    /**
     * renvoie l'instance de la classe CommandeFactory
     * @return
     */

    public static CommandeFactory getInstance() {
        if(instance == null) {
            instance = new CommandeFactory();
        }
        return instance;
    }


    /**
     * constructeur vide
     */
    private CommandeFactory() {}


    /**
     * C'est la méthode qui permet d'appeler les autres classes par rapport à la commande envoyé
     * @param name
     * @param document
     * @param parameters
     * @return
     */
    public Commande createCommand(String name, Document document, String[] parameters) {
        switch (name) {
            case "ajouter" : return new CommandeAjouter(document, parameters);
            default: return null;
            case "remplacer" : return new CommandeRemplacer(document, parameters);
            case "majuscules" : return new CommandeMajuscule(document, parameters);
            case "effacer" : return new CommandeEffacer(document,parameters);
            case "clear" : return new CommandeClear(document,parameters);
        }
    }

}
