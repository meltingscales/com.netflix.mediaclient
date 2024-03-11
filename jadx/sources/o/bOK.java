package o;

import com.netflix.cl.Logger;
import com.netflix.cl.model.AppView;
import com.netflix.cl.model.CommandValue;
import com.netflix.cl.model.TrackingInfo;
import com.netflix.cl.model.context.DeepLinkSharedContext;
import com.netflix.cl.model.event.discrete.Selected;

/* loaded from: classes4.dex */
public final class bOK {
    public static final void e(TrackingInfo trackingInfo, String str) {
        C8632dsu.c((Object) trackingInfo, "");
        C8632dsu.c((Object) str, "");
        Logger logger = Logger.INSTANCE;
        long addContext = logger.addContext(new DeepLinkSharedContext(str));
        logger.logEvent(new Selected(AppView.gameLaunchButton, null, CommandValue.GameLaunchCommand, trackingInfo));
        logger.removeContext(Long.valueOf(addContext));
    }
}
