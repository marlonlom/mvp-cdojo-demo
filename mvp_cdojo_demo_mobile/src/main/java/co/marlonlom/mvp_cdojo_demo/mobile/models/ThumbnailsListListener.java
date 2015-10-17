package co.marlonlom.mvp_cdojo_demo.mobile.models;

/**
 * Created by marlonlom on 17/10/15.
 *
 * @author marlonlom
 * @version 17/10/15
 */
public interface ThumbnailsListListener<L> {
    void onSuccess(L thumbs);

    void onFailed(Exception e);
}
