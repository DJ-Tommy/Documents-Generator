import java.net.MalformedURLException;
import java.net.URL;

public class StartGeneration {

    public static void main(String[] args) throws Exception {
        URL url = new URL("https://www.nytimes.com/section/health");
        GetTextFromSite getTextFromSite = new GetTextFromSite(url);
        System.out.println(getTextFromSite.getFirstPage());
        System.out.println(url.getContent().toString());

    }
}
