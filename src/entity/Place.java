package entity;

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("2109e161-c3e2-4df0-9f72-3f4e5f4914bd")
public class Place {
    @objid ("d5156bc6-eda6-483b-8391-8d208b96c7cd")
    private Entrepot entrepot;

    @objid ("c3010bbb-98c8-4772-adb8-736736425478")
    private Position position;

    @objid ("b7954af0-69a2-4827-8ba6-5370387c9906")
    public Place getPlaceVoisine(final Direction direction) {
        // TODO Auto-generated return
        return null;
    }

    @objid ("c3a1c679-3052-4896-b66a-8d194cc5ddf7")
    public boolean accepte(final Mobile mobile) {
        // TODO Auto-generated return
        return false;
    }

    @objid ("ce1ba3c7-2d40-4e95-9524-9977cc1ee31b")
    public Place(Entrepot entrepot, Position position) {
        super();
        this.entrepot = entrepot;
        this.position = position;
    }

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Place) {
			Place placeObj = (Place) obj;
			return this.position == placeObj.position;
		}	
		else
			return false;
			
	}

}
