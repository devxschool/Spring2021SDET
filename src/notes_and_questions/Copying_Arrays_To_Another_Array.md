#Array in java can be copied to another array using the following ways.

##Using variable assignment. 
_EX:_
    int [] numbers = {1,2,3,4,5};
    int [] numbersCopy = numbers;
This method has side effects as changes to the element of an array reflects on both the places. 
To prevent this side effect following are the better ways to copy the array elements.


##Create a new array of the same length and copy each element.
Loop through the existing array and assign the values of the existing array to the new one.
_EX:_
    int [] numbers = {1,2,3,4,5};
    int [] numbersCopy = new int[numbers.length];
    

##Use the clone method of the array. Clone methods create a new array of the same size.
_EX:_
    int [] numbers = {1,2,3,4,5};
    int [] numbersCopy = numbers.clone();

##Use System.arraycopy() method. arraycopy can be used to copy a subset of an array.
_EX:_
    int[] arrayCopyNumbers = new int[3];
    System.arraycopy(numbers, 1, arrayCopyNumbers, 0, 3);