# ADAPTER DESIGN PATTERN
The Adapter Design Pattern is a structural design pattern that allows incompatible interfaces to work together. It acts as a bridge between two incompatible interfaces by converting the interface of a class into another interface that a client expects.

### PROBLEM:
The problem arises when you have a class that has an interface that is incompatible with the one you need. This can happen when you are trying to integrate a new class into an existing system, and the new class does not conform to the expected interface.

### SOLUTION:
The solution is to create an adapter class that wraps the incompatible class and provides a compatible interface. The adapter class translates the requests from the client into the format that the incompatible class can understand.

### REAL-WORLD EXAMPLE:
The Adapter Design Pattern is commonly used in real-world applications, such as when integrating third-party libraries or APIs that have different interfaces. For example, if you are using a library that provides a method to fetch data from a database, but the method signature does not match the one you need, you can create an adapter class that wraps the library's method and provides the expected interface.

### STRUCTURE:
![Alt text](https://refactoring.guru/images/patterns/diagrams/adapter/structure-object-adapter-2x.png)
#### _Note_: This implementation uses the object composition principle: the adapter implements the interface of one object and wraps the other one. It can be implemented in all popular programming languages.

-------------------------------------------------------------------------------------------------------------------------

![Alt text](https://refactoring.guru/images/patterns/diagrams/adapter/structure-class-adapter-2x.png)
#### _Note_: This implementation uses inheritance: the adapter inherits interfaces from both objects at the same time. Note that this approach can only be implemented in programming languages that support multiple inheritance, such as C++.

### PROS:
- **_Open/Closed Principle_** - It allows for the integration of new classes into existing systems without modifying the existing code.
- **_Code Reusability_** - It promotes code reusability by allowing existing classes to be used in new contexts without modification.
- **_Single Responsibility Principle_** - You can separate the interface or data conversion code from the primary business logic of the program.

### CONS:
- **_Increased Complexity_** - It can increase the complexity of the codebase by introducing additional classes and interfaces.
- **_Performance Overhead_** - It can introduce a performance overhead due to the additional layer of abstraction.
- **_Maintenance Overhead_** - It can make the code harder to maintain if not implemented correctly, as it can introduce additional dependencies and increase the number of classes in the codebase.

## CONCLUSION:
The Adapter Design Pattern is a powerful tool for integrating incompatible interfaces and promoting code reusability. It allows for the creation of flexible and maintainable codebases by separating concerns and providing a clear interface for clients to interact with. However, it is essential to use this pattern judiciously, as it can introduce complexity and performance overhead if not implemented correctly.