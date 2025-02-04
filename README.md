# carRoadTrip

Premier scénario = tout fonctionne correctement + conducteur moyen

- Avant de conduire la voiture, le compteur est à 0 km/h et le réservoir de carburant contient 40 L.
- Ensuite, conduisez pendant 100 km = distance maximale qu'une voiture peut parcourir avant de faire
  le plein, à une vitesse de 128 km/h = vitesse moyenne.
- Nous calculons le prix avec le carburant consommé.

Deuxième scénario = ajoutez la puissance (nombre de chevaux d'un voiture) au prix

- Avant on vérifie le quantité d'esssence en fonction de la puissance.
- Ajoutez la vitesse à laquelle vous souhaitez conduire. Vitesse 128 km/h = vitesse moyenne
- Ensuite, conduisez pendant 100 km à la vitesse que vous choisissez
- Nous calculons le prix avec le carburant consommé + le taux qui dépend de la puissance

Troisième scénario = ajouter le dépannage + plein d'essence au prix

- Avant on vérifie le quantité d'esssence en fonction de la puissance.
- Ajoutez la vitesse à laquelle vous souhaitez conduire. Vitesse 128 km/h = vitesse moyenne
- Ensuite, conduisez pendant 100 km à la vitesse que vous choisissez
- Vérifier si la voiture est en panne avec la fonction isBreakDown()
- Nous calculons le prix avec le carburant consommé + le taux qui dépend de la puissance + le nombre de panne

- Nous avons ensuite récupéré les valeurs du formulaire de la classe CarForm.
  On les intègre dans la class Car et affiche les résultats dans une interface Swing.

- On ajoute une condtion pour calculer le nombre de panne en fonction de la quantité d'essence.
