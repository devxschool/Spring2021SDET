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






