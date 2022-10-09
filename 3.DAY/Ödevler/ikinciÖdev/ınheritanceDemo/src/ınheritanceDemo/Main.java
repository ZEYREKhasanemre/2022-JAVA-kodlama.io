package ınheritanceDemo;

import ınheritanceDemo.business.AskerKrediManager;
import ınheritanceDemo.business.KrediUI;
import ınheritanceDemo.business.OgretmenKrediManager;

public class Main {

	public static void main(String[] args) {
		KrediUI krediUI = new KrediUI();
		krediUI.krediHesapla(new AskerKrediManager());
		krediUI.krediHesapla(new OgretmenKrediManager());
	}

}
