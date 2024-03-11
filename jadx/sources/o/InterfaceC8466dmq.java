package o;

import com.slack.circuit.runtime.screen.Screen;
import o.InterfaceC8466dmq.a;

/* renamed from: o.dmq  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public interface InterfaceC8466dmq<R extends a> extends Iterable<R>, dsK {

    /* renamed from: o.dmq$a */
    /* loaded from: classes5.dex */
    public interface a {
        Screen c();

        String d();
    }

    R a();

    void a(Screen screen);

    int c();

    R d();

    default void a(drM<? super R, Boolean> drm) {
        C8632dsu.c((Object) drm, "");
        while (true) {
            R a2 = a();
            if (a2 == null || drm.invoke(a2).booleanValue()) {
                return;
            }
            d();
        }
    }
}
