public class FVendible implements Filtrable{
    @Override
    public boolean cumpleFiltro(Producto producto) {
        return producto.getPrecio() > 0;
    }
}
