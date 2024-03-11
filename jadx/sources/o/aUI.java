package o;

import android.content.Context;
import com.netflix.mediaclient.api.logging.error.ErrorType;
import com.netflix.mediaclient.service.webclient.ftl.FtlController;
import com.netflix.mediaclient.service.webclient.ftl.FtlSession;
import org.json.JSONException;

/* loaded from: classes.dex */
public abstract class aUI extends AbstractC5119bsj {
    protected void b() {
        e(FtlController.INSTANCE.d());
    }

    public void e(FtlSession ftlSession) {
        if (this.i.has("ftlstatus") || ftlSession == null) {
            return;
        }
        this.i.put("ftlstatus", ftlSession.c());
    }

    public void d() {
        C4854bnj c4854bnj;
        try {
            c4854bnj = C4618bhs.a.a();
        } catch (Throwable th) {
            InterfaceC1598aHf.a(new C1596aHd("Failed to retrieve playback reporter config.").b(ErrorType.e).b(true).d(th).e(true));
            c4854bnj = null;
        }
        try {
            this.i.put("groupname", (c4854bnj == null || c4854bnj.e() == null) ? "control" : c4854bnj.e());
        } catch (JSONException unused) {
        }
    }

    @Override // o.AbstractC5119bsj
    public void b(Context context, aOV aov, String str, String str2) {
        super.b(context, aov, str, str2);
        b();
    }
}
