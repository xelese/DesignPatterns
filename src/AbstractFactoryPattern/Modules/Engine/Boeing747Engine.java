package AbstractFactoryPattern.Modules.Engine;

public class Boeing747Engine implements IEngine {

    @Override
    public void start() {
        System.out.println("F16 Engine is on.");
    }
}
