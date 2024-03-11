package o;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.core.util.Pair;
import com.netflix.android.imageloader.api.ShowImageRequest;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.android.widget.NetflixImageView;
import com.netflix.mediaclient.clutils.EmptyPlayContext;
import com.netflix.mediaclient.clutils.TrackingInfoHolder;
import com.netflix.mediaclient.servicemgr.PlayLocationType;
import com.netflix.mediaclient.ui.R;
import com.netflix.mediaclient.util.PlayContext;
import java.util.ArrayList;
import java.util.List;
import o.InterfaceC6434cdI;

@SuppressLint({"ViewConstructor"})
/* renamed from: o.bYy  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C4173bYy extends FrameLayout implements InterfaceC6434cdI.c<InterfaceC5223buh> {
    public static final List<Pair<Integer, Integer>> d = new ArrayList<Pair<Integer, Integer>>() { // from class: com.netflix.mediaclient.ui.kids.lolomo.KidsCharacterView$1
        {
            add(new Pair(Integer.valueOf(R.e.ax), Integer.valueOf(R.c.m)));
            add(new Pair(Integer.valueOf(R.e.au), Integer.valueOf(R.c.n)));
            add(new Pair(Integer.valueOf(R.e.at), Integer.valueOf(R.c.l)));
            add(new Pair(Integer.valueOf(R.e.as), Integer.valueOf(R.c.g)));
            add(new Pair(Integer.valueOf(R.e.aw), Integer.valueOf(R.c.k)));
        }
    };
    private TrackingInfoHolder a;
    private final NetflixImageView b;
    private final View$OnClickListenerC1217Te c;
    private final NetflixImageView e;

    public C4173bYy(Context context) {
        super(context);
        setFocusable(true);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(com.netflix.mediaclient.ui.R.b.r);
        setPadding(dimensionPixelSize, context.getResources().getDimensionPixelSize(com.netflix.mediaclient.ui.R.b.t), dimensionPixelSize, 0);
        ViewGroup.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1, 80);
        NetflixImageView netflixImageView = new NetflixImageView(context);
        this.b = netflixImageView;
        addView(netflixImageView, layoutParams);
        ViewGroup.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -1, 80);
        NetflixImageView netflixImageView2 = new NetflixImageView(context);
        this.e = netflixImageView2;
        netflixImageView2.setScaleType(ImageView.ScaleType.FIT_XY);
        addView(netflixImageView2, layoutParams2);
        this.c = new b(NetflixActivity.requireNetflixActivity(context), this);
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3) {
            this.e.setRoundedCornerRadius(i / 2.0f);
            this.e.refreshImageIfNecessary();
        }
    }

    /* renamed from: o.bYy$b */
    /* loaded from: classes4.dex */
    class b extends View$OnClickListenerC1217Te {
        public b(NetflixActivity netflixActivity, bDG bdg) {
            super(netflixActivity, bdg);
        }

        @Override // o.View$OnClickListenerC1217Te
        public void a(NetflixActivity netflixActivity, InterfaceC5223buh interfaceC5223buh, TrackingInfoHolder trackingInfoHolder) {
            InterfaceC3643bFl.a((Context) netflixActivity).d(netflixActivity, interfaceC5223buh, trackingInfoHolder, "DeetsClickListener", new Bundle());
        }
    }

    public String d(InterfaceC5223buh interfaceC5223buh, InterfaceC5149btM interfaceC5149btM) {
        return interfaceC5223buh.getBoxshotUrl();
    }

    @Override // o.InterfaceC6434cdI.c
    /* renamed from: e */
    public void c(InterfaceC5223buh interfaceC5223buh, InterfaceC5149btM interfaceC5149btM, TrackingInfoHolder trackingInfoHolder, int i, boolean z) {
        String d2 = d(interfaceC5223buh, interfaceC5149btM);
        this.a = trackingInfoHolder;
        setVisibility(0);
        if (!C8168dfL.g(d2)) {
            this.e.showImage(new ShowImageRequest().a(d2).a(true).j(z));
        }
        this.e.setContentDescription(interfaceC5223buh.getTitle());
        this.c.d(this, interfaceC5223buh, trackingInfoHolder);
    }

    @Override // o.bDG
    public PlayContext y_() {
        TrackingInfoHolder trackingInfoHolder = this.a;
        if (trackingInfoHolder != null) {
            return trackingInfoHolder.d(PlayLocationType.LOLOMO_ROW, false);
        }
        InterfaceC1598aHf.a("KidsCharacterView.getPlayContext has null trackingInfo");
        return new EmptyPlayContext("KidsCharacterView", -430);
    }

    @Override // o.InterfaceC6434cdI.c
    public boolean c() {
        return this.e.isImageContentMissingForPresentationTracking();
    }
}
