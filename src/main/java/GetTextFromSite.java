import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;
import java.net.URL;

public class GetTextFromSite {
    private URL url;

    public GetTextFromSite(URL url) {
        this.url = url;
    }

    public String parsePage() throws IOException {
        Document doc = Jsoup.connect(url.toString()).get();


        return doc.text();
    }

    public String getFirstPage() throws IOException {
        return parsePage();
    }
}
