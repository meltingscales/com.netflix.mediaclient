package o;

import java.io.Closeable;
import java.nio.charset.Charset;
import o.C7822dGq;

/* renamed from: o.dGx */
/* loaded from: classes5.dex */
public abstract class AbstractC7829dGx implements Closeable {
    public static final c b = new c(null);

    public abstract long c();

    public abstract InterfaceC7871dIn e();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        dGB.e(e());
    }

    /* renamed from: o.dGx$c */
    /* loaded from: classes5.dex */
    public static final class c {
        private c() {
        }

        public /* synthetic */ c(C8627dsp c8627dsp) {
            this();
        }

        public static /* synthetic */ AbstractC7829dGx c(c cVar, String str, C7822dGq c7822dGq, int i, Object obj) {
            if ((i & 1) != 0) {
                c7822dGq = null;
            }
            return cVar.d(str, c7822dGq);
        }

        public final AbstractC7829dGx d(String str, C7822dGq c7822dGq) {
            C8632dsu.d((Object) str, "");
            Charset charset = C8674dui.i;
            if (c7822dGq != null) {
                Charset c = C7822dGq.c(c7822dGq, null, 1, null);
                if (c == null) {
                    C7822dGq.c cVar = C7822dGq.b;
                    c7822dGq = cVar.e(c7822dGq + "; charset=utf-8");
                } else {
                    charset = c;
                }
            }
            C7872dIo b2 = new C7872dIo().b(str, charset);
            return e(b2, c7822dGq, b2.D());
        }

        public static /* synthetic */ AbstractC7829dGx b(c cVar, byte[] bArr, C7822dGq c7822dGq, int i, Object obj) {
            if ((i & 1) != 0) {
                c7822dGq = null;
            }
            return cVar.b(bArr, c7822dGq);
        }

        public final AbstractC7829dGx b(byte[] bArr, C7822dGq c7822dGq) {
            C8632dsu.d(bArr, "");
            return e(new C7872dIo().d(bArr), c7822dGq, bArr.length);
        }

        /* renamed from: o.dGx$c$b */
        /* loaded from: classes5.dex */
        public static final class b extends AbstractC7829dGx {
            final /* synthetic */ long a;
            final /* synthetic */ InterfaceC7871dIn d;
            final /* synthetic */ C7822dGq e;

            @Override // o.AbstractC7829dGx
            public long c() {
                return this.a;
            }

            @Override // o.AbstractC7829dGx
            public InterfaceC7871dIn e() {
                return this.d;
            }

            b(InterfaceC7871dIn interfaceC7871dIn, C7822dGq c7822dGq, long j) {
                this.d = interfaceC7871dIn;
                this.e = c7822dGq;
                this.a = j;
            }
        }

        public final AbstractC7829dGx e(InterfaceC7871dIn interfaceC7871dIn, C7822dGq c7822dGq, long j) {
            C8632dsu.d(interfaceC7871dIn, "");
            return new b(interfaceC7871dIn, c7822dGq, j);
        }
    }
}
