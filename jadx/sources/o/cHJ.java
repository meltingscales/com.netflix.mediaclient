package o;

import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import com.netflix.cl.Logger;
import com.netflix.cl.model.event.session.Countdown;
import com.netflix.mediaclient.android.widget.NetflixImageView;
import com.netflix.model.leafs.PostPlayExperience;
import com.netflix.model.leafs.PostPlayItem;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Function;
import io.reactivex.rxkotlin.SubscribersKt;
import io.reactivex.subjects.Subject;
import java.util.concurrent.TimeUnit;
import o.C8632dsu;
import o.cBO;
import o.cHJ;
import o.cIE;
import o.dpR;

/* loaded from: classes4.dex */
public final class cHJ extends AbstractC5765cHn {
    public static final b e = new b(null);
    private final PostPlayItem a;
    private Long b;
    private final C1203Sq c;
    private final int d;
    private final C1203Sq f;
    private final PostPlayExperience g;
    private final Subject<cBO> h;
    private final ViewGroup j;
    private final NetflixImageView k;
    private PostPlayItem l;
    private final C1204Sr m;
    private final NetflixImageView n;

    /* renamed from: o  reason: collision with root package name */
    private Disposable f13660o;
    private final C1204Sr q;
    private final ViewGroup r;

    @Override // o.AbstractC5765cHn
    public int bI_() {
        return this.d;
    }

    public int g() {
        return cIE.c.af;
    }

    @Override // o.AbstractC9944zY
    /* renamed from: j */
    public ViewGroup e() {
        return this.r;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x010d, code lost:
        r6.l = r6.g.getItems().get(r8);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public cHJ(android.view.ViewGroup r7, com.netflix.model.leafs.PostPlayExperience r8, io.reactivex.subjects.Subject<o.cBO> r9) {
        /*
            Method dump skipped, instructions count: 406
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.cHJ.<init>(android.view.ViewGroup, com.netflix.model.leafs.PostPlayExperience, io.reactivex.subjects.Subject):void");
    }

    /* loaded from: classes4.dex */
    public static final class b {
        public /* synthetic */ b(C8627dsp c8627dsp) {
            this();
        }

        private b() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(cHJ chj, View view) {
        C8632dsu.c((Object) chj, "");
        Subject<cBO> subject = chj.h;
        PostPlayItem postPlayItem = chj.a;
        C8632dsu.a(postPlayItem, "");
        subject.onNext(new cBO.T(postPlayItem));
        chj.c();
        Long l = chj.b;
        if (l != null) {
            Logger.INSTANCE.cancelSession(Long.valueOf(l.longValue()));
            chj.b = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(cHJ chj, PostPlayItem postPlayItem, View view) {
        C8632dsu.c((Object) chj, "");
        chj.h.onNext(new cBO.T(postPlayItem));
        chj.c();
    }

    private final void b(int i, int i2, int i3, float f) {
        ConstraintSet constraintSet = new ConstraintSet();
        ConstraintLayout constraintLayout = (ConstraintLayout) e().findViewById(cIE.b.bq);
        constraintSet.clone(constraintLayout);
        constraintSet.constrainPercentWidth(i3, f);
        constraintSet.setDimensionRatio(i3, i + ":" + i2);
        constraintSet.applyTo(constraintLayout);
    }

    @Override // o.AbstractC9944zY, o.InterfaceC9939zT
    public void a() {
        this.b = Logger.INSTANCE.startSession(new Countdown(Long.valueOf(this.g.getAutoplaySeconds() * 1000)));
        i();
        if (C()) {
            e().setAlpha(1.0f);
        } else {
            e().animate().alpha(1.0f).setDuration(300L).start();
        }
    }

    @Override // o.AbstractC9944zY, o.InterfaceC9939zT
    public void c() {
        f();
        if (C()) {
            e().setAlpha(1.0f);
        } else {
            e().animate().alpha(0.0f).setDuration(300L).start();
        }
    }

    public void d(int i) {
        if (i > 0) {
            this.c.setText(e().getContext().getString(cIE.a.m, Integer.valueOf(i)));
        } else {
            this.c.setText(this.j.getContext().getString(cIE.a.f13664o));
        }
    }

    public void i() {
        f();
        Observable<Long> take = Observable.interval(0L, 1L, TimeUnit.SECONDS, AndroidSchedulers.mainThread()).take(this.a.getAutoPlaySeconds());
        final drM<Long, Long> drm = new drM<Long, Long>() { // from class: com.netflix.mediaclient.ui.player.v2.uiView.PostPlayItemTwoUpUIView$startTimer$1
            {
                super(1);
            }

            @Override // o.drM
            /* renamed from: d */
            public final Long invoke(Long l) {
                PostPlayItem postPlayItem;
                C8632dsu.c((Object) l, "");
                postPlayItem = cHJ.this.a;
                return Long.valueOf(postPlayItem.getAutoPlaySeconds() - l.longValue());
            }
        };
        Observable<R> map = take.map(new Function() { // from class: o.cHF
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                Long c;
                c = cHJ.c(drM.this, obj);
                return c;
            }
        });
        C8632dsu.a(map, "");
        this.f13660o = SubscribersKt.subscribeBy$default(map, (drM) null, new drO<dpR>() { // from class: com.netflix.mediaclient.ui.player.v2.uiView.PostPlayItemTwoUpUIView$startTimer$2
            {
                super(0);
            }

            @Override // o.drO
            public /* synthetic */ dpR invoke() {
                a();
                return dpR.c;
            }

            public final void a() {
                Long l;
                l = cHJ.this.b;
                if (l != null) {
                    cHJ chj = cHJ.this;
                    Logger.INSTANCE.endSession(Long.valueOf(l.longValue()));
                    chj.b = null;
                }
                cHJ.this.c();
            }
        }, new drM<Long, dpR>() { // from class: com.netflix.mediaclient.ui.player.v2.uiView.PostPlayItemTwoUpUIView$startTimer$3
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(Long l) {
                c(l);
                return dpR.c;
            }

            public final void c(Long l) {
                cHJ.this.d((int) l.longValue());
            }
        }, 1, (Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Long c(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        C8632dsu.c(obj, "");
        return (Long) drm.invoke(obj);
    }

    public void f() {
        Long l = this.b;
        if (l != null) {
            Logger.INSTANCE.cancelSession(Long.valueOf(l.longValue()));
            this.b = null;
        }
        Disposable disposable = this.f13660o;
        if (disposable != null) {
            disposable.dispose();
        }
    }
}
