package com.driver;

public class Main {
    public static void main(String[] args) {

        Product p =new Product();
        int A1 = p.product(10, 20);
        int A2 =p.product(10,20,30);
        double A3 =p.product(10.0,30.0);
        System.out.println(A1+A2+A3);   }
    public static class Product{

        public int product(int x, int y){

            return x*y;
        }
        public int product(int x, int y,int z){

            return x*y*z;
        }
        public double product(double x, double y){

            return x*y;
        }

    }

}