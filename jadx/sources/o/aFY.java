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
public final class aFY {
    public static final b b = new b(null);
    private final Map<C1567aGb, aFU> a;
    private final aFZ d;

    @EntryPoint
    @InstallIn({SingletonComponent.class})
    /* loaded from: classes3.dex */
    public interface c {
        aFY aw();
    }

    @Inject
    public aFY(aFZ afz) {
        C8632dsu.c((Object) afz, "");
        this.d = afz;
        this.a = new LinkedHashMap();
    }

    /* loaded from: classes3.dex */
    public static final class b {
        public /* synthetic */ b(C8627dsp c8627dsp) {
            this();
        }

        private b() {
        }

        public final aFY e(Context context) {
            C8632dsu.c((Object) context, "");
            return ((c) EntryPointAccessors.fromApplication(context, c.class)).aw();
        }
    }

    public final aFU e(C1567aGb c1567aGb) {
        aFU afu;
        synchronized (this) {
            C8632dsu.c((Object) c1567aGb, "");
            Map<C1567aGb, aFU> map = this.a;
            aFU afu2 = map.get(c1567aGb);
            if (afu2 == null) {
                afu2 = this.d.d(c1567aGb).a();
                map.put(c1567aGb, afu2);
            }
            afu = afu2;
        }
        return afu;
    }
}
