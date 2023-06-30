public class comidaT {
    String region;
    String nombre;
    float precio;

public comidaT(){

}
    public comidaT(String region, String nombre, float precio) {
        this.region = region;
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public void ComidaTipi(){
        System.out.println("COMIDA TIPICA");
    }
}
