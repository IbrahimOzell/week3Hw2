package abstractclasses;

public abstract class GameCalculator {
	public abstract void hesapla();   //operasyonu abstract yapınca her kullanıcı override yapması gerekiyor
	
	public final void gameOver() {
		System.out.println("Oyun bitti");
	}
}
//abstract class'lar newlenmezler