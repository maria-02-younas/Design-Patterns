# SINGLETON DESIGN PATTERN
Singleton design pattern is creational design pattern that restricts the instantiation of a class to one single instance. This is useful when exactly one object is needed to coordinate actions across the system. 

### PROBLEM:
The problem with creating multiple instances of a class is that it can lead to inconsistent states and unpredictable behavior. For example, if you have a class that manages a connection to a database, having multiple instances of that class could lead to multiple connections being opened, which could cause issues with data integrity and performance.

### SOLUTION:
The solution to this problem is to create a singleton class that ensures that only one instance of the class can be created. This is typically done by making the constructor of the class private and providing a static method that returns the single instance of the class. This way, any code that needs to use the class can do so through the static method, ensuring that only one instance is created.

### REAL-WORLD EXAMPLE:
- Database connection manager - **_for example_**, a class that manages a connection pool and ensures that only one connection is used at a time
- Logging framework - **_for example_**, a logger that writes to a file or console
- Configuration manager - **_for example_**, a class that reads configuration settings from a file and provides access to those settings

### STRUCTURE:
![Singleton Design Pattern](https://lh7-us.googleusercontent.com/j1UFUqD4vS_Ymfm6eSFUJ_fiJ0S-mUGzOtQ-C40Qdq1_xVTsUqLVnX44LJcEtJL98a8bD7wyvYiAYgDgVN93hYIiUjOtHd9hGVF4cMytlJiDfQJyx09I42ICsnbQohY9Pkzgk_gOLqDKoNM_bbV59sA)
#### _Note_: The above image is a representation of the singleton design pattern. The Singleton class declares the static method getInstance that returns the same instance of its own class. It's constructor should be hidden from the client code. Calling the getInstance method should be the only way of getting the object.

### PROS:
- **_Controlled access to the sole instance_** - The singleton pattern ensures that there is only one instance of the class, which can help to prevent issues with multiple instances being created.
- **_Lazy initialization_** - The singleton pattern allows for lazy initialization, meaning that the instance of the class is not created until it is needed. This can help to improve performance and reduce memory usage.
- **_Global access point_** - The singleton pattern provides a global access point to the instance of the class, making it easy to use throughout the application.
- **_Reduced memory footprint_** - Since only one instance of the class is created, it can help to reduce memory usage compared to creating multiple instances of the class.

### CONS:
- **_Global state_** - The singleton pattern can lead to global state, which can make it difficult to test and debug the application. This can also lead to issues with concurrency and thread safety.
- **_Tight coupling_** - The singleton pattern can lead to tight coupling between classes, making it difficult to change or replace the singleton class without affecting other parts of the application.
- **_SRP_** - The singleton pattern can violate the Single Responsibility Principle (SRP) if the singleton class is responsible for multiple tasks. This can make the code more difficult to maintain and understand.
- **_Hidden dependencies_** - The singleton pattern can hide dependencies between classes, making it difficult to understand how the classes are related and how they interact with each other. This can make the code more difficult to maintain and understand.

## CONCLUSION: 
The singleton design pattern is a useful pattern for ensuring that only one instance of a class is created. It can help to prevent issues with multiple instances being created and can provide a global access point to the instance of the class. However, it can also lead to issues with global state, tight coupling, and hidden dependencies, so it should be used with caution.