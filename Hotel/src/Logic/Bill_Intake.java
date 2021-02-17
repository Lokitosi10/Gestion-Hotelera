package Logic;

/**
 *
 * @author Santiago Galindo
*/

public class Bill_Intake {
    
    private String f_consumo;
    private short q_cantidadPedida;
    
    
    /* Constructor */
    public Bill_Intake(){  
        f_consumo = "";
        q_cantidadPedida = 0;
    }
    
    /* Getter */
    public String getF_consumo() {
        return f_consumo;
    }

    public short getQ_cantidadPedida() {
        return q_cantidadPedida;
    }

    /*Setters*/
    public void setQ_cantidadPedida(short q_cantidadPedida) {
        this.q_cantidadPedida = q_cantidadPedida;
    }
    
    public void setF_consumo(String f_consumo) {
        this.f_consumo = f_consumo;
    }
}
