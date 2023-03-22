
// public class OOPS {
//     public static void main(String[] args) {
//         Pen p1 = new Pen();
//         p1.setcolor("blue");
//         System.out.println(p1.getcolor());
//         p1.setsize(5);
//         System.out.println(p1.getsize());
// p1.setsize(15);
// System.out.println(p1.size);
// p1.color = "yellow";
// System.out.println(p1.color);
// Bankaccount myacc = new Bankaccount();
// myacc.username = "sohail";
// System.out.println(myacc.username);
// myacc.pwd(4564);

//     }
// }

// class Bankaccount {
//     public String username;
//     private int password;
//     public void pwd(int pwwd) {
//         password = pwwd;
//     }
// }

// class Pen {
//     private String color;
//     private int size;

//     String getcolor() {
//         return this.color;
//     }

//     int getsize() {
//         return this.size;
//     }

//     void setcolor(String newcolor) {
//         color = newcolor;
//     }

//     void setsize(int newsize) {
//         size = newsize;
//     }
// }

// class Student {
//     String name;
//     int age;
//     float percentage;

//     void setname(String newname) {
//         name = newname;
//     }

//     void setage(int newage) {
//         age = newage;
//     }

//     void percentage(int math, int phy, int chem) {
//         percentage = (phy + math + chem) / 3;
//     }
// }

// public class OOPS {

//     public static void main(String[] args) {
//         // student s1=new student();
//         student s2=new student("sohail");
//         System.out.println(s2.name);

//     }
// }

// class student{
//     String name;
//     int rollno;
// // Non-Parameterised constructor
//     // student(){
//     //     System.out.println("sohail");
//     // }
//     student(String name){
//         this.name=name;
//     }
//     student(int rollno){
//         this.rollno=rollno;

//     }
// }

/**
 * OOPS
 */
// public class OOPS {

// public static void main(String[] args) {
// Student s1 = new Student();
// s1.setname("sohail");
// s1.setroll(531);
// s1.pass = "abc";
// s1.marks[0]=100;
// s1.marks[1]=90;
// s1.marks[2]=80;
// Student s2 = new Student(s1);
// s1.marks[2]=100;
// s2.pass = "xyz";
// System.out.println(s2.name);
// System.out.println(s2.pass);
// System.out.println(s2.roll);
// for(int i=0;i<3;i++){
// System.out.println(s1.marks[i]);
// }
// }
// }

// class Student {
// String name;
// int roll;
// String pass;
// int marks[];
// Shallow Copy

// Student(Student s1) {
// marks = new int[3];
// this.name = s1.name;
// this.roll = s1.roll;
// this.pass = pass;
// this.marks=marks;
// }

// Deep Copy

// Student(Student s1) {
// marks = new int[3];
// this.name = s1.name;
// this.roll = s1.roll;
// for (int i = 0; i < marks.length; i++) {
// this.marks[i]=s1.marks[i];
// }
// }
// Student() {
// marks = new int[3];
// }

// String getstudent() {
// return this.name;
// }

// int getroll() {
// return this.roll;
// }

// void setname(String newname) {
// name = newname;
// }

// void setroll(int newroll) {
// roll = newroll;
// }
// }

// Inheritence
// public class OOPS {

// public static void main(String[] args) {
// Human h1 = new Human();
// h1.eats();
// h1.fins = 0;
// System.out.println(h1.fins);
// Gorilla g1=new Gorilla();
// g1.eats();
// }
// }

// class Animal {
// String colour;

// void eats() {
// System.out.println("it is eating");
// }

// void legs() {
// System.out.println("it has legs");
// }

// void swims() {
// System.out.println("it swims");
// }
// }

// Multi-level inheritence
// class Mammals extends Animal {
// int fins;

// void brain() {
// System.out.println("humans has brain");
// }
// }

// class Human extends Mammals {
// String name;
// void thinking() {
// System.out.println("he is thinking");
// }

// }
// // Hierarchical inheritence
// class Gorilla extends Animal {
// int size;
// void shouting() {
// System.out.println("gorrilla is shouting");
// }
// }

// hybrid inheritence
// public class OOPS {

// public static void main(String[] args) {
// Dog d1 = new Dog();
// d1.eat();

// }
// }

// class Mammals {
// String color;

// void eat() {
// System.out.println("eating...");
// }

// void happy() {
// System.out.println(" happy...");
// }
// }

// class Human extends Mammals {
// String name;

// void brain() {
// System.out.println("human has brain");
// }

// void ability() {
// System.out.println("human has the ability");
// }
// }

// class Animal extends Human {
// String breed;

// void wild() {
// System.out.println("animal are wild");
// }
// }

// class Dog extends Animal {
// String breed;
// void barking() {
// System.out.println("dogs will bark");
// }
// }

// method overidding
// public class OOPS {

// public static void main(String[] args) {
// Deer d1=new Deer();
// d1.eats();
// }
// }
// class Animal{
// void eats(){
// System.out.println("animal eats");
// }
// }
// class Deer extends Animal{
// void eats(){
// System.out.println("deer eats grass");
// }
// }

// Abstract class
// public class OOPS {

// public static void main(String[] args) {

// }
// }

// abstract class Animal {
// void eats(){
// System.out.println("animal eats");
// }
// abstract void walks();
// }

// class Horse extends Animal{
// void walks(){
// System.out.println("walk`s on``");
// }
// }

// Checking which constructor gets executed first

// public class OOPS {

// public static void main(String[] args) {
// Frog f1=new Frog();

// }
// }
// class Animal{
// Animal(){
// System.out.println("Animal constructor is called");
// }
// void eats(){
// System.out.println("animal is eating");
// }
// }
// class Horse extends Animal{
// Horse(){
// System.out.println("Horse constructor is called ");
// }
// void run(){
// System.out.println("horse is running");
// }
// }
// class Frog extends Horse{
// Frog(){
// System.out.println("frog constructor is called");
// }
// void jumps(){
// System.out.println("frog is jumping");
// }
// }

// Interfaces
// public class OOPS {
// public static void main(String[] args) {
// Queen q1 = new Queen();
// q1.moves();
// }
// }

// interface Chessplayer {
// void moves();
// }

// class Queen implements Chessplayer {
// public void moves() {
// System.out.println("up,down,left,rigth,in every 4 direction");
// }
// }

// class Rook implements Chessplayer {
// public void moves() {
// System.out.println("up,down but only 2 steps");
// }
// }

// MULTIPLE Inheritence
// public class OOPS {

//     public static void main(String[] args) {
// Bear b1=new Bear();
// b1.eats();
//     }
// }

// interface Herbivor {
//     void eats();
// }

// interface Carnivor {
//     void eats();
// }
// class Bear implements Herbivor,Carnivor{
//    public void eats(){
//         System.out.println("both grass and meat");
//     }
// }


// Static keyword

// public class OOPS {

//     public static void main(String[] args) {
//         Student s1=new Student();
//         s1.schoolname="TKR";
//         Student s2=new Student();
//         System.out.println(s2.schoolname);
//         s2.schoolname="CHAITANIYA";
//         System.out.println(s2.schoolname);
//     }
// }

// class Student{
//     static int returnpercentage(int maths,int chem,int phy){
//         return returnpercentage(maths, chem, phy)/3;
//     }
//     String name;
//     int roll;
//     static String schoolname;
//     void setname(String name){
//         this.name=name;
//     }
//     String getname(){
//         return this.name; 
//     }
// }





   
