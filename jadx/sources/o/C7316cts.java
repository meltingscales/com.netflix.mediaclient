package o;

import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.service.logging.logblob.LogBlobType;
import com.netflix.mediaclient.servicemgr.IClientLogging;
import com.netflix.mediaclient.servicemgr.LogArguments;
import com.netflix.mediaclient.servicemgr.Logblob;
import com.netflix.mediaclient.servicemgr.ServiceManager;
import com.netflix.mediaclient.servicemgr.interface_.offline.WatchState;
import org.json.JSONException;

/* renamed from: o.cts  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C7316cts extends AbstractC1974aVe {
    @Override // o.AbstractC5119bsj, com.netflix.mediaclient.servicemgr.Logblob
    public boolean e() {
        return true;
    }

    private C7316cts(Logblob.Severity severity, String str, String str2, String str3, String str4, String str5) {
        super(str2, str3);
        this.f = severity;
        this.i.put("level", LogArguments.LogLevel.ERROR.d());
        if (C8168dfL.h(str)) {
            this.i.put("mid", str);
        }
        if (C8168dfL.h(str4)) {
            this.i.put("errorcode", str4);
        }
        if (C8168dfL.h(str5)) {
            this.i.put("errormsg", str5);
        }
    }

    @Override // com.netflix.mediaclient.servicemgr.Logblob
    public String a() {
        return LogBlobType.OFFLINE_LOGBLOB_TYPE.a();
    }

    public static void a(NetflixActivity netflixActivity, String str, String str2, String str3, WatchState watchState) {
        ServiceManager c;
        IClientLogging h;
        InterfaceC5090bsG e;
        if (C8054ddD.l(netflixActivity) || (c = ServiceManager.c(netflixActivity)) == null || (h = c.h()) == null || (e = h.e()) == null) {
            return;
        }
        try {
            e.a(new C7316cts(Logblob.Severity.error, str, str2, str3, C8181dfY.e(watchState), "offlineWatchError"));
        } catch (JSONException e2) {
            C1044Mm.e("offlineDialogLogblob", "JSONException:", e2);
        } catch (Exception e3) {
            C1044Mm.e("offlineDialogLogblob", "Exception:", e3);
        }
    }
}
