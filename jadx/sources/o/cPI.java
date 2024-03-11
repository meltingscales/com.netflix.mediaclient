package o;

import com.netflix.cl.Logger;
import com.netflix.cl.model.AppView;
import com.netflix.cl.model.CommandValue;
import com.netflix.cl.model.event.discrete.Selected;
import com.netflix.cl.model.event.discrete.Submitted;
import com.netflix.cl.model.event.session.Presentation;
import com.netflix.cl.model.event.session.action.Search;

/* loaded from: classes4.dex */
public final class cPI {
    private Long b;

    public final void d(AppView appView) {
        C8632dsu.c((Object) appView, "");
        if (this.b != null) {
            c();
        }
        this.b = Logger.INSTANCE.startSession(new Presentation(appView, null));
    }

    public final void c() {
        Long l = this.b;
        if (l != null) {
            Logger.INSTANCE.endSession(Long.valueOf(l.longValue()));
        }
    }

    public final void e() {
        Logger.INSTANCE.logEvent(new Selected(AppView.maturitySettings, null, CommandValue.ChangeMaturityCommand, null));
    }

    public final void a() {
        Logger.INSTANCE.logEvent(new Submitted(AppView.blockedTitles, null, CommandValue.AddBlockedTitleCommand, null));
    }

    public final void b() {
        Logger.INSTANCE.logEvent(new Submitted(AppView.blockedTitles, null, CommandValue.RemoveBlockedTitleCommand, null));
    }

    public final void d(String str) {
        C8632dsu.c((Object) str, "");
        Logger logger = Logger.INSTANCE;
        logger.endSession(logger.startSession(new Search(AppView.blockedTitles, str, null, CommandValue.SearchBlockedTitleCommand, null)));
    }
}
