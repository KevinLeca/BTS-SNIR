<?php
//Variable INDISPENSABLE a la connexion bdd
define("SERVEURBD", "172.18.58.14");
define("LOGIN", "snir");
define("MOTDEPASSE", "snir");
define("NOMDELABASE", "france2015");

//fonction de connexion a la bdd
function connexionBD() {
    try {
        $bdd = new PDO('mysql:host=' . SERVEURBD . ';dbname=' . NOMDELABASE, LOGIN, MOTDEPASSE);
    } catch (Exception $ex) {
        die('<br />Pb connexion serveur BD : ' . $ex->getMessage());
    }
    return $bdd;
}

function getNomDepartementFromVille($ville) {
    
    $bdd = connexionBD();
    
    $requete = $bdd->prepare("select departement_nom from villes, departements where departements.departement_id=villes.ville_departement_id and ville_nom like :laville ;");
    $requete->bindParam(":laville", $ville);
    $requete->execute() or die(print_r($requete->errorInfo()));
    
    $nbLigne = $requete->rowCount();
    
    if($nbLigne == 0)  {
        $nomDep = "pas de correspondance";
    }
    if($nbLigne == 1) {
        $nomDep = $requete->fetchColumn(0);
    }
    if($nbLigne > 1) {
        $nomDep = "";
        while ($ligne = $requete->fetch()) {
            $nomDep = $nomDep . "<br/>" . $ligne['departement_nom'];
        }
    }
    $requete->closeCursor();
    return $nomDep;
}

function afficheRegions() {
    
    $bdd = connexionBD();
    
    $requete = $bdd->prepare("select regions_nom from regions ;");
    $requete->execute() or die(print_r($requete->errorInfo()));
    
    $nbLigne = $requete->rowCount();
    
    if($nbLigne == 0)  {
        $nomDep = "pas de correspondance";
    }
    if($nbLigne == 1) {
        $nomDep = $requete->fetchColumn(0);
    }
    if($nbLigne > 1) {
        $nomDep = "";
        while ($ligne = $requete->fetch()) {
            echo "<br/>" . $ligne['regions_nom'];
        }
    }
    $requete->closeCursor();
    return $nomDep;
}