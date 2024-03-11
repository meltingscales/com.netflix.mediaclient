package o;

import com.netflix.mediaclient.graphql.models.type.PlaylistAction;
import java.util.List;

/* renamed from: o.aew  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2371aew implements InterfaceC9037hy {
    private final String a;
    private final b b;
    private final C2344aeV c;
    private final C2339aeQ d;
    private final Boolean e;
    private final List<PlaylistAction> h;

    public final C2344aeV a() {
        return this.c;
    }

    public final C2339aeQ b() {
        return this.d;
    }

    public final List<PlaylistAction> c() {
        return this.h;
    }

    public final b d() {
        return this.b;
    }

    public final String e() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2371aew) {
            C2371aew c2371aew = (C2371aew) obj;
            return C8632dsu.c((Object) this.a, (Object) c2371aew.a) && C8632dsu.c(this.e, c2371aew.e) && C8632dsu.c(this.b, c2371aew.b) && C8632dsu.c(this.h, c2371aew.h) && C8632dsu.c(this.c, c2371aew.c) && C8632dsu.c(this.d, c2371aew.d);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.a.hashCode();
        Boolean bool = this.e;
        int hashCode2 = bool == null ? 0 : bool.hashCode();
        b bVar = this.b;
        int hashCode3 = bVar == null ? 0 : bVar.hashCode();
        List<PlaylistAction> list = this.h;
        return (((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (list != null ? list.hashCode() : 0)) * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
    }

    public final Boolean i() {
        return this.e;
    }

    public String toString() {
        String str = this.a;
        Boolean bool = this.e;
        b bVar = this.b;
        List<PlaylistAction> list = this.h;
        C2344aeV c2344aeV = this.c;
        C2339aeQ c2339aeQ = this.d;
        return "FeedGameAncestorData(__typename=" + str + ", isDeviceSupported=" + bool + ", androidInstallation=" + bVar + ", playlistActions=" + list + ", gameSummary=" + c2344aeV + ", gameInQueue=" + c2339aeQ + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C2371aew(String str, Boolean bool, b bVar, List<? extends PlaylistAction> list, C2344aeV c2344aeV, C2339aeQ c2339aeQ) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) c2344aeV, "");
        C8632dsu.c((Object) c2339aeQ, "");
        this.a = str;
        this.e = bool;
        this.b = bVar;
        this.h = list;
        this.c = c2344aeV;
        this.d = c2339aeQ;
    }

    /* renamed from: o.aew$b */
    /* loaded from: classes3.dex */
    public static final class b {
        private final String b;
        private final String c;
        private final String e;

        public final String a() {
            return this.b;
        }

        public final String d() {
            return this.c;
        }

        public final String e() {
            return this.e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                b bVar = (b) obj;
                return C8632dsu.c((Object) this.c, (Object) bVar.c) && C8632dsu.c((Object) this.b, (Object) bVar.b) && C8632dsu.c((Object) this.e, (Object) bVar.e);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.c.hashCode();
            int hashCode2 = this.b.hashCode();
            String str = this.e;
            return (((hashCode * 31) + hashCode2) * 31) + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            String str = this.c;
            String str2 = this.b;
            String str3 = this.e;
            return "AndroidInstallation(__typename=" + str + ", packageName=" + str2 + ", appStoreUrl=" + str3 + ")";
        }

        public b(String str, String str2, String str3) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) str2, "");
            this.c = str;
            this.b = str2;
            this.e = str3;
        }
    }
}
