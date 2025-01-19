import java.util.ArrayList;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import entity.*;

@objid ("73803e6a-1478-4d09-845d-0a927981fae1")
public class TestSokoban {
    @objid ("85298fcc-30ba-4031-a722-4b3bb5720192")
    public static void main(String[] args) {
        ArrayList<Position> positions = new ArrayList<Position>();
        ArrayList<Place> places = new ArrayList<Place>();
        Entrepot entrepot = new Entrepot(places, positions);
        
        for (int i = 0 ; i < 5 ; i++) {
            for (int j = 0 ; j < 6 ; j++) {
                Position position = new Position(i, j, entrepot);
                Place place;
                
            	if (i == 0 || j == 0 || i == 4 || j == 5) {
            		Mur mur = new Mur(entrepot, position);
            		place = mur;
            	}
            	else if (i == 3 && j == 4) {
            		Zone zoneCible = new Zone(entrepot, position, true);
            		entrepot.setCible(zoneCible);
            		place = zoneCible;
            	}
            	else if (i == 2 && j == 1) {
            		Zone zone = new Zone(entrepot, position, false);
            		Gardien gardien = new Gardien(zone);
            		zone.setMobile(gardien);
            		place = zone;
            	}
            	else if (i == 2 && j == 3) {
            		Zone zone = new Zone(entrepot, position, false);
            		Caisse caisse = new Caisse(zone);
            		zone.setMobile(caisse);
            		place = zone;
            	}
            	else {
            		Zone zone = new Zone(entrepot, position, false);
            		place = zone;
            	}
            	
                position.setPlace(place);
                
                positions.add(position);
                places.add(place);
                
            }
        }
        System.out.print(entrepot);
    }

}
