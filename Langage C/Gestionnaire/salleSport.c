#include "salleSport.h"

typeAdherent *nouvelAdherent(){
    typeAdherent *personne;
    personne = (typeAdherent *)malloc(sizeof(typeAdherent));

    printf("Nom          : ");
    scanf("%s", personne->nom);
    printf("Prenom       : ");
    scanf("%s", personne->prenom);
    printf("ID adherent  : ");
    scanf("%s", personne->id);
    printf("N° acivité   : ");
    scanf("%i", &(personne->activite));

    return personne;
}

void affichePersonnePtr(typeAdherent *personne){
    printf("Nom       : %s\n", personne->nom);
    printf("Prenom    : %s\n", personne->prenom);
    printf("id        : %s\n", personne->id);
    printf("activité  : %i\n", personne->activite);
}
