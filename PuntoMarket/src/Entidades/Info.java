
package Entidades;

/**
 *
 * @author Daniel
 */
public class Info {
 private String codigoTienda,nombreTienda,ciudad,departamento,nombreproducto;
 private double subtotal,descuento,total;

    public Info() {
    }

    public Info(String codigoTienda,String nombreTienda, String ciudad, String departamento, String nombreproducto, double subtotal, double descuento, double total) {
        this.codigoTienda = codigoTienda;
        this.nombreTienda = nombreTienda;
        this.ciudad = ciudad;
        this.departamento = departamento;
        this.nombreproducto = nombreproducto;
        this.subtotal = subtotal;
        this.descuento = descuento;
        this.total = total;
    }

    public String getCodigoTienda() {
        return codigoTienda;
    }

    public void setCodigoTienda(String codigoTienda) {
        this.codigoTienda = codigoTienda;
    }
    

    public String getNombreTienda() {
        return nombreTienda;
    }

    public void setNombreTienda(String nombreTienda) {
        this.nombreTienda = nombreTienda;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getNombreproducto() {
        return nombreproducto;
    }

    public void setNombreproducto(String nombreproducto) {
        this.nombreproducto = nombreproducto;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

   
    
    public String getDatosFileText(){ 
        return this.codigoTienda+";"+
                    this.nombreTienda+";"+ 
                        this.ciudad+";"+ 
                            this.departamento+";"+ 
                                this.nombreproducto+";"+
                                    this.subtotal+";"+
                                        this.descuento+";"+
                                            this.total; 
    }

  
    
}

