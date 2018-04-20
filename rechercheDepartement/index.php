<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>
    <head>
        <title>DEP / REG</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link href="cssRegion.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <div>
            <form action="php/departementRegion.php" method="post" >
                <fieldset class="departement">
                    <legend>Recherche des départements</legend>
                    <label for="region">Choisissez une region</label>
                    <select name="region" id="region">
                        <?php
                        /*
                         * To change this license header, choose License Headers in Project Properties.
                         * To change this template file, choose Tools | Templates
                         * and open the template in the editor.
                         */
                        require_once './php/fonctions.inc';
                        afficherOption();
                        
                        ?>
                    </select><br/>
                    <input type="submit"/>
                </fieldset>
            </form>
        </div>
    </body>
</html>


