package o;

import android.graphics.Bitmap;

/* renamed from: o.bch  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC4342bch {

    /* renamed from: o.bch$e */
    /* loaded from: classes3.dex */
    public interface e {
        void c(long j);
    }

    void a(e eVar);

    boolean b();

    InterfaceC5098bsO c();

    c d(long j);

    /* renamed from: o.bch$c */
    /* loaded from: classes3.dex */
    public static class c {
        private String a;
        private Bitmap c;
        private String d;
        private long e = -1;
        private long b = -1;

        public String a() {
            return this.d;
        }

        public void a(String str) {
            this.a = str;
        }

        public Bitmap b() {
            return this.c;
        }

        public void b(String str) {
            this.d = str;
        }

        public String c() {
            return this.a;
        }

        public long d() {
            return this.e;
        }

        public void d(long j) {
            this.e = j;
        }

        public long e() {
            return this.b;
        }

        public void e(long j) {
            this.b = j;
        }

        public void a(Bitmap bitmap) {
            this.c = bitmap != null ? bitmap.copy(bitmap.getConfig(), bitmap.isMutable()) : null;
        }
    }
}
