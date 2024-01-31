package model;

import Interfaces.Visitor;
import impl.IVA;
import impl.ProductoDescuento;
import impl.ProductoNormal;

public class AppVisitor {
    public static void main(String[] args) {
        ProductoDescuento descuento = new ProductoDescuento();
        descuento.setPrecio(150);

        ProductoNormal normal = new ProductoNormal();
        normal.setPrecio(150);

        Visitor iva = new IVA();

        double res1 = descuento.accept(iva);
        double res2 = normal.accept(iva);

        System.out.println(res1);
        System.out.println(res2);
    }
}