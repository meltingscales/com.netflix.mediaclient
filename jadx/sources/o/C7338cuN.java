package o;

import com.netflix.mediaclient.clutils.ListSummaryCLTrackingInfo;
import com.netflix.mediaclient.clutils.TrackingInfoHolder;
import com.netflix.mediaclient.clutils.VideoSummaryCLTrackingInfo;

/* renamed from: o.cuN  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C7338cuN {
    public static final TrackingInfoHolder d(TrackingInfoHolder trackingInfoHolder, InterfaceC5206buQ interfaceC5206buQ, C7460cwd c7460cwd, Integer num) {
        int c;
        C8632dsu.c((Object) trackingInfoHolder, "");
        C8632dsu.c((Object) interfaceC5206buQ, "");
        String n = interfaceC5206buQ.n();
        if (n == null) {
            n = "missingOfflineRequestId";
        }
        ListSummaryCLTrackingInfo listSummaryCLTrackingInfo = new ListSummaryCLTrackingInfo(n, null, null, num != null ? num.intValue() : interfaceC5206buQ.l(), null, null, 0);
        String aH_ = interfaceC5206buQ.aH_();
        C8632dsu.a(aH_, "");
        c = C8672dug.c(10);
        return TrackingInfoHolder.b(trackingInfoHolder, null, null, listSummaryCLTrackingInfo, new VideoSummaryCLTrackingInfo(Integer.parseInt(aH_, c), c7460cwd != null ? c7460cwd.getUnifiedEntityId() : null, (c7460cwd == null || (r0 = c7460cwd.getBoxartId()) == null) ? "missingOfflineImageKey" : "missingOfflineImageKey", 0, null), 3, null);
    }
}
