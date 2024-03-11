package o;

import com.netflix.mediaclient.servicemgr.interface_.LoMo;

/* renamed from: o.ccB  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6374ccB {
    private final LoMo a;
    private final String b;
    private final String d;
    private final int e;

    public static /* synthetic */ C6374ccB c(C6374ccB c6374ccB, LoMo loMo, String str, String str2, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            loMo = c6374ccB.a;
        }
        if ((i2 & 2) != 0) {
            str = c6374ccB.d;
        }
        if ((i2 & 4) != 0) {
            str2 = c6374ccB.b;
        }
        if ((i2 & 8) != 0) {
            i = c6374ccB.e;
        }
        return c6374ccB.c(loMo, str, str2, i);
    }

    public final int a() {
        return this.e;
    }

    public final LoMo c() {
        return this.a;
    }

    public final C6374ccB c(LoMo loMo, String str, String str2, int i) {
        C8632dsu.c((Object) loMo, "");
        return new C6374ccB(loMo, str, str2, i);
    }

    public final String e() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C6374ccB) {
            C6374ccB c6374ccB = (C6374ccB) obj;
            return C8632dsu.c(this.a, c6374ccB.a) && C8632dsu.c((Object) this.d, (Object) c6374ccB.d) && C8632dsu.c((Object) this.b, (Object) c6374ccB.b) && this.e == c6374ccB.e;
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.a.hashCode();
        String str = this.d;
        int hashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.b;
        return (((((hashCode * 31) + hashCode2) * 31) + (str2 != null ? str2.hashCode() : 0)) * 31) + Integer.hashCode(this.e);
    }

    public String toString() {
        LoMo loMo = this.a;
        String str = this.d;
        String str2 = this.b;
        int i = this.e;
        return "LomoContext(lomo=" + loMo + ", lolomoId=" + str + ", genreId=" + str2 + ", positionInUi=" + i + ")";
    }

    public C6374ccB(LoMo loMo, String str, String str2, int i) {
        C8632dsu.c((Object) loMo, "");
        this.a = loMo;
        this.d = str;
        this.b = str2;
        this.e = i;
    }

    public final C6374ccB a(LoMo loMo) {
        C8632dsu.c((Object) loMo, "");
        return c(this, loMo, null, null, 0, 14, null);
    }
}
