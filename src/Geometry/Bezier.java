package Geometry;

import Geometry.ACurve;

public class Bezier extends ACurve {
    private int a;
    private int b;
    private int c;
    private int d;

    Bezier(int a,int b,int c,int d){
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
}
