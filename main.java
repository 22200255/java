import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Main pStudio = new Main();
        pStudio.J001();
    }
    void J001() {
        int height, weight;
        double bmi;
        Scanner sc = new Scanner(System.in);
        height = sc.nextInt();
        weight = sc.nextInt();
        bmi = weight / ((height * 0.01) * (height * 0.01));
        System.out.println(String.format("%.1f" , bmi));

    }
}
