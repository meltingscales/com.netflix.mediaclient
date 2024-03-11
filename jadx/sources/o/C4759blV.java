package o;

import android.net.Uri;
import androidx.media3.datasource.HttpDataSource;
import java.nio.ByteBuffer;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import o.InterfaceC4796bme;
import org.chromium.net.CronetException;
import org.chromium.net.ExperimentalCronetEngine;
import org.chromium.net.ExperimentalUrlRequest;
import org.chromium.net.NetworkException;
import org.chromium.net.UrlRequest;
import org.chromium.net.UrlResponseInfo;

/* renamed from: o.blV  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C4759blV implements InterfaceC4796bme {
    private final ExperimentalCronetEngine a;
    private final int d;
    private final Executor e;

    public C4759blV(ExperimentalCronetEngine experimentalCronetEngine, Executor executor, int i) {
        this.a = experimentalCronetEngine;
        this.e = executor;
        this.d = i;
    }

    @Override // o.InterfaceC4796bme
    public void d(Uri uri, HttpDataSource.RequestProperties requestProperties, InterfaceC4796bme.a aVar) {
        c cVar = new c(aVar);
        ExperimentalUrlRequest.Builder disableCache = this.a.newUrlRequestBuilder(uri.toString(), (UrlRequest.Callback) cVar, this.e).setHttpMethod("HEAD").allowDirectExecutor().setPriority(1).disableCache();
        if (requestProperties != null) {
            for (Map.Entry<String, String> entry : requestProperties.getSnapshot().entrySet()) {
                disableCache.addHeader(entry.getKey(), entry.getValue());
            }
        }
        disableCache.build().start();
        C8187dfe.a(cVar.a, this.d);
    }

    /* renamed from: o.blV$c */
    /* loaded from: classes3.dex */
    static class c extends UrlRequest.Callback {
        final InterfaceC4796bme.a c;
        private AtomicBoolean e = new AtomicBoolean(false);
        private final Runnable a = new Runnable() { // from class: o.blV.c.3
            @Override // java.lang.Runnable
            public void run() {
                if (c.this.e.getAndSet(true) || c.this.c == null) {
                    return;
                }
                C1044Mm.j("nf_sidechannel", "probe failed with timeout");
                c.this.c.b(6);
            }
        };

        @Override // org.chromium.net.UrlRequest.Callback
        public void onReadCompleted(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, ByteBuffer byteBuffer) {
        }

        @Override // org.chromium.net.UrlRequest.Callback
        public void onSucceeded(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        }

        public c(InterfaceC4796bme.a aVar) {
            this.c = aVar;
        }

        @Override // org.chromium.net.UrlRequest.Callback
        public void onRedirectReceived(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, String str) {
            urlRequest.followRedirect();
        }

        @Override // org.chromium.net.UrlRequest.Callback
        public void onResponseStarted(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
            if (!this.e.getAndSet(true) && this.c != null) {
                if (urlResponseInfo.getHttpStatusCode() >= 200 && urlResponseInfo.getHttpStatusCode() <= 299) {
                    C1044Mm.e("nf_sidechannel", "side channel request succeeded");
                    this.c.a();
                } else {
                    C1044Mm.c("nf_sidechannel", "side channel request failed with http code %d", Integer.valueOf(urlResponseInfo.getHttpStatusCode()));
                    this.c.b(urlResponseInfo.getHttpStatusCode());
                }
            }
            C8187dfe.e(this.a);
            urlRequest.cancel();
        }

        @Override // org.chromium.net.UrlRequest.Callback
        public void onFailed(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, CronetException cronetException) {
            InterfaceC4796bme.a aVar;
            int errorCode = cronetException instanceof NetworkException ? ((NetworkException) cronetException).getErrorCode() : -1;
            C1044Mm.c("nf_sidechannel", "side channel request failed with errorcode: %d", Integer.valueOf(errorCode));
            if (!this.e.getAndSet(true) && (aVar = this.c) != null) {
                aVar.b(errorCode);
            }
            C8187dfe.e(this.a);
        }
    }
}
