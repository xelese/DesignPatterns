package BuilderPattern;

import BuilderPattern.Aircraft.IAircraft;
import BuilderPattern.AircraftBuilder.F16Builder;

public class Client {

    public static void main(String[] args) {
        F16Builder f16Builder = new F16Builder();

        // Create a director that constructs the required product.
        Director director = new Director(f16Builder);

        // This is not used most of the times. Usually you just directly call for the
        // making of required parts.
        director.construct(false);

        // An Example of direct usage without director.
        // AircraftBuilder f16Build = new F16Builder();

        // create based on requirements.
        // f16Build.buildCockpit();
        // f16Build.buildEngine();
        // f16Build.buildWings();

        // get output.
        IAircraft f16 = f16Builder.getResult();
    }

}
