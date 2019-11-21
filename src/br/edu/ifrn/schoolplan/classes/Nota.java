package br.edu.ifrn.schoolplan.classes;

public class Nota {

    private int n1, n2, n3, n4;
    private int p1, p2, p3, p4;
    private double notaFinal;
  

    public Nota() {
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
        this.n4 = n4;
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
        this.p4 = p4;
    }

    public double calcularAritmetica(double n1, double n2, double n3, double n4){
        notaFinal= (n1 +n2 +n3+ n4)/4;
        return notaFinal;
    }
    public void calcularPonderada(double n1, double n2, double n3, double n4){
        notaFinal=(n1*p1 +n2*p2 +n3*p3+ n4*p4)/p1+p2+p3+p4;
    }

    public void setNotaFinal(double notaFinal) {
      this.notaFinal= notaFinal;
    }

    public void setN1(int n1) {
        this.n1 = n1;
    }

    public void setN2(int n2) {
        this.n2 = n2;
    }

    public void setN3(int n3) {
        this.n3 = n3;
    }

    public void setN4(int n4) {
        this.n4 = n4;
    }

    public void setP1(int p1) {
        this.p1 = p1;
    }

    public void setP2(int p2) {
        this.p2 = p2;
    }

    public void setP3(int p3) {
        this.p3 = p3;
    }

    public void setP4(int p4) {
        this.p4 = p4;
    }


    public int getN1() {
        return n1;
    }

    public int getN2() {
        return n2;
    }

    public int getN3() {
        return n3;
    }

    public int getN4() {
        return n4;
    }

    public int getP1() {
        return p1;
    }

    public int getP2() {
        return p2;
    }

    public int getP3() {
        return p3;
    }

    public int getP4() {
        return p4;
    }

    public double getNotaFinal() {
        return notaFinal;
    }




}
