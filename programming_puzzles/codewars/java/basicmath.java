package codewars;

public class basicmath {
    
  public static Integer basicMath(String op, int v1, int v2)
  {
    switch(op) {
        case "+":
          return v1+v2;
        case "-":
          return v1-v2;
        case "*":
          return v1*v2;
        case "/":
          return v1/v2;
        default:
          return 0;
    }
  }

}
