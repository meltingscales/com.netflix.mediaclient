package o;

import com.netflix.cl.model.event.session.DebugSession;
import com.netflix.cl.model.event.session.SessionEnded;
import com.netflix.cl.util.ExtCLUtils;
import com.netflix.mediaclient.service.logging.perf.PerformanceProfilerImpl;
import com.netflix.mediaclient.service.logging.perf.Sessions;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: o.aVs  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1988aVs {
    public String a;
    private String b = "PerfSession";
    public SessionEnded c;
    public DebugSession e;

    public boolean c() {
        return (this.e == null || this.c == null) ? false : true;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        DebugSession debugSession = this.e;
        if (debugSession != null) {
            sb.append(String.format("Name - %s.started, logTime - %d", this.a, Long.valueOf(debugSession.getTimeInMs())));
        }
        if (this.c != null) {
            if (this.e != null) {
                sb.append("\n");
            }
            sb.append(String.format("Name - %s.ended, logTime - %d, duration - %d", this.a, Long.valueOf(this.c.getTimeInMs()), Long.valueOf(this.c.getDurationInMs())));
        }
        return sb.toString();
    }

    public static C1988aVs b(Sessions sessions, Map<String, String> map) {
        C1988aVs c1988aVs = new C1988aVs();
        c1988aVs.a = sessions.name();
        JSONObject b = PerformanceProfilerImpl.b(sessions, map);
        try {
            b.put("type", ExtCLUtils.DebugSessionType.Performance.getValue());
        } catch (JSONException unused) {
        }
        c1988aVs.e = new DebugSession(b);
        return c1988aVs;
    }
}
