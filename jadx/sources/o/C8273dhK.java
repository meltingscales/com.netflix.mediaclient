package o;

import android.content.Context;
import com.netflix.cl.Logger;

/* renamed from: o.dhK  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8273dhK implements InterfaceC8277dhO {
    private int a;
    private Long c;

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000b, code lost:
        r3 = r3.getResources().getConfiguration().fontWeightAdjustment;
     */
    @Override // o.InterfaceC8277dhO
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void b(android.content.Context r3) {
        /*
            r2 = this;
            java.lang.String r0 = ""
            o.C8632dsu.c(r3, r0)
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 31
            if (r0 < r1) goto L36
            android.content.res.Resources r3 = r3.getResources()
            android.content.res.Configuration r3 = r3.getConfiguration()
            int r3 = androidx.compose.ui.platform.AndroidComposeView$$ExternalSyntheticApiModelOutline0.m(r3)
            int r0 = r2.a
            if (r0 == r3) goto L36
            r2.a = r3
            com.netflix.cl.Logger r3 = com.netflix.cl.Logger.INSTANCE
            java.lang.Long r0 = r2.c
            r3.endSession(r0)
            int r0 = r2.a
            r1 = 1
            if (r0 <= r1) goto L33
            com.netflix.cl.model.event.session.accessibility.BoldTextSession r0 = new com.netflix.cl.model.event.session.accessibility.BoldTextSession
            r0.<init>()
            java.lang.Long r3 = r3.startSession(r0)
            goto L34
        L33:
            r3 = 0
        L34:
            r2.c = r3
        L36:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C8273dhK.b(android.content.Context):void");
    }

    @Override // o.InterfaceC8277dhO
    public void e(Context context) {
        C8632dsu.c((Object) context, "");
        Logger.INSTANCE.endSession(this.c);
        this.c = null;
    }
}
