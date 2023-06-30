public class comidaA extends comidaC{
    String popularidad;
    String Descripcion;

    public comidaA(String region, String nombre, float precio, String ingredienteP, String estrella, String nombreres, String reseña, String popularidad, String descripcion) {
        super(region, nombre, precio, ingredienteP, estrella, nombreres, reseña);
        this.popularidad = popularidad;
        this.Descripcion = descripcion;
    }

    public String getPopularidad() {
        return popularidad;
    }

    public void setPopularidad(String popularidad) {
        this.popularidad = popularidad;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String descripcion) {
        Descripcion = descripcion;
    }

    public void ComidaAmazonia() {
        System.out.println("Comida tipica de la costa");
        System.out.println("Nombre del plato: " + getNombre());
        System.out.println("Precio del plato: " + getPrecio());
        System.out.println("Ingrediente principal del plato: " + getIngredienteP());
        System.out.println("Numero de estrellas del plato: " + getEstrella());
        System.out.println("Reseña del critico: " + getNombreres());
        System.out.println("Reseña: " + getReseña());
        System.out.println("Popularidad del plato: "+ getPopularidad());
        System.out.println("Descripcion del plato: "+ getDescripcion());
    }



    }

