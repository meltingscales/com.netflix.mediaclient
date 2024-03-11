package o;

import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;

/* renamed from: o.bIl  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3728bIl implements InterfaceC3659bGa {
    public static final e c = new e(null);
    private final int a;
    private final List<dxD> b;
    private final dwU e;

    public C3728bIl(dwQ dwq, int i) {
        C8632dsu.c((Object) dwq, "");
        this.a = i;
        this.b = new ArrayList();
        this.e = dwY.c(dwq);
    }

    /* renamed from: o.bIl$e */
    /* loaded from: classes4.dex */
    public static final class e extends C1045Mp {
        public /* synthetic */ e(C8627dsp c8627dsp) {
            this();
        }

        private e() {
            super("Prefetch Job queue");
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @Inject
    public C3728bIl(dwQ dwq) {
        this(dwq, 5);
        C8632dsu.c((Object) dwq, "");
    }
}
