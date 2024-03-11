package o;

import android.content.Context;
import com.netflix.mediaclient.net.NetworkRequestType;
import com.netflix.mediaclient.net.RequestMetricsMarker;
import java.util.ArrayList;
import org.chromium.net.RequestFinishedInfo;
import org.chromium.net.UrlResponseInfo;

/* loaded from: classes3.dex */
class aHC {
    private aHH a;
    private final Context c;

    public void d(aHH ahh) {
        this.a = ahh;
    }

    public aHC(Context context) {
        this.c = context;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e(RequestFinishedInfo requestFinishedInfo) {
        Long l;
        Long l2;
        NetworkRequestType networkRequestType = null;
        ArrayList<aHT> arrayList = null;
        ArrayList arrayList2 = null;
        for (Object obj : requestFinishedInfo.getAnnotations()) {
            if (obj instanceof NetworkRequestType) {
                networkRequestType = (NetworkRequestType) obj;
            } else if (obj instanceof aHT) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add((aHT) obj);
            } else if (obj instanceof RequestMetricsMarker) {
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                }
                arrayList2.add((RequestMetricsMarker) obj);
            }
        }
        if (networkRequestType == null) {
            networkRequestType = aHK.b(requestFinishedInfo.getUrl()) ? NetworkRequestType.CONTENT_BOXART : null;
        }
        if (this.a != null) {
            RequestFinishedInfo.Metrics metrics = requestFinishedInfo.getMetrics();
            if (metrics != null) {
                Long sentByteCount = metrics.getSentByteCount();
                l2 = metrics.getReceivedByteCount();
                l = sentByteCount;
            } else {
                l = null;
                l2 = null;
            }
            UrlResponseInfo responseInfo = requestFinishedInfo.getResponseInfo();
            this.a.c(networkRequestType, responseInfo != null ? responseInfo.getAllHeaders() : null, requestFinishedInfo.getUrl(), l, l2);
        }
        boolean b = b(networkRequestType, requestFinishedInfo);
        boolean z = (arrayList == null || arrayList.isEmpty()) ? false : true;
        if (b || z) {
            aHP ahp = new aHP(this.c, requestFinishedInfo, arrayList2);
            if (z) {
                for (aHT aht : arrayList) {
                    aht.e(ahp);
                }
            }
            aHH ahh = this.a;
            if (ahh == null || !b) {
                return;
            }
            ahh.d(ahp);
        }
    }

    private static boolean b(NetworkRequestType networkRequestType, RequestFinishedInfo requestFinishedInfo) {
        String url = requestFinishedInfo.getUrl();
        if (url == null) {
            return false;
        }
        if (aHK.b(url) || networkRequestType == NetworkRequestType.CONTENT_BOXART) {
            C1044Mm.a("nf_cr_stats", "onCronetRequestFinished %s", url);
            return requestFinishedInfo.getFinishedReason() != 2;
        }
        return false;
    }
}
