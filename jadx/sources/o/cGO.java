package o;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import com.netflix.android.imageloader.api.ShowImageRequest;
import com.netflix.cl.Logger;
import com.netflix.cl.model.event.session.Countdown;
import com.netflix.mediaclient.android.widget.NetflixImageView;
import com.netflix.model.leafs.PostPlayItem;
import com.netflix.model.leafs.SeasonRenewal;
import com.netflix.model.leafs.SeasonRenewalAsset;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Function;
import io.reactivex.rxkotlin.SubscribersKt;
import io.reactivex.subjects.Subject;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import o.C8632dsu;
import o.cBO;
import o.cGO;
import o.cIE;
import o.dpR;

/* loaded from: classes4.dex */
public final class cGO extends AbstractC5765cHn implements cFX {
    private final boolean a;
    private Long b;
    private final ViewGroup c;
    private final NetflixImageView d;
    private final PostPlayItem e;
    private final NetflixImageView f;
    private final SeasonRenewal g;
    private final C1204Sr h;
    private final Subject<cBO> j;
    private final ViewGroup k;
    private final TextView n;

    /* renamed from: o  reason: collision with root package name */
    private Disposable f13657o;

    @Override // o.AbstractC9944zY
    /* renamed from: f */
    public ViewGroup e() {
        return this.k;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cGO(ViewGroup viewGroup, Subject<cBO> subject, SeasonRenewal seasonRenewal, PostPlayItem postPlayItem, boolean z) {
        super(viewGroup);
        C8632dsu.c((Object) viewGroup, "");
        C8632dsu.c((Object) subject, "");
        C8632dsu.c((Object) seasonRenewal, "");
        C8632dsu.c((Object) postPlayItem, "");
        this.c = viewGroup;
        this.j = subject;
        this.g = seasonRenewal;
        this.e = postPlayItem;
        this.a = z;
        View e = C9703vR.e(viewGroup, cIE.c.M, 0, 2, null);
        C8632dsu.d(e);
        this.k = (ViewGroup) e;
        View findViewById = e().findViewById(cIE.b.bD);
        C8632dsu.a(findViewById, "");
        this.h = (C1204Sr) findViewById;
        View findViewById2 = e().findViewById(cIE.b.by);
        C8632dsu.a(findViewById2, "");
        TextView textView = (TextView) findViewById2;
        this.n = textView;
        View findViewById3 = e().findViewById(cIE.b.bx);
        C8632dsu.a(findViewById3, "");
        this.f = (NetflixImageView) findViewById3;
        View findViewById4 = e().findViewById(cIE.b.bw);
        C8632dsu.a(findViewById4, "");
        NetflixImageView netflixImageView = (NetflixImageView) findViewById4;
        this.d = netflixImageView;
        e().setVisibility(8);
        netflixImageView.setOnClickListener(new View.OnClickListener() { // from class: o.cGS
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                cGO.a(cGO.this, view);
            }
        });
        textView.setText(seasonRenewal.message());
        c(seasonRenewal.autoPlaySeconds());
        a(seasonRenewal, postPlayItem);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(cGO cgo, View view) {
        Long l;
        C8632dsu.c((Object) cgo, "");
        cgo.c();
        if (cgo.a && (l = cgo.b) != null) {
            Logger.INSTANCE.cancelSession(Long.valueOf(l.longValue()));
            cgo.b = null;
        }
        cgo.j.onNext(new cBO.T(cgo.e));
    }

    @Override // o.AbstractC9944zY, o.InterfaceC9939zT
    public void a() {
        if (this.a) {
            this.b = Logger.INSTANCE.startSession(new Countdown(Long.valueOf(this.g.autoPlaySeconds() * 1000)));
        }
    }

    public final void a(SeasonRenewal seasonRenewal, PostPlayItem postPlayItem) {
        Map<String, SeasonRenewalAsset> assets;
        C8632dsu.c((Object) seasonRenewal, "");
        C8632dsu.c((Object) postPlayItem, "");
        if (seasonRenewal.assets() != null && (assets = seasonRenewal.assets()) != null) {
            SeasonRenewalAsset seasonRenewalAsset = null;
            for (Map.Entry<String, SeasonRenewalAsset> entry : assets.entrySet()) {
                SeasonRenewalAsset value = entry.getValue();
                C8632dsu.d(value);
                SeasonRenewalAsset seasonRenewalAsset2 = value;
                if (C8632dsu.c((Object) entry.getKey(), (Object) "LOGO")) {
                    seasonRenewalAsset = seasonRenewalAsset2;
                }
            }
            if (seasonRenewalAsset != null) {
                String url = seasonRenewalAsset.url();
                this.f.setVisibility(4);
                this.f.showImage(new ShowImageRequest().a(url).a(true).c(ShowImageRequest.Priority.a));
                e(seasonRenewalAsset.width(), seasonRenewalAsset.height(), this.f.getId());
            }
        }
        String url2 = postPlayItem.getDisplayArtAsset().getUrl();
        this.d.setVisibility(4);
        this.d.showImage(new ShowImageRequest().a(url2).a(true).c(ShowImageRequest.Priority.a));
        e(postPlayItem.getDisplayArtAsset().getWidth(), postPlayItem.getDisplayArtAsset().getHeight(), this.d.getId());
    }

    private final void e(int i, int i2, int i3) {
        ConstraintSet constraintSet = new ConstraintSet();
        ConstraintLayout constraintLayout = (ConstraintLayout) e().findViewById(cIE.b.bc);
        constraintSet.clone(constraintLayout);
        if (C8150deu.h()) {
            constraintSet.constrainPercentWidth(i3, 0.2f);
        } else {
            constraintSet.constrainPercentWidth(i3, 0.3f);
        }
        constraintSet.setDimensionRatio(i3, i + ":" + i2);
        constraintSet.applyTo(constraintLayout);
    }

    public void i() {
        this.d.setVisibility(0);
        this.f.setVisibility(0);
        AbstractC5765cHn.a(this, true, true, 0.0f, false, null, 28, null);
        g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void l() {
        if (this.a) {
            this.j.onNext(new cBO.T(this.e));
            c();
        }
    }

    public void g() {
        j();
        if (this.a) {
            Observable<Long> take = Observable.interval(0L, 1L, TimeUnit.SECONDS, AndroidSchedulers.mainThread()).take(this.g.autoPlaySeconds());
            final drM<Long, Long> drm = new drM<Long, Long>() { // from class: com.netflix.mediaclient.ui.player.v2.uiView.PlayerSeasonRenewalUIView$startTimer$1
                {
                    super(1);
                }

                @Override // o.drM
                /* renamed from: d */
                public final Long invoke(Long l) {
                    SeasonRenewal seasonRenewal;
                    C8632dsu.c((Object) l, "");
                    seasonRenewal = cGO.this.g;
                    return Long.valueOf(seasonRenewal.autoPlaySeconds() - l.longValue());
                }
            };
            Observable<R> map = take.map(new Function() { // from class: o.cGU
                @Override // io.reactivex.functions.Function
                public final Object apply(Object obj) {
                    Long b;
                    b = cGO.b(drM.this, obj);
                    return b;
                }
            });
            C8632dsu.a(map, "");
            this.f13657o = SubscribersKt.subscribeBy(map, new drM<Throwable, dpR>() { // from class: com.netflix.mediaclient.ui.player.v2.uiView.PlayerSeasonRenewalUIView$startTimer$2
                {
                    super(1);
                }

                @Override // o.drM
                public /* synthetic */ dpR invoke(Throwable th) {
                    c(th);
                    return dpR.c;
                }

                public final void c(Throwable th) {
                    Long l;
                    C8632dsu.c((Object) th, "");
                    l = cGO.this.b;
                    if (l != null) {
                        cGO cgo = cGO.this;
                        Logger.INSTANCE.endSession(Long.valueOf(l.longValue()));
                        cgo.b = null;
                    }
                }
            }, new drO<dpR>() { // from class: com.netflix.mediaclient.ui.player.v2.uiView.PlayerSeasonRenewalUIView$startTimer$3
                {
                    super(0);
                }

                @Override // o.drO
                public /* synthetic */ dpR invoke() {
                    e();
                    return dpR.c;
                }

                public final void e() {
                    Long l;
                    l = cGO.this.b;
                    if (l != null) {
                        cGO cgo = cGO.this;
                        Logger.INSTANCE.endSession(Long.valueOf(l.longValue()));
                        cgo.b = null;
                    }
                    cGO.this.l();
                }
            }, new drM<Long, dpR>() { // from class: com.netflix.mediaclient.ui.player.v2.uiView.PlayerSeasonRenewalUIView$startTimer$4
                {
                    super(1);
                }

                @Override // o.drM
                public /* synthetic */ dpR invoke(Long l) {
                    e(l);
                    return dpR.c;
                }

                public final void e(Long l) {
                    cGO.this.c((int) l.longValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Long b(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        C8632dsu.c(obj, "");
        return (Long) drm.invoke(obj);
    }

    public void j() {
        Long l = this.b;
        if (l != null) {
            Logger.INSTANCE.cancelSession(Long.valueOf(l.longValue()));
            this.b = null;
        }
        Disposable disposable = this.f13657o;
        if (disposable != null) {
            disposable.dispose();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c(int i) {
        if (i > 0 && this.a) {
            if (C8632dsu.c((Object) this.e.getExperienceType(), (Object) "episodicTeaser")) {
                this.h.setText(C1333Xq.d(com.netflix.mediaclient.ui.R.o.gc).d("seconds", String.valueOf(i)).c());
                return;
            } else {
                this.h.setText(C1333Xq.d(com.netflix.mediaclient.ui.R.o.gd).d("seconds", String.valueOf(i)).c());
                return;
            }
        }
        this.h.setText(e().getContext().getString(com.netflix.mediaclient.ui.R.o.gh));
    }

    @Override // o.AbstractC9944zY, o.InterfaceC9939zT
    public void c() {
        AbstractC5765cHn.a(this, false, true, 0.0f, false, null, 28, null);
        e().setVisibility(8);
        j();
    }
}
