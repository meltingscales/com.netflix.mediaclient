package o;

import java.util.concurrent.atomic.AtomicInteger;
import o.C4232bad;
import o.InterfaceC4229baa;

/* loaded from: classes3.dex */
class aZO implements InterfaceC4229baa {
    private final aMF b;

    @Override // o.InterfaceC4229baa
    public void b() {
    }

    public aZO(aMF amf) {
        this.b = amf;
    }

    @Override // o.InterfaceC4229baa
    public void a(C4232bad c4232bad, final InterfaceC4229baa.e eVar) {
        final C4235bag c4235bag = new C4235bag();
        final AtomicInteger atomicInteger = new AtomicInteger(2);
        c4232bad.c(new aHT() { // from class: o.aZN
            @Override // o.aHT
            public final void e(aHI ahi) {
                aZO.c(C4235bag.this, atomicInteger, eVar, ahi);
            }
        });
        c4232bad.e(new C4232bad.d() { // from class: o.aZK
            @Override // o.C4232bad.d
            public final void e(C4232bad.a aVar) {
                aZO.a(C4235bag.this, atomicInteger, eVar, aVar);
            }
        });
        this.b.addDataRequest(c4232bad);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void c(C4235bag c4235bag, AtomicInteger atomicInteger, InterfaceC4229baa.e eVar, aHI ahi) {
        c4235bag.d(ahi);
        if (atomicInteger.decrementAndGet() == 0) {
            eVar.e(c4235bag);
        } else if (c4235bag.e()) {
            eVar.e(c4235bag);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(C4235bag c4235bag, AtomicInteger atomicInteger, InterfaceC4229baa.e eVar, C4232bad.a aVar) {
        c4235bag.c(aVar.a);
        if (atomicInteger.decrementAndGet() == 0) {
            eVar.e(c4235bag);
        }
    }
}
