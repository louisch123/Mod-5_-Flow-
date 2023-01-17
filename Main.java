class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");

    // Comparison_Relational Operators> Ture/False Statements Found in Condtional, If/Else, Loops to 
    int x = 5;
if (x > 0) {
    //This statement will print if x > 0 is true
    System.out.println("X is greater than 0");
}

for (int i = 0; i < 5; i++) {
    //This statement will print as long as i is less than 5 but not inclusive of 5. Meaning it will 
    //only print 4 times.
    System.out.println("the value of i is: " + i);
}
    //
    int m = 8;
    int y = 6;
    System.out. println( m == y);//'=='equals
    System.out.println( m != y);// '!='Not equal
    System.out.println( m > y); // '>' Greater Than
    System.out.println( m < y); // "<" less than
    System.out.println (m >= y);  // '>=' Greater than or equal to
    System.out.println (m<= y); //'<=' Less than or equal to
    
    System.out.println();
    // Reassign the value of y
    y = m; // y = 8; 
    System.out. println( m == y);//'=='equals
    System.out.println( m != y);// '!='Not equal
    System.out.println( m > y); // '>' Greater Than
    System.out.println( m < y); // "<" less than
    System.out.println (m >= y);  // '>=' Greater than or equal to
    System.out.println (m<= y); //'<=' Less than or equal to
    
    System.out.println();
    //if/else
    y = m; // y = 8
    if (m > 8){
      System.out.println("I am learning so much!!");
      
    } 
    else{
      System.out.println("My condition did not evaluate to true!");
    }
    System.out.println();
    //if/else
    y = m; // y = 8
    if (m >= 8){
      System.out.println("I am learning so much!!");
      
    } 
    else{
      System.out.println("My condition did not evaluate to true!");
    } 
    System.out.println();
    // Boolean Logic Operators
    int p = 9;
if (p >= 0 && p <= 10) {
    // number is between 0 and 10 (inclusive)
}
   // Logicical Operators Boolean > In order for the sum to be true each condition has to be meet
    /* && - AND
    || - OR
    ! - NOT*/
    int t = 8;
    int k = 6;
    System.out.println( t < 10 && t == 8 );//true
    System.out.println(t<10 && t == k);// false
    System.out.println( t < k || t < 4);// False 
    System.out.println(t > k || t < 4);//True
    System.out.println();
    //negate- NOT Operator
    System.out.println(!( t < 10 && t == 8 ));//flase

    //If/Else

    int u = 0;
if (u < 10) {
  System.out.println("u is less than 10");
}
    System.out.println();
    int l = 6;
    if (l < 0) {
  System.out.println("l is a negative number");
} else if (l > 5) {
  System.out.println("l is greater than 5");
} else if (l > 100) {
  System.out.println("l is greater than 100");
}
   /* // Nested If Statement
    System.out.println();
    char letter = 'b';
int number = 10;
if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u'); {
  if (number % 2 == 0) {
    System.out.println("Letter is a vowel. Number is Even.");
  } else {
    System.out.println("Letter is a vowel. Number is Odd.");
  }
} else {
  if (number % 2 == 0) {
    System.out.println("Letter is a Consonant. Number is Even.");
  } else {
    System.out.println("Letter is a Consonant. Number is Odd.");
  }
}*/
    int h = 5;
      if (h<10){
      System.out.println("h is greater than 10");
      }
    else {
      System.out.println("h is less than 10");
    }
    System.out.println("End of Application");

    System.out.println();
    int n = 5;
    if(n <= 8){
      System.out.println("N is 0 or less");
    }
    else if(n<5){
      System.out.println("N is more than 0, but less than 6");
    }
    else if(n == 2){
      System.out.println("N is equal to 2");
    }
    else{
      System.out.println("N 5 or greater");
    }
    System.out.println("End of Application");

    // Switch Statements
    int number = 1;
switch (number) {// Default case
  case 0:
    System.out.println("The number is 0");
  case 1:
    System.out.println("The number is 1");
  case 2:
    System.out.println("The number is 2");
  case 3:
    System.out.println("The number is 3");
  default:
    System.out.println("I don't recognize the number");
}
    System.out.println();
    //Break Statements
    switch (number) {
  case 0:
    System.out.println("The number is 0");
    break;
  case 1:
    System.out.println("The number is 1");
    break;
  case 2:
    System.out.println("The number is 2");
    break;
  case 3:
    System.out.println("The number is 3");
    break;
  default:
    System.out.println("I don't recognize the number");
}
    System.out.println();
    char letter = 'A';
    switch (letter){
      case 'A':
        System.out.println("A for Assembly");
        break;
      case 'B':
        System.out.println("B for Binary");
        break;
      case 'C':
        System.out.println("C for Compliation");
        break;
      default:
        System.out.println("There are too many letters");
        break;
    }
  }
}