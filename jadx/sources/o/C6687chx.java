package o;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewPropertyAnimator;
import android.view.ViewTreeObserver;
import android.view.WindowInsets;
import androidx.core.content.ContextCompat;
import androidx.core.content.res.ResourcesCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.netflix.mediaclient.ui.messaging.api.MessagingTooltipScreen;
import java.util.Map;
import kotlin.Pair;
import o.C1619aI;
import o.C6687chx;
import o.C8632dsu;
import o.C9763wY;
import o.C9834xU;
import o.C9851xl;
import o.InterfaceC6682chs;
import o.dpR;
import o.drO;

/* renamed from: o.chx  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6687chx implements InterfaceC6682chs {
    private final ViewTreeObserver.OnGlobalLayoutListener A;
    private boolean B;
    private final InterfaceC8612dsa<ViewGroup, Integer, Integer, dpR> C;
    private boolean D;
    private final RecyclerView E;
    private final RectF F;
    private int G;
    private final drO<dpR> H;
    private final int[] I;

    /* renamed from: J  reason: collision with root package name */
    private boolean f13728J;
    private final RectF K;
    private final int L;
    private final int[] M;
    private final boolean N;
    private final ViewGroup O;
    private final int P;
    private MessagingTooltipScreen.ScreenType Q;
    private final int R;
    private final int S;
    private WindowInsets T;
    private View a;
    private final MessagingTooltipScreen.a b;
    private ViewPropertyAnimator c;
    private final ViewGroup f;
    private final Integer g;
    private AbstractC9847xh h;
    private final int i;
    private final Rect j;
    private final RectF k;
    private int l;
    private int m;
    private int n;

    /* renamed from: o  reason: collision with root package name */
    private int f13729o;
    private int p;
    private final View q;
    private int r;
    private int s;
    private int t;
    private final C1619aI u;
    private final drO<dpR> v;
    private final boolean w;
    private final GestureDetector x;
    private final MessagingTooltipScreen.Tooltip_Location y;
    private boolean z;
    public static final c e = new c(null);
    public static final int d = 8;

    /* renamed from: o.chx$d */
    /* loaded from: classes4.dex */
    public final /* synthetic */ class d {
        public static final /* synthetic */ int[] c;
        public static final /* synthetic */ int[] d;

        static {
            int[] iArr = new int[MessagingTooltipScreen.ScreenType.values().length];
            try {
                iArr[MessagingTooltipScreen.ScreenType.b.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MessagingTooltipScreen.ScreenType.e.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[MessagingTooltipScreen.ScreenType.a.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            d = iArr;
            int[] iArr2 = new int[MessagingTooltipScreen.Tooltip_Location.values().length];
            try {
                iArr2[MessagingTooltipScreen.Tooltip_Location.b.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[MessagingTooltipScreen.Tooltip_Location.e.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[MessagingTooltipScreen.Tooltip_Location.a.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            c = iArr2;
        }
    }

    @Override // o.InterfaceC6682chs
    public View d() {
        return this.a;
    }

    @Override // o.InterfaceC6682chs
    public WindowInsets d(WindowInsets windowInsets) {
        C8632dsu.c((Object) windowInsets, "");
        this.T = windowInsets;
        this.D = true;
        return windowInsets;
    }

    public void d(View view) {
        this.a = view;
    }

    @Override // o.InterfaceC6682chs
    public ViewGroup e() {
        return this.O;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C6687chx(Context context, ViewGroup viewGroup, View view, drO<dpR> dro, drO<dpR> dro2, int i, boolean z, boolean z2, int i2, MessagingTooltipScreen.Tooltip_Location tooltip_Location, int i3, boolean z3, MessagingTooltipScreen.ScreenType screenType, View view2, boolean z4, Integer num, C1619aI c1619aI, ViewGroup viewGroup2, RecyclerView recyclerView, MessagingTooltipScreen.a aVar, InterfaceC8612dsa<? super ViewGroup, ? super Integer, ? super Integer, dpR> interfaceC8612dsa) {
        C8632dsu.c((Object) context, "");
        C8632dsu.c((Object) viewGroup, "");
        C8632dsu.c((Object) dro, "");
        C8632dsu.c((Object) tooltip_Location, "");
        C8632dsu.c((Object) screenType, "");
        C8632dsu.c((Object) c1619aI, "");
        C8632dsu.c((Object) viewGroup2, "");
        C8632dsu.c((Object) recyclerView, "");
        C8632dsu.c((Object) aVar, "");
        C8632dsu.c((Object) interfaceC8612dsa, "");
        this.O = viewGroup;
        this.a = view;
        this.v = dro;
        this.H = dro2;
        this.i = i;
        this.f13728J = z;
        this.B = z2;
        this.L = i2;
        this.y = tooltip_Location;
        this.P = i3;
        this.w = z3;
        this.Q = screenType;
        this.q = view2;
        this.N = z4;
        this.g = num;
        this.u = c1619aI;
        this.f = viewGroup2;
        this.E = recyclerView;
        this.b = aVar;
        this.C = interfaceC8612dsa;
        this.G = ContextCompat.getColor(context, i);
        this.S = s().getDimensionPixelSize(i3);
        this.K = new RectF();
        this.F = new RectF();
        this.k = new RectF();
        this.M = new int[2];
        this.I = new int[2];
        this.j = new Rect();
        this.R = s().getDimensionPixelSize(C9834xU.a.ag);
        this.A = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: o.chz
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                C6687chx.n(C6687chx.this);
            }
        };
        this.x = new GestureDetector(context, new b());
    }

    /* renamed from: o.chx$c */
    /* loaded from: classes4.dex */
    public static final class c extends C1045Mp {
        public /* synthetic */ c(C8627dsp c8627dsp) {
            this();
        }

        private c() {
            super("MessagingTooltipLayout");
        }
    }

    private final Context h() {
        return e().getContext();
    }

    private final Resources s() {
        return e().getResources();
    }

    private final ViewParent o() {
        return e().getParent();
    }

    private final int n() {
        return e().getLayoutDirection();
    }

    private final int m() {
        return e().getMeasuredHeight();
    }

    private final int k() {
        return e().getMeasuredWidth();
    }

    private final void y() {
        e().requestLayout();
    }

    private final void x() {
        e().requestApplyInsets();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean v() {
        return e().requestFocus();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean p() {
        return e().performClick();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n(C6687chx c6687chx) {
        C8632dsu.c((Object) c6687chx, "");
        View d2 = c6687chx.d();
        if (d2 == null || !d2.isAttachedToWindow()) {
            InterfaceC6682chs.c.e(c6687chx, null, 1, null);
        } else if (c6687chx.q()) {
            c6687chx.y();
        }
    }

    private final int g() {
        return l() ? this.m : this.l;
    }

    private final int j() {
        return l() ? this.l : this.m;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ViewGroup r() {
        ViewParent o2 = o();
        if (o2 instanceof ViewGroup) {
            return (ViewGroup) o2;
        }
        return null;
    }

    private final boolean l() {
        return n() == 0;
    }

    @Override // o.InterfaceC6682chs
    public void b() {
        ViewGroup e2 = e();
        e2.setOnClickListener(new View.OnClickListener() { // from class: o.chv
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C6687chx.c(C6687chx.this, view);
            }
        });
        e2.setClickable(true);
        this.u.d(this.E);
        this.j.right = s().getDimensionPixelSize(C9834xU.a.Z);
        w();
        int i = d.d[this.Q.ordinal()];
        if (i != 1) {
            if (i != 2) {
                return;
            }
            AbstractC9847xh f = f();
            this.h = f;
            this.f.setBackground(f);
            this.f.setOutlineProvider(new C9848xi(this.S, this.j));
            return;
        }
        AbstractC9847xh f2 = f();
        this.h = f2;
        this.f.setBackground(f2);
        int dimensionPixelSize = s().getDimensionPixelSize(this.L);
        this.m = dimensionPixelSize;
        this.l = dimensionPixelSize;
        this.f.setOutlineProvider(new C9848xi(this.S, this.j));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(C6687chx c6687chx, View view) {
        C8632dsu.c((Object) c6687chx, "");
        drO<dpR> dro = c6687chx.H;
        if (dro != null) {
            dro.invoke();
        }
        InterfaceC6682chs.c.e(c6687chx, null, 1, null);
    }

    @Override // o.InterfaceC6682chs
    public void c(View view, boolean z, boolean z2) {
        if (C8632dsu.c(view, d())) {
            return;
        }
        if (view == null) {
            view = this.q;
        }
        d(view);
        this.f13728J = z;
        this.B = z2;
        if (this.Q == MessagingTooltipScreen.ScreenType.a) {
            x();
        }
    }

    @Override // o.InterfaceC6682chs
    public boolean a() {
        C9851xl.b bVar = C9851xl.d;
        Context h = h();
        C8632dsu.a(h, "");
        if (bVar.d(h)) {
            return false;
        }
        ViewPropertyAnimator viewPropertyAnimator = this.c;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
        x();
        this.c = this.b.e(r(), e(), this.f, c(), new drO<dpR>() { // from class: com.netflix.mediaclient.ui.messaging.impl.MessagingTooltipViewGroupManagerImpl$show$1
            {
                super(0);
            }

            @Override // o.drO
            public /* synthetic */ dpR invoke() {
                c();
                return dpR.c;
            }

            public final void c() {
                C6687chx.this.c = null;
                C6687chx.this.v();
            }
        });
        this.f.setVisibility(0);
        return true;
    }

    @Override // o.InterfaceC6682chs
    public void b(final drO<dpR> dro) {
        ViewTreeObserver viewTreeObserver;
        C8632dsu.c((Object) dro, "");
        ViewGroup r = r();
        if (r != null && (viewTreeObserver = r.getViewTreeObserver()) != null) {
            viewTreeObserver.removeOnGlobalLayoutListener(this.A);
            this.z = false;
        }
        ViewPropertyAnimator viewPropertyAnimator = this.c;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
        this.c = this.b.d(r(), e(), this.f, c(), new drO<dpR>() { // from class: com.netflix.mediaclient.ui.messaging.impl.MessagingTooltipViewGroupManagerImpl$dismiss$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // o.drO
            public /* synthetic */ dpR invoke() {
                d();
                return dpR.c;
            }

            public final void d() {
                C1619aI c1619aI;
                ViewGroup r2;
                drO dro2;
                C6687chx.this.c = null;
                c1619aI = C6687chx.this.u;
                c1619aI.c(C6687chx.this.E);
                C6687chx.this.E.setAdapter(null);
                r2 = C6687chx.this.r();
                if (r2 != null) {
                    r2.removeView(C6687chx.this.e());
                }
                dro2 = C6687chx.this.v;
                dro2.invoke();
                dro.invoke();
            }
        });
    }

    private final void w() {
        ViewGroup r;
        ViewTreeObserver viewTreeObserver;
        e().addView(this.f);
        this.f.setVisibility(4);
        if (!this.z && (r = r()) != null && (viewTreeObserver = r.getViewTreeObserver()) != null) {
            viewTreeObserver.addOnGlobalLayoutListener(this.A);
            this.z = true;
        }
        ViewGroup viewGroup = this.f;
        this.t = viewGroup.getPaddingStart();
        this.r = viewGroup.getPaddingTop();
        this.s = viewGroup.getPaddingEnd();
        this.p = viewGroup.getPaddingBottom();
    }

    private final AbstractC9847xh f() {
        if (this.g == null) {
            return new C9763wY(C9763wY.b.d(new C9763wY.e.d(this.G)), null, 2, null);
        }
        Drawable drawable = ResourcesCompat.getDrawable(s(), this.g.intValue(), h().getTheme());
        C9763wY.e bVar = drawable != null ? new C9763wY.e.b(drawable) : C9763wY.e.c.d;
        C9763wY.d dVar = C9763wY.b;
        return new C9763wY(dVar.d(bVar), dVar.d(ContextCompat.getColor(h(), C9834xU.c.B)));
    }

    private final boolean q() {
        b(this.F);
        View d2 = d();
        return d2 == null || !d2.isAttachedToWindow() || r() == null || !C8632dsu.c(this.F, this.K);
    }

    private final boolean t() {
        return Float.compare(this.k.height(), (float) this.f.getMeasuredHeight()) != 0;
    }

    private final void b(final RectF rectF) {
        C9726vo.d(d(), r(), new drX<View, ViewGroup, dpR>() { // from class: com.netflix.mediaclient.ui.messaging.impl.MessagingTooltipViewGroupManagerImpl$readTargetBounds$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // o.drX
            public /* synthetic */ dpR invoke(View view, ViewGroup viewGroup) {
                c(view, viewGroup);
                return dpR.c;
            }

            public final void c(View view, ViewGroup viewGroup) {
                int[] iArr;
                int[] iArr2;
                int[] iArr3;
                int[] iArr4;
                int[] iArr5;
                int[] iArr6;
                int[] iArr7;
                int[] iArr8;
                int[] iArr9;
                int[] iArr10;
                C8632dsu.c((Object) view, "");
                C8632dsu.c((Object) viewGroup, "");
                iArr = C6687chx.this.M;
                view.getLocationInWindow(iArr);
                iArr2 = C6687chx.this.I;
                viewGroup.getLocationInWindow(iArr2);
                iArr3 = C6687chx.this.M;
                int i = iArr3[0];
                iArr4 = C6687chx.this.I;
                iArr3[0] = i - iArr4[0];
                iArr5 = C6687chx.this.M;
                int i2 = iArr5[1];
                iArr6 = C6687chx.this.I;
                iArr5[1] = i2 - iArr6[1];
                RectF rectF2 = rectF;
                iArr7 = C6687chx.this.M;
                rectF2.left = iArr7[0];
                RectF rectF3 = rectF;
                iArr8 = C6687chx.this.M;
                rectF3.top = iArr8[1];
                RectF rectF4 = rectF;
                iArr9 = C6687chx.this.M;
                rectF4.right = iArr9[0] + view.getMeasuredWidth();
                RectF rectF5 = rectF;
                iArr10 = C6687chx.this.M;
                rectF5.bottom = iArr10[1] + view.getMeasuredHeight();
            }
        });
    }

    private final boolean B() {
        WindowInsets windowInsets;
        WindowInsets windowInsets2;
        int i = d.c[this.y.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    float f = this.K.bottom;
                    float measuredHeight = this.f.getMeasuredHeight();
                    float f2 = this.n;
                    float height = this.j.height();
                    int m = m();
                    if (f + measuredHeight + f2 + height >= m - (this.T != null ? windowInsets.getSystemWindowInsetBottom() : 0)) {
                        return false;
                    }
                } else {
                    float f3 = this.K.bottom;
                    float measuredHeight2 = this.f.getMeasuredHeight();
                    float f4 = this.n;
                    float height2 = this.j.height();
                    int m2 = m();
                    if (f3 + measuredHeight2 + f4 + height2 >= m2 - (this.T != null ? windowInsets2.getSystemWindowInsetBottom() : 0)) {
                        return false;
                    }
                }
            }
            return true;
        }
        return false;
    }

    @Override // o.InterfaceC6682chs
    public void b(int i, int i2) {
        float measuredHeight;
        int i3;
        int height;
        View d2 = d();
        boolean isAttachedToWindow = d2 != null ? d2.isAttachedToWindow() : false;
        boolean z = q() || this.D || t();
        if (isAttachedToWindow && z) {
            if (this.f13728J) {
                this.j.bottom = s().getDimensionPixelSize(C9834xU.a.ac);
            } else {
                this.j.bottom = s().getDimensionPixelSize(C9834xU.a.am);
            }
            this.D = false;
            this.K.set(this.F);
            this.f.setPadding(this.t, this.r, this.s, this.p);
            int min = Math.min(this.R, (this.f.getMeasuredWidth() - this.m) - this.l);
            this.C.invoke(this.f, Integer.valueOf(View.MeasureSpec.makeMeasureSpec(min, 1073741824)), Integer.valueOf(i2));
            if (this.Q == MessagingTooltipScreen.ScreenType.e) {
                int measuredWidth = (e().getMeasuredWidth() - this.f.getMeasuredWidth()) / 2;
                this.m = measuredWidth;
                this.l = measuredWidth;
            }
            int measuredWidth2 = this.f.getMeasuredWidth();
            boolean B = B();
            if (B) {
                measuredHeight = this.K.bottom + this.n;
                i3 = this.r + this.j.height();
                height = this.p;
            } else {
                measuredHeight = (((this.K.top - this.f.getMeasuredHeight()) - this.j.height()) - this.n) - this.f13729o;
                i3 = this.r;
                height = this.p + this.j.height();
            }
            this.f.setPadding(this.t, i3, this.s, height);
            this.k.top = measuredHeight;
            WindowInsets windowInsets = this.T;
            float systemWindowInsetLeft = (windowInsets != null ? windowInsets.getSystemWindowInsetLeft() : 0) + g();
            float f = measuredWidth2 / 2.0f;
            if (this.K.centerX() > systemWindowInsetLeft + f) {
                int k = k();
                int j = j();
                WindowInsets windowInsets2 = this.T;
                systemWindowInsetLeft = Math.min(Math.max(0, ((k - measuredWidth2) - j) - (windowInsets2 != null ? windowInsets2.getSystemWindowInsetRight() : 0)), this.K.centerX() - f);
            }
            this.k.left = systemWindowInsetLeft;
            this.C.invoke(this.f, Integer.valueOf(View.MeasureSpec.makeMeasureSpec(min, 1073741824)), Integer.valueOf(i2));
            RectF rectF = this.k;
            rectF.bottom = rectF.top + this.f.getMeasuredHeight();
            RectF rectF2 = this.k;
            rectF2.right = rectF2.left + this.f.getMeasuredWidth();
            if (this.B) {
                e().setBackground(new ColorDrawable(ContextCompat.getColor(h(), C9834xU.c.w)));
            } else if (this.N) {
                u();
            } else {
                Drawable drawable = ContextCompat.getDrawable(h(), C9834xU.c.u);
                if (drawable != null) {
                    e().setBackground(new C9832xS(drawable, this.K, this.S));
                }
            }
            d(B);
        }
    }

    private final float i() {
        float width = this.j.width() / 2.0f;
        return this.k.left + width > this.K.centerX() ? width : this.k.right + width < this.K.centerX() ? this.k.width() - width : this.K.centerX() - this.k.left;
    }

    private final void u() {
        ViewGroup e2 = e();
        C9895yc c9895yc = new C9895yc(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{ContextCompat.getColor(h(), C9834xU.c.F), ContextCompat.getColor(h(), C9834xU.c.w)});
        c9895yc.setGradientType(1);
        c9895yc.setGradientRadius(Math.max(400.0f, Math.max(this.K.width(), this.K.height())));
        c9895yc.mutate();
        c9895yc.setGradientCenter(this.K.centerX() / k(), this.K.centerY() / m());
        dpR dpr = dpR.c;
        e2.setBackground(e(c9895yc));
    }

    private final Drawable e(Drawable drawable) {
        MessagingTooltipScreen.a aVar = this.b;
        Context h = h();
        C8632dsu.a(h, "");
        return aVar.a(drawable, h);
    }

    private final void d(boolean z) {
        MessagingTooltipScreen.ScreenType screenType = this.Q;
        if (screenType == MessagingTooltipScreen.ScreenType.b || screenType == MessagingTooltipScreen.ScreenType.e) {
            AbstractC9847xh abstractC9847xh = this.h;
            if (abstractC9847xh != null) {
                abstractC9847xh.e(z, this.k.width(), this.k.height(), i(), this.j, this.S);
            }
            this.b.a(r(), e(), this.f, c(), new drO<dpR>() { // from class: com.netflix.mediaclient.ui.messaging.impl.MessagingTooltipViewGroupManagerImpl$setupTooltipBackground$1
                {
                    super(0);
                }

                @Override // o.drO
                public /* synthetic */ dpR invoke() {
                    d();
                    return dpR.c;
                }

                public final void d() {
                    C6687chx.this.v();
                }
            });
        }
    }

    private final Map<String, Object> c() {
        Map<String, Object> b2;
        b2 = dqD.b(dpD.a("pivot", new Pair(Float.valueOf(i() / k()), Float.valueOf(B() ? 0.0f : 1.0f))));
        return b2;
    }

    /* renamed from: o.chx$b */
    /* loaded from: classes4.dex */
    public static final class b extends GestureDetector.SimpleOnGestureListener {
        private final Rect b = new Rect();

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onDown(MotionEvent motionEvent) {
            C8632dsu.c((Object) motionEvent, "");
            return true;
        }

        b() {
        }

        private final boolean b(MotionEvent motionEvent) {
            C6687chx.this.E.getGlobalVisibleRect(this.b);
            return this.b.contains((int) motionEvent.getX(), (int) motionEvent.getY());
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onSingleTapUp(MotionEvent motionEvent) {
            C8632dsu.c((Object) motionEvent, "");
            if (b(motionEvent)) {
                return true;
            }
            C6687chx.this.p();
            return true;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            C8632dsu.c((Object) motionEvent2, "");
            if (C6687chx.this.w) {
                C6687chx.this.p();
                return true;
            }
            return super.onFling(motionEvent, motionEvent2, f, f2);
        }
    }

    @Override // o.InterfaceC6682chs
    public boolean b(MotionEvent motionEvent) {
        C8632dsu.c((Object) motionEvent, "");
        return this.x.onTouchEvent(motionEvent);
    }

    @Override // o.InterfaceC6682chs
    public void c(boolean z, int i, int i2, int i3, int i4) {
        int i5 = d.d[this.Q.ordinal()];
        if (i5 == 1 || i5 == 2) {
            ViewGroup viewGroup = this.f;
            RectF rectF = this.k;
            viewGroup.layout((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        } else if (i5 != 3) {
        } else {
            ViewGroup viewGroup2 = this.f;
            int k = k();
            int m = m();
            WindowInsets windowInsets = this.T;
            viewGroup2.layout(0, 0, k, m - (windowInsets != null ? windowInsets.getSystemWindowInsetBottom() : 0));
        }
    }
}
