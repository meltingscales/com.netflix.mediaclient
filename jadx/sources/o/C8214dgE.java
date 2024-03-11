package o;

import com.netflix.mediaclient.service.configuration.persistent.fastproperty.Config_FastProperty_QoE_Metrics;
import java.util.Random;
import javax.inject.Inject;

/* renamed from: o.dgE  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C8214dgE implements InterfaceC8215dgF {
    private static final c e = new c(null);
    private final Random a;
    private final InterfaceC1659aJm b;

    @Inject
    public C8214dgE(InterfaceC1270Vf interfaceC1270Vf, InterfaceC1659aJm interfaceC1659aJm) {
        C8632dsu.c((Object) interfaceC1270Vf, "");
        C8632dsu.c((Object) interfaceC1659aJm, "");
        this.b = interfaceC1659aJm;
        this.a = new Random(interfaceC1270Vf.d());
    }

    @Override // o.InterfaceC8215dgF
    public boolean c() {
        if (this.b.a()) {
            return true;
        }
        return this.a.nextInt(100) < Config_FastProperty_QoE_Metrics.Companion.b();
    }

    /* renamed from: o.dgE$c */
    /* loaded from: classes5.dex */
    static final class c {
        public /* synthetic */ c(C8627dsp c8627dsp) {
            this();
        }

        private c() {
        }
    }
}
