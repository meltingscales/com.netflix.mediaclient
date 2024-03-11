package com.netflix.mediaclient.ui.lomo;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.core.os.TraceCompat;
import com.netflix.android.imageloader.api.ShowImageRequest;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.android.widget.NetflixImageView;
import com.netflix.mediaclient.clutils.EmptyPlayContext;
import com.netflix.mediaclient.clutils.TrackingInfoHolder;
import com.netflix.mediaclient.servicemgr.PlayLocationType;
import com.netflix.mediaclient.servicemgr.interface_.details.LiveState;
import com.netflix.mediaclient.ui.R;
import com.netflix.mediaclient.ui.common.PlaybackLauncher;
import com.netflix.mediaclient.ui.experience.BrowseExperience;
import com.netflix.mediaclient.ui.lomo.CwView;
import com.netflix.mediaclient.ui.player.PlayerExtras;
import com.netflix.mediaclient.util.PlayContext;
import com.netflix.mediaclient.util.ViewUtils;
import dagger.Lazy;
import dagger.hilt.android.AndroidEntryPoint;
import javax.inject.Inject;
import o.AbstractC6431cdF;
import o.C8004dcG;
import o.C8054ddD;
import o.C8140dek;
import o.C8141del;
import o.C8168dfL;
import o.C8176dfT;
import o.C9834xU;
import o.InterfaceC1598aHf;
import o.InterfaceC5149btM;
import o.InterfaceC5160btX;
import o.InterfaceC5179btq;
import o.InterfaceC6434cdI;
import o.InterfaceC7303ctf;
import o.InterfaceC7365cuo;
import o.SC;
import o.View$OnClickListenerC1217Te;

@AndroidEntryPoint
/* loaded from: classes4.dex */
public class CwView extends AbstractC6431cdF implements InterfaceC6434cdI.c<InterfaceC5179btq> {
    protected NetflixImageView a;
    public InterfaceC5179btq b;
    protected TrackingInfoHolder c;
    protected ImageView d;
    protected View e;
    protected TextView g;
    private View$OnClickListenerC1217Te h;
    private LiveState i;
    private final SC j;
    @Inject
    public Lazy<PlaybackLauncher> playbackLauncher;

    protected int a() {
        return R.i.z;
    }

    public CwView(Context context) {
        super(context);
        this.i = LiveState.e;
        this.j = new SC();
        i();
    }

    public CwView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.i = LiveState.e;
        this.j = new SC();
        i();
    }

    public CwView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.i = LiveState.e;
        this.j = new SC();
        i();
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return Button.class.getName();
    }

    public void b() {
        this.g = (TextView) findViewById(R.g.gU);
        this.a = (NetflixImageView) findViewById(R.g.aH);
        this.e = findViewById(R.g.aM);
        this.d = (ImageView) findViewById(R.g.aI);
    }

    private void i() {
        TraceCompat.beginSection("CwView.init");
        setFocusable(true);
        setBackgroundResource(C9834xU.j.K);
        View.inflate(getContext(), a(), this);
        b();
        this.h = new View$OnClickListenerC1217Te((NetflixActivity) C8141del.d(getContext(), NetflixActivity.class), this);
        if (BrowseExperience.e()) {
            this.j.b(ContextCompat.getColor(getContext(), R.c.f13242o));
        }
        View view = this.e;
        if (view != null) {
            view.setBackground(this.j);
        }
        TraceCompat.endSection();
    }

    public String e(InterfaceC5179btq interfaceC5179btq, InterfaceC5149btM interfaceC5149btM) {
        return interfaceC5179btq.getBoxshotUrl();
    }

    public void c(InterfaceC5179btq interfaceC5179btq, InterfaceC5149btM interfaceC5149btM, TrackingInfoHolder trackingInfoHolder, int i, boolean z, LiveState liveState) {
        this.i = liveState;
        c(interfaceC5179btq, interfaceC5149btM, trackingInfoHolder, i, z);
    }

    @Override // o.InterfaceC6434cdI.c
    /* renamed from: b */
    public void c(InterfaceC5179btq interfaceC5179btq, InterfaceC5149btM interfaceC5149btM, TrackingInfoHolder trackingInfoHolder, int i, boolean z) {
        String format;
        this.b = interfaceC5179btq;
        this.c = trackingInfoHolder;
        setVisibility(0);
        String title = interfaceC5179btq.getTitle();
        setContentDescription(C8140dek.a.b(getContext(), interfaceC5179btq));
        b(interfaceC5149btM, z);
        setOnClickListener(d());
        InterfaceC5160btX aE_ = interfaceC5179btq.aE_();
        this.j.e(C8004dcG.e.a(aE_.aF_(), aE_.g(), aE_.ay_()));
        if (this.d != null) {
            if (C8168dfL.g(title)) {
                format = getResources().getString(R.o.eq);
            } else {
                format = String.format(getResources().getString(R.o.S), title);
            }
            this.d.setContentDescription(format);
            this.h.d(this.d, interfaceC5179btq, trackingInfoHolder);
            ViewUtils.d(this.d);
        }
        TextView textView = this.g;
        if (textView != null) {
            textView.setText(C8176dfT.b(getContext(), interfaceC5179btq, interfaceC5179btq.getType()));
        }
    }

    @Override // o.bDG
    public PlayContext y_() {
        TrackingInfoHolder trackingInfoHolder = this.c;
        if (trackingInfoHolder != null) {
            return trackingInfoHolder.d(PlayLocationType.VIDEO_VIEW, false);
        }
        InterfaceC1598aHf.a("CwView.getPlayContext has null trackingInfo");
        return new EmptyPlayContext("CwView", -510);
    }

    @Override // o.InterfaceC6434cdI.c
    public boolean c() {
        NetflixImageView netflixImageView = this.a;
        return netflixImageView != null && netflixImageView.isImageContentMissingForPresentationTracking();
    }

    protected View.OnClickListener d() {
        return new View.OnClickListener() { // from class: o.cdy
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CwView.this.e(view);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e(View view) {
        InterfaceC5179btq interfaceC5179btq = this.b;
        String aH_ = interfaceC5179btq != null ? interfaceC5179btq.aH_() : null;
        if (aH_ != null) {
            if (((NetflixActivity) C8054ddD.a(getContext(), NetflixActivity.class)) != null) {
                InterfaceC7303ctf.c(getContext()).a(getContext(), aH_, new InterfaceC7365cuo() { // from class: com.netflix.mediaclient.ui.lomo.CwView.5
                    @Override // o.InterfaceC7365cuo
                    public void b() {
                        PlayerExtras playerExtras = new PlayerExtras();
                        playerExtras.b(CwView.this.i);
                        InterfaceC5179btq interfaceC5179btq2 = CwView.this.b;
                        CwView.this.playbackLauncher.get().d(interfaceC5179btq2, interfaceC5179btq2.getType(), CwView.this.y_(), playerExtras, PlaybackLauncher.c);
                    }
                });
                return;
            }
            return;
        }
        InterfaceC1598aHf.a("CwView onClick(): video is null");
    }

    protected void b(InterfaceC5149btM interfaceC5149btM, boolean z) {
        String e = e(this.b, interfaceC5149btM);
        if (C8168dfL.g(e)) {
            InterfaceC1598aHf.a("image url is empty, CwView.loadImage");
        } else {
            this.a.showImage(new ShowImageRequest().a(e).j(z));
        }
    }
}
