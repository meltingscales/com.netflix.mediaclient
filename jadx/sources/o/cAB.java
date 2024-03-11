package o;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import io.reactivex.Observable;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.rxkotlin.DisposableKt;
import io.reactivex.rxkotlin.SubscribersKt;
import io.reactivex.subjects.PublishSubject;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import o.cAA;
import o.cAB;
import o.cHK;
import o.dpR;

/* loaded from: classes4.dex */
public abstract class cAB extends bJU {
    public static final d c = new d(null);
    public C9935zP d;
    private final CompositeDisposable g;
    private final Handler i;
    private final PublishSubject<Set<cAA>> j;

    public cAB() {
        PublishSubject<Set<cAA>> create = PublishSubject.create();
        C8632dsu.a(create, "");
        this.j = create;
        this.g = new CompositeDisposable();
        this.i = new Handler(Looper.getMainLooper());
    }

    public final C9935zP i() {
        C9935zP c9935zP = this.d;
        if (c9935zP != null) {
            return c9935zP;
        }
        C8632dsu.d("");
        return null;
    }

    /* loaded from: classes4.dex */
    public static final class d extends C1045Mp {
        public /* synthetic */ d(C8627dsp c8627dsp) {
            this();
        }

        private d() {
            super("PostPlayPreviewsModelGroup");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final long a() {
            if (C8067ddQ.c()) {
                return C8067ddQ.e();
            }
            return 5L;
        }
    }

    private final Observable<Set<cAA>> m() {
        Observable<Set<cAA>> hide = this.j.hide();
        C8632dsu.a(hide, "");
        return hide;
    }

    @Override // o.bJU, o.C3126at, o.AbstractC3336ax
    /* renamed from: d */
    public void e(final C2077aZ c2077aZ) {
        C8632dsu.c((Object) c2077aZ, "");
        super.e(c2077aZ);
        ViewGroup b2 = c2077aZ.b();
        b2.setOnClickListener(new View.OnClickListener() { // from class: o.cAI
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                cAB.e(C2077aZ.this, this, view);
            }
        });
        b2.setClickable(true);
        CompositeDisposable compositeDisposable = this.g;
        Observable<Set<cAA>> debounce = m().debounce(c.a(), TimeUnit.SECONDS);
        C8632dsu.a(debounce, "");
        DisposableKt.plusAssign(compositeDisposable, SubscribersKt.subscribeBy$default(debounce, (drM) null, (drO) null, new drM<Set<? extends cAA>, dpR>() { // from class: com.netflix.mediaclient.ui.player.postplay.ui.epoxymodels.PostPlayPreviewsModelGroup$bind$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(Set<? extends cAA> set) {
                b(set);
                return dpR.c;
            }

            public final void b(Set<? extends cAA> set) {
                cAB.this.h(c2077aZ);
            }
        }, 3, (Object) null));
        CompositeDisposable compositeDisposable2 = this.g;
        Observable d2 = i().d(cHK.class);
        final drM<cHK, dpR> drm = new drM<cHK, dpR>() { // from class: com.netflix.mediaclient.ui.player.postplay.ui.epoxymodels.PostPlayPreviewsModelGroup$bind$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(cHK chk) {
                c(chk);
                return dpR.c;
            }

            public final void c(cHK chk) {
                PublishSubject publishSubject;
                Set i;
                if (chk instanceof cHK.f) {
                    cAB.this.g(c2077aZ);
                    publishSubject = cAB.this.j;
                    i = cAB.this.i(c2077aZ);
                    publishSubject.onNext(i);
                }
            }
        };
        Disposable subscribe = d2.subscribe(new Consumer() { // from class: o.cAE
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                cAB.a(drM.this, obj);
            }
        });
        C8632dsu.a(subscribe, "");
        DisposableKt.plusAssign(compositeDisposable2, subscribe);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(C2077aZ c2077aZ, cAB cab, View view) {
        C8632dsu.c((Object) c2077aZ, "");
        C8632dsu.c((Object) cab, "");
        for (C1511aE c1511aE : c2077aZ.d()) {
            if (c1511aE.a() instanceof cAA) {
                if (c1511aE.itemView.getAlpha() == 0.0f) {
                    cab.g(c2077aZ);
                } else if (c1511aE.itemView.getAlpha() == 1.0f) {
                    cab.h(c2077aZ);
                }
            }
        }
        cab.j.onNext(cab.i(c2077aZ));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        drm.invoke(obj);
    }

    @Override // o.bJU, o.C3126at, o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: c */
    public void e(C2077aZ c2077aZ) {
        C8632dsu.c((Object) c2077aZ, "");
        super.e(c2077aZ);
        this.g.clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Set<cAA> i(C2077aZ c2077aZ) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator<C1511aE> it = c2077aZ.d().iterator();
        while (it.hasNext()) {
            AbstractC3073as<?> a = it.next().a();
            if (a instanceof cAA) {
                linkedHashSet.add(a);
            }
        }
        return linkedHashSet;
    }

    /* loaded from: classes4.dex */
    public static final class b implements Animator.AnimatorListener {
        final /* synthetic */ cAB b;
        final /* synthetic */ AbstractC3073as d;

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }

        public b(AbstractC3073as abstractC3073as, cAB cab) {
            this.d = abstractC3073as;
            this.b = cab;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.d instanceof cAS) {
                this.b.i().b(cHK.class, cHK.b.d);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void g(final C2077aZ c2077aZ) {
        this.i.post(new Runnable() { // from class: o.cAF
            @Override // java.lang.Runnable
            public final void run() {
                cAB.a(C2077aZ.this, this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C2077aZ c2077aZ, cAB cab) {
        C8632dsu.c((Object) c2077aZ, "");
        C8632dsu.c((Object) cab, "");
        for (C1511aE c1511aE : c2077aZ.d()) {
            AbstractC3073as<?> a = c1511aE.a();
            if (a instanceof cAA) {
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.play(ObjectAnimator.ofFloat(c1511aE.itemView, View.ALPHA, 0.0f, 1.0f)).with(ObjectAnimator.ofFloat(c1511aE.itemView, View.TRANSLATION_X, -c1511aE.itemView.getWidth(), 0.0f));
                animatorSet.addListener(new b(a, cab));
                animatorSet.setDuration(300L);
                animatorSet.start();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void h(final C2077aZ c2077aZ) {
        this.i.post(new Runnable() { // from class: o.cAG
            @Override // java.lang.Runnable
            public final void run() {
                cAB.f(C2077aZ.this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(C2077aZ c2077aZ) {
        C8632dsu.c((Object) c2077aZ, "");
        for (C1511aE c1511aE : c2077aZ.d()) {
            if (c1511aE.itemView.getAlpha() == 1.0f && (c1511aE.a() instanceof cAA)) {
                AnimatorSet animatorSet = new AnimatorSet();
                AnimatorSet.Builder play = animatorSet.play(ObjectAnimator.ofFloat(c1511aE.itemView, View.ALPHA, 1.0f, 0.0f));
                View view = c1511aE.itemView;
                play.with(ObjectAnimator.ofFloat(view, View.TRANSLATION_X, 0.0f, -view.getWidth()));
                animatorSet.setDuration(300L);
                animatorSet.start();
            }
        }
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: b */
    public void c(int i, C2077aZ c2077aZ) {
        C8632dsu.c((Object) c2077aZ, "");
        super.a(i, (int) c2077aZ);
        if (i == 4) {
            this.j.onNext(i(c2077aZ));
        }
    }
}
