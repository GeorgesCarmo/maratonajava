package ResourceBundle;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundleTest {

	public static void main(String[] args) {
		System.out.println(Locale.getDefault());
		ResourceBundle bundleUS = ResourceBundle.getBundle("messages", new Locale("en", "US"));
		System.out.println(bundleUS.getString("hello"));
		System.out.println(bundleUS.getString("good.morning"));
		
		ResourceBundle bundleBR = ResourceBundle.getBundle("messages", new Locale("pt", "BR"));
		System.out.println(bundleBR.getString("hello"));
		System.out.println(bundleBR.getString("good.morning"));

	}

}
