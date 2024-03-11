package o;

import android.content.Context;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import java.lang.reflect.Constructor;

/* renamed from: o.bhm  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C4612bhm {
    private final Context a;
    private Object b$7487fc26;
    private final Gson d;

    public Object d$42498405() {
        if (this.b$7487fc26 == null) {
            e();
        }
        return this.b$7487fc26;
    }

    public C4612bhm(Gson gson, Context context) {
        this.d = gson;
        this.a = context;
    }

    public void e() {
        String e = C8157dfA.e(this.a, "ase_persistent_data", (String) null);
        C1044Mm.c("AsePlatformContext", "restore ASE persisted data %s .", e);
        if (C8168dfL.h(e)) {
            try {
                Object fromJson = this.d.fromJson(e, (Class<Object>) C4755bkv.b((char) 63174, 5, 812));
                if (fromJson != null) {
                    this.b$7487fc26 = fromJson;
                    return;
                }
            } catch (JsonSyntaxException e2) {
                C1044Mm.j("AsePlatformContext", "has JsonSyntaxException %s .", e2);
            }
        }
        try {
            Object obj = C4755bkv.q.get(1528428624);
            if (obj == null) {
                obj = ((Class) C4755bkv.b((char) 63174, 5, 812)).getDeclaredConstructor(null);
                C4755bkv.q.put(1528428624, obj);
            }
            this.b$7487fc26 = ((Constructor) obj).newInstance(null);
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    public void b() {
        Object obj = this.b$7487fc26;
        if (obj != null) {
            synchronized (obj) {
                String json = this.d.toJson(this.b$7487fc26);
                C8157dfA.a(this.a, "ase_persistent_data", json);
                C1044Mm.c("AsePlatformContext", "save ASE persisted data %s .", json);
            }
        }
    }
}
