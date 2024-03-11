package o;

import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.animation.Interpolator;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.core.content.ContextCompat;
import androidx.core.view.animation.PathInterpolatorCompat;
import androidx.legacy.widget.Space;
import com.netflix.hawkins.consumer.icons.HawkinsIcon;
import com.netflix.hawkins.consumer.tokens.Token;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.ListIterator;
import kotlin.jvm.internal.Ref;
import o.C9671um;
import o.C9834xU;
import o.C9892yZ;
import o.InterfaceC9957zl;
import o.dpR;

/* renamed from: o.yZ  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C9892yZ extends LinearLayout implements InterfaceC9957zl {
    private final LayoutTransition b;
    private final Drawable c;
    private final C9837xX d;
    private e f;
    private final ArrayList<e> g;
    private long h;
    private final Interpolator i;
    private final HashMap<String, e> j;
    private drO<dpR> k;
    private final ColorStateList l;
    private int m;
    private String n;

    /* renamed from: o  reason: collision with root package name */
    private e f13932o;
    private boolean q;
    private final ColorStateList t;
    public static final c e = new c(null);
    public static final int a = 8;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C9892yZ(Context context) {
        this(context, null, 0, 6, null);
        C8632dsu.c((Object) context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C9892yZ(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        C8632dsu.c((Object) context, "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(View view) {
    }

    protected final ArrayList<e> a() {
        return this.g;
    }

    public final int c() {
        return C9834xU.i.c;
    }

    protected int e() {
        return 3;
    }

    @Override // o.InterfaceC9957zl
    public void setMainCaratClickListener(drM<? super View, dpR> drm) {
        C8632dsu.c((Object) drm, "");
    }

    public /* synthetic */ C9892yZ(Context context, AttributeSet attributeSet, int i, int i2, C8627dsp c8627dsp) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* renamed from: o.yZ$a */
    /* loaded from: classes5.dex */
    public static final class a implements View.OnLayoutChangeListener {
        final /* synthetic */ e c;

        public a(e eVar) {
            this.c = eVar;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            view.removeOnLayoutChangeListener(this);
            C9892yZ.this.b(this.c);
        }
    }

    /* renamed from: o.yZ$d */
    /* loaded from: classes5.dex */
    public static final class d implements View.OnLayoutChangeListener {
        public d() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            view.removeOnLayoutChangeListener(this);
            if (C9892yZ.this.g.size() > C9892yZ.this.e()) {
                C9892yZ c9892yZ = C9892yZ.this;
                c9892yZ.b(c9892yZ.g.size() - 1);
                for (e eVar : C9892yZ.this.g) {
                    eVar.e().setMaxWidth(Integer.MAX_VALUE);
                }
            }
        }
    }

    /* renamed from: o.yZ$c */
    /* loaded from: classes5.dex */
    public static final class c extends C1045Mp {
        public /* synthetic */ c(C8627dsp c8627dsp) {
            this();
        }

        private c() {
            super("AroRibbon");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9892yZ(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C8632dsu.c((Object) context, "");
        Interpolator create = PathInterpolatorCompat.create(0.68f, 0.0f, 0.265f, 1.15f);
        C8632dsu.a(create, "");
        this.i = create;
        Drawable drawable = ContextCompat.getDrawable(context, HawkinsIcon.aO.e.d());
        if (drawable != null) {
            float f = 16;
            C1332Xp c1332Xp = C1332Xp.b;
            drawable.setBounds(0, 0, (int) TypedValue.applyDimension(1, f, ((Context) C1332Xp.b(Context.class)).getResources().getDisplayMetrics()), (int) TypedValue.applyDimension(1, f, ((Context) C1332Xp.b(Context.class)).getResources().getDisplayMetrics()));
        } else {
            drawable = null;
        }
        Drawable drawable2 = drawable;
        this.c = drawable2;
        ArrayList<e> arrayList = new ArrayList<>();
        this.g = arrayList;
        this.j = new HashMap<>();
        this.h = 150L;
        this.b = new LayoutTransition();
        ColorStateList withAlpha = ColorStateList.valueOf(LF.c(Token.Color.Cdo.e)).withAlpha(127);
        C8632dsu.a(withAlpha, "");
        this.l = withAlpha;
        ColorStateList valueOf = ColorStateList.valueOf(0);
        C8632dsu.a(valueOf, "");
        this.t = valueOf;
        this.n = "";
        setOrientation(0);
        setClipChildren(false);
        View.inflate(getContext(), c(), this);
        C9837xX a2 = C9837xX.a(this);
        C8632dsu.a(a2, "");
        this.d = a2;
        C1203Sq c1203Sq = a2.h;
        C8632dsu.a(c1203Sq, "");
        C9696vK.c(c1203Sq, null, null, drawable2, null, 11, null);
        Space space = a2.a;
        C8632dsu.a(space, "");
        C1203Sq c1203Sq2 = a2.g;
        C8632dsu.a(c1203Sq2, "");
        arrayList.add(new e(space, c1203Sq2, false, 4, null));
        Space space2 = a2.i;
        C8632dsu.a(space2, "");
        C1203Sq c1203Sq3 = a2.m;
        C8632dsu.a(c1203Sq3, "");
        arrayList.add(new e(space2, c1203Sq3, false, 4, null));
        Space space3 = a2.f;
        C8632dsu.a(space3, "");
        C1203Sq c1203Sq4 = a2.l;
        C8632dsu.a(c1203Sq4, "");
        arrayList.add(new e(space3, c1203Sq4, false, 4, null));
        Space space4 = a2.j;
        C8632dsu.a(space4, "");
        C1203Sq c1203Sq5 = a2.k;
        C8632dsu.a(c1203Sq5, "");
        arrayList.add(new e(space4, c1203Sq5, false, 4, null));
        for (e eVar : arrayList) {
            eVar.e().setVisibility(8);
            eVar.d().setVisibility(8);
        }
        this.b.setStartDelay(1, 0L);
        this.b.disableTransitionType(2);
        this.b.disableTransitionType(3);
        this.b.setInterpolator(1, this.i);
        this.b.setInterpolator(0, this.i);
        this.b.addTransitionListener(new LayoutTransition.TransitionListener() { // from class: o.yZ.3
            private int a;

            @Override // android.animation.LayoutTransition.TransitionListener
            public void startTransition(LayoutTransition layoutTransition, ViewGroup viewGroup, View view, int i2) {
                this.a++;
                C9892yZ.e.getLogTag();
            }

            @Override // android.animation.LayoutTransition.TransitionListener
            public void endTransition(LayoutTransition layoutTransition, ViewGroup viewGroup, View view, int i2) {
                C9892yZ.e.getLogTag();
                int i3 = this.a - 1;
                this.a = i3;
                if (i3 == 0) {
                    drO dro = C9892yZ.this.k;
                    if (dro != null) {
                        dro.invoke();
                    }
                    C9892yZ.this.k = null;
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o.yZ$b */
    /* loaded from: classes5.dex */
    public static final class b {
        private final InterfaceC9957zl.c a;
        private final drM<View, dpR> b;

        public final InterfaceC9957zl.c c() {
            return this.a;
        }

        public final drM<View, dpR> e() {
            return this.b;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public b(InterfaceC9957zl.c cVar, drM<? super View, dpR> drm) {
            C8632dsu.c((Object) cVar, "");
            C8632dsu.c((Object) drm, "");
            this.a = cVar;
            this.b = drm;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: o.yZ$e */
    /* loaded from: classes5.dex */
    public static final class e {
        private final C1203Sq a;
        private boolean c;
        private final View d;

        public final boolean c() {
            return this.c;
        }

        public final View d() {
            return this.d;
        }

        public final C1203Sq e() {
            return this.a;
        }

        public final void e(boolean z) {
            this.c = z;
        }

        public e(View view, C1203Sq c1203Sq, boolean z) {
            C8632dsu.c((Object) view, "");
            C8632dsu.c((Object) c1203Sq, "");
            this.d = view;
            this.a = c1203Sq;
            this.c = z;
        }

        public /* synthetic */ e(View view, C1203Sq c1203Sq, boolean z, int i, C8627dsp c8627dsp) {
            this(view, c1203Sq, (i & 4) != 0 ? true : z);
        }
    }

    public void setTablet(boolean z) {
        if (z) {
            this.d.c.setImageResource(C9834xU.j.d);
            C9870yD.b((View) this.d.c, 0, getResources().getDimensionPixelSize(C9834xU.a.e));
        } else {
            this.d.c.setImageResource(C9671um.d.a);
            ImageView imageView = this.d.c;
            C1332Xp c1332Xp = C1332Xp.b;
            C9870yD.b((View) imageView, 0, (int) TypedValue.applyDimension(1, 20, ((Context) C1332Xp.b(Context.class)).getResources().getDisplayMetrics()));
        }
        this.m = this.d.c.getPaddingStart();
    }

    @Override // o.InterfaceC9957zl
    public void setLogoPaddingForGlobalNav() {
        this.m = getResources().getDimensionPixelOffset(C9834xU.a.v);
    }

    @Override // o.InterfaceC9957zl
    public void setupHolder(int i, String str, String str2, boolean z, final drM<? super View, dpR> drm) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) str2, "");
        C8632dsu.c((Object) drm, "");
        if (i < this.g.size()) {
            InterfaceC9957zl.c cVar = new InterfaceC9957zl.c(str2, str, z);
            e eVar = this.g.get(i);
            C8632dsu.a(eVar, "");
            e eVar2 = eVar;
            eVar2.e(z);
            eVar2.e().setText(str);
            eVar2.e().setTag(C9834xU.g.c, cVar);
            eVar2.e().setOnClickListener(new View.OnClickListener() { // from class: o.ze
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C9892yZ.o(drM.this, view);
                }
            });
            eVar2.e().setVisibility(0);
            eVar2.d().setVisibility(0);
            eVar2.e().setTag(C9834xU.g.b, new b(cVar, drm));
            this.j.put(str2, eVar2);
        }
        h();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o(drM drm, View view) {
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

    private final void b(e eVar, boolean z) {
        C9696vK.c(eVar.e(), null, null, z ? this.c : null, null, 11, null);
    }

    protected int a(int i) {
        return View.MeasureSpec.getSize(i);
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (View.MeasureSpec.getMode(i) != 0) {
            int a2 = a(i);
            int i3 = 0;
            for (e eVar : this.g) {
                i3 += eVar.e().getMeasuredWidth();
            }
            if (a2 < i3) {
                if (this.g.size() > e()) {
                    addOnLayoutChangeListener(new d());
                }
                for (e eVar2 : this.g) {
                    eVar2.e().setMaxWidth((eVar2.e().getMeasuredWidth() * a2) / i3);
                }
            }
        }
    }

    @Override // o.InterfaceC9957zl
    public void setSubCategoryVisibility(int i) {
        this.d.h.setVisibility(i);
        this.q = i == 0;
        if (i != 0 || isLaidOut()) {
            return;
        }
        j();
    }

    @Override // o.InterfaceC9957zl
    public void setSubCategoryLabel(String str, String str2) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) str2, "");
        if (C8632dsu.c((Object) this.d.h.getText(), (Object) str) && C8632dsu.c((Object) this.n, (Object) str2)) {
            return;
        }
        this.d.h.setText(str);
        this.n = str2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(drM drm, View view) {
        C8632dsu.c((Object) drm, "");
        drm.invoke(view);
    }

    @Override // o.InterfaceC9957zl
    public void setSubCategoryClickListener(final drM<? super View, dpR> drm) {
        C8632dsu.c((Object) drm, "");
        this.d.h.setOnClickListener(new View.OnClickListener() { // from class: o.zc
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C9892yZ.i(drM.this, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(drM drm, View view) {
        C8632dsu.c((Object) drm, "");
        drm.invoke(view);
    }

    @Override // o.InterfaceC9957zl
    public void setLogoClickListener(final drM<? super View, dpR> drm) {
        C8632dsu.c((Object) drm, "");
        this.d.c.setOnClickListener(new View.OnClickListener() { // from class: o.zd
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C9892yZ.h(drM.this, view);
            }
        });
        this.d.d.setOnClickListener(new View.OnClickListener() { // from class: o.zf
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C9892yZ.g(drM.this, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(drM drm, View view) {
        C8632dsu.c((Object) drm, "");
        drm.invoke(view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b(int i) {
        if (i < this.g.size()) {
            e eVar = this.g.get(i);
            C8632dsu.a(eVar, "");
            e eVar2 = eVar;
            this.g.remove(i);
            eVar2.d().setVisibility(8);
            eVar2.e().setVisibility(8);
            eVar2.e().setOnClickListener(new View.OnClickListener() { // from class: o.za
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C9892yZ.b(view);
                }
            });
        }
    }

    @Override // o.InterfaceC9957zl
    public void d() {
        C1203Sq e2;
        ViewPropertyAnimator animate;
        ViewPropertyAnimator startDelay;
        e eVar = this.f13932o;
        if (eVar != null && (e2 = eVar.e()) != null && (animate = e2.animate()) != null && (startDelay = animate.setStartDelay(0L)) != null) {
            startDelay.cancel();
        }
        this.d.h.animate().cancel();
        this.d.d.animate().cancel();
        i();
        this.q = false;
        this.d.h.animate().alpha(0.0f).setDuration(200L).setInterpolator(this.i).start();
        this.d.d.animate().alpha(0.0f).setDuration(200L).withEndAction(new Runnable() { // from class: o.yY
            @Override // java.lang.Runnable
            public final void run() {
                C9892yZ.f(C9892yZ.this);
            }
        }).setInterpolator(this.i).start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(C9892yZ c9892yZ) {
        int a2;
        int i;
        C8632dsu.c((Object) c9892yZ, "");
        C1203Sq c1203Sq = c9892yZ.d.h;
        C8632dsu.a(c1203Sq, "");
        c1203Sq.setVisibility(8);
        c9892yZ.d.d.setVisibility(8);
        c9892yZ.k = null;
        c9892yZ.a(true);
        e eVar = c9892yZ.f13932o;
        if (eVar == null) {
            i = 0;
        } else {
            a2 = C8576dqs.a(c9892yZ.g, eVar);
            i = 1 + a2;
        }
        c9892yZ.h = (i * 150) + 150;
        c9892yZ.g();
    }

    @Override // o.InterfaceC9957zl
    public void setSelectedPrimaryGenre(String str) {
        C8632dsu.c((Object) str, "");
        e eVar = this.j.get(str);
        if (eVar == null || C8632dsu.c(eVar, this.f13932o)) {
            return;
        }
        b(eVar);
    }

    protected final void a(boolean z) {
        if (z || !C8632dsu.c(this.d.e.getLayoutTransition(), this.b)) {
            this.d.e.setLayoutTransition(this.b);
        } else {
            this.d.e.setLayoutTransition(null);
        }
    }

    protected final void b(e eVar) {
        C1203Sq e2;
        C1203Sq e3;
        C8632dsu.c((Object) eVar, "");
        if (C8632dsu.c(this.f13932o, eVar)) {
            return;
        }
        if (this.f13932o != null) {
            a(false);
            e eVar2 = this.f13932o;
            if (eVar2 != null && (e3 = eVar2.e()) != null) {
                C9870yD.d(e3, 0, 0);
            }
            e eVar3 = this.f13932o;
            C1203Sq e4 = eVar3 != null ? eVar3.e() : null;
            if (e4 != null) {
                e4.setVisibility(8);
            }
            e eVar4 = this.f13932o;
            if (eVar4 != null && (e2 = eVar4.e()) != null) {
                C1203Sq.a(e2, null, this.t, null, null, false, 0, 0, 0, 0, false, false, 2045, null);
            }
            C1203Sq.a(eVar.e(), null, this.l, null, null, false, 0, 0, 0, 0, false, false, 2045, null);
            this.f = eVar;
            this.f13932o = eVar;
            eVar.e().setVisibility(0);
            eVar.e().setAlpha(1.0f);
            C9870yD.d(eVar.e(), 0, this.m);
            return;
        }
        a(true);
        this.f = eVar;
        this.f13932o = eVar;
        if (isLaidOut()) {
            long indexOf = eVar.e().getVisibility() != 8 ? 150 + ((this.g.indexOf(eVar) + 1) * 150) : 150L;
            this.h = indexOf;
            this.b.setDuration(4, indexOf);
            this.b.setDuration(0, 200L);
            eVar.e().animate().setStartDelay(0L).cancel();
            this.q = false;
            a(200L, new drO<dpR>() { // from class: com.netflix.android.widgetry.widget.AroRibbonWithPills$selectSection$2
                {
                    super(0);
                }

                @Override // o.drO
                public /* synthetic */ dpR invoke() {
                    e();
                    return dpR.c;
                }

                public final void e() {
                    C9892yZ.this.b();
                }
            });
            return;
        }
        b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void a(long j, drO<dpR> dro) {
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.d = dro;
        for (e eVar : this.g) {
            if (!C8632dsu.c(eVar, this.f13932o)) {
                eVar.e().animate().setStartDelay(0L).cancel();
                eVar.e().animate().alpha(0.0f).setDuration(j).withEndAction(new Runnable() { // from class: o.zg
                    @Override // java.lang.Runnable
                    public final void run() {
                        C9892yZ.d(Ref.ObjectRef.this);
                    }
                }).start();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(Ref.ObjectRef objectRef) {
        C8632dsu.c((Object) objectRef, "");
        drO dro = (drO) objectRef.d;
        if (dro != null) {
            dro.invoke();
        }
        objectRef.d = null;
    }

    @Override // android.view.View
    public boolean isLaidOut() {
        return getWidth() > 0 && getHeight() > 0;
    }

    protected void c(e eVar) {
        C8632dsu.c((Object) eVar, "");
        C9870yD.d(eVar.e(), 0, 0);
        eVar.d().setVisibility(0);
        eVar.e().setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(drM drm, View view) {
        C8632dsu.c((Object) drm, "");
        drm.invoke(view);
    }

    protected void e(e eVar) {
        C8632dsu.c((Object) eVar, "");
        eVar.e().setAlpha(0.0f);
        eVar.e().setVisibility(0);
        eVar.e().animate().setStartDelay(0L).cancel();
        eVar.e().animate().alpha(1.0f).setStartDelay(this.h / 2).setDuration(200L).setInterpolator(this.i).setListener(null).start();
        if (eVar.c()) {
            eVar.e().setVisibility(0);
            eVar.d().setVisibility(0);
            return;
        }
        eVar.e().setVisibility(8);
        eVar.d().setVisibility(8);
    }

    private final e c(String str) {
        Object obj;
        InterfaceC9957zl.c c2;
        Iterator<T> it = this.g.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            Object tag = ((e) next).e().getTag(C9834xU.g.b);
            b bVar = tag instanceof b ? (b) tag : null;
            if (bVar != null && (c2 = bVar.c()) != null) {
                obj = c2.a();
            }
            if (C8632dsu.c(obj, (Object) str)) {
                obj = next;
                break;
            }
        }
        return (e) obj;
    }

    @Override // o.InterfaceC9957zl
    public void setupSubGenreHolder(String str, String str2, String str3, final drM<? super View, dpR> drm) {
        e eVar;
        boolean g;
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) str2, "");
        C8632dsu.c((Object) str3, "");
        C8632dsu.c((Object) drm, "");
        e c2 = c(str);
        if (c2 == null) {
            ArrayList<e> a2 = a();
            ListIterator<e> listIterator = a2.listIterator(a2.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    eVar = null;
                    break;
                }
                eVar = listIterator.previous();
                CharSequence text = eVar.e().getText();
                C8632dsu.a(text, "");
                g = C8691duz.g(text);
                if (!g) {
                    break;
                }
            }
            C8632dsu.d(eVar);
            c2 = eVar;
        }
        c2.e().setText(str2);
        c2.e().setTag(C9834xU.g.c, new InterfaceC9957zl.c(str3, str2, false));
        c2.e(false);
        b(c2, true);
        c2.e().setOnClickListener(new View.OnClickListener() { // from class: o.zh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C9892yZ.l(drM.this, view);
            }
        });
        addOnLayoutChangeListener(new a(c2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l(drM drm, View view) {
        C8632dsu.c((Object) drm, "");
        drm.invoke(view);
    }

    private final void h() {
        int t;
        boolean g;
        ArrayList<e> arrayList = this.g;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            CharSequence text = ((e) obj).e().getText();
            C8632dsu.a(text, "");
            g = C8691duz.g(text);
            if (true ^ g) {
                arrayList2.add(obj);
            }
        }
        int i = 0;
        for (Object obj2 : arrayList2) {
            if (i < 0) {
                C8569dql.h();
            }
            e eVar = (e) obj2;
            t = C8569dql.t(arrayList2);
            b(eVar, i == t);
            i++;
        }
    }

    private final void i() {
        for (e eVar : this.g) {
            Object tag = eVar.e().getTag(C9834xU.g.b);
            b bVar = tag instanceof b ? (b) tag : null;
            if (bVar != null) {
                eVar.e().setText(bVar.c().b());
                eVar.e().setTag(C9834xU.g.c, bVar.c());
                eVar.e(bVar.c().d());
                C1203Sq e2 = eVar.e();
                final drM<View, dpR> e3 = bVar.e();
                e2.setOnClickListener(new View.OnClickListener() { // from class: o.zb
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        C9892yZ.f(drM.this, view);
                    }
                });
            }
        }
    }

    private final void g() {
        e.getLogTag();
        for (e eVar : this.g) {
            CharSequence text = eVar.e().getText();
            C8632dsu.a(text, "");
            if (text.length() > 0) {
                c(eVar);
                if (!C8632dsu.c(eVar, this.f13932o)) {
                    e(eVar);
                } else {
                    C1203Sq.a(eVar.e(), null, this.t, null, null, false, 0, 0, 0, 0, false, false, 2045, null);
                }
            }
        }
        this.f13932o = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b() {
        e.getLogTag();
        final boolean z = true;
        a(true);
        e eVar = this.f13932o;
        z = (eVar == null || !eVar.c()) ? false : false;
        e eVar2 = this.f13932o;
        if (eVar2 != null) {
            C1203Sq.a(eVar2.e(), null, this.l, null, null, false, 0, 0, 0, 0, false, false, 2045, null);
            C9870yD.d(eVar2.e(), 0, this.m);
            if (z) {
                this.d.h.setAlpha(0.0f);
                this.d.h.setVisibility(0);
            }
            this.d.d.setAlpha(0.0f);
            this.d.d.setVisibility(0);
        }
        for (e eVar3 : this.g) {
            eVar3.d().setVisibility(8);
            if (!C8632dsu.c(eVar3, this.f13932o)) {
                eVar3.e().setVisibility(8);
            }
        }
        if (isLaidOut()) {
            this.k = new drO<dpR>() { // from class: com.netflix.android.widgetry.widget.AroRibbonWithPills$changeLayoutAfterSelection$4
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
                    if (z) {
                        this.j();
                    }
                    this.f();
                }
            };
            return;
        }
        if (z) {
            j();
        }
        f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void f() {
        e.getLogTag();
        if (isLaidOut()) {
            this.d.d.animate().cancel();
            this.d.d.animate().alpha(1.0f).setDuration(200L).setInterpolator(this.i).setListener(null).start();
            return;
        }
        this.d.d.setAlpha(1.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void j() {
        this.q = true;
        e.getLogTag();
        e eVar = this.f13932o;
        if (eVar == null || (eVar != null && eVar.c())) {
            if (isLaidOut()) {
                this.d.h.animate().cancel();
                this.d.h.animate().alpha(1.0f).setDuration(200L).setInterpolator(this.i).setListener(null).start();
                return;
            }
            this.d.h.setAlpha(1.0f);
        }
    }
}
