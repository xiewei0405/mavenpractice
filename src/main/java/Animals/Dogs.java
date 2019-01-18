package Animals;

import org.apache.commons.math3.distribution.MultivariateNormalDistribution;

public class Dogs extends Animals{
    public Dogs (String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void main (String[] args) {
        Dogs dog = new Dogs("ergua", 12);
        double[] mean = {0, 1};
        double[][] covariance = {{1, 0},{0, 1}};
        MultivariateNormalDistribution MND = new MultivariateNormalDistribution(mean, covariance);
        System.out.println(dog.name);
        System.out.println(MND.sample()[0]);
    }
}
