# X.com App

Application web simple qui permet d'afficher / ouvrir **X.com** (anciennement Twitter).

## Fonctionnalités

- Interface sombre style X
- Bouton pour ouvrir X.com
- Support **PWA** (Progressive Web App) → tu peux l'installer sur ton téléphone ou ordinateur
- Quand l'app est installée en mode standalone, elle redirige automatiquement vers X.com

## Démo

Une fois GitHub Pages activé :  
**https://jfdedit3.github.io/x-com-app/**

## Comment utiliser

1. Ouvre le site
2. Clique sur **Ouvrir X.com**
3. (Optionnel) Clique sur **Installer l'application** pour l'avoir sur ton écran d'accueil

## Notes techniques

X.com bloque les iframes (`X-Frame-Options`), donc l'app ne peut pas intégrer le site directement.  
Solution utilisée : redirection + mode PWA standalone pour une expérience proche d'une app native.

## Licence

MIT – Libre d'utilisation
