// import java.util.Scanner;
//Hollow rectangle
/*public class pattern {
    public static void hallow_rectangle(int totlrows,int totlcols){
        for (int i = 1; i <=totlrows; i++) {
            for (int j = 1; j <=totlcols; j++) {
                if (i==1||i==totlrows||j==1||j==totlcols) {
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        hallow_rectangle(4, 5);
    }
}*/

//Inverted half pyramid

/*public class pattern {
public static void inverted_half_pyramid(int n){
    //outer
for (int i = 1; i<=n; i++) {
    // spaces
    for (int j = 1; j <=n-i; j++) {
        System.out.print(" ");
    }
    //stars
    for (int j = 1; j <=i; j++) {
        System.out.print("*");
    }
    System.out.println();
}
}
    public static void main(String[] args) {
        inverted_half_pyramid(4);
    }
}*/

// Inverted half pyramid with numbers

/*public class pattern {
public static void inverted_half_pyramid_numbers(int n){
    //liners or outer loop
    for (int i = 1; i <=n; i++) {
        for (int j = 1; j <=n-i+1; j++) {
            System.out.print(j);
        }
        System.out.println();
    }
}
    public static void main(String[] args) {
        inverted_half_pyramid_numbers(5);
    }
}*/

//Floyd's triangle
/*public class pattern {
public static void Floyds_triangle(int n){
    int counter=1;
    for (int i = 1; i <=n; i++) {
        for (int j = 1; j <=i; j++) {
            System.out.print(counter+" ");
            counter++;
        }
        System.out.println();
    }
}
    public static void main(String[] args) {
        Floyds_triangle(5);
    }
}*/

//0-1 triangle
/*public class pattern {
public static void triangle_0_1(int n){
for (int i = 1; i <=n; i++) {
    for (int j = 1; j <=i; j++) {
        if ((i+j)%2==0) {
            System.out.print("1");
        }else  {
            System.out.print("0");
        }
    }
    System.out.println();
}
}
    public static void main(String[] args) {
        triangle_0_1(5);
    }*/


//Butterfly pattern

/*public class pattern {
public static void butterfly(int n){
    //outer loop
    for (int i = 1; i <=n; i++) {
        //stars
        for (int j = 1; j <=i; j++) {
            System.out.print("*");
        }
        //spaces
        for (int j = 1; j <=2*(n-i); j++) {
            System.out.print(" ");
        }
        //stars
        for (int j = 1; j <=i; j++) {
            System.out.print("*");
        }
        System.out.println();
    }
    //2nd half
    for (int i = n; i>=1; i--) {
        //stars -i
        for (int j = 1; j <=i; j++) {
            System.out.print("*");
        }
        //spaces 2*(n-i)
        for (int j = 1; j <=2*(n-i); j++) {
            System.out.print(" ");
        }
        //stars-i
        for (int j = 1; j <=i; j++) {
            System.out.print("*");
        }
        System.out.println();
}
}
    public static void main(String[] args) {
        butterfly(4);
    }
}*/

//Solid rhombus pattern

/*public class pattern {
public static void rohmbus(int n){
    for (int i = 1; i <=n; i++) {
        //spaces
        for (int j = 1; j <=n-i; j++) {
            System.out.print(" ");
        }
        //stars
        for (int j = 1; j <=n; j++) {
            System.out.print("*");
        }
        System.out.println();
    }
}
    public static void main(String[] args) {
        rohmbus(5);
    }
}*/

//hallow rhombus
// 


// Diamond pattern

/*public class pattern {
public static void Diamond_pattern(int n){
    //outer loop
    for (int i = 1; i <=n; i++) {
        //spaces
        for (int j = 1; j <=n-i; j++) {
            System.out.print(" ");
        }
        //stars
        for (int j = 0; j <=2*(i-1); j++) {
            System.out.print("*");
        }
        System.out.println();
        
    }
    for (int i = n; i>=1; i--) {
        for (int j = 1; j <=n-i; j++) {
            System.out.print(" ");
        }
        //stars
        for (int j = 0; j <=2*(i-1); j++) {
            System.out.print("*");
        }
        System.out.println();
    }
}
    public static void main(String[] args) {
        Diamond_pattern(4);
    }
}*/


//Numbers pyramid

/*public class pattern {
public static void numbers_pyramid(int n){
    //outer loop
    for (int i = 1; i <=n; i++) {
        //spaces
        for (int j = 1; j <=n-i; j++) {
            System.out.print(" ");
        }
        //numbers 
        for (int j = 1; j <=i; j++) {
            System.out.print(i+" ");
        }
        System.out.println();
    }

}
    public static void main(String[] args) {
        numbers_pyramid(5);
    }
}*/

// Palindromic pattern with numbers

/*public class pattern {
public static void palindromic_pattern_numbers(int n){
    //outer loop
    for (int i = 1; i <=n; i++) {
        //spaces
        for (int j = 1; j <=n-i; j++) {
            System.out.print(" ");
        }
        //desceding
        for (int j = i; j>=1; j--) {
            System.out.print(j);
        }
        //ascending
        for (int j = 2; j <=i; j++) {
            System.out.print(j);
        }
        System.out.println();
    }

}
    public static void main(String[] args) {
        palindromic_pattern_numbers(5);
    }
}*/