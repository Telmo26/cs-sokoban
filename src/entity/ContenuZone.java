package entity;

import com.modeliosoft.modelio.javadesigner.annotations.objid;

/**
 * Énumération des contenus des cases pour l'IHM du jeu Sokoban
 * 
 * Cette énumération figure dans le paquetage entity pour pouvoir
 * etre utilisée par les classes de ce paquetage sans introduire
 * une dépendance vers les paquetages control ou boundary.
 * 
 * @author Dominique Marcadet
 * @version 1.2
 */
@objid ("2bd9e6a9-ad13-4ef6-9bf7-b09d402bb595")
public enum ContenuZone {
    ZONE_VIDE,
    MUR,
    CAISSE,
    CAISSE_SUR_CIBLE,
    CIBLE,
    GARDIEN;
}
