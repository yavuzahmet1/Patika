package hafta1;

public class OOPBasic {
	public static void main(String[] args) {
		Ilan ilan = new Ilan();
		ilan.gayrimenkul = new Gayrimenkul();
		ilan.kullaniciAdi = "Cem";
		ilan.resim = makeResim();

		/*
		 * public static Gayrimenkul makeGayrimenkul() { return new Gayrimenkul(); }
		 */
	}

	private static String[] makeResim() {
		String[] resimAt = new String[5];
		resimAt[0] = "resim1";
		resimAt[1] = "resim1";
		return resimAt;
	}

}
