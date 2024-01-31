package impl;

import Interfaces.Visitable;
import Interfaces.Visitor;

public class IVA implements Visitor{

    private final double impuestoNormal = 1.12;
    private final double impuestoDescuento = 1.00;

    @Override
    public double visit(ProductoNormal normal) {

        return normal.getPrecio()*impuestoNormal;
    }

    @Override
    public double visit(ProductoDescuento descuesto) {

        return descuesto.getPrecio()*impuestoDescuento;
    }

}

