package AbstractFactoryPattern.Modules.Engine;

public class F16Engine implements IEngine {

    @Override
    public void start() {
        System.out.println("F16 Engine is on.");
    }
}
