package entity;

import java.util.ArrayList;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("49c1f2a7-bd06-42ac-997b-b7d158e6e432")
public class Entrepot {
    @objid ("7fbf93bb-f149-45e9-9213-f279cdedb40c")
    private int hauteur;

    @objid ("591476d9-3b52-42e4-94b8-c7dfbeea3a33")
    private int largeur;

    @objid ("cc303933-2cda-4e0a-83f5-c4ab317555d8")
    private ArrayList<Position> positions;

    @objid ("09046a80-457b-47c5-9e59-0c9becd30bcd")
    private ArrayList<Zone> cibles;

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
    public Entrepot(ArrayList<Zone> zones, ArrayList<Position> positions, ArrayList<Zone> cibles) {
        super();
        this.zones = zones;
        this.positions = positions;
        this.cibles = cibles;
    }

    @objid ("b380a2df-57e6-41ed-99f8-a1a95705246e")
    public ArrayList<Zone> getCibles() {
        return this.cibles;
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
                else if (this.cibles.contains(zone)) {
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

    @objid ("5e415808-09b9-4569-9897-1873c07fad10")
    public boolean jeuTerminé() {
        boolean termine = true;
        for (Zone cible : this.cibles) {
            if (!(cible.getMobile() instanceof Caisse))
                    termine = false;
        }
        return termine;
    }

    @objid ("990f885e-d3cd-455b-81ae-5afb0418e411")
    public ContenuZone contenuZone(Zone zone) {
        ContenuZone contenuZone;
        if (zone.isMur())
            contenuZone = ContenuZone.MUR;
        else if (this.cibles.contains(zone)) {
            if (zone.getMobile() instanceof Gardien)
                contenuZone = ContenuZone.GARDIEN;
            else if (zone.getMobile() instanceof Caisse)
                contenuZone = ContenuZone.CAISSE_SUR_CIBLE;
            else 
                contenuZone = ContenuZone.CIBLE;
        }
            
        else if (zone.getMobile() instanceof Caisse)
            contenuZone = ContenuZone.CAISSE;
        else if (zone.getMobile() instanceof Gardien)
            contenuZone = ContenuZone.GARDIEN;
        else 
            contenuZone = ContenuZone.ZONE_VIDE;
        return contenuZone;
    }

    @objid ("801b2914-2922-4091-b046-59b791f76fd2")
    public void setTaille(int hauteur, int largeur) {
        this.hauteur = hauteur;
        this.largeur = largeur;
    }

    @objid ("40f5f3d3-7b70-498a-883a-8b19c5040654")
    public int getHauteur() {
        return this.hauteur;
    }

    @objid ("97067450-8149-4ad2-a7aa-8f01cd2d716e")
    public int getLargeur() {
        return this.largeur;
    }

}
