package o;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import androidx.core.view.GestureDetectorCompat;
import com.airbnb.lottie.LottieAnimationView;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Ref;

/* renamed from: o.Sm  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C1199Sm extends LottieAnimationView {
    private Rect a;
    private float c;
    private final GestureDetectorCompat e;
    private boolean f;
    private List<C1099Oq> g;
    private boolean h;
    private AnimatorListenerAdapter i;
    private C1097Oo j;
    private List<C1099Oq> k;
    private int l;
    private final Paint m;
    private int n;

    /* renamed from: o  reason: collision with root package name */
    private InterfaceC1102Ot f13400o;
    private final int[] q;
    private int r;
    private float s;
    private int t;
    public static final a d = new a(null);
    public static final int b = 8;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C1199Sm(Context context) {
        this(context, null, 0, 6, null);
        C8632dsu.c((Object) context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C1199Sm(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        C8632dsu.c((Object) context, "");
    }

    public final int f() {
        return this.t;
    }

    public final InterfaceC1102Ot h() {
        return this.f13400o;
    }

    public final void setResetViewScaleFactor(boolean z) {
        this.f = z;
    }

    public final void setShowTapAreaBorder(boolean z) {
        this.h = z;
    }

    public final void setTagAnimationListener(InterfaceC1102Ot interfaceC1102Ot) {
        this.f13400o = interfaceC1102Ot;
    }

    public final void setTargetFps(int i) {
        this.r = i;
    }

    public final void setTotalNumFrames(int i) {
        this.t = i;
    }

    public /* synthetic */ C1199Sm(Context context, AttributeSet attributeSet, int i, int i2, C8627dsp c8627dsp) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1199Sm(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C8632dsu.c((Object) context, "");
        Paint paint = new Paint();
        this.m = paint;
        this.q = new int[2];
        this.k = new ArrayList();
        this.g = new ArrayList();
        this.a = new Rect();
        paint.setColor(-16711936);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(1.5f);
        this.e = new GestureDetectorCompat(context, new c(this));
    }

    @SuppressLint({"RestrictedApi"})
    /* renamed from: o.Sm$a */
    /* loaded from: classes3.dex */
    public static final class a extends C1045Mp {
        public /* synthetic */ a(C8627dsp c8627dsp) {
            this();
        }

        private a() {
            super("NetflixLottieAnimationView");
        }
    }

    @SuppressLint({"RestrictedApi"})
    public final void setNetflixLottieComposition(Context context, C1097Oo c1097Oo) {
        C8632dsu.c((Object) context, "");
        C8632dsu.c((Object) c1097Oo, "");
        setComposition(c1097Oo.d());
        for (C1099Oq c1099Oq : c1097Oo.e()) {
            if (!c1099Oq.e().isEmpty()) {
                this.k.add(C1099Oq.a(c1099Oq, null, 0, 0, 0, 0, new Rect(c1099Oq.e()), 31, null));
                this.g.add(C1099Oq.a(c1099Oq, null, 0, 0, 0, 0, new Rect(c1099Oq.e()), 31, null));
            }
        }
        Rect c2 = c1097Oo.d().c();
        C8632dsu.a(c2, "");
        this.a = c2;
        this.l = c1097Oo.a();
        this.n = c1097Oo.c();
        this.r = (int) ((c1097Oo.d().b() * 1000.0f) / c1097Oo.d().e());
        this.t = (int) ((c1097Oo.d().d() - c1097Oo.d().m()) + 1);
        d.getLogTag();
        this.j = c1097Oo;
    }

    /* renamed from: o.Sm$c */
    /* loaded from: classes6.dex */
    static final class c extends GestureDetector.SimpleOnGestureListener {
        private final C1199Sm c;

        public c(C1199Sm c1199Sm) {
            C8632dsu.c((Object) c1199Sm, "");
            this.c = c1199Sm;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onSingleTapUp(MotionEvent motionEvent) {
            C8632dsu.c((Object) motionEvent, "");
            return this.c.c(motionEvent);
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onDown(MotionEvent motionEvent) {
            C8632dsu.c((Object) motionEvent, "");
            return this.c.a(motionEvent);
        }
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDraw(Canvas canvas) {
        C8632dsu.c((Object) canvas, "");
        super.onDraw(canvas);
        float width = getWidth() / this.l;
        float height = getHeight() / this.n;
        if (this.s != width || this.c != height || this.f) {
            this.s = width;
            this.c = height;
            d.getLogTag();
            int i = 0;
            for (Object obj : this.k) {
                if (i < 0) {
                    C8569dql.h();
                }
                C1099Oq c1099Oq = (C1099Oq) obj;
                this.g.get(i).e().left = (int) (c1099Oq.e().left * this.s);
                this.g.get(i).e().right = (int) (c1099Oq.e().right * this.s);
                this.g.get(i).e().top = (int) (c1099Oq.e().top * this.c);
                this.g.get(i).e().bottom = (int) (c1099Oq.e().bottom * this.c);
                i++;
            }
            this.f = false;
        }
        if (this.h) {
            for (C1099Oq c1099Oq2 : this.g) {
                canvas.drawRect(c1099Oq2.e(), this.m);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean c(MotionEvent motionEvent) {
        getLocationOnScreen(this.q);
        C1099Oq d2 = d(motionEvent.getRawX() - this.q[0], motionEvent.getRawY() - this.q[1]);
        d.getLogTag();
        return c(this, d2, 0, 2, null);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        C8632dsu.c((Object) motionEvent, "");
        if (l()) {
            return this.e.onTouchEvent(motionEvent);
        }
        return false;
    }

    public final boolean l() {
        return getAlpha() > 0.0f && getVisibility() == 0;
    }

    public final boolean a(MotionEvent motionEvent) {
        C8632dsu.c((Object) motionEvent, "");
        return d(motionEvent) != null;
    }

    public final C1099Oq d(MotionEvent motionEvent) {
        C8632dsu.c((Object) motionEvent, "");
        getLocationOnScreen(this.q);
        return d(motionEvent.getRawX() - this.q[0], motionEvent.getRawY() - this.q[1]);
    }

    static /* synthetic */ boolean c(C1199Sm c1199Sm, C1099Oq c1099Oq, int i, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 2) != 0) {
                i = -1;
            }
            return c1199Sm.a(c1099Oq, i);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: playAnimationFromTagItem");
    }

    private final boolean a(C1099Oq c1099Oq, int i) {
        if (c1099Oq != null) {
            d(this.i);
            Ref.FloatRef floatRef = new Ref.FloatRef();
            floatRef.d = c();
            d dVar = new d(floatRef, c1099Oq);
            this.i = dVar;
            c(dVar);
            int a2 = i != -1 ? i + c1099Oq.a() : c1099Oq.a();
            if (a2 > c1099Oq.c()) {
                setSpeed(-1.0f);
                b(c1099Oq.c(), a2);
            } else {
                b(a2, c1099Oq.c());
            }
            InterfaceC1102Ot interfaceC1102Ot = this.f13400o;
            if (interfaceC1102Ot != null) {
                interfaceC1102Ot.c(c1099Oq.b());
                return true;
            }
            return true;
        }
        return false;
    }

    /* renamed from: o.Sm$d */
    /* loaded from: classes3.dex */
    public static final class d extends AnimatorListenerAdapter {
        final /* synthetic */ Ref.FloatRef c;
        final /* synthetic */ C1099Oq d;

        d(Ref.FloatRef floatRef, C1099Oq c1099Oq) {
            this.c = floatRef;
            this.d = c1099Oq;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            C8632dsu.c((Object) animator, "");
            C1199Sm.this.setSpeed(this.c.d);
            C1199Sm.d.getLogTag();
            int f = C1199Sm.this.f();
            int d = this.d.d();
            if (d >= 0 && d <= f) {
                C1199Sm c1199Sm = C1199Sm.this;
                c1199Sm.setMinAndMaxFrame(0, c1199Sm.f());
                C1199Sm.this.setFrame(this.d.d());
            }
            InterfaceC1102Ot h = C1199Sm.this.h();
            if (h != null) {
                h.b(this.d.b());
            }
        }
    }

    public final void d(int i, int i2, AnimatorListenerAdapter animatorListenerAdapter, int i3) {
        int i4;
        int b2;
        if (i > i2) {
            j();
            c(new b());
        }
        if (animatorListenerAdapter != null) {
            c(animatorListenerAdapter);
        }
        setRepeatCount(i3);
        i4 = C8657dts.i(i, i2);
        b2 = C8657dts.b(i, i2);
        setMinAndMaxFrame(i4, b2);
        g();
    }

    /* renamed from: o.Sm$b */
    /* loaded from: classes3.dex */
    public static final class b extends AnimatorListenerAdapter {
        b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            C8632dsu.c((Object) animator, "");
            super.onAnimationEnd(animator);
            C1199Sm.this.j();
            C1199Sm.this.d(this);
        }
    }

    private final C1099Oq d(float f, float f2) {
        for (C1099Oq c1099Oq : this.g) {
            if (c1099Oq.h() == a() && c1099Oq.e().contains((int) f, (int) f2)) {
                return c1099Oq;
            }
        }
        return null;
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDetachedFromWindow() {
        AnimatorListenerAdapter animatorListenerAdapter = this.i;
        if (animatorListenerAdapter != null) {
            d(animatorListenerAdapter);
        }
        super.onDetachedFromWindow();
    }

    private final void b(int i, int i2) {
        d.getLogTag();
        setMinAndMaxFrame(i, i2);
        g();
    }
}
