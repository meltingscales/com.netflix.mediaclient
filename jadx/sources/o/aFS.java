package o;

import kotlinx.serialization.UnknownFieldException;
import o.InterfaceC7736dDl;

@InterfaceC7700dCc
/* loaded from: classes3.dex */
public final class aFS {
    public static final b Companion = new b(null);
    private final long a;
    private final int c;
    private final long e;

    public aFS() {
        this(0L, 0L, 0, 7, (C8627dsp) null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof aFS) {
            aFS afs = (aFS) obj;
            return this.a == afs.a && this.e == afs.e && this.c == afs.c;
        }
        return false;
    }

    public int hashCode() {
        return (((Long.hashCode(this.a) * 31) + Long.hashCode(this.e)) * 31) + Integer.hashCode(this.c);
    }

    public String toString() {
        long j = this.a;
        long j2 = this.e;
        int i = this.c;
        return "StorageClientMetadata(syncTime=" + j + ", appVersionCode=" + j2 + ", sdkVersion=" + i + ")";
    }

    /* loaded from: classes3.dex */
    public static final class b {
        public /* synthetic */ b(C8627dsp c8627dsp) {
            this();
        }

        private b() {
        }
    }

    /* loaded from: classes3.dex */
    public static final class d implements InterfaceC7736dDl<aFS> {
        public static final d b;
        private static final /* synthetic */ dDS c;

        @Override // o.dBT, o.dBZ, o.dBP
        public InterfaceC7707dCj e() {
            return c;
        }

        static {
            d dVar = new d();
            b = dVar;
            dDS dds = new dDS("com.netflix.mediaclient.hendrixconfig.impl.StorageClientMetadata", dVar, 3);
            dds.b("syncTime", true);
            dds.b("appVersionCode", true);
            dds.b("sdkVersion", true);
            c = dds;
        }

        private d() {
        }

        @Override // o.InterfaceC7736dDl
        public dBT<?>[] a() {
            dDF ddf = dDF.a;
            return new dBT[]{ddf, ddf, C7737dDm.a};
        }

        @Override // o.InterfaceC7736dDl
        public dBT<?>[] b() {
            return InterfaceC7736dDl.e.b(this);
        }

        @Override // o.dBP
        /* renamed from: d */
        public aFS b(InterfaceC7720dCw interfaceC7720dCw) {
            int i;
            int i2;
            long j;
            long j2;
            C8632dsu.c((Object) interfaceC7720dCw, "");
            InterfaceC7707dCj e = e();
            InterfaceC7717dCt c2 = interfaceC7720dCw.c(e);
            if (c2.h()) {
                long i3 = c2.i(e, 0);
                long i4 = c2.i(e, 1);
                i = c2.j(e, 2);
                i2 = 7;
                j = i4;
                j2 = i3;
            } else {
                int i5 = 0;
                boolean z = true;
                long j3 = 0;
                long j4 = 0;
                int i6 = 0;
                while (z) {
                    int h = c2.h(e);
                    if (h == -1) {
                        z = false;
                    } else if (h == 0) {
                        j3 = c2.i(e, 0);
                        i6 |= 1;
                    } else if (h == 1) {
                        j4 = c2.i(e, 1);
                        i6 |= 2;
                    } else if (h != 2) {
                        throw new UnknownFieldException(h);
                    } else {
                        i5 = c2.j(e, 2);
                        i6 |= 4;
                    }
                }
                i = i5;
                i2 = i6;
                j = j4;
                j2 = j3;
            }
            c2.e(e);
            return new aFS(i2, j2, j, i, (C7752dEa) null);
        }

        @Override // o.dBZ
        /* renamed from: d */
        public void e(InterfaceC7721dCx interfaceC7721dCx, aFS afs) {
            C8632dsu.c((Object) interfaceC7721dCx, "");
            C8632dsu.c((Object) afs, "");
            InterfaceC7707dCj e = e();
            InterfaceC7719dCv e2 = interfaceC7721dCx.e(e);
            aFS.c(afs, e2, e);
            e2.d(e);
        }
    }

    public /* synthetic */ aFS(int i, long j, long j2, int i2, C7752dEa c7752dEa) {
        if ((i & 1) == 0) {
            this.a = 0L;
        } else {
            this.a = j;
        }
        if ((i & 2) == 0) {
            this.e = 0L;
        } else {
            this.e = j2;
        }
        if ((i & 4) == 0) {
            this.c = 0;
        } else {
            this.c = i2;
        }
    }

    public aFS(long j, long j2, int i) {
        this.a = j;
        this.e = j2;
        this.c = i;
    }

    public static final /* synthetic */ void c(aFS afs, InterfaceC7719dCv interfaceC7719dCv, InterfaceC7707dCj interfaceC7707dCj) {
        if (interfaceC7719dCv.c(interfaceC7707dCj, 0) || afs.a != 0) {
            interfaceC7719dCv.b(interfaceC7707dCj, 0, afs.a);
        }
        if (interfaceC7719dCv.c(interfaceC7707dCj, 1) || afs.e != 0) {
            interfaceC7719dCv.b(interfaceC7707dCj, 1, afs.e);
        }
        if (!interfaceC7719dCv.c(interfaceC7707dCj, 2) && afs.c == 0) {
            return;
        }
        interfaceC7719dCv.c(interfaceC7707dCj, 2, afs.c);
    }

    public /* synthetic */ aFS(long j, long j2, int i, int i2, C8627dsp c8627dsp) {
        this((i2 & 1) != 0 ? 0L : j, (i2 & 2) == 0 ? j2 : 0L, (i2 & 4) != 0 ? 0 : i);
    }
}
