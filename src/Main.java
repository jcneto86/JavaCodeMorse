public class Main {

    public static void main(String[] args) {
        TraducteurMorse traducteurMorse = new TraducteurMorseConcrete();

        String joaoAlpha = "João Carlos";
        String joaoMorse = traducteurMorse.toMorse(joaoAlpha);

        System.out.println("Test toMorse : ");
        System.out.println(traducteurMorse.toMorse(joaoAlpha));
        System.out.println("*     --- --- --- --- --- ---     *");
        System.out.println("Test toAlpha : ");
        System.out.println(traducteurMorse.toAlpha(joaoMorse));

    }
}
