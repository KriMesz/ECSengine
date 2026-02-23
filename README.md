# ECSengine
Project Goal

The goal of this project was to create a simple Entity–Component–System (ECS) framework with an event system. The project focuses on organizing program logic in a clear and modular way, suitable for games, simulations and other future projects. In the future, the system should be able to load modules automatically, like plug-ins, with a focus on customisation.

Solution

One challenge was keeping game logic separate from data. This was solved by using components only for data storage and systems only for logic. This is the main reason why ECS architecture was choosen.
Another challenge was allowing different parts of the program to communicate without being directly dependent on each other due to possible conflicts due to ordering of systems happening, or logic happening on a later frame. This was addressed by implementing an event system, where systems can react to events through listeners.
Managing all entities, systems, and events in one place was handled by a central world class, which keeps the program organized and easier to extend.
