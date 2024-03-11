package o;

import com.netflix.mediaclient.service.player.StreamProfileType;

/* renamed from: o.bhn  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4613bhn {
    private final String b;
    private final StreamProfileType e;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C4613bhn) {
            C4613bhn c4613bhn = (C4613bhn) obj;
            return this.e == c4613bhn.e && C8632dsu.c((Object) this.b, (Object) c4613bhn.b);
        }
        return false;
    }

    public int hashCode() {
        return (this.e.hashCode() * 31) + this.b.hashCode();
    }

    public String toString() {
        StreamProfileType streamProfileType = this.e;
        String str = this.b;
        return "AseConfigKey(streamProfile=" + streamProfileType + ", uiLabel=" + str + ")";
    }

    public C4613bhn(StreamProfileType streamProfileType, String str) {
        C8632dsu.c((Object) streamProfileType, "");
        C8632dsu.c((Object) str, "");
        this.e = streamProfileType;
        this.b = str;
    }
}
