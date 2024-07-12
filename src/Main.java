//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws InterruptedException {

        for (int i = 0; i < 20; i++) {

            if(i ==19) {
                System.out.println(" But Batch " + i + " is greatest");
            } else {
                System.out.println("Batch "+ i + " is great ");
            }
            Thread.sleep(2000);

        }

    }
}