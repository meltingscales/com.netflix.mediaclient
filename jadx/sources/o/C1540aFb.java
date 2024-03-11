package o;

import kotlin.LazyThreadSafetyMode;
import o.AbstractC7773dEv;
import o.C8632dsu;
import o.dED;
import o.dEL;
import o.dpR;
import o.drM;

/* renamed from: o.aFb  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1540aFb {
    private static final InterfaceC8554dpx a;

    static {
        InterfaceC8554dpx b;
        b = dpB.b(LazyThreadSafetyMode.e, new drO<AbstractC7773dEv>() { // from class: com.netflix.mediaclient.hendrixconfig.api.HendrixConfigKt$HendrixJsonParser$2
            @Override // o.drO
            /* renamed from: e */
            public final AbstractC7773dEv invoke() {
                return dEL.e(null, new drM<dED, dpR>() { // from class: com.netflix.mediaclient.hendrixconfig.api.HendrixConfigKt$HendrixJsonParser$2.1
                    public final void a(dED ded) {
                        C8632dsu.c((Object) ded, "");
                        ded.a(true);
                    }

                    @Override // o.drM
                    public /* synthetic */ dpR invoke(dED ded) {
                        a(ded);
                        return dpR.c;
                    }
                }, 1, null);
            }
        });
        a = b;
    }

    public static final AbstractC7773dEv d() {
        return (AbstractC7773dEv) a.getValue();
    }
}
