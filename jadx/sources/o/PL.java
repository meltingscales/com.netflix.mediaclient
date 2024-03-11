package o;

import com.netflix.cl.Logger;
import com.netflix.cl.model.AppView;
import com.netflix.cl.model.CommandValue;
import com.netflix.cl.model.Error;
import com.netflix.cl.model.ShareInfo;
import com.netflix.cl.model.TrackingInfo;
import com.netflix.cl.model.event.session.Focus;
import com.netflix.cl.model.event.session.Session;
import com.netflix.cl.model.event.session.ShareEnded;
import com.netflix.cl.model.event.session.action.Action;
import com.netflix.cl.model.event.session.action.Share;
import com.netflix.cl.model.event.session.command.ShareCommand;
import kotlin.Triple;

/* loaded from: classes3.dex */
public final class PL {
    public static final PL a = new PL();

    private PL() {
    }

    public final void a(Logger logger, boolean z, String str, String str2, TrackingInfo trackingInfo) {
        C8632dsu.c((Object) logger, "");
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) str2, "");
        C8632dsu.c((Object) trackingInfo, "");
        Triple<Long, Long, Long> a2 = a(logger, trackingInfo);
        if (z) {
            e(logger, str, str2, a2);
            return;
        }
        c(logger, a2, "Unable to launch share app: " + str);
    }

    private final Triple<Long, Long, Long> a(Logger logger, TrackingInfo trackingInfo) {
        AppView appView = AppView.shareButton;
        return new Triple<>(logger.startSession(new Focus(appView, trackingInfo)), logger.startSession(new ShareCommand()), logger.startSession(new Share(appView, null, CommandValue.ShareCommand, trackingInfo)));
    }

    private final ShareEnded d(Long l, ShareInfo[] shareInfoArr) {
        if (l == null) {
            return null;
        }
        Session session = Logger.INSTANCE.getSession(l);
        if (session instanceof Share) {
            return new ShareEnded((Share) session, shareInfoArr);
        }
        return null;
    }

    private final void e(Logger logger, String str, String str2, Triple<Long, Long, Long> triple) {
        ShareEnded d = d(triple.f(), new ShareInfo[]{new ShareInfo(str2, str)});
        if (d != null) {
            logger.endSession(d);
        }
        logger.endSession(triple.b());
        logger.endSession(triple.c());
    }

    private final void c(Logger logger, Triple<Long, Long, Long> triple, String str) {
        logger.endSession(Action.createActionFailedEvent(triple.f(), new Error(str, null, null).toJSONObject().toString()));
        logger.endSession(triple.b());
        logger.endSession(triple.c());
    }
}
