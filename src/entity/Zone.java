package entity;

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("7cc074be-3948-4b69-8875-83f29c2eb68c")
public class Zone {
    @objid ("49733f1c-edd2-4609-a733-d109ac13022b")
    private boolean cible;

    @objid ("ab52507f-3e22-4416-b024-7d811fa25db0")
    private boolean mur;

    @objid ("66ab7245-863c-4c8d-bc06-e0a9fe0f9de1")
    private Mobile mobile = null;

    @objid ("d5156bc6-eda6-483b-8391-8d208b96c7cd")
    private Entrepot entrepot;

    @objid ("c3010bbb-98c8-4772-adb8-736736425478")
    private Position position;

    @objid ("7da25827-9fd7-40fa-ad66-f479cfdf158b")
    public void resetMobile() {
        this.mobile = null;
    }

    @objid ("af289464-45ad-41c5-8ba8-5882b17da380")
    public Mobile getMobile() {
        return this.mobile;
    }

    @objid ("55b04e7c-5b44-41a4-bccc-6382d0985d44")
    public void setMobile(final Mobile value) {
        this.mobile = value;
    }

    @objid ("c6acd01a-eac6-4aac-8947-e13259ee0b2a")
    public Zone(Entrepot entrepot, Position position, boolean estCible, boolean estMur) {
        this.entrepot = entrepot;
        this.position = position;
        this.cible = estCible;
        this.mur = estMur;
    }

    @objid ("3f3069da-3b02-43d5-9670-5a03926edd95")
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Zone) {
            Zone zoneObj = (Zone) obj;
            return this.position == zoneObj.position;
        }    
        else
            return false;
    }

    @objid ("c3a1c679-3052-4896-b66a-8d194cc5ddf7")
    public boolean accepte(final Mobile mobile) {
        return !this.mur && this.mobile == null;
    }

    @objid ("b7954af0-69a2-4827-8ba6-5370387c9906")
    public Zone getZoneVoisine(final Direction direction) {
        Position positionVoisin = this.position.getPositionVoisine(direction);
        Zone zoneVoisine = this.entrepot.getZone(positionVoisin);
        return zoneVoisine;
    }

    @objid ("bc0abd6d-2968-4484-9bc5-1ecc5bcbd69f")
    public boolean isMur() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.mur;
    }

    @objid ("6b93133e-2c81-4dcb-ba26-f87c53e07007")
    public Position getPosition() {
        return position;
    }

}
