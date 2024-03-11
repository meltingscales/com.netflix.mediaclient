package o;

import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import kotlin.TypeCastException;
import okhttp3.Protocol;

/* renamed from: o.dHz  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C7858dHz extends dHG {
    private static final boolean d;
    public static final c e = new c(null);

    @Override // o.dHG
    public void b(SSLSocket sSLSocket, String str, List<Protocol> list) {
        C8632dsu.d(sSLSocket, "");
        C8632dsu.d(list, "");
        SSLParameters sSLParameters = sSLSocket.getSSLParameters();
        List<String> d2 = dHG.i.d(list);
        C8632dsu.b(sSLParameters, "");
        Object[] array = d2.toArray(new String[0]);
        if (array != null) {
            sSLParameters.setApplicationProtocols((String[]) array);
            sSLSocket.setSSLParameters(sSLParameters);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
    }

    @Override // o.dHG
    public String d(SSLSocket sSLSocket) {
        String applicationProtocol;
        C8632dsu.d(sSLSocket, "");
        try {
            applicationProtocol = sSLSocket.getApplicationProtocol();
            if (applicationProtocol != null) {
                if (!C8632dsu.c((Object) applicationProtocol, (Object) "")) {
                    return applicationProtocol;
                }
            }
        } catch (UnsupportedOperationException unused) {
        }
        return null;
    }

    /* renamed from: o.dHz$c */
    /* loaded from: classes5.dex */
    public static final class c {
        private c() {
        }

        public /* synthetic */ c(C8627dsp c8627dsp) {
            this();
        }

        public final boolean e() {
            return C7858dHz.d;
        }

        public final C7858dHz c() {
            if (e()) {
                return new C7858dHz();
            }
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001d, code lost:
        if (r1.intValue() >= 9) goto L11;
     */
    static {
        /*
            o.dHz$c r0 = new o.dHz$c
            r1 = 0
            r0.<init>(r1)
            o.C7858dHz.e = r0
            java.lang.String r0 = "java.specification.version"
            java.lang.String r0 = java.lang.System.getProperty(r0)
            if (r0 == 0) goto L14
            java.lang.Integer r1 = o.C8684dus.e(r0)
        L14:
            r0 = 0
            if (r1 == 0) goto L20
            int r1 = r1.intValue()
            r2 = 9
            if (r1 < r2) goto L2a
            goto L29
        L20:
            java.lang.Class[] r1 = new java.lang.Class[r0]     // Catch: java.lang.NoSuchMethodException -> L2a
            java.lang.Class<javax.net.ssl.SSLSocket> r2 = javax.net.ssl.SSLSocket.class
            java.lang.String r3 = "getApplicationProtocol"
            r2.getMethod(r3, r1)     // Catch: java.lang.NoSuchMethodException -> L2a
        L29:
            r0 = 1
        L2a:
            o.C7858dHz.d = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C7858dHz.<clinit>():void");
    }
}
