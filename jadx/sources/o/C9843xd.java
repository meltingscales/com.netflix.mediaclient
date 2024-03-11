package o;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewPropertyAnimator;
import android.view.ViewTreeObserver;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import o.C8632dsu;
import o.C9834xU;
import o.C9843xd;
import o.C9851xl;
import o.C9856xq;
import o.dpR;

/* renamed from: o.xd  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9843xd extends ViewGroup {
    private View A;
    private int B;
    private Integer C;
    private final RectF D;
    private final ImageView E;
    private final RectF F;
    private final int[] G;
    private final TextView H;
    private final View I;

    /* renamed from: J  reason: collision with root package name */
    private final LinearLayout f13926J;
    private final int K;
    private int M;
    private ViewPropertyAnimator a;
    private InterfaceC9757wS b;
    private final Rect c;
    private ViewGroup d;
    private PointF e;
    private int f;
    private final RectF g;
    private AbstractC9847xh h;
    private View.OnClickListener i;
    private int j;
    private int k;
    private int l;
    private int m;
    private int n;

    /* renamed from: o  reason: collision with root package name */
    private int f13927o;
    private boolean p;
    private boolean q;
    private final ViewTreeObserver.OnGlobalLayoutListener r;
    private int s;
    private WindowInsets t;
    private boolean u;
    private boolean v;
    private final TextView w;
    private InterfaceC9762wX x;
    private final int[] y;
    private final RectF z;

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(View view) {
    }

    private final boolean r() {
        return (this.q || this.C == null) ? false : true;
    }

    public final InterfaceC9762wX c() {
        return this.x;
    }

    public final InterfaceC9757wS e() {
        return this.b;
    }

    @Override // android.view.View
    public WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        C8632dsu.c((Object) windowInsets, "");
        this.t = windowInsets;
        this.p = true;
        return windowInsets;
    }

    public final void setConsumptionManager(InterfaceC9757wS interfaceC9757wS) {
        this.b = interfaceC9757wS;
    }

    public final void setContentMarginBottom(int i) {
        this.f = i;
    }

    public final void setContentMarginEnd(int i) {
        this.j = i;
    }

    public final void setContentMarginStart(int i) {
        this.l = i;
    }

    public final void setContentMarginTop(int i) {
        this.n = i;
    }

    public final void setOnTooltipLayoutChangeListener(InterfaceC9762wX interfaceC9762wX) {
        this.x = interfaceC9762wX;
    }

    public final void setTooltipMaxWidth(int i) {
        this.M = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9843xd(Context context, boolean z) {
        super(context);
        C8632dsu.c((Object) context, "");
        int dimensionPixelSize = getResources().getDimensionPixelSize(C9834xU.a.af);
        this.K = dimensionPixelSize;
        View inflate = LayoutInflater.from(context).inflate(z ? C9834xU.i.t : C9834xU.i.r, (ViewGroup) this, false);
        C8632dsu.d(inflate);
        this.d = (ViewGroup) inflate;
        this.F = new RectF();
        this.z = new RectF();
        this.g = new RectF();
        this.G = new int[2];
        this.y = new int[2];
        Rect rect = new Rect();
        this.c = rect;
        this.M = getResources().getDimensionPixelSize(C9834xU.a.ag);
        this.D = new RectF();
        this.r = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: o.xg
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                C9843xd.a(C9843xd.this);
            }
        };
        this.e = new PointF();
        rect.right = getResources().getDimensionPixelSize(C9834xU.a.Z);
        rect.bottom = getResources().getDimensionPixelSize(C9834xU.a.ac);
        n();
        this.B = ContextCompat.getColor(getContext(), C9834xU.c.y);
        this.C = Integer.valueOf(ContextCompat.getColor(getContext(), C9834xU.c.v));
        k();
        setScrimDrawable(ContextCompat.getDrawable(getContext(), C9834xU.c.u));
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(C9834xU.a.ad);
        this.l = dimensionPixelSize2;
        this.j = dimensionPixelSize2;
        this.d.setOutlineProvider(new C9848xi(dimensionPixelSize, rect));
        setFitsSystemWindows(true);
        setElevation(getResources().getDimensionPixelSize(C9834xU.a.ah));
        setOnClickListener(new View.OnClickListener() { // from class: o.xf
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C9843xd.d(C9843xd.this, view);
            }
        });
        setContentClickListener(new View.OnClickListener() { // from class: o.xk
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C9843xd.a(view);
            }
        });
        setFocusableInTouchMode(true);
        setTag(Integer.valueOf(C9834xU.g.ai));
        if (z) {
            C9896yd a = C9896yd.a(this.d);
            C8632dsu.a(a, "");
            C1204Sr c1204Sr = a.b;
            C8632dsu.a(c1204Sr, "");
            this.w = c1204Sr;
            LinearLayout linearLayout = a.a;
            C8632dsu.a(linearLayout, "");
            this.I = linearLayout;
            ImageView imageView = a.c;
            C8632dsu.a(imageView, "");
            this.E = imageView;
            C1204Sr c1204Sr2 = a.d;
            C8632dsu.a(c1204Sr2, "");
            this.H = c1204Sr2;
            LinearLayout linearLayout2 = a.e;
            C8632dsu.a(linearLayout2, "");
            this.f13926J = linearLayout2;
            return;
        }
        C9894yb c = C9894yb.c(this.d);
        C8632dsu.a(c, "");
        C1204Sr c1204Sr3 = c.a;
        C8632dsu.a(c1204Sr3, "");
        this.w = c1204Sr3;
        FrameLayout frameLayout = c.d;
        C8632dsu.a(frameLayout, "");
        this.I = frameLayout;
        ImageView imageView2 = c.b;
        C8632dsu.a(imageView2, "");
        this.E = imageView2;
        C1204Sr c1204Sr4 = c.c;
        C8632dsu.a(c1204Sr4, "");
        this.H = c1204Sr4;
        LinearLayout linearLayout3 = c.e;
        C8632dsu.a(linearLayout3, "");
        this.f13926J = linearLayout3;
    }

    public final void setBgElevation(float f) {
        this.d.setElevation(f);
    }

    public final void setTarget$widgetry_release(View view) {
        this.A = view;
        requestLayout();
    }

    private final int g() {
        return h() ? this.l : this.j;
    }

    private final int i() {
        return h() ? this.j : this.l;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C9843xd c9843xd) {
        C8632dsu.c((Object) c9843xd, "");
        View view = c9843xd.A;
        if (view == null || !view.isAttachedToWindow()) {
            c9843xd.d();
        } else if (c9843xd.o()) {
            c9843xd.requestLayout();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ViewGroup m() {
        ViewParent parent = getParent();
        if (parent instanceof ViewGroup) {
            return (ViewGroup) parent;
        }
        return null;
    }

    private final boolean h() {
        return getLayoutDirection() == 0;
    }

    public final void setContentClickListener(View.OnClickListener onClickListener) {
        this.d.setOnClickListener(onClickListener);
        this.i = onClickListener;
    }

    public final void setTitle(CharSequence charSequence) {
        this.H.setVisibility(charSequence == null ? 8 : 0);
        this.H.setText(charSequence);
    }

    public final void setTitleTextColor(int i) {
        this.H.setTextColor(i);
    }

    public final void setMessage(CharSequence charSequence) {
        this.w.setVisibility(charSequence == null ? 8 : 0);
        this.w.setText(charSequence);
    }

    public final void setCenterMessageText(boolean z) {
        if (z) {
            this.w.setGravity(17);
        }
    }

    public final void setMessageTextColor(int i) {
        this.w.setTextColor(i);
    }

    public final void setMessageTextSize(float f) {
        this.w.setTextSize(0, f);
    }

    public final void setTitleTextSize(float f) {
        this.H.setTextSize(0, f);
    }

    public final void setTitleCentered(boolean z) {
        this.H.setGravity(z ? 17 : 16);
    }

    public final void setTitleAllCaps(boolean z) {
        this.H.setAllCaps(z);
    }

    public final void setTitleBold(boolean z) {
        TextView textView = this.H;
        textView.setTypeface(textView.getTypeface(), !z ? 1 : 0);
    }

    public final Drawable b() {
        return getBackground();
    }

    public final void setScrimDrawable(Drawable drawable) {
        setBackground(drawable != null ? new C9832xS(drawable, this.F, this.K) : null);
    }

    public final void setIcon(Drawable drawable) {
        this.E.setVisibility(drawable == null ? 8 : 0);
        this.E.setImageDrawable(drawable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(C9843xd c9843xd, View view) {
        C8632dsu.c((Object) c9843xd, "");
        c9843xd.d();
    }

    private final void n() {
        addView(this.d, new FrameLayout.LayoutParams(-2, -2));
        this.k = this.d.getPaddingStart();
        this.s = this.d.getPaddingTop();
        this.f13927o = this.d.getPaddingEnd();
        this.m = this.d.getPaddingBottom();
    }

    public final void setTooltipVerticalOrientation() {
        this.f13926J.setOrientation(1);
        this.I.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        this.w.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        this.u = true;
    }

    public static /* synthetic */ void setBackgroundColors$default(C9843xd c9843xd, int i, Integer num, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = c9843xd.B;
        }
        if ((i2 & 2) != 0) {
            num = c9843xd.C;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        c9843xd.setBackgroundColors(i, num, z);
    }

    public final void setBackgroundColors(int i, Integer num, boolean z) {
        this.B = i;
        this.C = num;
        this.q = z;
        k();
    }

    private final void k() {
        AbstractC9847xh j = j();
        this.h = j;
        this.d.setBackground(j);
    }

    public final boolean a() {
        InterfaceC9757wS interfaceC9757wS;
        C9851xl.b bVar = C9851xl.d;
        Context context = getContext();
        C8632dsu.a(context, "");
        return !bVar.d(context) && ((interfaceC9757wS = this.b) == null || interfaceC9757wS.c());
    }

    public final boolean e(ViewGroup viewGroup) {
        ViewTreeObserver viewTreeObserver;
        if (!a() || viewGroup == null) {
            return false;
        }
        if (isShown()) {
            return true;
        }
        if (!this.v && this.A != null && (viewTreeObserver = viewGroup.getViewTreeObserver()) != null) {
            viewTreeObserver.addOnGlobalLayoutListener(this.r);
            this.v = true;
        }
        ViewPropertyAnimator viewPropertyAnimator = this.a;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
        ViewGroup m = m();
        if (m != null) {
            m.removeView(this);
        }
        viewGroup.addView(this, -1, -1);
        requestApplyInsets();
        setAlpha(0.0f);
        ViewPropertyAnimator duration = animate().alpha(1.0f).setDuration(viewGroup.getResources().getInteger(17694720));
        C8632dsu.a(duration, "");
        duration.setListener(new e());
        duration.start();
        this.a = duration;
        return true;
    }

    /* renamed from: o.xd$e */
    /* loaded from: classes2.dex */
    public static final class e extends AnimatorListenerAdapter {
        e() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            C8632dsu.c((Object) animator, "");
            C9843xd.this.a = null;
            InterfaceC9762wX c = C9843xd.this.c();
            if (c != null) {
                c.e(C9843xd.this);
            }
            InterfaceC9757wS e = C9843xd.this.e();
            if (e != null) {
                e.e(C9843xd.this);
            }
            C9843xd.this.requestFocus();
        }
    }

    public final void d() {
        ViewGroup m;
        ViewTreeObserver viewTreeObserver;
        if (isShown()) {
            if (this.A != null && (m = m()) != null && (viewTreeObserver = m.getViewTreeObserver()) != null) {
                viewTreeObserver.removeOnGlobalLayoutListener(this.r);
                this.v = false;
            }
            ViewPropertyAnimator viewPropertyAnimator = this.a;
            if (viewPropertyAnimator != null) {
                viewPropertyAnimator.cancel();
            }
            ViewPropertyAnimator duration = animate().alpha(0.0f).setDuration(getResources().getInteger(17694720));
            C8632dsu.a(duration, "");
            duration.setListener(new d());
            duration.start();
            this.a = duration;
        }
    }

    /* renamed from: o.xd$d */
    /* loaded from: classes2.dex */
    public static final class d extends AnimatorListenerAdapter {
        d() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            C8632dsu.c((Object) animator, "");
            ViewGroup m = C9843xd.this.m();
            if (m != null) {
                m.removeView(C9843xd.this);
            }
            InterfaceC9762wX c = C9843xd.this.c();
            if (c != null) {
                c.d(C9843xd.this);
            }
            InterfaceC9757wS e = C9843xd.this.e();
            if (e != null) {
                e.d(C9843xd.this);
            }
        }
    }

    private final boolean o() {
        c(this.z);
        View view = this.A;
        return view == null || !view.isAttachedToWindow() || m() == null || !this.z.equals(this.F);
    }

    private final void c(final RectF rectF) {
        C9726vo.d(this.A, m(), new drX<View, ViewGroup, dpR>() { // from class: com.netflix.android.tooltips.Tooltip$readTargetBounds$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // o.drX
            public /* synthetic */ dpR invoke(View view, ViewGroup viewGroup) {
                b(view, viewGroup);
                return dpR.c;
            }

            public final void b(View view, ViewGroup viewGroup) {
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
                iArr = C9843xd.this.G;
                view.getLocationInWindow(iArr);
                iArr2 = C9843xd.this.y;
                viewGroup.getLocationInWindow(iArr2);
                iArr3 = C9843xd.this.G;
                int i = iArr3[0];
                iArr4 = C9843xd.this.y;
                iArr3[0] = i - iArr4[0];
                iArr5 = C9843xd.this.G;
                int i2 = iArr5[1];
                iArr6 = C9843xd.this.y;
                iArr5[1] = i2 - iArr6[1];
                RectF rectF2 = rectF;
                iArr7 = C9843xd.this.G;
                rectF2.left = iArr7[0];
                RectF rectF3 = rectF;
                iArr8 = C9843xd.this.G;
                rectF3.top = iArr8[1];
                RectF rectF4 = rectF;
                iArr9 = C9843xd.this.G;
                rectF4.right = iArr9[0] + view.getMeasuredWidth();
                RectF rectF5 = rectF;
                iArr10 = C9843xd.this.G;
                rectF5.bottom = iArr10[1] + view.getMeasuredHeight();
            }
        });
    }

    private final boolean l() {
        float f = this.F.bottom;
        float measuredHeight = this.d.getMeasuredHeight();
        float f2 = this.n;
        float height = this.c.height();
        int measuredHeight2 = getMeasuredHeight();
        WindowInsets windowInsets = this.t;
        return ((f + measuredHeight) + f2) + height < ((float) (measuredHeight2 - (windowInsets != null ? windowInsets.getSystemWindowInsetBottom() : 0)));
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        float measuredHeight;
        int i3;
        int height;
        super.onMeasure(i, i2);
        View view = this.A;
        if (view == null || !view.isAttachedToWindow()) {
            return;
        }
        if (o() || this.p) {
            this.p = false;
            this.F.set(this.z);
            this.d.setPadding(this.k, this.s, this.f13927o, this.m);
            int min = Math.min(this.M, (getMeasuredWidth() - this.l) - this.j);
            measureChild(this.d, View.MeasureSpec.makeMeasureSpec(min, 1073741824), i2);
            int measuredWidth = this.d.getMeasuredWidth();
            boolean l = l();
            if (l) {
                measuredHeight = this.F.bottom + this.n;
                i3 = this.s + this.c.height();
                height = this.m;
            } else {
                measuredHeight = (((this.F.top - this.d.getMeasuredHeight()) - this.c.height()) - this.n) - this.f;
                i3 = this.s;
                height = this.m + this.c.height();
            }
            this.d.setPadding(this.k, i3, this.f13927o, height);
            this.g.top = measuredHeight;
            WindowInsets windowInsets = this.t;
            float systemWindowInsetLeft = (windowInsets != null ? windowInsets.getSystemWindowInsetLeft() : 0) + g();
            float f = measuredWidth / 2.0f;
            if (this.F.centerX() > f + systemWindowInsetLeft) {
                int measuredWidth2 = getMeasuredWidth();
                int i4 = i();
                WindowInsets windowInsets2 = this.t;
                systemWindowInsetLeft = Math.min(Math.max(0, ((measuredWidth2 - measuredWidth) - i4) - (windowInsets2 != null ? windowInsets2.getSystemWindowInsetRight() : 0)), this.F.centerX() - f);
            }
            this.g.left = systemWindowInsetLeft;
            measureChild(this.d, View.MeasureSpec.makeMeasureSpec(min, 1073741824), i2);
            RectF rectF = this.g;
            rectF.bottom = rectF.top + this.d.getMeasuredHeight();
            RectF rectF2 = this.g;
            rectF2.right = rectF2.left + this.d.getMeasuredWidth();
            e(l);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        ViewGroup viewGroup = this.d;
        RectF rectF = this.g;
        viewGroup.layout((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
    }

    private final float f() {
        float width = this.c.width() / 2.0f;
        return this.g.left + width > this.F.centerX() ? width : this.g.right + width < this.F.centerX() ? this.g.width() - width : this.F.centerX() - this.g.left;
    }

    private final float d(float f) {
        float a;
        float width = f - (this.c.width() / 2.0f);
        float width2 = (this.c.width() / 2.0f) + f;
        if (h()) {
            a = a(width, width2, this.D.right);
        } else {
            a = a(width, width2, this.D.left);
        }
        return f + a;
    }

    private final float a(float f, float f2, float f3) {
        float f4 = 1;
        if (f3 > f2 - f4 || f4 + f > f3) {
            return 0.0f;
        }
        float f5 = f3 - f;
        return f5 > ((float) this.c.width()) / 2.0f ? -(f2 - f3) : f5;
    }

    private final void e(boolean z) {
        float f = f();
        if (r()) {
            if (this.u) {
                this.D.left = h() ? 0.0f : this.g.width();
                RectF rectF = this.D;
                rectF.top = 0.0f;
                rectF.right = h() ? this.g.width() : 0.0f;
                this.D.bottom = this.I.getMeasuredHeight() + this.c.height();
            } else {
                this.D.left = h() ? 0.0f : this.g.width() - this.I.getMeasuredWidth();
                RectF rectF2 = this.D;
                rectF2.top = 0.0f;
                rectF2.right = h() ? this.I.getMeasuredWidth() : this.g.width();
                this.D.bottom = this.g.height();
            }
            f = d(f);
        } else if (this.q) {
            float width = this.g.width();
            int i = this.B;
            Integer num = this.C;
            C8632dsu.d(num);
            LinearGradient linearGradient = new LinearGradient(0.0f, this.g.height() - this.c.height(), width, 0.0f, i, num.intValue(), Shader.TileMode.MIRROR);
            AbstractC9847xh abstractC9847xh = this.h;
            C9840xa c9840xa = abstractC9847xh instanceof C9840xa ? (C9840xa) abstractC9847xh : null;
            Paint d2 = c9840xa != null ? c9840xa.d() : null;
            if (d2 != null) {
                d2.setShader(linearGradient);
            }
        }
        float f2 = f;
        AbstractC9847xh abstractC9847xh2 = this.h;
        if (abstractC9847xh2 != null) {
            AbstractC9847xh.c(abstractC9847xh2, z, this.g.width(), this.g.height(), f2, this.c, 0, 32, null);
        }
    }

    private final AbstractC9847xh j() {
        if (this.q) {
            if (this.C == null) {
                throw new IllegalStateException("Attempting to create gradient without secondary color");
            }
            return new C9840xa(C9840xa.c.a(this.K));
        } else if (r()) {
            C9856xq.a aVar = C9856xq.b;
            int i = this.B;
            Integer num = this.C;
            C8632dsu.d(num);
            return aVar.c(i, num.intValue(), this.K, this.D);
        } else {
            Paint a = C9840xa.c.a(this.K);
            a.setColor(this.B);
            return new C9840xa(a);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        C8632dsu.c((Object) keyEvent, "");
        if (keyEvent.getKeyCode() == 4 && isShown() && this.a == null) {
            if (keyEvent.getAction() == 1) {
                d();
                return true;
            }
            return true;
        }
        return super.dispatchKeyEventPreIme(keyEvent);
    }

    public final void setMessagePadding(int i, int i2, int i3, int i4) {
        this.w.setPaddingRelative(i, i2, i3, i4);
    }

    public final void setTitlePadding(int i, int i2, int i3, int i4) {
        this.H.setPaddingRelative(i, i2, i3, i4);
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent != null && motionEvent.getAction() == 1) {
            this.e.set(motionEvent.getX(), motionEvent.getY());
        } else if (motionEvent != null && motionEvent.getAction() == 0) {
            d();
            return b() != null;
        }
        return super.onTouchEvent(motionEvent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(InterfaceC9841xb interfaceC9841xb, C9843xd c9843xd, View view) {
        C8632dsu.c((Object) interfaceC9841xb, "");
        C8632dsu.c((Object) c9843xd, "");
        interfaceC9841xb.c(c9843xd);
    }

    public final void setOnTooltipClickListener(final InterfaceC9841xb interfaceC9841xb) {
        C8632dsu.c((Object) interfaceC9841xb, "");
        setContentClickListener(new View.OnClickListener() { // from class: o.xe
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C9843xd.c(InterfaceC9841xb.this, this, view);
            }
        });
        setOnClickListener(new View.OnClickListener() { // from class: o.xc
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C9843xd.c(C9843xd.this, interfaceC9841xb, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(C9843xd c9843xd, InterfaceC9841xb interfaceC9841xb, View view) {
        C8632dsu.c((Object) c9843xd, "");
        C8632dsu.c((Object) interfaceC9841xb, "");
        RectF rectF = c9843xd.F;
        PointF pointF = c9843xd.e;
        if (rectF.contains(pointF.x, pointF.y)) {
            interfaceC9841xb.a(c9843xd);
        } else {
            interfaceC9841xb.e(c9843xd);
        }
    }
}
