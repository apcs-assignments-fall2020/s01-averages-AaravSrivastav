import java.util.ArrayList;

public class MyMain {

    // Returns the mean of the 2D array mat
    public static double mean(double[][] mat) { 
        double sum = 0;
        int numTerms = 0;
        for(int i = 0; i<mat.length; i++)
        {
            for(int j = 0; j<mat[i].length; j++)
            {
                sum+=mat[i][j];
                numTerms++;
            }
        }
        double avg = sum/numTerms;
        return avg;
    }

    // Returns the median of the 2D array mat
    public static double median(double[][] mat) { 
        // YOUR CODE HERE
        ArrayList<Double> terms = new ArrayList<Double>();
        for(int i = 0; i<mat.length; i++)
        {
            for(int j = 0; j<mat[i].length; j++)
            {
                terms.add(mat[i][j]);
            }   
        }
        for(int i = 1; i<terms.size(); i++)
        {
            if(terms.get(i)==terms.get(i-1))
            {
                terms.remove(i);
            }
        }
        int x = terms.size()/2;
        double a = 0;
        if(terms.size() % 2 == 1)
        {
            a = terms.get(x);
        }
        else
        {
            a = ((terms.get(x) + terms.get(x-1))/2);
        }
        return a;
    }
    

    // Returns the mode of the 2D array mat
    public static double mode(double[][] mat) { 
        // YOUR CODE HERE
        ArrayList<Double> terms = new ArrayList<Double>();
        for(int i = 0; i<mat.length; i++)
        {
            for(int j = 0; j<mat[i].length; j++)
            {
                terms.add(mat[i][j]);
            }   
        }

        int freq1 = 1;
        int freq2 = 1;
        double max = 0;
        for(int i = 0; i<terms.size(); i++)
        {
            for(int j = 0; i<terms.size(); i++)
            {
                if(terms.get(i) == terms.get(j))
                {
                    freq1++;
                }
            }
            if(freq1 > freq2)
            {
                max = terms.get(i);
                freq1 = freq2;
            }
        }
        
        return -1;
    }


    public static void main(String[] args) {
        // Write some code here to test your methods!
    }
}
