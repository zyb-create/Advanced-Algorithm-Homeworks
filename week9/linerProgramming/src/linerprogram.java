import org.apache.commons.math3.stat.regression.RegressionResults;
import org.apache.commons.math3.stat.regression.SimpleRegression;

public class linerprogram {

    public static void main(String[] args){
        calcLP();
        System.out.println("hello world");
    }

    static double calcLP(){
        SimpleRegression regression= new SimpleRegression();
//        regression.
        double[] x={1,1};
//        regression.a
        regression.addObservation(x,5);
        x = new double[]{2, 3};
        regression.addObservation(x,13);
        x = new double[]{3, 4};
        regression.addObservation(x,18);
        x = new double[]{4, 5};
        regression.addObservation(x,23);
//        regression.addData(1,3);
//        regression.addData(2,5);
        RegressionResults results=regression.regress();
//        results.
        System.out.println(results.getParameterEstimates().length);
        System.out.println(results.getParameterEstimate(0)+"   "+results.getParameterEstimate(1));
        return 0;
    }
}
