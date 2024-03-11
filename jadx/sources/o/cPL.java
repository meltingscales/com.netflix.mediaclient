package o;

import com.netflix.cl.ExtLogger;
import com.netflix.cl.Logger;
import com.netflix.mediaclient.android.app.Status;

/* loaded from: classes4.dex */
public abstract class cPL extends C5087bsD {
    private final Long d;

    protected abstract void c(InterfaceC5157btU interfaceC5157btU);

    protected abstract void e(Status status);

    public cPL(String str, Long l) {
        super(str);
        this.d = l;
    }

    @Override // o.C5087bsD, o.InterfaceC5094bsK
    public final void b(InterfaceC5157btU interfaceC5157btU, Status status) {
        super.b(interfaceC5157btU, status);
        if (status.j() && interfaceC5157btU != null) {
            Logger.INSTANCE.endSession(this.d);
            c(interfaceC5157btU);
            return;
        }
        ExtLogger.INSTANCE.failedAction(this.d, C8169dfM.b(status));
        e(status);
    }
}
