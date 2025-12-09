# Level 3 Task 2 – Multithreaded Chat Application

This is a console-based chat application allowing multiple users to chat simultaneously.  
It demonstrates **Java networking** and **multithreading** concepts.

## Features

- Multiple clients can connect to the server  
- Broadcast messages to all connected clients  
- Clients can join and leave dynamically  
- `/quit` command to exit the chat  

## How It Works

1. **ChatServer** starts and listens for client connections  
2. Each client runs **ChatClient** and connects to the server  
3. Server creates a **ClientHandler thread** for each client  
4. Messages from one client are broadcast to all others  
5. Users can exit the chat by typing `/quit`  

## Skills Used

- Java Sockets (ServerSocket, Socket)  
- Multithreading (Runnable, Thread)  
- Console input/output  
- Object-Oriented Programming  

This task is part of **Level 3 Tasks** in the Codveda Internship and demonstrates concurrent programming and networking in Java.
