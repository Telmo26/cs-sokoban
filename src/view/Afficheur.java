package view;

import com.modeliosoft.modelio.javadesigner.annotations.objid;

import control.Controleur;
import entity.Entrepot;

@objid ("9b055dfb-3cc1-42bb-bec3-9c0c782476d1")
public class Afficheur {
    public Afficheur(Controleur controleur, Entrepot entrepot) {
		this.controleur = controleur;
		this.entrepot = entrepot;
	}

	@objid ("0c8a467e-2652-4986-a956-d42b7d9b8b25")
    public Controleur controleur;

    @objid ("3e4eb5ae-4fd8-4c46-bfd4-47413076e8e1")
    public Entrepot entrepot;

}
