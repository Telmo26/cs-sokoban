package entity;

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("92a2744f-c3a6-4fb0-8110-e7f6307dcc47")
public class Gardien extends Mobile {
    @objid ("739b10e3-5103-4ea0-88f7-cc0064bf239d")
    public void deplace(final Direction direction) {
        Zone zoneVoisine = this.zone.getZoneVoisine(direction);
        if (zoneVoisine.accepte(this)) {
            zoneVoisine.setMobile(this);
            this.zone.resetMobile();
            
            this.setZone(zoneVoisine);
            
            
            
        }
        else if (zoneVoisine.getMobile() instanceof Caisse) {
            Caisse caisse = (Caisse) zoneVoisine.getMobile();
            Zone zoneDeuxVoisin = zoneVoisine.getZoneVoisine(direction);
            if (zoneDeuxVoisin.accepte(caisse)) {
                zoneDeuxVoisin.setMobile(caisse);
                caisse.setZone(zoneDeuxVoisin);
                
                this.zone.resetMobile();  
                
                zoneVoisine.setMobile(this);
                this.setZone(zoneVoisine);
        
            }
        }
    }

    @objid ("0e3086ed-2b21-47b7-a07d-c3073cb257a4")
    public Gardien(Zone zone) {
        super(zone);
    }

}
