package o;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.netflix.ale.AleCryptoBouncyCastle;
import com.netflix.android.org.json.zip.JSONzip;
import org.linphone.core.Privacy;

/* renamed from: o.aMb  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1729aMb {
    public static final d a = new d(null);
    private final float b;
    private final int c;
    private final boolean d;
    private final boolean e;
    private final int f;
    private final int g;
    private final boolean h;
    private final boolean i;
    private final b j;
    private final float k;
    private final int l;
    private final int m;
    private final int n;

    /* renamed from: o  reason: collision with root package name */
    private final int f13433o;
    private final int p;
    private final int q;
    private final boolean r;
    private final int s;
    private final C1729aMb t;
    private final int u;
    private final int w;
    private final int x;
    private final int y;

    /* renamed from: o.aMb$b */
    /* loaded from: classes3.dex */
    public interface b {
        RecyclerView.ItemDecoration d(AppCompatActivity appCompatActivity);
    }

    public static /* synthetic */ C1729aMb b(C1729aMb c1729aMb, int i, int i2, float f, int i3, int i4, int i5, int i6, int i7, float f2, int i8, b bVar, boolean z, boolean z2, boolean z3, int i9, int i10, int i11, boolean z4, int i12, C1729aMb c1729aMb2, int i13, int i14, boolean z5, int i15, Object obj) {
        return c1729aMb.b((i15 & 1) != 0 ? c1729aMb.w : i, (i15 & 2) != 0 ? c1729aMb.n : i2, (i15 & 4) != 0 ? c1729aMb.b : f, (i15 & 8) != 0 ? c1729aMb.f13433o : i3, (i15 & 16) != 0 ? c1729aMb.l : i4, (i15 & 32) != 0 ? c1729aMb.f : i5, (i15 & 64) != 0 ? c1729aMb.g : i6, (i15 & 128) != 0 ? c1729aMb.u : i7, (i15 & JSONzip.end) != 0 ? c1729aMb.k : f2, (i15 & 512) != 0 ? c1729aMb.m : i8, (i15 & 1024) != 0 ? c1729aMb.j : bVar, (i15 & 2048) != 0 ? c1729aMb.e : z, (i15 & 4096) != 0 ? c1729aMb.h : z2, (i15 & 8192) != 0 ? c1729aMb.i : z3, (i15 & 16384) != 0 ? c1729aMb.q : i9, (i15 & Privacy.DEFAULT) != 0 ? c1729aMb.s : i10, (i15 & AleCryptoBouncyCastle.MAX_RANDOM_BYTES) != 0 ? c1729aMb.c : i11, (i15 & 131072) != 0 ? c1729aMb.r : z4, (i15 & 262144) != 0 ? c1729aMb.y : i12, (i15 & 524288) != 0 ? c1729aMb.t : c1729aMb2, (i15 & 1048576) != 0 ? c1729aMb.p : i13, (i15 & 2097152) != 0 ? c1729aMb.x : i14, (i15 & 4194304) != 0 ? c1729aMb.d : z5);
    }

    public final int a() {
        return this.g;
    }

    public final C1729aMb b(int i, int i2, float f, int i3, int i4, int i5, int i6, int i7, float f2, int i8, b bVar, boolean z, boolean z2, boolean z3, int i9, int i10, int i11, boolean z4, int i12, C1729aMb c1729aMb, int i13, int i14, boolean z5) {
        return new C1729aMb(i, i2, f, i3, i4, i5, i6, i7, f2, i8, bVar, z, z2, z3, i9, i10, i11, z4, i12, c1729aMb, i13, i14, z5);
    }

    public final boolean b() {
        return this.i;
    }

    public final int c() {
        return this.c;
    }

    public final float d() {
        return this.b;
    }

    public final boolean e() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1729aMb) {
            C1729aMb c1729aMb = (C1729aMb) obj;
            return this.w == c1729aMb.w && this.n == c1729aMb.n && Float.compare(this.b, c1729aMb.b) == 0 && this.f13433o == c1729aMb.f13433o && this.l == c1729aMb.l && this.f == c1729aMb.f && this.g == c1729aMb.g && this.u == c1729aMb.u && Float.compare(this.k, c1729aMb.k) == 0 && this.m == c1729aMb.m && C8632dsu.c(this.j, c1729aMb.j) && this.e == c1729aMb.e && this.h == c1729aMb.h && this.i == c1729aMb.i && this.q == c1729aMb.q && this.s == c1729aMb.s && this.c == c1729aMb.c && this.r == c1729aMb.r && this.y == c1729aMb.y && C8632dsu.c(this.t, c1729aMb.t) && this.p == c1729aMb.p && this.x == c1729aMb.x && this.d == c1729aMb.d;
        }
        return false;
    }

    public final b f() {
        return this.j;
    }

    public final int g() {
        return this.l;
    }

    public final boolean h() {
        return this.h;
    }

    public int hashCode() {
        int hashCode = Integer.hashCode(this.w);
        int hashCode2 = Integer.hashCode(this.n);
        int hashCode3 = Float.hashCode(this.b);
        int hashCode4 = Integer.hashCode(this.f13433o);
        int hashCode5 = Integer.hashCode(this.l);
        int hashCode6 = Integer.hashCode(this.f);
        int hashCode7 = Integer.hashCode(this.g);
        int hashCode8 = Integer.hashCode(this.u);
        int hashCode9 = Float.hashCode(this.k);
        int hashCode10 = Integer.hashCode(this.m);
        b bVar = this.j;
        int hashCode11 = bVar == null ? 0 : bVar.hashCode();
        int hashCode12 = Boolean.hashCode(this.e);
        int hashCode13 = Boolean.hashCode(this.h);
        int hashCode14 = Boolean.hashCode(this.i);
        int hashCode15 = Integer.hashCode(this.q);
        int hashCode16 = Integer.hashCode(this.s);
        int hashCode17 = Integer.hashCode(this.c);
        int hashCode18 = Boolean.hashCode(this.r);
        int hashCode19 = Integer.hashCode(this.y);
        C1729aMb c1729aMb = this.t;
        return (((((((((((((((((((((((((((((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + hashCode10) * 31) + hashCode11) * 31) + hashCode12) * 31) + hashCode13) * 31) + hashCode14) * 31) + hashCode15) * 31) + hashCode16) * 31) + hashCode17) * 31) + hashCode18) * 31) + hashCode19) * 31) + (c1729aMb == null ? 0 : c1729aMb.hashCode())) * 31) + Integer.hashCode(this.p)) * 31) + Integer.hashCode(this.x)) * 31) + Boolean.hashCode(this.d);
    }

    public final int i() {
        return this.f;
    }

    public final int j() {
        return this.m;
    }

    public final int k() {
        return this.s;
    }

    public final float l() {
        return this.k;
    }

    public final int m() {
        return this.n;
    }

    public final int n() {
        return this.f13433o;
    }

    public final int o() {
        return this.q;
    }

    public final int p() {
        return this.w;
    }

    public final boolean q() {
        return this.r;
    }

    public final int r() {
        return this.u;
    }

    public final int s() {
        return this.x;
    }

    public final int t() {
        return this.p;
    }

    public String toString() {
        int i = this.w;
        int i2 = this.n;
        float f = this.b;
        int i3 = this.f13433o;
        int i4 = this.l;
        int i5 = this.f;
        int i6 = this.g;
        int i7 = this.u;
        float f2 = this.k;
        int i8 = this.m;
        b bVar = this.j;
        boolean z = this.e;
        boolean z2 = this.h;
        boolean z3 = this.i;
        int i9 = this.q;
        int i10 = this.s;
        int i11 = this.c;
        boolean z4 = this.r;
        int i12 = this.y;
        C1729aMb c1729aMb = this.t;
        int i13 = this.p;
        int i14 = this.x;
        boolean z5 = this.d;
        return "RowConfig(viewType=" + i + ", numberOfItemsPerPage=" + i2 + ", aspectRatio=" + f + ", numberOfPagesToScrollOnFling=" + i3 + ", millisecondsPerInch=" + i4 + ", itemPadding=" + i5 + ", horizontalListPadding=" + i6 + ", verticalListPadding=" + i7 + ", peekRatio=" + f2 + ", maxHeight=" + i8 + ", itemDecorationFactory=" + bVar + ", freeScroll=" + z + ", lightTheme=" + z2 + ", hasCirclePlaceholder=" + z3 + ", rowCount=" + i9 + ", rowOrientation=" + i10 + ", adjustStrategy=" + i11 + ", showRowTitle=" + z4 + ", viewId=" + i12 + ", seeMoreRowConfig=" + c1729aMb + ", skipFirstItems=" + i13 + ", span=" + i14 + ", epoxyMigration=" + z5 + ")";
    }

    public final boolean u() {
        return this.d;
    }

    public C1729aMb(int i, int i2, float f, int i3, int i4, int i5, int i6, int i7, float f2, int i8, b bVar, boolean z, boolean z2, boolean z3, int i9, int i10, int i11, boolean z4, int i12, C1729aMb c1729aMb, int i13, int i14, boolean z5) {
        this.w = i;
        this.n = i2;
        this.b = f;
        this.f13433o = i3;
        this.l = i4;
        this.f = i5;
        this.g = i6;
        this.u = i7;
        this.k = f2;
        this.m = i8;
        this.j = bVar;
        this.e = z;
        this.h = z2;
        this.i = z3;
        this.q = i9;
        this.s = i10;
        this.c = i11;
        this.r = z4;
        this.y = i12;
        this.t = c1729aMb;
        this.p = i13;
        this.x = i14;
        this.d = z5;
    }

    public /* synthetic */ C1729aMb(int i, int i2, float f, int i3, int i4, int i5, int i6, int i7, float f2, int i8, b bVar, boolean z, boolean z2, boolean z3, int i9, int i10, int i11, boolean z4, int i12, C1729aMb c1729aMb, int i13, int i14, boolean z5, int i15, C8627dsp c8627dsp) {
        this(i, (i15 & 2) != 0 ? 3 : i2, (i15 & 4) != 0 ? 0.0f : f, (i15 & 8) != 0 ? 1 : i3, (i15 & 16) != 0 ? 40 : i4, (i15 & 32) != 0 ? 0 : i5, (i15 & 64) != 0 ? 0 : i6, (i15 & 128) != 0 ? 0 : i7, (i15 & JSONzip.end) == 0 ? f2 : 0.0f, (i15 & 512) != 0 ? 0 : i8, (i15 & 1024) != 0 ? null : bVar, (i15 & 2048) != 0 ? false : z, (i15 & 4096) != 0 ? false : z2, (i15 & 8192) != 0 ? false : z3, (i15 & 16384) != 0 ? 1 : i9, (i15 & Privacy.DEFAULT) != 0 ? 0 : i10, (i15 & AleCryptoBouncyCastle.MAX_RANDOM_BYTES) != 0 ? 0 : i11, (i15 & 131072) != 0 ? true : z4, (i15 & 262144) != 0 ? -1 : i12, (i15 & 524288) == 0 ? c1729aMb : null, (i15 & 1048576) != 0 ? 0 : i13, (i15 & 2097152) != 0 ? 1 : i14, (i15 & 4194304) != 0 ? false : z5);
    }

    /* renamed from: o.aMb$d */
    /* loaded from: classes3.dex */
    public static final class d {
        public /* synthetic */ d(C8627dsp c8627dsp) {
            this();
        }

        private d() {
        }
    }

    public final C1729aMb v() {
        return b(this, 0, this.n + 1, 0.0f, 0, 0, 0, 0, 0, 0.0f, 0, null, false, false, false, 0, 0, 0, false, 0, null, 0, 0, false, 8388605, null);
    }
}
