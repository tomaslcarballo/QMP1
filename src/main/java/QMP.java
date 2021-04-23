import java.util.List;

class Prenda{
    String nombre;
    String material;
    Color colorPrincipal;
    Color colorSecundario;

    Prenda(String material, Color colorPrincipal, Color colorSecundario){
        this.material = material;
        this.colorPrincipal = colorPrincipal;
        this.colorSecundario = colorSecundario;
    }
}

class Zapato extends Prenda {
    Categoria categoria = Categoria.CALZADO;
}
class Camisa extends Prenda {
    Mangas mangas;
    Categoria categoria = Categoria.PARTESUPERIOR;
}
class Pantalon extends Prenda {
    Categoria categoria = Categoria.PARTEINFERIOR;
}
class Anteojos extends Prenda {
    Categoria categoria = Categoria.ACCESORIO;
}
class Zapatillas extends Prenda {
    Categoria categoria = Categoria.CALZADO;
}
class Paniuelo extends Prenda {
    Categoria categoria = Categoria.ACCESORIO;
}
class Remera extends Prenda {
    Mangas mangas;
    Categoria categoria = Categoria.PARTESUPERIOR;
}
class Musculosa extends Prenda {
    Categoria categoria = Categoria.PARTESUPERIOR;
}
class Pollera extends Prenda {
    Categoria categoria = Categoria.PARTEINFERIOR;
}
class Crocs extends Prenda {
    Categoria categoria = Categoria.CALZADO;
}


enum Color{
    ROJO, AMARILLO, VERDE, NEGRO, BLANCO, AZUL, NARANJA, MARRON, VIOLETA, CELESTE
}

enum Categoria{
    CALZADO, PARTESUPERIOR, PARTEINFERIOR, ACCESORIO
}

enum Mangas{
    CORTAS, LARGAS
}

class Atuendo  {
    List<Prenda> prendas;
    void generarAtuendo(Prenda prenda){
        prendas.add(prenda);
    }
}


