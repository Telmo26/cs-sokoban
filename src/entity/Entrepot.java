package entity;

import java.util.ArrayList;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("49c1f2a7-bd06-42ac-997b-b7d158e6e432")
public class Entrepot {
    @objid ("4cbf4c70-917b-4620-ae4f-93d7bf3e459c")
    private ArrayList<Place> places;

    @objid ("cc303933-2cda-4e0a-83f5-c4ab317555d8")
    private ArrayList<Position> positions;

    @objid ("09046a80-457b-47c5-9e59-0c9becd30bcd")
    private Zone cible;

    @objid ("6b9eea45-38b7-46e3-8282-4a6ccd2e8a8b")
    public Place getPlace(final Position position) {
        // TODO Auto-generated return
        return null;
    }

    @objid ("c92638d8-534a-4375-a604-bb342027e0e9")
    public Entrepot(ArrayList<Place> places, ArrayList<Position> positions) {
        super();
        this.places = places;
        this.positions = positions;
    }

	public Zone getCible() {
		return cible;
	}

	public void setCible(Zone cible) {
		this.cible = cible;
	}

	@Override
	public String toString() {
		String representationEntrepot = new String(); 
		for (int i = 0 ; i < 5 ; i++) {
			for (int j = 0 ; j < 6 ; j++) {
				Place place = this.places.get(i*6 + j);
				if (place instanceof Mur) {
					representationEntrepot += "#";
				}
				else if (place == this.cible) {
					representationEntrepot += ".";
				}
				else if (place instanceof Zone) {
					Zone zone = (Zone) place;
					if (zone.getMobile() instanceof Caisse)
						representationEntrepot += "$";
					else if (zone.getMobile() instanceof Gardien)
						representationEntrepot += "@";
					else 
						representationEntrepot += " ";
				}
			}
			representationEntrepot += "\n";
		}
		return representationEntrepot;
	}

}
