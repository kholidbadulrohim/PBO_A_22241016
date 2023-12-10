package com.tutorial;

class lingkaran {
    float r;
    float diameter;

    public lingkaran (float r, float diameter) {
        this.r = r;
        this.diameter = diameter;
    }

    void display(){
        float luas = (float)(Math.PI*r*r);
        float keliling = (float)(2*3.14*r);
        System.out.println("keliling lingkaran"+luas);
        System.out.println("luas keliling"+keliling);
    }

    public class main {
        
    }

    public static void main(String[] args) throws Exception {
      lingkaran lingkaran = new lingkaran(40,70);
      System.err.println("jari-jari:"+lingkaran.r);
      System.out.println("diameter:"+lingkaran.diameter);
      lingkaran.display();
    }
}