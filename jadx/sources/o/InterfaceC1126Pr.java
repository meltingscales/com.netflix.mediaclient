package o;

import android.content.Intent;
import com.netflix.mediaclient.clutils.TrackingInfoHolder;
import com.netflix.mediaclient.servicemgr.interface_.VideoType;
import com.netflix.model.leafs.UpNextFeedListItem;

/* renamed from: o.Pr  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC1126Pr {
    public static final d d = d.c;

    void a(UpNextFeedListItem upNextFeedListItem, TrackingInfoHolder trackingInfoHolder);

    void a(InterfaceC5185btw interfaceC5185btw, TrackingInfoHolder trackingInfoHolder);

    void b(String str, VideoType videoType, String str2);

    void b(InterfaceC5223buh interfaceC5223buh, String str, TrackingInfoHolder trackingInfoHolder);

    void c(String str, VideoType videoType, String str2, TrackingInfoHolder trackingInfoHolder);

    void e(String str, VideoType videoType, String str2, TrackingInfoHolder trackingInfoHolder);

    void e(String str, VideoType videoType, String str2, String str3);

    void e(String str, VideoType videoType, String str2, String str3, int i, TrackingInfoHolder trackingInfoHolder);

    void e(InterfaceC5198buI interfaceC5198buI, String str);

    /* renamed from: o.Pr$d */
    /* loaded from: classes3.dex */
    public static final class d {
        static final /* synthetic */ d c = new d();
        private static final Intent d = new Intent();

        public final Intent a() {
            return d;
        }

        private d() {
        }
    }

    /* renamed from: o.Pr$c */
    /* loaded from: classes3.dex */
    public static final class c {
        public static /* synthetic */ void b(InterfaceC1126Pr interfaceC1126Pr, InterfaceC5223buh interfaceC5223buh, String str, TrackingInfoHolder trackingInfoHolder, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: share");
            }
            if ((i & 2) != 0) {
                str = null;
            }
            if ((i & 4) != 0) {
                trackingInfoHolder = null;
            }
            interfaceC1126Pr.b(interfaceC5223buh, str, trackingInfoHolder);
        }

        public static /* synthetic */ void e(InterfaceC1126Pr interfaceC1126Pr, InterfaceC5185btw interfaceC5185btw, TrackingInfoHolder trackingInfoHolder, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: shareGame");
            }
            if ((i & 2) != 0) {
                trackingInfoHolder = null;
            }
            interfaceC1126Pr.a(interfaceC5185btw, trackingInfoHolder);
        }
    }
}
