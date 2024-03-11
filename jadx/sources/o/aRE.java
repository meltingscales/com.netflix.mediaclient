package o;

import android.content.Context;
import com.netflix.mediaclient.service.webclient.model.leafs.ABTestConfig;
import dagger.hilt.EntryPoint;
import dagger.hilt.InstallIn;
import dagger.hilt.android.EntryPointAccessors;
import dagger.hilt.components.SingletonComponent;
import java.util.Map;
import o.aRE;

/* loaded from: classes.dex */
public final class aRE extends aRM {
    public static final c b = new c(null);
    private static final Map<Integer, e> c;
    private static final e e;
    private final String d = "[Android] Use GraphQL cache with manual chaining";
    private final String i = "58505";
    private final int a = c.size();

    @EntryPoint
    @InstallIn({SingletonComponent.class})
    /* loaded from: classes3.dex */
    public interface a {
        boolean T();
    }

    @Override // o.aRM
    public String d() {
        return this.i;
    }

    @Override // o.aRM
    /* renamed from: h */
    public String a() {
        return this.d;
    }

    /* loaded from: classes3.dex */
    public static final class e {
        private final String b;
        private final boolean e;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof e) {
                e eVar = (e) obj;
                return C8632dsu.c((Object) this.b, (Object) eVar.b) && this.e == eVar.e;
            }
            return false;
        }

        public int hashCode() {
            return (this.b.hashCode() * 31) + Boolean.hashCode(this.e);
        }

        public String toString() {
            String str = this.b;
            boolean z = this.e;
            return "Features(friendlyName=" + str + ", useNewCache=" + z + ")";
        }

        public e(String str, boolean z) {
            C8632dsu.c((Object) str, "");
            this.b = str;
            this.e = z;
        }
    }

    /* loaded from: classes3.dex */
    public static final class c {
        public /* synthetic */ c(C8627dsp c8627dsp) {
            this();
        }

        private c() {
        }

        public final e a() {
            return aRE.e;
        }

        private final ABTestConfig.Cell c() {
            return C1818aPj.e(aRE.class);
        }

        public final boolean d() {
            if (b()) {
                if (c() == ABTestConfig.Cell.CELL_1) {
                    return false;
                }
            } else if (!C1884aRv.c.d().d()) {
                C1332Xp c1332Xp = C1332Xp.b;
                return ((a) EntryPointAccessors.fromApplication((Context) C1332Xp.b(Context.class), a.class)).T();
            }
            return true;
        }

        public final boolean b() {
            C1332Xp c1332Xp = C1332Xp.b;
            ABTestConfig.Cell c = c();
            C8632dsu.a(c, "");
            return ((aRE) C1818aPj.a(aRE.class)).d((Context) C1332Xp.b(Context.class), c);
        }
    }

    static {
        Map c2;
        Map<Integer, e> b2;
        e eVar = new e("Control", false);
        e = eVar;
        c2 = dqE.c(dpD.a(1, eVar), dpD.a(2, new e("Use cache with manual chaining", true)));
        b2 = dqC.b(c2, (drM) new drM<Integer, e>() { // from class: com.netflix.mediaclient.service.configuration.persistent.ab.Config_Ab58505_GraphQL_Cache_Manual_Chaining$Companion$features$1
            public final aRE.e d(int i) {
                return aRE.b.a();
            }

            @Override // o.drM
            public /* synthetic */ aRE.e invoke(Integer num) {
                return d(num.intValue());
            }
        });
        c = b2;
    }
}
