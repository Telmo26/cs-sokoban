import java.util.ArrayList;
import javax.swing.SwingUtilities;
import boundary.FenetreSokoban;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import control.Controleur;
import entity.*;

@objid ("73803e6a-1478-4d09-845d-0a927981fae1")
public class TestSokoban implements Runnable {
    @objid ("d2e159c2-d117-459a-b793-361bbb0250e5")
    private static Controleur controleur;

    @objid ("85298fcc-30ba-4031-a722-4b3bb5720192")
    public static void main(String[] args) {
        ArrayList<Position> positions = new ArrayList<Position>();
        ArrayList<Zone> zones = new ArrayList<Zone>();
        ArrayList<Zone> cibles = new ArrayList<Zone>();
        
        Entrepot entrepot = new Entrepot(zones, positions, cibles);
        
        controleur = new Controleur(entrepot);
        
        for (int i = 0 ; i < 5 ; i++) {
            for (int j = 0 ; j < 6 ; j++) {
                Position position = new Position(i, j, entrepot);
                Zone zone;
                
                if (i == 0 || j == 0 || i == 4 || j == 5) {
                    zone = new Zone(entrepot, position, false, true);
                }
                else if ((i == 3 && j == 4) || (i == 1 && j == 1)) {
                    zone = new Zone(entrepot, position, true, false);
                    cibles.add(zone);
                }
                else if (i == 2 && j == 1) {
                    zone = new Zone(entrepot, position, false, false);
                    Gardien gardien = new Gardien(zone);
                    zone.setMobile(gardien);
                    controleur.setGardien(gardien);
                }
                else if ((i == 2 && j == 3) || (i == 1 && j == 2)) {
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
        entrepot.setTaille(5, 6);
        
        SwingUtilities.invokeLater(new TestSokoban());
    }

    @objid ("16769db8-269b-4cac-b393-8aa06ea28065")
    @Override
    public void run() {
        new FenetreSokoban(controleur);
    }

}
