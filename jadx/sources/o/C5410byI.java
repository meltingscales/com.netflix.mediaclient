package o;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Outline;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.ImageView;
import android.widget.ProgressBar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import androidx.core.view.OneShotPreDrawListener;
import androidx.transition.AutoTransition;
import androidx.transition.TransitionManager;
import androidx.viewpager2.widget.ViewPager2;
import com.netflix.mediaclient.android.widget.NetflixImageView;
import com.netflix.mediaclient.ui.bulkrater.impl.lottie.RaterThumbsLottieDrawable;
import com.netflix.mediaclient.ui.bulkrater.impl.view.RaterView$setupThumbEnterAnimationIfReady$1;
import com.netflix.model.leafs.originals.interactive.animations.InteractiveAnimation;
import io.reactivex.functions.Consumer;
import io.reactivex.rxkotlin.SubscribersKt;
import io.reactivex.subjects.BehaviorSubject;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import o.C5410byI;
import o.C5437byj;
import o.C8632dsu;
import o.InterfaceC5405byD;
import o.dpR;

@SuppressLint({"CheckResult"})
/* renamed from: o.byI  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5410byI extends ConstraintLayout {
    public static final a a = new a(null);
    private final BehaviorSubject<dpR> b;
    private boolean c;
    private boolean d;
    private final C5447byt e;
    private final boolean f;
    private final InterfaceC5436byi g;
    private d h;
    private Integer i;
    private int j;
    private boolean k;
    private final RaterThumbsLottieDrawable l;
    private final C5418byQ m;
    private Map<Integer, Integer> n;

    /* renamed from: o  reason: collision with root package name */
    private InterfaceC5405byD f13640o;
    private final RaterThumbsLottieDrawable q;
    private boolean r;

    /* renamed from: o.byI$d */
    /* loaded from: classes4.dex */
    public interface d {
        void b(long j, Map<Integer, Integer> map);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C5410byI(Context context) {
        this(context, null, 0, 6, null);
        C8632dsu.c((Object) context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C5410byI(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        C8632dsu.c((Object) context, "");
    }

    public final InterfaceC5405byD d() {
        return this.f13640o;
    }

    public final void setPayoffListener(d dVar) {
        this.h = dVar;
    }

    public final void setRatingListener(InterfaceC5405byD interfaceC5405byD) {
        this.f13640o = interfaceC5405byD;
    }

    public /* synthetic */ C5410byI(Context context, AttributeSet attributeSet, int i2, int i3, C8627dsp c8627dsp) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5410byI(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        InterfaceC5436byi c5428bya;
        C8632dsu.c((Object) context, "");
        boolean z = !C8120deQ.a();
        this.f = z;
        BehaviorSubject<dpR> create = z ? BehaviorSubject.create() : null;
        this.b = create;
        C5418byQ c5418byQ = new C5418byQ(create);
        this.m = c5418byQ;
        RaterThumbsLottieDrawable raterThumbsLottieDrawable = new RaterThumbsLottieDrawable();
        this.q = raterThumbsLottieDrawable;
        RaterThumbsLottieDrawable raterThumbsLottieDrawable2 = new RaterThumbsLottieDrawable();
        this.l = raterThumbsLottieDrawable2;
        this.n = new LinkedHashMap();
        View.inflate(context, C5437byj.b.e, this);
        C5447byt e2 = C5447byt.e(this);
        C8632dsu.a(e2, "");
        this.e = e2;
        if (z) {
            ViewPager2 viewPager2 = e2.n;
            C8632dsu.a(viewPager2, "");
            ProgressBar progressBar = e2.h;
            C8632dsu.a(progressBar, "");
            c5428bya = new C5369bxU(viewPager2, progressBar);
        } else {
            ViewPager2 viewPager22 = e2.n;
            C8632dsu.a(viewPager22, "");
            ProgressBar progressBar2 = e2.h;
            C8632dsu.a(progressBar2, "");
            c5428bya = new C5428bya(viewPager22, progressBar2);
        }
        this.g = c5428bya;
        ViewPager2 viewPager23 = e2.n;
        viewPager23.setUserInputEnabled(false);
        viewPager23.setClipToPadding(false);
        viewPager23.setClipChildren(false);
        viewPager23.setOffscreenPageLimit(1);
        viewPager23.setAdapter(c5418byQ);
        viewPager23.setClipToOutline(true);
        viewPager23.setOutlineProvider(new b(viewPager23));
        e2.n.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() { // from class: o.byI.1
            @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
            public void onPageScrolled(int i3, float f2, int i4) {
                int b2;
                b2 = dsT.b(i3 + f2 + 0.2d);
                boolean z2 = b2 == 0;
                C1204Sr c1204Sr = C5410byI.this.e.l;
                C8632dsu.a(c1204Sr, "");
                if ((c1204Sr.getVisibility() == 0) == z2) {
                    if (C5410byI.this.f) {
                        TransitionManager.beginDelayedTransition(C5410byI.this.e.a, new AutoTransition().setDuration(200L));
                    }
                    C1204Sr c1204Sr2 = C5410byI.this.e.l;
                    C8632dsu.a(c1204Sr2, "");
                    c1204Sr2.setVisibility(z2 ^ true ? 0 : 8);
                    C1204Sr c1204Sr3 = C5410byI.this.e.f13642o;
                    C8632dsu.a(c1204Sr3, "");
                    c1204Sr3.setVisibility(z2 ? 0 : 8);
                }
            }

            @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
            public void onPageSelected(final int i3) {
                C5410byI.this.j = i3;
                if (C5410byI.this.r) {
                    Integer valueOf = i3 < C5410byI.this.m.e().size() ? Integer.valueOf(C5410byI.this.m.e().get(i3).d()) : null;
                    InterfaceC5405byD d2 = C5410byI.this.d();
                    final C5410byI c5410byI = C5410byI.this;
                    C9726vo.d(d2, valueOf, new drX<InterfaceC5405byD, Integer, dpR>() { // from class: com.netflix.mediaclient.ui.bulkrater.impl.view.RaterView$2$onPageSelected$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // o.drX
                        public /* synthetic */ dpR invoke(InterfaceC5405byD interfaceC5405byD, Integer num) {
                            a(interfaceC5405byD, num.intValue());
                            return dpR.c;
                        }

                        public final void a(InterfaceC5405byD interfaceC5405byD, int i4) {
                            Integer num;
                            C8632dsu.c((Object) interfaceC5405byD, "");
                            num = C5410byI.this.i;
                            int i5 = i3;
                            if (num != null && num.intValue() == i5) {
                                return;
                            }
                            C5410byI.this.i = Integer.valueOf(i3);
                            interfaceC5405byD.a(i3, i4);
                        }
                    });
                }
            }
        });
        ViewPager2 viewPager24 = e2.n;
        C8632dsu.a(viewPager24, "");
        OneShotPreDrawListener.add(viewPager24, new h(viewPager24, this));
        if (z) {
            RaterThumbsLottieDrawable.State state = RaterThumbsLottieDrawable.State.c;
            raterThumbsLottieDrawable.setState((RaterThumbsLottieDrawable) state);
            SubscribersKt.subscribeBy$default(raterThumbsLottieDrawable.getLoadSubject(), new drM<Throwable, dpR>() { // from class: com.netflix.mediaclient.ui.bulkrater.impl.view.RaterView$4
                {
                    super(1);
                }

                @Override // o.drM
                public /* synthetic */ dpR invoke(Throwable th) {
                    c(th);
                    return dpR.c;
                }

                public final void c(Throwable th) {
                    C8632dsu.c((Object) th, "");
                    C5410byI c5410byI = C5410byI.this;
                    NetflixImageView netflixImageView = c5410byI.e.k;
                    C8632dsu.a(netflixImageView, "");
                    c5410byI.d(netflixImageView, (RaterThumbsLottieDrawable) null);
                }
            }, (drO) null, new drM<Boolean, dpR>() { // from class: com.netflix.mediaclient.ui.bulkrater.impl.view.RaterView$5
                {
                    super(1);
                }

                @Override // o.drM
                public /* synthetic */ dpR invoke(Boolean bool) {
                    c(bool);
                    return dpR.c;
                }

                public final void c(Boolean bool) {
                    C5410byI.this.c = true;
                    C5410byI c5410byI = C5410byI.this;
                    NetflixImageView netflixImageView = c5410byI.e.k;
                    C8632dsu.a(netflixImageView, "");
                    C8632dsu.d(bool);
                    c5410byI.d(netflixImageView, bool.booleanValue() ? C5410byI.this.q : null);
                    C5410byI.this.j();
                }
            }, 2, (Object) null);
            raterThumbsLottieDrawable2.setState((RaterThumbsLottieDrawable) state);
            SubscribersKt.subscribeBy$default(raterThumbsLottieDrawable2.getLoadSubject(), new drM<Throwable, dpR>() { // from class: com.netflix.mediaclient.ui.bulkrater.impl.view.RaterView$6
                {
                    super(1);
                }

                @Override // o.drM
                public /* synthetic */ dpR invoke(Throwable th) {
                    e(th);
                    return dpR.c;
                }

                public final void e(Throwable th) {
                    C8632dsu.c((Object) th, "");
                    C5410byI c5410byI = C5410byI.this;
                    NetflixImageView netflixImageView = c5410byI.e.j;
                    C8632dsu.a(netflixImageView, "");
                    c5410byI.d(netflixImageView, (RaterThumbsLottieDrawable) null);
                }
            }, (drO) null, new drM<Boolean, dpR>() { // from class: com.netflix.mediaclient.ui.bulkrater.impl.view.RaterView$7
                {
                    super(1);
                }

                @Override // o.drM
                public /* synthetic */ dpR invoke(Boolean bool) {
                    d(bool);
                    return dpR.c;
                }

                public final void d(Boolean bool) {
                    C5410byI.this.d = true;
                    C5410byI c5410byI = C5410byI.this;
                    NetflixImageView netflixImageView = c5410byI.e.j;
                    C8632dsu.a(netflixImageView, "");
                    C8632dsu.d(bool);
                    c5410byI.d(netflixImageView, bool.booleanValue() ? C5410byI.this.l : null);
                    C5410byI.this.j();
                }
            }, 2, (Object) null);
        } else {
            NetflixImageView netflixImageView = e2.k;
            C8632dsu.a(netflixImageView, "");
            d(netflixImageView, (RaterThumbsLottieDrawable) null);
            NetflixImageView netflixImageView2 = e2.j;
            C8632dsu.a(netflixImageView2, "");
            d(netflixImageView2, (RaterThumbsLottieDrawable) null);
        }
        ConstraintLayout constraintLayout = e2.a;
        constraintLayout.setClipToOutline(true);
        constraintLayout.setOutlineProvider(new c(constraintLayout));
        e2.l.setOnClickListener(new View.OnClickListener() { // from class: o.byN
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C5410byI.c(C5410byI.this, view);
            }
        });
        e2.i.setOnClickListener(new View.OnClickListener() { // from class: o.byK
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C5410byI.d(C5410byI.this, view);
            }
        });
    }

    /* renamed from: o.byI$a */
    /* loaded from: classes4.dex */
    public static final class a extends C1045Mp {
        public /* synthetic */ a(C8627dsp c8627dsp) {
            this();
        }

        private a() {
            super("RaterView");
        }
    }

    /* renamed from: o.byI$f */
    /* loaded from: classes4.dex */
    public static final class f implements Animator.AnimatorListener {
        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }

        public f() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            ConstraintLayout constraintLayout = C5410byI.this.e.a;
            C8632dsu.a(constraintLayout, "");
            constraintLayout.setVisibility(8);
        }
    }

    /* renamed from: o.byI$g */
    /* loaded from: classes4.dex */
    public static final class g implements Animator.AnimatorListener {
        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }

        public g() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            NetflixImageView netflixImageView = C5410byI.this.e.k;
            C8632dsu.a(netflixImageView, "");
            netflixImageView.setVisibility(8);
        }
    }

    /* renamed from: o.byI$i */
    /* loaded from: classes4.dex */
    public static final class i implements Animator.AnimatorListener {
        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }

        public i() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            ProgressBar progressBar = C5410byI.this.e.h;
            C8632dsu.a(progressBar, "");
            progressBar.setVisibility(8);
        }
    }

    /* renamed from: o.byI$j */
    /* loaded from: classes4.dex */
    public static final class j implements Animator.AnimatorListener {
        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }

        public j() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            NetflixImageView netflixImageView = C5410byI.this.e.j;
            C8632dsu.a(netflixImageView, "");
            netflixImageView.setVisibility(8);
        }
    }

    /* renamed from: o.byI$k */
    /* loaded from: classes4.dex */
    public static final class k implements Animator.AnimatorListener {
        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }

        public k() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            ViewPager2 viewPager2 = C5410byI.this.e.n;
            C8632dsu.a(viewPager2, "");
            viewPager2.setVisibility(8);
        }
    }

    /* renamed from: o.byI$b */
    /* loaded from: classes4.dex */
    public static final class b extends ViewOutlineProvider {
        final /* synthetic */ ViewPager2 b;

        b(ViewPager2 viewPager2) {
            this.b = viewPager2;
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            C8632dsu.c((Object) view, "");
            C8632dsu.c((Object) outline, "");
            float dimension = this.b.getResources().getDimension(C5437byj.a.e);
            outline.setRoundRect(this.b.getPaddingLeft(), 0, view.getWidth() + this.b.getPaddingLeft(), view.getHeight() + this.b.getPaddingTop() + this.b.getPaddingBottom() + ((int) dimension), dimension);
        }
    }

    /* renamed from: o.byI$c */
    /* loaded from: classes4.dex */
    public static final class c extends ViewOutlineProvider {
        private final float a;

        c(ConstraintLayout constraintLayout) {
            this.a = constraintLayout.getResources().getDimension(C5437byj.a.e);
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            C8632dsu.c((Object) view, "");
            C8632dsu.c((Object) outline, "");
            outline.setRoundRect(0, -((int) this.a), view.getWidth(), view.getHeight(), this.a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(C5410byI c5410byI, View view) {
        C8632dsu.c((Object) c5410byI, "");
        c5410byI.e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(C5410byI c5410byI, View view) {
        C8632dsu.c((Object) c5410byI, "");
        c5410byI.d((Integer) null);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(boolean r3) {
        /*
            r2 = this;
            r2.r = r3
            r0 = 0
            if (r3 == 0) goto L6e
            boolean r1 = r2.f
            if (r1 == 0) goto L2b
            if (r3 == 0) goto L2b
            io.reactivex.subjects.BehaviorSubject<o.dpR> r3 = r2.b
            if (r3 == 0) goto L16
            java.lang.Object r3 = r3.getValue()
            o.dpR r3 = (o.dpR) r3
            goto L17
        L16:
            r3 = r0
        L17:
            if (r3 != 0) goto L2b
            o.byt r3 = r2.e
            androidx.viewpager2.widget.ViewPager2 r3 = r3.n
            java.lang.String r1 = ""
            o.C8632dsu.a(r3, r1)
            o.byI$e r1 = new o.byI$e
            r1.<init>(r3, r2)
            androidx.core.view.OneShotPreDrawListener.add(r3, r1)
            goto L3b
        L2b:
            boolean r3 = r2.f
            if (r3 == 0) goto L3b
            com.netflix.mediaclient.ui.bulkrater.impl.lottie.RaterThumbsLottieDrawable r3 = r2.q
            com.netflix.mediaclient.ui.bulkrater.impl.lottie.RaterThumbsLottieDrawable$State r1 = com.netflix.mediaclient.ui.bulkrater.impl.lottie.RaterThumbsLottieDrawable.State.c
            r3.setState(r1)
            com.netflix.mediaclient.ui.bulkrater.impl.lottie.RaterThumbsLottieDrawable r3 = r2.l
            r3.setState(r1)
        L3b:
            java.lang.Integer r3 = r2.i
            if (r3 != 0) goto L70
            int r3 = r2.j
            o.byQ r1 = r2.m
            java.util.List r1 = r1.e()
            int r1 = r1.size()
            if (r3 >= r1) goto L63
            o.byQ r3 = r2.m
            java.util.List r3 = r3.e()
            int r0 = r2.j
            java.lang.Object r3 = r3.get(r0)
            o.bxS r3 = (o.InterfaceC5367bxS) r3
            int r3 = r3.d()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
        L63:
            o.byD r3 = r2.f13640o
            com.netflix.mediaclient.ui.bulkrater.impl.view.RaterView$onScreenVisibilityChanged$2 r1 = new com.netflix.mediaclient.ui.bulkrater.impl.view.RaterView$onScreenVisibilityChanged$2
            r1.<init>()
            o.C9726vo.d(r3, r0, r1)
            goto L70
        L6e:
            r2.i = r0
        L70:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C5410byI.c(boolean):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void d(final ImageView imageView, final RaterThumbsLottieDrawable raterThumbsLottieDrawable) {
        if (raterThumbsLottieDrawable != null) {
            imageView.setAlpha(0.0f);
            imageView.setImageDrawable(raterThumbsLottieDrawable);
            imageView.setOnClickListener(new View.OnClickListener() { // from class: o.byM
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C5410byI.c(RaterThumbsLottieDrawable.this, this, imageView, view);
                }
            });
            return;
        }
        imageView.setImageDrawable(getResources().getDrawable(C5437byj.e.e, getContext().getTheme()));
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        imageView.setOnClickListener(new View.OnClickListener() { // from class: o.byR
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C5410byI.a(C5410byI.this, imageView, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(RaterThumbsLottieDrawable raterThumbsLottieDrawable, C5410byI c5410byI, ImageView imageView, View view) {
        C8632dsu.c((Object) c5410byI, "");
        C8632dsu.c((Object) imageView, "");
        raterThumbsLottieDrawable.cancelAnimation();
        raterThumbsLottieDrawable.setState((RaterThumbsLottieDrawable) RaterThumbsLottieDrawable.State.c);
        raterThumbsLottieDrawable.animateToState(RaterThumbsLottieDrawable.State.b);
        c5410byI.d(Integer.valueOf(C8632dsu.c(imageView, c5410byI.e.k) ? 2 : 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C5410byI c5410byI, ImageView imageView, View view) {
        C8632dsu.c((Object) c5410byI, "");
        C8632dsu.c((Object) imageView, "");
        c5410byI.d(Integer.valueOf(C8632dsu.c(imageView, c5410byI.e.k) ? 2 : 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        drm.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void j() {
        BehaviorSubject<dpR> behaviorSubject;
        if (this.c && this.d && (behaviorSubject = this.b) != null) {
            final RaterView$setupThumbEnterAnimationIfReady$1 raterView$setupThumbEnterAnimationIfReady$1 = new RaterView$setupThumbEnterAnimationIfReady$1(this);
            behaviorSubject.subscribe(new Consumer() { // from class: o.byO
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    C5410byI.e(drM.this, obj);
                }
            });
        }
    }

    public final void e(ViewPager2.OnPageChangeCallback onPageChangeCallback) {
        C8632dsu.c((Object) onPageChangeCallback, "");
        this.e.n.registerOnPageChangeCallback(onPageChangeCallback);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a() {
        this.e.f13642o.setAlpha(0.0f);
        C1204Sr c1204Sr = this.e.f13642o;
        c1204Sr.setTranslationY(c1204Sr.getHeight() / 4);
        this.e.i.setAlpha(0.0f);
        C5447byt c5447byt = this.e;
        c5447byt.f13642o.setTranslationY(c5447byt.i.getHeight());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void g() {
        BehaviorSubject<dpR> behaviorSubject = this.b;
        if ((behaviorSubject != null ? behaviorSubject.getValue() : null) != null) {
            return;
        }
        this.e.f13642o.animate().alpha(1.0f).translationY(0.0f).setStartDelay(200L).setDuration(700L).start();
        this.e.i.animate().alpha(1.0f).translationY(0.0f).setStartDelay(2200L).setDuration(700L).start();
        BehaviorSubject<dpR> behaviorSubject2 = this.b;
        if (behaviorSubject2 != null) {
            behaviorSubject2.onNext(dpR.c);
        }
    }

    private final void e() {
        int i2 = this.j - 1;
        if (i2 < 0 || i2 >= c() || !this.n.containsKey(Integer.valueOf(i2))) {
            return;
        }
        InterfaceC5405byD interfaceC5405byD = this.f13640o;
        if (interfaceC5405byD != null) {
            interfaceC5405byD.b(i2, this.m.e().get(i2).d(), this.n.get(Integer.valueOf(i2)));
        }
        this.n.remove(Integer.valueOf(i2));
        this.g.e(false);
    }

    private final void d(Integer num) {
        int i2 = this.j;
        if (i2 < 0 || i2 >= c() || this.n.containsKey(Integer.valueOf(i2))) {
            return;
        }
        this.n.put(Integer.valueOf(i2), num);
        boolean z = i2 + 1 == this.m.e().size();
        if (num == null) {
            InterfaceC5405byD interfaceC5405byD = this.f13640o;
            if (interfaceC5405byD != null) {
                interfaceC5405byD.e(i2, this.m.e().get(i2).d(), z);
            }
        } else {
            InterfaceC5405byD interfaceC5405byD2 = this.f13640o;
            if (interfaceC5405byD2 != null) {
                interfaceC5405byD2.e(i2, this.m.e().get(i2).d(), num.intValue(), z);
            }
        }
        this.g.e(true);
        if (z) {
            b(this, this.f, false, 2, null);
        }
    }

    public final void setTitles(List<? extends InterfaceC5367bxS> list) {
        C8632dsu.c((Object) list, "");
        if (this.m.e().size() == list.size() && this.m.e().containsAll(list)) {
            return;
        }
        this.i = null;
        this.m.b(list);
        this.n.clear();
        this.e.n.setCurrentItem(0);
    }

    public final int c() {
        return this.m.getItemCount();
    }

    /* renamed from: o.byI$e */
    /* loaded from: classes4.dex */
    public static final class e implements Runnable {
        final /* synthetic */ C5410byI a;
        final /* synthetic */ View e;

        public e(View view, C5410byI c5410byI) {
            this.e = view;
            this.a = c5410byI;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.a.g();
        }
    }

    /* renamed from: o.byI$h */
    /* loaded from: classes4.dex */
    public static final class h implements Runnable {
        final /* synthetic */ C5410byI a;
        final /* synthetic */ View b;

        public h(View view, C5410byI c5410byI) {
            this.b = view;
            this.a = c5410byI;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.a.f) {
                this.a.a();
            }
        }
    }

    public final void b() {
        if (this.k) {
            ViewPager2 viewPager2 = this.e.n;
            C8632dsu.a(viewPager2, "");
            viewPager2.setVisibility(0);
            this.e.n.setAlpha(1.0f);
            this.e.n.setTranslationX(0.0f);
            ProgressBar progressBar = this.e.h;
            C8632dsu.a(progressBar, "");
            progressBar.setVisibility(0);
            this.e.h.setScaleX(1.0f);
            this.e.h.setTranslationX(0.0f);
            this.e.h.setAlpha(1.0f);
            ConstraintLayout constraintLayout = this.e.a;
            C8632dsu.a(constraintLayout, "");
            constraintLayout.setVisibility(0);
            this.e.a.setAlpha(1.0f);
            NetflixImageView netflixImageView = this.e.k;
            C8632dsu.a(netflixImageView, "");
            netflixImageView.setVisibility(0);
            this.e.k.setTranslationX(0.0f);
            this.e.k.setAlpha(1.0f);
            NetflixImageView netflixImageView2 = this.e.j;
            C8632dsu.a(netflixImageView2, "");
            netflixImageView2.setVisibility(0);
            this.e.j.setTranslationX(0.0f);
            this.e.j.setAlpha(1.0f);
            C1204Sr c1204Sr = this.e.f13642o;
            C8632dsu.a(c1204Sr, "");
            c1204Sr.setVisibility(0);
            this.e.f13642o.setAlpha(1.0f);
            C1204Sr c1204Sr2 = this.e.l;
            C8632dsu.a(c1204Sr2, "");
            c1204Sr2.setVisibility(8);
            C9909yq c9909yq = this.e.c;
            C8632dsu.a(c9909yq, "");
            c9909yq.setVisibility(8);
            this.e.c.setAlpha(0.0f);
            NetflixImageView netflixImageView3 = this.e.d;
            C8632dsu.a(netflixImageView3, "");
            netflixImageView3.setVisibility(8);
            C1204Sr c1204Sr3 = this.e.g;
            C8632dsu.a(c1204Sr3, "");
            c1204Sr3.setVisibility(8);
            ConstraintSet constraintSet = new ConstraintSet();
            constraintSet.clone(this);
            constraintSet.connect(this.e.f.getId(), 6, 0, 6, getResources().getDimensionPixelSize(C5437byj.a.a));
            constraintSet.connect(this.e.f.getId(), 7, 0, 7, getResources().getDimensionPixelSize(C5437byj.a.a));
            constraintSet.applyTo(this);
            ConstraintSet constraintSet2 = new ConstraintSet();
            constraintSet2.clone(this.e.f);
            constraintSet2.clear(this.e.c.getId(), 4);
            constraintSet2.connect(this.e.a.getId(), 4, 0, 4);
            constraintSet2.applyTo(this.e.f);
            ConstraintLayout constraintLayout2 = this.e.f;
            C8632dsu.a(constraintLayout2, "");
            constraintLayout2.setPadding(0, constraintLayout2.getPaddingTop(), 0, constraintLayout2.getPaddingBottom());
            this.n.clear();
            this.e.n.setCurrentItem(0, false);
            this.k = false;
        }
    }

    public final void e(boolean z) {
        d(false, z);
    }

    static /* synthetic */ void b(C5410byI c5410byI, boolean z, boolean z2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z2 = false;
        }
        c5410byI.d(z, z2);
    }

    private final void d(boolean z, boolean z2) {
        if (this.k) {
            return;
        }
        final boolean z3 = true;
        this.k = true;
        boolean containsValue = this.n.containsValue(2);
        if (!z || !containsValue) {
            z3 = false;
        }
        final int dimension = ((int) getResources().getDimension(C5437byj.a.e)) + this.e.f.getPaddingLeft();
        this.e.c.setVisibility(4);
        this.e.c.setAlpha(0.0f);
        if (z3) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.setDuration(800L);
            ofFloat.setStartDelay(350L);
            ofFloat.setInterpolator(new C5443byp());
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: o.byF
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    C5410byI.c(C5410byI.this, dimension, valueAnimator);
                }
            });
            C8632dsu.d(ofFloat);
            ofFloat.addListener(new k());
            ofFloat.start();
        }
        if (z2) {
            c(dimension, false);
        } else {
            this.e.c.postDelayed(new Runnable() { // from class: o.byH
                @Override // java.lang.Runnable
                public final void run() {
                    C5410byI.b(C5410byI.this, dimension, z3);
                }
            }, 250L);
        }
        d dVar = this.h;
        if (dVar != null) {
            dVar.b(z3 ? 800L : 0L, this.n);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(C5410byI c5410byI, int i2, ValueAnimator valueAnimator) {
        C8632dsu.c((Object) c5410byI, "");
        C8632dsu.c((Object) valueAnimator, "");
        Object animatedValue = valueAnimator.getAnimatedValue();
        C8632dsu.d(animatedValue);
        float floatValue = ((Float) animatedValue).floatValue();
        c5410byI.e.n.setAlpha(1 - (1.5f * floatValue));
        ViewPager2 viewPager2 = c5410byI.e.n;
        viewPager2.setTranslationX(floatValue * ((-viewPager2.getWidth()) - (i2 * 2)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(C5410byI c5410byI, int i2, boolean z) {
        C8632dsu.c((Object) c5410byI, "");
        c5410byI.c(i2, z);
    }

    private final void c(final int i2, boolean z) {
        if (z) {
            final int width = this.e.h.getWidth();
            ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
            ofFloat.setDuration(600L);
            ofFloat.setInterpolator(new C5443byp());
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: o.byL
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    C5410byI.a(C5410byI.this, width, i2, valueAnimator);
                }
            });
            C8632dsu.d(ofFloat);
            ofFloat.addListener(new i());
            ofFloat.start();
            AnimatorSet animatorSet = new AnimatorSet();
            NetflixImageView netflixImageView = this.e.k;
            C1332Xp c1332Xp = C1332Xp.b;
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(netflixImageView, "translationX", -((int) TypedValue.applyDimension(1, 20, ((Context) C1332Xp.b(Context.class)).getResources().getDisplayMetrics())));
            ofFloat2.setDuration(567L);
            ofFloat2.setInterpolator(new C5443byp());
            dpR dpr = dpR.c;
            animatorSet.playTogether(ObjectAnimator.ofFloat(this.e.k, InteractiveAnimation.ANIMATION_TYPE.ALPHA, 0.0f).setDuration(200L), ofFloat2);
            animatorSet.addListener(new g());
            animatorSet.start();
            AnimatorSet animatorSet2 = new AnimatorSet();
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.e.j, "translationX", -((int) TypedValue.applyDimension(1, 100, ((Context) C1332Xp.b(Context.class)).getResources().getDisplayMetrics())));
            ofFloat3.setDuration(567L);
            ofFloat3.setInterpolator(new C5443byp());
            animatorSet2.playTogether(ObjectAnimator.ofFloat(this.e.j, InteractiveAnimation.ANIMATION_TYPE.ALPHA, 0.0f).setDuration(200L), ofFloat3);
            animatorSet2.addListener(new j());
            animatorSet2.start();
            ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(this.e.a, InteractiveAnimation.ANIMATION_TYPE.ALPHA, 0.0f);
            ofFloat4.setDuration(260L);
            ofFloat4.setStartDelay(160L);
            C8632dsu.d(ofFloat4);
            ofFloat4.addListener(new f());
            ofFloat4.start();
            this.e.g.setAlpha(0.0f);
            this.e.g.setTranslationX((int) TypedValue.applyDimension(1, 40, ((Context) C1332Xp.b(Context.class)).getResources().getDisplayMetrics()));
            AnimatorSet animatorSet3 = new AnimatorSet();
            ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(this.e.g, InteractiveAnimation.ANIMATION_TYPE.ALPHA, 1.0f);
            ofFloat5.setStartDelay(400L);
            ofFloat5.setDuration(200L);
            ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(this.e.g, "translationX", 0.0f);
            ofFloat6.setStartDelay(100L);
            ofFloat6.setDuration(800L);
            ofFloat6.setInterpolator(new C5442byo());
            animatorSet3.playTogether(ofFloat5, ofFloat6);
            animatorSet3.start();
            this.e.c.setTranslationX((int) TypedValue.applyDimension(1, 80, ((Context) C1332Xp.b(Context.class)).getResources().getDisplayMetrics()));
            AnimatorSet animatorSet4 = new AnimatorSet();
            long j2 = 3;
            long j3 = (2 * 800) / j2;
            ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(this.e.c, "translationX", 0.0f);
            ofFloat7.setStartDelay(800 / j2);
            ofFloat7.setDuration(800L);
            ofFloat7.setInterpolator(new C5442byo());
            animatorSet4.playTogether(ObjectAnimator.ofFloat(this.e.c, InteractiveAnimation.ANIMATION_TYPE.ALPHA, 1.0f).setDuration(j3), ofFloat7);
            animatorSet4.setStartDelay(j3);
            animatorSet4.start();
            this.e.d.setAlpha(0.0f);
            this.e.d.setTranslationX((int) TypedValue.applyDimension(1, -20, ((Context) C1332Xp.b(Context.class)).getResources().getDisplayMetrics()));
            AnimatorSet animatorSet5 = new AnimatorSet();
            animatorSet5.setStartDelay(200L);
            ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(this.e.d, "translationX", 0.0f);
            ofFloat8.setDuration(800L);
            ofFloat8.setInterpolator(new C5443byp());
            animatorSet5.playTogether(ObjectAnimator.ofFloat(this.e.d, InteractiveAnimation.ANIMATION_TYPE.ALPHA, 1.0f).setDuration(400L), ofFloat8);
            animatorSet5.start();
            TransitionManager.beginDelayedTransition(this, new C5440bym().setDuration(800L).setInterpolator((TimeInterpolator) new C5443byp()));
            C1204Sr c1204Sr = this.e.g;
            C8632dsu.a(c1204Sr, "");
            c1204Sr.setVisibility(0);
            C9909yq c9909yq = this.e.c;
            C8632dsu.a(c9909yq, "");
            c9909yq.setVisibility(0);
            NetflixImageView netflixImageView2 = this.e.d;
            C8632dsu.a(netflixImageView2, "");
            netflixImageView2.setVisibility(0);
        } else {
            ViewPager2 viewPager2 = this.e.n;
            C8632dsu.a(viewPager2, "");
            viewPager2.setVisibility(8);
            ProgressBar progressBar = this.e.h;
            C8632dsu.a(progressBar, "");
            progressBar.setVisibility(8);
            ConstraintLayout constraintLayout = this.e.a;
            C8632dsu.a(constraintLayout, "");
            constraintLayout.setVisibility(8);
            NetflixImageView netflixImageView3 = this.e.k;
            C8632dsu.a(netflixImageView3, "");
            netflixImageView3.setVisibility(8);
            NetflixImageView netflixImageView4 = this.e.j;
            C8632dsu.a(netflixImageView4, "");
            netflixImageView4.setVisibility(8);
            C9909yq c9909yq2 = this.e.c;
            C8632dsu.a(c9909yq2, "");
            c9909yq2.setVisibility(0);
            this.e.c.setAlpha(1.0f);
            NetflixImageView netflixImageView5 = this.e.d;
            C8632dsu.a(netflixImageView5, "");
            netflixImageView5.setVisibility(0);
            C1204Sr c1204Sr2 = this.e.g;
            C8632dsu.a(c1204Sr2, "");
            c1204Sr2.setVisibility(0);
            this.e.g.setAlpha(1.0f);
        }
        this.e.d.setImageResource(C5437byj.e.b);
        ConstraintSet constraintSet = new ConstraintSet();
        constraintSet.clone(this);
        constraintSet.connect(this.e.f.getId(), 6, C5437byj.c.v, 6, 0);
        constraintSet.connect(this.e.f.getId(), 7, C5437byj.c.v, 7, 0);
        constraintSet.applyTo(this);
        ConstraintSet constraintSet2 = new ConstraintSet();
        constraintSet2.clone(this.e.f);
        int id = this.e.c.getId();
        C1332Xp c1332Xp2 = C1332Xp.b;
        constraintSet2.connect(id, 4, 0, 4, (int) TypedValue.applyDimension(1, 16, ((Context) C1332Xp.b(Context.class)).getResources().getDisplayMetrics()));
        constraintSet2.clear(this.e.a.getId(), 4);
        constraintSet2.applyTo(this.e.f);
        ConstraintLayout constraintLayout2 = this.e.f;
        C8632dsu.a(constraintLayout2, "");
        float f2 = 8;
        constraintLayout2.setPadding(((int) TypedValue.applyDimension(1, f2, ((Context) C1332Xp.b(Context.class)).getResources().getDisplayMetrics())) + i2, constraintLayout2.getPaddingTop(), i2 + ((int) TypedValue.applyDimension(1, f2, ((Context) C1332Xp.b(Context.class)).getResources().getDisplayMetrics())), constraintLayout2.getPaddingBottom());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C5410byI c5410byI, int i2, int i3, ValueAnimator valueAnimator) {
        C8632dsu.c((Object) c5410byI, "");
        C8632dsu.c((Object) valueAnimator, "");
        Object animatedValue = valueAnimator.getAnimatedValue();
        C8632dsu.d(animatedValue);
        float floatValue = ((Float) animatedValue).floatValue();
        c5410byI.e.h.setScaleX(floatValue);
        float f2 = i2;
        c5410byI.e.h.setTranslationX(((f2 - (f2 * floatValue)) + (i3 * 2)) * 0.5f);
        c5410byI.e.h.setAlpha(floatValue);
    }
}
