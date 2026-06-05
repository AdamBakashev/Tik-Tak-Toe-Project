# Technisches Design – Design Patterns (TicTacToe Web Application)

## 1. Verwendete Design Patterns (GRASP + SOLID)

Im folgenden werden die im Projekt verwendeten Design Patterns beschrieben.

---

## 1. Controller Pattern (GRASP – Controller)
- **Datei:** `src/main/java/com/example/tictactoe/HelloController.java`
- **Beschreibung:**  
  Der Spring Boot Controller verarbeitet HTTP-Anfragen und leitet diese an die passende View weiter. Er dient als zentrale Schnittstelle zwischen Benutzer und Anwendung.

---

## 2. MVC Pattern (Architektur Pattern)
- **Dateien:**
  - Controller: `src/main/java/com/example/tictactoe/HelloController.java`
  - View: `src/main/resources/templates/index.html`
- **Beschreibung:**  
  Das Projekt folgt dem MVC-Prinzip (Model-View-Controller).  
  Der Controller steuert die Anfrageverarbeitung, die View stellt das Spielfeld dar, und das Modell wird durch den Spielzustand im JavaScript repräsentiert.

---

## 3. Information Expert (GRASP)
- **Datei:** `src/main/resources/templates/index.html`
- **Beschreibung:**  
  Das JavaScript-Array `board` enthält den gesamten Spielzustand und besitzt somit die notwendigen Informationen, um gültige Züge und Gewinnbedingungen zu prüfen.

---

## 4. Low Coupling (GRASP / SOLID)
- **Datei:** `src/main/resources/templates/index.html`
- **Beschreibung:**  
  Die Spiellogik im Frontend ist vollständig vom Backend entkoppelt. Spring Boot liefert nur die Seite aus, während die gesamte Spiellogik im Browser ausgeführt wird.

---

## 5. Single Responsibility Principle (SOLID)
- **Dateien:**
  - `HelloController.java` → nur Routing
  - `index.html` → Darstellung und Spiellogik
- **Beschreibung:**  
  Jede Komponente hat eine klare Aufgabe:
  - Controller: Verarbeitung von HTTP-Anfragen  
  - Frontend: Darstellung und Spielmechanik  

---

## 6. Kapselung (Grundprinzip der OOP / JavaScript)
- **Datei:** `src/main/resources/templates/index.html`
- **Beschreibung:**  
  Der Spielzustand (`board` und `currentPlayer`) ist im JavaScript gekapselt und kann nur über definierte Funktionen verändert werden.

---

## 2. Zusammenfassung

Das Projekt folgt einer einfachen MVC-Architektur und nutzt grundlegende GRASP- und SOLID-Prinzipien. Durch die klare Trennung von Backend (Spring Boot) und Frontend (HTML/JavaScript) entsteht eine lose gekoppelte und gut wartbare Architektur.
