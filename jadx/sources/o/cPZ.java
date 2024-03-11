package o;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.content.ContextCompat;
import com.netflix.mediaclient.service.pushnotification.Payload;
import o.C9834xU;
import o.cPS;
import o.cPX;
import o.cPZ;
import o.dpR;

/* loaded from: classes4.dex */
public final class cPZ extends FrameLayout implements cPT {
    public static final b e = new b(null);
    private final String a;
    private final Drawable b;
    private cPP c;
    private final ImageView d;
    private final String f;
    private final C1206St g;
    private final Drawable h;
    private final cPZ i;
    private int j;
    private final String k;
    private final Drawable l;
    private final String m;
    private final String n;

    /* renamed from: o  reason: collision with root package name */
    private final Drawable f13689o;
    private C5995cQb t;

    @Override // o.cPT
    /* renamed from: b */
    public cPZ c() {
        return this.i;
    }

    @Override // o.cPT
    public int d() {
        return this.j;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptHoverEvent(MotionEvent motionEvent) {
        C8632dsu.c((Object) motionEvent, "");
        return true;
    }

    @Override // o.cPT
    public void setDark(boolean z) {
    }

    /* loaded from: classes4.dex */
    public static final class b extends C1045Mp {
        public /* synthetic */ b(C8627dsp c8627dsp) {
            this();
        }

        private b() {
            super("GameRatingButton");
        }
    }

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
        if (i != this.j) {
            this.j = i;
            e();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cPZ(Context context) {
        super(context);
        C8632dsu.c((Object) context, "");
        this.c = new a();
        Drawable drawable = ContextCompat.getDrawable(getContext(), C9834xU.j.v);
        C8632dsu.d(drawable);
        Drawable mutate = drawable.mutate();
        C8632dsu.a(mutate, "");
        this.f13689o = mutate;
        Drawable drawable2 = ContextCompat.getDrawable(getContext(), C9834xU.j.C);
        C8632dsu.d(drawable2);
        Drawable mutate2 = drawable2.mutate();
        C8632dsu.a(mutate2, "");
        this.l = mutate2;
        Drawable drawable3 = ContextCompat.getDrawable(getContext(), C9834xU.j.y);
        C8632dsu.d(drawable3);
        Drawable mutate3 = drawable3.mutate();
        C8632dsu.a(mutate3, "");
        this.h = mutate3;
        Drawable drawable4 = ContextCompat.getDrawable(getContext(), C9834xU.j.w);
        C8632dsu.d(drawable4);
        Drawable mutate4 = drawable4.mutate();
        C8632dsu.a(mutate4, "");
        this.b = mutate4;
        String string = getContext().getString(cPS.c.f13687o);
        C8632dsu.a(string, "");
        this.m = string;
        String string2 = getContext().getString(cPS.c.l);
        C8632dsu.a(string2, "");
        this.n = string2;
        String string3 = getContext().getString(cPS.c.i);
        C8632dsu.a(string3, "");
        this.f = string3;
        String string4 = getContext().getString(cPX.g.d);
        C8632dsu.a(string4, "");
        this.k = string4;
        String string5 = getContext().getString(cPS.c.f);
        C8632dsu.a(string5, "");
        this.a = string5;
        View.inflate(getContext(), cPX.e.e, this);
        View findViewById = findViewById(cPX.a.d);
        C8632dsu.a(findViewById, "");
        this.g = (C1206St) findViewById;
        this.i = this;
        this.d = new ImageView(getContext());
        e();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cPZ(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C8632dsu.c((Object) context, "");
        this.c = new a();
        Drawable drawable = ContextCompat.getDrawable(getContext(), C9834xU.j.v);
        C8632dsu.d(drawable);
        Drawable mutate = drawable.mutate();
        C8632dsu.a(mutate, "");
        this.f13689o = mutate;
        Drawable drawable2 = ContextCompat.getDrawable(getContext(), C9834xU.j.C);
        C8632dsu.d(drawable2);
        Drawable mutate2 = drawable2.mutate();
        C8632dsu.a(mutate2, "");
        this.l = mutate2;
        Drawable drawable3 = ContextCompat.getDrawable(getContext(), C9834xU.j.y);
        C8632dsu.d(drawable3);
        Drawable mutate3 = drawable3.mutate();
        C8632dsu.a(mutate3, "");
        this.h = mutate3;
        Drawable drawable4 = ContextCompat.getDrawable(getContext(), C9834xU.j.w);
        C8632dsu.d(drawable4);
        Drawable mutate4 = drawable4.mutate();
        C8632dsu.a(mutate4, "");
        this.b = mutate4;
        String string = getContext().getString(cPS.c.f13687o);
        C8632dsu.a(string, "");
        this.m = string;
        String string2 = getContext().getString(cPS.c.l);
        C8632dsu.a(string2, "");
        this.n = string2;
        String string3 = getContext().getString(cPS.c.i);
        C8632dsu.a(string3, "");
        this.f = string3;
        String string4 = getContext().getString(cPX.g.d);
        C8632dsu.a(string4, "");
        this.k = string4;
        String string5 = getContext().getString(cPS.c.f);
        C8632dsu.a(string5, "");
        this.a = string5;
        View.inflate(getContext(), cPX.e.e, this);
        View findViewById = findViewById(cPX.a.d);
        C8632dsu.a(findViewById, "");
        this.g = (C1206St) findViewById;
        this.i = this;
        this.d = new ImageView(getContext());
        e();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cPZ(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C8632dsu.c((Object) context, "");
        this.c = new a();
        Drawable drawable = ContextCompat.getDrawable(getContext(), C9834xU.j.v);
        C8632dsu.d(drawable);
        Drawable mutate = drawable.mutate();
        C8632dsu.a(mutate, "");
        this.f13689o = mutate;
        Drawable drawable2 = ContextCompat.getDrawable(getContext(), C9834xU.j.C);
        C8632dsu.d(drawable2);
        Drawable mutate2 = drawable2.mutate();
        C8632dsu.a(mutate2, "");
        this.l = mutate2;
        Drawable drawable3 = ContextCompat.getDrawable(getContext(), C9834xU.j.y);
        C8632dsu.d(drawable3);
        Drawable mutate3 = drawable3.mutate();
        C8632dsu.a(mutate3, "");
        this.h = mutate3;
        Drawable drawable4 = ContextCompat.getDrawable(getContext(), C9834xU.j.w);
        C8632dsu.d(drawable4);
        Drawable mutate4 = drawable4.mutate();
        C8632dsu.a(mutate4, "");
        this.b = mutate4;
        String string = getContext().getString(cPS.c.f13687o);
        C8632dsu.a(string, "");
        this.m = string;
        String string2 = getContext().getString(cPS.c.l);
        C8632dsu.a(string2, "");
        this.n = string2;
        String string3 = getContext().getString(cPS.c.i);
        C8632dsu.a(string3, "");
        this.f = string3;
        String string4 = getContext().getString(cPX.g.d);
        C8632dsu.a(string4, "");
        this.k = string4;
        String string5 = getContext().getString(cPS.c.f);
        C8632dsu.a(string5, "");
        this.a = string5;
        View.inflate(getContext(), cPX.e.e, this);
        View findViewById = findViewById(cPX.a.d);
        C8632dsu.a(findViewById, "");
        this.g = (C1206St) findViewById;
        this.i = this;
        this.d = new ImageView(getContext());
        e();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        String name = Button.class.getName();
        C8632dsu.a(name, "");
        return name;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void e() {
        Drawable drawable;
        String str;
        String str2;
        int d2 = d();
        if (d2 == 1) {
            drawable = this.h;
            str = this.f;
            str2 = Payload.Action.THUMBS_DOWN;
        } else if (d2 == 2) {
            drawable = this.l;
            str = this.n;
            str2 = Payload.Action.THUMBS_UP;
        } else if (d2 != 3) {
            drawable = this.b;
            str = this.k;
            str2 = "UNRATED";
        } else {
            drawable = this.f13689o;
            str = this.m;
            str2 = "THUMBS_WAY_UP";
        }
        this.g.setCompoundDrawables(drawable, null, null, null);
        this.g.setText(str);
        this.g.setContentDescription(this.a);
        this.g.setTag(str2);
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
        this.c = d(cpp);
        setOnClickListener(new View.OnClickListener() { // from class: o.cQc
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                cPZ.a(cPZ.this, coordinatorLayout, view);
            }
        });
        setClickable(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(cPZ cpz, CoordinatorLayout coordinatorLayout, View view) {
        C8632dsu.c((Object) cpz, "");
        C8632dsu.c((Object) coordinatorLayout, "");
        cpz.c(coordinatorLayout);
    }

    private final void c(CoordinatorLayout coordinatorLayout) {
        this.g.setText("");
        this.g.setContentDescription("");
        this.g.setTag("");
        this.g.setCompoundDrawables(null, null, null, null);
        Context context = getContext();
        C8632dsu.a(context, "");
        C5995cQb c5995cQb = new C5995cQb(context, this.c, cPX.e.a, false, new drO<dpR>() { // from class: com.netflix.mediaclient.ui.rating.impl.widget.GameRatingButton$openOverlay$1
            {
                super(0);
            }

            public final void d() {
                cPZ.this.e();
            }

            @Override // o.drO
            public /* synthetic */ dpR invoke() {
                d();
                return dpR.c;
            }
        });
        c5995cQb.a(coordinatorLayout, this);
        this.t = c5995cQb;
        getParent().requestDisallowInterceptTouchEvent(true);
        this.c.a(this);
    }

    /* loaded from: classes4.dex */
    public static final class d implements cPP {
        final /* synthetic */ cPZ a;
        final /* synthetic */ cPP b;

        d(cPP cpp, cPZ cpz) {
            this.b = cpp;
            this.a = cpz;
        }

        @Override // o.cPP
        public void a(cPT cpt) {
            C8632dsu.c((Object) cpt, "");
            this.b.a(cpt);
        }

        @Override // o.cPP
        public void d(cPT cpt, int i) {
            C8632dsu.c((Object) cpt, "");
            this.a.setRating(i);
            this.b.d(cpt, i);
        }
    }

    private final cPP d(cPP cpp) {
        return new d(cpp, this);
    }
}
