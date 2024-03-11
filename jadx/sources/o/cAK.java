package o;

import android.annotation.SuppressLint;
import android.os.Build;
import android.view.View;
import com.netflix.android.imageloader.api.ShowImageRequest;
import com.netflix.mediaclient.android.widget.NetflixImageView;
import com.netflix.mediaclient.clutils.TrackingInfoHolder;
import com.netflix.mediaclient.playerui.videoview.api.PlayerControls;
import com.netflix.mediaclient.playerui.videoview.api.PlayerState;
import io.reactivex.Observable;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Consumer;
import io.reactivex.rxkotlin.DisposableKt;
import io.reactivex.rxkotlin.SubscribersKt;
import io.reactivex.subjects.PublishSubject;
import kotlin.jvm.internal.PropertyReference1Impl;
import o.C1682aKi;
import o.C7639czx;
import o.C8632dsu;
import o.C9834xU;
import o.bLR;
import o.cAK;
import o.cHK;
import o.dpR;

/* loaded from: classes4.dex */
public abstract class cAK extends AbstractC3336ax<a> implements bLR<a> {
    public static final c c = new c(null);
    public C9935zP b;
    public C5528cAt d;
    private int h;
    private final CompositeDisposable g = new CompositeDisposable();
    private final C5509cAa i = new C5509cAa();

    @Override // o.AbstractC3073as
    public int a() {
        return C7639czx.c.f13793o;
    }

    @Override // o.bLR
    public int e() {
        return this.h;
    }

    public final C5509cAa i() {
        return this.i;
    }

    @Override // o.bLR
    public Integer d() {
        return bLR.c.d(this);
    }

    public final C9935zP l() {
        C9935zP c9935zP = this.b;
        if (c9935zP != null) {
            return c9935zP;
        }
        C8632dsu.d("");
        return null;
    }

    public final C5528cAt o() {
        C5528cAt c5528cAt = this.d;
        if (c5528cAt != null) {
            return c5528cAt;
        }
        C8632dsu.d("");
        return null;
    }

    /* loaded from: classes4.dex */
    public static final class c {
        public /* synthetic */ c(C8627dsp c8627dsp) {
            this();
        }

        private c() {
        }
    }

    @Override // o.AbstractC3336ax
    @SuppressLint({"CheckResult"})
    /* renamed from: a */
    public void e(final a aVar) {
        C8632dsu.c((Object) aVar, "");
        d(aVar);
        c2(aVar);
        DisposableKt.plusAssign(this.g, SubscribersKt.subscribeBy$default(aVar.a(), (drM) null, (drO) null, new drM<b, dpR>() { // from class: com.netflix.mediaclient.ui.player.postplay.ui.epoxymodels.PostPlayPreviewsVideoModel$bind$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(cAK.b bVar) {
                a(bVar);
                return dpR.c;
            }

            public final void a(cAK.b bVar) {
                C8632dsu.c((Object) bVar, "");
                cAK.this.b(bVar, aVar);
            }
        }, 3, (Object) null));
        Observable d = l().d(cHK.class);
        final drM<cHK, dpR> drm = new drM<cHK, dpR>() { // from class: com.netflix.mediaclient.ui.player.postplay.ui.epoxymodels.PostPlayPreviewsVideoModel$bind$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(cHK chk) {
                d(chk);
                return dpR.c;
            }

            public final void d(cHK chk) {
                if (chk instanceof cHK.d) {
                    cAK.a.this.e();
                    this.i().d();
                } else if (chk instanceof cHK.a) {
                    cAK.a.this.e();
                } else if ((chk instanceof cHK.f) && ((cHK.f) chk).e() == this.o().a()) {
                    cAK.a.this.b();
                }
            }
        };
        d.subscribe(new Consumer() { // from class: o.cAN
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                cAK.d(drM.this, obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        drm.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b(b bVar, a aVar) {
        if (C8632dsu.c(bVar, b.d.c)) {
            a(aVar.d());
        }
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: b  reason: avoid collision after fix types in other method */
    public void e(a aVar) {
        C8632dsu.c((Object) aVar, "");
        aVar.d().d();
        aVar.d().ae();
        aVar.c().setVisibility(0);
        this.g.clear();
        this.i.b();
        this.i.a();
    }

    @Override // o.bLR
    /* renamed from: e  reason: avoid collision after fix types in other method */
    public void c(a aVar) {
        C8632dsu.c((Object) aVar, "");
        View findViewById = aVar.r().getRootView().findViewById(C7639czx.e.H);
        C8632dsu.a(findViewById, "");
        if (findViewById.getVisibility() == 0) {
            aVar.d().setVisibility(0);
            if (aVar.b()) {
                this.i.a(aVar.d().D(), TrackingInfoHolder.e(o().g().a(), null, 1, null));
            }
        }
    }

    @Override // o.AbstractC3336ax
    /* renamed from: b */
    public void d(float f, float f2, int i, int i2, a aVar) {
        C8632dsu.c((Object) aVar, "");
        if (f2 >= 97.0f || aVar.c().getAlpha() != 0.0f) {
            return;
        }
        if (Build.VERSION.SDK_INT < 26) {
            aVar.d().ae();
        }
        aVar.c().animate().alpha(1.0f).setDuration(300L).start();
    }

    @Override // o.bLR
    /* renamed from: a */
    public void d(a aVar, boolean z) {
        C8632dsu.c((Object) aVar, "");
        aVar.e();
    }

    private final void d(a aVar) {
        aVar.c().showImage(new ShowImageRequest().a(o().d()).b(true));
    }

    private final void a(C1677aKd c1677aKd) {
        int width = c1677aKd.getWidth();
        c1677aKd.c(width > 0 ? (o().f() * 1000) / width : 100L);
        l().b(cHK.class, new cHK.j(c1677aKd, o()));
    }

    /* loaded from: classes4.dex */
    public static final class e implements C1682aKi.c {
        final /* synthetic */ a c;
        final /* synthetic */ cAK d;

        /* loaded from: classes4.dex */
        public final /* synthetic */ class d {
            public static final /* synthetic */ int[] c;

            static {
                int[] iArr = new int[PlayerState.values().length];
                try {
                    iArr[PlayerState.b.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[PlayerState.e.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[PlayerState.f.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[PlayerState.i.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[PlayerState.a.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[PlayerState.d.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                c = iArr;
            }
        }

        e(a aVar, cAK cak) {
            this.c = aVar;
            this.d = cak;
        }

        @Override // o.C1682aKi.c
        public void a(PlayerState playerState) {
            C8632dsu.c((Object) playerState, "");
            int i = d.c[playerState.ordinal()];
            if (i == 1) {
                this.c.c().animate().alpha(1.0f).setDuration(300L).start();
            } else if (i == 2) {
                this.d.l().b(cHK.class, new cHK.h(this.d.o().a()));
                this.d.i().d();
            } else if (i == 3) {
                this.c.d().setVisibility(0);
                this.c.c().animate().alpha(0.0f).setDuration(300L).start();
                this.d.i().e(this.c.d().D(), TrackingInfoHolder.e(this.d.o().g().a(), null, 1, null));
                this.d.i().c();
            } else if (i == 5) {
                this.d.i().a();
            } else if (i != 6) {
            } else {
                this.c.c().setVisibility(0);
                this.c.c().setAlpha(1.0f);
                this.c.d().setVisibility(8);
                this.d.i().b();
                this.d.i().a();
            }
        }
    }

    /* renamed from: c  reason: avoid collision after fix types in other method */
    private final void c2(a aVar) {
        aVar.d().setPlayerStatusChangeListener(new e(aVar, this));
    }

    /* loaded from: classes4.dex */
    public static final class a extends bIG {
        static final /* synthetic */ dtC<Object>[] e = {dsA.c(new PropertyReference1Impl(a.class, "image", "getImage()Lcom/netflix/mediaclient/android/widget/NetflixImageView;", 0)), dsA.c(new PropertyReference1Impl(a.class, "video", "getVideo()Lcom/netflix/mediaclient/playerui/videoview/PlaylistVideoView;", 0))};
        private final PublishSubject<b> b;
        private final dsZ c = bIF.d(this, C7639czx.e.F, false, 2, null);
        private final dsZ a = bIF.d(this, C7639czx.e.G, false, 2, null);

        public a() {
            PublishSubject<b> create = PublishSubject.create();
            C8632dsu.a(create, "");
            this.b = create;
        }

        public final NetflixImageView c() {
            return (NetflixImageView) this.c.getValue(this, e[0]);
        }

        public final C1677aKd d() {
            return (C1677aKd) this.a.getValue(this, e[1]);
        }

        public final Observable<b> a() {
            Observable<b> hide = this.b.hide();
            C8632dsu.a(hide, "");
            return hide;
        }

        public final void e() {
            if (d().ab()) {
                PlayerControls.a.e(d(), null, 1, null);
                d().setContentDescription("");
            }
        }

        public final boolean b() {
            d().setViewInFocus(true);
            d().setContentDescription(d().getResources().getString(C9834xU.h.a));
            if (!d().ab()) {
                if (d().A() == PlayerState.a) {
                    d().ak();
                } else {
                    this.b.onNext(b.d.c);
                    return true;
                }
            }
            return false;
        }
    }

    /* loaded from: classes4.dex */
    public static abstract class b {
        public /* synthetic */ b(C8627dsp c8627dsp) {
            this();
        }

        /* loaded from: classes4.dex */
        public static final class d extends b {
            public static final d c = new d();

            private d() {
                super(null);
            }
        }

        private b() {
        }
    }
}
