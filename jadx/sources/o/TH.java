package o;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Outline;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.animation.AccelerateDecelerateInterpolator;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.netflix.android.org.json.zip.JSONzip;
import com.netflix.mediaclient.android.widget.sheet.NetflixSwipeToDismissBehavior;
import com.netflix.mediaclient.api.logging.error.ErrorType;
import com.netflix.mediaclient.util.AccessibilityUtils;
import io.reactivex.Observable;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Consumer;
import java.util.Map;
import o.C8632dsu;
import o.C9834xU;
import o.InterfaceC1598aHf;
import o.InterfaceC1601aHi;
import o.TH;
import o.dpR;
import org.chromium.net.PrivateKeyType;

/* loaded from: classes3.dex */
public class TH extends ConstraintLayout {
    private static final float CLOSED_VALUE = 0.0f;
    private static final float OPEN_VALUE = 1.0f;
    public static final long TRANSITION_DURATION_MILLIS = 300;
    private final ValueAnimator animator;
    private final a animatorListener;
    private final ValueAnimator.AnimatorUpdateListener animatorUpdateListener;
    private boolean closeSheetWhenClickEmptyArea;
    private final CompositeDisposable compositeDisposable;
    private final View dim;
    private final View footer;
    private final GestureDetector gestureDetector;
    private final View header;
    private final ViewGroup sheet;
    private NetflixSwipeToDismissBehavior swipeToDismissBehavior;
    public static final c Companion = new c(null);
    public static final int $stable = 8;

    protected final View getDim() {
        return this.dim;
    }

    protected final View getFooter() {
        return this.footer;
    }

    protected final View getHeader() {
        return this.header;
    }

    public final ViewGroup getSheet() {
        return this.sheet;
    }

    public void onStartClose() {
    }

    public void onStartOpen() {
    }

    public void sheetDismissed() {
    }

    public void sheetOpen() {
    }

    public /* synthetic */ TH(Context context, int i, drM drm, drM drm2, int i2, int i3, int i4, int i5, int i6, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, int i7, C8627dsp c8627dsp) {
        this(context, i, (i7 & 4) != 0 ? new drM<View, dpR>() { // from class: com.netflix.mediaclient.android.widget.sheet.NetflixSheet$1
            public final void b(View view) {
                C8632dsu.c((Object) view, "");
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(View view) {
                b(view);
                return dpR.c;
            }
        } : drm, (i7 & 8) != 0 ? null : drm2, (i7 & 16) != 0 ? C9834xU.g.s : i2, (i7 & 32) != 0 ? C9834xU.g.L : i3, (i7 & 64) != 0 ? C9834xU.g.u : i4, (i7 & 128) != 0 ? C9834xU.g.r : i5, (i7 & JSONzip.end) != 0 ? 0 : i6, (i7 & 512) != 0 ? false : z, (i7 & 1024) != 0 ? true : z2, (i7 & 2048) != 0 ? true : z3, (i7 & 4096) != 0 ? false : z4, (i7 & 8192) != 0 ? false : z5);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TH(Context context, int i, drM<? super View, dpR> drm, drM<? super View, dpR> drm2, int i2, int i3, int i4, int i5, final int i6, boolean z, boolean z2, boolean z3, final boolean z4, boolean z5) {
        super(context);
        Map d;
        Map k;
        Throwable th;
        C8632dsu.c((Object) context, "");
        C8632dsu.c((Object) drm, "");
        ValueAnimator valueAnimator = new ValueAnimator();
        this.animator = valueAnimator;
        this.animatorListener = new a(z3, drm, drm2);
        this.compositeDisposable = new CompositeDisposable();
        View.inflate(context, i, this);
        View findViewById = findViewById(i2);
        C8632dsu.a(findViewById, "");
        this.dim = findViewById;
        View findViewById2 = findViewById(i3);
        C8632dsu.a(findViewById2, "");
        ViewGroup viewGroup = (ViewGroup) findViewById2;
        this.sheet = viewGroup;
        this.header = findViewById(i4);
        this.footer = findViewById(i5);
        this.animatorUpdateListener = new ValueAnimator.AnimatorUpdateListener() { // from class: o.TK
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                TH._init_$lambda$1(TH.this, z4, valueAnimator2);
            }
        };
        setFitsSystemWindows(true);
        setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: o.TJ
            @Override // android.view.View.OnApplyWindowInsetsListener
            public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                WindowInsets _init_$lambda$4;
                _init_$lambda$4 = TH._init_$lambda$4(TH.this, view, windowInsets);
                return _init_$lambda$4;
            }
        });
        if (z2) {
            setOnClickListener(new View.OnClickListener() { // from class: o.TI
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    TH._init_$lambda$5(TH.this, view);
                }
            });
        }
        if (z) {
            if (viewGroup.getLayoutParams() instanceof CoordinatorLayout.LayoutParams) {
                this.swipeToDismissBehavior = new NetflixSwipeToDismissBehavior();
            } else {
                InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
                d = dqE.d();
                k = dqE.k(d);
                C1596aHd c1596aHd = new C1596aHd("Swipe to dismiss requires CoordinatorLayout", null, null, true, k, false, false, 96, null);
                ErrorType errorType = c1596aHd.a;
                if (errorType != null) {
                    c1596aHd.e.put("errorType", errorType.c());
                    String b = c1596aHd.b();
                    if (b != null) {
                        String c2 = errorType.c();
                        c1596aHd.a(c2 + " " + b);
                    }
                }
                if (c1596aHd.b() != null && c1596aHd.i != null) {
                    th = new Throwable(c1596aHd.b(), c1596aHd.i);
                } else if (c1596aHd.b() != null) {
                    th = new Throwable(c1596aHd.b());
                } else {
                    th = c1596aHd.i;
                    if (th == null) {
                        th = new Throwable("Handled exception with no message");
                    } else if (th == null) {
                        throw new IllegalArgumentException("Required value was null.".toString());
                    }
                }
                InterfaceC1601aHi.d dVar = InterfaceC1601aHi.c;
                InterfaceC1598aHf a2 = dVar.a();
                if (a2 != null) {
                    a2.e(c1596aHd, th);
                } else {
                    dVar.e().b(c1596aHd, th);
                }
            }
        }
        valueAnimator.setDuration(300L);
        valueAnimator.setInterpolator(new AccelerateDecelerateInterpolator());
        valueAnimator.setFloatValues(CLOSED_VALUE);
        if (i6 > 0) {
            viewGroup.setClipToOutline(true);
            viewGroup.setOutlineProvider(new ViewOutlineProvider() { // from class: o.TH.3
                @Override // android.view.ViewOutlineProvider
                public void getOutline(View view, Outline outline) {
                    C8632dsu.c((Object) view, "");
                    C8632dsu.c((Object) outline, "");
                    int measuredWidth = view.getMeasuredWidth();
                    int measuredHeight = view.getMeasuredHeight();
                    int i7 = i6;
                    outline.setRoundRect(0, 0, measuredWidth, measuredHeight + i7, i7);
                }
            });
        }
        this.closeSheetWhenClickEmptyArea = z5;
        this.gestureDetector = new GestureDetector(context, new e());
    }

    /* loaded from: classes3.dex */
    public static final class c extends C1045Mp {
        public /* synthetic */ c(C8627dsp c8627dsp) {
            this();
        }

        private c() {
            super("NetflixSheet");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isClosed() {
        Object animatedValue = this.animator.getAnimatedValue();
        C8632dsu.d(animatedValue);
        return C9913yu.a(((Float) animatedValue).floatValue(), CLOSED_VALUE);
    }

    /* loaded from: classes3.dex */
    public static final class a extends AnimatorListenerAdapter {
        final /* synthetic */ drM<View, dpR> b;
        final /* synthetic */ drM<View, dpR> c;
        final /* synthetic */ boolean e;

        /* JADX WARN: Multi-variable type inference failed */
        a(boolean z, drM<? super View, dpR> drm, drM<? super View, dpR> drm2) {
            this.e = z;
            this.c = drm;
            this.b = drm2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            C8632dsu.c((Object) animator, "");
            TH th = TH.this;
            ViewParent parent = th.getParent();
            if (parent != null) {
                if (!TH.this.isClosed()) {
                    if (TH.this.isOpen()) {
                        TH.this.sheetOpen();
                        drM<View, dpR> drm = this.b;
                        if (drm != null) {
                            drm.invoke(th);
                        }
                        TH.this.sendAccessibilityEvent(32);
                        return;
                    }
                    return;
                }
                TH.this.sheetDismissed();
                if (this.e) {
                    ((ViewGroup) parent).removeView(th);
                }
                this.c.invoke(th);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isOpen() {
        return !isClosed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$1(TH th, boolean z, ValueAnimator valueAnimator) {
        C8632dsu.c((Object) th, "");
        C8632dsu.c((Object) valueAnimator, "");
        int measuredHeight = th.sheet.getMeasuredHeight();
        Object animatedValue = th.animator.getAnimatedValue();
        C8632dsu.d(animatedValue);
        float floatValue = ((Float) animatedValue).floatValue();
        float f = (1 - floatValue) * measuredHeight;
        th.sheet.setTranslationY(f);
        View view = th.header;
        if (view != null) {
            view.setTranslationY(f);
        }
        View view2 = th.footer;
        if (view2 != null) {
            view2.setTranslationY(f);
        }
        Drawable background = th.dim.getBackground();
        if (background != null) {
            background.setAlpha((int) (((float) PrivateKeyType.INVALID) * floatValue));
            th.dim.invalidate();
        }
        if (z) {
            th.sheet.setAlpha(floatValue);
        }
        th.requestLayout();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WindowInsets _init_$lambda$4(TH th, View view, WindowInsets windowInsets) {
        C8632dsu.c((Object) th, "");
        C8632dsu.c((Object) view, "");
        C8632dsu.c((Object) windowInsets, "");
        View view2 = th.footer;
        if (view2 != null) {
            int systemWindowInsetBottom = windowInsets.getSystemWindowInsetBottom();
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
            if (marginLayoutParams != null) {
                marginLayoutParams.leftMargin = marginLayoutParams.leftMargin;
                marginLayoutParams.topMargin = marginLayoutParams.topMargin;
                marginLayoutParams.rightMargin = marginLayoutParams.rightMargin;
                marginLayoutParams.bottomMargin = systemWindowInsetBottom;
                marginLayoutParams.setMarginStart(C9687vB.c(marginLayoutParams));
                marginLayoutParams.setMarginEnd(C9687vB.b(marginLayoutParams));
                view2.requestLayout();
            }
            ViewParent parent = view2.getParent();
            if (parent != null) {
                parent.requestLayout();
            }
        }
        View view3 = th.dim;
        view3.setPadding(view3.getPaddingLeft(), windowInsets.getSystemWindowInsetTop(), view3.getPaddingRight(), view3.getPaddingBottom());
        ViewGroup viewGroup = th.sheet;
        viewGroup.setPadding(viewGroup.getPaddingLeft(), viewGroup.getPaddingTop(), viewGroup.getPaddingRight(), windowInsets.getSystemWindowInsetBottom());
        NetflixSwipeToDismissBehavior netflixSwipeToDismissBehavior = th.swipeToDismissBehavior;
        if (netflixSwipeToDismissBehavior != null) {
            netflixSwipeToDismissBehavior.setState(3);
        }
        return windowInsets;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$5(TH th, View view) {
        C8632dsu.c((Object) th, "");
        th.close();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        NetflixSwipeToDismissBehavior netflixSwipeToDismissBehavior;
        super.onAttachedToWindow();
        this.animator.addUpdateListener(this.animatorUpdateListener);
        this.animator.addListener(this.animatorListener);
        if (!(this.sheet.getLayoutParams() instanceof CoordinatorLayout.LayoutParams) || (netflixSwipeToDismissBehavior = this.swipeToDismissBehavior) == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = this.sheet.getLayoutParams();
        C8632dsu.d(layoutParams);
        netflixSwipeToDismissBehavior.a((CoordinatorLayout.LayoutParams) layoutParams);
        Observable<Integer> a2 = netflixSwipeToDismissBehavior.a();
        final drM<Integer, dpR> drm = new drM<Integer, dpR>() { // from class: com.netflix.mediaclient.android.widget.sheet.NetflixSheet$onAttachedToWindow$1$1
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(Integer num) {
                d(num);
                return dpR.c;
            }

            public final void d(Integer num) {
                if (num != null && num.intValue() == 4) {
                    TH.this.close();
                }
            }
        };
        this.compositeDisposable.add(a2.subscribe(new Consumer() { // from class: o.TP
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                TH.onAttachedToWindow$lambda$8$lambda$6(drM.this, obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onAttachedToWindow$lambda$8$lambda$6(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        drm.invoke(obj);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.animator.removeAllUpdateListeners();
        this.animator.removeAllListeners();
        NetflixSwipeToDismissBehavior netflixSwipeToDismissBehavior = this.swipeToDismissBehavior;
        if (netflixSwipeToDismissBehavior != null) {
            netflixSwipeToDismissBehavior.c();
        }
        this.compositeDisposable.clear();
    }

    /* loaded from: classes3.dex */
    public static final class e extends GestureDetector.SimpleOnGestureListener {
        private final Rect c = new Rect();

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onDown(MotionEvent motionEvent) {
            C8632dsu.c((Object) motionEvent, "");
            return true;
        }

        e() {
        }

        private final boolean e(MotionEvent motionEvent) {
            TH.this.getSheet().getHitRect(this.c);
            return this.c.contains((int) motionEvent.getX(), (int) motionEvent.getY());
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onSingleTapUp(MotionEvent motionEvent) {
            C8632dsu.c((Object) motionEvent, "");
            if (e(motionEvent)) {
                return true;
            }
            TH.this.performClick();
            return true;
        }
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent motionEvent) {
        C8632dsu.c((Object) motionEvent, "");
        if (this.closeSheetWhenClickEmptyArea) {
            if (AccessibilityUtils.a(getContext()) || motionEvent.getAction() != 0) {
                return this.gestureDetector.onTouchEvent(motionEvent);
            }
            closeDialogOnEmptyAreaTouchEvent();
            return false;
        }
        return this.gestureDetector.onTouchEvent(motionEvent);
    }

    private final void closeDialogOnEmptyAreaTouchEvent() {
        close();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int i3;
        View view = this.header;
        if (view != null) {
            measureChild(view, i, i2);
            if (view.getMeasuredHeight() > 0) {
                int measuredHeight = view.getMeasuredHeight();
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
                int i4 = marginLayoutParams != null ? marginLayoutParams.bottomMargin : 0;
                ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
                i3 = measuredHeight + i4 + (marginLayoutParams2 != null ? marginLayoutParams2.topMargin : 0);
            } else {
                i3 = 0;
            }
            if (i3 != this.sheet.getPaddingTop()) {
                ViewGroup viewGroup = this.sheet;
                viewGroup.setPadding(viewGroup.getPaddingLeft(), i3, viewGroup.getPaddingRight(), viewGroup.getPaddingBottom());
            }
        }
        View view2 = this.footer;
        if (view2 != null) {
            measureChild(view2, i, i2);
            if (view2.getMeasuredHeight() > 0) {
                int measuredHeight2 = view2.getMeasuredHeight();
                ViewGroup.LayoutParams layoutParams3 = view2.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams3 = layoutParams3 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams3 : null;
                int i5 = marginLayoutParams3 != null ? marginLayoutParams3.bottomMargin : 0;
                ViewGroup.LayoutParams layoutParams4 = view2.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams4 = layoutParams4 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams4 : null;
                r2 = (marginLayoutParams4 != null ? marginLayoutParams4.topMargin : 0) + measuredHeight2 + i5;
            }
            if (r2 != this.sheet.getPaddingBottom()) {
                ViewGroup viewGroup2 = this.sheet;
                viewGroup2.setPadding(viewGroup2.getPaddingLeft(), viewGroup2.getPaddingTop(), viewGroup2.getPaddingRight(), r2);
            }
        }
        super.onMeasure(i, i2);
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (isOpen()) {
            super.onLayout(z, i, i2, i3, i4);
            NetflixSwipeToDismissBehavior netflixSwipeToDismissBehavior = this.swipeToDismissBehavior;
            if (netflixSwipeToDismissBehavior == null || netflixSwipeToDismissBehavior.getState() != 3) {
                return;
            }
            requestApplyInsets();
        }
    }

    public final void open() {
        if (this.animator.isRunning()) {
            this.animator.cancel();
        }
        onStartOpen();
        ValueAnimator valueAnimator = this.animator;
        Object animatedValue = valueAnimator.getAnimatedValue();
        C8632dsu.d(animatedValue);
        valueAnimator.setFloatValues(((Float) animatedValue).floatValue(), OPEN_VALUE);
        this.animator.start();
    }

    public final void close() {
        if (this.animator.isRunning()) {
            this.animator.cancel();
        }
        onStartClose();
        ValueAnimator valueAnimator = this.animator;
        Object animatedValue = valueAnimator.getAnimatedValue();
        C8632dsu.d(animatedValue);
        valueAnimator.setFloatValues(((Float) animatedValue).floatValue(), CLOSED_VALUE);
        this.animator.start();
    }
}
