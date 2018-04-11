#ifndef SALLESPORT_H_INCLUDED
#define SALLESPORT_H_INCLUDED
#define TAILLEMAX 20
#define TAILLEID 11
#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#define NBADHERENT 5000

typedef struct adherent{
    char nom[TAILLEMAX];
    char prenom[TAILLEMAX];
    char id[TAILLEID];
    int activite;
}typeAdherent;

typeAdherent *nouvelAdherent();
void affichePersonnePtr(typeAdherent *personne);

#endif // SALLESPORT_H_INCLUDED
