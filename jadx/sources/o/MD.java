package o;

import android.content.Context;
import dagger.hilt.EntryPoint;
import dagger.hilt.InstallIn;
import dagger.hilt.android.EntryPointAccessors;
import dagger.hilt.components.SingletonComponent;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
/* loaded from: classes3.dex */
public final class MD {
    public static final b a = new b(null);
    private final ME c;
    private final Map<MF, MC> e;

    @EntryPoint
    @InstallIn({SingletonComponent.class})
    /* loaded from: classes3.dex */
    public interface e {
        MD k();
    }

    @Inject
    public MD(ME me) {
        C8632dsu.c((Object) me, "");
        this.c = me;
        this.e = new LinkedHashMap();
    }

    /* loaded from: classes3.dex */
    public static final class b {
        public /* synthetic */ b(C8627dsp c8627dsp) {
            this();
        }

        private b() {
        }

        public final MD a(Context context) {
            C8632dsu.c((Object) context, "");
            return ((e) EntryPointAccessors.fromApplication(context, e.class)).k();
        }
    }

    public final MC b(MF mf) {
        MC mc;
        synchronized (this) {
            C8632dsu.c((Object) mf, "");
            Map<MF, MC> map = this.e;
            MC mc2 = map.get(mf);
            if (mc2 == null) {
                mc2 = this.c.a(mf).b();
                map.put(mf, mc2);
            }
            mc = mc2;
        }
        return mc;
    }
}
