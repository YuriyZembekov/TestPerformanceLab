package daytwo.taskthree;

public class Integrator {
    final static double SAMPLING_STEP = 0.1;
    public static double integrate(MyFunctionInterface myFunctionInterface,
                                   double start, double end){
        double accumulator = 0;
        int steps = (int) Math.round((end-start)/SAMPLING_STEP);

        for (int i = 0; i < steps; i++) {
            accumulator+=myFunctionInterface.getDouble(0)*SAMPLING_STEP;
        }
        return accumulator;
    }
}
