import java.util.Scanner;

abstract class SocialNetwork {

    public void connect() {
        System.out.printf("Log into %1$s\nPost: Hello, %1$s!\nLog out of %1$s\n", getName());
    }

    public abstract String getName();
}

class Instagram extends SocialNetwork {
    @Override
    public String getName() {
        return "Instagram";
    }
}


class Facebook extends SocialNetwork {
    @Override
    public String getName() {
        return "Facebook";
    }
}

// Do not change the code below
class Main {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final String type = scanner.nextLine();
        scanner.close();
        SocialNetwork network = null;
        if ("facebook".equalsIgnoreCase(type)) {
            network = new Facebook();
        } else if ("instagram".equalsIgnoreCase(type)) {
            network = new Instagram();
        } else {
            System.out.println("Error!");
            System.exit(0);
        }
        network.connect();
    }
}