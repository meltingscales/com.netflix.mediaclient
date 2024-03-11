package o;

import androidx.media3.common.Timeline;
import androidx.media3.exoplayer.analytics.AnalyticsListener;

/* renamed from: o.bmG  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4772bmG {
    public static final Timeline.Window a(AnalyticsListener.EventTime eventTime) {
        C8632dsu.c((Object) eventTime, "");
        Timeline.Window window = eventTime.timeline.getWindow(eventTime.currentWindowIndex, new Timeline.Window());
        C8632dsu.a(window, "");
        return window;
    }

    public static final C4680bjA c(AnalyticsListener.EventTime eventTime) {
        C8632dsu.c((Object) eventTime, "");
        Object obj = a(eventTime).tag;
        if (obj != null) {
            return (C4680bjA) C9726vo.c(obj, C4680bjA.class);
        }
        return null;
    }
}
