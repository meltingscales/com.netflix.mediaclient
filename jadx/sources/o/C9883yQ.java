package o;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.LayoutTransition;
import android.content.Context;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.animation.PathInterpolatorCompat;
import java.util.ArrayList;
import java.util.HashMap;
import o.C9671um;
import o.C9834xU;
import o.C9883yQ;
import o.InterfaceC9957zl;
import o.dpR;

/* renamed from: o.yQ  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C9883yQ extends LinearLayout implements InterfaceC9957zl {
    public static final a b = new a(null);
    public static final int c = 8;
    private final i A;
    private final C1203Sq C;
    private final C1203Sq D;
    private final ViewGroup a;
    private final ImageView d;
    private final LayoutTransition e;
    private final Interpolator f;
    private c g;
    private final HashMap<String, c> h;
    private long i;
    private final ArrayList<c> j;
    private final e k;
    private int l;
    private c m;
    private final ImageView n;

    /* renamed from: o  reason: collision with root package name */
    private drO<dpR> f13931o;
    private final View p;
    private final View q;
    private final View r;
    private final View s;
    private final TextView t;
    private final C1203Sq u;
    private final C1203Sq v;
    private boolean w;
    private String x;
    private final View y;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C9883yQ(Context context) {
        this(context, null, 0, 6, null);
        C8632dsu.c((Object) context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C9883yQ(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        C8632dsu.c((Object) context, "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(View view) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final LayoutTransition a() {
        return this.e;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void a(long j) {
        this.i = j;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void a(c cVar) {
        this.m = cVar;
    }

    protected long b() {
        return 0L;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final long c() {
        return this.i;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void d(boolean z) {
        this.w = z;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final ImageView e() {
        return this.d;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void e(c cVar) {
        this.g = cVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final int f() {
        return this.l;
    }

    protected int g() {
        return C9834xU.i.e;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final ImageView h() {
        return this.n;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final ArrayList<c> i() {
        return this.j;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final c j() {
        return this.m;
    }

    protected int n() {
        return 2;
    }

    @Override // o.InterfaceC9957zl
    public void setupSubGenreHolder(String str, String str2, String str3, drM<? super View, dpR> drm) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) str2, "");
        C8632dsu.c((Object) str3, "");
        C8632dsu.c((Object) drm, "");
    }

    public /* synthetic */ C9883yQ(Context context, AttributeSet attributeSet, int i2, int i3, C8627dsp c8627dsp) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i2);
    }

    /* renamed from: o.yQ$a */
    /* loaded from: classes2.dex */
    public static final class a extends C1045Mp {
        public /* synthetic */ a(C8627dsp c8627dsp) {
            this();
        }

        private a() {
            super("AroRibbon");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9883yQ(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        C8632dsu.c((Object) context, "");
        Interpolator create = PathInterpolatorCompat.create(0.68f, 0.0f, 0.265f, 1.15f);
        C8632dsu.a(create, "");
        this.f = create;
        ArrayList<c> arrayList = new ArrayList<>();
        this.j = arrayList;
        this.h = new HashMap<>();
        this.i = 100L;
        this.e = new LayoutTransition();
        this.x = "";
        this.A = new i();
        this.k = new e();
        setOrientation(0);
        setClipChildren(false);
        View.inflate(getContext(), g(), this);
        C9835xV d2 = C9835xV.d(this);
        C8632dsu.a(d2, "");
        ConstraintLayout constraintLayout = d2.a;
        C8632dsu.a(constraintLayout, "");
        this.a = constraintLayout;
        AppCompatImageView appCompatImageView = d2.e;
        C8632dsu.a(appCompatImageView, "");
        this.d = appCompatImageView;
        ImageView imageView = d2.d;
        C8632dsu.a(imageView, "");
        this.n = imageView;
        C1203Sq c1203Sq = d2.g;
        C8632dsu.a(c1203Sq, "");
        this.t = c1203Sq;
        AppCompatImageView appCompatImageView2 = d2.l;
        C8632dsu.a(appCompatImageView2, "");
        this.y = appCompatImageView2;
        Space space = d2.c;
        C8632dsu.a(space, "");
        this.s = space;
        Space space2 = d2.f;
        C8632dsu.a(space2, "");
        this.p = space2;
        Space space3 = d2.j;
        C8632dsu.a(space3, "");
        this.q = space3;
        Space space4 = d2.h;
        C8632dsu.a(space4, "");
        this.r = space4;
        C1203Sq c1203Sq2 = d2.k;
        C8632dsu.a(c1203Sq2, "");
        this.v = c1203Sq2;
        C1203Sq c1203Sq3 = d2.n;
        C8632dsu.a(c1203Sq3, "");
        this.u = c1203Sq3;
        C1203Sq c1203Sq4 = d2.m;
        C8632dsu.a(c1203Sq4, "");
        this.C = c1203Sq4;
        C1203Sq c1203Sq5 = d2.f13923o;
        C8632dsu.a(c1203Sq5, "");
        this.D = c1203Sq5;
        arrayList.add(new c(space, c1203Sq2, false, 4, null));
        arrayList.add(new c(space2, c1203Sq3, false, 4, null));
        arrayList.add(new c(space3, c1203Sq4, false, 4, null));
        arrayList.add(new c(space4, c1203Sq5, false, 4, null));
        for (c cVar : arrayList) {
            cVar.e().setVisibility(8);
            cVar.d().setVisibility(8);
        }
        this.e.setStartDelay(1, 0L);
        this.e.disableTransitionType(2);
        this.e.disableTransitionType(3);
        this.e.setInterpolator(1, this.f);
        this.e.setInterpolator(0, this.f);
        this.e.addTransitionListener(new LayoutTransition.TransitionListener() { // from class: o.yQ.5
            private int c;

            @Override // android.animation.LayoutTransition.TransitionListener
            public void startTransition(LayoutTransition layoutTransition, ViewGroup viewGroup, View view, int i3) {
                this.c++;
                C9883yQ.b.getLogTag();
            }

            @Override // android.animation.LayoutTransition.TransitionListener
            public void endTransition(LayoutTransition layoutTransition, ViewGroup viewGroup, View view, int i3) {
                C9883yQ.b.getLogTag();
                int i4 = this.c - 1;
                this.c = i4;
                if (i4 == 0) {
                    drO dro = C9883yQ.this.f13931o;
                    if (dro != null) {
                        dro.invoke();
                    }
                    C9883yQ.this.f13931o = null;
                }
            }
        });
        ((ConstraintLayout) this.a).setLayoutTransition(this.e);
    }

    /* renamed from: o.yQ$b */
    /* loaded from: classes2.dex */
    public static final class b implements View.OnLayoutChangeListener {
        public b() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            view.removeOnLayoutChangeListener(this);
            if (C9883yQ.this.j.size() > C9883yQ.this.n()) {
                C9883yQ c9883yQ = C9883yQ.this;
                c9883yQ.b(c9883yQ.j.size() - 1);
                for (c cVar : C9883yQ.this.j) {
                    cVar.e().setMaxWidth(Integer.MAX_VALUE);
                }
            }
        }
    }

    /* renamed from: o.yQ$i */
    /* loaded from: classes2.dex */
    public static final class i extends AnimatorListenerAdapter {
        i() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            C8632dsu.c((Object) animator, "");
            C9883yQ.this.s();
        }
    }

    /* renamed from: o.yQ$e */
    /* loaded from: classes2.dex */
    public static final class e extends AnimatorListenerAdapter {
        e() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            C8632dsu.c((Object) animator, "");
            C9883yQ.b.getLogTag();
            C9883yQ.this.t();
        }
    }

    /* renamed from: o.yQ$d */
    /* loaded from: classes2.dex */
    public static final class d extends AnimatorListenerAdapter {
        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            C8632dsu.c((Object) animator, "");
        }

        d() {
        }
    }

    private final AnimatorListenerAdapter c(boolean z) {
        return z ? new d() : this.k;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: o.yQ$c */
    /* loaded from: classes2.dex */
    public static final class c {
        private boolean a;
        private final View b;
        private final C1203Sq c;

        public final boolean a() {
            return this.a;
        }

        public final void b(boolean z) {
            this.a = z;
        }

        public final View d() {
            return this.b;
        }

        public final C1203Sq e() {
            return this.c;
        }

        public c(View view, C1203Sq c1203Sq, boolean z) {
            C8632dsu.c((Object) view, "");
            C8632dsu.c((Object) c1203Sq, "");
            this.b = view;
            this.c = c1203Sq;
            this.a = z;
        }

        public /* synthetic */ c(View view, C1203Sq c1203Sq, boolean z, int i, C8627dsp c8627dsp) {
            this(view, c1203Sq, (i & 4) != 0 ? true : z);
        }
    }

    public void setTablet(boolean z) {
        if (z) {
            this.n.setImageResource(C9834xU.j.d);
            C9870yD.b((View) this.n, 0, getResources().getDimensionPixelSize(C9834xU.a.e));
        } else {
            this.n.setImageResource(C9671um.d.a);
            ImageView imageView = this.n;
            C1332Xp c1332Xp = C1332Xp.b;
            C9870yD.b((View) imageView, 0, (int) TypedValue.applyDimension(1, 20, ((Context) C1332Xp.b(Context.class)).getResources().getDisplayMetrics()));
        }
        this.l = this.n.getPaddingStart();
    }

    @Override // o.InterfaceC9957zl
    public void setLogoPaddingForGlobalNav() {
        this.l = getResources().getDimensionPixelOffset(C9834xU.a.v);
    }

    @Override // o.InterfaceC9957zl
    public void setupHolder(int i2, String str, String str2, boolean z, final drM<? super View, dpR> drm) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) str2, "");
        C8632dsu.c((Object) drm, "");
        if (i2 < this.j.size()) {
            c cVar = this.j.get(i2);
            C8632dsu.a(cVar, "");
            c cVar2 = cVar;
            cVar2.b(z);
            cVar2.e().setText(str);
            cVar2.e().setTag(C9834xU.g.c, new InterfaceC9957zl.c(str2, str, z));
            cVar2.e().setOnClickListener(new View.OnClickListener() { // from class: o.yV
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C9883yQ.j(drM.this, view);
                }
            });
            cVar2.e().setVisibility(0);
            cVar2.d().setVisibility(0);
            this.h.put(str2, cVar2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(drM drm, View view) {
        C8632dsu.c((Object) drm, "");
        drm.invoke(view);
    }

    @Override // o.InterfaceC9957zl
    public InterfaceC9957zl.c d(View view) {
        C8632dsu.c((Object) view, "");
        Object tag = view.getTag(C9834xU.g.c);
        if (tag instanceof InterfaceC9957zl.c) {
            return (InterfaceC9957zl.c) tag;
        }
        return null;
    }

    public boolean k() {
        return this.t.getVisibility() == 0;
    }

    protected boolean l() {
        return k();
    }

    protected int c(int i2) {
        return View.MeasureSpec.getSize(i2) - this.n.getMeasuredWidth();
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        if (l()) {
            c cVar = this.m;
            if (cVar != null) {
                ViewGroup.LayoutParams layoutParams = this.t.getLayoutParams();
                C8632dsu.d(layoutParams);
                ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
                if (View.MeasureSpec.getMode(i2) != 0) {
                    int size = View.MeasureSpec.getSize(i2);
                    int measuredWidth = this.n.getMeasuredWidth();
                    int measuredWidth2 = this.d.getMeasuredWidth();
                    int measuredWidth3 = this.y.getMeasuredWidth();
                    int marginStart = layoutParams2.getMarginStart();
                    this.t.setMaxWidth((((((size - measuredWidth) - measuredWidth2) - measuredWidth3) - marginStart) - layoutParams2.getMarginEnd()) - cVar.e().getMeasuredWidth());
                }
            }
        } else if (View.MeasureSpec.getMode(i2) != 0) {
            int c2 = c(i2);
            int i4 = 0;
            for (c cVar2 : this.j) {
                i4 += cVar2.e().getMeasuredWidth();
            }
            if (c2 < i4) {
                if (this.j.size() > n()) {
                    addOnLayoutChangeListener(new b());
                }
                for (c cVar3 : this.j) {
                    cVar3.e().setMaxWidth((cVar3.e().getMeasuredWidth() * c2) / i4);
                }
            }
        }
    }

    @Override // o.InterfaceC9957zl
    public void setSubCategoryVisibility(int i2) {
        this.t.setVisibility(i2);
        this.y.setVisibility(i2);
        if (i2 != 0 || isLaidOut()) {
            return;
        }
        p();
    }

    @Override // o.InterfaceC9957zl
    public void setSubCategoryLabel(String str, String str2) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) str2, "");
        if (C8632dsu.c((Object) this.t.getText(), (Object) str) && C8632dsu.c((Object) this.x, (Object) str2)) {
            return;
        }
        this.t.setText(str);
        this.x = str2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(drM drm, View view) {
        C8632dsu.c((Object) drm, "");
        drm.invoke(view);
    }

    @Override // o.InterfaceC9957zl
    public void setSubCategoryClickListener(final drM<? super View, dpR> drm) {
        C8632dsu.c((Object) drm, "");
        this.t.setOnClickListener(new View.OnClickListener() { // from class: o.yO
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C9883yQ.i(drM.this, view);
            }
        });
        this.y.setOnClickListener(new View.OnClickListener() { // from class: o.yX
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C9883yQ.f(drM.this, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(drM drm, View view) {
        C8632dsu.c((Object) drm, "");
        drm.invoke(view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(drM drm, View view) {
        C8632dsu.c((Object) drm, "");
        drm.invoke(view);
    }

    @Override // o.InterfaceC9957zl
    public void setLogoClickListener(final drM<? super View, dpR> drm) {
        C8632dsu.c((Object) drm, "");
        this.n.setOnClickListener(new View.OnClickListener() { // from class: o.yS
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C9883yQ.h(drM.this, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(drM drm, View view) {
        C8632dsu.c((Object) drm, "");
        drm.invoke(view);
    }

    @Override // o.InterfaceC9957zl
    public void setMainCaratClickListener(final drM<? super View, dpR> drm) {
        C8632dsu.c((Object) drm, "");
        this.d.setOnClickListener(new View.OnClickListener() { // from class: o.yR
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C9883yQ.g(drM.this, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b(int i2) {
        if (i2 < this.j.size()) {
            c cVar = this.j.get(i2);
            C8632dsu.a(cVar, "");
            c cVar2 = cVar;
            this.j.remove(i2);
            cVar2.d().setVisibility(8);
            cVar2.e().setVisibility(8);
            cVar2.e().setOnClickListener(new View.OnClickListener() { // from class: o.yP
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C9883yQ.b(view);
                }
            });
        }
    }

    @Override // o.InterfaceC9957zl
    public void d() {
        c cVar = this.m;
        if (cVar != null) {
            cVar.e().animate().setStartDelay(0L).cancel();
            cVar.e().animate().scaleX(1.0f).scaleY(1.0f).translationX(0.0f).setDuration(200L).setInterpolator(this.f).start();
            this.t.animate().cancel();
            this.t.animate().alpha(0.0f).setDuration(200L).setInterpolator(this.f).setListener(this.A).start();
            this.y.animate().setStartDelay(0L).cancel();
            this.y.animate().alpha(0.0f).setDuration(200L).setInterpolator(this.f).start();
            this.d.animate().setStartDelay(0L).cancel();
            this.d.animate().alpha(0.0f).setDuration(200L).setInterpolator(this.f).start();
        }
    }

    @Override // o.InterfaceC9957zl
    public void setSelectedPrimaryGenre(String str) {
        C8632dsu.c((Object) str, "");
        c cVar = this.h.get(str);
        if (cVar == null || C8632dsu.c(cVar, this.m)) {
            return;
        }
        a(this, cVar, false, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void a(boolean z) {
        if (z) {
            this.a.setLayoutTransition(this.e);
        } else {
            this.a.setLayoutTransition(null);
        }
    }

    public static /* synthetic */ void a(C9883yQ c9883yQ, c cVar, boolean z, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: selectSection");
        }
        if ((i2 & 2) != 0) {
            z = false;
        }
        c9883yQ.e(cVar, z);
    }

    protected final void e(c cVar, boolean z) {
        C1203Sq e2;
        C8632dsu.c((Object) cVar, "");
        if (this.m != null) {
            a(false);
            c cVar2 = this.m;
            if (cVar2 != null && (e2 = cVar2.e()) != null) {
                c(e2, 1.0f);
                e2.setTranslationX(0.0f);
                C9870yD.d(e2, 0, 0);
            }
            c cVar3 = this.m;
            C1203Sq e3 = cVar3 != null ? cVar3.e() : null;
            if (e3 != null) {
                e3.setVisibility(8);
            }
            this.g = cVar;
            this.m = cVar;
            cVar.e().setVisibility(0);
            cVar.e().setAlpha(1.0f);
            c(cVar.e(), 1.15f);
            C9870yD.d(cVar.e(), 0, this.l);
            float b2 = b(cVar);
            cVar.e().setTranslationX(b2);
            this.d.setTranslationX(b2);
            return;
        }
        a(true);
        this.g = cVar;
        this.m = cVar;
        if (isLaidOut()) {
            long b3 = cVar.e().getVisibility() == 8 ? b() : ((this.j.indexOf(cVar) + 1) * 150) + 150;
            this.i = b3;
            this.e.setDuration(0, b3);
            this.e.setDuration(1, this.i);
            this.w = false;
            cVar.e().animate().setStartDelay(0L).cancel();
            float b4 = b(cVar);
            cVar.e().animate().scaleX(1.15f).scaleY(1.15f).translationX(b4).setDuration(50L).setListener(c(z)).start();
            this.d.setTranslationX(b4);
            for (c cVar4 : this.j) {
                if (!C8632dsu.c(cVar4, this.m)) {
                    cVar4.e().animate().setStartDelay(0L).cancel();
                    cVar4.e().animate().alpha(0.0f).setDuration(50L).start();
                }
            }
            return;
        }
        cVar.e().setScaleX(1.15f);
        cVar.e().setScaleY(1.15f);
        t();
    }

    private final float b(c cVar) {
        float width = ((cVar.e().getWidth() - cVar.e().getPaddingStart()) * 0.14999998f) / 2;
        float paddingStart = this.l - cVar.e().getPaddingStart();
        if (cVar.e().getX() - width < paddingStart) {
            return paddingStart - (cVar.e().getX() - width);
        }
        return 0.0f;
    }

    @Override // android.view.View
    public boolean isLaidOut() {
        return getWidth() > 0 && getHeight() > 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void c(c cVar) {
        C8632dsu.c((Object) cVar, "");
        C9870yD.d(cVar.e(), 0, 0);
        cVar.d().setVisibility(0);
        cVar.e().setTranslationX(0.0f);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void d(c cVar) {
        C8632dsu.c((Object) cVar, "");
        cVar.e().setAlpha(0.0f);
        cVar.e().setVisibility(0);
        cVar.e().animate().setStartDelay(0L).cancel();
        cVar.e().animate().alpha(1.0f).setStartDelay(this.i - 100).setDuration(200L).setInterpolator(this.f).setListener(null).start();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void o() {
        this.t.setVisibility(8);
        this.y.setVisibility(8);
        this.d.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void c(View view, float f) {
        C8632dsu.c((Object) view, "");
        view.setScaleX(f);
        view.setScaleY(f);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void m() {
        this.d.setAlpha(0.0f);
        this.d.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void s() {
        b.getLogTag();
        a(true);
        c cVar = this.m;
        if (cVar != null) {
            o();
            for (c cVar2 : this.j) {
                CharSequence text = cVar2.e().getText();
                C8632dsu.a(text, "");
                if (text.length() != 0) {
                    c(cVar2);
                    if (!C8632dsu.c(cVar2, cVar)) {
                        d(cVar2);
                    }
                }
            }
            this.m = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void t() {
        b.getLogTag();
        a(true);
        c cVar = this.m;
        if (cVar != null) {
            C9870yD.d(cVar.e(), 0, this.l);
            m();
            if (cVar.a()) {
                this.t.setAlpha(0.0f);
                this.t.setVisibility(0);
                this.y.setAlpha(0.0f);
                this.y.setVisibility(0);
            }
            for (c cVar2 : this.j) {
                cVar2.d().setVisibility(8);
                if (!C8632dsu.c(cVar2, cVar)) {
                    cVar2.e().setVisibility(8);
                }
            }
            if (isLaidOut()) {
                this.f13931o = new drO<dpR>() { // from class: com.netflix.android.widgetry.widget.AroRibbon$changeLayoutForSubcategory$2$2
                    {
                        super(0);
                    }

                    public final void a() {
                        C9883yQ.this.p();
                    }

                    @Override // o.drO
                    public /* synthetic */ dpR invoke() {
                        a();
                        return dpR.c;
                    }
                };
            } else {
                p();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void p() {
        this.w = true;
        b.getLogTag();
        c cVar = this.m;
        if (cVar != null) {
            if (cVar.a()) {
                if (isLaidOut()) {
                    this.t.animate().cancel();
                    this.t.animate().alpha(1.0f).setDuration(200L).setInterpolator(this.f).setListener(null).start();
                    this.y.animate().cancel();
                    this.y.animate().alpha(1.0f).setDuration(200L).setInterpolator(this.f).start();
                } else {
                    this.t.setAlpha(1.0f);
                    this.y.setAlpha(1.0f);
                }
            }
            if (isLaidOut()) {
                this.d.animate().alpha(1.0f).setDuration(200L).setInterpolator(this.f).start();
            } else {
                this.d.setAlpha(1.0f);
            }
        }
    }
}
