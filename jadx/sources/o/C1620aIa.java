package o;

import android.content.Context;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLStreamHandlerFactory;
import java.util.concurrent.Executor;
import org.chromium.net.BidirectionalStream;
import org.chromium.net.ExperimentalBidirectionalStream;
import org.chromium.net.ExperimentalCronetEngine;
import org.chromium.net.ExperimentalUrlRequest;
import org.chromium.net.UrlRequest;

/* renamed from: o.aIa  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C1620aIa extends ExperimentalCronetEngine {
    @Override // org.chromium.net.CronetEngine
    public URLStreamHandlerFactory createURLStreamHandlerFactory() {
        return null;
    }

    @Override // org.chromium.net.CronetEngine
    public byte[] getGlobalMetricsDeltas() {
        return new byte[0];
    }

    @Override // org.chromium.net.CronetEngine
    public String getVersionString() {
        return null;
    }

    @Override // org.chromium.net.ExperimentalCronetEngine
    public ExperimentalBidirectionalStream.Builder newBidirectionalStreamBuilder(String str, BidirectionalStream.Callback callback, Executor executor) {
        return null;
    }

    @Override // org.chromium.net.ExperimentalCronetEngine, org.chromium.net.CronetEngine
    public ExperimentalUrlRequest.Builder newUrlRequestBuilder(String str, UrlRequest.Callback callback, Executor executor) {
        return null;
    }

    @Override // org.chromium.net.CronetEngine
    public URLConnection openConnection(URL url) {
        return null;
    }

    @Override // org.chromium.net.CronetEngine
    public void shutdown() {
    }

    @Override // org.chromium.net.CronetEngine
    public void startNetLogToFile(String str, boolean z) {
    }

    @Override // org.chromium.net.CronetEngine
    public void stopNetLog() {
    }

    public C1620aIa() {
        throw new AssertionError("not possible: debug cronet code used in release");
    }

    /* renamed from: o.aIa$c */
    /* loaded from: classes3.dex */
    public static class c extends ExperimentalCronetEngine.Builder {
        public c(Context context) {
            super(context);
        }
    }
}
