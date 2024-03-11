package o;

import com.netflix.mediaclient.commanderinfra.api.util.TargetDeviceUiState;
import com.netflix.mediaclient.ui.commander.impl.presenter.ControllerScreen;
import kotlin.NoWhenBranchMatchedException;
import o.bBM;

/* renamed from: o.bDs  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3596bDs {
    public static final TargetDeviceUiState a(ControllerScreen.c cVar) {
        C8632dsu.c((Object) cVar, "");
        if (!(cVar instanceof ControllerScreen.c.d) && !(cVar instanceof ControllerScreen.c.C0057c)) {
            if (cVar instanceof ControllerScreen.c.e) {
                return ((ControllerScreen.c.e) cVar).c().a();
            }
            throw new NoWhenBranchMatchedException();
        }
        return TargetDeviceUiState.c;
    }

    public static final int c(ControllerScreen.c cVar) {
        C8632dsu.c((Object) cVar, "");
        if (!(cVar instanceof ControllerScreen.c.d) && !(cVar instanceof ControllerScreen.c.C0057c)) {
            if (cVar instanceof ControllerScreen.c.e) {
                return bBM.c.ar;
            }
            throw new NoWhenBranchMatchedException();
        }
        return bBM.c.as;
    }

    public static final String b(ControllerScreen.c cVar) {
        C8632dsu.c((Object) cVar, "");
        if ((cVar instanceof ControllerScreen.c.d) || (cVar instanceof ControllerScreen.c.C0057c)) {
            return "";
        }
        if (cVar instanceof ControllerScreen.c.e) {
            String b = ((ControllerScreen.c.e) cVar).c().e().b();
            return b == null ? "" : b;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002b A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x002d A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean d(com.netflix.mediaclient.ui.commander.impl.presenter.ControllerScreen.c r1) {
        /*
            java.lang.String r0 = ""
            o.C8632dsu.c(r1, r0)
            boolean r0 = r1 instanceof com.netflix.mediaclient.ui.commander.impl.presenter.ControllerScreen.c.d
            if (r0 == 0) goto L12
            com.netflix.mediaclient.commanderinfra.api.util.ConnectionState r1 = r1.a()
            com.netflix.mediaclient.commanderinfra.api.util.ConnectionState r0 = com.netflix.mediaclient.commanderinfra.api.util.ConnectionState.a
            if (r1 != r0) goto L2d
            goto L2b
        L12:
            boolean r0 = r1 instanceof com.netflix.mediaclient.ui.commander.impl.presenter.ControllerScreen.c.C0057c
            if (r0 == 0) goto L1f
            com.netflix.mediaclient.commanderinfra.api.util.ConnectionState r1 = r1.a()
            com.netflix.mediaclient.commanderinfra.api.util.ConnectionState r0 = com.netflix.mediaclient.commanderinfra.api.util.ConnectionState.a
            if (r1 != r0) goto L2d
            goto L2b
        L1f:
            boolean r0 = r1 instanceof com.netflix.mediaclient.ui.commander.impl.presenter.ControllerScreen.c.e
            if (r0 == 0) goto L2f
            com.netflix.mediaclient.commanderinfra.api.util.ConnectionState r1 = r1.a()
            com.netflix.mediaclient.commanderinfra.api.util.ConnectionState r0 = com.netflix.mediaclient.commanderinfra.api.util.ConnectionState.a
            if (r1 != r0) goto L2d
        L2b:
            r1 = 1
            goto L2e
        L2d:
            r1 = 0
        L2e:
            return r1
        L2f:
            kotlin.NoWhenBranchMatchedException r1 = new kotlin.NoWhenBranchMatchedException
            r1.<init>()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C3596bDs.d(com.netflix.mediaclient.ui.commander.impl.presenter.ControllerScreen$c):boolean");
    }

    public static final VX e(ControllerScreen.c cVar) {
        C8632dsu.c((Object) cVar, "");
        if ((cVar instanceof ControllerScreen.c.d) || (cVar instanceof ControllerScreen.c.C0057c)) {
            return null;
        }
        if (cVar instanceof ControllerScreen.c.e) {
            return ((ControllerScreen.c.e) cVar).c();
        }
        throw new NoWhenBranchMatchedException();
    }
}
