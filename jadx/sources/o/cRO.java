package o;

import com.netflix.cl.Logger;
import com.netflix.cl.model.AppView;
import com.netflix.mediaclient.clutils.TrackingInfoHolder;
import com.netflix.mediaclient.servicemgr.PlayLocationType;

/* loaded from: classes4.dex */
public final class cRO implements cRJ {
    private Long a;
    private final String b;
    private final AppView c;
    private final String d;
    private Long e;
    private final String h;
    private TrackingInfoHolder j;

    public cRO(String str, String str2, String str3, AppView appView) {
        C8632dsu.c((Object) str3, "");
        C8632dsu.c((Object) appView, "");
        this.h = str;
        this.b = str2;
        this.d = str3;
        this.c = appView;
        this.j = new TrackingInfoHolder(PlayLocationType.SEARCH_SUGGESTION_RESULTS);
    }

    @Override // o.cRJ
    public void a(C6089cTl c6089cTl) {
        C8632dsu.c((Object) c6089cTl, "");
        if (this.a == null && (!c6089cTl.h().isEmpty())) {
            b();
            e(c6089cTl);
            this.a = C6043cRw.a(this.c, this.j.e(c6089cTl.h().get(0), 0));
        }
    }

    @Override // o.cRJ
    public void c() {
        Logger.INSTANCE.endSession(this.a);
        this.a = null;
    }

    public void e(C6089cTl c6089cTl) {
        C8632dsu.c((Object) c6089cTl, "");
        if (this.e == null && (!c6089cTl.h().isEmpty())) {
            this.e = Long.valueOf(C6043cRw.e(this.c, this.d, this.h, c6089cTl.h().get(0).getReferenceId(), this.b, -1, null));
        }
    }

    @Override // o.cRJ
    public void b() {
        Logger.INSTANCE.removeContext(this.e);
        this.e = null;
    }
}
