<?php

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

require_once("fonctions.inc");
$pass1 = $_POST['mdp'];
$pass2 = $_POST['mdp2'];
afficherInfos($_POST);
//afficherInfosV2($_POST);
verifMdp($pass1, $pass2);
$bool = verifMdp2($pass1, $pass2);

if ($bool === true) {
    echo "<br>OK";
} else {
    echo "<br>KO";
}
?>