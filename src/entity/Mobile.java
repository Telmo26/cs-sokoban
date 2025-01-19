package entity;

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("379930ca-84d2-4d24-a110-4793a4d391f9")
public class Mobile {
    public Mobile(Zone zone) {
		super();
		this.zone = zone;
	}

	@objid ("d29aefb0-2cb8-4184-b925-bb62a7bf837f")
    private Zone zone;

    @objid ("9d773730-73eb-4090-9b33-fca8d168c4e4")
    public void setZone(final Zone value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.zone = value;
    }

    @objid ("66317de2-7fe8-445e-b284-416ddaacd8fc")
    public Zone getZone() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.zone;
    }

}
