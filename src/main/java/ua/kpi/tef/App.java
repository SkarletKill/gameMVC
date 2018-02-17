package ua.kpi.tef;

/**
 * More-Less Game!
 * Developed by SkarletRED on 17.02.2018.
 */

public class App 
{
    public static void main( String[] args )
    {
        Model model = new Model();
        View view = new View();
        Controller controller = new Controller(model, view);
        controller.processUser();
    }
}