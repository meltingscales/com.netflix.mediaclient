package com.netflix.mediaclient.ui.collecttaste.impl.rating;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import androidx.core.content.res.ResourcesCompat;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.RecyclerView;
import com.netflix.mediaclient.ui.collecttaste.impl.rating.CollectTasteTitlesStackManager;
import com.yuyakaido.android.cardstackview.CardStackLayoutManager;
import com.yuyakaido.android.cardstackview.Direction;
import com.yuyakaido.android.cardstackview.StackFrom;
import com.yuyakaido.android.cardstackview.SwipeableMethod;
import kotlin.NoWhenBranchMatchedException;
import o.Abstractanimation.Animation$AnimationListenerC9916yx;
import o.C1045Mp;
import o.C3535bBl;
import o.C3539bBp;
import o.C3548bBy;
import o.C8600drp;
import o.C8627dsp;
import o.C8632dsu;
import o.C9726vo;
import o.InterfaceC8598drn;
import o.bAG;
import o.dnU;
import o.dnV;
import o.dpR;
import o.drM;
import o.drO;
import o.drX;

/* loaded from: classes4.dex */
public final class CollectTasteTitlesStackManager {
    public static final Companion d = new Companion(null);
    private final C3539bBp a;
    private int b;
    private final CardStackLayoutManager c;
    private final c e;
    private final C3535bBl f;
    private final C3548bBy g;
    private int i;

    /* loaded from: classes4.dex */
    public final /* synthetic */ class e {
        public static final /* synthetic */ int[] a;
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[Companion.SwipeDirection.values().length];
            try {
                iArr[Companion.SwipeDirection.e.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Companion.SwipeDirection.c.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Companion.SwipeDirection.b.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Companion.SwipeDirection.a.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            b = iArr;
            int[] iArr2 = new int[Companion.HintAnimationDirection.values().length];
            try {
                iArr2[Companion.HintAnimationDirection.c.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[Companion.HintAnimationDirection.d.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[Companion.HintAnimationDirection.e.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[Companion.HintAnimationDirection.b.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            a = iArr2;
        }
    }

    public CollectTasteTitlesStackManager(dnV dnv, C3535bBl c3535bBl, C3539bBp c3539bBp, C3548bBy c3548bBy, drM<? super Integer, dpR> drm, drX<? super Companion.SwipeDirection, ? super Integer, dpR> drx, drO<dpR> dro, drO<dpR> dro2, drO<dpR> dro3) {
        C8632dsu.c((Object) dnv, "");
        C8632dsu.c((Object) c3535bBl, "");
        C8632dsu.c((Object) c3539bBp, "");
        C8632dsu.c((Object) c3548bBy, "");
        C8632dsu.c((Object) drm, "");
        C8632dsu.c((Object) drx, "");
        C8632dsu.c((Object) dro, "");
        C8632dsu.c((Object) dro2, "");
        C8632dsu.c((Object) dro3, "");
        this.f = c3535bBl;
        this.a = c3539bBp;
        this.g = c3548bBy;
        c cVar = new c(drm, this, drx, dro2, dro3, dro);
        this.e = cVar;
        CardStackLayoutManager cardStackLayoutManager = new CardStackLayoutManager(dnv.getContext(), cVar);
        this.c = cardStackLayoutManager;
        cardStackLayoutManager.c(StackFrom.Top);
        cardStackLayoutManager.b(3);
        cardStackLayoutManager.d(20.0f);
        cardStackLayoutManager.b(ResourcesCompat.getFloat(dnv.getContext().getResources(), bAG.d.e));
        cardStackLayoutManager.e(0.3f);
        cardStackLayoutManager.c(20.0f);
        cardStackLayoutManager.a(Direction.b);
        cardStackLayoutManager.e(true);
        cardStackLayoutManager.c(false);
        cardStackLayoutManager.a(SwipeableMethod.AutomaticAndManual);
        cardStackLayoutManager.d(new LinearInterpolator());
        dnv.setLayoutManager(cardStackLayoutManager);
        RecyclerView.ItemAnimator itemAnimator = dnv.getItemAnimator();
        if (itemAnimator instanceof DefaultItemAnimator) {
            ((DefaultItemAnimator) itemAnimator).setSupportsChangeAnimations(false);
        }
    }

    /* loaded from: classes4.dex */
    public static final class Companion extends C1045Mp {
        public /* synthetic */ Companion(C8627dsp c8627dsp) {
            this();
        }

        private Companion() {
            super("CollectTasteTitlesStackManager");
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* loaded from: classes4.dex */
        public static final class SwipeDirection {
            private static final /* synthetic */ InterfaceC8598drn d;
            private static final /* synthetic */ SwipeDirection[] g;
            public static final SwipeDirection e = new SwipeDirection("LEFT", 0);
            public static final SwipeDirection c = new SwipeDirection("RIGHT", 1);
            public static final SwipeDirection a = new SwipeDirection("TOP", 2);
            public static final SwipeDirection b = new SwipeDirection("BOTTOM", 3);

            private static final /* synthetic */ SwipeDirection[] b() {
                return new SwipeDirection[]{e, c, a, b};
            }

            public static SwipeDirection valueOf(String str) {
                return (SwipeDirection) Enum.valueOf(SwipeDirection.class, str);
            }

            public static SwipeDirection[] values() {
                return (SwipeDirection[]) g.clone();
            }

            static {
                SwipeDirection[] b2 = b();
                g = b2;
                d = C8600drp.e(b2);
            }

            private SwipeDirection(String str, int i) {
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* loaded from: classes4.dex */
        public static final class HintAnimationDirection {
            private static final /* synthetic */ InterfaceC8598drn a;
            private static final /* synthetic */ HintAnimationDirection[] j;
            public static final HintAnimationDirection c = new HintAnimationDirection("CENTER_TO_RIGHT", 0);
            public static final HintAnimationDirection d = new HintAnimationDirection("RIGHT_TO_CENTER", 1);
            public static final HintAnimationDirection e = new HintAnimationDirection("CENTER_TO_LEFT", 2);
            public static final HintAnimationDirection b = new HintAnimationDirection("LEFT_TO_CENTER", 3);

            private static final /* synthetic */ HintAnimationDirection[] d() {
                return new HintAnimationDirection[]{c, d, e, b};
            }

            public static HintAnimationDirection valueOf(String str) {
                return (HintAnimationDirection) Enum.valueOf(HintAnimationDirection.class, str);
            }

            public static HintAnimationDirection[] values() {
                return (HintAnimationDirection[]) j.clone();
            }

            private HintAnimationDirection(String str, int i) {
            }

            static {
                HintAnimationDirection[] d2 = d();
                j = d2;
                a = C8600drp.e(d2);
            }
        }
    }

    /* loaded from: classes4.dex */
    public static final class c implements dnU {
        final /* synthetic */ drX<Companion.SwipeDirection, Integer, dpR> a;
        final /* synthetic */ drO<dpR> b;
        final /* synthetic */ drO<dpR> c;
        final /* synthetic */ drO<dpR> d;
        final /* synthetic */ drM<Integer, dpR> e;
        final /* synthetic */ CollectTasteTitlesStackManager h;

        @Override // o.dnU
        public void a(Direction direction) {
        }

        @Override // o.dnU
        public void c() {
        }

        @Override // o.dnU
        public void e() {
        }

        @Override // o.dnU
        public void e(Direction direction, float f) {
        }

        /* JADX WARN: Multi-variable type inference failed */
        c(drM<? super Integer, dpR> drm, CollectTasteTitlesStackManager collectTasteTitlesStackManager, drX<? super Companion.SwipeDirection, ? super Integer, dpR> drx, drO<dpR> dro, drO<dpR> dro2, drO<dpR> dro3) {
            this.e = drm;
            this.h = collectTasteTitlesStackManager;
            this.a = drx;
            this.b = dro;
            this.d = dro2;
            this.c = dro3;
        }

        @Override // o.dnU
        public void c(View view, int i) {
            if (view != null) {
                this.e.invoke(Integer.valueOf(i));
            }
        }

        @Override // o.dnU
        public void c(View view, final int i, Direction direction) {
            final CollectTasteTitlesStackManager collectTasteTitlesStackManager = this.h;
            final drX<Companion.SwipeDirection, Integer, dpR> drx = this.a;
            final drO<dpR> dro = this.b;
            final drO<dpR> dro2 = this.d;
            final drO<dpR> dro3 = this.c;
            C9726vo.d(view, direction, new drX<View, Direction, dpR>() { // from class: com.netflix.mediaclient.ui.collecttaste.impl.rating.CollectTasteTitlesStackManager$listener$1$onCardDisappeared$1

                /* loaded from: classes4.dex */
                public final /* synthetic */ class e {
                    public static final /* synthetic */ int[] d;

                    static {
                        int[] iArr = new int[Direction.values().length];
                        try {
                            iArr[Direction.Left.ordinal()] = 1;
                        } catch (NoSuchFieldError unused) {
                        }
                        try {
                            iArr[Direction.Right.ordinal()] = 2;
                        } catch (NoSuchFieldError unused2) {
                        }
                        try {
                            iArr[Direction.Top.ordinal()] = 3;
                        } catch (NoSuchFieldError unused3) {
                        }
                        try {
                            iArr[Direction.Bottom.ordinal()] = 4;
                        } catch (NoSuchFieldError unused4) {
                        }
                        d = iArr;
                    }
                }

                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // o.drX
                public /* synthetic */ dpR invoke(View view2, Direction direction2) {
                    a(view2, direction2);
                    return dpR.c;
                }

                public final void a(View view2, Direction direction2) {
                    int i2;
                    CollectTasteTitlesStackManager.Companion.SwipeDirection swipeDirection;
                    int i3;
                    int i4;
                    int i5;
                    C8632dsu.c((Object) view2, "");
                    C8632dsu.c((Object) direction2, "");
                    int i6 = e.d[direction2.ordinal()];
                    if (i6 == 1) {
                        CollectTasteTitlesStackManager collectTasteTitlesStackManager2 = CollectTasteTitlesStackManager.this;
                        i2 = collectTasteTitlesStackManager2.b;
                        collectTasteTitlesStackManager2.b = i2 + 1;
                        swipeDirection = CollectTasteTitlesStackManager.Companion.SwipeDirection.e;
                    } else if (i6 == 2) {
                        swipeDirection = CollectTasteTitlesStackManager.Companion.SwipeDirection.c;
                    } else if (i6 == 3) {
                        swipeDirection = CollectTasteTitlesStackManager.Companion.SwipeDirection.a;
                    } else if (i6 != 4) {
                        throw new NoWhenBranchMatchedException();
                    } else {
                        CollectTasteTitlesStackManager collectTasteTitlesStackManager3 = CollectTasteTitlesStackManager.this;
                        i5 = collectTasteTitlesStackManager3.i;
                        collectTasteTitlesStackManager3.i = i5 + 1;
                        swipeDirection = CollectTasteTitlesStackManager.Companion.SwipeDirection.b;
                    }
                    drx.invoke(swipeDirection, Integer.valueOf(i));
                    i3 = CollectTasteTitlesStackManager.this.i;
                    if (i3 < CollectTasteTitlesStackManager.this.d()) {
                        i4 = CollectTasteTitlesStackManager.this.b;
                        if (i4 >= CollectTasteTitlesStackManager.this.d()) {
                            dro2.invoke();
                            return;
                        } else if (i >= CollectTasteTitlesStackManager.this.d() - 1) {
                            dro3.invoke();
                            return;
                        } else {
                            return;
                        }
                    }
                    dro.invoke();
                }
            });
        }
    }

    public final void e(dnV dnv, Companion.SwipeDirection swipeDirection) {
        C8632dsu.c((Object) dnv, "");
        C8632dsu.c((Object) swipeDirection, "");
        int i = e.b[swipeDirection.ordinal()];
        if (i == 1) {
            this.c.d(this.f.b());
            dnv.c();
        } else if (i == 2) {
            this.c.d(this.f.c());
            dnv.c();
        } else if (i != 3) {
        } else {
            this.c.d(this.f.d());
            dnv.c();
        }
    }

    public final int a() {
        return this.c.b();
    }

    public final int d() {
        return this.c.getItemCount();
    }

    /* loaded from: classes4.dex */
    public static final class b extends Abstractanimation.Animation$AnimationListenerC9916yx {
        b() {
        }

        @Override // o.Abstractanimation.Animation$AnimationListenerC9916yx, android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            FrameLayout h = CollectTasteTitlesStackManager.this.h();
            if (h == null) {
                return;
            }
            h.setAlpha(0.0f);
        }
    }

    public final void e() {
        this.a.b().setAnimationListener(new b());
        this.a.c().setAnimationListener(new a());
    }

    /* loaded from: classes4.dex */
    public static final class a extends Abstractanimation.Animation$AnimationListenerC9916yx {
        a() {
        }

        @Override // o.Abstractanimation.Animation$AnimationListenerC9916yx, android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            FrameLayout j = CollectTasteTitlesStackManager.this.j();
            if (j == null) {
                return;
            }
            j.setAlpha(0.0f);
        }
    }

    public final void i() {
        FrameLayout h = h();
        if (h != null) {
            h.setAlpha(1.0f);
            h.setVisibility(0);
            h.startAnimation(this.a.e());
        }
    }

    public final void g() {
        FrameLayout h = h();
        if (h != null) {
            h.startAnimation(this.a.b());
        }
    }

    public final void c() {
        FrameLayout j = j();
        if (j != null) {
            j.setAlpha(1.0f);
            j.setVisibility(0);
            j.startAnimation(this.a.d());
        }
    }

    public final void f() {
        FrameLayout j = j();
        if (j != null) {
            j.startAnimation(this.a.c());
        }
    }

    public final void b() {
        View c2 = this.c.c();
        if (c2 != null) {
            c2.clearAnimation();
        }
        FrameLayout h = h();
        if (h != null) {
            h.clearAnimation();
            h.setAlpha(0.0f);
        }
        FrameLayout j = j();
        if (j != null) {
            j.clearAnimation();
            j.setAlpha(0.0f);
        }
    }

    public final void b(Companion.HintAnimationDirection hintAnimationDirection) {
        AnimationSet a2;
        C8632dsu.c((Object) hintAnimationDirection, "");
        int i = e.a[hintAnimationDirection.ordinal()];
        if (i == 1) {
            a2 = this.g.a();
        } else if (i == 2) {
            a2 = this.g.d();
        } else if (i == 3) {
            a2 = this.g.e();
        } else if (i != 4) {
            throw new NoWhenBranchMatchedException();
        } else {
            a2 = this.g.b();
        }
        View c2 = this.c.c();
        if (c2 != null) {
            c2.startAnimation(a2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final FrameLayout h() {
        View c2 = this.c.c();
        if (c2 != null) {
            return (FrameLayout) c2.findViewById(bAG.a.H);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final FrameLayout j() {
        View c2 = this.c.c();
        if (c2 != null) {
            return (FrameLayout) c2.findViewById(bAG.a.G);
        }
        return null;
    }
}
