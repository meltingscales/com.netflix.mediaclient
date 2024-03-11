package o;

import android.content.Context;
import android.os.Handler;
import java.util.concurrent.TimeUnit;

/* renamed from: o.dfS  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C8175dfS {
    public static int c(int i) {
        return (int) ((i / 60.0f) + 0.5f);
    }

    public static boolean b(int i, long j) {
        return d(i * 86400000, j);
    }

    public static boolean e(long j) {
        return d(86400000L, j);
    }

    public static boolean d(long j, long j2) {
        return System.currentTimeMillis() >= j2 + j;
    }

    public static long b(long j, int i, int i2) {
        if (i <= 0 || j < TimeUnit.SECONDS.toMillis(i)) {
            if ((i2 <= 0 || j < TimeUnit.SECONDS.toMillis(i2 - 8)) && j >= 0) {
                return j;
            }
            return 0L;
        }
        return 0L;
    }

    /* renamed from: o.dfS$d */
    /* loaded from: classes5.dex */
    public static class d {
        private Runnable a;
        private Runnable b;
        private final Runnable c = new Runnable() { // from class: o.dfS.d.2
            @Override // java.lang.Runnable
            public void run() {
                if (d.this.f) {
                    d dVar = d.this;
                    dVar.e--;
                    if (d.this.b != null) {
                        d.this.b.run();
                    }
                    if (d.this.e > 0) {
                        d.this.d.postDelayed(this, 1000L);
                        return;
                    }
                    if (d.this.a != null) {
                        d.this.a.run();
                    }
                    d.this.e();
                }
            }
        };
        private Handler d;
        private int e;
        private boolean f;

        public int a() {
            return this.e;
        }

        public void b(Runnable runnable) {
            this.a = runnable;
        }

        public void c(Runnable runnable) {
            this.b = runnable;
        }

        public void d(int i) {
            this.e = i;
        }

        public void e() {
            this.f = false;
        }

        public d(Context context) {
            this.d = new Handler(context.getMainLooper());
        }

        public void d() {
            if (this.f || this.e <= 0) {
                return;
            }
            this.f = true;
            this.d.postDelayed(this.c, 1000L);
        }
    }
}
