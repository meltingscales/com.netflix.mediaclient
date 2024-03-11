package o;

import com.netflix.mediaclient.drm.NetflixMediaDrm;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.nio.channels.WritableByteChannel;
import org.chromium.net.CronetEngine;
import org.chromium.net.CronetException;
import org.chromium.net.UrlRequest;
import org.chromium.net.UrlResponseInfo;
import org.linphone.core.Privacy;

/* loaded from: classes3.dex */
abstract class aPG extends aPU {
    protected CronetEngine a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public aPG(NetflixMediaDrm.ProvisionRequest provisionRequest, InterfaceC1836aQa interfaceC1836aQa) {
        super(provisionRequest, interfaceC1836aQa);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void c() {
        synchronized (this) {
            this.a = new aHG(AbstractApplicationC1040Mh.d()).c(0, 0).e(true).e();
        }
    }

    /* loaded from: classes3.dex */
    class a extends UrlRequest.Callback {
        private WritableByteChannel b;
        public long c;
        private ByteArrayOutputStream d;

        /* JADX INFO: Access modifiers changed from: package-private */
        public a() {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            this.d = byteArrayOutputStream;
            this.b = Channels.newChannel(byteArrayOutputStream);
        }

        @Override // org.chromium.net.UrlRequest.Callback
        public void onRedirectReceived(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, String str) {
            C1044Mm.a("nf_net", "****** onRedirectReceived ******");
            urlRequest.followRedirect();
        }

        @Override // org.chromium.net.UrlRequest.Callback
        public void onResponseStarted(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
            int httpStatusCode = urlResponseInfo.getHttpStatusCode();
            if (httpStatusCode == 200) {
                urlRequest.read(ByteBuffer.allocateDirect(Privacy.DEFAULT));
            } else if (httpStatusCode == 503) {
                urlRequest.read(ByteBuffer.allocateDirect(Privacy.DEFAULT));
            }
        }

        @Override // org.chromium.net.UrlRequest.Callback
        public void onReadCompleted(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, ByteBuffer byteBuffer) {
            byteBuffer.flip();
            try {
                this.b.write(byteBuffer);
            } catch (IOException e) {
                C1044Mm.b("nf_net", e, "IOException during ByteBuffer read. Details: ", new Object[0]);
            }
            byteBuffer.clear();
            urlRequest.read(byteBuffer);
        }

        @Override // org.chromium.net.UrlRequest.Callback
        public void onSucceeded(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
            byte[] byteArray = this.d.toByteArray();
            InterfaceC1836aQa interfaceC1836aQa = aPG.this.c;
            if (interfaceC1836aQa != null) {
                interfaceC1836aQa.a(byteArray);
            }
            aPG.this.a();
        }

        @Override // org.chromium.net.UrlRequest.Callback
        public void onFailed(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, CronetException cronetException) {
            if (urlResponseInfo.getHttpStatusCode() == 400) {
                InterfaceC1598aHf.a(new C1596aHd("15002. Provisiong failed with status code 400 on url " + aPG.this.d.getDefaultUrl()).b(false));
            }
            InterfaceC1598aHf.a(new C1596aHd("Failed to get provisiong certificate. Response is null from URL " + aPG.this.d.getDefaultUrl() + ". HTTP status code: " + urlResponseInfo.getHttpStatusCode()).b(false));
            InterfaceC1836aQa interfaceC1836aQa = aPG.this.c;
            if (interfaceC1836aQa != null) {
                interfaceC1836aQa.a(urlResponseInfo.getHttpStatusCode());
            }
            aPG.this.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        synchronized (this) {
            CronetEngine cronetEngine = this.a;
            if (cronetEngine != null) {
                cronetEngine.shutdown();
                this.a = null;
            }
        }
    }
}
