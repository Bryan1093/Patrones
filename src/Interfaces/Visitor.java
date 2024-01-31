package Interfaces;

import impl.ProductoNormal;
import impl.ProductoDescuento;

public interface Visitor {
    double visit(ProductoNormal normal);
    double visit(ProductoDescuento descuesto);

}
