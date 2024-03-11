package o;

import com.netflix.mediaclient.servicemgr.interface_.LoMoType;
import o.InterfaceC3825bMa;

/* loaded from: classes4.dex */
public final class bSY {
    public static final c a = new c(null);
    private final bLU b;
    private final C4052bUl c;

    public final C4052bUl a() {
        return this.c;
    }

    public final bLU d() {
        return this.b;
    }

    public bSY(bLU blu, C4052bUl c4052bUl) {
        C8632dsu.c((Object) blu, "");
        C8632dsu.c((Object) c4052bUl, "");
        this.b = blu;
        this.c = c4052bUl;
    }

    /* loaded from: classes4.dex */
    public static final class c extends C1045Mp {
        public /* synthetic */ c(C8627dsp c8627dsp) {
            this();
        }

        private c() {
            super("HomeVisibilityTracking");
        }
    }

    public static /* synthetic */ InterfaceC4467bf b(bSY bsy, InterfaceC5223buh interfaceC5223buh, LoMoType loMoType, int i, Object obj) {
        if ((i & 1) != 0) {
            interfaceC5223buh = null;
        }
        if ((i & 2) != 0) {
            loMoType = null;
        }
        return bsy.e(interfaceC5223buh, loMoType);
    }

    public final <T extends AbstractC3073as<V>, V extends AbstractC3179au> InterfaceC4467bf<T, V> e(final InterfaceC5223buh interfaceC5223buh, final LoMoType loMoType) {
        return new InterfaceC4467bf() { // from class: o.bTd
            @Override // o.InterfaceC4467bf
            public final void c(AbstractC3073as abstractC3073as, Object obj, int i) {
                bSY.a(bSY.this, interfaceC5223buh, loMoType, abstractC3073as, (AbstractC3179au) obj, i);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(bSY bsy, InterfaceC5223buh interfaceC5223buh, LoMoType loMoType, AbstractC3073as abstractC3073as, AbstractC3179au abstractC3179au, int i) {
        C8632dsu.c((Object) bsy, "");
        if (abstractC3073as instanceof InterfaceC3829bMe) {
            InterfaceC3825bMa.a n = ((InterfaceC3829bMe) abstractC3073as).n();
            String e = n != null ? n.e() : null;
            if (e != null) {
                bsy.c.d(e);
            }
        }
        if (interfaceC5223buh == null || loMoType == null) {
            return;
        }
        C4052bUl.c(bsy.c, interfaceC5223buh, loMoType, null, 4, null);
    }

    public static /* synthetic */ InterfaceC4732bk a(bSY bsy, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        return bsy.c(z);
    }

    public final <T extends AbstractC3073as<V>, V extends AbstractC3179au> InterfaceC4732bk<T, V> c(final boolean z) {
        return new InterfaceC4732bk() { // from class: o.bTb
            @Override // o.InterfaceC4732bk
            public final void b(AbstractC3073as abstractC3073as, Object obj, int i) {
                bSY.b(z, this, abstractC3073as, (AbstractC3179au) obj, i);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(boolean z, bSY bsy, AbstractC3073as abstractC3073as, AbstractC3179au abstractC3179au, int i) {
        C8632dsu.c((Object) bsy, "");
        if (z) {
            bsy.b.c().b(abstractC3073as, abstractC3179au, i);
        }
    }

    public final void d(boolean z) {
        this.b.e(z);
    }
}
