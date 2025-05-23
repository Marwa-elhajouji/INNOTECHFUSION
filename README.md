# Etude de cas INNOTECHFUSION

## 🎯 Objectif

Développer une application web simple permettant de gérer l’émargement des votants pour l’association INNOTECHFUSION.

---

## 🛠️ Stack technique

- **Frontend** : Angular
- **Backend** : Spring Boot (Java)
- **Base de données** : MySQL
- **Conteneurisation** : Docker + Docker Compose
- **CI/CD** : GitLab CI

---

## ⚙️ Fonctionnalités

- Affichage des membres
- Marquage d’un vote (irréversible)
- Initialisation des données via `data.sql`
- Architecture évolutive

---

## 🚀 Lancer le projet

### 1. Prérequis

- Docker Desktop
- Docker Compose

### 2. Cloner le projet

```bash
git clone https://github.com/Marwa-elhajouji/INNOTECHFUSION.git
cd INNOTECHFUSION
```
### 3. Lancer les conteneurs

```bash
docker compose up --build
```

### 4. Accéder aux services

Frontend Angular : http://localhost:4200

Backend API : http://localhost:8080/membres

---

## Structure du projet

etude-de-cas/
├── backend/           → API Spring Boot
├── frontend/          → App Angular
├── docker-compose.yml
├── .gitlab-ci.yml
├── README.md


## 🔄 Déploiement CI/CD
Le projet est intégré avec GitLab CI. À chaque push :

le backend est compilé

les tests sont exécutés

les images Docker sont générées