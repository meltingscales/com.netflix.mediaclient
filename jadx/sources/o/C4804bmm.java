package o;

import android.annotation.SuppressLint;
import androidx.media3.datasource.DataSpec;
import com.netflix.mediaclient.net.NetworkRequestType;
import java.util.concurrent.Executors;
import org.chromium.net.RequestFinishedInfo;
import org.chromium.net.UrlResponseInfo;

/* renamed from: o.bmm  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4804bmm extends RequestFinishedInfo.Listener {
    public C4804bmm() {
        super(Executors.newFixedThreadPool(1));
    }

    @Override // org.chromium.net.RequestFinishedInfo.Listener
    @SuppressLint({"WrongConstant"})
    public void onRequestFinished(RequestFinishedInfo requestFinishedInfo) {
        RequestFinishedInfo.Metrics metrics;
        NetworkRequestType networkRequestType;
        C8632dsu.c((Object) requestFinishedInfo, "");
        for (Object obj : requestFinishedInfo.getAnnotations()) {
            if (obj instanceof InterfaceC4834bnP) {
                ((InterfaceC4834bnP) obj).c(requestFinishedInfo);
            } else if ((obj instanceof DataSpec) && (metrics = requestFinishedInfo.getMetrics()) != null) {
                DataSpec dataSpec = (DataSpec) obj;
                boolean isFlagSet = dataSpec.isFlagSet(262144);
                int d = C4632biF.d(dataSpec.key);
                if (d == 1) {
                    networkRequestType = isFlagSet ? NetworkRequestType.CONTENT_AUDIO_PREFETCH : NetworkRequestType.CONTENT_AUDIO;
                } else if (d == 3) {
                    networkRequestType = NetworkRequestType.CONTENT_SUBTITLES;
                } else {
                    networkRequestType = isFlagSet ? NetworkRequestType.CONTENT_VIDEO_PREFETCH : NetworkRequestType.CONTENT_VIDEO;
                }
                NetworkRequestType networkRequestType2 = networkRequestType;
                aHH ahh = (aHH) C1332Xp.b(aHH.class);
                if (ahh != null) {
                    UrlResponseInfo responseInfo = requestFinishedInfo.getResponseInfo();
                    ahh.c(networkRequestType2, responseInfo != null ? responseInfo.getAllHeaders() : null, requestFinishedInfo.getUrl(), metrics.getSentByteCount(), metrics.getReceivedByteCount());
                }
            }
        }
    }
}
