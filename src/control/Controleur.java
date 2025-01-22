package control;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import entity.ContenuZone;
import entity.Direction;
import entity.Entrepot;
import entity.Gardien;
import entity.Position;
import entity.Zone;

@objid ("50c7a659-361e-4f90-a5c2-f4f6e5de0888")
public class Controleur implements IControleur {
    @objid ("9c631f1f-ca7d-4a73-ac64-7e9b00e9d716")
    private Gardien gardien;

    @objid ("b0803f31-137b-4f06-b72a-fa3524264004")
    private Entrepot entrepot;

    @objid ("0c2325af-a4e2-4e26-90a6-a5f13c58e9ca")
    @Override
    public void action(Direction direction) {
        // TODO Auto-generated method stub
        this.gardien.deplace(direction);
    }

    @objid ("9b9107e2-5d61-4613-8dcc-217ba5020987")
    public Controleur(Entrepot entrepot) {
        super();
        this.entrepot = entrepot;
    }

    @objid ("37b7b260-87f0-4fea-9e2a-e829f1ce286c")
    public void setGardien(Gardien gardien) {
        this.gardien = gardien;
    }

    @objid ("271eedde-efc8-4a85-87f9-0d15fff02e70")
    @Override
    public boolean jeuTerminé() {
        return this.entrepot.jeuTerminé();
    }

    @objid ("fc2df654-2108-4fce-8b52-7f73d7bc1c59")
    @Override
    public int getNbLignes() {
        // TODO Auto-generated method stub
        return this.entrepot.getHauteur();
    }

    @objid ("2bcf2581-4fb5-40db-aafd-7b9115d86a6c")
    @Override
    public int getNbColonnes() {
        // TODO Auto-generated method stub
        return this.entrepot.getLargeur();
    }

    @objid ("a3c8c84c-23c6-406b-bdd0-b6054203b02e")
    @Override
    public ContenuZone getContenu(int ligne, int colonne) {
        Position positionZone = new Position(ligne, colonne);
        Zone zone = this.entrepot.getZone(positionZone);
        return this.entrepot.contenuZone(zone);
    }

}
