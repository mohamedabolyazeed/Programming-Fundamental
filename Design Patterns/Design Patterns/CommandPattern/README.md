# 🎮 Command Pattern

> **"Encapsulate requests, enable flexibility!"** The Command pattern turns requests into objects, allowing you to parameterize clients with different requests, queue operations, and support undo/redo functionality.

[![Behavioral Pattern](https://img.shields.io/badge/Pattern-Behavioral-blue?style=flat-square)]()

---

## 🎯 Intent

Encapsulate a **request as an object**, allowing you to:
- Parameterize clients with different requests
- Queue requests
- Support **undo/redo operations**
- Log requests

---

## ❌ Problem

The sender of a request is tightly coupled to the object that performs the action:
- 🔴 **Tight coupling** - Sender knows receiver directly
- 🔴 **Hard to extend** - Adding new commands requires changing code
- 🔴 **No undo/redo** - Can't reverse operations
- 🔴 **No queuing** - Can't queue or schedule requests
- 🔴 **No logging** - Can't log or audit operations

**Example scenario:**
```java
// ❌ Bad: Tight coupling
class Button {
    void onClick() {
        light.turnOn(); // Direct call, can't undo, can't queue
    }
}
```

---

## ✅ Solution

Wrap a **request inside a command object** that exposes a common interface.

**Key components:**
- 🎯 **Command interface** - Defines execute method
- 🔧 **Concrete commands** - Specific command implementations
- 📦 **Receiver** - Object that performs the actual work
- 🎮 **Invoker** - Triggers command execution
- 👤 **Client** - Creates and assigns commands

---

## 🏗️ Structure

```
┌──────────┐
│  Client  │
└────┬─────┘
     │ creates
┌────▼──────────┐
│   Command     │ ◄─── Interface
│  +execute()   │
│  +undo()      │
└────┬──────────┘
     │ implements
┌────▼──────────┐
│   Concrete    │
│   Command     │
│ -receiver     │
│ +execute()    │
└────┬──────────┘
     │ calls
┌────▼──────┐
│ Receiver  │
│ +action() │
└───────────┘
     ▲
     │ uses
┌────┴──────┐
│ Invoker  │
│ +setCmd()│
│ +press() │
└──────────┘
```

---

## 🚀 Step-by-Step Implementation

1. **Create a `Command` interface** with `execute()` method (and optionally `undo()`)
2. **Create a `Receiver` class** that performs the actual action
3. **Implement concrete command classes** that call receiver methods
4. **Create an `Invoker`** that triggers command execution
5. **Client assigns commands** to the invoker

### 💻 Example Code

```java
// 1. Command Interface
public interface Command {
    void execute();
    void undo();
}

// 2. Receiver
public class Television {
    public void turnOn() {
        System.out.println("TV is ON");
    }
    
    public void turnOff() {
        System.out.println("TV is OFF");
    }
    
    public void increaseVolume() {
        System.out.println("Volume increased");
    }
}

// 3. Concrete Command
public class TurnOnCommand implements Command {
    private Television tv;
    
    public TurnOnCommand(Television tv) {
        this.tv = tv;
    }
    
    public void execute() {
        tv.turnOn();
    }
    
    public void undo() {
        tv.turnOff();
    }
}

// 4. Invoker
public class RemoteControl {
    private Command command;
    
    public void setCommand(Command command) {
        this.command = command;
    }
    
    public void pressButton() {
        command.execute();
    }
}

// 5. Usage
Television tv = new Television();
Command turnOn = new TurnOnCommand(tv);
RemoteControl remote = new RemoteControl();

remote.setCommand(turnOn);
remote.pressButton(); // TV turns on
```

---

## 🎯 When to Use

✅ **Perfect for:**
- **Decouple sender and receiver** - Loose coupling
- **Implement undo/redo** - Reverse operations
- **Queue requests** - Schedule or batch operations
- **Log requests** - Audit trail of operations
- **Macro recording** - Record and replay commands
- **Transactional operations** - All-or-nothing execution

❌ **Avoid when:**
- Simple operations (overkill)
- No need for undo/redo
- Performance critical (extra object creation)

---

## ✨ Advantages

- 🔗 **Loose coupling** - Sender doesn't know receiver
- 🔄 **Easy to extend** - Add new commands without changing code
- ⏪ **Undo/Redo support** - Reverse operations easily
- 📋 **Queue operations** - Schedule or batch commands
- 📝 **Logging** - Record all operations
- 🎯 **Single Responsibility** - Each command does one thing

---

## ⚠️ Disadvantages

- 📚 **More classes** - Requires command classes
- 🔧 **More code** - Additional boilerplate
- ⚡ **Slight overhead** - Extra object creation
- 🎓 **Complexity** - Can become complex with many commands

---

## 🌟 Real-World Examples

- 📺 **Remote Control** - Each button is a command
- 🎮 **Game Controls** - Keyboard/mouse actions as commands
- 📝 **Text Editor** - Undo/redo functionality
- 🎨 **Graphics Software** - Action history, undo/redo
- 🏦 **Banking System** - Transaction logging and rollback
- 🎬 **Macro Recording** - Record and replay actions

---

## 📁 Implementation

This repository includes:
- 📺 **TV Remote Control** - Commands: Turn On, Turn Off, Increase/Decrease Volume

---

## 🔄 Advanced Features

### Command Queue
```java
public class CommandQueue {
    private Queue<Command> queue = new LinkedList<>();
    
    public void addCommand(Command command) {
        queue.add(command);
    }
    
    public void processCommands() {
        while (!queue.isEmpty()) {
            queue.poll().execute();
        }
    }
}
```

### Macro Commands
```java
public class MacroCommand implements Command {
    private List<Command> commands = new ArrayList<>();
    
    public void addCommand(Command command) {
        commands.add(command);
    }
    
    public void execute() {
        for (Command command : commands) {
            command.execute();
        }
    }
}
```

### Undo/Redo Stack
```java
public class CommandManager {
    private Stack<Command> undoStack = new Stack<>();
    private Stack<Command> redoStack = new Stack<>();
    
    public void execute(Command command) {
        command.execute();
        undoStack.push(command);
        redoStack.clear();
    }
    
    public void undo() {
        if (!undoStack.isEmpty()) {
            Command command = undoStack.pop();
            command.undo();
            redoStack.push(command);
        }
    }
}
```

---

## 💡 Best Practices

1. **Keep commands simple** - One command, one action
2. **Implement undo properly** - Store state for reversal
3. **Use command queues** - For batch processing
4. **Log important commands** - For audit trails
5. **Handle errors** - Commands should handle failures gracefully

---

## 🔗 Related Patterns

- **Composite** - Can create composite commands (macros)
- **Memento** - Can use Memento for undo/redo state
- **Prototype** - Can clone commands
- **Observer** - Can notify observers of command execution

---

<div align="center">

**Command your objects, control your system! 🎮✨**

</div>
