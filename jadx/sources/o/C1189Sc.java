package o;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import com.netflix.android.org.json.zip.JSONzip;
import o.C9834xU;

/* renamed from: o.Sc  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1189Sc {
    private static final ColorStateList e;
    private final ColorStateList b;
    private final boolean c;
    private final boolean f;
    private final int g;
    private final int h;
    private final ColorStateList i;
    private final boolean j;
    private final ColorStateList k;
    private final CharSequence l;
    private final int m;
    private final int n;

    /* renamed from: o  reason: collision with root package name */
    private final int f13399o;
    private final ColorStateList p;
    private final boolean t;
    public static final e d = new e(null);
    public static final int a = 8;

    public C1189Sc() {
        this(null, null, null, null, 0, 0, 0, 0, false, null, 0, false, false, false, 16383, null);
    }

    public final boolean a() {
        return this.j;
    }

    public final int b() {
        return this.g;
    }

    public final ColorStateList c() {
        return this.b;
    }

    public final boolean d() {
        return this.f;
    }

    public final boolean e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1189Sc) {
            C1189Sc c1189Sc = (C1189Sc) obj;
            return C8632dsu.c(this.k, c1189Sc.k) && C8632dsu.c(this.b, c1189Sc.b) && C8632dsu.c(this.p, c1189Sc.p) && C8632dsu.c(this.i, c1189Sc.i) && this.f13399o == c1189Sc.f13399o && this.g == c1189Sc.g && this.n == c1189Sc.n && this.h == c1189Sc.h && this.f == c1189Sc.f && C8632dsu.c(this.l, c1189Sc.l) && this.m == c1189Sc.m && this.c == c1189Sc.c && this.j == c1189Sc.j && this.t == c1189Sc.t;
        }
        return false;
    }

    public final int f() {
        return this.m;
    }

    public final ColorStateList g() {
        return this.i;
    }

    public final ColorStateList h() {
        return this.k;
    }

    public int hashCode() {
        int hashCode = this.k.hashCode();
        int hashCode2 = this.b.hashCode();
        int hashCode3 = this.p.hashCode();
        int hashCode4 = this.i.hashCode();
        int hashCode5 = Integer.hashCode(this.f13399o);
        int hashCode6 = Integer.hashCode(this.g);
        int hashCode7 = Integer.hashCode(this.n);
        int hashCode8 = Integer.hashCode(this.h);
        int hashCode9 = Boolean.hashCode(this.f);
        CharSequence charSequence = this.l;
        return (((((((((((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + (charSequence == null ? 0 : charSequence.hashCode())) * 31) + Integer.hashCode(this.m)) * 31) + Boolean.hashCode(this.c)) * 31) + Boolean.hashCode(this.j)) * 31) + Boolean.hashCode(this.t);
    }

    public final int i() {
        return this.f13399o;
    }

    public final int j() {
        return this.h;
    }

    public final CharSequence k() {
        return this.l;
    }

    public final int l() {
        return this.n;
    }

    public final ColorStateList m() {
        return this.p;
    }

    public final boolean n() {
        return this.t;
    }

    public String toString() {
        ColorStateList colorStateList = this.k;
        ColorStateList colorStateList2 = this.b;
        ColorStateList colorStateList3 = this.p;
        ColorStateList colorStateList4 = this.i;
        int i = this.f13399o;
        int i2 = this.g;
        int i3 = this.n;
        int i4 = this.h;
        boolean z = this.f;
        CharSequence charSequence = this.l;
        int i5 = this.m;
        boolean z2 = this.c;
        boolean z3 = this.j;
        boolean z4 = this.t;
        return "NetflixButtonAttributes(strokeColor=" + colorStateList + ", buttonColor=" + colorStateList2 + ", textColor=" + colorStateList3 + ", iconColor=" + colorStateList4 + ", rippleColor=" + i + ", cornerRadius=" + i2 + ", strokeWidth=" + i3 + ", iconSize=" + i4 + ", iconCentered=" + z + ", text=" + ((Object) charSequence) + ", initialWidth=" + i5 + ", borderlessRipple=" + z2 + ", hasTint=" + z3 + ", tintIcon=" + z4 + ")";
    }

    public C1189Sc(ColorStateList colorStateList, ColorStateList colorStateList2, ColorStateList colorStateList3, ColorStateList colorStateList4, int i, int i2, int i3, int i4, boolean z, CharSequence charSequence, int i5, boolean z2, boolean z3, boolean z4) {
        C8632dsu.c((Object) colorStateList, "");
        C8632dsu.c((Object) colorStateList2, "");
        C8632dsu.c((Object) colorStateList3, "");
        C8632dsu.c((Object) colorStateList4, "");
        this.k = colorStateList;
        this.b = colorStateList2;
        this.p = colorStateList3;
        this.i = colorStateList4;
        this.f13399o = i;
        this.g = i2;
        this.n = i3;
        this.h = i4;
        this.f = z;
        this.l = charSequence;
        this.m = i5;
        this.c = z2;
        this.j = z3;
        this.t = z4;
    }

    public /* synthetic */ C1189Sc(ColorStateList colorStateList, ColorStateList colorStateList2, ColorStateList colorStateList3, ColorStateList colorStateList4, int i, int i2, int i3, int i4, boolean z, CharSequence charSequence, int i5, boolean z2, boolean z3, boolean z4, int i6, C8627dsp c8627dsp) {
        this((i6 & 1) != 0 ? e : colorStateList, (i6 & 2) != 0 ? e : colorStateList2, (i6 & 4) != 0 ? e : colorStateList3, (i6 & 8) != 0 ? e : colorStateList4, (i6 & 16) != 0 ? 0 : i, (i6 & 32) != 0 ? 0 : i2, (i6 & 64) != 0 ? 0 : i3, (i6 & 128) != 0 ? -1 : i4, (i6 & JSONzip.end) != 0 ? false : z, (i6 & 512) != 0 ? null : charSequence, (i6 & 1024) != 0 ? 0 : i5, (i6 & 2048) == 0 ? z2 : false, (i6 & 4096) != 0 ? true : z3, (i6 & 8192) == 0 ? z4 : true);
    }

    /* renamed from: o.Sc$e */
    /* loaded from: classes3.dex */
    public static final class e extends C1045Mp {
        public /* synthetic */ e(C8627dsp c8627dsp) {
            this();
        }

        private e() {
            super("NetflixButtonAttributes");
        }

        static /* synthetic */ ColorStateList d(e eVar, TypedArray typedArray, int i, ColorStateList colorStateList, int i2, Object obj) {
            if ((i2 & 4) != 0) {
                colorStateList = ColorStateList.valueOf(0);
                C8632dsu.a(colorStateList, "");
            }
            return eVar.c(typedArray, i, colorStateList);
        }

        private final ColorStateList c(TypedArray typedArray, int i, ColorStateList colorStateList) {
            ColorStateList colorStateList2 = typedArray.getColorStateList(i);
            return colorStateList2 == null ? colorStateList : colorStateList2;
        }

        public final C1189Sc d(Context context, AttributeSet attributeSet) {
            ColorStateList d;
            ColorStateList d2;
            ColorStateList d3;
            C8632dsu.c((Object) context, "");
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C9834xU.n.B);
            C8632dsu.a(obtainStyledAttributes, "");
            try {
                d = d(this, obtainStyledAttributes, C9834xU.n.R, null, 4, null);
                d2 = d(this, obtainStyledAttributes, C9834xU.n.C, null, 4, null);
                d3 = d(this, obtainStyledAttributes, C9834xU.n.L, null, 4, null);
            } catch (Throwable th) {
                th = th;
            }
            try {
                C1189Sc c1189Sc = new C1189Sc(d3, d2, d, c(obtainStyledAttributes, C9834xU.n.I, d), obtainStyledAttributes.getColor(C9834xU.n.f13920J, d2.getColorForState(new int[]{16842919}, 0)), obtainStyledAttributes.getDimensionPixelSize(C9834xU.n.E, 0), obtainStyledAttributes.getDimensionPixelSize(C9834xU.n.N, 0), obtainStyledAttributes.getDimensionPixelSize(C9834xU.n.F, 0), obtainStyledAttributes.getBoolean(C9834xU.n.G, false), obtainStyledAttributes.getString(C9834xU.n.M), obtainStyledAttributes.getDimensionPixelSize(C9834xU.n.K, 0), obtainStyledAttributes.getBoolean(C9834xU.n.z, false), obtainStyledAttributes.getBoolean(C9834xU.n.H, true), obtainStyledAttributes.getBoolean(C9834xU.n.Q, true));
                obtainStyledAttributes.recycle();
                return c1189Sc;
            } catch (Throwable th2) {
                th = th2;
                obtainStyledAttributes.recycle();
                throw th;
            }
        }

        @SuppressLint({"ResourceType"})
        public final C1189Sc b(Context context, int i) {
            ColorStateList d;
            ColorStateList d2;
            C8632dsu.c((Object) context, "");
            TypedArray obtainStyledAttributes = new ContextThemeWrapper(context, i).obtainStyledAttributes(new int[]{C9834xU.b.n, C9834xU.b.c, C9834xU.b.k, C9834xU.b.l, C9834xU.b.b, C9834xU.b.m, C9834xU.b.h, C9834xU.b.f, C9834xU.b.g, C9834xU.b.f13912o, C9834xU.b.j, C9834xU.b.d, C9834xU.b.i, C9834xU.b.p});
            C8632dsu.a(obtainStyledAttributes, "");
            try {
                d = d(this, obtainStyledAttributes, 1, null, 4, null);
                d2 = d(this, obtainStyledAttributes, 2, null, 4, null);
            } catch (Throwable th) {
                th = th;
            }
            try {
                C1189Sc c1189Sc = new C1189Sc(d(this, obtainStyledAttributes, 0, null, 4, null), d, d2, c(obtainStyledAttributes, 7, d2), obtainStyledAttributes.getColor(3, d.getColorForState(new int[]{16842919}, 0)), obtainStyledAttributes.getDimensionPixelSize(4, 0), obtainStyledAttributes.getDimensionPixelSize(5, 0), obtainStyledAttributes.getDimensionPixelSize(6, 0), obtainStyledAttributes.getBoolean(8, false), obtainStyledAttributes.getString(9), obtainStyledAttributes.getDimensionPixelSize(10, 0), obtainStyledAttributes.getBoolean(11, false), obtainStyledAttributes.getBoolean(12, true), obtainStyledAttributes.getBoolean(13, true));
                obtainStyledAttributes.recycle();
                return c1189Sc;
            } catch (Throwable th2) {
                th = th2;
                obtainStyledAttributes.recycle();
                throw th;
            }
        }
    }

    static {
        ColorStateList valueOf = ColorStateList.valueOf(0);
        C8632dsu.a(valueOf, "");
        e = valueOf;
    }
}
