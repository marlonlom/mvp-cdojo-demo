package co.marlonlom.mvp_cdojo_demo.mobile.presenters;

import java.util.List;

import co.marlonlom.mvp_cdojo_demo.mobile.models.ImageThumbnail;
import co.marlonlom.mvp_cdojo_demo.mobile.models.ThumbnailsListListener;
import co.marlonlom.mvp_cdojo_demo.mobile.models.interactors.ThumbsListingInteractor;
import co.marlonlom.mvp_cdojo_demo.mobile.views.IThumbsListView;

/**
 * Created by marlonlom on 17/10/15.
 *
 * @author marlonlom
 * @version 17/10/15
 */
public class ThumbnailsListPresenter {

    private final ThumbsListingInteractor interactor;
    private IThumbsListView view;

    public ThumbnailsListPresenter(ThumbsListingInteractor interactor) {
        this.interactor = interactor;
    }

    public void onCreate(IThumbsListView _view) {
        this.view = _view;
        this.interactor.getThumbnail(new ThumbnailsListListener<List<ImageThumbnail>>() {
            @Override
            public void onSuccess(List<ImageThumbnail> thumbs) {
                view.load(thumbs);
            }

            @Override
            public void onFailed(Exception e) {
                view.onError(e);
            }
        });
    }
}
