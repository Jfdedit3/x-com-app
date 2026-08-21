# X.com Android App

Application Android native (WebView) qui affiche **X.com** en plein écran.

## Fonctionnalités

- Affiche X.com directement dans l'application
- Support JavaScript + cookies + localStorage
- Pull-to-refresh (glisser vers le bas pour actualiser)
- Bouton retour Android géré (historique de navigation)
- Barre de progression pendant le chargement
- User-Agent modifié pour mieux fonctionner avec X
- Thème sombre

## Comment compiler

### Prérequis
- Android Studio Hedgehog (2023.1.1) ou plus récent
- JDK 17

### Étapes
1. Ouvre le dossier `android/` dans Android Studio
2. Laisse Gradle synchroniser
3. Connecte un téléphone ou lance un émulateur
4. Clique sur **Run** (▶️)

### Générer un APK
```bash
cd android
./gradlew assembleDebug
```
L'APK se trouve dans : `app/build/outputs/apk/debug/app-debug.apk`

## Structure
```
android/
├── app/
│   └── src/main/
│       ├── java/com/jfdedit3/xcomapp/MainActivity.kt
│       ├── res/
│       └── AndroidManifest.xml
├── build.gradle.kts
└── settings.gradle.kts
```

## Notes
Cette app utilise un WebView. X.com fonctionne correctement dedans.
