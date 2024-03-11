package o;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import o.C9834xU;
import o.cPS;
import o.cPX;

/* renamed from: o.cQd  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5997cQd extends FrameLayout implements cPT {
    public static final b b = new b(null);
    private final String a;
    private final ImageView c;
    private final ImageView d;
    private final C1204Sr e;
    private boolean f;
    private final Drawable g;
    private cPP h;
    private int i;
    private ColorStateList j;
    private final Drawable k;
    private final Drawable l;
    private boolean m;
    private final String n;

    /* renamed from: o  reason: collision with root package name */
    private final C5997cQd f13694o;
    private final Drawable p;
    private final String q;
    private final String r;
    private final String s;
    private C5995cQb t;

    @Override // o.cPT
    public int d() {
        return this.i;
    }

    @Override // o.cPT
    /* renamed from: e */
    public C5997cQd c() {
        return this.f13694o;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptHoverEvent(MotionEvent motionEvent) {
        C8632dsu.c((Object) motionEvent, "");
        return true;
    }

    public final void setRespectLayoutDirection(boolean z) {
        this.m = z;
    }

    /* renamed from: o.cQd$b */
    /* loaded from: classes4.dex */
    public static final class b extends C1045Mp {
        public /* synthetic */ b(C8627dsp c8627dsp) {
            this();
        }

        private b() {
            super("UserRatingButtonV2");
        }
    }

    /* renamed from: o.cQd$a */
    /* loaded from: classes4.dex */
    public static final class a implements cPP {
        @Override // o.cPP
        public void a(cPT cpt) {
            C8632dsu.c((Object) cpt, "");
        }

        @Override // o.cPP
        public void d(cPT cpt, int i) {
            C8632dsu.c((Object) cpt, "");
        }

        a() {
        }
    }

    @Override // o.cPT
    public void setRating(int i) {
        if (i != this.i) {
            this.i = i;
            a();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5997cQd(Context context) {
        super(context);
        C8632dsu.c((Object) context, "");
        this.h = new a();
        this.f = true;
        Drawable drawable = ContextCompat.getDrawable(getContext(), C9834xU.j.v);
        C8632dsu.d(drawable);
        Drawable mutate = drawable.mutate();
        C8632dsu.a(mutate, "");
        this.p = mutate;
        Drawable drawable2 = ContextCompat.getDrawable(getContext(), C9834xU.j.C);
        C8632dsu.d(drawable2);
        Drawable mutate2 = drawable2.mutate();
        C8632dsu.a(mutate2, "");
        this.l = mutate2;
        Drawable drawable3 = ContextCompat.getDrawable(getContext(), C9834xU.j.y);
        C8632dsu.d(drawable3);
        Drawable mutate3 = drawable3.mutate();
        C8632dsu.a(mutate3, "");
        this.k = mutate3;
        Drawable drawable4 = ContextCompat.getDrawable(getContext(), C9834xU.j.w);
        C8632dsu.d(drawable4);
        Drawable mutate4 = drawable4.mutate();
        C8632dsu.a(mutate4, "");
        this.g = mutate4;
        String string = getContext().getString(cPS.c.f13687o);
        C8632dsu.a(string, "");
        this.r = string;
        String string2 = getContext().getString(cPS.c.l);
        C8632dsu.a(string2, "");
        this.q = string2;
        String string3 = getContext().getString(cPS.c.i);
        C8632dsu.a(string3, "");
        this.n = string3;
        String string4 = getContext().getString(cPX.g.d);
        C8632dsu.a(string4, "");
        this.s = string4;
        String string5 = getContext().getString(cPS.c.j);
        C8632dsu.a(string5, "");
        this.a = string5;
        this.m = true;
        View.inflate(getContext(), cPX.e.c, this);
        View findViewById = findViewById(cPX.a.n);
        C8632dsu.a(findViewById, "");
        ImageView imageView = (ImageView) findViewById;
        this.d = imageView;
        View findViewById2 = findViewById(cPX.a.l);
        C8632dsu.a(findViewById2, "");
        this.e = (C1204Sr) findViewById2;
        this.f13694o = this;
        this.c = imageView;
        a();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5997cQd(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C8632dsu.c((Object) context, "");
        this.h = new a();
        this.f = true;
        Drawable drawable = ContextCompat.getDrawable(getContext(), C9834xU.j.v);
        C8632dsu.d(drawable);
        Drawable mutate = drawable.mutate();
        C8632dsu.a(mutate, "");
        this.p = mutate;
        Drawable drawable2 = ContextCompat.getDrawable(getContext(), C9834xU.j.C);
        C8632dsu.d(drawable2);
        Drawable mutate2 = drawable2.mutate();
        C8632dsu.a(mutate2, "");
        this.l = mutate2;
        Drawable drawable3 = ContextCompat.getDrawable(getContext(), C9834xU.j.y);
        C8632dsu.d(drawable3);
        Drawable mutate3 = drawable3.mutate();
        C8632dsu.a(mutate3, "");
        this.k = mutate3;
        Drawable drawable4 = ContextCompat.getDrawable(getContext(), C9834xU.j.w);
        C8632dsu.d(drawable4);
        Drawable mutate4 = drawable4.mutate();
        C8632dsu.a(mutate4, "");
        this.g = mutate4;
        String string = getContext().getString(cPS.c.f13687o);
        C8632dsu.a(string, "");
        this.r = string;
        String string2 = getContext().getString(cPS.c.l);
        C8632dsu.a(string2, "");
        this.q = string2;
        String string3 = getContext().getString(cPS.c.i);
        C8632dsu.a(string3, "");
        this.n = string3;
        String string4 = getContext().getString(cPX.g.d);
        C8632dsu.a(string4, "");
        this.s = string4;
        String string5 = getContext().getString(cPS.c.j);
        C8632dsu.a(string5, "");
        this.a = string5;
        this.m = true;
        View.inflate(getContext(), cPX.e.c, this);
        View findViewById = findViewById(cPX.a.n);
        C8632dsu.a(findViewById, "");
        ImageView imageView = (ImageView) findViewById;
        this.d = imageView;
        View findViewById2 = findViewById(cPX.a.l);
        C8632dsu.a(findViewById2, "");
        this.e = (C1204Sr) findViewById2;
        this.f13694o = this;
        this.c = imageView;
        c(attributeSet);
        a();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5997cQd(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C8632dsu.c((Object) context, "");
        this.h = new a();
        this.f = true;
        Drawable drawable = ContextCompat.getDrawable(getContext(), C9834xU.j.v);
        C8632dsu.d(drawable);
        Drawable mutate = drawable.mutate();
        C8632dsu.a(mutate, "");
        this.p = mutate;
        Drawable drawable2 = ContextCompat.getDrawable(getContext(), C9834xU.j.C);
        C8632dsu.d(drawable2);
        Drawable mutate2 = drawable2.mutate();
        C8632dsu.a(mutate2, "");
        this.l = mutate2;
        Drawable drawable3 = ContextCompat.getDrawable(getContext(), C9834xU.j.y);
        C8632dsu.d(drawable3);
        Drawable mutate3 = drawable3.mutate();
        C8632dsu.a(mutate3, "");
        this.k = mutate3;
        Drawable drawable4 = ContextCompat.getDrawable(getContext(), C9834xU.j.w);
        C8632dsu.d(drawable4);
        Drawable mutate4 = drawable4.mutate();
        C8632dsu.a(mutate4, "");
        this.g = mutate4;
        String string = getContext().getString(cPS.c.f13687o);
        C8632dsu.a(string, "");
        this.r = string;
        String string2 = getContext().getString(cPS.c.l);
        C8632dsu.a(string2, "");
        this.q = string2;
        String string3 = getContext().getString(cPS.c.i);
        C8632dsu.a(string3, "");
        this.n = string3;
        String string4 = getContext().getString(cPX.g.d);
        C8632dsu.a(string4, "");
        this.s = string4;
        String string5 = getContext().getString(cPS.c.j);
        C8632dsu.a(string5, "");
        this.a = string5;
        this.m = true;
        View.inflate(getContext(), cPX.e.c, this);
        View findViewById = findViewById(cPX.a.n);
        C8632dsu.a(findViewById, "");
        ImageView imageView = (ImageView) findViewById;
        this.d = imageView;
        View findViewById2 = findViewById(cPX.a.l);
        C8632dsu.a(findViewById2, "");
        this.e = (C1204Sr) findViewById2;
        this.f13694o = this;
        this.c = imageView;
        c(attributeSet);
        a();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        String name = Button.class.getName();
        C8632dsu.a(name, "");
        return name;
    }

    private final void c(AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, cPX.j.b);
        C8632dsu.a(obtainStyledAttributes, "");
        ColorStateList colorStateList = obtainStyledAttributes.getColorStateList(cPX.j.e);
        if (colorStateList == null) {
            colorStateList = ContextCompat.getColorStateList(getContext(), cPX.b.b);
            C8632dsu.d(colorStateList);
        }
        this.j = colorStateList;
        if (obtainStyledAttributes.hasValue(cPX.j.a)) {
            C1204Sr c1204Sr = this.e;
            c1204Sr.setTextSize(0, obtainStyledAttributes.getDimension(cPX.j.a, c1204Sr.getTextSize()));
        }
        setDark(obtainStyledAttributes.getBoolean(cPX.j.c, true));
        obtainStyledAttributes.recycle();
    }

    @Override // o.cPT
    public void setDark(boolean z) {
        ColorStateList colorStateList;
        this.f = z;
        C1204Sr c1204Sr = this.e;
        if (z) {
            colorStateList = this.j;
            if (colorStateList == null) {
                C8632dsu.d("");
                colorStateList = null;
            }
        } else {
            colorStateList = ContextCompat.getColorStateList(getContext(), cPX.b.d);
        }
        c1204Sr.setTextColor(colorStateList);
        setIconColor(ContextCompat.getColor(getContext(), this.f ? cPX.b.b : cPX.b.d));
    }

    public final void setIconColor(int i) {
        ColorStateList valueOf = ColorStateList.valueOf(i);
        C8632dsu.a(valueOf, "");
        DrawableCompat.setTintList(this.l, valueOf);
        DrawableCompat.setTintList(this.p, valueOf);
        DrawableCompat.setTintList(this.k, valueOf);
        DrawableCompat.setTintList(this.g, valueOf);
    }

    public final void setTextSize(int i) {
        this.e.setTextSize(0, i);
    }

    private final void a() {
        Drawable drawable;
        String str;
        int imageAlpha = this.d.getImageAlpha();
        int d = d();
        if (d == 1) {
            drawable = this.k;
            str = this.n;
        } else if (d == 2) {
            drawable = this.l;
            str = this.q;
        } else if (d != 3) {
            drawable = this.g;
            str = this.s;
        } else {
            drawable = this.p;
            str = this.r;
        }
        this.d.setImageDrawable(drawable);
        this.d.setImageAlpha(imageAlpha);
        this.e.setText(str);
        setContentDescription(this.a);
    }

    @Override // o.cPT
    public void setOnRateListener(final CoordinatorLayout coordinatorLayout, cPP cpp, boolean z, int i) {
        C8632dsu.c((Object) coordinatorLayout, "");
        C8632dsu.c((Object) cpp, "");
        if (!isClickable()) {
            setClickable(true);
        }
        if (!isFocusable()) {
            setFocusable(true);
        }
        this.h = e(cpp);
        setOnClickListener(new View.OnClickListener() { // from class: o.cQe
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C5997cQd.d(C5997cQd.this, coordinatorLayout, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(C5997cQd c5997cQd, CoordinatorLayout coordinatorLayout, View view) {
        C8632dsu.c((Object) c5997cQd, "");
        C8632dsu.c((Object) coordinatorLayout, "");
        c5997cQd.a(coordinatorLayout);
    }

    private final void a(CoordinatorLayout coordinatorLayout) {
        C5995cQb c5995cQb = this.t;
        if (c5995cQb == null) {
            Context context = getContext();
            C8632dsu.a(context, "");
            c5995cQb = new C5995cQb(context, this.h, 0, false, null, 28, null);
        }
        c5995cQb.a(coordinatorLayout, this);
        this.t = c5995cQb;
        getParent().requestDisallowInterceptTouchEvent(true);
        this.h.a(this);
    }

    /* renamed from: o.cQd$e */
    /* loaded from: classes4.dex */
    public static final class e implements cPP {
        final /* synthetic */ cPP c;
        final /* synthetic */ C5997cQd d;

        e(cPP cpp, C5997cQd c5997cQd) {
            this.c = cpp;
            this.d = c5997cQd;
        }

        @Override // o.cPP
        public void a(cPT cpt) {
            C8632dsu.c((Object) cpt, "");
            this.c.a(cpt);
        }

        @Override // o.cPP
        public void d(cPT cpt, int i) {
            C8632dsu.c((Object) cpt, "");
            this.d.setRating(i);
            this.c.d(cpt, i);
        }
    }

    private final cPP e(cPP cpp) {
        return new e(cpp, this);
    }
}
