import java.util.ArrayList;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import entity.*;

@objid ("73803e6a-1478-4d09-845d-0a927981fae1")
public class TestSokoban {
    @objid ("85298fcc-30ba-4031-a722-4b3bb5720192")
    public static void main(String[] args) {
        ArrayList<Position> positions = new ArrayList<Position>();
        ArrayList<Zone> zones = new ArrayList<Zone>();
        
        Entrepot entrepot = new Entrepot(zones, positions);
        
        Controleur controleur = new Controleur(entrepot);
        
        for (int i = 0 ; i < 5 ; i++) {
            for (int j = 0 ; j < 6 ; j++) {
                Position position = new Position(i, j, entrepot);
            	Zone zone;
                
                if (i == 0 || j == 0 || i == 4 || j == 5) {
                    zone = new Zone(entrepot, position, false, true);
                }
                else if (i == 3 && j == 4) {
                    zone = new Zone(entrepot, position, true, false);
                    entrepot.setCible(zone);
                }
                else if (i == 2 && j == 1) {
                    zone = new Zone(entrepot, position, false, false);
                    Gardien gardien = new Gardien(zone);
                    zone.setMobile(gardien);
                    controleur.setGardien(gardien);
                }
                else if (i == 2 && j == 3) {
                    zone = new Zone(entrepot, position, false, false);
                    Caisse caisse = new Caisse(zone);
                    zone.setMobile(caisse);
                }
                else {
                    zone = new Zone(entrepot, position, false, false);
                }
                position.setZone(zone);
                
                
                positions.add(position);
                zones.add(zone);
                
            }
        }
        System.out.println(entrepot);
        controleur.commande(Direction.DROITE);
        System.out.println(entrepot);
        controleur.commande(Direction.DROITE);
        System.out.println(entrepot);
        controleur.commande(Direction.HAUT);
        System.out.println(entrepot);
        controleur.commande(Direction.DROITE);
        System.out.println(entrepot);
        controleur.commande(Direction.BAS);
        System.out.println(entrepot);
        
    }

}
