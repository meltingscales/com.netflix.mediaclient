package com.netflix.mediaclient.acquisition.screens.welcomefuji;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.netflix.android.imageloader.api.ShowImageRequest;
import com.netflix.mediaclient.acquisition.R;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.mediaclient.acquisition.services.logging.TtrImageObserver;
import com.netflix.mediaclient.android.widget.NetflixImageView;
import dagger.hilt.android.AndroidEntryPoint;
import javax.inject.Inject;
import o.C8627dsp;
import o.C8632dsu;
import o.dpR;
import o.drM;

@AndroidEntryPoint
/* loaded from: classes3.dex */
public class FujiCardFragment extends Hilt_FujiCardFragment {
    public static final String CARD_DATA = "cardData";
    public static final String POSITION = "position";
    private boolean isFirstCard;
    public FujiCardParsedData parsedData;
    @Inject
    public TtrImageObserver ttrImageObserver;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public static /* synthetic */ void getHeaderText$annotations() {
    }

    public static /* synthetic */ void getImageView$annotations() {
    }

    public static /* synthetic */ void getSubheaderText$annotations() {
    }

    public final void setParsedData(FujiCardParsedData fujiCardParsedData) {
        C8632dsu.c((Object) fujiCardParsedData, "");
        this.parsedData = fujiCardParsedData;
    }

    public final void setTtrImageObserver(TtrImageObserver ttrImageObserver) {
        C8632dsu.c((Object) ttrImageObserver, "");
        this.ttrImageObserver = ttrImageObserver;
    }

    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(C8627dsp c8627dsp) {
            this();
        }

        private Companion() {
        }

        public final FujiCardFragment newInstance(FujiCardParsedData fujiCardParsedData, int i) {
            C8632dsu.c((Object) fujiCardParsedData, "");
            FujiCardFragment fujiCardFragment = new FujiCardFragment();
            Bundle bundle = new Bundle();
            bundle.putParcelable(FujiCardFragment.CARD_DATA, fujiCardParsedData);
            bundle.putInt("position", i);
            fujiCardFragment.setArguments(bundle);
            return fujiCardFragment;
        }
    }

    public final TtrImageObserver getTtrImageObserver() {
        TtrImageObserver ttrImageObserver = this.ttrImageObserver;
        if (ttrImageObserver != null) {
            return ttrImageObserver;
        }
        C8632dsu.d("");
        return null;
    }

    public final NetflixImageView getImageView() {
        View findViewById = requireView().findViewById(R.id.imageView);
        C8632dsu.a(findViewById, "");
        return (NetflixImageView) findViewById;
    }

    public final TextView getHeaderText() {
        View findViewById = requireView().findViewById(R.id.header);
        C8632dsu.a(findViewById, "");
        return (TextView) findViewById;
    }

    public final TextView getSubheaderText() {
        View findViewById = requireView().findViewById(R.id.subheader);
        C8632dsu.a(findViewById, "");
        return (TextView) findViewById;
    }

    public final FujiCardParsedData getParsedData() {
        FujiCardParsedData fujiCardParsedData = this.parsedData;
        if (fujiCardParsedData != null) {
            return fujiCardParsedData;
        }
        C8632dsu.d("");
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        FujiCardParsedData fujiCardParsedData;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null && (fujiCardParsedData = (FujiCardParsedData) arguments.getParcelable(CARD_DATA)) != null) {
            setParsedData(fujiCardParsedData);
        }
        Bundle arguments2 = getArguments();
        this.isFirstCard = arguments2 != null && arguments2.getInt("position") == 0;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C8632dsu.c((Object) layoutInflater, "");
        return layoutInflater.inflate(isVlvCard() ? R.layout.fragment_vlv_fuji_card : R.layout.fragment_fuji_card, viewGroup, false);
    }

    public final boolean isVlvCard() {
        return C8632dsu.c((Object) getParsedData().getCardType(), (Object) SignupConstants.FujiCardType.VLV);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        C8632dsu.c((Object) view, "");
        super.onViewCreated(view, bundle);
        loadImage();
        loadText();
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        Fragment parentFragment = getParentFragment();
        FujiCardContainer fujiCardContainer = parentFragment instanceof FujiCardContainer ? (FujiCardContainer) parentFragment : null;
        if (fujiCardContainer != null) {
            fujiCardContainer.doOnFloatingContainerHeightReady(new drM<Integer, dpR>() { // from class: com.netflix.mediaclient.acquisition.screens.welcomefuji.FujiCardFragment$onStart$1
                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    super(1);
                }

                @Override // o.drM
                public /* synthetic */ dpR invoke(Integer num) {
                    invoke(num.intValue());
                    return dpR.c;
                }

                public final void invoke(int i) {
                    View bottomView = FujiCardFragment.this.getBottomView();
                    if (bottomView != null) {
                        ViewGroup.LayoutParams layoutParams = bottomView.getLayoutParams();
                        if (layoutParams != null) {
                            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                            marginLayoutParams.bottomMargin = i;
                            bottomView.setLayoutParams(marginLayoutParams);
                            return;
                        }
                        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    }
                }
            });
        }
    }

    public View getBottomView() {
        View view = getView();
        if (view != null) {
            return view.findViewById(R.id.textSection);
        }
        return null;
    }

    private final void loadText() {
        getHeaderText().setText(getParsedData().getHeader());
        getSubheaderText().setText(getParsedData().getSubheader());
    }

    private final void loadImage() {
        ShowImageRequest e = new ShowImageRequest().a(getParsedData().getImageUrl()).j(this.isFirstCard).e(this);
        if (this.isFirstCard) {
            e.a(getTtrImageObserver());
        }
        getImageView().showImage(e);
    }
}
