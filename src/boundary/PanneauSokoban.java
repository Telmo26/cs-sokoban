package boundary;

import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.util.EnumMap;
import java.util.Map;
import javax.imageio.ImageIO;
import javax.swing.JPanel;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import control.IControleur;
import entity.ContenuZone;

/**
 * Panneau de l'IHM pour le jeu Sokoban
 * 
 * @author Dominique Marcadet
 * @version 1.2
 */
@objid ("c7c4c0b7-550a-478d-a6bb-000661365c33")
@SuppressWarnings("serial")
public class PanneauSokoban extends JPanel {
    @objid ("83fd0543-e16e-4871-8ae8-4cc465605fbd")
    private static final int IMAGE_SIZE = FenetreSokoban.TAILLE_IMAGE;

    @objid ("b4f98720-a26b-4e4e-ac5e-85922e616c59")
    private static EnumMap<ContenuZone, Image> images;

    @objid ("3494868d-955e-4cda-822e-be195b4352ab")
    private IControleur controleur;

    @objid ("2fd3c092-c841-48f1-a50a-9ad620cb2e7e")
    public PanneauSokoban(IControleur controleur) {
        this.controleur = controleur;
        try {
            images = new EnumMap< ContenuZone, Image >(
                Map.of(
                    ContenuZone.ZONE_VIDE       , ImageIO.read( new File( "img/EmptyFloor.jpg" )),
                    ContenuZone.MUR             , ImageIO.read( new File( "img/Wall.jpg" )),
                    ContenuZone.CAISSE          , ImageIO.read( new File( "img/Box.jpg" )),
                    ContenuZone.CAISSE_SUR_CIBLE, ImageIO.read( new File( "img/BoxOnGoal.jpg" )),
                    ContenuZone.CIBLE           , ImageIO.read( new File( "img/Goal.jpg" )),
                    ContenuZone.GARDIEN         , ImageIO.read( new File( "img/Man.jpg" ))
                )
            );
        }
        catch( IOException e ) {
            e.printStackTrace();
        }
    }

    @objid ("b00ec898-d7fd-4c27-bc9f-94bcf0878cf2")
    public void paint(Graphics g) {
        super.paint( g );
        
        // Le côté métier raisonne en [ligne, colonne]
        // Le côté IHM raisonne en [x, y]
        // Donc x <=> colonne et y <=> ligne
        for( int l = 0; l < controleur.getNbLignes(); ++l ) {
            for( int c = 0; c < controleur.getNbColonnes(); ++c ) {
                g.drawImage( images.get( controleur.getContenu( l, c )), c * IMAGE_SIZE, l * IMAGE_SIZE, IMAGE_SIZE, IMAGE_SIZE, null );
            }
        }
    }

}
