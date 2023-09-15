import java.util.*;

public class DoubleMeaning {
	public static void main(String[] args) throws InterruptedException {
		int a, b, c = 2, d = 0, siz = 0, f = 0;
		int z = 2000;
		Scanner scan = new Scanner(System.in);
		System.out.println("Sex world mai aapkaa swagat hai.....Yahaa aap text mai sex kar sakte hai :) ");
		System.out.println("Aap apnaa Gender batayee 1.Male 2.Female");
		a = scan.nextInt();
		if (a == 1) {
			System.out.println("Aap apnaa Lund Ka size bataayee (in cm) :)");
			siz = scan.nextInt();
			if (siz >= 8) {
				System.out.println("Aap Sex karnee laik hai...  :)");
				System.out.println("Hamaree yahaa 1.Indian 2.Russian hai kaun chahiyee ");
				d = scan.nextInt();
				System.out.println("Enjoy :)");
				for (int i = 0; i < 10; i++) {
					if (d == 1) {
						System.out.println("Aaaaa......Aaaaaaa.....ooouch....Ummmm");
						Thread.sleep(z);
					} else if (d == 2) {
						System.out.println(
								"Fuck ...........aaaaasssss....yessssss......sss.s..s.........aaaaaaaaoaóooooooooooo aaauachaaaaaaaaaaaa aaaaaaaaaa");
						Thread.sleep(z);
					} else {
					}
				}
			} else {
				System.out.println("Lund badaake aaaa Bsdk ....M**chod....behenkee ....laudeee..... :×");
			}
		}
		if (a == 2) {
			System.out.println("Kis Size (in cm) ka Lund chahiyee aapkoo.... :) ");
			b = scan.nextInt();
			if (b >= 8) {
				System.out.println("Hamaraa yahaa 1.Young Boy 2.Uncle haii...kiskoo chunengee...  :)");
				f = scan.nextInt();
				System.out.println("Enjoy.... :) Mam");
				for (int i = 0; i < 10; i++) {
					if (f == 1) {
						System.out.println(
								"diiire dalllo aaaaa.a...a.a.adeeree  deeeeeeeeree ..........Kahaaaa gusaaa rahee hoooo ......galat holeeeee aaaaaaaaaaaaa");
						System.out.println(
								"diiire dalllo aaaaa.a...a.a.adeeree  deeeeeeeeree ..........aaaaaaauuuuuuuuuooooooooo uuuuuummmmmmm  aaaaaa");
						Thread.sleep(z);
					}
				}
				System.out.println(
						"Unclee joor seeee dumm nehii haiii kyaaaaaaa   ........unlclee jorr   jorrr  jorrr seeeree aaaaa aaa a a a aaua a  a aa amammm a a....");
				for (int i = 0; i < 10; i++) {
					if (f == 2) {
						System.out.println(
								" aaaaaaaa aaaaaauuu mmmmma aa aaaqq....uuuuuuuummmmmmm jore see reeeee ........,......");
						Thread.sleep(z);
					}
				}
			} else if (b <= 8) {
				System.out.println(
						"Aree Lund kaa Size kam lagaa diyaaa re didii....Badaana Chahiyee ......Tabitooo Mazaaa Ayegaanaaa......");
			} else {
			}
		}
	}
}