package prueba1;

public class Persona {

    private String name;
    private int age;
    private static int numOfPeople=0;

    public Persona(String nombre, int edad)
    {
        name=nombre;
        age=edad;
        numOfPeople++;
    }

    public static int getNumberOfPeople()
    {
        return numOfPeople;
    }
    
    public int getAge()
    {
        return age;
    }

    public int old()
    {
        age++;
        return age;
    }

    public String getName()
    {
        return name;
    }
}
