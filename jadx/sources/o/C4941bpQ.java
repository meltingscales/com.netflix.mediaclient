package o;

import com.netflix.android.volley.Request;
import o.C9864xy;

/* renamed from: o.bpQ  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C4941bpQ extends Request<byte[]> {
    private InterfaceC4943bpS a;
    private Request.Priority d;

    @Override // com.netflix.android.volley.Request
    public Request.Priority s() {
        return this.d;
    }

    public C4941bpQ(String str, InterfaceC4943bpS interfaceC4943bpS, C9864xy.b bVar, int i, Request.Priority priority) {
        super(0, str, bVar);
        this.a = interfaceC4943bpS;
        this.d = priority;
        e(false);
        e(new C9852xm(i, 2, 2.0f));
    }

    @Override // com.netflix.android.volley.Request
    public C9864xy<byte[]> b(C9858xs c9858xs) {
        u();
        return C9864xy.c(c9858xs.c, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.netflix.android.volley.Request
    /* renamed from: e */
    public void b(byte[] bArr) {
        InterfaceC4943bpS interfaceC4943bpS = this.a;
        if (interfaceC4943bpS != null) {
            interfaceC4943bpS.d(u(), bArr, InterfaceC1078Nw.aJ);
        }
    }
}
