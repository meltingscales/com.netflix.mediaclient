package o;

import android.graphics.Rect;

/* renamed from: o.Oq  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1099Oq {
    private final int a;
    private final String b;
    private final int c;
    private Rect d;
    private final int e;
    private final int i;

    public static /* synthetic */ C1099Oq a(C1099Oq c1099Oq, String str, int i, int i2, int i3, int i4, Rect rect, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            str = c1099Oq.b;
        }
        if ((i5 & 2) != 0) {
            i = c1099Oq.i;
        }
        int i6 = i;
        if ((i5 & 4) != 0) {
            i2 = c1099Oq.c;
        }
        int i7 = i2;
        if ((i5 & 8) != 0) {
            i3 = c1099Oq.a;
        }
        int i8 = i3;
        if ((i5 & 16) != 0) {
            i4 = c1099Oq.e;
        }
        int i9 = i4;
        if ((i5 & 32) != 0) {
            rect = c1099Oq.d;
        }
        return c1099Oq.c(str, i6, i7, i8, i9, rect);
    }

    public final int a() {
        return this.c;
    }

    public final String b() {
        return this.b;
    }

    public final int c() {
        return this.a;
    }

    public final C1099Oq c(String str, int i, int i2, int i3, int i4, Rect rect) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) rect, "");
        return new C1099Oq(str, i, i2, i3, i4, rect);
    }

    public final int d() {
        return this.e;
    }

    public final Rect e() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1099Oq) {
            C1099Oq c1099Oq = (C1099Oq) obj;
            return C8632dsu.c((Object) this.b, (Object) c1099Oq.b) && this.i == c1099Oq.i && this.c == c1099Oq.c && this.a == c1099Oq.a && this.e == c1099Oq.e && C8632dsu.c(this.d, c1099Oq.d);
        }
        return false;
    }

    public final int h() {
        return this.i;
    }

    public int hashCode() {
        return (((((((((this.b.hashCode() * 31) + Integer.hashCode(this.i)) * 31) + Integer.hashCode(this.c)) * 31) + Integer.hashCode(this.a)) * 31) + Integer.hashCode(this.e)) * 31) + this.d.hashCode();
    }

    public String toString() {
        String str = this.b;
        int i = this.i;
        int i2 = this.c;
        int i3 = this.a;
        int i4 = this.e;
        Rect rect = this.d;
        return "NetflixTagItem(tag=" + str + ", validFrame=" + i + ", startFrame=" + i2 + ", endFrame=" + i3 + ", resetFrame=" + i4 + ", tapAreaRect=" + rect + ")";
    }

    public C1099Oq(String str, int i, int i2, int i3, int i4, Rect rect) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) rect, "");
        this.b = str;
        this.i = i;
        this.c = i2;
        this.a = i3;
        this.e = i4;
        this.d = rect;
    }
}
