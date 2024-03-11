package o;

import com.netflix.mediaclient.api.logging.error.ErrorType;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: o.aHd  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1596aHd {
    public ErrorType a;
    public boolean b;
    public boolean c;
    public boolean d;
    public Map<String, String> e;
    private String g;
    public Throwable i;

    public C1596aHd() {
        this(null, null, null, false, null, false, false, 127, null);
    }

    public C1596aHd(String str) {
        this(str, null, null, false, null, false, false, 126, null);
    }

    public C1596aHd(String str, Throwable th, ErrorType errorType, boolean z) {
        this(str, th, errorType, z, null, false, false, 112, null);
    }

    public static /* synthetic */ C1596aHd a(C1596aHd c1596aHd, String str, Throwable th, ErrorType errorType, boolean z, Map map, boolean z2, boolean z3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = c1596aHd.g;
        }
        if ((i & 2) != 0) {
            th = c1596aHd.i;
        }
        Throwable th2 = th;
        if ((i & 4) != 0) {
            errorType = c1596aHd.a;
        }
        ErrorType errorType2 = errorType;
        if ((i & 8) != 0) {
            z = c1596aHd.c;
        }
        boolean z4 = z;
        Map<String, String> map2 = map;
        if ((i & 16) != 0) {
            map2 = c1596aHd.e;
        }
        Map map3 = map2;
        if ((i & 32) != 0) {
            z2 = c1596aHd.b;
        }
        boolean z5 = z2;
        if ((i & 64) != 0) {
            z3 = c1596aHd.d;
        }
        return c1596aHd.d(str, th2, errorType2, z4, map3, z5, z3);
    }

    public final void a(String str) {
        this.g = str;
    }

    public final String b() {
        return this.g;
    }

    public final C1596aHd b(ErrorType errorType) {
        this.a = errorType;
        return this;
    }

    public final C1596aHd b(boolean z) {
        this.c = z;
        return this;
    }

    public final C1596aHd c(boolean z) {
        this.d = z;
        return this;
    }

    public final C1596aHd d(String str, Throwable th, ErrorType errorType, boolean z, Map<String, String> map, boolean z2, boolean z3) {
        C8632dsu.c((Object) map, "");
        return new C1596aHd(str, th, errorType, z, map, z2, z3);
    }

    public final C1596aHd d(Throwable th) {
        this.i = th;
        return this;
    }

    public final C1596aHd e(boolean z) {
        this.b = z;
        return this;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1596aHd) {
            C1596aHd c1596aHd = (C1596aHd) obj;
            return C8632dsu.c((Object) this.g, (Object) c1596aHd.g) && C8632dsu.c(this.i, c1596aHd.i) && this.a == c1596aHd.a && this.c == c1596aHd.c && C8632dsu.c(this.e, c1596aHd.e) && this.b == c1596aHd.b && this.d == c1596aHd.d;
        }
        return false;
    }

    public int hashCode() {
        String str = this.g;
        int hashCode = str == null ? 0 : str.hashCode();
        Throwable th = this.i;
        int hashCode2 = th == null ? 0 : th.hashCode();
        ErrorType errorType = this.a;
        return (((((((((((hashCode * 31) + hashCode2) * 31) + (errorType != null ? errorType.hashCode() : 0)) * 31) + Boolean.hashCode(this.c)) * 31) + this.e.hashCode()) * 31) + Boolean.hashCode(this.b)) * 31) + Boolean.hashCode(this.d);
    }

    public String toString() {
        String str = this.g;
        Throwable th = this.i;
        ErrorType errorType = this.a;
        boolean z = this.c;
        Map<String, String> map = this.e;
        boolean z2 = this.b;
        boolean z3 = this.d;
        return "HandledException(message=" + str + ", throwable=" + th + ", errorType=" + errorType + ", crashInDebug=" + z + ", additionalData=" + map + ", isHighVolumeEvent=" + z2 + ", disableSampling=" + z3 + ")";
    }

    public C1596aHd(String str, Throwable th, ErrorType errorType, boolean z, Map<String, String> map, boolean z2, boolean z3) {
        C8632dsu.c((Object) map, "");
        this.g = str;
        this.i = th;
        this.a = errorType;
        this.c = z;
        this.e = map;
        this.b = z2;
        this.d = z3;
    }

    public /* synthetic */ C1596aHd(String str, Throwable th, ErrorType errorType, boolean z, Map map, boolean z2, boolean z3, int i, C8627dsp c8627dsp) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : th, (i & 4) == 0 ? errorType : null, (i & 8) != 0 ? true : z, (i & 16) != 0 ? new LinkedHashMap() : map, (i & 32) != 0 ? false : z2, (i & 64) != 0 ? false : z3);
    }

    public final C1596aHd e(String str, String str2) {
        C8632dsu.c((Object) str, "");
        this.e.put(str, str2);
        return this;
    }

    public final C1596aHd e(Map<String, String> map) {
        if (map != null) {
            this.e.putAll(map);
        }
        return this;
    }
}
