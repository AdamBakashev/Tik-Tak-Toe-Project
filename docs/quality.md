# Quality Attributes – TicTacToe Web Application

## 1. Quality Attributes (Ranked)

### 1. Usability
Usability is the most important quality attribute because the application must be simple and intuitive for both players. The game should require no learning curve and must be accessible for users on desktop and mobile devices.

**Use Case:** A child opens the game on a smartphone and immediately understands how to place a move without instructions.

---

### 2. Performance
The game must respond instantly to user actions to ensure a smooth gameplay experience. Delays would negatively affect the turn-based interaction.

**Use Case:** A player clicks on a field and the move is displayed immediately without delay.

---

### 3. Availability
The application must be available at all times since players may use it during short breaks. Downtime directly affects usability.

**Use Case:** The boss opens the game during lunch break and the server is available without interruption.

---

### 4. Compatibility
The application must work on both desktop and mobile browsers to support both users.

**Use Case:** The child plays on a smartphone while the parent plays on a desktop browser.

---

### 5. Security
Even though the game is simple, user sessions must be protected to prevent interference between players.

**Use Case:** Only the two connected players can interact with the current game session.

---

## 2. Not Important Quality Attribute

### Scalability (Less Important)
Scalability is less important because TicTacToe is a simple two-player game with minimal load. The system does not need to support many concurrent users.

---

## 3. Quality Scenarios

### Usability Scenarios
- A new user can start a game within 5 seconds without reading instructions.
- All game controls are understandable without external help.

### Performance Scenarios
- A move is processed and displayed within 200ms.
- The game board updates instantly after each action.

### Availability Scenarios
- The application is available 99% of the time during usage hours.
- Page loads successfully within 2 seconds.

### Compatibility Scenarios
- The game works on Chrome, Safari, and Firefox.
- The UI adapts correctly to screen sizes from 320px to 1920px.

### Security Scenarios
- Only authenticated session users can make moves.
- No external user can access an ongoing game session.