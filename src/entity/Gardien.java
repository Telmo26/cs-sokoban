package entity;

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("92a2744f-c3a6-4fb0-8110-e7f6307dcc47")
public class Gardien extends Mobile {
    public Gardien(Zone zone) {
		super(zone);
	}

	@objid ("739b10e3-5103-4ea0-88f7-cc0064bf239d")
    public void deplace(final Direction direction) {
    }

}
