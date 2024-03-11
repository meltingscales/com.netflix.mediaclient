package o;

import com.netflix.android.volley.NetworkError;
import com.netflix.android.volley.Request;
import com.netflix.android.volley.VolleyError;
import java.io.IOException;
import java.io.InputStream;
import org.apache.http.HttpEntity;

/* renamed from: o.xM  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC9826xM extends Request<Void> {
    private static int a;
    private final byte[] d;
    private InterfaceC9828xO e;
    private final Request.Priority g;

    public static void a(int i) {
        a = i;
    }

    protected abstract void c(long j);

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.netflix.android.volley.Request
    /* renamed from: c */
    public void b(Void r1) {
    }

    public void e(InterfaceC9828xO interfaceC9828xO) {
        this.e = interfaceC9828xO;
    }

    @Override // com.netflix.android.volley.Request
    public Request.Priority s() {
        return this.g;
    }

    public AbstractC9826xM(String str, Request.Priority priority) {
        super(0, str, null);
        this.g = priority;
        e(false);
        e(new C9852xm(10000, 0, 1.0f));
        this.d = new byte[8192];
    }

    @Override // com.netflix.android.volley.Request
    public C9864xy<Void> b(C9858xs c9858xs) {
        C9864xy<Void> a2;
        InputStream content;
        InterfaceC9828xO interfaceC9828xO;
        if (D()) {
            e(c9858xs);
            return C9864xy.c(null, null);
        }
        if (c9858xs == null) {
            a2 = C9864xy.a(new VolleyError("Network response is null"));
        } else if (!(c9858xs instanceof C9825xL)) {
            a2 = C9864xy.a(new VolleyError("Expecting ProgressiveNetworkResponse but got=" + c9858xs));
        } else {
            HttpEntity b = ((C9825xL) c9858xs).b();
            c(b.getContentLength());
            try {
                if (C9816xC.d()) {
                    content = C9815xB.d(b.getContent());
                } else {
                    content = b.getContent();
                }
                while (!D()) {
                    int read = content.read(this.d);
                    InterfaceC9828xO interfaceC9828xO2 = this.e;
                    if (interfaceC9828xO2 != null) {
                        interfaceC9828xO2.d(this.d, read);
                    }
                    if (read < 0) {
                        break;
                    }
                    int i = a;
                    if (i > 0) {
                        try {
                            Thread.sleep(i);
                        } catch (InterruptedException unused) {
                            a = 0;
                        }
                    }
                }
                if (content != null) {
                    content.close();
                }
                a2 = C9864xy.c(null, null);
            } catch (IOException e) {
                C9862xw.a("nf_download_prog_req", "parseNetworkResponse I/O error " + e.toString());
                a2 = C9864xy.a(new VolleyError(new NetworkError(e)));
            }
        }
        if (D() && (interfaceC9828xO = this.e) != null) {
            interfaceC9828xO.c();
        }
        e(c9858xs);
        return a2;
    }

    private void e(C9858xs c9858xs) {
        try {
            ((C9825xL) c9858xs).b().consumeContent();
            F();
        } catch (IOException unused) {
            C9862xw.a("Error occurred when calling consumingContent", new Object[0]);
        }
    }

    @Override // com.netflix.android.volley.Request
    public void a_(VolleyError volleyError) {
        InterfaceC9828xO interfaceC9828xO = this.e;
        if (interfaceC9828xO != null) {
            interfaceC9828xO.a(volleyError);
        }
    }
}
