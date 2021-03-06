##Static vs Instance Methods:

_Static methods_ are methods that can be called w/o creating an object, 
they belong to a class;

<br />_Instance methods_ are methods that can be called by creating an 
object of that class, instance methods define the behaviors of the object.

##Static vs Instance Variables:

_Static Variables_ we can access them w/o creating an object, and they belong to a class
and also we can call them global variables. They are available for all methods and 
same for all objects.

<br />_Instance Variables_ can only be initialized when we create an instance of 
the class [aka object]. They can be private, public etc. 

## Static block:
_Static blocks_ are used to initialize the static variables and they run every time when
class is loaded. They can be located anywhere in the class and we can have as many static blocks 
as needed. 
**EX:** static {
                    body;
                }

## Instance initializer:
We use them to intialize the instance variables and it runs as soon as an object gets created.

## Constructors:
_Constructors_ we use them to give the initial values to the instance variables 
defined by the class. Special method which gets called when an object gets created and it 
does not return anything. They are not members of the class like methods. Name must be the 
same as the class name, it should be inside the class. When it is called in the main method
it should be used with new keyword. If we don't create constructor then we have get a default 
constructor without any parameters, aka no argument constructors. With the help of constructors
we force the users of this class to provide us required data [info] for our objects states.
<br/>**_this()_** keyword with parentheses inside a constructor means that we are calling
another constructor. In order not to repeat to initialization of each instance variables
we can just call another constructor which already has initialized them.
<br/>**_this_** keyword [w/o parenthesis] is used for referencing the instance variables.

## Encapsulation:
_Encapsulation_ is used for protecting the sensitive data of the users. We need to keep 
the instance variables private so that other classes cannot directly access them or assign,
update their values. We should have getters and setters for using and updating our instance 
variables. Setter methods are used for updating the values for instance variables and 
we can implement some logic or condition to make sure that undesired, unexpected data cannot 
be input.

## this() vs this:
_this()_ is used for calling other constructors in the same class. 
_this_ is used for referring to instance variables. 

## super() vs super:
_super()_ it has to be the first statement inside the subclasses constructor and it is used for calling the 
constructor from th parent [super] class.
_super_ to refer to the variables and methods of the parent [super] class.

## Method overloading vs method overriding:
_Method overloading_ is when we have the same method name with same return 
type but they have to have different parameters [method signature must be different]
_Method overriding_ is when we inherit another class, we need to override 
the method in the parent class by implementing it in subclass. They have to
have the same name and same method signature.

## What is Inheritance:
_Inheritance_ is used when one class wants to use the features of the other
class. The class that's inherited is called parent class and the extending classes
are called subclasses[child classes]. Only public classes can be extended, 
if we try to inherit the final class then compiler will throw an error.

## What is an abstract class:
_Abstract classes_ are the classes which hide methods implementation from extending classes because 
concrete classes should implement it's methods; 
Abstract classes cannot be instantiated directly;
Abstract classes cannot be final, private because they are meant to be extended and all abstract methods
are meant to be overridden;
Abstract classes can have both abstract and non-abstract methods [any number of them];
Abstract classes can extend another abstract classes and abstract methods of the parent 
abstract class can either be implemented in the child abstract class, or they have to be
passed along to the other classes that extend it.
An abstract class can extend non-abstract class and override its methods, but we won't be 
actually invoke those methods;

## Abstract methods:
_Abstract methods_ -> methods without the body [implementation];
They can only by declared in abstract classes;
They cannot be private, final and they cannot be static because these methods are meant to
be overridden and static methods cannot be overridden;

## What is an interface in java?
_Interfaces_ in java use _interface_ keyword in definition;
They can only contain abstract classes and default methods [default methods should have
body];
Interfaces can contain variables but they are constant [public static final] and they have
to be initialized upon creation;
_Interfaces_ cannot be initialized directly, but they can be initialized by subclasses;
The purpose of interfaces is to be implemented by subclasses;
_Interfaces_ can 'extend' another interfaces;
Classes and abstract classes can implement more than one interfaces;
First concrete classes that implement interfaces must provide an implementation for all
inherited abstract methods;
Abstract classes that implement the interface can either implement the inherited methods 
or they must pass them along to their subclasses;

### EX: Convert int to String
`int a = 5;
    String s = String.valueOf(a);
    String s1 = Integer.toString(a);
`
### _Convert String to an int_
`   String s = "3";
    int a = Integer.parseInt(s);
    int b = Integer.valueOf(s);`




