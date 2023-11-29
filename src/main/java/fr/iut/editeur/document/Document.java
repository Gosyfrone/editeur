package fr.iut.editeur.document;

/**
 * La classe document représetente le texte rentré par l'utilisateur
 * c'est aussi ici qu'il y a les différentes commandes pour gérer le texte
 */
public class Document {

    private String texte;

    /**
     * le contruteur initialise le texte du document ( texte vide )
     */
    public Document() {
        this.texte = "";
    }

    /**
     * getteur du texte
     * @return
     */
    public String getTexte() {
        return texte;
    }

    /**
     * setteur texte
     * @param texte
     */
    public void setTexte(String texte) {
        this.texte = texte;
    }

    /**
     * ajoute du texte à la fin
     * @param texte
     */
    public void ajouter(String texte) {
        this.texte += texte;
    }


    /**
     * affiche le texte
     * @return
     */
    @Override
    public String toString() {
        return this.texte;
    }


    /**
     * remplace le texte entre start et end par remplacement ( qui est du texte )
     * @param start
     * @param end
     * @param remplacement
     */

    public void remplacer(int start, int end, String remplacement) {
        String leftPart = texte.substring(0, start);
        String rightPart = texte.substring(end);
        texte = leftPart + remplacement + rightPart;
    }


    /**
     * met en majuscule le texte entre start et end
     * @param start
     * @param end
     */
    public void majuscules(int start, int end) {
        String part = texte.substring(start,end);
        part = part.toUpperCase();
        remplacer(start,end,part);
    }


    /**
     * efface le texte entre start et end
     * @param start
     * @param end
     */
    public void effacer(int start, int end) {
        remplacer(start,end,"");
    }

    /**
     * enleve tout le texte
     */
    public void clear(){texte = "";}
}
