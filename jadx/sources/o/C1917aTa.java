package o;

import com.netflix.mediaclient.service.user.UserAgent;

/* renamed from: o.aTa  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1917aTa implements InterfaceC1921aTe {
    private final C1052Mw d;

    public C1917aTa(C1052Mw c1052Mw) {
        C8632dsu.c((Object) c1052Mw, "");
        this.d = c1052Mw;
    }

    public UserAgent e() {
        UserAgent k = this.d.k();
        if (k != null) {
            return k;
        }
        throw new IllegalStateException();
    }
}
