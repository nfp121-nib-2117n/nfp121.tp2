package question1;

/**
 * D�crivez votre classe FahrenheitCelsius ici.
 * 
 * @author (votre nom)
 * @version (un num�ro de version ou une date)
 */
public class FahrenheitCelsius {

    /**
     * le point d'entr�e de cette application, dont le commentaire est �
     * compl�ter
     * 
     * @param args
     *            ...
     */
    public static void main(String[] args) {
        // pour tous les param�tres de la ligne de commande
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i] + "\u00B0F -> " + fahrenheitEnCelsius(Integer.parseInt(args[i])) + "\u00B0C");
        }                                                                  
    }

    /**
     * la m�thode � compl�ter.
     * 
     * @param f
     *            la valeur en degr� Fahrenheit
     * @return la conversion en degr� Celsius
     */
    public static float fahrenheitEnCelsius(int f) {
        float celcius = (f-32) * 5.f / 9.f;
        if (celcius < 0) {
            return (float)Math.ceil( celcius * 10.0) / 10.f;
        }
        return (float)Math.floor( celcius * 10.0) / 10.f;
    }

}
