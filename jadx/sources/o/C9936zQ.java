package o;

import android.content.Context;
import android.graphics.drawable.Drawable;
import androidx.appcompat.content.res.AppCompatResources;

/* renamed from: o.zQ  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9936zQ {
    private boolean a;
    private final String b;
    private final int c;
    private Drawable d;
    private final int e;
    private final String g;
    private boolean i;

    public final int a() {
        return this.e;
    }

    public final int b() {
        return this.c;
    }

    public final void b(boolean z) {
        this.i = z;
    }

    public final String c() {
        return this.g;
    }

    public final String d() {
        return this.b;
    }

    public final void e(boolean z) {
        this.a = z;
    }

    public final boolean e() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C9936zQ) {
            C9936zQ c9936zQ = (C9936zQ) obj;
            return this.c == c9936zQ.c && C8632dsu.c((Object) this.g, (Object) c9936zQ.g) && this.e == c9936zQ.e && C8632dsu.c((Object) this.b, (Object) c9936zQ.b);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = Integer.hashCode(this.c);
        int hashCode2 = this.g.hashCode();
        int hashCode3 = Integer.hashCode(this.e);
        String str = this.b;
        return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (str == null ? 0 : str.hashCode());
    }

    public final boolean j() {
        return this.i;
    }

    public String toString() {
        int i = this.c;
        String str = this.g;
        int i2 = this.e;
        String str2 = this.b;
        return "Tab(id=" + i + ", title=" + str + ", iconRes=" + i2 + ", iconImageUrl=" + str2 + ")";
    }

    public C9936zQ(int i, String str, int i2, String str2) {
        C8632dsu.c((Object) str, "");
        this.c = i;
        this.g = str;
        this.e = i2;
        this.b = str2;
        this.a = true;
    }

    public /* synthetic */ C9936zQ(int i, String str, int i2, String str2, int i3, C8627dsp c8627dsp) {
        this(i, str, (i3 & 4) != 0 ? 0 : i2, (i3 & 8) != 0 ? null : str2);
    }

    public final Drawable b(Context context) {
        C8632dsu.c((Object) context, "");
        if (this.d == null) {
            this.d = AppCompatResources.getDrawable(context, this.e);
        }
        return this.d;
    }
}
