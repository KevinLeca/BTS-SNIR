/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

function verifPassword() {
    pass = $("#id_mdp");
    pass2 = $("#id_mdp2");
    if (pass !== pass2) {
        alert("Les mots de passes doivent être identiques");
    }
}

function versionOS() {
    $("#id_version").empty();
    os = $("#id_SE option:selected").text();
    if (os === "Windows") {
        $("#id_version").append($("<option>", {value: "XP"}).text("XP"));
        $("#id_version").append($("<option>", {value: "Vista"}).text("Vista"));
        $("#id_version").append($("<option>", {value: "Seven"}).text("Seven"));
    }
    if (os === "Linux") {
        $("#id_version").append($("<option>", {value: "Debian"}).text("Debian"));
        $("#id_version").append($("<option>", {value: "Ubuntu"}).text("Ubuntu"));
        $("#id_version").append($("<option>", {value: "Fedora"}).text("Fedora"));
        $("#id_version").append($("<option>", {value: "SuSE"}).text("SuSE"));
        $("#id_version").append($("<option>", {value: "Mint"}).text("Mint"));

    }
    if (os === "Mac OS") {
        $("#id_version").append($("<option>", {value: "Tiger"}).text("Tiger"));
        $("#id_version").append($("<option>", {value: "Leopard"}).text("Leopard"));
        $("#id_version").append($("<option>", {value: "Snow leopard"}).text("Snow leopard"));
        $("#id_version").append($("<option>", {value: "Lion"}).text("Lion"));
    }
    console.log(os);
}

$(document).ready(function () {
    $("#id_inscription").click(verifPassword);
    $("#id_SE").change(versionOS);
});