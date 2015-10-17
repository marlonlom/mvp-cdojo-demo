package co.marlonlom.mvp_cdojo_demo.mobile.views;

import java.util.List;

import co.marlonlom.mvp_cdojo_demo.mobile.models.ImageThumbnail;

/**
 * Created by marlonlom on 17/10/15.
 *
 * @author marlonlom
 * @version 17/10/15
 */
public interface IThumbsListView {
    void load(List<ImageThumbnail> data);

    void onError(Exception exception);
}
