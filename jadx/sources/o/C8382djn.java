package o;

import com.netflix.msl.client.params.MslBootKey;

/* renamed from: o.djn  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C8382djn {
    private c b;
    private final MslBootKey.KeyType c;
    private c d;
    private final MslBootKey.KeyType e;

    public boolean a() {
        return this.d != null;
    }

    public c b() {
        return this.b;
    }

    public void b(c cVar) {
        this.b = cVar;
    }

    public MslBootKey.KeyType c() {
        return this.e;
    }

    public c d() {
        return this.d;
    }

    public MslBootKey.KeyType e() {
        return this.c;
    }

    public void e(c cVar) {
        this.d = cVar;
    }

    public boolean f() {
        return this.b != null;
    }

    public C8382djn(MslBootKey.KeyType keyType, MslBootKey.KeyType keyType2) {
        this.c = keyType;
        this.e = keyType2;
    }

    /* renamed from: o.djn$c */
    /* loaded from: classes5.dex */
    public static class c {
        private boolean a;
        private final Throwable e;

        public Throwable b() {
            return this.e;
        }

        public boolean c() {
            return this.a;
        }

        public c(Throwable th, boolean z) {
            this.e = th;
            this.a = z;
        }
    }
}
