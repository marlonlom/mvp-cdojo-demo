package co.marlonlom.mvp_cdojo_demo.mobile;

import org.junit.Before;
import org.junit.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Captor;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;
import java.util.List;

import co.marlonlom.mvp_cdojo_demo.mobile.models.ImageThumbnail;
import co.marlonlom.mvp_cdojo_demo.mobile.models.ThumbnailsListListener;
import co.marlonlom.mvp_cdojo_demo.mobile.models.interactors.ThumbsListingInteractor;
import co.marlonlom.mvp_cdojo_demo.mobile.presenters.ThumbnailsListPresenter;
import co.marlonlom.mvp_cdojo_demo.mobile.views.IThumbsListView;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

/**
 * Created by marlonlom on 17/10/15.
 *
 * @author marlonlom
 * @version 17/10/15
 */
public class ThumbsListingTest {

    @Mock
    private IThumbsListView _view;
    @Mock
    private ThumbsListingInteractor _interactor;
    @Captor
    private ArgumentCaptor<ThumbnailsListListener<List<ImageThumbnail>>> _capturator;
    private ArrayList<ImageThumbnail> thumbsData;
    private ThumbnailsListPresenter _presenter;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        _presenter = new ThumbnailsListPresenter(_interactor);
        thumbsData = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            final int index = i + 1;
            thumbsData.add(i, ImageThumbnail.create("lorem_img_" + index, "http://lorempixel.com/240/240/" + index));
        }
    }

    @Test
    public void testSuccess() {
        _presenter.onCreate(_view);
        verify(_interactor, times(1)).getThumbnail(_capturator.capture());
        _capturator.getValue().onSuccess(thumbsData);
        verify(_view, times(1)).load(thumbsData);
    }
    
}
