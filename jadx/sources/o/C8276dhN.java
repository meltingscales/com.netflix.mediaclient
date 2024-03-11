package o;

import android.content.Context;
import android.view.accessibility.CaptioningManager;
import com.netflix.cl.Logger;
import com.netflix.cl.model.event.session.accessibility.ClosedCaptionsRequestedSession;

/* renamed from: o.dhN  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8276dhN implements InterfaceC8277dhO {
    private Long d;

    @Override // o.InterfaceC8277dhO
    public void b(Context context) {
        C8632dsu.c((Object) context, "");
        CaptioningManager captioningManager = (CaptioningManager) context.getSystemService("captioning");
        if (captioningManager == null || !captioningManager.isEnabled()) {
            e(context);
        } else if (this.d == null) {
            this.d = Logger.INSTANCE.startSession(new ClosedCaptionsRequestedSession());
        }
    }

    @Override // o.InterfaceC8277dhO
    public void e(Context context) {
        C8632dsu.c((Object) context, "");
        Logger.INSTANCE.endSession(this.d);
        this.d = null;
    }
}
