package impl;

import Interfaces.Visitable;
import Interfaces.Visitor;

public class ProductoNormal implements Visitable {
    private double precio;


    @Override
    public double accept(Visitor visitor) {

        return visitor.visit(this);
    }


    public double getPrecio() {
        return precio;
    }


    public void setPrecio(double precio) {
        this.precio = precio;
    }

}
