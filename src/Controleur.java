import com.modeliosoft.modelio.javadesigner.annotations.objid;
import entity.Direction;
import entity.Entrepot;
import entity.Gardien;

@objid ("50c7a659-361e-4f90-a5c2-f4f6e5de0888")
public class Controleur {
    public Controleur(Entrepot entrepot) {
		super();
		this.entrepot = entrepot;
	}

	@objid ("9c631f1f-ca7d-4a73-ac64-7e9b00e9d716")
    private Gardien gardien;

    @objid ("b0803f31-137b-4f06-b72a-fa3524264004")
    private Entrepot entrepot;

    @objid ("0c2325af-a4e2-4e26-90a6-a5f13c58e9ca")
    public void commande(final Direction direction) {
    	this.gardien.deplace(direction);
    }

	public void setGardien(Gardien gardien) {
		this.gardien = gardien;
	}

}
