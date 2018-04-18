<?php

//Affichage des informations "propre"
function afficherInfos($tab) {
    //Sexe
    if ($tab['sexe'] === "1") {
        $stringSexe = "masculin";
    }
    if ($tab['sexe'] === "2") {
        $stringSexe = "feminin";
    }
    if ($tab['sexe'] === "3") {
        $stringSexe = "unknown";
    }
    //Ville
    if ($tab['ville'] === "le_mans") {
        $stringVille = "Le Mans";
    }
    if ($tab['ville'] === "la_fleche") {
        $stringVille = "La Fleche";
    }
    if ($tab['ville'] === "sable") {
        $stringVille = "Sable";
    }
    if ($tab['ville'] === "choix") {
        $stringVille = "Autre";
    }
    
    //civilités
    echo ("Nom : " . $tab['nom'] . "<br>Prenom : " . $tab['prenom'] . "<br>Ville : " . $stringVille . "<br>Email : " . $tab['courriel'] . "<br>Site : " . $tab['lienHttp'] . "<br>Sexe : " . $stringSexe);

    //SE
    if ($tab['SE'] === "choix") {
        $stringSE = "Pas de SE";
    }
    if ($tab['SE'] === "windows") {
        $stringSE = "Windows";
    }
    if ($tab['SE'] === "linux") {
        $stringSE = "Linux";
    }
    if ($tab['SE'] === "mac") {
        $stringSE = "Mac OS";
    }
    
    //savoirs
    echo ("<br><br>Systeme d'exploitation : " . $stringSE . "<br>Version : " . $tab["Version"] . "<br>Langage : ");

    //langages infos sur une ligne
    if ($tab['langage1'] === "1") {
        echo "Java";
    }
    if ($tab['langage2'] === "2") {
        if ($tab['langage1'] === "1") {
            echo " / C";
        } else {
            echo "C";
        }
    }
    if ($tab['langage3'] === "3") {
        if ($tab['langage2'] === "2" || $tab['langage1'] === "1") {
            echo " / PHP";
        } else {
            echo "PHP";
        }
    }
    echo '<br>Autre langage : ';
    if ($tab['langage4'] === "4") {
        echo 'Oui';
    } else {
        echo 'Non';
    }

    //infos connexion
    echo ("<br><br>Login : " . $tab['login'] . "<br>Password : " . $tab['mdp'] . "<br>Password 2 : " . $tab['mdp2'] . "<br><br>");
}
//---------------------------------------------

//Affichage infos rapide
function afficherInfosV2($tab) {
    foreach ($tab as $champ => $valeur) {
        echo $champ . ' : ' . $valeur . '<br>';
    }
}
//---------------------------------------------

//Verification mdp "echo"
function verifMdp($m1, $m2) {
    if ($m1 === $m2) {
        echo '<br>OK';
    }
    if ($m1 !== $m2) {
        echo '<br>KO';
    }
}
//---------------------------------------------

//Verification mdp avec return
function verifMdp2($m1, $m2) {
    if ($m1 === $m2) {
        $verif = true;
    }
    if ($m1 !== $m2) {
        $verif = false;
    }

    return $verif;
}
//---------------------------------------------