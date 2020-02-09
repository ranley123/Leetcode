import java.util.HashMap;
/**
 * 
 * @author ranley
 * @id 535
 * @runtime 2ms faster than 93%
 */
public class EncodeAndDecodeURL {
	HashMap<String,String> cache = new HashMap<>();
    private static int id = 0;
    
    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
        String tinyUrl = "http://tinyurl.com/"+id++;
        cache.put(tinyUrl,longUrl);
        return tinyUrl;
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        return cache.get(shortUrl);
    }
}
