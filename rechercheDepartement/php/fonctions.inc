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

function afficherOption() {

    $bdd = connexionBD();

    $requete = $bdd->prepare("select regions_id, region_nom from regions;");
    $requete->execute() or die(print_r($requete->errorInfo()));

    $nbLigne = $requete->rowCount();

    if ($nbLigne == 0) {
        $option = "pas de regions";
    }
    if ($nbLigne == 1) {
        $option = $requete->fetchColumn(0);
    }
    if ($nbLigne > 1) {
        $option = "";
        while ($ligne = $requete->fetch()) {
           echo "<option value=\"" . $ligne['regions_id'] . "\">" . $ligne['region_nom'] . "</option>\n";
        }
    }
    $requete->closeCursor();
 
}

function getDepartementFromRegion($idRegion) {

    $bdd = connexionBD();

    $requete = $bdd->prepare("select departement_nom, departement_code from regions, departements where departements.departement_region_id=regions.regions_id and regions_id = :laregion ;");
    $requete->bindParam(":laregion", $idRegion);
    $requete->execute() or die(print_r($requete->errorInfo()));

    $nbLigne = $requete->rowCount();

    if ($nbLigne == 0) {
        $nomDep = "pas de correspondance";
    }
    if ($nbLigne == 1) {
        $nomDep = $requete->fetchColumn(0);
    }
    if ($nbLigne > 1) {
        $nomDep = "";
        while ($ligne = $requete->fetch()) {
            $nomDep = $nomDep . "<tr><td class=\"objet\">" . $ligne['departement_nom'] . "</td><td class=\"objet\">" . $ligne['departement_code'] . "</td></tr>";
        }
    }
    $requete->closeCursor();
    return $nomDep;
}
