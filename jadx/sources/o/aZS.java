package o;

import java.nio.ByteBuffer;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;
import o.InterfaceC4229baa;
import org.chromium.net.CronetException;
import org.chromium.net.ExperimentalCronetEngine;
import org.chromium.net.ExperimentalUrlRequest;
import org.chromium.net.RequestFinishedInfo;
import org.chromium.net.UploadDataProviders;
import org.chromium.net.UrlRequest;
import org.chromium.net.UrlResponseInfo;

/* loaded from: classes3.dex */
class aZS implements InterfaceC4229baa {
    private final ExecutorService b = Executors.newSingleThreadExecutor();
    private final aMF c;
    private final ExperimentalCronetEngine d;

    /* loaded from: classes3.dex */
    interface d {
        void b(int i);
    }

    public aZS(aMF amf) {
        C1044Mm.a("nf_probe", "creating isolated cronet engine %s", Integer.valueOf(System.identityHashCode(this)));
        this.c = amf;
        this.d = new aHG(amf.getContext()).c(0, 0).e();
    }

    @Override // o.InterfaceC4229baa
    public void a(C4232bad c4232bad, final InterfaceC4229baa.e eVar) {
        final C4235bag c4235bag = new C4235bag();
        final AtomicInteger atomicInteger = new AtomicInteger(2);
        ExperimentalUrlRequest.Builder disableCache = this.d.newUrlRequestBuilder(c4232bad.a(""), (UrlRequest.Callback) new e(new d() { // from class: o.aZQ
            @Override // o.aZS.d
            public final void b(int i) {
                aZS.a(C4235bag.this, atomicInteger, eVar, i);
            }
        }), (Executor) this.b).setRequestFinishedListener(new RequestFinishedInfo.Listener(this.b) { // from class: o.aZS.4
            @Override // org.chromium.net.RequestFinishedInfo.Listener
            public void onRequestFinished(RequestFinishedInfo requestFinishedInfo) {
                c4235bag.b(requestFinishedInfo);
                if (atomicInteger.decrementAndGet() == 0) {
                    eVar.e(c4235bag);
                }
            }
        }).disableCache();
        for (Map.Entry<String, String> entry : c4232bad.j().entrySet()) {
            disableCache.addHeader(entry.getKey(), entry.getValue());
        }
        if (c4232bad.Q_() != null) {
            disableCache.setHttpMethod("POST");
            disableCache.setUploadDataProvider(UploadDataProviders.create(c4232bad.Q_()), (Executor) this.b);
        }
        disableCache.build().start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(C4235bag c4235bag, AtomicInteger atomicInteger, InterfaceC4229baa.e eVar, int i) {
        c4235bag.c(i);
        if (atomicInteger.decrementAndGet() == 0) {
            eVar.e(c4235bag);
        }
    }

    @Override // o.InterfaceC4229baa
    public void b() {
        C1044Mm.a("nf_probe", "destroying isolated cronet engine %s", Integer.valueOf(System.identityHashCode(this)));
        this.d.shutdown();
        this.b.shutdown();
    }

    /* loaded from: classes3.dex */
    static class e extends UrlRequest.Callback {
        private final ByteBuffer b = ByteBuffer.allocateDirect(4096);
        private int d = 0;
        private final d e;

        public e(d dVar) {
            this.e = dVar;
        }

        @Override // org.chromium.net.UrlRequest.Callback
        public void onRedirectReceived(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, String str) {
            urlRequest.followRedirect();
        }

        @Override // org.chromium.net.UrlRequest.Callback
        public void onResponseStarted(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
            urlRequest.read(this.b);
        }

        @Override // org.chromium.net.UrlRequest.Callback
        public void onReadCompleted(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, ByteBuffer byteBuffer) {
            this.d += byteBuffer.position();
            byteBuffer.clear();
            urlRequest.read(byteBuffer);
        }

        @Override // org.chromium.net.UrlRequest.Callback
        public void onSucceeded(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
            this.e.b(this.d);
        }

        @Override // org.chromium.net.UrlRequest.Callback
        public void onFailed(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, CronetException cronetException) {
            this.e.b(this.d);
        }
    }
}
