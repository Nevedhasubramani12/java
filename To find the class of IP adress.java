import java.util.Scanner;
import java.util.regex.Pattern;
public class IPAddressValidator {
    private static final String IPADDRESS_PATTERN =
            "^([0-9]{1,3}\\.){3}[0-9]{1,3}$";
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an IP address: ");
        String ip = scanner.nextLine();
        scanner.close();
        if (isValidIPAddress(ip)) {
            System.out.println("The IP address is valid.");
            System.out.println("Class: " + getIPAddressClass(ip));
        } else {
            System.out.println("The IP address is invalid.");
        }
    }
    public static boolean isValidIPAddress(String ip) {
        if (!Pattern.matches(IPADDRESS_PATTERN, ip)) {
            return false;
        }
        String[] parts = ip.split("\\.");
        for (String part : parts) {
            int value = Integer.parseInt(part);
            if (value < 0 || value > 255) {
                return false;
            }
        }
        return true;
    }
    public static String getIPAddressClass(String ip) {
        int firstOctet = Integer.parseInt(ip.split("\\.")[0]);

        if (firstOctet >= 1 && firstOctet <= 126) {
            return "A";
        } else if (firstOctet >= 128 && firstOctet <= 191) {
            return "B";
        } else if (firstOctet >= 192 && firstOctet <= 223) {
            return "C";
        } else if (firstOctet >= 224 && firstOctet <= 239) {
            return "D";
        } else if (firstOctet >= 240 && firstOctet <= 255) {
            return "E";
        } else {
            return "Unknown";
        }
    }
}
