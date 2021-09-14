package prueba1;

public class Persona {

    private String name;
    private int age;

    private boolean alive;
    private static int numOfPeople=0;

    public Persona(String nombre, int edad)
    {
        name=nombre;
        age=edad;
        alive=true;
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
        if(alive)
        {
            age++;           
        }
        
        return age;
    }

    public String getName()
    {
        return name;
    }

    public void reportDead()
    {
        alive = false;
        numOfPeople--;
    }

    public void setName(String name)
    {
        this.name=name;
    }
}
