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
    private Place place;

    @objid ("481a02f5-b705-46a4-a897-ab8e78ca62f3")
    public Position getPositionVoisine(final Direction direction) {
        // TODO Auto-generated return
        return null;
    }

    @objid ("3b861888-d5b6-4d2b-ad86-6b5110b0d097")
    public Position(int ligne, int colonne, Entrepot entrepot) {
        super();
        this.ligne = ligne;
        this.colonne = colonne;
        this.entrepot = entrepot;
    }

    @objid ("230e1052-5266-4ed2-8ba9-40b402838537")
    public void setPlace(Place place) {
        this.place = place;
    }

    @Override
	public boolean equals(Object obj) {
		if (obj instanceof Position) {
			Position positionObj = (Position) obj;
			return this.ligne == positionObj.ligne && this.colonne == positionObj.colonne;
		}	
		else
			return false;
			
	}

}
