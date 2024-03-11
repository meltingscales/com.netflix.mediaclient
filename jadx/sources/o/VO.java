package o;

import java.util.List;

/* loaded from: classes3.dex */
public final class VO {
    private String a;
    private final List<C1292Wb> b;
    private String c;
    private final boolean d;
    private final boolean e;

    public final String a() {
        return this.c;
    }

    public final String b() {
        return this.a;
    }

    public final List<C1292Wb> c() {
        return this.b;
    }

    public final boolean d() {
        return this.e;
    }

    public final boolean e() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof VO) {
            VO vo = (VO) obj;
            return this.e == vo.e && this.d == vo.d && C8632dsu.c((Object) this.c, (Object) vo.c) && C8632dsu.c((Object) this.a, (Object) vo.a) && C8632dsu.c(this.b, vo.b);
        }
        return false;
    }

    public int hashCode() {
        return (((((((Boolean.hashCode(this.e) * 31) + Boolean.hashCode(this.d)) * 31) + this.c.hashCode()) * 31) + this.a.hashCode()) * 31) + this.b.hashCode();
    }

    public String toString() {
        boolean z = this.e;
        boolean z2 = this.d;
        String str = this.c;
        String str2 = this.a;
        List<C1292Wb> list = this.b;
        return "CurrentTrackData(subtitlesAreOff=" + z + ", disableSubtitlesToggleOption=" + z2 + ", audioTrackId=" + str + ", timedTextTrackId=" + str2 + ", timedTextTrackData=" + list + ")";
    }

    public VO(boolean z, boolean z2, String str, String str2, List<C1292Wb> list) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) str2, "");
        C8632dsu.c((Object) list, "");
        this.e = z;
        this.d = z2;
        this.c = str;
        this.a = str2;
        this.b = list;
    }
}
