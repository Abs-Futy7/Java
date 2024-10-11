package exceptionHanding;

public class Main {
    public static void main(String[] args) {
        int a = 4;
        int b = 0;  // Division by zero will cause an exception

        try {
            // Call the divide method, which may throw an ArithmeticException
            divide(a, b);
            
            // This block will execute if there is no ArithmeticException
            String name = "Kunal";
            
            // Check if name is "Kunal", and throw custom exception if true
            if (name.equals("Kunal")) {
                throw new MyException("name is kunal");  // Throw a custom exception
            }
        } 
        catch (MyException e) {
            // Catch the custom exception MyException
            System.out.println(e.getMessage());  // Print the custom exception's message
        }  
        catch (ArithmeticException e) {
            // Catch the specific ArithmeticException that may be thrown by the divide method
            System.out.println(e.getMessage());  // Print the error message
        } 
        catch (Exception e) {
            // Catch any other general exceptions (this block is optional in this case)
            System.out.println("Normal exceptions");  // This will handle any other exceptions, if any
        } 
        finally {
            // This block will always execute, whether an exception occurs or not
            System.out.println("This will always execute");
        }
    }

    // Method to divide two integers
    // The method declares that it may throw an ArithmeticException using 'throws'
    static int divide(int a, int b) throws ArithmeticException {
        if (b == 0) {
            // Throw an ArithmeticException if b is 0 to avoid division by zero
            throw new ArithmeticException("please do not divide by zero");
        }
        // If no exception is thrown, return the result of division
        return a / b;
    }
}

