package com.netflix.clcs.client;

import java.util.Map;
import o.C0723Af;
import o.C8627dsp;
import o.C8632dsu;
import o.FE;
import o.FM;
import o.FX;
import o.InterfaceC0721Ad;
import o.InterfaceC8585dra;
import o.dpR;

/* loaded from: classes2.dex */
public interface InterstitialClient {
    public static final c d = c.e;

    Object a(String str, String str2, Map<String, ? extends Object> map, InterfaceC8585dra<? super dpR> interfaceC8585dra);

    Object b(FM fm, InterfaceC8585dra<? super FX> interfaceC8585dra);

    Object c(String str, String str2, Map<String, ? extends Object> map, InterfaceC8585dra<? super FX> interfaceC8585dra);

    Object c(String str, Map<String, ? extends Object> map, InterfaceC8585dra<? super FX> interfaceC8585dra);

    Object c(String str, InterfaceC8585dra<? super FX> interfaceC8585dra);

    Object d(String str, String str2, Map<String, ? extends Object> map, InterfaceC8585dra<? super e> interfaceC8585dra);

    Object d(String str, FM fm, InterfaceC8585dra<? super FX> interfaceC8585dra);

    Object e(String str, InterfaceC8585dra<? super FX> interfaceC8585dra);

    /* loaded from: classes2.dex */
    public static final class ServerException extends Exception {
        public ServerException(String str) {
            super(str);
        }
    }

    /* loaded from: classes2.dex */
    public static abstract class e {
        public /* synthetic */ e(C8627dsp c8627dsp) {
            this();
        }

        /* loaded from: classes2.dex */
        public static final class b extends e {
            private final FE d;

            public final FE d() {
                return this.d;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && C8632dsu.c(this.d, ((b) obj).d);
            }

            public int hashCode() {
                return this.d.hashCode();
            }

            public String toString() {
                FE fe = this.d;
                return "Effect(effect=" + fe + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(FE fe) {
                super(null);
                C8632dsu.c((Object) fe, "");
                this.d = fe;
            }
        }

        private e() {
        }

        /* loaded from: classes2.dex */
        public static final class a extends e {
            private final FX a;
            private final boolean b;

            public final FX b() {
                return this.a;
            }

            public final boolean e() {
                return this.b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof a) {
                    a aVar = (a) obj;
                    return C8632dsu.c(this.a, aVar.a) && this.b == aVar.b;
                }
                return false;
            }

            public int hashCode() {
                return (this.a.hashCode() * 31) + Boolean.hashCode(this.b);
            }

            public String toString() {
                FX fx = this.a;
                boolean z = this.b;
                return "Transition(screen=" + fx + ", replaceCurrentScreen=" + z + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(FX fx, boolean z) {
                super(null);
                C8632dsu.c((Object) fx, "");
                this.a = fx;
                this.b = z;
            }
        }
    }

    /* loaded from: classes2.dex */
    public static final class c {
        static final /* synthetic */ c e = new c();

        private c() {
        }

        public static /* synthetic */ InterstitialClient e(c cVar, InterfaceC0721Ad interfaceC0721Ad, String str, int i, Object obj) {
            if ((i & 2) != 0) {
                str = null;
            }
            return cVar.e(interfaceC0721Ad, str);
        }

        public final InterstitialClient e(InterfaceC0721Ad interfaceC0721Ad, String str) {
            C8632dsu.c((Object) interfaceC0721Ad, "");
            return new C0723Af(interfaceC0721Ad, str);
        }
    }
}
