package o;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.View;
import android.widget.CompoundButton;
import androidx.core.content.ContextCompat;
import o.C3796bKz;

/* renamed from: o.bLr  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3815bLr extends AbstractC3336ax<c> {
    private String b;
    private boolean c;
    private Integer d;
    private int i;
    private CompoundButton.OnCheckedChangeListener l;
    private final CompoundButton.OnCheckedChangeListener m;

    /* renamed from: o  reason: collision with root package name */
    private CharSequence f13520o;
    private boolean f = true;
    private int j = -1;
    private int n = -1;
    private int g = -1;
    private int h = -1;

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(View view) {
    }

    @Override // o.AbstractC3073as
    public int a() {
        return C3796bKz.g.G;
    }

    public final void a(boolean z) {
        this.c = z;
    }

    public final void b(Integer num) {
        this.d = num;
    }

    public final void c(String str) {
        this.b = str;
    }

    public void d(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.l = onCheckedChangeListener;
    }

    public final Integer i() {
        return this.d;
    }

    public final String k() {
        return this.b;
    }

    public final void k_(int i) {
        this.j = i;
    }

    public final int l() {
        return this.g;
    }

    public void l_(int i) {
        this.n = i;
    }

    public final boolean m() {
        return this.f;
    }

    public final int n() {
        return this.h;
    }

    public final boolean o() {
        return this.c;
    }

    public final int p() {
        return this.j;
    }

    public final int q() {
        return this.i;
    }

    public CompoundButton.OnCheckedChangeListener r() {
        return this.l;
    }

    public int s() {
        return this.n;
    }

    protected CompoundButton.OnCheckedChangeListener t() {
        return this.m;
    }

    public CharSequence v() {
        return this.f13520o;
    }

    public void z_(CharSequence charSequence) {
        this.f13520o = charSequence;
    }

    public AbstractC3815bLr() {
        C1332Xp c1332Xp = C1332Xp.b;
        this.i = (int) TypedValue.applyDimension(1, 8, ((Context) C1332Xp.b(Context.class)).getResources().getDisplayMetrics());
        this.m = new CompoundButton.OnCheckedChangeListener() { // from class: o.bLw
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                AbstractC3815bLr.a(AbstractC3815bLr.this, compoundButton, z);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(AbstractC3815bLr abstractC3815bLr, CompoundButton compoundButton, boolean z) {
        C8632dsu.c((Object) abstractC3815bLr, "");
        C8632dsu.d(compoundButton);
        abstractC3815bLr.c((C1206St) compoundButton, z, abstractC3815bLr.d);
        CompoundButton.OnCheckedChangeListener r = abstractC3815bLr.r();
        if (r != null) {
            r.onCheckedChanged(compoundButton, z);
        }
    }

    @Override // o.AbstractC3336ax
    /* renamed from: a */
    public void e(c cVar) {
        C8632dsu.c((Object) cVar, "");
        cVar.e().setOnCheckedChangeListener(null);
        boolean z = this.f;
        CharSequence v = v();
        CharSequence charSequence = this.b;
        if (charSequence == null) {
            charSequence = v();
        }
        cVar.d(z, v, charSequence, this.i);
        a e2 = e2(cVar);
        Drawable d = e2 != null ? e2.d() : null;
        C1105Ow c1105Ow = d instanceof C1105Ow ? (C1105Ow) d : null;
        if (c1105Ow != null) {
            boolean isChecked = c1105Ow.isChecked();
            boolean z2 = this.c;
            if (isChecked != z2) {
                c1105Ow.setCheckedNoAnimation(z2);
            }
        }
        cVar.e().setChecked(this.c);
        cVar.e().setOnClickListener(new View.OnClickListener() { // from class: o.bLx
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AbstractC3815bLr.c(view);
            }
        });
        c(cVar.e(), cVar.e().isChecked(), this.d);
        cVar.e().setOnCheckedChangeListener(t());
        super.e((AbstractC3815bLr) cVar);
    }

    /* renamed from: e  reason: avoid collision after fix types in other method */
    private final a e2(c cVar) {
        if (this.j != cVar.c().left || s() != cVar.c().top || this.g != cVar.c().right || this.h != cVar.c().bottom) {
            Context context = cVar.e().getContext();
            C8632dsu.a(context, "");
            Drawable e = e(context, this.j);
            Context context2 = cVar.e().getContext();
            C8632dsu.a(context2, "");
            Drawable e2 = e(context2, s());
            Context context3 = cVar.e().getContext();
            C8632dsu.a(context3, "");
            Drawable e3 = e(context3, this.g);
            Context context4 = cVar.e().getContext();
            C8632dsu.a(context4, "");
            Drawable e4 = e(context4, this.h);
            cVar.c().set(this.j, s(), this.g, this.h);
            cVar.a(new a(e, e2, e3, e4));
            cVar.e().setCompoundDrawablesRelativeWithIntrinsicBounds(e, e2, e3, e4);
        }
        return cVar.b();
    }

    private final Drawable e(Context context, int i) {
        if (i != -1) {
            Drawable drawable = ContextCompat.getDrawable(context, i);
            Integer num = this.d;
            if (num != null) {
                int intValue = num.intValue();
                OG og = drawable instanceof OG ? (OG) drawable : null;
                if (og != null) {
                    og.setTintColor(intValue);
                }
            }
            return drawable;
        }
        return null;
    }

    public final void c(C1206St c1206St, boolean z, Integer num) {
        C8632dsu.c((Object) c1206St, "");
        if (z && num != null) {
            int intValue = num.intValue();
            C9702vQ.c(c1206St, ColorStateList.valueOf(intValue));
            c1206St.setTextColor(intValue);
            return;
        }
        C9702vQ.c(c1206St, c1206St.a().g());
        c1206St.setTextColor(c1206St.a().m());
    }

    /* renamed from: o.bLr$c */
    /* loaded from: classes4.dex */
    public static final class c extends bIG {
        private final Rect c = new Rect();
        public C1206St d;
        private a e;

        public final void a(a aVar) {
            this.e = aVar;
        }

        public final a b() {
            return this.e;
        }

        public final void b(C1206St c1206St) {
            C8632dsu.c((Object) c1206St, "");
            this.d = c1206St;
        }

        public final Rect c() {
            return this.c;
        }

        public final C1206St e() {
            C1206St c1206St = this.d;
            if (c1206St != null) {
                return c1206St;
            }
            C8632dsu.d("");
            return null;
        }

        @Override // o.bIG
        public void a(View view) {
            C8632dsu.c((Object) view, "");
            b((C1206St) view);
        }

        public final void d(boolean z, CharSequence charSequence, CharSequence charSequence2, int i) {
            if (z && charSequence != null && charSequence.length() != 0) {
                e().setCompoundDrawablePadding(i);
                e().setText(charSequence);
            } else {
                C1206St e = e();
                C1332Xp c1332Xp = C1332Xp.b;
                e.setCompoundDrawablePadding((int) TypedValue.applyDimension(1, 0, ((Context) C1332Xp.b(Context.class)).getResources().getDisplayMetrics()));
                e().setText((CharSequence) null);
            }
            e().setContentDescription(charSequence2);
        }
    }

    /* renamed from: o.bLr$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private final Drawable a;
        private final Drawable b;
        private final Drawable c;
        private final Drawable e;

        public final Drawable d() {
            Drawable drawable = this.a;
            if (drawable == null) {
                Drawable drawable2 = this.c;
                if (drawable2 == null) {
                    Drawable drawable3 = this.e;
                    return drawable3 == null ? this.b : drawable3;
                }
                return drawable2;
            }
            return drawable;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof a) {
                a aVar = (a) obj;
                return C8632dsu.c(this.a, aVar.a) && C8632dsu.c(this.c, aVar.c) && C8632dsu.c(this.e, aVar.e) && C8632dsu.c(this.b, aVar.b);
            }
            return false;
        }

        public int hashCode() {
            Drawable drawable = this.a;
            int hashCode = drawable == null ? 0 : drawable.hashCode();
            Drawable drawable2 = this.c;
            int hashCode2 = drawable2 == null ? 0 : drawable2.hashCode();
            Drawable drawable3 = this.e;
            int hashCode3 = drawable3 == null ? 0 : drawable3.hashCode();
            Drawable drawable4 = this.b;
            return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (drawable4 != null ? drawable4.hashCode() : 0);
        }

        public String toString() {
            Drawable drawable = this.a;
            Drawable drawable2 = this.c;
            Drawable drawable3 = this.e;
            Drawable drawable4 = this.b;
            return "CompoundDrawables(start=" + drawable + ", top=" + drawable2 + ", end=" + drawable3 + ", bottom=" + drawable4 + ")";
        }

        public a(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
            this.a = drawable;
            this.c = drawable2;
            this.e = drawable3;
            this.b = drawable4;
        }
    }
}
