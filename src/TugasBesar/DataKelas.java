package TugasBesar;
import java.util.Scanner;
import java.io.*;
public abstract class DataKelas implements Serializable{
Kelas kls = new Kelas();
Scanner scan = new Scanner(System.in);
Double luasruang, rasioruang;
String x = "Sesuai", y = "Tidak Sesuai"; 
String a1,a2,a3,a4;
String b1,b2,b3,b4,b5,b6,b7;
String c1,c2,c3,c4;
String d1,d2,d3,d4,d5;
String e1,e2,e3,e4,e5;
String f1,f2,f3,f4;
String bentuk;
Double n1 = 0.0, persen1;
Double n2 = 0.0, persen2;
Double n3 = 0.0, persen3;
Double n4 = 0.0, persen4;
Double n5 = 0.0, persen5;
Double n6 = 0.0, persen6;
//method di bawah ini untuk semua subclasses . . .

abstract void in();
abstract void out();
}
