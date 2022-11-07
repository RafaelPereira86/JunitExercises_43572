package org.example;

public class Calculdora_Area {

    public int area(int base, int altura){
        return base*altura;
    }
    public int perimetro(int base, int altura){
        return 2*base + 2* altura;
    }
    public int isTriangle(int a,int b,int c){
        if((a + b > c ) && (b + c > a) && (a + c >b)){
            return 1;
        }
        return 0;
    }

}
