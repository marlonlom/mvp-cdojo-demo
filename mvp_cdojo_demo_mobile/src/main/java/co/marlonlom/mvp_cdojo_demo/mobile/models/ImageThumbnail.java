package co.marlonlom.mvp_cdojo_demo.mobile.models;

/**
 * Created by marlonlom on 17/10/15.
 *
 * @author marlonlom
 * @version 17/10/15
 */
public class ImageThumbnail {
    private String title;
    private String url;

    public ImageThumbnail() {
        super();
    }

    public static ImageThumbnail create(String title, String url) {
        ImageThumbnail _thumb = new ImageThumbnail();
        _thumb.setTitle(title);
        _thumb.setUrl(url);
        return _thumb;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
