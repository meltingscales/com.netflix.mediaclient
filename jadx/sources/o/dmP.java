package o;

import com.slack.circuit.runtime.screen.Screen;
import java.util.List;
import o.C8632dsu;
import o.InterfaceC8466dmq;

/* loaded from: classes5.dex */
public final class dmP implements InterfaceC8499dnw {
    private final drO<dpR> b;
    private final InterfaceC8466dmq<? extends InterfaceC8466dmq.a> d;

    public dmP(InterfaceC8466dmq<? extends InterfaceC8466dmq.a> interfaceC8466dmq, drO<dpR> dro) {
        C8632dsu.c((Object) interfaceC8466dmq, "");
        C8632dsu.c((Object) dro, "");
        this.d = interfaceC8466dmq;
        this.b = dro;
        if (!(!C8469dmt.d(interfaceC8466dmq))) {
            throw new IllegalStateException("Backstack size must not be empty.".toString());
        }
    }

    @Override // o.InterfaceC8499dnw
    public Screen e() {
        if (C8469dmt.e(this.d)) {
            this.b.invoke();
            return null;
        }
        InterfaceC8466dmq.a d = this.d.d();
        if (d != null) {
            return d.c();
        }
        return null;
    }

    @Override // o.InterfaceC8499dnw
    public List<Screen> c(Screen screen) {
        final List e;
        List<Screen> o2;
        C8632dsu.c((Object) screen, "");
        e = C8566dqi.e(this.d.c());
        this.d.a(new drM<InterfaceC8466dmq.a, Boolean>() { // from class: com.slack.circuit.foundation.NavigatorImpl$resetRoot$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.drM
            /* renamed from: e */
            public final Boolean invoke(InterfaceC8466dmq.a aVar) {
                C8632dsu.c((Object) aVar, "");
                e.add(aVar.c());
                return Boolean.FALSE;
            }
        });
        this.d.a(screen);
        o2 = C8566dqi.o(e);
        return o2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || dmP.class != obj.getClass()) {
            return false;
        }
        dmP dmp = (dmP) obj;
        return C8632dsu.c(this.d, dmp.d) && C8632dsu.c(this.b, dmp.b);
    }

    public int hashCode() {
        return (this.d.hashCode() * 31) + this.b.hashCode();
    }

    public String toString() {
        InterfaceC8466dmq<? extends InterfaceC8466dmq.a> interfaceC8466dmq = this.d;
        drO<dpR> dro = this.b;
        return "NavigatorImpl(backstack=" + interfaceC8466dmq + ", onRootPop=" + dro + ")";
    }
}
