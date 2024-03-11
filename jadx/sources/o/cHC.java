package o;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import com.netflix.cl.Logger;
import com.netflix.cl.model.event.session.Countdown;
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
import o.cHC;
import o.cIE;
import o.dpR;

/* loaded from: classes4.dex */
public class cHC extends AbstractC9944zY<cBO> implements InterfaceC5731cGg {
    public static final e d = new e(null);
    private static final long e = 100;
    private int a;
    private Long b;
    private final int c;
    private C7460cwd f;
    private final C1202Sp g;
    private final ViewGroup h;
    private final Subject<cBO> i;
    private final PostPlayItem j;
    private final Animation k;
    private final Animation l;
    private boolean m;
    private final Animation n;

    /* renamed from: o  reason: collision with root package name */
    private final Animation f13659o;
    private Disposable q;
    private final C1203Sq s;
    private final ViewGroup t;

    public final void a(C7460cwd c7460cwd) {
        this.f = c7460cwd;
    }

    public final void b(Long l) {
        this.b = l;
    }

    public final int f() {
        return this.a;
    }

    @Override // o.InterfaceC5731cGg
    public boolean i() {
        return this.m;
    }

    public final Long k() {
        return this.b;
    }

    public final PostPlayItem l() {
        return this.j;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final C1202Sp m() {
        return this.g;
    }

    public final C7460cwd n() {
        return this.f;
    }

    public int o() {
        return cIE.c.ad;
    }

    @Override // o.AbstractC9944zY
    /* renamed from: r */
    public ViewGroup e() {
        return this.t;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cHC(ViewGroup viewGroup, PostPlayItem postPlayItem, Subject<cBO> subject) {
        super(viewGroup);
        C8632dsu.c((Object) viewGroup, "");
        C8632dsu.c((Object) postPlayItem, "");
        C8632dsu.c((Object) subject, "");
        this.h = viewGroup;
        this.j = postPlayItem;
        this.i = subject;
        View e2 = C9703vR.e(viewGroup, o(), 0, 2, null);
        C8632dsu.d(e2);
        this.t = (ViewGroup) e2;
        this.c = e().getId();
        C1202Sp c1202Sp = (C1202Sp) e().findViewById(cIE.b.aE);
        this.g = c1202Sp;
        C1203Sq c1203Sq = (C1203Sq) e().findViewById(cIE.b.co);
        this.s = c1203Sq;
        this.l = AnimationUtils.loadAnimation(e().getContext(), com.netflix.mediaclient.ui.R.d.j);
        this.f13659o = AnimationUtils.loadAnimation(e().getContext(), com.netflix.mediaclient.ui.R.d.j);
        this.n = AnimationUtils.loadAnimation(e().getContext(), com.netflix.mediaclient.ui.R.d.b);
        this.k = AnimationUtils.loadAnimation(e().getContext(), com.netflix.mediaclient.ui.R.d.b);
        c1203Sq.setOnClickListener(new View.OnClickListener() { // from class: o.cHD
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                cHC.d(cHC.this, view);
            }
        });
        c1202Sp.setOnClickListener(new View.OnClickListener() { // from class: o.cHI
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                cHC.b(cHC.this, view);
            }
        });
    }

    /* loaded from: classes4.dex */
    public static final class e {
        public /* synthetic */ e(C8627dsp c8627dsp) {
            this();
        }

        private e() {
        }

        public final InterfaceC5731cGg a(ViewGroup viewGroup, PostPlayItem postPlayItem, Subject<cBO> subject, boolean z) {
            C8632dsu.c((Object) viewGroup, "");
            C8632dsu.c((Object) postPlayItem, "");
            C8632dsu.c((Object) subject, "");
            if (z) {
                return new cHG(viewGroup, postPlayItem, subject);
            }
            return new cHE(viewGroup, postPlayItem, subject);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(cHC chc, View view) {
        C8632dsu.c((Object) chc, "");
        chc.i.onNext(cBO.y.c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(cHC chc, View view) {
        Long l;
        C8632dsu.c((Object) chc, "");
        if (chc.j.isAutoPlay() && (l = chc.b) != null) {
            Logger.INSTANCE.cancelSession(Long.valueOf(l.longValue()));
            chc.b = null;
        }
        chc.i.onNext(new cBO.T(chc.j));
    }

    @Override // o.InterfaceC5731cGg
    public void d(boolean z, int i) {
        this.m = true;
        this.a = i;
        h();
        j();
        if (z) {
            this.s.setAlpha(0.0f);
        } else {
            this.s.clearAnimation();
            this.s.startAnimation(this.l);
        }
        this.g.clearAnimation();
        this.g.startAnimation(this.f13659o);
        e().setVisibility(0);
        this.s.sendAccessibilityEvent(8);
        if (this.j.isAutoPlay()) {
            this.b = Logger.INSTANCE.startSession(new Countdown(Long.valueOf(i * 1000)));
        }
    }

    @Override // o.AbstractC9944zY, o.InterfaceC9939zT
    public void c() {
        t();
        this.s.clearAnimation();
        this.s.startAnimation(this.n);
        this.g.clearAnimation();
        this.g.startAnimation(this.k);
    }

    /* loaded from: classes4.dex */
    public static final class a extends Abstractanimation.Animation$AnimationListenerC9916yx {
        final /* synthetic */ View a;

        a(View view) {
            this.a = view;
        }

        @Override // o.Abstractanimation.Animation$AnimationListenerC9916yx, android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            this.a.setAlpha(0.0f);
        }
    }

    protected final Animation.AnimationListener a(View view) {
        C8632dsu.c((Object) view, "");
        return new a(view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(long j) {
        if (!C8632dsu.c((Object) this.j.getType(), (Object) "non_sequentialInSameTitle")) {
            this.g.setText(e().getContext().getString(cIE.a.m, Long.valueOf(j)));
            return;
        }
        C7460cwd c7460cwd = this.f;
        if (c7460cwd != null) {
            this.g.setText(e().getContext().getString(com.netflix.mediaclient.ui.R.o.ki, Integer.valueOf(c7460cwd.x()), Integer.valueOf(c7460cwd.aw_()), Long.valueOf(j)));
        }
    }

    public void h() {
        a(this.a);
    }

    /* loaded from: classes4.dex */
    public static final class d extends Abstractanimation.Animation$AnimationListenerC9916yx {
        d() {
        }

        @Override // o.Abstractanimation.Animation$AnimationListenerC9916yx, android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            cHC.this.q();
        }
    }

    public void j() {
        Animation animation = this.f13659o;
        long j = e;
        animation.setStartOffset(j);
        this.f13659o.setAnimationListener(new d());
        Animation animation2 = this.n;
        C1203Sq c1203Sq = this.s;
        C8632dsu.a(c1203Sq, "");
        animation2.setAnimationListener(a(c1203Sq));
        this.k.setStartOffset(j);
        this.k.setAnimationListener(new c());
    }

    /* loaded from: classes4.dex */
    public static final class c extends Abstractanimation.Animation$AnimationListenerC9916yx {
        c() {
        }

        @Override // o.Abstractanimation.Animation$AnimationListenerC9916yx, android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            cHC.this.e().setVisibility(8);
            cHC.this.m().setAlpha(0.0f);
        }
    }

    public void q() {
        t();
        Observable<Long> take = Observable.interval(0L, 1L, TimeUnit.SECONDS, AndroidSchedulers.mainThread()).take(this.a);
        final drM<Long, Long> drm = new drM<Long, Long>() { // from class: com.netflix.mediaclient.ui.player.v2.uiView.PostPlayItemSeamlessUIView$startTimer$1
            {
                super(1);
            }

            @Override // o.drM
            /* renamed from: e */
            public final Long invoke(Long l) {
                C8632dsu.c((Object) l, "");
                return Long.valueOf(cHC.this.f() - l.longValue());
            }
        };
        Observable<R> map = take.map(new Function() { // from class: o.cHA
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                Long a2;
                a2 = cHC.a(drM.this, obj);
                return a2;
            }
        });
        C8632dsu.a(map, "");
        this.q = SubscribersKt.subscribeBy$default(map, (drM) null, new drO<dpR>() { // from class: com.netflix.mediaclient.ui.player.v2.uiView.PostPlayItemSeamlessUIView$startTimer$2
            {
                super(0);
            }

            @Override // o.drO
            public /* synthetic */ dpR invoke() {
                c();
                return dpR.c;
            }

            public final void c() {
                Long k = cHC.this.k();
                if (k != null) {
                    cHC chc = cHC.this;
                    Logger.INSTANCE.endSession(Long.valueOf(k.longValue()));
                    chc.b((Long) null);
                }
                cHC.this.c();
            }
        }, new drM<Long, dpR>() { // from class: com.netflix.mediaclient.ui.player.v2.uiView.PostPlayItemSeamlessUIView$startTimer$3
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(Long l) {
                c(l);
                return dpR.c;
            }

            public final void c(Long l) {
                cHC chc = cHC.this;
                C8632dsu.d(l);
                chc.a(l.longValue());
            }
        }, 1, (Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Long a(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        C8632dsu.c(obj, "");
        return (Long) drm.invoke(obj);
    }

    public void t() {
        Long l = this.b;
        if (l != null) {
            Logger.INSTANCE.cancelSession(Long.valueOf(l.longValue()));
            this.b = null;
        }
        Disposable disposable = this.q;
        if (disposable != null) {
            disposable.dispose();
        }
    }

    @Override // o.InterfaceC5731cGg
    public void g() {
        this.s.setVisibility(8);
    }
}
