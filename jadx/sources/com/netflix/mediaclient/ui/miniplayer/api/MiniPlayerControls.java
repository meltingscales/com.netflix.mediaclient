package com.netflix.mediaclient.ui.miniplayer.api;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.SeekBar;
import android.widget.ToggleButton;
import androidx.core.content.ContextCompat;
import com.netflix.cl.Logger;
import com.netflix.cl.model.event.session.command.MuteCommand;
import com.netflix.cl.model.event.session.command.UnmuteCommand;
import com.netflix.mediaclient.android.widget.PlayLoadingReplayButton;
import com.netflix.mediaclient.android.widget.PlayPauseButton;
import com.netflix.mediaclient.common.ui.LifecycleController;
import com.netflix.mediaclient.ui.miniplayer.api.MiniPlayerControls;
import com.netflix.mediaclient.util.AccessibilityUtils;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Predicate;
import io.reactivex.rxkotlin.DisposableKt;
import io.reactivex.rxkotlin.SubscribersKt;
import io.reactivex.subjects.PublishSubject;
import java.text.SimpleDateFormat;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.LazyThreadSafetyMode;
import o.AbstractC9616tJ;
import o.AbstractC9662ud;
import o.C1045Mp;
import o.C1125Pq;
import o.C1129Pu;
import o.C1193Sg;
import o.C1204Sr;
import o.C1677aKd;
import o.C6691ciA;
import o.C6728cil;
import o.C8153dex;
import o.C8563dqf;
import o.C8627dsp;
import o.C8632dsu;
import o.C9660ub;
import o.C9668uj;
import o.C9669uk;
import o.C9670ul;
import o.C9687vB;
import o.C9834xU;
import o.InterfaceC8554dpx;
import o.SC;
import o.SJ;
import o.dpB;
import o.dpR;
import o.drM;
import o.drO;

/* loaded from: classes4.dex */
public final class MiniPlayerControls extends LifecycleController<C6728cil> {
    private static final int[] a;
    private static final int[] b;
    public static final b e = new b(null);
    private static final long g = TimeUnit.SECONDS.toMillis(10);
    private static final int[] i;
    private final String A;
    private boolean B;
    private final SC C;
    private final View.OnClickListener D;
    private final View E;
    private int F;
    private final PublishSubject<Long> G;
    private final View H;
    private final PublishSubject<Long> I;

    /* renamed from: J */
    private final Map<Integer, View> f13289J;
    private boolean K;
    private final PublishSubject<Long> M;
    private C1204Sr N;
    private final ValueAnimator f;
    private final ToggleButton h;
    private int[] j;
    private int k;
    private final CompositeDisposable l;
    private final PublishSubject<Boolean> m;
    private final View.OnClickListener n;

    /* renamed from: o */
    private boolean f13290o;
    private final PublishSubject<dpR> p;
    private boolean q;
    private final InterfaceC8554dpx<c> r;
    private final PublishSubject<dpR> s;
    private final boolean t;
    private final PlayLoadingReplayButton u;
    private final PublishSubject<dpR> v;
    private final d w;
    private boolean x;
    private final drM<Throwable, dpR> y;
    private final PublishSubject<dpR> z;

    public final boolean d() {
        return this.f13290o;
    }

    public final boolean j() {
        return this.k == 0;
    }

    public /* synthetic */ MiniPlayerControls(View view, String str, boolean z, drM drm, int i2, C8627dsp c8627dsp) {
        this(view, str, (i2 & 4) != 0 ? false : z, drm);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public MiniPlayerControls(View view, String str, boolean z, drM<? super Throwable, dpR> drm) {
        super(view);
        InterfaceC8554dpx<c> b2;
        C8632dsu.c((Object) view, "");
        C8632dsu.c((Object) drm, "");
        this.E = view;
        this.A = str;
        this.t = z;
        this.y = drm;
        PublishSubject<dpR> create = PublishSubject.create();
        C8632dsu.a(create, "");
        this.p = create;
        this.h = (ToggleButton) view.findViewById(C9834xU.g.d);
        View findViewById = view.findViewById(C6691ciA.d.h);
        this.H = findViewById;
        View findViewById2 = view.findViewById(C6691ciA.d.b);
        C8632dsu.d(findViewById2);
        this.u = (PlayLoadingReplayButton) findViewById2;
        SC sc = new SC(ContextCompat.getColor(view.getContext(), C9834xU.c.e), ContextCompat.getColor(view.getContext(), C9834xU.c.D), 0.0f, 4, null);
        this.C = sc;
        this.j = z ? b : i;
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setDuration(view.getResources().getInteger(17694720));
        valueAnimator.setFloatValues(0.0f);
        valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: o.chS
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                MiniPlayerControls.c(MiniPlayerControls.this, valueAnimator2);
            }
        });
        valueAnimator.addListener(new a());
        this.f = valueAnimator;
        PublishSubject<dpR> create2 = PublishSubject.create();
        C8632dsu.a(create2, "");
        this.s = create2;
        PublishSubject<dpR> create3 = PublishSubject.create();
        C8632dsu.a(create3, "");
        this.v = create3;
        PublishSubject<dpR> create4 = PublishSubject.create();
        C8632dsu.a(create4, "");
        this.z = create4;
        PublishSubject<Long> create5 = PublishSubject.create();
        C8632dsu.a(create5, "");
        this.I = create5;
        PublishSubject<Long> create6 = PublishSubject.create();
        C8632dsu.a(create6, "");
        this.G = create6;
        PublishSubject<Long> create7 = PublishSubject.create();
        C8632dsu.a(create7, "");
        this.M = create7;
        PublishSubject<Boolean> create8 = PublishSubject.create();
        C8632dsu.a(create8, "");
        this.m = create8;
        this.f13289J = new LinkedHashMap();
        this.w = new d();
        this.D = new View.OnClickListener() { // from class: o.chT
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                MiniPlayerControls.e(MiniPlayerControls.this, view2);
            }
        };
        this.n = new View.OnClickListener() { // from class: o.chP
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                MiniPlayerControls.d(MiniPlayerControls.this, view2);
            }
        };
        this.k = 8;
        b2 = dpB.b(LazyThreadSafetyMode.e, new drO<c>() { // from class: com.netflix.mediaclient.ui.miniplayer.api.MiniPlayerControls$lazyControlsDelegate$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            @Override // o.drO
            /* renamed from: a */
            public final MiniPlayerControls.c invoke() {
                boolean z2;
                LayoutInflater from = LayoutInflater.from(MiniPlayerControls.this.l().getContext());
                int i2 = C6691ciA.c.d;
                View l = MiniPlayerControls.this.l();
                C8632dsu.d(l);
                from.inflate(i2, (ViewGroup) l);
                MiniPlayerControls.c cVar = new MiniPlayerControls.c();
                z2 = MiniPlayerControls.this.q;
                if (z2) {
                    cVar.c();
                }
                return cVar;
            }
        });
        this.r = b2;
        this.l = new CompositeDisposable();
        u();
        findViewById.setBackground(sc);
    }

    /* loaded from: classes4.dex */
    public static final class b extends C1045Mp {
        public /* synthetic */ b(C8627dsp c8627dsp) {
            this();
        }

        private b() {
            super("PlayerControls");
        }
    }

    static {
        int[] a2;
        int[] a3;
        int[] a4;
        a2 = C8563dqf.a(new Integer[]{Integer.valueOf(C6691ciA.d.e), Integer.valueOf(C6691ciA.d.j), Integer.valueOf(C6691ciA.d.f13730o), Integer.valueOf(C6691ciA.d.c), Integer.valueOf(C6691ciA.d.i)});
        i = a2;
        a3 = C8563dqf.a(new Integer[]{Integer.valueOf(C6691ciA.d.j), Integer.valueOf(C6691ciA.d.f13730o), Integer.valueOf(C6691ciA.d.c), Integer.valueOf(C6691ciA.d.i)});
        b = a3;
        a4 = C8563dqf.a(new Integer[]{Integer.valueOf(C6691ciA.d.e), Integer.valueOf(C6691ciA.d.j), Integer.valueOf(C6691ciA.d.f13730o), Integer.valueOf(C6691ciA.d.c), Integer.valueOf(C6691ciA.d.i), Integer.valueOf(C6691ciA.d.g), Integer.valueOf(C6691ciA.d.f)});
        a = a4;
    }

    /* loaded from: classes4.dex */
    public static final class a implements Animator.AnimatorListener {
        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }

        public a() {
            MiniPlayerControls.this = r1;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            MiniPlayerControls.this.B();
        }
    }

    public static final void c(MiniPlayerControls miniPlayerControls, ValueAnimator valueAnimator) {
        C8632dsu.c((Object) miniPlayerControls, "");
        C8632dsu.c((Object) valueAnimator, "");
        miniPlayerControls.B();
    }

    public final void B() {
        int[] iArr;
        float f;
        int height;
        float f2;
        int height2;
        Object animatedValue = this.f.getAnimatedValue();
        C8632dsu.d(animatedValue);
        float floatValue = ((Float) animatedValue).floatValue();
        for (int i2 : this.j) {
            View b2 = b(i2);
            if (b2 != null) {
                b2.setAlpha(floatValue);
            }
            View b3 = b(i2);
            if (b3 != null) {
                b3.setVisibility(floatValue > 0.0f ? 0 : 8);
            }
        }
        ToggleButton toggleButton = this.h;
        if (!this.t) {
            f = (-1) * floatValue;
            int height3 = x().d().getHeight();
            ViewGroup.LayoutParams layoutParams = this.h.getLayoutParams();
            C8632dsu.a(layoutParams, "");
            height = height3 - C9687vB.d(layoutParams);
        } else {
            f = (-1) * floatValue;
            height = x().j().getHeight();
        }
        toggleButton.setTranslationY(f * height);
        C1204Sr c1204Sr = this.N;
        if (c1204Sr == null || c1204Sr.getVisibility() != 0) {
            return;
        }
        if (!this.t) {
            f2 = (-1) * floatValue;
            int height4 = x().d().getHeight();
            ViewGroup.LayoutParams layoutParams2 = c1204Sr.getLayoutParams();
            C8632dsu.a(layoutParams2, "");
            height2 = height4 - C9687vB.d(layoutParams2);
        } else {
            f2 = (-1) * floatValue;
            height2 = x().j().getHeight();
        }
        c1204Sr.setTranslationY(f2 * height2);
    }

    /* loaded from: classes4.dex */
    public static final class d implements SJ.a {
        d() {
            MiniPlayerControls.this = r1;
        }

        @Override // o.SJ.a
        public void c(SJ sj, int i, int i2) {
            C8632dsu.c((Object) sj, "");
            MiniPlayerControls.this.g();
        }

        @Override // o.SJ.a
        public void e(SJ sj, int i, int i2) {
            C8632dsu.c((Object) sj, "");
            MiniPlayerControls.this.G.onNext(Long.valueOf(MiniPlayerControls.this.x().e().getProgress() + (MiniPlayerControls.g * i * i2)));
        }
    }

    public static final void e(MiniPlayerControls miniPlayerControls, View view) {
        C8632dsu.c((Object) miniPlayerControls, "");
        miniPlayerControls.v.onNext(dpR.c);
    }

    public static final void d(MiniPlayerControls miniPlayerControls, View view) {
        C8632dsu.c((Object) miniPlayerControls, "");
        miniPlayerControls.s.onNext(dpR.c);
    }

    public final c x() {
        return this.r.getValue();
    }

    private final boolean v() {
        return this.r.isInitialized();
    }

    /* loaded from: classes4.dex */
    public final class e extends View.AccessibilityDelegate {
        public e() {
            MiniPlayerControls.this = r1;
        }

        @Override // android.view.View.AccessibilityDelegate
        public boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            C8632dsu.c((Object) viewGroup, "");
            C8632dsu.c((Object) view, "");
            C8632dsu.c((Object) accessibilityEvent, "");
            if (accessibilityEvent.getEventType() == 32768) {
                MiniPlayerControls.this.g();
            }
            return super.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
        }
    }

    /* loaded from: classes4.dex */
    public final class c {
        private final View a;
        private final CompositeDisposable b;
        private final SeekBar c;
        private final C1193Sg e;
        private final SJ g;
        private final C1204Sr h;
        private final SJ i;

        public final View a() {
            return this.a;
        }

        public final C1193Sg d() {
            return this.e;
        }

        public final SeekBar e() {
            return this.c;
        }

        public final C1204Sr j() {
            return this.h;
        }

        public c() {
            MiniPlayerControls.this = r9;
            View findViewById = r9.E.findViewById(C6691ciA.d.i);
            this.a = findViewById;
            C1193Sg c1193Sg = (C1193Sg) r9.E.findViewById(C6691ciA.d.e);
            this.e = c1193Sg;
            SeekBar seekBar = (SeekBar) r9.E.findViewById(C6691ciA.d.j);
            this.c = seekBar;
            this.h = (C1204Sr) r9.E.findViewById(C6691ciA.d.f13730o);
            SJ sj = (SJ) r9.E.findViewById(C6691ciA.d.f);
            this.g = sj;
            SJ sj2 = (SJ) r9.E.findViewById(C6691ciA.d.g);
            this.i = sj2;
            this.b = new CompositeDisposable();
            C8632dsu.d(findViewById);
            View.OnClickListener onClickListener = r9.D;
            findViewById.setOnClickListener(onClickListener);
            findViewById.setClickable(onClickListener != null);
            C8632dsu.d(c1193Sg);
            View.OnClickListener onClickListener2 = r9.n;
            c1193Sg.setOnClickListener(onClickListener2);
            c1193Sg.setClickable(onClickListener2 != null);
            sj.setOnSeekButtonListener(r9.w);
            sj2.setOnSeekButtonListener(r9.w);
            if (r9.t) {
                C8632dsu.d(c1193Sg);
                c1193Sg.setVisibility(8);
            } else {
                e(false);
            }
            int dimensionPixelSize = findViewById.getResources().getDimensionPixelSize(C6691ciA.b.d);
            findViewById.setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
            C8632dsu.d(findViewById);
            ((PlayPauseButton) findViewById).setState(!r9.B ? PlayPauseButton.ButtonState.e : PlayPauseButton.ButtonState.b);
            r9.u.setPlayButtonIdleContentDescription(r9.A);
            PlayLoadingReplayButton playLoadingReplayButton = r9.u;
            playLoadingReplayButton.setOnClickListener(new View.OnClickListener() { // from class: o.chW
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    MiniPlayerControls.c.e(MiniPlayerControls.this, view);
                }
            });
            playLoadingReplayButton.setClickable(true);
            ToggleButton toggleButton = r9.h;
            C8632dsu.a(toggleButton, "");
            toggleButton.setOnClickListener(new View.OnClickListener() { // from class: o.chY
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    MiniPlayerControls.c.a(view);
                }
            });
            toggleButton.setClickable(true);
            seekBar.setThumb(seekBar.getThumb().mutate());
            seekBar.setProgressDrawable(seekBar.getProgressDrawable().mutate());
            if (C8153dex.L()) {
                r9.N = (C1204Sr) r9.E.findViewById(C6691ciA.d.m);
            }
            r9.E.setAccessibilityDelegate(new e());
        }

        public static final void e(MiniPlayerControls miniPlayerControls, View view) {
            C8632dsu.c((Object) miniPlayerControls, "");
            miniPlayerControls.z.onNext(dpR.c);
        }

        public static final void a(View view) {
            C1129Pu c1129Pu = C1129Pu.e;
            C1125Pq c1125Pq = (C1125Pq) C1129Pu.b(C1125Pq.class);
            boolean z = !c1125Pq.a().booleanValue();
            c1125Pq.a(z, true);
            if (z) {
                Logger logger = Logger.INSTANCE;
                logger.endSession(logger.startSession(new MuteCommand()));
                return;
            }
            Logger logger2 = Logger.INSTANCE;
            logger2.endSession(logger2.startSession(new UnmuteCommand()));
        }

        public final void c() {
            final SimpleDateFormat simpleDateFormat = new SimpleDateFormat("mm:ss", Locale.getDefault());
            CompositeDisposable compositeDisposable = this.b;
            SeekBar seekBar = this.c;
            C8632dsu.d(seekBar);
            AbstractC9616tJ<AbstractC9662ud> d = C9660ub.d(seekBar);
            final MiniPlayerControls miniPlayerControls = MiniPlayerControls.this;
            final drM<AbstractC9662ud, dpR> drm = new drM<AbstractC9662ud, dpR>() { // from class: com.netflix.mediaclient.ui.miniplayer.api.MiniPlayerControls$LazyControls$attach$1
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // o.drM
                public /* synthetic */ dpR invoke(AbstractC9662ud abstractC9662ud) {
                    b(abstractC9662ud);
                    return dpR.c;
                }

                public final void b(AbstractC9662ud abstractC9662ud) {
                    PublishSubject publishSubject;
                    PublishSubject publishSubject2;
                    PublishSubject publishSubject3;
                    if (abstractC9662ud instanceof C9670ul) {
                        publishSubject3 = MiniPlayerControls.this.I;
                        publishSubject3.onNext(Long.valueOf(this.e().getProgress()));
                    } else if (abstractC9662ud instanceof C9669uk) {
                        if (((C9669uk) abstractC9662ud).c()) {
                            publishSubject = MiniPlayerControls.this.M;
                            publishSubject.onNext(Long.valueOf(this.e().getProgress()));
                            publishSubject2 = MiniPlayerControls.this.p;
                            publishSubject2.onNext(dpR.c);
                        }
                    } else if (abstractC9662ud instanceof C9668uj) {
                        MiniPlayerControls.this.G.onNext(Long.valueOf(this.e().getProgress()));
                    }
                    this.j().setText(simpleDateFormat.format(Integer.valueOf(this.e().getProgress())));
                }
            };
            Observable<AbstractC9662ud> doOnNext = d.doOnNext(new Consumer() { // from class: o.chU
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    MiniPlayerControls.c.a(drM.this, obj);
                }
            });
            final drM drm2 = MiniPlayerControls.this.y;
            Disposable subscribe = doOnNext.doOnError(new Consumer() { // from class: o.chZ
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    MiniPlayerControls.c.c(drM.this, obj);
                }
            }).subscribe();
            C8632dsu.a(subscribe, "");
            DisposableKt.plusAssign(compositeDisposable, subscribe);
        }

        public static final void a(drM drm, Object obj) {
            C8632dsu.c((Object) drm, "");
            drm.invoke(obj);
        }

        public static final void c(drM drm, Object obj) {
            C8632dsu.c((Object) drm, "");
            drm.invoke(obj);
        }

        public final void b() {
            this.b.clear();
        }

        public final void e(boolean z) {
            if (z) {
                this.e.setImageResource(C6691ciA.e.e);
                this.e.setContentDescription(MiniPlayerControls.this.E.getContext().getString(C6691ciA.a.b));
                return;
            }
            this.e.setImageResource(C6691ciA.e.c);
            this.e.setContentDescription(MiniPlayerControls.this.E.getContext().getString(C6691ciA.a.e));
        }
    }

    public final Observable<Boolean> h() {
        Observable<Boolean> hide = this.m.hide();
        C8632dsu.a(hide, "");
        return hide;
    }

    public final void c(boolean z) {
        this.h.setChecked(!z);
    }

    public final void f() {
        ToggleButton toggleButton = this.h;
        C8632dsu.a(toggleButton, "");
        toggleButton.setVisibility(8);
        C1193Sg d2 = x().d();
        C8632dsu.a(d2, "");
        d2.setVisibility(8);
    }

    public final int a(C1677aKd c1677aKd) {
        C8632dsu.c((Object) c1677aKd, "");
        if (this.k == 0) {
            return c1677aKd.getBottom() - x().e().getTop();
        }
        return 0;
    }

    @SuppressLint({"CheckResult"})
    private final void u() {
        SubscribersKt.subscribeBy$default(i(), this.y, (drO) null, new drM<C6728cil, dpR>() { // from class: com.netflix.mediaclient.ui.miniplayer.api.MiniPlayerControls$subscribeEvents$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(C6728cil c6728cil) {
                a(c6728cil);
                return dpR.c;
            }

            public final void a(C6728cil c6728cil) {
                C8632dsu.c((Object) c6728cil, "");
                MiniPlayerControls.e.getLogTag();
                MiniPlayerControls.this.b(c6728cil);
            }
        }, 2, (Object) null);
        SubscribersKt.subscribeBy$default(m(), this.y, (drO) null, new drM<C6728cil, dpR>() { // from class: com.netflix.mediaclient.ui.miniplayer.api.MiniPlayerControls$subscribeEvents$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(C6728cil c6728cil) {
                d(c6728cil);
                return dpR.c;
            }

            public final void d(C6728cil c6728cil) {
                C8632dsu.c((Object) c6728cil, "");
                MiniPlayerControls.this.d(c6728cil);
            }
        }, 2, (Object) null);
    }

    @SuppressLint({"CheckResult"})
    public final void b(final C6728cil c6728cil) {
        C8632dsu.c((Object) c6728cil, "");
        Observable<Integer> takeUntil = c6728cil.l().takeUntil(m());
        final MiniPlayerControls$onActivatesReceived$1 miniPlayerControls$onActivatesReceived$1 = new drM<Integer, Boolean>() { // from class: com.netflix.mediaclient.ui.miniplayer.api.MiniPlayerControls$onActivatesReceived$1
            @Override // o.drM
            /* renamed from: b */
            public final Boolean invoke(Integer num) {
                C8632dsu.c((Object) num, "");
                return Boolean.valueOf(num.intValue() >= 0);
            }
        };
        Observable<Integer> observeOn = takeUntil.filter(new Predicate() { // from class: o.chV
            @Override // io.reactivex.functions.Predicate
            public final boolean test(Object obj) {
                boolean j;
                j = MiniPlayerControls.j(drM.this, obj);
                return j;
            }
        }).observeOn(AndroidSchedulers.mainThread());
        drM<Throwable, dpR> drm = this.y;
        C8632dsu.d(observeOn);
        SubscribersKt.subscribeBy$default(observeOn, drm, (drO) null, new drM<Integer, dpR>() { // from class: com.netflix.mediaclient.ui.miniplayer.api.MiniPlayerControls$onActivatesReceived$2
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(Integer num) {
                d(num);
                return dpR.c;
            }

            public final void d(Integer num) {
                MiniPlayerControls miniPlayerControls = MiniPlayerControls.this;
                C8632dsu.d(num);
                miniPlayerControls.b(num.intValue(), c6728cil.q() * 1000);
            }
        }, 2, (Object) null);
        this.x = c6728cil.u();
        this.K = c6728cil.D();
        ToggleButton toggleButton = this.h;
        C8632dsu.a(toggleButton, "");
        toggleButton.setVisibility(4);
    }

    public static final boolean j(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        C8632dsu.c(obj, "");
        return ((Boolean) drm.invoke(obj)).booleanValue();
    }

    public final void c() {
        this.q = true;
        if (v()) {
            x().c();
        }
        CompositeDisposable compositeDisposable = this.l;
        Observable<dpR> observeOn = this.p.debounce(AccessibilityUtils.e(this.E.getContext(), 3000, true), TimeUnit.MILLISECONDS).observeOn(AndroidSchedulers.mainThread());
        final drM<dpR, dpR> drm = new drM<dpR, dpR>() { // from class: com.netflix.mediaclient.ui.miniplayer.api.MiniPlayerControls$attach$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            public final void c(dpR dpr) {
                MiniPlayerControls.this.c(false, true, true);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(dpR dpr) {
                c(dpr);
                return dpR.c;
            }
        };
        Observable<dpR> doOnNext = observeOn.doOnNext(new Consumer() { // from class: o.chQ
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                MiniPlayerControls.a(drM.this, obj);
            }
        });
        final drM<Throwable, dpR> drm2 = this.y;
        Disposable subscribe = doOnNext.doOnError(new Consumer() { // from class: o.chR
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                MiniPlayerControls.h(drM.this, obj);
            }
        }).subscribe();
        C8632dsu.a(subscribe, "");
        DisposableKt.plusAssign(compositeDisposable, subscribe);
    }

    public static final void a(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        drm.invoke(obj);
    }

    public static final void h(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        drm.invoke(obj);
    }

    public final void b() {
        this.q = false;
        if (v()) {
            x().b();
        }
        this.l.clear();
    }

    public final Observable<dpR> e() {
        Observable<dpR> hide = this.s.hide();
        C8632dsu.a(hide, "");
        return hide;
    }

    public final Observable<dpR> n() {
        Observable<dpR> hide = this.v.hide();
        final drM<dpR, dpR> drm = new drM<dpR, dpR>() { // from class: com.netflix.mediaclient.ui.miniplayer.api.MiniPlayerControls$playPauseClicks$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            public final void b(dpR dpr) {
                MiniPlayerControls.this.g();
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(dpR dpr) {
                b(dpr);
                return dpR.c;
            }
        };
        Observable<dpR> doOnNext = hide.doOnNext(new Consumer() { // from class: o.chX
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                MiniPlayerControls.f(drM.this, obj);
            }
        });
        C8632dsu.a(doOnNext, "");
        return doOnNext;
    }

    public static final void f(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        drm.invoke(obj);
    }

    public final Observable<dpR> t() {
        Observable<dpR> hide = this.z.hide();
        C8632dsu.a(hide, "");
        return hide;
    }

    public static /* synthetic */ void c(MiniPlayerControls miniPlayerControls, boolean z, boolean z2, boolean z3, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            z3 = false;
        }
        miniPlayerControls.a(z, z2, z3);
    }

    public final void a(boolean z, boolean z2, boolean z3) {
        this.f13290o = z;
        boolean z4 = this.k == 0;
        e(this, false, true, false, 4, null);
        if (z) {
            this.j = a;
            if (!z3) {
                x().e(true);
                int dimensionPixelSize = x().a().getResources().getDimensionPixelSize(C6691ciA.b.c);
                x().a().setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
            }
        } else {
            this.j = this.t ? b : i;
            if (!z3) {
                x().e(false);
                int dimensionPixelSize2 = x().a().getResources().getDimensionPixelSize(C6691ciA.b.d);
                x().a().setPadding(dimensionPixelSize2, dimensionPixelSize2, dimensionPixelSize2, dimensionPixelSize2);
            }
        }
        e(this, z4, true, false, 4, null);
        if (this.k == 0) {
            g();
        }
        if (z2) {
            a(PlayLoadingReplayButton.ButtonState.a);
        }
    }

    public final void b(int i2, int i3) {
        if (i3 != this.F) {
            this.F = i3;
        }
        SC sc = this.C;
        int i4 = this.F;
        sc.e(i4 > 0 ? (100.0f / i4) * i2 : 0.0f);
        if (v()) {
            if (x().j().getText() == null || x().e().getProgress() != i2) {
                x().e().setProgress(i2);
            }
            if (x().e().getMax() != this.F) {
                x().e().setMax(this.F);
            }
        }
    }

    public static /* synthetic */ void e(MiniPlayerControls miniPlayerControls, boolean z, boolean z2, boolean z3, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            z3 = false;
        }
        miniPlayerControls.c(z, z2, z3);
    }

    public final void c(boolean z, boolean z2, boolean z3) {
        int i2 = 0;
        this.k = z ? 0 : z2 ? 4 : 8;
        this.f.cancel();
        float f = this.k == 0 ? 1.0f : 0.0f;
        if (z3) {
            ValueAnimator valueAnimator = this.f;
            Object animatedValue = valueAnimator.getAnimatedValue();
            C8632dsu.d(animatedValue);
            valueAnimator.setFloatValues(((Float) animatedValue).floatValue(), f);
            this.f.start();
        } else {
            this.f.setFloatValues(f, f);
            this.f.start();
        }
        this.m.onNext(Boolean.valueOf(this.k == 0));
        View view = this.H;
        C8632dsu.a(view, "");
        if (!z2 || z || this.f13290o || this.x) {
            i2 = 8;
        }
        view.setVisibility(i2);
    }

    public final void y() {
        if (this.k != 0) {
            if (!v()) {
                this.r.getValue();
            }
            c(true, true, true);
            return;
        }
        c(false, true, true);
    }

    public final void g() {
        this.p.onNext(dpR.c);
    }

    public final Observable<Long> p() {
        Observable<Long> hide = this.I.hide();
        C8632dsu.a(hide, "");
        return hide;
    }

    public final Observable<Long> r() {
        Observable<Long> hide = this.G.hide();
        C8632dsu.a(hide, "");
        return hide;
    }

    public final Observable<Long> q() {
        Observable<Long> hide = this.M.hide();
        C8632dsu.a(hide, "");
        return hide;
    }

    private final View b(int i2) {
        View view = this.f13289J.get(Integer.valueOf(i2));
        if (view == null && (view = this.E.findViewById(i2)) != null) {
            this.f13289J.put(Integer.valueOf(i2), view);
        }
        return view;
    }

    public final void c(Integer num) {
        int intValue = num != null ? num.intValue() : ContextCompat.getColor(this.E.getContext(), C9834xU.c.e);
        this.C.c(intValue);
        this.C.b(Color.argb(69, Color.red(intValue), Color.green(intValue), Color.blue(intValue)));
        x().e().getThumb().setTint(intValue);
        x().e().getProgressDrawable().setTint(intValue);
    }

    private final void a(PlayLoadingReplayButton.ButtonState buttonState) {
        this.u.setState(buttonState);
    }

    public final void d(C6728cil c6728cil) {
        e.getLogTag();
    }

    public final void b(boolean z) {
        e.getLogTag();
        if (z) {
            a(PlayLoadingReplayButton.ButtonState.c);
        } else {
            a(PlayLoadingReplayButton.ButtonState.b);
        }
        c(false, false, true);
    }

    public final void w() {
        e.getLogTag();
        a(PlayLoadingReplayButton.ButtonState.d);
    }

    public final void s() {
        e.getLogTag();
        a(PlayLoadingReplayButton.ButtonState.c);
    }

    public final void d(boolean z) {
        PlayPauseButton.ButtonState buttonState;
        PlayPauseButton.ButtonState buttonState2;
        e.getLogTag();
        this.B = z;
        if (z) {
            a(PlayLoadingReplayButton.ButtonState.a);
            e(this, this.k == 0, true, false, 4, null);
            ToggleButton toggleButton = this.h;
            C8632dsu.a(toggleButton, "");
            toggleButton.setVisibility(this.K ? 4 : 0);
        } else {
            ToggleButton toggleButton2 = this.h;
            C8632dsu.a(toggleButton2, "");
            toggleButton2.setVisibility(4);
        }
        if (v()) {
            View a2 = x().a();
            C8632dsu.d(a2);
            PlayPauseButton playPauseButton = (PlayPauseButton) a2;
            PlayPauseButton.ButtonState a3 = playPauseButton.a();
            if (z && a3 != (buttonState2 = PlayPauseButton.ButtonState.e)) {
                playPauseButton.setState(buttonState2);
            } else if (z || a3 == (buttonState = PlayPauseButton.ButtonState.b)) {
            } else {
                playPauseButton.setState(buttonState);
            }
        }
    }
}
