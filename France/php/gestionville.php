<?php

/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
require_once './fonctionsFrance.inc';
$nomVille = $_POST["ville"];

$nomDeartement = getNomDepartementFromVille($nomVille);
echo "<div>";
echo "ville de <b>$nomVille</b> se trouve dans le departement : <br/>";
echo "<b>$nomDeartement</b>";
echo "</div>";

afficheRgion();