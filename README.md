# Lab Work: Singleton and Adapter Patterns

## Implementation of Two Structural Design Patterns:
1. **Singleton** — Global Configuration Manager.
2. **Adapter** — Integration of a Legacy Chat System into a Modern Application.

---

## Requirements
- **Java JDK 11+**
- **Git** (for cloning the repository)

---

## Installation and Execution

### 1. Clone the Repository
```bash
git clone https://github.com/Madiyarr777/solution_homework_4.git
cd solution_homework_4
```

### 2. Compile and Run

#### Singleton (Configuration Manager):
```bash
javac src/ConfigurationManager.java src/ConfigManagerDemo.java
java -cp src ConfigManagerDemo
```

#### Adapter (Chat Service):
```bash
javac src/ChatService.java src/LegacyChatService.java src/ChatServiceAdapter.java src/ChatAdapterDemo.java
java -cp src ChatAdapterDemo
```

---

## Sample Outputs

### Configuration (ConfigManagerDemo):
```bash
Server Capacity: 200
UI Theme: dark
=== Active Configurations ===
serverCapacity → 200
themeColor → dark
autosaveInterval → 30min
```

### Chat (ChatAdapterDemo):
```bash
[Legacy System] New message received!
```

---

## Project Structure
```bash
solution_homework_4/
└── src/
    ├── ConfigurationManager.java    # Singleton implementation
    ├── ConfigManagerDemo.java       # Configuration demo
    ├── ChatService.java             # Modern chat interface
    ├── LegacyChatService.java       # Legacy chat system
    ├── ChatServiceAdapter.java      # Adapter class
    └── ChatAdapterDemo.java         # Chat demo
```

---

## How It Works?

### Singleton (ConfigurationManager)
- Ensures a single instance of the configuration manager.
- Stores configurations in a HashMap.

#### Usage:
```java
ConfigurationManager config = ConfigurationManager.getInstance();
String capacity = config.getConfig("serverCapacity"); // returns "200"
```

### Adapter (ChatServiceAdapter)
- Adapts the `sendMessage()` method to the legacy format.

#### Logic:
```java
// Modern call:
chatService.sendMessage("Hello");

// Translates to:
legacyService.sendLegacyFormat("Hello"); // Output: "[Legacy System] Hello"
```

---

## License
Open-source code for educational purposes.
