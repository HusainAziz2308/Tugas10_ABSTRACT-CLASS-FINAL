abstract class Binatang {
    public void bernafas() {
        System.out.println("Semua binatang bernafas.");
    }

    public void makan() {
        System.out.println("Semua binatang makan.");
    }

    public abstract void berkembangBiak();
}

class Burung extends Binatang {
    public void makan() {
        super.makan();
        System.out.println("Burung makan biji-bijian.");
    }

    public void berkembangBiak() {
        System.out.println("Burung berkembang biak dengan cara bertelur.");
    }
}

class Mamalia extends Binatang {
    public void berkembangBiak() {
        System.out.println("Mamalia berkembang biak dengan cara melahirkan.");
    }
}

public class TestAnimal {
    public static void main(String[] args) {
        System.out.println("Testing Binatang...");
        Binatang loveBird = new Burung();
        Binatang cat = new Mamalia();
        Mamalia dolphin = new Mamalia();

        loveBird.bernafas();
        loveBird.makan();
        loveBird.berkembangBiak();

        cat.bernafas();
        cat.makan();
        cat.berkembangBiak();

        dolphin.berkembangBiak();
    }
}
