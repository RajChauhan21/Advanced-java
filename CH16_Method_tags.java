package Advanced_java;

/**
 * This class contains various methods
 * @author Raj Chauhan
 * @version 0.21.7.0
 * @since 2024
 * @see <a href="http://docs.oracle.com/en/java/javase/21/docs/api/index.html"target="_blank">Java docs</a>
 */
public class CH16_Method_tags {
    public static void main(String[] args) {

    }

    /**
     * This method adds two numbers
     * @param a This is first parameter
     * @param b This is second parameter
     * @deprecated This method is deprecated
     * @return Returns addition of two numbers
     * @throws Exception if value of a is 0
     */
    public int add(int a , int b) throws Exception{
        if(a==0){
            throw new Exception();
        }
        int z;
         a = 21;
         b = 21;
         z = a + b;
        return z;
    }
}
