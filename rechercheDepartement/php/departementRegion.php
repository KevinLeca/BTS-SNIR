<html>
    <head>
        <title>DEP / REG</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link href="../cssRegion.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <?php
        /*
         * To change this license header, choose License Headers in Project Properties.
         * To change this template file, choose Tools | Templates
         * and open the template in the editor.
         */

        require_once './fonctions.inc';
        $idRegion = $_POST['region'];
        
        $departement = getDepartementFromRegion($idRegion);
        echo '<div>';
        echo "<table>";
        echo "<tr><td class=\"titre\">Nom Département</td><td class=\"titre\">Numéro de département</td></tr>";
        echo $departement . "<br/>";
        echo "</table>";
        echo '</div>';
        ?>
    </body>
</html>