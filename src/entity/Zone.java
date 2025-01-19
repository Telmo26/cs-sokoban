package entity;

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("7cc074be-3948-4b69-8875-83f29c2eb68c")
public class Zone extends Place {
    @objid ("49733f1c-edd2-4609-a733-d109ac13022b")
    private boolean estCible;

    @objid ("66ab7245-863c-4c8d-bc06-e0a9fe0f9de1")
    private Mobile mobile;

    @objid ("7da25827-9fd7-40fa-ad66-f479cfdf158b")
    public void resetMobile(Mobile mobile) {
        this.mobile = null;
    }

    @objid ("af289464-45ad-41c5-8ba8-5882b17da380")
    public Mobile getMobile() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.mobile;
    }

    @objid ("55b04e7c-5b44-41a4-bccc-6382d0985d44")
    public void setMobile(final Mobile value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.mobile = value;
    }

    @objid ("c6acd01a-eac6-4aac-8947-e13259ee0b2a")
    public Zone(Entrepot entrepot, Position position, boolean estCible) {
        super(entrepot, position);
        this.estCible = estCible;
    }

}
