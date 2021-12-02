
package Datos;

import Entidades.Info;
import java.io.IOException;
import java.util.List;

/**
 *
 * @author Daniel
 */
public interface IArchivoTienda {
    public List<Info> leer() throws IOException;
    public boolean escribir(Info i) throws IOException;
}
