package entity;

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("873155c4-af53-4ad7-bbfc-4bc5747bb9d4")
public class Mur extends Place {
    @objid ("1ffb37dc-4503-4902-9d9a-729e4ae972f5")
    public Mur(Entrepot entrepot, Position position) {
        super(entrepot, position);
    }

}
