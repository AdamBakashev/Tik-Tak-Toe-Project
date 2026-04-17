
# ADR 1.1: Programmiersprache (Java vs. JavaScript Full-Stack)

## Title
Wahl der Programmiersprache für Backend und Frontend

## Context
Wir entwickeln ein browserbasiertes TicTacToe-Spiel für zwei Spieler. Das Spiel muss im Browser laufen und einfache Echtzeit-Interaktionen unterstützen (Spielzüge zwischen zwei Geräten).

## Problem
Wir müssen entscheiden, welche Programmiersprache wir für das Projekt verwenden, damit wir das Spiel einfach entwickeln und später auch umsetzen können.

## Constraints
- Das Spiel muss im Browser funktionieren
- Zwei Spieler müssen gleichzeitig spielen können
- Echtzeit-Übertragung der Spielzüge ist notwendig
- Das System soll möglichst einfach umsetzbar sein (kein zu komplexes Setup)

## Quality Objectives
- Usability (einfach zu bedienen für beide Spieler)
- Performance (schnelle Reaktion bei Spielzügen)
- Stabilität (keine Abstürze bei Spielsessions)

## Alternatives

### Java (mit Spring Boot Backend + einfachem Web-Frontend)
Vorteile:
- Sehr stabil und zuverlässig
- Gut für Server-Logik (Spielzustand, Spielerwechsel)
- Gute Struktur für größere Projekte
- WebSocket Unterstützung möglich für Echtzeit

Nachteile:
- Etwas mehr Setup notwendig
- Backend und Frontend sind getrennt

---

### JavaScript (Node.js + reines Full-Stack JS)
Vorteile:
- Nur eine Sprache für alles
- Schnell zu entwickeln
- Einfachere Kommunikation zwischen Frontend und Backend

Nachteile:
- Weniger strukturierte Architektur
- Kann bei größeren Projekten unübersichtlich werden

## Decision Evaluation
Java ist stabiler und besser strukturiert für serverseitige Logik. JavaScript ist einfacher, aber weniger robust für klare Backend-Logik.

## Final Decision
Wir verwenden Java (Spring Boot) für das Backend und einfache Web-Technologien (HTML, CSS, JavaScript) für das Frontend.

## Status
Accepted

## Consequences

### Advantages
- Klare Trennung zwischen Frontend und Backend
- Sehr stabile Server-Logik
- Gute Erweiterbarkeit für spätere Features

### Disadvantages
- Etwas mehr Aufwand beim Setup
- Zwei Technologien müssen kombiniert werden

### Risks
- Anfangs etwas komplexer für Einsteiger
- Fehler bei Kommunikation zwischen Frontend und Backend möglich








# ADR 1.2: Website Type (SPA vs. Multi Page / Server-rendered)

## Title
Wahl des Website-Typs für die TicTacToe Web-Anwendung

## Context
Wir entwickeln ein browserbasiertes TicTacToe-Spiel für zwei Spieler. Das Spiel muss einfache Interaktionen wie Klicks auf das Spielfeld unterstützen und den aktuellen Spielstand in Echtzeit anzeigen.

## Problem
Wir müssen entscheiden, ob die Anwendung als Single Page Application (SPA) oder als serverseitig gerenderte Multi Page Application umgesetzt wird.

## Constraints
- Muss im Browser laufen (Desktop + Mobile)
- Muss einfache und schnelle Interaktion ermöglichen
- Echtzeit-Spielzüge müssen angezeigt werden
- Umsetzung soll für ein Studentenprojekt einfach bleiben

## Quality Objectives
- Usability (sehr einfache Bedienung)
- Performance (schnelle Reaktion bei Spielzügen)
- Einfachheit der Umsetzung (wichtig für Einsteiger)
- Kompatibilität (alle modernen Browser)

## Alternatives

### Single Page Application (SPA)
Vorteile:
- Keine kompletten Seitenreloads
- Schnelle und flüssige Benutzererfahrung
- Gut für interaktive Anwendungen wie Spiele

Nachteile:
- Erfordert mehr JavaScript-Logik
- Komplexer in der Umsetzung für Einsteiger

---

### Server-seitige HTML-Seiten (z. B. Java + Thymeleaf)
Vorteile:
- Sehr einfach zu verstehen
- Wenig JavaScript notwendig
- Gut für einfache Anwendungen

Nachteile:
- Seiten müssen bei Änderungen neu geladen werden
- Weniger flüssige Spielerfahrung
- Echtzeit-Updates schwieriger umzusetzen

## Decision Evaluation
SPA bietet bessere Benutzererfahrung für Echtzeitspiele, ist aber komplexer. Server-seitige Seiten sind einfacher, aber schlechter für interaktive Spiele geeignet.

## Final Decision
Wir verwenden eine einfache server-nahe Lösung mit HTML, CSS und minimalem JavaScript. Die Anwendung wird nicht als komplexe SPA mit Frameworks umgesetzt.

## Status
Accepted

## Consequences

### Advantages
- Sehr einfache Umsetzung für Einsteiger
- Wenig JavaScript notwendig
- Gut kombinierbar mit Java Backend (Spring Boot + WebSockets)
- Leicht verständlich und wartbar

### Disadvantages
- Nicht so modern wie vollständige SPA
- Etwas weniger flüssige UI als Framework-Lösungen

### Risks
- Ohne gutes WebSocket-Design kann die UI weniger dynamisch wirken
- Manuelle UI-Updates nötig (kein Framework übernimmt das)








# ADR 1.3: Web Framework / Architektur

## Title
Wahl des Frameworks und der Architektur für die TicTacToe Web-Anwendung

## Context
Wir entwickeln ein browserbasiertes TicTacToe-Spiel für zwei Spieler. Das Spiel muss Echtzeit-Interaktionen unterstützen, sodass beide Spieler ihre Züge sofort sehen können.

## Problem
Wir müssen entscheiden, welche Frameworks und Technologien wir für Backend und Kommunikation verwenden, um ein einfach umsetzbares, aber funktionierendes Echtzeit-Spiel zu bauen.

## Constraints
- Muss im Browser funktionieren (Desktop + Mobile)
- Echtzeit-Spielzüge zwischen zwei Spielern
- Einfache Umsetzung für ein Studentenprojekt
- Keine unnötig komplexe Frontend-Architektur

## Quality Objectives
- Performance (schnelle Übertragung von Spielzügen)
- Usability (direkte und einfache Bedienung)
- Einfachheit der Umsetzung
- Stabilität und Zuverlässigkeit

## Alternatives

### Vanilla HTML/CSS/JavaScript + einfache HTTP Requests
Vorteile:
- Sehr einfach zu verstehen
- Kein Framework notwendig

Nachteile:
- Keine echte Echtzeit-Kommunikation
- Spiel müsste oft neu geladen werden
- Schlechte User Experience für Multiplayer

---

### Java Spring Boot + WebSockets (mit einfachem HTML/JS Frontend)
Vorteile:
- Echtzeit-Kommunikation möglich (WebSockets)
- Sehr stabile Server-Architektur
- Gut für Multiplayer-Logik geeignet
- Klare Trennung von Logik (Backend) und UI (Frontend)

Nachteile:
- Etwas mehr Setup notwendig
- Minimale JavaScript Nutzung im Frontend erforderlich

## Decision Evaluation
WebSockets sind notwendig für ein Echtzeit-TicTacToe-Spiel. Spring Boot bietet eine stabile und einfache Möglichkeit, diese serverseitig umzusetzen.

## Final Decision
Wir verwenden Java Spring Boot als Backend mit WebSockets für Echtzeit-Kommunikation und ein einfaches HTML/CSS/JavaScript Frontend.

## Status
Accepted

## Consequences

### Advantages
- Echtzeit-Spiel funktioniert zuverlässig
- Sehr stabile und skalierbare Backend-Struktur
- Klare und einfache Architektur
- Gut für Desktop und mobile Geräte geeignet

### Disadvantages
- Etwas mehr Initialaufwand beim Setup
- Minimales JavaScript im Frontend erforderlich

### Risks
- Fehler in WebSocket-Kommunikation können Spiel beeinflussen
- Ohne saubere Struktur kann Backend schnell unübersichtlich werden









# ADR 2: Real-Time Communication Method

## Title
Wahl der Methode für Echtzeit-Kommunikation zwischen den Spielern

## Context
In unserem TicTacToe-Spiel müssen beide Spieler ihre Züge sofort sehen, sobald ein Spieler einen Zug macht. Da beide Spieler auf unterschiedlichen Geräten spielen, muss das System Änderungen in Echtzeit übertragen.

## Problem
Wir müssen entscheiden, wie die Kommunikation zwischen Client (Browser) und Server (Java Backend) umgesetzt wird, um Spielzüge in Echtzeit zu synchronisieren.

## Constraints
- Echtzeit-Updates ohne manuelles Neuladen der Seite
- Unterstützung für zwei gleichzeitige Spieler
- Einfache Implementierung im Rahmen eines Studentenprojekts
- Funktioniert im Browser

## Quality Objectives
- Performance (sofortige Übertragung von Zügen)
- Usability (keine Verzögerung sichtbar)
- Stabilität (zuverlässige Verbindung)
- Einfachheit der Nutzung

## Alternatives

### Polling (regelmäßige HTTP-Anfragen)
Vorteile:
- Einfach zu implementieren
- Kein spezielles WebSocket-Setup notwendig

Nachteile:
- Verzögerungen bei Updates
- Hohe Serverlast durch viele Anfragen
- Keine echte Echtzeit-Kommunikation

---

### WebSockets
Vorteile:
- Echte Echtzeit-Kommunikation
- Sofortige Updates für beide Spieler
- Effizient, da Verbindung offen bleibt
- Ideal für Multiplayer-Spiele

Nachteile:
- Etwas komplexer in der Umsetzung
- Verbindung muss sauber verwaltet werden

## Decision Evaluation
WebSockets sind deutlich besser geeignet für ein Echtzeit-Spiel wie TicTacToe, da sie sofortige Kommunikation ermöglichen und effizienter sind als Polling.

## Final Decision
Wir verwenden WebSockets für die Echtzeit-Kommunikation zwischen Client und Server.

## Status
Accepted

## Consequences

### Advantages
- Sehr schnelle und direkte Spielupdates
- Gute Nutzererfahrung ohne Verzögerung
- Effiziente Serverkommunikation

### Disadvantages
- Etwas komplexere Implementierung im Backend
- Verbindung muss stabil gehalten werden

### Risks
- Verbindungsabbrüche müssen behandelt werden
- Fehler in der WebSocket-Logik können Spielfluss stören