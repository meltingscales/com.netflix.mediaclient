package o;

import com.netflix.mediaclient.service.configuration.ImageResolutionClass;
import com.netflix.mediaclient.ui.repository.ConfigurationRepository$getImageResolutionClass$1;
import com.netflix.mediaclient.ui.repository.ConfigurationRepository$refreshCustomerConfigData$1;
import com.netflix.mediaclient.ui.repository.ConfigurationRepository$refreshCustomerConfigData$2;
import io.reactivex.Single;
import io.reactivex.SingleSource;
import io.reactivex.functions.Function;
import io.reactivex.functions.Function3;
import kotlin.Triple;
import o.C8632dsu;
import o.InterfaceC5093bsJ;
import o.aOV;

/* loaded from: classes4.dex */
public final class cQF extends AbstractC5999cQf<aOV> {
    public static final b a = new b(null);

    /* loaded from: classes4.dex */
    public static final class b extends C1045Mp {
        public /* synthetic */ b(C8627dsp c8627dsp) {
            this();
        }

        private b() {
            super("ConfigurationRepository");
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC5999cQf
    /* renamed from: b */
    public aOV a() {
        C1332Xp c1332Xp = C1332Xp.b;
        return (aOV) C1332Xp.b(aOV.class);
    }

    public final boolean d() {
        aOV e = e();
        return e != null && e.as();
    }

    private final aOV e() {
        if (AbstractApplicationC1040Mh.getInstance().i().r()) {
            return a();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ImageResolutionClass e(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        C8632dsu.c(obj, "");
        return (ImageResolutionClass) drm.invoke(obj);
    }

    public final Single<ImageResolutionClass> c() {
        Single<aOV> h = h();
        final ConfigurationRepository$getImageResolutionClass$1 configurationRepository$getImageResolutionClass$1 = new drM<aOV, ImageResolutionClass>() { // from class: com.netflix.mediaclient.ui.repository.ConfigurationRepository$getImageResolutionClass$1
            @Override // o.drM
            /* renamed from: b */
            public final ImageResolutionClass invoke(aOV aov) {
                C8632dsu.c((Object) aov, "");
                return aov.C();
            }
        };
        Single map = h.map(new Function() { // from class: o.cQE
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                ImageResolutionClass e;
                e = cQF.e(drM.this, obj);
                return e;
            }
        });
        C8632dsu.a(map, "");
        return map;
    }

    public static /* synthetic */ Single b(cQF cqf, cQQ cqq, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return cqf.a(cqq, z);
    }

    public final Single<Boolean> a(cQQ cqq, boolean z) {
        C8632dsu.c((Object) cqq, "");
        Single<Boolean> firstOrError = cqq.i().firstOrError();
        Single<InterfaceC5093bsJ> c = cqq.c();
        Single<aOV> h = h();
        final ConfigurationRepository$refreshCustomerConfigData$1 configurationRepository$refreshCustomerConfigData$1 = new InterfaceC8612dsa<Boolean, InterfaceC5093bsJ, aOV, Triple<? extends Boolean, ? extends InterfaceC5093bsJ, ? extends aOV>>() { // from class: com.netflix.mediaclient.ui.repository.ConfigurationRepository$refreshCustomerConfigData$1
            @Override // o.InterfaceC8612dsa
            /* renamed from: b */
            public final Triple<Boolean, InterfaceC5093bsJ, aOV> invoke(Boolean bool, InterfaceC5093bsJ interfaceC5093bsJ, aOV aov) {
                C8632dsu.c((Object) bool, "");
                C8632dsu.c((Object) interfaceC5093bsJ, "");
                C8632dsu.c((Object) aov, "");
                return new Triple<>(bool, interfaceC5093bsJ, aov);
            }
        };
        Single zip = Single.zip(firstOrError, c, h, new Function3() { // from class: o.cQH
            @Override // io.reactivex.functions.Function3
            public final Object apply(Object obj, Object obj2, Object obj3) {
                Triple e;
                e = cQF.e(InterfaceC8612dsa.this, obj, obj2, obj3);
                return e;
            }
        });
        final ConfigurationRepository$refreshCustomerConfigData$2 configurationRepository$refreshCustomerConfigData$2 = new ConfigurationRepository$refreshCustomerConfigData$2(z);
        Single<Boolean> flatMap = zip.flatMap(new Function() { // from class: o.cQI
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                SingleSource a2;
                a2 = cQF.a(drM.this, obj);
                return a2;
            }
        });
        C8632dsu.a(flatMap, "");
        return flatMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Triple e(InterfaceC8612dsa interfaceC8612dsa, Object obj, Object obj2, Object obj3) {
        C8632dsu.c((Object) interfaceC8612dsa, "");
        C8632dsu.c(obj, "");
        C8632dsu.c(obj2, "");
        C8632dsu.c(obj3, "");
        return (Triple) interfaceC8612dsa.invoke(obj, obj2, obj3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SingleSource a(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        C8632dsu.c(obj, "");
        return (SingleSource) drm.invoke(obj);
    }
}
