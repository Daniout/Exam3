
package Datos;

import Entidades.Info;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Daniel
 */
public class Tiendatxt {
    private File archivo;
    private FileWriter aEscritura;
    private Scanner aLectura;

    public Tiendatxt() {
        this.archivo = new File("ReporteVentas.dat");
    }
    
    public Tiendatxt(String name){
        this.archivo = new File(name);
    }

   
    public File getArchivo() {
        return archivo;
    }

   
    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    
    public FileWriter getaEscritura() {
        return aEscritura;
    }

    
    public void setaEscritura(FileWriter aEscritura) {
        this.aEscritura = aEscritura;
    }

    
    public Scanner getaLectura() {
        return aLectura;
    }

    
    public void setaLectura(Scanner aLectura) {
        this.aLectura = aLectura;
    }
    
    public Info leerReport(String linea[]){
        Info i = new Info();
        i.setCodigoTienda(linea [0]);
            i.setNombreTienda(linea[1]);
                i.setCiudad(linea[2]);
                    i.setDepartamento(linea[3]);
                        i.setNombreproducto(linea[4]);
                            i.setSubtotal(Integer.valueOf(linea[5]));
                                i.setDescuento(Integer.valueOf(linea[6]));
                                    i.setDescuento(Integer.valueOf(linea[7]));
        return i;
    }
    
    
   public List<Info> leer() throws IOException{
       List<Info> list = null;
        try {
            
            this.aLectura = new Scanner(this.archivo);
            list = new ArrayList();
            while(this.aLectura.hasNext()){
                String linea[] = this.aLectura.nextLine().split(";");
                Info i = this.leerReport(linea);
                list.add(i);
            }
            
            return list;
            
        } catch (FileNotFoundException ex) {
                throw new IOException("no encontrado");
                
        }
        finally{
            if(this.aLectura!=null)
                this.aLectura.close();
        }
        
    }
   
   
   
    public boolean escribir(Info c) throws IOException{
        PrintWriter read = null;
        try{
            this.aEscritura = new FileWriter(this.archivo,true); 
            read = new PrintWriter(this.aEscritura);
            read.println(c.getDatosFileText());
            return true;
        }catch(IOException ioe){
            throw new IOException("error al abrir ");
           
        }
        finally{
            if(read!=null)
                read.close();
            
            if(this.aEscritura!=null){
                 this.aEscritura.close();
            }    
        }
    }
    
}

