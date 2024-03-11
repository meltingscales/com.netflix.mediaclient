package o;

import com.netflix.mediaclient.servicemgr.IPlayer;

/* renamed from: o.cib  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC6718cib {
    void a();

    void a(C6728cil c6728cil);

    void b();

    void b(C6728cil c6728cil);

    d c(C6728cil c6728cil, long j);

    d c(C6728cil c6728cil, long j, boolean z);

    void c(C6728cil c6728cil);

    void d(C6728cil c6728cil);

    d e();

    void e(d dVar);

    void e(d dVar, IPlayer.c cVar);

    void e(C6728cil c6728cil);

    /* renamed from: o.cib$d */
    /* loaded from: classes4.dex */
    public static final class d {
        private final long b;

        public final long a() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && this.b == ((d) obj).b;
        }

        public int hashCode() {
            return Long.hashCode(this.b);
        }

        public String toString() {
            long j = this.b;
            return "Session(id=" + j + ")";
        }

        public d(long j) {
            this.b = j;
        }
    }

    /* renamed from: o.cib$b */
    /* loaded from: classes4.dex */
    public static final class b {
        public static /* synthetic */ void d(InterfaceC6718cib interfaceC6718cib, d dVar, IPlayer.c cVar, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: endSession");
            }
            if ((i & 2) != 0) {
                cVar = null;
            }
            interfaceC6718cib.e(dVar, cVar);
        }
    }
}
