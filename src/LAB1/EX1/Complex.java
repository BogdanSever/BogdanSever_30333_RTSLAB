package LAB1.EX1;

public class Complex {
    float real;
    float imag;

    public Complex(float real, float imag) {
        this.real = real;
        this.imag = imag;
    }

    public Complex() {
    }

    public float getReal() {
        return real;
    }

    public void setReal(float real) {
        this.real = real;
    }

    public float getImag() {
        return imag;
    }

    public void setImag(float imag) {
        this.imag = imag;
    }

    public Complex Addition(Complex a, Complex b){
        Complex number = new Complex(a.getReal() + b.getReal(), a.getImag() + b.getImag());
        return number;
    }

    public Complex Subtraction(Complex a, Complex b){
        Complex number = new Complex(a.getReal() + b.getReal(), a.getImag() + b.getImag());
        return number;
    }

    public Complex Multiplication(Complex a, Complex b){
        float real = a.getReal() * b.getReal() - a.getImag() * b.getImag();
        float imag = a.getReal() * b.getImag() + a.getImag() * b.getReal();
        Complex number = new Complex(real, imag);
        return number;
    }
}
