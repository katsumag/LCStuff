import java.util.List;

public class TestOne {

    private void test(final List<String> args) {
        for (int x=0; x < args.size(); x++) {
            System.out.println(args.get(x));
        }
    }

}
