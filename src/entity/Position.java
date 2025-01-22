package entity;

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("02a5e82d-f825-4b4d-a6fa-1d34cc81f39b")
public class Position {
    @objid ("25975d0b-cb8c-403c-bb24-0c54a7600624")
    private int ligne;

    @objid ("7ee7e031-12f7-4456-97d6-a708cd7e59a7")
    private int colonne;

    @objid ("59dbc0f2-eca4-4964-a99a-600bc8fe117b")
    private Entrepot entrepot;

    @objid ("0e0aa95e-f5c2-400b-b071-565d8cc6b31d")
    private Zone zone;

    @objid ("481a02f5-b705-46a4-a897-ab8e78ca62f3")
    public Position getPositionVoisine(final Direction direction) {
        int nouvelleLigne;
        int nouvelleColonne;
        switch (direction) {
            case DROITE :
                nouvelleLigne = this.ligne;
                nouvelleColonne = this.colonne + 1;
                break;
            case GAUCHE :
                nouvelleLigne = this.ligne;
                nouvelleColonne = this.colonne - 1;
                break;
            case HAUT :
                nouvelleLigne = this.ligne - 1;
                nouvelleColonne = this.colonne;
                break;
            case BAS :
                nouvelleLigne = this.ligne + 1;
                nouvelleColonne = this.colonne;
                break;
            default:
                nouvelleLigne = this.ligne;
                nouvelleColonne = this.colonne;
                break;
        }
        Position newPosition = new Position(nouvelleLigne, nouvelleColonne, this.entrepot);
        return newPosition;
    }

    @objid ("3b861888-d5b6-4d2b-ad86-6b5110b0d097")
    public Position(int ligne, int colonne, Entrepot entrepot) {
        super();
        this.ligne = ligne;
        this.colonne = colonne;
        this.entrepot = entrepot;
    }

    @objid ("230e1052-5266-4ed2-8ba9-40b402838537")
    public void setZone(final Zone zone) {
        this.zone = zone;
    }

    @objid ("c06e5f6e-286e-49fe-9835-ad8b3916b56e")
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Position) {
            Position positionObj = (Position) obj;
            return this.ligne == positionObj.ligne && this.colonne == positionObj.colonne;
        }    
        else
            return false;
    }

    @objid ("657c2fba-94ef-40d4-b2f5-a4b0440bc9ef")
    @Override
    public String toString() {
        return "Position [ligne=" + ligne + ", colonne=" + colonne + ", zone=" + zone + "]\n";
    }

    @objid ("c32b4fda-add0-4005-8f3e-7ebf1a094df2")
    public Position(int ligne, int colonne) {
        this.colonne = colonne;
        this.ligne = ligne;
    }

}
