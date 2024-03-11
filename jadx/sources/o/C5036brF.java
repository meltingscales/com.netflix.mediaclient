package o;

import com.netflix.mediaclient.service.webclient.ftl.FtlSession;
import org.json.JSONException;

/* renamed from: o.brF  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C5036brF extends aUI {
    @Override // com.netflix.mediaclient.servicemgr.Logblob
    public String a() {
        return "ftlsession";
    }

    public C5036brF(FtlSession ftlSession) {
        this(ftlSession.a, ftlSession);
    }

    public C5036brF(FtlSession.Type type, FtlSession ftlSession) {
        d();
        try {
            this.i.put("comp", "unified");
            this.i.put("sessiontype", type.toString());
            this.i.put("foreground", ftlSession.j());
            this.i.put("online", ftlSession.i());
            e(ftlSession);
        } catch (JSONException unused) {
            C1044Mm.d("nf_ftl", "unable to create ftlsession logblob");
        }
    }
}
