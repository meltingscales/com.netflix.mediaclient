package com.yuyakaido.android.cardstackview;

import android.animation.Animator;
import android.content.Context;
import android.graphics.PointF;
import android.os.Handler;
import android.view.View;
import android.view.animation.Interpolator;
import androidx.recyclerview.widget.RecyclerView;
import com.yuyakaido.android.cardstackview.internal.CardStackSmoothScroller;
import com.yuyakaido.android.cardstackview.internal.CardStackState;
import java.util.List;
import o.C8504doa;
import o.C8505dob;
import o.C8507dod;
import o.C8510dog;
import o.dnU;

/* loaded from: classes5.dex */
public class CardStackLayoutManager extends RecyclerView.LayoutManager implements RecyclerView.SmoothScroller.ScrollVectorProvider {
    private CardStackState a;
    private dnU b;
    private C8507dod c;
    private final Context e;

    public dnU a() {
        return this.b;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.SmoothScroller.ScrollVectorProvider
    public PointF computeScrollVectorForPosition(int i) {
        return null;
    }

    public C8507dod d() {
        return this.c;
    }

    public CardStackState e() {
        return this.a;
    }

    public CardStackLayoutManager(Context context) {
        this(context, dnU.f);
    }

    public CardStackLayoutManager(Context context, dnU dnu) {
        this.b = dnU.f;
        this.c = new C8507dod();
        this.a = new CardStackState();
        this.e = context;
        this.b = dnu;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public RecyclerView.LayoutParams generateDefaultLayoutParams() {
        return new RecyclerView.LayoutParams(-1, -1);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onLayoutChildren(RecyclerView.Recycler recycler, RecyclerView.State state) {
        e(recycler);
        if (!state.didStructureChange() || c() == null) {
            return;
        }
        this.b.c(c(), this.a.j);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean canScrollHorizontally() {
        return this.c.m.c() && this.c.e;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean canScrollVertically() {
        return this.c.m.c() && this.c.d;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int scrollHorizontallyBy(int i, RecyclerView.Recycler recycler, RecyclerView.State state) {
        if (this.a.j == getItemCount()) {
            return 0;
        }
        int i2 = AnonymousClass1.e[this.a.h.ordinal()];
        if (i2 == 1 || i2 == 2 || i2 == 3) {
            if (this.c.m.e()) {
                this.a.e -= i;
                e(recycler);
                return i;
            }
        } else if (i2 == 4) {
            this.a.e -= i;
            e(recycler);
            return i;
        } else if (i2 == 5 && this.c.m.b()) {
            this.a.e -= i;
            e(recycler);
            return i;
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int scrollVerticallyBy(int i, RecyclerView.Recycler recycler, RecyclerView.State state) {
        if (this.a.j == getItemCount()) {
            return 0;
        }
        int i2 = AnonymousClass1.e[this.a.h.ordinal()];
        if (i2 == 1 || i2 == 2 || i2 == 3) {
            if (this.c.m.e()) {
                this.a.c -= i;
                e(recycler);
                return i;
            }
        } else if (i2 == 4) {
            this.a.c -= i;
            e(recycler);
            return i;
        } else if (i2 == 5 && this.c.m.b()) {
            this.a.c -= i;
            e(recycler);
            return i;
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onScrollStateChanged(int i) {
        if (i == 0) {
            CardStackState cardStackState = this.a;
            int i2 = cardStackState.i;
            if (i2 == -1) {
                cardStackState.b(CardStackState.Status.Idle);
                this.a.i = -1;
                return;
            }
            int i3 = cardStackState.j;
            if (i3 == i2) {
                cardStackState.b(CardStackState.Status.Idle);
                this.a.i = -1;
            } else if (i3 < i2) {
                d(i2);
            } else {
                g(i2);
            }
        } else if (i == 1 && this.c.m.e()) {
            this.a.b(CardStackState.Status.Dragging);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void scrollToPosition(int i) {
        if (this.c.m.b() && this.a.a(i, getItemCount())) {
            this.a.j = i;
            requestLayout();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.State state, int i) {
        if (this.c.m.b() && this.a.a(i, getItemCount())) {
            c(i);
        }
    }

    public void b(float f, float f2) {
        View findViewByPosition;
        if (b() >= getItemCount() || (findViewByPosition = findViewByPosition(b())) == null) {
            return;
        }
        float height = getHeight() / 2.0f;
        this.a.d = (-((f2 - height) - findViewByPosition.getTop())) / height;
    }

    private void e(RecyclerView.Recycler recycler) {
        this.a.f = getWidth();
        this.a.b = getHeight();
        int i = 0;
        if (this.a.d()) {
            removeAndRecycleView(c(), recycler);
            final Direction b = this.a.b();
            CardStackState cardStackState = this.a;
            cardStackState.b(cardStackState.h.e());
            CardStackState cardStackState2 = this.a;
            int i2 = cardStackState2.j + 1;
            cardStackState2.j = i2;
            cardStackState2.e = 0;
            cardStackState2.c = 0;
            if (i2 == cardStackState2.i) {
                cardStackState2.i = -1;
            }
            cardStackState2.g = Boolean.FALSE;
            new Handler().post(new Runnable() { // from class: com.yuyakaido.android.cardstackview.CardStackLayoutManager.2
                @Override // java.lang.Runnable
                public void run() {
                    CardStackLayoutManager.this.b.a(b);
                    if (CardStackLayoutManager.this.c() != null) {
                        CardStackLayoutManager.this.b.c(CardStackLayoutManager.this.c(), CardStackLayoutManager.this.a.j);
                    }
                }
            });
        }
        detachAndScrapAttachedViews(recycler);
        int paddingTop = getPaddingTop();
        int paddingLeft = getPaddingLeft();
        int width = getWidth();
        int paddingLeft2 = getPaddingLeft();
        int height = getHeight();
        int paddingBottom = getPaddingBottom();
        int i3 = this.a.j;
        while (i3 < this.a.j + this.c.f13863o && i3 < getItemCount()) {
            View viewForPosition = recycler.getViewForPosition(i3);
            addView(viewForPosition, i);
            measureChildWithMargins(viewForPosition, i, i);
            layoutDecoratedWithMargins(viewForPosition, paddingLeft, paddingTop, width - paddingLeft2, height - paddingBottom);
            c(viewForPosition);
            e(viewForPosition);
            b(viewForPosition);
            d(viewForPosition);
            int i4 = this.a.j;
            if (i3 == i4) {
                j(viewForPosition);
                e(viewForPosition);
                f(viewForPosition);
                a(viewForPosition);
            } else {
                int i5 = i3 - i4;
                b(viewForPosition, i5);
                c(viewForPosition, i5);
                b(viewForPosition);
                d(viewForPosition);
            }
            i3++;
            i = 0;
        }
        if (this.a.h.c()) {
            this.b.e(this.a.b(), this.a.e());
        }
    }

    private void j(View view) {
        view.setTranslationX(this.a.e);
        view.setTranslationY(this.a.c);
    }

    private void b(View view, int i) {
        Float valueOf;
        Float valueOf2;
        boolean z = i == this.c.f13863o - 1;
        if (this.a.a.booleanValue() && z) {
            return;
        }
        int a = C8510dog.a(this.e, this.c.n);
        float f = i * a;
        float e = (f - ((f - ((i - 1) * a)) * this.a.e())) * ((this.c.i * 100.0f) / a);
        boolean a2 = a(i);
        Float f2 = null;
        switch (AnonymousClass1.b[this.c.h.ordinal()]) {
            case 2:
                valueOf = Float.valueOf(-e);
                break;
            case 3:
                float f3 = -e;
                f2 = Float.valueOf(f3);
                valueOf2 = Float.valueOf(f3);
                Float f4 = f2;
                f2 = valueOf2;
                valueOf = f4;
                break;
            case 4:
                f2 = Float.valueOf(-e);
                valueOf2 = Float.valueOf(e);
                Float f42 = f2;
                f2 = valueOf2;
                valueOf = f42;
                break;
            case 5:
                valueOf = Float.valueOf(e);
                break;
            case 6:
                f2 = Float.valueOf(e);
                valueOf2 = Float.valueOf(-e);
                Float f422 = f2;
                f2 = valueOf2;
                valueOf = f422;
                break;
            case 7:
                f2 = Float.valueOf(e);
                valueOf2 = Float.valueOf(e);
                Float f4222 = f2;
                f2 = valueOf2;
                valueOf = f4222;
                break;
            case 8:
                valueOf2 = Float.valueOf(-e);
                Float f42222 = f2;
                f2 = valueOf2;
                valueOf = f42222;
                break;
            case 9:
                valueOf2 = Float.valueOf(e);
                Float f422222 = f2;
                f2 = valueOf2;
                valueOf = f422222;
                break;
            default:
                valueOf = null;
                break;
        }
        if (a2) {
            a(view, f2, valueOf);
        } else {
            e(view, f2, valueOf);
        }
    }

    private void a(View view, Float f, Float f2) {
        this.a.a = Boolean.TRUE;
        view.setAlpha(0.0f);
        e(view, f, f2);
        view.animate().alpha(1.0f).setDuration(Duration.Fast.c).setListener(new Animator.AnimatorListener() { // from class: com.yuyakaido.android.cardstackview.CardStackLayoutManager.5
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                CardStackLayoutManager.this.a.a = Boolean.FALSE;
                CardStackLayoutManager.this.a.g = Boolean.TRUE;
            }
        }).start();
    }

    private boolean a(int i) {
        return (this.a.a.booleanValue() || !(i == this.c.f13863o - 1) || this.a.g.booleanValue()) ? false : true;
    }

    private void e(View view, Float f, Float f2) {
        if (f != null) {
            view.setTranslationX(f.floatValue());
        }
        if (f2 != null) {
            view.setTranslationY(f2.floatValue());
        }
    }

    private void c(View view) {
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
    }

    private void c(View view, int i) {
        float f = 1.0f - this.c.i;
        float f2 = 1.0f - (i * f);
        float e = f2 + (((1.0f - ((i - 1) * f)) - f2) * this.a.e());
        view.setScaleX(e);
        view.setScaleY(e);
    }

    private void e(View view) {
        view.setScaleX(1.0f);
        view.setScaleY(1.0f);
    }

    private void f(View view) {
        view.setRotation(((this.a.e * this.c.a) / getWidth()) * this.a.d);
    }

    private void b(View view) {
        view.setRotation(0.0f);
    }

    private void a(View view) {
        View findViewById = view.findViewById(C8505dob.d.a);
        if (findViewById != null) {
            findViewById.setAlpha(0.0f);
        }
        View findViewById2 = view.findViewById(C8505dob.d.d);
        if (findViewById2 != null) {
            findViewById2.setAlpha(0.0f);
        }
        View findViewById3 = view.findViewById(C8505dob.d.e);
        if (findViewById3 != null) {
            findViewById3.setAlpha(0.0f);
        }
        View findViewById4 = view.findViewById(C8505dob.d.b);
        if (findViewById4 != null) {
            findViewById4.setAlpha(0.0f);
        }
        Direction b = this.a.b();
        float interpolation = this.c.c.getInterpolation(this.a.e());
        int i = AnonymousClass1.d[b.ordinal()];
        if (i == 1) {
            if (findViewById != null) {
                findViewById.setAlpha(interpolation);
            }
        } else if (i == 2) {
            if (findViewById2 != null) {
                findViewById2.setAlpha(interpolation);
            }
        } else if (i == 3) {
            if (findViewById3 != null) {
                findViewById3.setAlpha(interpolation);
            }
        } else if (i == 4 && findViewById4 != null) {
            findViewById4.setAlpha(interpolation);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.yuyakaido.android.cardstackview.CardStackLayoutManager$1  reason: invalid class name */
    /* loaded from: classes5.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] b;
        static final /* synthetic */ int[] d;
        static final /* synthetic */ int[] e;

        static {
            int[] iArr = new int[Direction.values().length];
            d = iArr;
            try {
                iArr[Direction.Left.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                d[Direction.Right.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                d[Direction.Top.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                d[Direction.Bottom.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[StackFrom.values().length];
            b = iArr2;
            try {
                iArr2[StackFrom.None.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                b[StackFrom.Top.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                b[StackFrom.TopAndLeft.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                b[StackFrom.TopAndRight.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                b[StackFrom.Bottom.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                b[StackFrom.BottomAndLeft.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                b[StackFrom.BottomAndRight.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                b[StackFrom.Left.ordinal()] = 8;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                b[StackFrom.Right.ordinal()] = 9;
            } catch (NoSuchFieldError unused13) {
            }
            int[] iArr3 = new int[CardStackState.Status.values().length];
            e = iArr3;
            try {
                iArr3[CardStackState.Status.Idle.ordinal()] = 1;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                e[CardStackState.Status.Dragging.ordinal()] = 2;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                e[CardStackState.Status.ManualSwipeAnimating.ordinal()] = 3;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                e[CardStackState.Status.RewindAnimating.ordinal()] = 4;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                e[CardStackState.Status.AutomaticSwipeAnimating.ordinal()] = 5;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                e[CardStackState.Status.AutomaticSwipeAnimated.ordinal()] = 6;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                e[CardStackState.Status.ManualSwipeAnimated.ordinal()] = 7;
            } catch (NoSuchFieldError unused20) {
            }
        }
    }

    private void d(View view) {
        View findViewById = view.findViewById(C8505dob.d.a);
        if (findViewById != null) {
            findViewById.setAlpha(0.0f);
        }
        View findViewById2 = view.findViewById(C8505dob.d.d);
        if (findViewById2 != null) {
            findViewById2.setAlpha(0.0f);
        }
        View findViewById3 = view.findViewById(C8505dob.d.e);
        if (findViewById3 != null) {
            findViewById3.setAlpha(0.0f);
        }
        View findViewById4 = view.findViewById(C8505dob.d.b);
        if (findViewById4 != null) {
            findViewById4.setAlpha(0.0f);
        }
    }

    private void c(int i) {
        if (this.a.j < i) {
            d(i);
        } else {
            g(i);
        }
    }

    private void d(int i) {
        CardStackState cardStackState = this.a;
        cardStackState.d = 0.0f;
        cardStackState.i = i;
        CardStackSmoothScroller cardStackSmoothScroller = new CardStackSmoothScroller(CardStackSmoothScroller.ScrollType.AutomaticSwipe, this);
        cardStackSmoothScroller.setTargetPosition(this.a.j);
        startSmoothScroll(cardStackSmoothScroller);
    }

    private void g(int i) {
        if (c() != null) {
            dnU dnu = this.b;
            View c = c();
            CardStackState cardStackState = this.a;
            dnu.c(c, cardStackState.j, cardStackState.b());
        }
        CardStackState cardStackState2 = this.a;
        cardStackState2.d = 0.0f;
        cardStackState2.i = i;
        cardStackState2.j--;
        CardStackSmoothScroller cardStackSmoothScroller = new CardStackSmoothScroller(CardStackSmoothScroller.ScrollType.AutomaticRewind, this);
        cardStackSmoothScroller.setTargetPosition(this.a.j);
        startSmoothScroll(cardStackSmoothScroller);
    }

    public View c() {
        return findViewByPosition(this.a.j);
    }

    public int b() {
        return this.a.j;
    }

    public void e(int i) {
        this.a.j = i;
    }

    public void c(StackFrom stackFrom) {
        this.c.h = stackFrom;
    }

    public void b(int i) {
        if (i < 1) {
            throw new IllegalArgumentException("VisibleCount must be greater than 0.");
        }
        this.c.f13863o = i;
    }

    public void d(float f) {
        if (f < 0.0f) {
            throw new IllegalArgumentException("TranslationInterval must be greater than or equal 0.0f");
        }
        this.c.n = f;
    }

    public void b(float f) {
        if (f < 0.0f) {
            throw new IllegalArgumentException("ScaleInterval must be greater than or equal 0.0f.");
        }
        this.c.i = f;
    }

    public void e(float f) {
        if (f < 0.0f || 1.0f < f) {
            throw new IllegalArgumentException("SwipeThreshold must be 0.0f to 1.0f.");
        }
        this.c.j = f;
    }

    public void c(float f) {
        if (f < -360.0f || 360.0f < f) {
            throw new IllegalArgumentException("MaxDegree must be -360.0f to 360.0f");
        }
        this.c.a = f;
    }

    public void a(List<Direction> list) {
        this.c.b = list;
    }

    public void e(boolean z) {
        this.c.e = z;
    }

    public void c(boolean z) {
        this.c.d = z;
    }

    public void a(SwipeableMethod swipeableMethod) {
        this.c.m = swipeableMethod;
    }

    public void d(C8504doa c8504doa) {
        this.c.f = c8504doa;
    }

    public void d(Interpolator interpolator) {
        this.c.c = interpolator;
    }
}
