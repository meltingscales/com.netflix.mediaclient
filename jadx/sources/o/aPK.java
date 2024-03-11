package o;

import android.annotation.TargetApi;
import com.netflix.mediaclient.drm.NetflixMediaDrm;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import o.aPG;
import org.chromium.net.UploadDataProviders;
import org.chromium.net.UrlRequest;
import org.json.JSONException;
import org.json.JSONObject;

@TargetApi(26)
/* loaded from: classes3.dex */
final class aPK extends aPG {
    /* JADX INFO: Access modifiers changed from: package-private */
    public aPK(NetflixMediaDrm.ProvisionRequest provisionRequest, InterfaceC1836aQa interfaceC1836aQa) {
        super(provisionRequest, interfaceC1836aQa);
        C1044Mm.e("nf_net", "Google platform Widevine provisioning V3 request");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* renamed from: e */
    public byte[] doInBackground(Void... voidArr) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("signedRequest", new String(this.d.getData()));
            a(jSONObject.toString().getBytes()).start();
            return null;
        } catch (JSONException e) {
            C1044Mm.b("nf_net", e, "Failed to create JSON object!", new Object[0]);
            InterfaceC1598aHf.a(new C1596aHd("Failed to create JSON object with payload!").b(false));
            InterfaceC1836aQa interfaceC1836aQa = this.c;
            if (interfaceC1836aQa != null) {
                interfaceC1836aQa.a(-1);
                return null;
            }
            return null;
        }
    }

    private UrlRequest a(byte[] bArr) {
        c();
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
        aPG.a aVar = new aPG.a();
        aVar.c = System.nanoTime();
        UrlRequest.Builder newUrlRequestBuilder = this.a.newUrlRequestBuilder(this.d.getDefaultUrl(), aVar, newSingleThreadExecutor);
        newUrlRequestBuilder.setHttpMethod("POST");
        newUrlRequestBuilder.addHeader("Content-Type", "application/json");
        newUrlRequestBuilder.setUploadDataProvider(UploadDataProviders.create(bArr), newSingleThreadExecutor);
        return newUrlRequestBuilder.build();
    }
}
