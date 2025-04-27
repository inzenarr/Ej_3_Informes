public class Cliente {
    public static void main(String[] args) {
        ArchivoFinal archivo = new ArchivoFinal();

        archivo.setTipo(new pdf());
        archivo.determinarInforme();

        archivo.setTipo(new html());
        archivo.determinarInforme();

        archivo.setTipo(new excel());
        archivo.determinarInforme();
    }
}
