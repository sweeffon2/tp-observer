# tp-observer

1. Récupérer le code source en utilisant la commande :

	>  git clone https://github.com/sweeffon2/tp-observer.git

2. Ouvrir le code obtenu en utilisant votre IDE préféré.

3) Le projet est constitué de quatre (04) modules, remarquez que vous avez une interface définissant le service **TimerService** ainsi que de deux interfaces dans le même modules permettant d’implémenter le mécanisme de l’observer.  Une implémentation de base de ce service vous a été octroyée.

4) 
 - Compléter l’implémentation des deux classes *AfficheurSurConsole* et *CompteARebours* pour que ces dernières puissent observer l’instance du *TimerService* récupérée à partir du Lookup et afficher le nécessaire le moment venu. 
 - *CompteARebours* doit être muni d’un constructeur prenant un nombre de secondes en paramètre. A chaque fois qu’une seconde s’écoule, ce nombre est décrémenté et affiché sur la console.  Lorsque le nombre arrive à zéro, l’instance de CompteARebours doit se désabonner de l’Observable.

5) dans la fonction *main* :
	a) instancier un  *AfficheurSurConsole* et vérifier son fonctionnement.
	b) instancier un  *CompteARebours* avec 5 secondes en paramettre et vérifier son fonctionnement.
	
6) Comment pouvez vous faire pour pouvoir observer uniquement le changement d’une seule propriété (secondes, minutes ou heures) ? 

7) créer dix (10) instances de la classe *CompteARebours*  avec un nombre de secondes aléatoire entre 5 et 15, puis, vérifier son fonctionnement.
(utiliser la class Random pour générer des nombres aléatoires)
```
Random r = new Random() ;
int val = 5+r.nextInt(15-5) ;
```

8) Vous allez remarquer que l’exécution de la question 7 engendre souvent des Bogues.  Pourquoi ?

9) Afin de résoudre les problèmes relatifs à notre observer, nous allons déléguer son travail à une instance de la classe : PropertyChangeSupport.
   ***NB.***  *Pensez à faire hériter notre interface TimerChangeListener de la classe **PropertyChangeListener** * 

10) refaire le test de la question 7).  avez vous résolu le problème ?

Bonus) en utilisant ce service, créer une application permettant d’afficher l’heure sur une interface graphique.
