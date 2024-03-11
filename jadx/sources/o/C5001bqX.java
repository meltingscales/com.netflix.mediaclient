package o;

import android.content.Context;
import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.api.logging.error.ErrorType;
import com.netflix.mediaclient.servicemgr.NetflixDataRequest;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import o.InterfaceC1598aHf;
import o.InterfaceC1601aHi;

/* renamed from: o.bqX  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5001bqX extends AbstractC1900aSk<String> {
    public static final c a = new c(null);
    private final String d;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC1902aSm
    /* renamed from: c */
    public void b(String str) {
        C8632dsu.c((Object) str, "");
    }

    @Override // o.AbstractC1902aSm
    public String e() {
        return "call";
    }

    @Override // o.AbstractC1902aSm
    public boolean h() {
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5001bqX(Context context, NetflixDataRequest.Transport transport, String str) {
        super(context, transport, "RecordUmsAlertFeedbackRequest");
        C8632dsu.c((Object) context, "");
        C8632dsu.c((Object) transport, "");
        C8632dsu.c((Object) str, "");
        this.d = str;
        C1044Mm.b("RecordUmsAlertFeedbackRequest", "Query = [\"ums\", \"sendAlertFeedback\"] (alertFeedback = " + str);
    }

    /* renamed from: o.bqX$c */
    /* loaded from: classes4.dex */
    public static final class c {
        public /* synthetic */ c(C8627dsp c8627dsp) {
            this();
        }

        private c() {
        }
    }

    @Override // o.AbstractC1902aSm
    public List<String> c() {
        List<String> asList = Arrays.asList("[\"ums\", \"sendAlertFeedback\"]");
        C8632dsu.a(asList, "");
        return asList;
    }

    @Override // o.AbstractC1902aSm
    public Map<String, String> b() {
        Map<String, String> b = super.b();
        b.put("param", this.d);
        C8632dsu.d(b);
        return b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC1902aSm
    /* renamed from: d */
    public String e(String str, String str2) {
        C8632dsu.c((Object) str, "");
        C1044Mm.b("RecordUmsAlertFeedbackRequest", "String response to parse = " + str);
        return str;
    }

    @Override // o.AbstractC1902aSm
    public void e(Status status) {
        Map d;
        Map k;
        Throwable th;
        C8632dsu.c((Object) status, "");
        InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
        d = dqE.d();
        k = dqE.k(d);
        C1596aHd c1596aHd = new C1596aHd("failed to record ums alert feedback", null, null, false, k, false, false, 96, null);
        ErrorType errorType = c1596aHd.a;
        if (errorType != null) {
            c1596aHd.e.put("errorType", errorType.c());
            String b = c1596aHd.b();
            if (b != null) {
                String c2 = errorType.c();
                c1596aHd.a(c2 + " " + b);
            }
        }
        if (c1596aHd.b() != null && c1596aHd.i != null) {
            th = new Throwable(c1596aHd.b(), c1596aHd.i);
        } else if (c1596aHd.b() != null) {
            th = new Throwable(c1596aHd.b());
        } else {
            th = c1596aHd.i;
            if (th == null) {
                th = new Throwable("Handled exception with no message");
            } else if (th == null) {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
        }
        InterfaceC1601aHi.d dVar = InterfaceC1601aHi.c;
        InterfaceC1598aHf a2 = dVar.a();
        if (a2 != null) {
            a2.e(c1596aHd, th);
        } else {
            dVar.e().b(c1596aHd, th);
        }
    }
}
