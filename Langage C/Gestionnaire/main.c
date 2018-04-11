#include "salleSport.h"

int main()
{
    typeAdherent *tabAdherent;
    int i, totalAdherent;

    printf("Salle De Sport\n");
    printf("Combien d'adherent ? ");
    scanf("%i", &totalAdherent);
    tabAdherent = (typeAdherent *)malloc(totalAdherent*sizeof(typeAdherent));

    for(i=0; i<totalAdherent; i++){
        printf("Adherent n°%i \n", i+1);
        tabAdherent[i] = *nouvelAdherent();
        printf("\n");
    }

    system("clear");

    /*for(i=0; i<totalAdherent; i++){
        affichePersonnePtr(&tabAdherent[i]);
        printf("\n");
    }*/

    affichePersonnePtr(&tabAdherent[1]);
    return 0;
}
