package o;

import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

/* loaded from: classes5.dex */
public final class dHS extends dHM {
    public static final d c = new d(null);
    private final Class<? super SSLSocketFactory> d;
    private final Class<?> e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dHS(Class<? super SSLSocket> cls, Class<? super SSLSocketFactory> cls2, Class<?> cls3) {
        super(cls);
        C8632dsu.d(cls, "");
        C8632dsu.d(cls2, "");
        C8632dsu.d(cls3, "");
        this.d = cls2;
        this.e = cls3;
    }

    /* loaded from: classes5.dex */
    public static final class d {
        private d() {
        }

        public /* synthetic */ d(C8627dsp c8627dsp) {
            this();
        }

        public static /* synthetic */ dHN c(d dVar, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = "com.android.org.conscrypt";
            }
            return dVar.c(str);
        }

        public final dHN c(String str) {
            C8632dsu.d((Object) str, "");
            try {
                Class<?> cls = Class.forName(str + ".OpenSSLSocketImpl");
                Class<?> cls2 = Class.forName(str + ".OpenSSLSocketFactoryImpl");
                Class<?> cls3 = Class.forName(str + ".SSLParametersImpl");
                C8632dsu.b(cls3, "");
                return new dHS(cls, cls2, cls3);
            } catch (Exception e) {
                dHG.i.b().d("unable to load android socket classes", 5, e);
                return null;
            }
        }
    }
}
