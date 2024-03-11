package o;

import com.netflix.cl.Logger;
import com.netflix.cl.model.AppView;
import com.netflix.cl.model.CommandValue;
import com.netflix.cl.model.event.discrete.Selected;
import com.netflix.cl.model.event.session.Presentation;

/* loaded from: classes4.dex */
public final class bZL {
    private static Long e;
    public static final bZL d = new bZL();
    public static final int a = 8;

    private bZL() {
    }

    public final void e() {
        e = Logger.INSTANCE.startSession(new Presentation(AppView.localNetworkPermissionDialog, null));
    }

    public final void a() {
        Long l = e;
        if (l != null) {
            Logger.INSTANCE.endSession(Long.valueOf(l.longValue()));
        }
        e = null;
    }

    public final void d() {
        Long l = e;
        if (l != null) {
            Logger.INSTANCE.cancelSession(Long.valueOf(l.longValue()));
        }
        e = null;
    }

    public final void c() {
        b(CommandValue.AllowLocalNetworkPermissionCommand);
    }

    public final void b() {
        b(CommandValue.DenyLocalNetworkPermissionCommand);
    }

    private final void b(CommandValue commandValue) {
        Logger.INSTANCE.logEvent(new Selected(AppView.localNetworkPermissionDialog, null, commandValue, null));
    }
}
