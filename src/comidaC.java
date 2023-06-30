public class comidaC extends comidaS{
    String Nombreres;
    String Reseña;

    public comidaC(){
        super();
    }

    public comidaC(String region, String nombre, float precio, String ingredienteP, String estrella, String nombreres, String reseña) {
        super(region, nombre, precio, ingredienteP, estrella);
        this.Nombreres = nombreres;
        this.Reseña = reseña;
    }

    public String getNombreres() {
        return Nombreres;
    }

    public void setNombreres(String nombreres) {
        Nombreres = nombreres;
    }

    public String getReseña() {
        return Reseña;
    }

    public void setReseña(String reseña) {
        Reseña = reseña;
    }

    public void Comidacosta(){
        System.out.println("Comida tipica de la costa");
        System.out.println("Nombre del plato: "+ getNombre());
        System.out.println("Precio del plato: "+ getPrecio());
        System.out.println("Ingrediente principal del plato: "+ getIngredienteP());
        System.out.println("Numero de estrellas del plato: "+ getEstrella());
        System.out.println("Reseña del critico: "+ getNombreres());
        System.out.println("Reseña: "+ getReseña());


    }

}
