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






