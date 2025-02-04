package boundary;

import java.awt.Dimension;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import control.IControleur;
import entity.Direction;

/**
 * Fenêtre de l'IHM pour le jeu Sokoban
 * 
 * @author Dominique Marcadet
 * @version 1.2
 */
@objid ("4b4981c7-acf6-4cdc-8073-0e4d1cd86ef0")
@SuppressWarnings("serial")
public class FenetreSokoban extends JFrame implements KeyListener {
    @objid ("60e34f71-0328-4512-bea3-fdd9e3cf7d52")
     static final int TAILLE_IMAGE = 32;

    @objid ("52d77e1d-b426-4eff-b653-62579dec78dd")
    private static final int LARGEUR_FENETRE = 20 * TAILLE_IMAGE;

    @objid ("30ed04a4-a151-4520-b975-13a3142fb15f")
    private static final int HAUTEUR_FENETRE = 12 * TAILLE_IMAGE;

    @objid ("c5dd0dd1-a8b2-4632-9629-6fa7cc986b66")
    private static final int HAUTEUR_TITRE_FENETRE = 20;

    @objid ("31b2108a-4e24-420b-9556-e2ba9eb527b4")
    private IControleur controleur;

    @objid ("c9b3c53c-18f1-47da-a168-55ede22ff594")
    public FenetreSokoban(IControleur controleur) {
        this.controleur = controleur;
        
        this.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        this.setPreferredSize( new Dimension( LARGEUR_FENETRE, HAUTEUR_FENETRE + HAUTEUR_TITRE_FENETRE ));
        this.setTitle( "Sokoban" );
        
        this.add( new PanneauSokoban( controleur ));
        this.addKeyListener( this );
        
        this.pack();
        this.setVisible( true );
    }

    @objid ("c656ed14-2d7e-4821-9e5a-c8a8a54b42e9")
    @Override
    public void keyTyped(KeyEvent e) {
        // nothing
    }

    @objid ("16be9f94-0f4f-4d8b-b248-e84f97ee7180")
    @Override
    public void keyPressed(KeyEvent e) {
        // Version Java 14 non compatible avec le reverse de Modelio
        /*
        Direction direction = switch( e.getKeyCode() ) {
            case KeyEvent.VK_UP    -> Direction.HAUT;
            case KeyEvent.VK_DOWN  -> Direction.BAS;
            case KeyEvent.VK_LEFT  -> Direction.GAUCHE;
            case KeyEvent.VK_RIGHT -> Direction.DROITE;
            default                -> null;
        };
        */
        Direction direction = null;
        switch( e.getKeyCode() ) {
        case KeyEvent.VK_UP:
            direction = Direction.HAUT;
            break;
        case KeyEvent.VK_DOWN:
            direction = Direction.BAS;
            break;
        case KeyEvent.VK_LEFT:
            direction = Direction.GAUCHE;
            break;
        case KeyEvent.VK_RIGHT:
            direction = Direction.DROITE;
            break;
        }
        if( direction == null ) return;
        controleur.action( direction );
        repaint();
        if( controleur.jeuTerminé() ) {
            JOptionPane.showMessageDialog( this, "Vous avez gagné !" );
            System.exit( 0 );
        }
        
    }

    @objid ("3257f4df-03da-4f17-b561-0c32c0d293c3")
    @Override
    public void keyReleased(KeyEvent e) {
        // nothing
    }

}
