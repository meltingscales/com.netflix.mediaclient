package o;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.widget.FrameLayout;
import com.netflix.android.imageloader.api.ShowImageRequest;
import com.netflix.cl.model.AppView;
import com.netflix.cl.model.TrackingInfo;
import com.netflix.mediaclient.android.lottie.drawables.RaterThumbUpLottieDrawable;
import com.netflix.mediaclient.android.widget.NetflixImageView;
import com.netflix.mediaclient.clutils.TrackingInfoHolder;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.rxkotlin.DisposableKt;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.PropertyReference1Impl;
import o.C1106Ox;
import o.C8632dsu;
import o.InterfaceC3825bMa;
import o.bAG;
import o.bAL;
import o.dpR;

/* loaded from: classes4.dex */
public abstract class bAL extends AbstractC3336ax<b> implements InterfaceC3829bMe {
    public String b;
    public AppView c;
    public CharSequence d;
    public TrackingInfoHolder f;
    public String g;
    public CharSequence h;
    public CharSequence i;
    public String j;
    private View.OnClickListener m;
    private AnimationSet n;

    /* renamed from: o  reason: collision with root package name */
    private InterfaceC3825bMa.a f13491o;
    private final C1106Ox k = new C1106Ox();
    private drO<? extends TrackingInfo> t = new drO<TrackingInfo>() { // from class: com.netflix.mediaclient.ui.collecttaste.impl.lolomo.CollectTasteLolomoModel$trackingInfoBuilder$1
        {
            super(0);
        }

        @Override // o.drO
        /* renamed from: a */
        public final TrackingInfo invoke() {
            return TrackingInfoHolder.e(bAL.this.q(), null, 1, null);
        }
    };
    private final CompositeDisposable l = new CompositeDisposable();

    @Override // o.AbstractC3073as
    public int a() {
        return bAG.b.b;
    }

    public final void b(View.OnClickListener onClickListener) {
        this.m = onClickListener;
    }

    @Override // o.InterfaceC3829bMe
    public drO<TrackingInfo> m() {
        return this.t;
    }

    @Override // o.InterfaceC3825bMa
    public InterfaceC3825bMa.a n() {
        return this.f13491o;
    }

    public final View.OnClickListener t() {
        return this.m;
    }

    public final CharSequence s() {
        CharSequence charSequence = this.i;
        if (charSequence != null) {
            return charSequence;
        }
        C8632dsu.d("");
        return null;
    }

    public final CharSequence o() {
        CharSequence charSequence = this.d;
        if (charSequence != null) {
            return charSequence;
        }
        C8632dsu.d("");
        return null;
    }

    public final CharSequence k() {
        CharSequence charSequence = this.h;
        if (charSequence != null) {
            return charSequence;
        }
        C8632dsu.d("");
        return null;
    }

    @Override // o.InterfaceC3829bMe
    public AppView aj_() {
        AppView appView = this.c;
        if (appView != null) {
            return appView;
        }
        C8632dsu.d("");
        return null;
    }

    public final TrackingInfoHolder q() {
        TrackingInfoHolder trackingInfoHolder = this.f;
        if (trackingInfoHolder != null) {
            return trackingInfoHolder;
        }
        C8632dsu.d("");
        return null;
    }

    public final String p() {
        String str = this.g;
        if (str != null) {
            return str;
        }
        C8632dsu.d("");
        return null;
    }

    public final String r() {
        String str = this.j;
        if (str != null) {
            return str;
        }
        C8632dsu.d("");
        return null;
    }

    public final String l() {
        String str = this.b;
        if (str != null) {
            return str;
        }
        C8632dsu.d("");
        return null;
    }

    @Override // o.AbstractC3336ax
    /* renamed from: c */
    public void e(b bVar) {
        C8632dsu.c((Object) bVar, "");
        C1203Sq b2 = bVar.b();
        View.OnClickListener onClickListener = this.m;
        b2.setOnClickListener(onClickListener);
        b2.setClickable(onClickListener != null);
        bVar.b().setText(k());
        bVar.c().setText(s());
        bVar.a().setText(o());
        if (bVar.f().getVisibility() == 0) {
            return;
        }
        bVar.g().setAlpha(0.0f);
        this.k.setState((C1106Ox) RaterThumbUpLottieDrawable.State.e);
        bVar.g().setImageDrawable(this.k);
        b(bVar.e(), l());
        b(bVar.d(), r());
        b(bVar.h(), p());
        e2(bVar);
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: a */
    public void e(b bVar) {
        C8632dsu.c((Object) bVar, "");
        this.l.clear();
        C1203Sq b2 = bVar.b();
        b2.setOnClickListener(null);
        b2.setClickable(false);
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: b */
    public void c(int i, final b bVar) {
        C8632dsu.c((Object) bVar, "");
        super.a(i, (int) bVar);
        if (i == 4 && this.k.getState() == RaterThumbUpLottieDrawable.State.e) {
            Observable<Long> timer = Observable.timer(75L, TimeUnit.MILLISECONDS, AndroidSchedulers.mainThread());
            final drM<Long, dpR> drm = new drM<Long, dpR>() { // from class: com.netflix.mediaclient.ui.collecttaste.impl.lolomo.CollectTasteLolomoModel$onVisibilityStateChanged$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // o.drM
                public /* synthetic */ dpR invoke(Long l) {
                    e(l);
                    return dpR.c;
                }

                public final void e(Long l) {
                    AnimationSet animationSet;
                    FrameLayout i2 = bAL.b.this.i();
                    animationSet = this.n;
                    if (animationSet == null) {
                        C8632dsu.d("");
                        animationSet = null;
                    }
                    i2.startAnimation(animationSet);
                }
            };
            Disposable subscribe = timer.subscribe(new Consumer() { // from class: o.bAP
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    bAL.e(drM.this, obj);
                }
            });
            C8632dsu.a(subscribe, "");
            DisposableKt.addTo(subscribe, this.l);
        } else if (i == 1) {
            bVar.f().setVisibility(4);
            bVar.g().setAlpha(0.0f);
            this.k.setState((C1106Ox) RaterThumbUpLottieDrawable.State.e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        drm.invoke(obj);
    }

    private final void b(NetflixImageView netflixImageView, String str) {
        netflixImageView.showImage(new ShowImageRequest().a(str).c(ShowImageRequest.Priority.a).d());
    }

    /* renamed from: e  reason: avoid collision after fix types in other method */
    private final void e2(b bVar) {
        AnimationSet animationSet;
        this.n = bAT.b(new bAQ(633L, 0L, 1.04f, 0.095f, -0.083f, 10.0f));
        AnimationSet b2 = bAT.b(new bAQ(566L, 67L, 1.04f, -0.095f, -0.09f, -9.0f));
        AnimationSet b3 = bAT.b(new bAQ(500L, 133L, 1.02f, -0.019f, -0.15f, 3.0f));
        AnimationSet d = bAT.d(new bAU(417L, 50L, 1.0f, 417L, 0L), null, 2, null);
        AnimationSet a2 = bAT.a(new bAU(100L, 250L, 0.7f, 20L, 250L), new a(bVar));
        AnimationSet animationSet2 = this.n;
        if (animationSet2 == null) {
            C8632dsu.d("");
            animationSet = null;
        } else {
            animationSet = animationSet2;
        }
        animationSet.setAnimationListener(new e(bVar, d, a2, b2, b3, this));
    }

    /* loaded from: classes4.dex */
    public static final class a extends Abstractanimation.Animation$AnimationListenerC9916yx {
        final /* synthetic */ b a;

        a(b bVar) {
            this.a = bVar;
        }

        @Override // o.Abstractanimation.Animation$AnimationListenerC9916yx, android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            this.a.g().setAlpha(1.0f);
            this.a.g().setVisibility(0);
            this.a.f().setVisibility(0);
        }
    }

    /* loaded from: classes4.dex */
    public static final class e extends Abstractanimation.Animation$AnimationListenerC9916yx {
        final /* synthetic */ b a;
        final /* synthetic */ AnimationSet b;
        final /* synthetic */ AnimationSet c;
        final /* synthetic */ AnimationSet d;
        final /* synthetic */ AnimationSet e;
        final /* synthetic */ bAL j;

        e(b bVar, AnimationSet animationSet, AnimationSet animationSet2, AnimationSet animationSet3, AnimationSet animationSet4, bAL bal) {
            this.a = bVar;
            this.c = animationSet;
            this.b = animationSet2;
            this.d = animationSet3;
            this.e = animationSet4;
            this.j = bal;
        }

        @Override // o.Abstractanimation.Animation$AnimationListenerC9916yx, android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            this.a.f().startAnimation(this.c);
            this.a.g().startAnimation(this.b);
            this.a.d().startAnimation(this.d);
            this.a.e().startAnimation(this.e);
            Observable<Long> timer = Observable.timer(250L, TimeUnit.MILLISECONDS, AndroidSchedulers.mainThread());
            final bAL bal = this.j;
            final drM<Long, dpR> drm = new drM<Long, dpR>() { // from class: com.netflix.mediaclient.ui.collecttaste.impl.lolomo.CollectTasteLolomoModel$initEntryModuleAnimationSets$1$onAnimationStart$1
                {
                    super(1);
                }

                @Override // o.drM
                public /* synthetic */ dpR invoke(Long l) {
                    d(l);
                    return dpR.c;
                }

                public final void d(Long l) {
                    C1106Ox c1106Ox;
                    c1106Ox = bAL.this.k;
                    c1106Ox.animateToState(RaterThumbUpLottieDrawable.State.b);
                }
            };
            Disposable subscribe = timer.subscribe(new Consumer() { // from class: o.bAO
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    bAL.e.a(drM.this, obj);
                }
            });
            C8632dsu.a(subscribe, "");
            DisposableKt.addTo(subscribe, this.j.l);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void a(drM drm, Object obj) {
            C8632dsu.c((Object) drm, "");
            drm.invoke(obj);
        }
    }

    /* loaded from: classes4.dex */
    public static final class b extends bIG {
        static final /* synthetic */ dtC<Object>[] e = {dsA.c(new PropertyReference1Impl(b.class, "headline", "getHeadline()Lcom/netflix/mediaclient/android/widget/NetflixTextView;", 0)), dsA.c(new PropertyReference1Impl(b.class, "body", "getBody()Lcom/netflix/mediaclient/android/widget/NetflixTextView;", 0)), dsA.c(new PropertyReference1Impl(b.class, "bottomTitleCard", "getBottomTitleCard()Lcom/netflix/mediaclient/android/widget/NetflixImageView;", 0)), dsA.c(new PropertyReference1Impl(b.class, "middleTitleCard", "getMiddleTitleCard()Lcom/netflix/mediaclient/android/widget/NetflixImageView;", 0)), dsA.c(new PropertyReference1Impl(b.class, "topTitleCard", "getTopTitleCard()Lcom/netflix/mediaclient/android/widget/NetflixImageView;", 0)), dsA.c(new PropertyReference1Impl(b.class, "topTitleCardContainer", "getTopTitleCardContainer()Landroid/widget/FrameLayout;", 0)), dsA.c(new PropertyReference1Impl(b.class, "overlayBackground", "getOverlayBackground()Lcom/netflix/mediaclient/android/widget/NetflixImageView;", 0)), dsA.c(new PropertyReference1Impl(b.class, "overlayIcon", "getOverlayIcon()Lcom/netflix/mediaclient/android/widget/NetflixImageView;", 0)), dsA.c(new PropertyReference1Impl(b.class, "cta", "getCta()Lcom/netflix/mediaclient/android/widget/NetflixTextButton;", 0))};
        private final dsZ a = bIF.d(this, bAG.a.j, false, 2, null);
        private final dsZ d = bIF.d(this, bAG.a.a, false, 2, null);
        private final dsZ c = bIF.d(this, bAG.a.b, false, 2, null);
        private final dsZ g = bIF.d(this, bAG.a.f13488o, false, 2, null);
        private final dsZ h = bIF.d(this, bAG.a.I, false, 2, null);
        private final dsZ m = bIF.d(this, bAG.a.E, false, 2, null);
        private final dsZ f = bIF.d(this, bAG.a.k, false, 2, null);
        private final dsZ j = bIF.d(this, bAG.a.r, false, 2, null);
        private final dsZ b = bIF.d(this, bAG.a.f, false, 2, null);

        public final C1204Sr c() {
            return (C1204Sr) this.a.getValue(this, e[0]);
        }

        public final C1204Sr a() {
            return (C1204Sr) this.d.getValue(this, e[1]);
        }

        public final NetflixImageView e() {
            return (NetflixImageView) this.c.getValue(this, e[2]);
        }

        public final NetflixImageView d() {
            return (NetflixImageView) this.g.getValue(this, e[3]);
        }

        public final NetflixImageView h() {
            return (NetflixImageView) this.h.getValue(this, e[4]);
        }

        public final FrameLayout i() {
            return (FrameLayout) this.m.getValue(this, e[5]);
        }

        public final NetflixImageView f() {
            return (NetflixImageView) this.f.getValue(this, e[6]);
        }

        public final NetflixImageView g() {
            return (NetflixImageView) this.j.getValue(this, e[7]);
        }

        public final C1203Sq b() {
            return (C1203Sq) this.b.getValue(this, e[8]);
        }

        public final boolean j() {
            return e().isImageLoaded() && d().isImageLoaded() && h().isImageLoaded();
        }
    }

    @Override // o.InterfaceC3829bMe
    public boolean h(AbstractC3179au abstractC3179au) {
        C8632dsu.c((Object) abstractC3179au, "");
        return ((b) C9726vo.d(abstractC3179au, b.class)).j();
    }
}
