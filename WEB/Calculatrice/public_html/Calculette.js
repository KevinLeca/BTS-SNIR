/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
function afficher() {
    val = (this).value;
    ecran = $("#screen").val();
    affichage = ecran + val;
    $("#screen").val(affichage);
}

function calculer() {
    valeur = $("#screen").val();
    resultat = eval(valeur);
    if(resultat !== 0){
        $("#screen").empty();
        $("#screen").val(resultat);
    }
   
    console.log(valeur);
}

$(document).ready(function () {
    $(document).on("click",":button",afficher);
    $("#toucheEgal").click(calculer); 
    $("#toucheEgal").dblclick(function(){        
        $("#screen").val("");
    });
});
