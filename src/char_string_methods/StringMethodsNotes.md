#String methods.Methods

###public String substring(int start)

####Definition:
*substring method has 2 constructors:
1- string.substring(int starting index);
2- string.substring(int starting index[inclusive], int ending index[exclusive]);*

Ex: *"Chicago"* -> "Chicago".substring(3) -> "cago";
 "Los Angeles".substring(4,9) -> "Angel";

### String.length()

####Definition:
*.length() method does not take any arguments and it returns the length of given string(number os characters)*

Ex: "Virginia Beach".length() -> 14;

####Task for substring() and concat()
Ex: Given string "abcde" -> we want to rearrange the order of sub parts as "de"+"abc"
 -> final string should be "deabc";

Solution strategy: 1. String firstPart = "abcde".substring(0,3);
2. String secondPart = "abcde".substring("abcde".length()-2);
3. String finalString = secondPart.concat(firstPart); 

String.concat(second String) -> method is used to concatenate 2 strings by adding them.



