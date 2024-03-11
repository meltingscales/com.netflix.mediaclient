package o;

import java.lang.ref.WeakReference;
import o.InterfaceC5297bwB;

/* renamed from: o.czg  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C7622czg implements InterfaceC5297bwB.a {
    public static final d e = new d(null);
    private final WeakReference<InterfaceC7451cwU> b;
    private InterfaceC5198buI d;

    @Override // o.InterfaceC5297bwB.a
    public void b(InterfaceC5198buI interfaceC5198buI) {
        this.d = interfaceC5198buI;
    }

    public C7622czg(InterfaceC7451cwU interfaceC7451cwU) {
        C8632dsu.c((Object) interfaceC7451cwU, "");
        this.b = new WeakReference<>(interfaceC7451cwU);
    }

    /* renamed from: o.czg$d */
    /* loaded from: classes4.dex */
    public static final class d extends C1045Mp {
        public /* synthetic */ d(C8627dsp c8627dsp) {
            this();
        }

        private d() {
            super("PlayerSessionImpl");
        }
    }
}
