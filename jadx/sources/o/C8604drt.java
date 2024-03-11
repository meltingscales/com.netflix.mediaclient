package o;

import java.util.List;

/* renamed from: o.drt  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C8604drt extends C8599dro {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o.drt$b */
    /* loaded from: classes5.dex */
    public static final class b {
        public static final Integer c;
        public static final b e = new b();

        private b() {
        }

        static {
            Integer num;
            Object obj;
            Integer num2 = null;
            try {
                obj = Class.forName("android.os.Build$VERSION").getField("SDK_INT").get(null);
            } catch (Throwable unused) {
            }
            if (obj instanceof Integer) {
                num = (Integer) obj;
                if (num != null && num.intValue() > 0) {
                    num2 = num;
                }
                c = num2;
            }
            num = null;
            if (num != null) {
                num2 = num;
            }
            c = num2;
        }
    }

    private final boolean d(int i) {
        Integer num = b.c;
        return num == null || num.intValue() >= i;
    }

    @Override // o.C8599dro
    public void c(Throwable th, Throwable th2) {
        C8632dsu.c((Object) th, "");
        C8632dsu.c((Object) th2, "");
        if (d(19)) {
            th.addSuppressed(th2);
        } else {
            super.c(th, th2);
        }
    }

    @Override // o.C8599dro
    public List<Throwable> e(Throwable th) {
        List<Throwable> p;
        C8632dsu.c((Object) th, "");
        if (d(19)) {
            Throwable[] suppressed = th.getSuppressed();
            C8632dsu.a(suppressed, "");
            p = C8564dqg.p(suppressed);
            return p;
        }
        return super.e(th);
    }
}
