package control;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import entity.ContenuZone;
import entity.Direction;

/**
 * Interface du controleur pour le jeu Sokoban
 * 
 * @author Dominique Marcadet
 * @version 1.2
 */
@objid ("1f885440-250b-4991-9f58-0ac048257ed4")
public interface IControleur {
    /**
     * Méthode appellée par l'IHM quand je joueur appuie sur l'une des
     * flèches du clavier.
     * @param direction direction de la progression demandée par le joueur
     */
    @objid ("ac41edc0-efb4-4e38-843f-7a6c5b19594a")
    void action(Direction direction);

    /**
     * Méthode appellée par l'IHM pour savoir si le jeu est terminé.
     * @return true si le jeu est terminé, false sinon
     */
    @objid ("3d29934a-5fc0-411e-af98-2e4ca9404f15")
    boolean jeuTerminé();

    /**
     * Méthode appellée par l'IHM pour connaître le nombre de
     * lignes de l'entrepot courant.
     * @return le nombre de lignes de l'entrepot
     */
    @objid ("59c1ffe0-60e0-4ce9-9ca4-1d7c6804baa6")
    int getNbLignes();

    /**
     * Méthode appellée par l'IHM pour connaître le nombre de
     * colonnes de l'entrepot courant.
     * @return le nombre de colonnes de l'entrepot
     */
    @objid ("3f5aa60a-5fd4-4744-9e7d-0b1b421a3b77")
    int getNbColonnes();

    /**
     * Méthode appellée par l'IHM pour connaître le contenu
     * d'une case de l'entrepot courant.
     * @param ligne numéro de la ligne de la case (de 0 à getNbLines() - 1)
     * @param colonne numéro de la colonne de la case (de 0 à getNbColumns() - 1)
     * @return le type de la case
     */
    @objid ("f0f66be3-4790-4c83-9613-e51c437c5fcf")
    ContenuZone getContenu(int ligne, int colonne);

}
