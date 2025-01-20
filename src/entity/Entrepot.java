package entity;

import java.util.ArrayList;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("49c1f2a7-bd06-42ac-997b-b7d158e6e432")
public class Entrepot {
    @objid ("cc303933-2cda-4e0a-83f5-c4ab317555d8")
    private ArrayList<Position> positions;

    @objid ("09046a80-457b-47c5-9e59-0c9becd30bcd")
    private Zone cible;

    @objid ("4cbf4c70-917b-4620-ae4f-93d7bf3e459c")
    private ArrayList<Zone> zones;

    @objid ("6b9eea45-38b7-46e3-8282-4a6ccd2e8a8b")
    public Zone getZone(final Position position) {
        for (Zone zone : this.zones) {
            if (zone.getPosition().equals(position)) {
                return zone;
            }
        }
        return null;
    }

    @objid ("c92638d8-534a-4375-a604-bb342027e0e9")
    public Entrepot(ArrayList<Zone> zones, ArrayList<Position> positions) {
        super();
        this.zones = zones;
        this.positions = positions;
    }

    @objid ("b380a2df-57e6-41ed-99f8-a1a95705246e")
    public Zone getCible() {
        return cible;
    }

    @objid ("08e4213d-c589-4d90-83e9-d16b9a1beedb")
    public void setCible(Zone cible) {
        this.cible = cible;
    }

    @objid ("1f631f04-8c89-4f99-b07d-bfee1a9476fb")
    @Override
    public String toString() {
        String representationEntrepot = new String(); 
        for (int i = 0 ; i < 5 ; i++) {
            for (int j = 0 ; j < 6 ; j++) {
                Zone zone = this.zones.get(i*6 + j);
                if (zone.isMur())
                    representationEntrepot += "#";
                else if (zone == this.cible) {
                    if (zone.getMobile() instanceof Gardien)
                        representationEntrepot += "+";
                    else if (zone.getMobile() instanceof Caisse)
                        representationEntrepot += "*";
                    else 
                        representationEntrepot += ".";
                }
                    
                else if (zone.getMobile() instanceof Caisse)
                        representationEntrepot += "$";
                else if (zone.getMobile() instanceof Gardien)
                    representationEntrepot += "@";
                else 
                    representationEntrepot += " ";
            }
            representationEntrepot += "\n";
        }
        return representationEntrepot;
    }

}
