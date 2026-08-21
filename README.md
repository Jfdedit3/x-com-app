# X.com App

Application pour afficher **X.com** (anciennement Twitter).

Contient deux versions :

1. **Version Web (PWA)** → dossier racine
2. **Version Android (WebView)** → dossier `android/`

---

## Version Android (recommandée)

Application native Android qui affiche X.com en plein écran via WebView.

### Fonctionnalités
- X.com chargé directement dans l'app
- Pull-to-refresh
- Bouton retour géré
- Barre de progression
- Thème sombre
- User-Agent optimisé

### Comment compiler
1. Ouvre le dossier **`android/`** dans **Android Studio**
2. Laisse Gradle synchroniser
3. Lance sur un téléphone ou émulateur

Pour générer un APK :
```bash
cd android
./gradlew assembleDebug
```
APK disponible dans : `app/build/outputs/apk/debug/app-debug.apk`

Plus de détails dans → [android/README.md](android/README.md)

---

## Version Web (PWA)

- Interface sombre style X
- Bouton pour ouvrir X.com
- Installable sur téléphone / ordinateur

### Démo
Une fois GitHub Pages activé :  
**https://jfdedit3.github.io/x-com-app/**

---

## Licence

MIT – Libre d'utilisation
