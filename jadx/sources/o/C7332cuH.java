package o;

import com.netflix.mediaclient.browse.api.task.TaskMode;

/* renamed from: o.cuH  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C7332cuH {
    public final void c(String str, InterfaceC1757aNc interfaceC1757aNc) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) interfaceC1757aNc, "");
        InterfaceC1912aSw f = new C6004cQk().f();
        if (f == null) {
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        f.c(str, null, false, TaskMode.FROM_NETWORK, interfaceC1757aNc, "SmartDownloadsRepo");
    }
}
