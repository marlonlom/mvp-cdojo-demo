package co.marlonlom.mvp_cdojo_demo.mobile.models.interactors;

import java.util.List;

import co.marlonlom.mvp_cdojo_demo.mobile.models.ImageThumbnail;
import co.marlonlom.mvp_cdojo_demo.mobile.models.ThumbnailsListListener;

/**
 * Created by marlonlom on 17/10/15.
 *
 * @author marlonlom
 * @version 17/10/15
 */
public interface ThumbsListingInteractor {
    void getThumbnail(ThumbnailsListListener<List<ImageThumbnail>> listener);
}
