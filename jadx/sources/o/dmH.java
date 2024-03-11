package o;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import com.slack.circuit.runtime.screen.Screen;
import java.util.ArrayList;
import java.util.List;
import o.InterfaceC8496dnt;
import o.InterfaceC8498dnv;
import o.dmM;
import o.dmO;

/* loaded from: classes5.dex */
public final class dmH {
    private final InterfaceC8613dsb<Screen, Modifier, Composer, Integer, dpR> a;
    private final dmC b;
    private final dmO.a c;
    private final List<InterfaceC8496dnt.e> d;
    private final List<InterfaceC8498dnv.d> e;

    public /* synthetic */ dmH(d dVar, C8627dsp c8627dsp) {
        this(dVar);
    }

    public final InterfaceC8613dsb<Screen, Modifier, Composer, Integer, dpR> a() {
        return this.a;
    }

    public final dmC b() {
        return this.b;
    }

    public final dmO.a d() {
        return this.c;
    }

    private dmH(d dVar) {
        List<InterfaceC8498dnv.d> U;
        List<InterfaceC8496dnt.e> U2;
        U = C8576dqs.U(dVar.j());
        this.e = U;
        U2 = C8576dqs.U(dVar.a());
        this.d = U2;
        this.a = dVar.b();
        this.b = dVar.d();
        this.c = dVar.e();
    }

    public final InterfaceC8496dnt<?> e(Screen screen, InterfaceC8499dnw interfaceC8499dnw, C8495dns c8495dns) {
        C8632dsu.c((Object) screen, "");
        C8632dsu.c((Object) interfaceC8499dnw, "");
        C8632dsu.c((Object) c8495dns, "");
        return c(null, screen, interfaceC8499dnw, c8495dns);
    }

    public final InterfaceC8496dnt<?> c(InterfaceC8496dnt.e eVar, Screen screen, InterfaceC8499dnw interfaceC8499dnw, C8495dns c8495dns) {
        int a;
        C8632dsu.c((Object) screen, "");
        C8632dsu.c((Object) interfaceC8499dnw, "");
        C8632dsu.c((Object) c8495dns, "");
        a = C8576dqs.a(this.d, eVar);
        int size = this.d.size();
        for (int i = a + 1; i < size; i++) {
            InterfaceC8496dnt<?> e = this.d.get(i).e(screen, interfaceC8499dnw, c8495dns);
            if (e != null) {
                return e;
            }
        }
        return null;
    }

    public final InterfaceC8498dnv<?> b(Screen screen, C8495dns c8495dns) {
        C8632dsu.c((Object) screen, "");
        C8632dsu.c((Object) c8495dns, "");
        return e((InterfaceC8498dnv.d) null, screen, c8495dns);
    }

    public final InterfaceC8498dnv<?> e(InterfaceC8498dnv.d dVar, Screen screen, C8495dns c8495dns) {
        int a;
        C8632dsu.c((Object) screen, "");
        C8632dsu.c((Object) c8495dns, "");
        a = C8576dqs.a(this.e, dVar);
        int size = this.e.size();
        for (int i = a + 1; i < size; i++) {
            InterfaceC8498dnv<?> a2 = this.e.get(i).a(screen, c8495dns);
            if (a2 != null) {
                return a2;
            }
        }
        return null;
    }

    /* loaded from: classes5.dex */
    public static final class d {
        private InterfaceC8613dsb<? super Screen, ? super Modifier, ? super Composer, ? super Integer, dpR> a;
        private dmC c;
        private dmO.a d;
        private final List<InterfaceC8498dnv.d> b = new ArrayList();
        private final List<InterfaceC8496dnt.e> e = new ArrayList();

        public final List<InterfaceC8496dnt.e> a() {
            return this.e;
        }

        public final InterfaceC8613dsb<Screen, Modifier, Composer, Integer, dpR> b() {
            return this.a;
        }

        public final dmC d() {
            return this.c;
        }

        public final dmO.a e() {
            return this.d;
        }

        public final List<InterfaceC8498dnv.d> j() {
            return this.b;
        }

        public d() {
            InterfaceC8613dsb<? super Screen, ? super Modifier, ? super Composer, ? super Integer, dpR> interfaceC8613dsb;
            interfaceC8613dsb = dmL.b;
            this.a = interfaceC8613dsb;
            this.c = dmM.c.e;
        }

        public final d d(InterfaceC8498dnv.d dVar) {
            C8632dsu.c((Object) dVar, "");
            this.b.add(dVar);
            return this;
        }

        public final d e(InterfaceC8496dnt.e eVar) {
            C8632dsu.c((Object) eVar, "");
            this.e.add(eVar);
            return this;
        }

        public final dmH c() {
            return new dmH(this, null);
        }
    }
}
