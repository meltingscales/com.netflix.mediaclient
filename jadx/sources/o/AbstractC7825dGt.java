package o;

/* renamed from: o.dGt  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC7825dGt {
    public static final c d = new c(null);

    public abstract C7822dGq a();

    public abstract void a(dIq diq);

    public boolean c() {
        return false;
    }

    public long d() {
        return -1L;
    }

    public boolean e() {
        return false;
    }

    /* renamed from: o.dGt$c */
    /* loaded from: classes5.dex */
    public static final class c {
        private c() {
        }

        public /* synthetic */ c(C8627dsp c8627dsp) {
            this();
        }

        public static /* synthetic */ AbstractC7825dGt b(c cVar, byte[] bArr, C7822dGq c7822dGq, int i, int i2, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                c7822dGq = null;
            }
            if ((i3 & 2) != 0) {
                i = 0;
            }
            if ((i3 & 4) != 0) {
                i2 = bArr.length;
            }
            return cVar.d(bArr, c7822dGq, i, i2);
        }

        /* renamed from: o.dGt$c$c  reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        public static final class C0121c extends AbstractC7825dGt {
            final /* synthetic */ byte[] a;
            final /* synthetic */ C7822dGq b;
            final /* synthetic */ int c;
            final /* synthetic */ int e;

            @Override // o.AbstractC7825dGt
            public C7822dGq a() {
                return this.b;
            }

            @Override // o.AbstractC7825dGt
            public long d() {
                return this.e;
            }

            C0121c(byte[] bArr, C7822dGq c7822dGq, int i, int i2) {
                this.a = bArr;
                this.b = c7822dGq;
                this.e = i;
                this.c = i2;
            }

            @Override // o.AbstractC7825dGt
            public void a(dIq diq) {
                C8632dsu.d(diq, "");
                diq.e(this.a, this.c, this.e);
            }
        }

        public final AbstractC7825dGt d(byte[] bArr, C7822dGq c7822dGq, int i, int i2) {
            C8632dsu.d(bArr, "");
            dGB.b(bArr.length, i, i2);
            return new C0121c(bArr, c7822dGq, i2, i);
        }
    }
}
