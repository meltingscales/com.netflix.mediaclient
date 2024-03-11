package o;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Base64;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.ViewPropertyAnimatorListenerAdapter;
import androidx.core.view.WindowInsetsCompat;
import androidx.interpolator.view.animation.FastOutSlowInInterpolator;
import com.google.android.material.behavior.SwipeDismissBehavior;
import java.nio.charset.StandardCharsets;
import o.C9830xQ;
import o.C9834xU;

@SuppressLint({"PrivateResource"})
/* renamed from: o.xT  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C9833xT {
    private static final int[] a;
    static final Interpolator c;
    static final Handler e;
    private static byte e$ss2$3014 = 0;
    private static int k = 0;
    private static int n = 1;
    protected int d;
    private int f;
    private final AccessibilityManager g;
    private final Context h;
    private b i;
    private final ViewGroup m;

    /* renamed from: o  reason: collision with root package name */
    private a f13909o;
    private int j = -1;
    private boolean l = true;
    final C9830xQ.e b = new C9830xQ.e() { // from class: o.xT.2
        @Override // o.C9830xQ.e
        public void e(boolean z) {
            Handler handler = C9833xT.e;
            handler.sendMessage(handler.obtainMessage(z ? 0 : 2, C9833xT.this));
        }

        @Override // o.C9830xQ.e
        public void a(int i) {
            Handler handler = C9833xT.e;
            handler.sendMessage(handler.obtainMessage(1, i, 0, C9833xT.this));
        }
    };

    /* renamed from: o.xT$b */
    /* loaded from: classes2.dex */
    public static abstract class b {
        public abstract View b();

        public void b(C9833xT c9833xT) {
        }

        public void c(C9833xT c9833xT, int i) {
        }

        public abstract boolean c();

        public abstract View e();
    }

    static void h() {
        e$ss2$3014 = (byte) 24;
    }

    public C9833xT a(b bVar) {
        this.i = bVar;
        return this;
    }

    public a b() {
        return this.f13909o;
    }

    public C9833xT c(int i) {
        this.d = i;
        return this;
    }

    public ViewGroup e() {
        return this.m;
    }

    public C9833xT f(int i) {
        this.f = i;
        return this;
    }

    static void c(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(a);
        boolean hasValue = obtainStyledAttributes.hasValue(0);
        obtainStyledAttributes.recycle();
        if (!hasValue) {
            throw new IllegalArgumentException("You need to use a Theme.AppCompat theme (or descendant) with the design library.");
        }
    }

    static {
        h();
        a = new int[]{androidx.appcompat.R.attr.colorPrimary};
        c = new FastOutSlowInInterpolator();
        e = new Handler(Looper.getMainLooper(), new Handler.Callback() { // from class: o.xT.4
            @Override // android.os.Handler.Callback
            public boolean handleMessage(Message message) {
                int i = message.what;
                if (i == 0) {
                    ((C9833xT) message.obj).b(true);
                    return true;
                } else if (i == 1) {
                    ((C9833xT) message.obj).b(message.arg1);
                    return true;
                } else if (i != 2) {
                    return false;
                } else {
                    ((C9833xT) message.obj).b(false);
                    return true;
                }
            }
        });
    }

    public C9833xT(ViewGroup viewGroup) {
        this.m = viewGroup;
        Context context = viewGroup.getContext();
        this.h = context;
        c(context);
        this.f13909o = (a) LayoutInflater.from(context).inflate(C9834xU.i.j, viewGroup, false);
        this.g = (AccessibilityManager) context.getSystemService("accessibility");
    }

    public static ViewGroup e(View view) {
        ViewGroup viewGroup = null;
        while (!(view instanceof CoordinatorLayout)) {
            if (view instanceof FrameLayout) {
                if (view.getId() == 16908290) {
                    return (ViewGroup) view;
                }
                viewGroup = (ViewGroup) view;
            }
            if (view != null) {
                ViewParent parent = view.getParent();
                if (parent instanceof View) {
                    view = (View) parent;
                    continue;
                } else {
                    view = null;
                    continue;
                }
            }
            if (view == null) {
                return viewGroup;
            }
        }
        return (ViewGroup) view;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0047, code lost:
        if ((r13 instanceof android.text.Spanned) == false) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0049, code lost:
        r0 = new android.text.SpannableString(r5);
        android.text.TextUtils.copySpansFrom((android.text.SpannedString) r13, 0, r5.length(), java.lang.Object.class, r0, 0);
        r5 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0062, code lost:
        r13 = o.C9833xT.n + 87;
        o.C9833xT.k = r13 % 128;
        r13 = r13 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001f, code lost:
        if (r5.startsWith("'!#+") != true) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x002d, code lost:
        if ((!r5.startsWith("'!#+")) != true) goto L5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002f, code lost:
        r4 = new java.lang.Object[1];
        p(r5.substring(4), r4);
        r5 = ((java.lang.String) r4[0]).intern();
        r13 = r1.getText(r13);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public o.C9833xT d(int r13, android.view.View.OnClickListener r14) {
        /*
            r12 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = o.C9833xT.k
            int r1 = r1 + 123
            int r2 = r1 % 128
            o.C9833xT.n = r2
            int r1 = r1 % r0
            r2 = 0
            java.lang.String r3 = "'!#+"
            r4 = 1
            if (r1 != 0) goto L22
            android.content.Context r1 = r12.h
            java.lang.String r5 = r1.getString(r13)
            boolean r3 = r5.startsWith(r3)
            r6 = 11
            int r6 = r6 / r2
            if (r3 == r4) goto L2f
            goto L6b
        L22:
            android.content.Context r1 = r12.h
            java.lang.String r5 = r1.getString(r13)
            boolean r3 = r5.startsWith(r3)
            r3 = r3 ^ r4
            if (r3 == r4) goto L6b
        L2f:
            r3 = 4
            java.lang.String r3 = r5.substring(r3)
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r12.p(r3, r4)
            r2 = r4[r2]
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r5 = r2.intern()
            java.lang.CharSequence r13 = r1.getText(r13)
            boolean r1 = r13 instanceof android.text.Spanned
            if (r1 == 0) goto L62
            android.text.SpannableString r0 = new android.text.SpannableString
            r0.<init>(r5)
            r6 = r13
            android.text.SpannedString r6 = (android.text.SpannedString) r6
            r7 = 0
            int r8 = r5.length()
            java.lang.Class<java.lang.Object> r9 = java.lang.Object.class
            r13 = r0
            android.text.SpannableString r13 = (android.text.SpannableString) r13
            r11 = 0
            r10 = r0
            android.text.TextUtils.copySpansFrom(r6, r7, r8, r9, r10, r11)
            r5 = r0
            goto L6b
        L62:
            int r13 = o.C9833xT.n
            int r13 = r13 + 87
            int r1 = r13 % 128
            o.C9833xT.k = r1
            int r13 = r13 % r0
        L6b:
            o.xT r13 = r12.b(r5, r14)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C9833xT.d(int, android.view.View$OnClickListener):o.xT");
    }

    public C9833xT b(CharSequence charSequence, final View.OnClickListener onClickListener) {
        C1204Sr c2 = this.f13909o.c();
        if (TextUtils.isEmpty(charSequence) || onClickListener == null) {
            c2.setVisibility(8);
            c2.setOnClickListener(null);
        } else {
            c2.setVisibility(0);
            c2.setText(charSequence);
            this.f13909o.setOnClickListener(new View.OnClickListener() { // from class: o.xT.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    onClickListener.onClick(view);
                    C9833xT.this.a(1);
                }
            });
        }
        return this;
    }

    public C9833xT a(Typeface typeface) {
        this.f13909o.c().setTypeface(typeface);
        return this;
    }

    public C9833xT d(int i) {
        if (this.j != i) {
            this.f13909o.setBackgroundColor(i);
            this.j = i;
        }
        return this;
    }

    public C9833xT d(CharSequence charSequence) {
        this.f13909o.e().setText(charSequence);
        return this;
    }

    public void c(boolean z) {
        C9830xQ.d().e(this.f, this.b, z);
    }

    public void c() {
        a(3);
    }

    void a(int i) {
        C9830xQ.d().a(this.b, i);
    }

    public boolean d() {
        return C9830xQ.d().e(this.b);
    }

    public boolean j() {
        return C9830xQ.d().a(this.b);
    }

    final void b(final boolean z) {
        if (this.f13909o.getParent() == null) {
            ViewGroup.LayoutParams layoutParams = this.f13909o.getLayoutParams();
            if (layoutParams instanceof CoordinatorLayout.LayoutParams) {
                CoordinatorLayout.LayoutParams layoutParams2 = (CoordinatorLayout.LayoutParams) layoutParams;
                d dVar = new d();
                dVar.setListener(new SwipeDismissBehavior.OnDismissListener() { // from class: o.xT.3
                    @Override // com.google.android.material.behavior.SwipeDismissBehavior.OnDismissListener
                    public void onDismiss(View view) {
                        view.setVisibility(8);
                        C9833xT.this.a(0);
                    }

                    @Override // com.google.android.material.behavior.SwipeDismissBehavior.OnDismissListener
                    public void onDragStateChanged(int i) {
                        if (i == 0) {
                            C9830xQ.d().f(C9833xT.this.b);
                        } else if (i == 1 || i == 2) {
                            C9830xQ.d().d(C9833xT.this.b);
                        }
                    }
                });
                layoutParams2.setBehavior(dVar);
                layoutParams2.insetEdge = 80;
            }
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = this.d;
            }
            this.m.addView(this.f13909o);
        }
        this.f13909o.b(new a.e() { // from class: o.xT.5
            @Override // o.C9833xT.a.e
            public void a(View view) {
            }

            @Override // o.C9833xT.a.e
            public void c(View view) {
                if (C9833xT.this.j()) {
                    C9833xT.e.post(new Runnable() { // from class: o.xT.5.2
                        @Override // java.lang.Runnable
                        public void run() {
                            C9833xT.this.e(3);
                        }
                    });
                }
            }
        });
        if (ViewCompat.isLaidOut(this.f13909o)) {
            if (z && f()) {
                a();
                return;
            } else {
                g();
                return;
            }
        }
        this.f13909o.e(new a.InterfaceC0126a() { // from class: o.xT.8
            @Override // o.C9833xT.a.InterfaceC0126a
            public void d(View view, int i, int i2, int i3, int i4) {
                C9833xT.this.f13909o.e(null);
                if (z && C9833xT.this.f()) {
                    C9833xT.this.a();
                } else {
                    C9833xT.this.f13909o.post(new Runnable() { // from class: o.xT.8.5
                        @Override // java.lang.Runnable
                        public void run() {
                            C9833xT.this.g();
                        }
                    });
                }
            }
        });
    }

    void a() {
        a aVar = this.f13909o;
        ViewCompat.setTranslationY(aVar, aVar.getHeight());
        ViewCompat.animate(this.f13909o).translationY(0.0f).setInterpolator(c).setDuration(250L).setListener(new ViewPropertyAnimatorListenerAdapter() { // from class: o.xT.10
            @Override // androidx.core.view.ViewPropertyAnimatorListenerAdapter, androidx.core.view.ViewPropertyAnimatorListener
            public void onAnimationStart(View view) {
                C9833xT.this.f13909o.c(70, 180);
            }

            @Override // androidx.core.view.ViewPropertyAnimatorListenerAdapter, androidx.core.view.ViewPropertyAnimatorListener
            public void onAnimationEnd(View view) {
                C9833xT.this.g();
            }
        }).start();
    }

    private void j(final int i) {
        ViewCompat.animate(this.f13909o).translationY(this.f13909o.getHeight()).setInterpolator(c).setDuration(250L).setListener(new ViewPropertyAnimatorListenerAdapter() { // from class: o.xT.9
            @Override // androidx.core.view.ViewPropertyAnimatorListenerAdapter, androidx.core.view.ViewPropertyAnimatorListener
            public void onAnimationStart(View view) {
                C9833xT.this.f13909o.d(0, 180);
            }

            @Override // androidx.core.view.ViewPropertyAnimatorListenerAdapter, androidx.core.view.ViewPropertyAnimatorListener
            public void onAnimationEnd(View view) {
                C9833xT.this.e(i);
            }
        }).start();
    }

    final void b(int i) {
        if (f() && this.f13909o.getVisibility() == 0) {
            j(i);
        } else {
            e(i);
        }
    }

    void g() {
        C9830xQ.d().b(this.b);
        b bVar = this.i;
        if (bVar != null) {
            bVar.b(this);
        }
        a(true);
    }

    void e(int i) {
        a(false);
        C9830xQ.d().c(this.b);
        b bVar = this.i;
        if (bVar != null) {
            bVar.c(this, i);
        }
        final ViewParent parent = this.f13909o.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).postDelayed(new Runnable() { // from class: o.xT.7
                @Override // java.lang.Runnable
                public void run() {
                    ((ViewGroup) parent).removeView(C9833xT.this.f13909o);
                }
            }, 250L);
        }
    }

    private void a(boolean z) {
        b bVar = this.i;
        if (bVar == null || !bVar.c()) {
            return;
        }
        View b2 = this.i.b();
        if (b2 != null) {
            b2.setPadding(0, 0, 0, z ? e().getResources().getDimensionPixelOffset(C9834xU.a.f) : 0);
        }
        View e2 = this.i.e();
        if (e2 != null) {
            e2.setPadding(0, 0, 0, z ? e().getResources().getDimensionPixelOffset(C9834xU.a.f) : 0);
        }
    }

    boolean f() {
        return !this.g.isEnabled();
    }

    /* renamed from: o.xT$a */
    /* loaded from: classes2.dex */
    public static class a extends RelativeLayout {
        private C1204Sr a;
        private int b;
        private int c;
        private C1204Sr d;
        private ViewGroup e;
        private InterfaceC0126a f;
        private e g;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: o.xT$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public interface InterfaceC0126a {
            void d(View view, int i, int i2, int i3, int i4);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: o.xT$a$e */
        /* loaded from: classes2.dex */
        public interface e {
            void a(View view);

            void c(View view);
        }

        public ViewGroup a() {
            return this.e;
        }

        public int b() {
            return this.c;
        }

        void b(e eVar) {
            this.g = eVar;
        }

        C1204Sr c() {
            return this.d;
        }

        C1204Sr e() {
            return this.a;
        }

        void e(InterfaceC0126a interfaceC0126a) {
            this.f = interfaceC0126a;
        }

        public void setMaxWidth(int i) {
            if (i < 0) {
                this.c = i;
            }
        }

        public a(Context context) {
            this(context, null);
        }

        public a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, com.google.android.material.R.styleable.SnackbarLayout);
            this.c = obtainStyledAttributes.getDimensionPixelSize(com.google.android.material.R.styleable.SnackbarLayout_android_maxWidth, -1);
            this.b = obtainStyledAttributes.getDimensionPixelSize(com.google.android.material.R.styleable.SnackbarLayout_maxActionInlineWidth, -1);
            if (obtainStyledAttributes.hasValue(com.google.android.material.R.styleable.SnackbarLayout_elevation)) {
                ViewCompat.setElevation(this, obtainStyledAttributes.getDimensionPixelSize(com.google.android.material.R.styleable.SnackbarLayout_elevation, 0));
            }
            obtainStyledAttributes.recycle();
            setClickable(true);
            LayoutInflater.from(context).inflate(C9834xU.i.i, this);
            ViewCompat.setAccessibilityLiveRegion(this, 1);
            ViewCompat.setImportantForAccessibility(this, 1);
            ViewCompat.setFitsSystemWindows(this, true);
            ViewCompat.setOnApplyWindowInsetsListener(this, new OnApplyWindowInsetsListener() { // from class: o.xT.a.1
                @Override // androidx.core.view.OnApplyWindowInsetsListener
                public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
                    view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), windowInsetsCompat.getSystemWindowInsetBottom());
                    return windowInsetsCompat;
                }
            });
        }

        @Override // android.view.View
        protected void onFinishInflate() {
            super.onFinishInflate();
            this.a = (C1204Sr) findViewById(C9834xU.g.R);
            this.e = (ViewGroup) findViewById(C9834xU.g.S);
            this.d = (C1204Sr) findViewById(C9834xU.g.P);
        }

        @Override // android.widget.RelativeLayout, android.view.View
        protected void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            if (this.c > 0) {
                int measuredWidth = getMeasuredWidth();
                int i3 = this.c;
                if (measuredWidth > i3) {
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), i2);
                }
            }
        }

        void c(int i, int i2) {
            ViewCompat.setAlpha(this.e, 0.0f);
            long j = i2;
            long j2 = i;
            ViewCompat.animate(this.e).alpha(1.0f).setDuration(j).setStartDelay(j2).start();
            if (this.d.getVisibility() == 0) {
                ViewCompat.setAlpha(this.d, 0.0f);
                ViewCompat.animate(this.d).alpha(1.0f).setDuration(j).setStartDelay(j2).start();
            }
        }

        void d(int i, int i2) {
            ViewCompat.setAlpha(this.e, 1.0f);
            long j = i2;
            long j2 = i;
            ViewCompat.animate(this.e).alpha(0.0f).setDuration(j).setStartDelay(j2).start();
            if (this.d.getVisibility() == 0) {
                ViewCompat.setAlpha(this.d, 1.0f);
                ViewCompat.animate(this.d).alpha(0.0f).setDuration(j).setStartDelay(j2).start();
            }
        }

        @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
        protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
            super.onLayout(z, i, i2, i3, i4);
            InterfaceC0126a interfaceC0126a = this.f;
            if (interfaceC0126a != null) {
                interfaceC0126a.d(this, i, i2, i3, i4);
            }
        }

        @Override // android.view.ViewGroup, android.view.View
        protected void onAttachedToWindow() {
            super.onAttachedToWindow();
            e eVar = this.g;
            if (eVar != null) {
                eVar.a(this);
            }
            ViewCompat.requestApplyInsets(this);
        }

        @Override // android.view.ViewGroup, android.view.View
        protected void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            e eVar = this.g;
            if (eVar != null) {
                eVar.c(this);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o.xT$d */
    /* loaded from: classes2.dex */
    public final class d extends SwipeDismissBehavior<a> {
        public d() {
            setDragDismissDistance(0.33f);
            setSensitivity(0.3f);
            setStartAlphaSwipeDistance(0.1f);
            setEndAlphaSwipeDistance(0.6f);
            setSwipeDirection(2);
        }

        @Override // com.google.android.material.behavior.SwipeDismissBehavior
        public boolean canSwipeDismissView(View view) {
            return (view instanceof a) && C9833xT.this.l;
        }

        @Override // com.google.android.material.behavior.SwipeDismissBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        /* renamed from: c */
        public boolean onInterceptTouchEvent(CoordinatorLayout coordinatorLayout, a aVar, MotionEvent motionEvent) {
            if (coordinatorLayout.isPointInChildBounds(aVar, (int) motionEvent.getX(), (int) motionEvent.getY())) {
                int actionMasked = motionEvent.getActionMasked();
                if (actionMasked == 0) {
                    C9830xQ.d().d(C9833xT.this.b);
                } else if (actionMasked == 1 || actionMasked == 3) {
                    C9830xQ.d().f(C9833xT.this.b);
                }
            }
            return super.onInterceptTouchEvent(coordinatorLayout, aVar, motionEvent);
        }
    }

    private void p(String str, Object[] objArr) {
        byte[] decode = Base64.decode(str, 0);
        byte[] bArr = new byte[decode.length];
        for (int i = 0; i < decode.length; i++) {
            bArr[i] = (byte) (decode[(decode.length - i) - 1] ^ e$ss2$3014);
        }
        objArr[0] = new String(bArr, StandardCharsets.UTF_8);
    }
}
