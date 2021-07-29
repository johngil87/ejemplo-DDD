package co.com.bancolombia.model.user.values;

public class UrlImage {

    private final String url;

    public UrlImage(String url) {
        if(url.isBlank()){
            throw new IllegalArgumentException("Url de la imagen no puede estar vacia");
        }
        this.url = url;
    }

    public String getUrl() {
        return url;
    }
}
