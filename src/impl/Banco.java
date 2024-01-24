package impl;

import Interfaces.IAprobador;

public class Banco implements IAprobador {

    private IAprobador next;

    @Override
    public IAprobador getNext() {
        return next;
    }

    @Override
    public void solicitudPrestamo(int monto) {
        // Llama al método solicitudPrestamo del primer aprobador en la cadena
        if (next != null) {
            next.solicitudPrestamo(monto);
        } else {
            System.out.println("No hay aprobadores configurados. La solicitud no puede ser procesada.");
        }
    }

    @Override
    public void setNext(IAprobador aprobador) {
        next = aprobador;
    }
}
