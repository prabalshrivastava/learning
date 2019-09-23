package learning.java8.optional;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

import java.util.Optional;

public class OptionalBasics {
    public static void main(String[] args) {
        //Use Optional.of() to create optional with default non-null value. If you pass null in of(), then a NullPointerException is thrown immediately.
        Optional<Integer> canBeEmpty1 = Optional.of(5);
        System.out.println(canBeEmpty1.isPresent());// returns true
        System.out.println(canBeEmpty1.get());      // returns 5

        //Use Optional.empty() to create empty optional.
        Optional<Integer> canBeEmpty2 = Optional.empty();
        System.out.println(canBeEmpty2.isPresent());
        System.out.println("\n\n\n");
        System.out.println(canBeEmpty2);

        //this throws null pointer exception
        //Optional<Integer> canBeEmpty3 = Optional.of(null);

        //Use Optional.ofNullable() to create an Optional object that may hold a null value.
        // If parameter is null, the resulting Optional object would be empty (remember that value is absent; don’t read it null).
        Optional<Integer> possible = Optional.ofNullable(null);
        Optional<Integer> possible1 = Optional.ofNullable(5);


        System.out.println("!!!!!!!!!!!!!!!!");
        possible.ifPresent(System.out::println);
        System.out.println("^^^^^^^^^^^^^^^");
        //is same as


        //Assume this value has returned from a method
        Optional<Company> companyOptional = Optional.empty();

        //Now check optional; if value is present then return it,
        //else create a new Company object and retur it
                Company company = companyOptional.orElse(new Company());

        //OR you can throw an exception as well
                Company company1 = companyOptional.orElseThrow(IllegalStateException::new);

        Optional<Company> companyOptional1 = Optional.empty();
//        companyOptional1.filter(department -> "Finance".equals(companyOptional.toString()))
//                .ifPresent(() -> System.out.println("Finance is present"));


    }
}
