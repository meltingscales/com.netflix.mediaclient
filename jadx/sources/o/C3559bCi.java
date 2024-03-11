package o;

import android.graphics.Bitmap;

/* renamed from: o.bCi  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3559bCi {
    private final Bitmap a;
    private final Bitmap b;
    private final Bitmap c;
    private final Bitmap d;
    private final Bitmap e;

    public final Bitmap a() {
        return this.d;
    }

    public final Bitmap b() {
        return this.a;
    }

    public final Bitmap c() {
        return this.c;
    }

    public final Bitmap d() {
        return this.b;
    }

    public final Bitmap e() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C3559bCi) {
            C3559bCi c3559bCi = (C3559bCi) obj;
            return C8632dsu.c(this.e, c3559bCi.e) && C8632dsu.c(this.c, c3559bCi.c) && C8632dsu.c(this.a, c3559bCi.a) && C8632dsu.c(this.d, c3559bCi.d) && C8632dsu.c(this.b, c3559bCi.b);
        }
        return false;
    }

    public int hashCode() {
        return (((((((this.e.hashCode() * 31) + this.c.hashCode()) * 31) + this.a.hashCode()) * 31) + this.d.hashCode()) * 31) + this.b.hashCode();
    }

    public String toString() {
        Bitmap bitmap = this.e;
        Bitmap bitmap2 = this.c;
        Bitmap bitmap3 = this.a;
        Bitmap bitmap4 = this.d;
        Bitmap bitmap5 = this.b;
        return "PadBitmaps(up=" + bitmap + ", down=" + bitmap2 + ", left=" + bitmap3 + ", right=" + bitmap4 + ", select=" + bitmap5 + ")";
    }

    public C3559bCi(Bitmap bitmap, Bitmap bitmap2, Bitmap bitmap3, Bitmap bitmap4, Bitmap bitmap5) {
        C8632dsu.c((Object) bitmap, "");
        C8632dsu.c((Object) bitmap2, "");
        C8632dsu.c((Object) bitmap3, "");
        C8632dsu.c((Object) bitmap4, "");
        C8632dsu.c((Object) bitmap5, "");
        this.e = bitmap;
        this.c = bitmap2;
        this.a = bitmap3;
        this.d = bitmap4;
        this.b = bitmap5;
    }
}
