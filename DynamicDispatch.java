/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package soal2;

/**
 *
 * @author DELL
 */
public class DynamicDispatch {
    public static void main(String[] args) {
        Class_A a = new Class_A();
        Class_B b = new Class_B();
        Class_C c = new Class_C();
        Class_A ref;
        
        ref = b;
        ref.callthis();
        
        ref = c;
        ref.callthis();
        
        ref = a;
        ref.callthis();
    }
}
