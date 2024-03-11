package o;

import com.netflix.mediaclient.drm.NetflixMediaDrm;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import o.aPG;
import org.chromium.net.UrlRequest;

/* loaded from: classes3.dex */
public final class aPL extends aPG {
    /* JADX INFO: Access modifiers changed from: package-private */
    public aPL(NetflixMediaDrm.ProvisionRequest provisionRequest, InterfaceC1836aQa interfaceC1836aQa) {
        super(provisionRequest, interfaceC1836aQa);
        C1044Mm.e("nf_net", "Google platform Widevine provisioning V2 request");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* renamed from: d */
    public byte[] doInBackground(Void... voidArr) {
        d().start();
        return null;
    }

    private UrlRequest d() {
        c();
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
        aPG.a aVar = new aPG.a();
        aVar.c = System.nanoTime();
        UrlRequest.Builder newUrlRequestBuilder = this.a.newUrlRequestBuilder(this.d.getDefaultUrl() + "&signedRequest=" + new String(this.d.getData()), aVar, newSingleThreadExecutor);
        newUrlRequestBuilder.setHttpMethod("POST");
        newUrlRequestBuilder.addHeader("Accept", "*/*");
        newUrlRequestBuilder.addHeader("User-Agent", "Widevine CDM v1.0");
        newUrlRequestBuilder.addHeader("Content-Type", "application/json");
        return newUrlRequestBuilder.build();
    }
}
