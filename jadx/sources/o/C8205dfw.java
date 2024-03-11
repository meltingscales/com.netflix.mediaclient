package o;

import android.content.Context;
import android.content.pm.PackageManager;
import dagger.hilt.EntryPoint;
import dagger.hilt.InstallIn;
import dagger.hilt.android.EntryPointAccessors;
import dagger.hilt.android.qualifiers.ApplicationContext;
import dagger.hilt.components.SingletonComponent;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
/* renamed from: o.dfw  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C8205dfw {
    public static final d e = new d(null);
    private final Map<String, Boolean> a;
    private final Context c;

    @EntryPoint
    @InstallIn({SingletonComponent.class})
    /* renamed from: o.dfw$a */
    /* loaded from: classes5.dex */
    public interface a {
        C8205dfw aq();
    }

    @Inject
    public C8205dfw(@ApplicationContext Context context) {
        C8632dsu.c((Object) context, "");
        this.c = context;
        this.a = new LinkedHashMap();
    }

    /* renamed from: o.dfw$d */
    /* loaded from: classes5.dex */
    public static final class d {
        public /* synthetic */ d(C8627dsp c8627dsp) {
            this();
        }

        private d() {
        }

        public final C8205dfw c(Context context) {
            C8632dsu.c((Object) context, "");
            return ((a) EntryPointAccessors.fromApplication(context, a.class)).aq();
        }
    }

    public final boolean e(String str) {
        C8632dsu.c((Object) str, "");
        if (this.a.containsKey(str)) {
            Boolean bool = this.a.get(str);
            if (bool != null) {
                return bool.booleanValue();
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        try {
            this.c.getPackageManager().getPackageInfo(str, 1);
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }
}
