# S1.06_Generics

## Statments:

# Exercici 1 
Crea una classe anomenada NoGenericMethods que emmagatzemi tres arguments del mateix tipus, juntament amb: un constructor que els inicialitzi, i mètodes getElement1(), getElement2(), getElement3() per accedir-hi. Comprova que pots passar els arguments en qualsevol ordre al constructor.
Aquest exercici serveix per comparar després el comportament amb una versió genèrica.

# Exercici 2 

Crea una classe Person amb els atributs name, surname i age. Després, crea una classe anomenada GenericMethods amb un mètode genèric anomenat printElements() que accepti tres arguments de tipus genèric i els imprimeixi per pantalla.
Al main() de la classe principal, crida aquest mètode amb diferents tipus de paràmetres (per exemple: un objecte Person, un String i un valor numèric primitiu).
Amb aquest exercici verificaràs que els mètodes genèrics poden acceptar qualsevol combinació de tipus i en qualsevol ordre.

## Funcionalitats

NoGenericMethods
Store three values of the same static type (e.g., String).
Constructor and getter methods for each element.
Demonstrates that constructor parameters may be passed in any order (type-same requirement).

GenericMethods

printElements(T a, T b, T c) — a static generic method with three type parameters <T>.
Prints the three arguments preserving their specific types (autoboxing will handle primitives).
Example usages in main showing mixed types: Person, String, int.
Person
Simple DTO with name, surname, age and a toString() representation for readable console output.

## Tecnologies

Backend: Java
Build: Maven or Gradle

## Instalation

Clone tge repository
mvn clean compile
mvn -Dexec.mainClass="your.package.Main" exec:java
Replace your.package.Main with the package-qualified Main class containing examples.
Ejecutar desde un IDE
Import the project into IntelliJ IDEA/Eclipse/VSCode and run the Main class.

## Technical decisions

Keep classes small and single-responsibility: Person (data), NoGenericMethods (non-generic container), GenericMethods (generic utilities).
Use a static generic method printElements(A,B,C) to demonstrate that each parameter can have an independent compile-time type.
Prefer toString() implementations for simple, readable console output during examples and tests.
GenericMethods.printElements(...) executes without exceptions and prints expected textual output. 
