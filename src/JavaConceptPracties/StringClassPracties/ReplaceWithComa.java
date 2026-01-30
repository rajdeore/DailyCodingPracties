package JavaConceptPracties.StringClassPracties;

public class ReplaceWithComa {
    public static void main(String[] args) {
        String givenStr = "Java | REST APIs | Spring Boot| Git | Maven | JPA | OOPS | DS | ALGO | VS-code | IntelliJ IDEA | OCI\n" +
                "(Oracle Cloud Infrastructure) | CI/CD | Unit Testing | Jenkins | MySQL | Enterprise Application |\n" +
                "Backend | Docker | Kubernetes | linux";

        String replace = givenStr.replace(" | ", ", ");
        System.out.println(replace);
    }
}
