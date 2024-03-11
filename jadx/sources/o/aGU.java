package o;

import com.netflix.mediaclient.libs.process.hooks.FoundationalFrameworkInitOrder;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import javax.inject.Inject;
import javax.inject.Provider;
import javax.inject.Singleton;

@Singleton
/* loaded from: classes3.dex */
public final class aGU implements aGM {
    public static final b d = new b(null);
    private final AtomicReference<Map<FoundationalFrameworkInitOrder, Provider<aGN>>> a;

    @Inject
    public aGU(Map<FoundationalFrameworkInitOrder, Provider<aGN>> map) {
        C8632dsu.c((Object) map, "");
        this.a = new AtomicReference<>(map);
    }

    /* loaded from: classes3.dex */
    public static final class b extends C1045Mp {
        public /* synthetic */ b(C8627dsp c8627dsp) {
            this();
        }

        private b() {
            super("ProcessInitialization");
        }
    }
}
