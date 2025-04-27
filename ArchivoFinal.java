public class ArchivoFinal {
    private tipoInforme tipo;

    //establece la estrategia de ruta en tiempo de ejecución
    public void setTipo(tipoInforme tipo) {
        this.tipo = tipo;
    }

    public void determinarInforme(){
        tipo.informe();
    }
}
