package o;

import java.util.Objects;

/* renamed from: o.bwm  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5334bwm {
    private String a;
    private int b;
    private String c;
    private final String d;
    private final boolean e;
    private int f;
    private int i;

    public final String a() {
        return this.d;
    }

    public final String b() {
        return this.a;
    }

    public final void b(String str) {
        this.a = str;
    }

    public final int c() {
        return this.i;
    }

    public final String d() {
        return this.c;
    }

    public final int e() {
        return this.b;
    }

    public final int f() {
        return this.f;
    }

    public final boolean g() {
        return this.e;
    }

    public C5334bwm(String str, boolean z, int i, int i2, String str2, int i3) {
        C8632dsu.c((Object) str, "");
        this.d = str;
        this.e = z;
        this.i = i;
        this.b = i2;
        this.c = str2;
        this.f = i3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !C8632dsu.c(C5334bwm.class, obj.getClass())) {
            return false;
        }
        return C8632dsu.c((Object) this.d, (Object) ((C5334bwm) obj).d);
    }

    public int hashCode() {
        return Objects.hash(this.d);
    }

    public String toString() {
        String str = this.d;
        boolean z = this.e;
        int i = this.i;
        int i2 = this.b;
        String str2 = this.c;
        return "OfflineWatchedEntity(playableId='" + str + "', isEpisode=" + z + ", seasonNumber=" + i + ", episodeNumber=" + i2 + ", parentId=" + str2 + ")";
    }
}
