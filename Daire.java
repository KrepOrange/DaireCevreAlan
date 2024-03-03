import java.util.Scanner;

public class Daire {
    public static void main(String[] args) {
        //variable
        double circleRadius, centerAngleMeasure;
        Scanner input = new Scanner(System.in);

        /*
        Alan Formülü : π * r * r;
        Çevre Formülü : 2 * π * r;
        Açılı Formül : (𝜋 * (r*r) * 𝛼) / 360
        */

        System.out.print("Dairenin yarıçap değerini giriniz: ");
        circleRadius = input.nextDouble();
        System.out.print("Merkez açısının ölçüsünü verip daire parçasının alanını bulmak istiyorsanız, merkez açı ölçüsünü giriniz. (Değere '0' girmek bu işlemi etkisiz kılar): ");
        centerAngleMeasure = input.nextDouble();

        if(centerAngleMeasure == 0){
            System.out.println("\nDairenin çevresi " + (2*circleRadius) + " π'dir.");
            System.out.println("Dairenin alanı " + (circleRadius * circleRadius) + " π'dir.");
        } else
            System.out.println("\nMerkez açısını " + centerAngleMeasure + " derece verdiğiniz daire parçasının alanı " + (circleRadius*circleRadius*centerAngleMeasure/360) + " π'dir.");
    }
}
