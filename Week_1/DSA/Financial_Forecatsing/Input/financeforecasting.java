package Finance;
public class Financialforecasting {
	    public static double FutureValue(double currentValue, double growthRate, int years) {
	        if (years==0) {
	            return currentValue;
	        }
	        return FutureValue(currentValue * (1 + growthRate), growthRate, years - 1);
	    }

	    public static void main(String[] args) {
	        double initial=10000; 
	        double annualGrowthRate=0.08; 
	        int Years=5; 
	        double futureValue=FutureValue(initial, annualGrowthRate, Years);
	        System.out.printf("Predicted value after %d years: Rs.%.2f\n",Years,futureValue);
	    }
	}
