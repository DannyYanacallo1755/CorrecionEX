public class comidaS extends comidaT{
    String ingredienteP;
    String Estrella;
    public comidaS(){
        super();
    }

    public comidaS(String region, String nombre, float precio, String ingredienteP, String estrella) {
        super(region, nombre, precio);
        this.ingredienteP = ingredienteP;
        this.Estrella = estrella;
    }

    public String getIngredienteP() {
        return ingredienteP;
    }

    public void setIngredienteP(String ingredienteP) {
        this.ingredienteP = ingredienteP;
    }

    public String getEstrella() {
        return Estrella;
    }

    public void setEstrella(String estrella) {
        Estrella = estrella;
    }
public void ComidaSierra(){
        System.out.println("Comida tipica de la Sierra");
        System.out.println("Nombre del plato: "+ getNombre());
        System.out.println("Precio del plato: "+ getPrecio());
        System.out.println("Ingrediente principal del plato: "+ getIngredienteP());
        System.out.println("Numero de estrellas del plato: "+ getEstrella());


}


}
