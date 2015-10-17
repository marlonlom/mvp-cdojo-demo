package co.marlonlom.mvp_cdojo_demo.mobile.repository;

import java.util.ArrayList;
import java.util.List;

import co.marlonlom.mvp_cdojo_demo.mobile.models.ImageThumbnail;
import co.marlonlom.mvp_cdojo_demo.mobile.models.ThumbnailsListListener;
import co.marlonlom.mvp_cdojo_demo.mobile.models.interactors.ThumbsListingInteractor;

/**
 * Created by marlonlom on 17/10/15.
 *
 * @author marlonlom
 * @version 17/10/15
 */
public class ThumbsInteractorImpl implements ThumbsListingInteractor {
    @Override
    public void getThumbnail(ThumbnailsListListener<List<ImageThumbnail>> listener) {
        List<ImageThumbnail> thumbsData = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            final int index = i + 1;
            thumbsData.add(i, ImageThumbnail.create("lorem_img_" + index, "http://lorempixel.com/240/240/" + index));
        }
        listener.onSuccess(thumbsData);
    }


}
