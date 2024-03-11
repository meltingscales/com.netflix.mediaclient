package o;

import android.content.Context;
import kotlin.coroutines.EmptyCoroutineContext;

/* loaded from: classes.dex */
public final class GH {
    public static final GH b = new GH();
    private static GG c;
    private static final b d;

    private GH() {
    }

    /* loaded from: classes3.dex */
    public static final class b implements GG {
        private final dwU a = new e();

        @Override // o.GG
        public dwU e() {
            return this.a;
        }

        b() {
        }

        /* loaded from: classes3.dex */
        public static final class e implements dwU {
            e() {
            }

            @Override // o.dwU
            public dqZ getCoroutineContext() {
                return EmptyCoroutineContext.e.plus(new dwR("AppScope"));
            }
        }
    }

    static {
        b bVar = new b();
        d = bVar;
        c = bVar;
    }

    public final dwU b(Context context) {
        C8632dsu.c((Object) context, "");
        return c.e();
    }
}
