package entity;

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("379930ca-84d2-4d24-a110-4793a4d391f9")
public class Mobile {
    @objid ("d29aefb0-2cb8-4184-b925-bb62a7bf837f")
    protected Zone zone;

    @objid ("9d773730-73eb-4090-9b33-fca8d168c4e4")
    public void setZone(final Zone zone) {
        this.zone = zone;
    }

    @objid ("66317de2-7fe8-445e-b284-416ddaacd8fc")
    public Zone getZone() {
        return this.zone;
    }

    @objid ("06934700-c395-419a-be4d-035ed8e68653")
    public Mobile(Zone zone) {
        super();
        this.zone = zone;
    }

}
