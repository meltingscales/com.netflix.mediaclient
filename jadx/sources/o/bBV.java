package o;

import com.netflix.mediaclient.ui.commander.impl.presenter.ControllerScreen;

/* loaded from: classes4.dex */
public final class bBV {
    public static final bBV d = new bBV();

    private bBV() {
    }

    public final void a(ControllerScreen.e eVar, InterfaceC1284Vt interfaceC1284Vt) {
        C8632dsu.c((Object) eVar, "");
        C8632dsu.c((Object) interfaceC1284Vt, "");
        if (eVar instanceof ControllerScreen.e.C0716c) {
            ControllerScreen.e.C0716c c0716c = (ControllerScreen.e.C0716c) eVar;
            interfaceC1284Vt.b(c0716c.e(), c0716c.a(), c0716c.c());
        } else if (C8632dsu.c(eVar, ControllerScreen.e.C0717d.b)) {
            interfaceC1284Vt.e();
        } else if (C8632dsu.c(eVar, ControllerScreen.e.o.c)) {
            interfaceC1284Vt.f();
        } else if (C8632dsu.c(eVar, ControllerScreen.e.i.d)) {
            interfaceC1284Vt.d();
        }
    }
}
