public class Robot {

    private Bateria bateria;
    private boolean dormido;

    public Robot(){
        this.bateria = new Bateria(1000);
        this.dormido = false;
    }

    public void avanzar(int pasos){
        if (dormido){
            System.out.println("El robot esta dormido, no avanzara");
            return;
        }if (bateriaVacia()){
            System.out.println("La bateria esta vacia");
            return;
        }
        int energiaConsumida = (pasos / 100)*10;
        bateria.setCarga(Math.max(0, bateria.getCarga() - energiaConsumida));
        System.out.println("El robot ha avanzado " + pasos + " pasos");
    }

    public void retroceder(int pasos){
        if (dormido){
            System.out.println("El robot esta dormido, no retrocedera");
            return;
        }if (bateriaVacia()){
            System.out.println("La bateria esta vacia");
            return;
        }
        int energiaConsumida = (pasos / 100)*10;
        bateria.setCarga(Math.max(0, bateria.getCarga() - energiaConsumida));
        System.out.println("El robot ha retrocedido " + pasos + " pasos");
    }

    public void dormir(){
        dormido = true;
        System.out.println("El robot esta durmienod");
    }

    public void despertar(){
        dormido = false;
        System.out.println("EL robot esta despierto");
    }

    public void recargar(){
        bateria.setCarga(1000);
        System.out.println("el robot esta cargado otra vez");
    }

    public boolean bateriaLLena(){
        return bateria.getCarga() == 1000;
    }

    public boolean bateriaVacia(){
        return bateria.getCarga() <= 0;
    }

    public int energiaActual(){
        return bateria.getCarga();
    }

    public boolean estaDormido(){
        return dormido;
    }
}
