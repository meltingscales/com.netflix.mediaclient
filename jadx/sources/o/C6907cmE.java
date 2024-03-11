package o;

import com.netflix.cl.ExtLogger;
import com.netflix.cl.Logger;
import com.netflix.mediaclient.android.app.Status;
import kotlin.Pair;

/* renamed from: o.cmE  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C6907cmE extends C5087bsD {
    private final Long e;

    public C6907cmE(String str, Long l) {
        super(str);
        this.e = l;
    }

    @Override // o.C5087bsD, o.InterfaceC5094bsK
    public void a(Status status) {
        super.a(status);
        e(status);
    }

    @Override // o.C5087bsD, o.InterfaceC5094bsK
    public void c(Status status) {
        super.c(status);
        e(status);
    }

    @Override // o.C5087bsD, o.InterfaceC5094bsK
    public void a(boolean z, Status status) {
        super.a(z, status);
        e(status);
    }

    public final void c(aLO<? extends Pair<Boolean, ? extends Status>> alo) {
        C8632dsu.c((Object) alo, "");
        if (alo instanceof aLZ) {
            e((Status) ((Pair) ((aLZ) alo).e()).a());
        } else if (alo instanceof aLL) {
            e(InterfaceC1078Nw.ad);
        }
    }

    private final void e(Status status) {
        if (this.e != null) {
            if (status != null && status.j()) {
                Logger.INSTANCE.endSession(this.e);
            } else {
                ExtLogger.INSTANCE.failedAction(this.e, C8169dfM.b(status));
            }
        }
    }
}
