package o;

import android.os.Handler;
import com.netflix.android.volley.VolleyError;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.atomic.AtomicBoolean;
import org.chromium.net.CronetException;
import org.chromium.net.UrlRequest;
import org.chromium.net.UrlResponseInfo;

/* loaded from: classes3.dex */
class aHA extends UrlRequest.Callback {
    private static final d a = new d(3, 8192, 1024);
    private CronetException b;
    private final a c;
    private d.c e;
    private UrlRequest h;
    private final String j;
    private List<byte[]> d = new LinkedList();
    private final AtomicBoolean g = new AtomicBoolean(true);

    /* loaded from: classes3.dex */
    public interface a {
        void a(Exception exc);

        void b(C9858xs c9858xs);

        void d(VolleyError volleyError);
    }

    public void d(Handler handler, UrlRequest urlRequest, boolean z) {
        this.h = urlRequest;
    }

    public aHA(String str, a aVar) {
        this.j = str;
        this.c = aVar;
        C1044Mm.d("nf_network", "--> %s", str);
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public void onRedirectReceived(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, String str) {
        C1044Mm.d("nf_network", "--- %s -> %s", this.j, str);
        urlRequest.followRedirect();
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public void onResponseStarted(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        if (!this.g.getAndSet(false)) {
            C1044Mm.d("nf_network", "discarding response - already app-timed-out");
            return;
        }
        d.c a2 = a.a();
        this.e = a2;
        urlRequest.read(a2.a);
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public void onReadCompleted(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        byte[] bArr = new byte[position];
        System.arraycopy(byteBuffer.array(), byteBuffer.arrayOffset(), bArr, 0, position);
        this.d.add(bArr);
        this.e.a.clear();
        urlRequest.read(this.e.a);
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public void onSucceeded(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        a();
        this.c.b(e(urlResponseInfo, this.d));
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public void onFailed(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, CronetException cronetException) {
        a();
        Object[] objArr = new Object[2];
        objArr[0] = this.j;
        objArr[1] = cronetException == null ? "" : cronetException.getMessage();
        C1044Mm.d("nf_network", "!!! %s %s", objArr);
        this.c.d(new VolleyError(cronetException));
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public void onCanceled(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        a();
        C1044Mm.d("nf_network", "!!! %s CANCELED", urlResponseInfo.getUrl());
        if (this.b != null) {
            this.c.d(new VolleyError(this.b));
        } else {
            this.c.a(new IOException("request canceled"));
        }
    }

    private void a() {
        d.c cVar = this.e;
        if (cVar != null) {
            a.c(cVar);
            this.e = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static class d {
        private final int a;
        private final Deque<c> b = new ConcurrentLinkedDeque();

        public d(int i, int i2, int i3) {
            this.a = i3;
            for (int i4 = 0; i4 < i; i4++) {
                this.b.add(new c(i2, true));
            }
        }

        public c a() {
            c poll = this.b.poll();
            return poll == null ? new c(this.a, false) : poll;
        }

        public void c(c cVar) {
            if (cVar.c) {
                cVar.a.clear();
                this.b.add(cVar);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes3.dex */
        public static class c {
            final ByteBuffer a;
            final boolean c;

            public c(int i, boolean z) {
                this.a = ByteBuffer.allocateDirect(i);
                this.c = z;
            }
        }
    }

    private static final C9858xs e(UrlResponseInfo urlResponseInfo, List<byte[]> list) {
        byte[] bArr;
        int httpStatusCode = urlResponseInfo.getHttpStatusCode();
        if (list.size() == 1) {
            bArr = list.get(0);
        } else {
            int i = 0;
            for (byte[] bArr2 : list) {
                i += bArr2.length;
            }
            if (i > 10485760) {
                InterfaceC1598aHf.a(new C1596aHd("excessive network response size (" + i + "): " + urlResponseInfo.getUrl()).b(false));
            }
            byte[] bArr3 = new byte[i];
            int i2 = 0;
            for (byte[] bArr4 : list) {
                System.arraycopy(bArr4, 0, bArr3, i2, bArr4.length);
                i2 += bArr4.length;
            }
            bArr = bArr3;
        }
        TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        for (Map.Entry<String, String> entry : urlResponseInfo.getAllHeadersAsList()) {
            if ("Set-Cookie".equalsIgnoreCase(entry.getKey()) && treeMap.containsKey("Set-Cookie")) {
                treeMap.put(entry.getKey(), ((String) treeMap.get(entry.getKey())) + "; " + entry.getValue());
            } else {
                treeMap.put(entry.getKey(), entry.getValue());
            }
        }
        return new C9858xs(httpStatusCode, bArr, treeMap, false);
    }
}
