package o;

import java.util.ArrayList;
import java.util.List;

/* renamed from: o.xw  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C9862xw {
    public static void a(String str, Object... objArr) {
    }

    public static void d(String str, Object... objArr) {
    }

    public static void d(Throwable th, String str, Object... objArr) {
    }

    public static void e(String str, Object... objArr) {
    }

    /* renamed from: o.xw$d */
    /* loaded from: classes2.dex */
    public static class d {
        private final List<c> e = new ArrayList();
        private boolean d = false;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: o.xw$d$c */
        /* loaded from: classes2.dex */
        public static class c {
            public final long d;
        }

        d() {
        }

        public void e(String str) {
            synchronized (this) {
                this.d = true;
                long b = b();
                if (b <= 0) {
                    return;
                }
                long j = this.e.get(0).d;
                C9862xw.e("(%-4d ms) %s", Long.valueOf(b), str);
            }
        }

        protected void finalize() {
            if (this.d) {
                return;
            }
            e("Request on the loose");
            C9862xw.a("Marker log finalized without finish() - uncaught exit point for request", new Object[0]);
        }

        private long b() {
            if (this.e.size() == 0) {
                return 0L;
            }
            long j = this.e.get(0).d;
            List<c> list = this.e;
            return list.get(list.size() - 1).d - j;
        }
    }
}
