package o;

import com.netflix.mediaclient.latencytracker.impl.UiLatencyStatus;
import java.util.List;
import javax.inject.Inject;
import o.InterfaceC8358diq;
import org.json.JSONObject;

/* renamed from: o.aGv  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1587aGv {
    private a b;
    private final InterfaceC1270Vf c;
    private b d;

    @Inject
    public C1587aGv(InterfaceC1270Vf interfaceC1270Vf) {
        C8632dsu.c((Object) interfaceC1270Vf, "");
        this.c = interfaceC1270Vf;
    }

    public final void a(InterfaceC8358diq.c cVar) {
        C8632dsu.c((Object) cVar, "");
        this.d = new b(cVar, this.c.c());
    }

    public final void b(UiLatencyStatus uiLatencyStatus, List<C5165btc> list) {
        List U;
        C8632dsu.c((Object) uiLatencyStatus, "");
        C8632dsu.c((Object) list, "");
        U = C8576dqs.U(list);
        this.b = new a(uiLatencyStatus, U, this.c.c());
    }

    public final JSONObject c() {
        JSONObject jSONObject = new JSONObject();
        d(jSONObject);
        c(jSONObject);
        e(jSONObject);
        return jSONObject;
    }

    private final void d(JSONObject jSONObject) {
        b bVar = this.d;
        if (bVar == null) {
            jSONObject.put("new_status", "null_status");
            return;
        }
        jSONObject.put("new_status", "has_status");
        jSONObject.put("new_didComplete", bVar.e().a());
        jSONObject.put("new_statusMessage", bVar.e().e());
        jSONObject.put("new_trueEndTimeMillis", bVar.e().d());
        jSONObject.put("new_trueEndTimeDeltaMillis", bVar.a() - bVar.e().d());
        jSONObject.put("new_imageCount", bVar.e().b().size());
    }

    private final void c(JSONObject jSONObject) {
        a aVar = this.b;
        if (aVar == null) {
            jSONObject.put("old_status", "null_status");
            return;
        }
        jSONObject.put("old_status", aVar.c());
        jSONObject.put("old_endTimeMillis", aVar.a());
        jSONObject.put("old_imageCount", aVar.d().size());
    }

    private final void e(JSONObject jSONObject) {
        b bVar = this.d;
        a aVar = this.b;
        if (bVar == null || aVar == null) {
            return;
        }
        UiLatencyStatus c = aVar.c();
        UiLatencyStatus uiLatencyStatus = UiLatencyStatus.e;
        if ((c == uiLatencyStatus && bVar.e().a()) || (aVar.c() != uiLatencyStatus && !bVar.e().a())) {
            jSONObject.put("cmp_status", "match");
        } else {
            jSONObject.put("cmp_status", "no_match");
        }
        jSONObject.put("cmp_timeDeltaMillis", aVar.a() - bVar.a());
        jSONObject.put("cmp_trueTimeDeltaMillis", aVar.a() - bVar.e().d());
        jSONObject.put("cmp_imageCountDelta", aVar.d().size() - bVar.e().b().size());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o.aGv$b */
    /* loaded from: classes3.dex */
    public static final class b {
        private final long c;
        private final InterfaceC8358diq.c e;

        public final long a() {
            return this.c;
        }

        public final InterfaceC8358diq.c e() {
            return this.e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                b bVar = (b) obj;
                return C8632dsu.c(this.e, bVar.e) && this.c == bVar.c;
            }
            return false;
        }

        public int hashCode() {
            return (this.e.hashCode() * 31) + Long.hashCode(this.c);
        }

        public String toString() {
            InterfaceC8358diq.c cVar = this.e;
            long j = this.c;
            return "NewResult(result=" + cVar + ", endTimeMillis=" + j + ")";
        }

        public b(InterfaceC8358diq.c cVar, long j) {
            C8632dsu.c((Object) cVar, "");
            this.e = cVar;
            this.c = j;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o.aGv$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private final UiLatencyStatus b;
        private final long c;
        private final List<C5165btc> d;

        public final long a() {
            return this.c;
        }

        public final UiLatencyStatus c() {
            return this.b;
        }

        public final List<C5165btc> d() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof a) {
                a aVar = (a) obj;
                return this.b == aVar.b && C8632dsu.c(this.d, aVar.d) && this.c == aVar.c;
            }
            return false;
        }

        public int hashCode() {
            return (((this.b.hashCode() * 31) + this.d.hashCode()) * 31) + Long.hashCode(this.c);
        }

        public String toString() {
            UiLatencyStatus uiLatencyStatus = this.b;
            List<C5165btc> list = this.d;
            long j = this.c;
            return "OldResult(status=" + uiLatencyStatus + ", images=" + list + ", endTimeMillis=" + j + ")";
        }

        public a(UiLatencyStatus uiLatencyStatus, List<C5165btc> list, long j) {
            C8632dsu.c((Object) uiLatencyStatus, "");
            C8632dsu.c((Object) list, "");
            this.b = uiLatencyStatus;
            this.d = list;
            this.c = j;
        }
    }
}
