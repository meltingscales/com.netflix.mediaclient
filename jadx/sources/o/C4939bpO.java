package o;

import com.netflix.android.volley.Request;
import com.netflix.android.volley.VolleyError;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import o.C9864xy;

/* renamed from: o.bpO  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C4939bpO extends Request<String> {
    private InterfaceC4943bpS a;
    private Request.Priority d;
    private File e;

    @Override // com.netflix.android.volley.Request
    public Request.Priority s() {
        return this.d;
    }

    public C4939bpO(String str, InterfaceC4943bpS interfaceC4943bpS, C9864xy.b bVar, int i, Request.Priority priority, File file) {
        super(0, str, bVar);
        this.a = interfaceC4943bpS;
        this.e = file;
        this.d = priority;
        e(false);
        e(new C9852xm(i, 2, 2.0f));
    }

    @Override // com.netflix.android.volley.Request
    public C9864xy<String> b(C9858xs c9858xs) {
        File file;
        BufferedOutputStream bufferedOutputStream;
        BufferedOutputStream bufferedOutputStream2 = null;
        try {
            try {
                bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(new File(this.e, C8342dia.a(u()))));
                try {
                    bufferedOutputStream.write(c9858xs.c);
                    bufferedOutputStream.flush();
                    C9864xy<String> c = C9864xy.c("file://" + file.getAbsolutePath(), null);
                    try {
                        bufferedOutputStream.close();
                    } catch (IOException e) {
                        C1044Mm.j("nf_service_filedownloadrequest", "Could not close the stream for " + file.getAbsolutePath(), e);
                    }
                    return c;
                } catch (IOException e2) {
                    e = e2;
                    bufferedOutputStream2 = bufferedOutputStream;
                    C9864xy<String> a = C9864xy.a(new VolleyError("Could not save bytes to " + file.getAbsolutePath(), e));
                    if (bufferedOutputStream2 != null) {
                        try {
                            bufferedOutputStream2.close();
                        } catch (IOException e3) {
                            C1044Mm.j("nf_service_filedownloadrequest", "Could not close the stream for " + file.getAbsolutePath(), e3);
                        }
                    }
                    return a;
                } catch (Throwable th) {
                    th = th;
                    if (bufferedOutputStream != null) {
                        try {
                            bufferedOutputStream.close();
                        } catch (IOException e4) {
                            C1044Mm.j("nf_service_filedownloadrequest", "Could not close the stream for " + file.getAbsolutePath(), e4);
                        }
                    }
                    throw th;
                }
            } catch (IOException e5) {
                e = e5;
            }
        } catch (Throwable th2) {
            th = th2;
            bufferedOutputStream = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.netflix.android.volley.Request
    /* renamed from: a */
    public void b(String str) {
        InterfaceC4943bpS interfaceC4943bpS = this.a;
        if (interfaceC4943bpS != null) {
            interfaceC4943bpS.b(u(), str, InterfaceC1078Nw.aJ);
        }
    }
}
