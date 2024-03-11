package o;

import com.netflix.cl.Logger;
import com.netflix.cl.model.AppView;
import com.netflix.cl.model.CommandValue;
import com.netflix.cl.model.TrackingInfo;
import com.netflix.cl.model.event.discrete.DebugEvent;
import com.netflix.cl.model.event.discrete.Presented;
import com.netflix.cl.model.event.session.Countdown;
import com.netflix.cl.model.event.session.Focus;
import com.netflix.cl.model.event.session.NavigationLevel;
import com.netflix.cl.model.event.session.action.Navigate;
import com.netflix.cl.model.event.session.command.PlayNextCommand;
import com.netflix.mediaclient.clutils.CLv2Utils;
import java.util.Collections;
import java.util.Map;
import o.AbstractC5531cAw;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: o.cxM  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C7496cxM {
    private static Long a;
    private static Long b;
    public static final C7496cxM e = new C7496cxM();

    private C7496cxM() {
    }

    public final void e(AbstractC5531cAw abstractC5531cAw) {
        C8632dsu.c((Object) abstractC5531cAw, "");
        Long l = b;
        Logger logger = Logger.INSTANCE;
        logger.endSession(l);
        TrackingInfo a2 = C7638czw.d.a(abstractC5531cAw);
        AppView appView = AppView.postPlay;
        Long startSession = logger.startSession(new Navigate(appView, null, CommandValue.PlayCommand, a2));
        b = logger.startSession(new NavigationLevel(appView, a2));
        logger.endSession(startSession);
    }

    public static final void d() {
        Logger.INSTANCE.endSession(b);
        b = null;
    }

    public final void a(long j) {
        Long l = a;
        if (l != null) {
            Logger.INSTANCE.endSession(Long.valueOf(l.longValue()));
        }
        a = Logger.INSTANCE.startSession(new Countdown(Long.valueOf(j)));
    }

    public final void e() {
        Long l = a;
        if (l != null) {
            Logger.INSTANCE.endSession(Long.valueOf(l.longValue()));
            a = null;
        }
    }

    public final void c() {
        Long l = a;
        if (l != null) {
            Logger.INSTANCE.cancelSession(Long.valueOf(l.longValue()));
            a = null;
        }
    }

    public final void a(AbstractC5531cAw abstractC5531cAw) {
        C8632dsu.c((Object) abstractC5531cAw, "");
        if (abstractC5531cAw instanceof C5529cAu) {
            Logger.INSTANCE.logEvent(new Presented(AppView.nextEpisodeButton, Boolean.FALSE, C7638czw.d.a(abstractC5531cAw)));
            return;
        }
        boolean z = abstractC5531cAw instanceof AbstractC5531cAw.b;
    }

    public final void d(int i) {
        Map l;
        CLv2Utils cLv2Utils = CLv2Utils.INSTANCE;
        AppView appView = AppView.nextEpisodeButton;
        Map singletonMap = Collections.singletonMap("trackId", Integer.valueOf(i));
        C8632dsu.a(singletonMap, "");
        l = dqE.l(singletonMap);
        cLv2Utils.e(new Focus(appView, CLv2Utils.a(l)), new PlayNextCommand());
    }

    public final void e(String str) {
        C8632dsu.c((Object) str, "");
        if (C1877aRo.b.e()) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("ab55877Action", str);
                Logger.INSTANCE.logEvent(new DebugEvent(jSONObject));
            } catch (JSONException unused) {
            }
        }
    }
}
