package overriding;

public class OgrenciKrediManager extends BaseKrediManager{
	public double hesapla(double tutar) {
		return tutar * 1.10;
	}
	//overriding--->BaseKrediManager'daki hali değilde burdakini kullanıyor
}
