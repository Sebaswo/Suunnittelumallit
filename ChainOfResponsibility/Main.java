package ChainOfResponsibility;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        ManagerRaiseHandler manager = new ManagerRaiseHandler();
        DeptHeadRaiseHandler deptHead = new DeptHeadRaiseHandler();
        CEORaiseHandler ceo = new CEORaiseHandler();

        manager.setNextRaiseHandler(deptHead);
        deptHead.setNextRaiseHandler(ceo);

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            while (true) {
                System.out.println("Check who will approve your raise request!");
                System.out.print("Enter your current salary: ");
                double salary = Double.parseDouble(reader.readLine());
                System.out.println("Enter your desired flat pay raise in euros: ");
                double raise = Double.parseDouble(reader.readLine());

                manager.handleRaise(new RaiseRequest(raise, salary));
            }
        } catch (Exception e) {
            System.exit(-1);
        }
    }
}
