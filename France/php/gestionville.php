<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>
    <head>
        <title>Recherche Departement</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link href="../cssFrance.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <?php
        /*
         * To change this license header, choose License Headers in Project Properties.
         * To change this template file, choose Tools | Templates
         * and open the template in the editor.
         */
        require_once './fonctionsFrance.inc';
        $nomVille = $_POST["ville"];
        $numDep = $_POST["numero"];

        /* $nomDeartement = getNomDepartementFromVille($nomVille);
          echo "<div>";
          echo "ville de <b>$nomVille</b> se trouve dans le departement : <br/>";
          echo "<b>$nomDeartement</b>";
          echo "</div>"; */


        /* $nomRegion = afficheRegions();
          echo "<div>Nom des Region : <br/>";
          echo $nomRegion;
          echo "</div>"; */


        /* $DepReg = afficheDepartementsRegions();
          echo "<div>";
          echo "<table>";
          echo "<tr><td><b>Nom Regions</b></td><td><b>Nom Departements</b></td></tr>";
          echo $DepReg;
          echo "</table>";
          echo "</div>"; */

        $nomDeartement = getNomDepartementFromNumero($numDep);
          echo "<div><br/>";
          echo "le departement numero <b>$numDep</b> correspond au departement : <br/>";
          echo "<b>$nomDeartement</b>";
          echo "</div>"; 
        ?>
    </body>
</html>