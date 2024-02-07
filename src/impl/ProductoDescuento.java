package impl;

import Interfaces.Visitable;
import Interfaces.Visitor;

public class ProductoDescuento implements Visitable{

    private double precio;

    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    @Override
    public double accept(Visitor visitor) {

        return visitor.visit(this);
    }

}
