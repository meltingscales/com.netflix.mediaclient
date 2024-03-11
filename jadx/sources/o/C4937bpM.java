package o;

import com.netflix.android.volley.Request;
import com.netflix.android.volley.VolleyError;
import o.C5005bqb;
import o.C9864xy;

/* renamed from: o.bpM  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C4937bpM extends Request<Integer> {
    private C5005bqb a;
    private final InterfaceC4943bpS e;

    public C4937bpM(String str, InterfaceC4943bpS interfaceC4943bpS, C9864xy.b bVar, int i, C5005bqb c5005bqb) {
        super(0, str, bVar);
        this.e = interfaceC4943bpS;
        this.a = c5005bqb;
        e(true);
        e(new C9852xm(i, 2, 2.0f));
    }

    @Override // com.netflix.android.volley.Request
    public C9864xy<Integer> b(C9858xs c9858xs) {
        if (C9821xH.d(c9858xs) == null) {
            C1044Mm.d("DownloadAndCacheRequest", "Request to cache response is not allowed because the response has no-cache param in header");
            return C9864xy.a(new VolleyError("Request to cache response is not allowed because the response has no-cache param in header"));
        }
        int length = c9858xs.c.length;
        return C9864xy.c(Integer.valueOf(length), C9821xH.d(c9858xs));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.netflix.android.volley.Request
    /* renamed from: a */
    public void b(Integer num) {
        InterfaceC4943bpS interfaceC4943bpS;
        C5005bqb.e d = this.a.d(b());
        if (d == null || (interfaceC4943bpS = this.e) == null) {
            return;
        }
        interfaceC4943bpS.b(u(), d.e(), d.a(), d.d(), InterfaceC1078Nw.aJ);
    }

    @Override // com.netflix.android.volley.Request
    public Request.Priority s() {
        return Request.Priority.NORMAL;
    }

    @Override // com.netflix.android.volley.Request
    public String b() {
        return C8342dia.d(u());
    }
}
