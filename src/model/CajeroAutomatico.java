package model;

public class CajeroAutomatico extends CuentaBancaria{

    public CajeroAutomatico(String cuenta, int val, int tipo) {
        procesar(cuenta,val,tipo);
    }
    @Override
    public void confirmar() {
        System.out.println("Su contraseña es correcta, transaccion realizada");
    }

    @Override
    public void auditoria() {
        super.auditoria();
        System.out.println("Retire su recibo");
    }
}
