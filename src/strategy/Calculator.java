package strategy;

public class Calculator {
    private OperationStrategy strategy;

    public Calculator(OperationStrategy strategy) {
        setStrategy(strategy);
    }

    public void setStrategy(OperationStrategy strategy){
        if(strategy == null){
            throw new IllegalArgumentException(
                    "Strategy cannot be null"
            );
        }
        this.strategy = strategy;
    }
    public double calculate(double a, double b){
        return strategy.execute(a, b);
    }
}
