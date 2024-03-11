package o;

import java.util.Map;

/* loaded from: classes5.dex */
public final class dDZ {
    private static final Map<InterfaceC8660dtv<? extends Object>, dBT<? extends Object>> a;

    static {
        Map<InterfaceC8660dtv<? extends Object>, dBT<? extends Object>> c;
        c = dqE.c(dpD.a(dsA.a(String.class), C7706dCi.b(dsE.b)), dpD.a(dsA.a(Character.TYPE), C7706dCi.d(C8625dsn.d)), dpD.a(dsA.a(char[].class), C7706dCi.a()), dpD.a(dsA.a(Double.TYPE), C7706dCi.e(C8629dsr.e)), dpD.a(dsA.a(double[].class), C7706dCi.d()), dpD.a(dsA.a(Float.TYPE), C7706dCi.a(C8626dso.e)), dpD.a(dsA.a(float[].class), C7706dCi.e()), dpD.a(dsA.a(Long.TYPE), C7706dCi.b(dsB.d)), dpD.a(dsA.a(long[].class), C7706dCi.i()), dpD.a(dsA.a(dpL.class), C7706dCi.a(dpL.c)), dpD.a(dsA.a(dpK.class), C7706dCi.m()), dpD.a(dsA.a(Integer.TYPE), C7706dCi.e(C8634dsw.d)), dpD.a(dsA.a(int[].class), C7706dCi.j()), dpD.a(dsA.a(dpJ.class), C7706dCi.c(dpJ.b)), dpD.a(dsA.a(dpN.class), C7706dCi.l()), dpD.a(dsA.a(Short.TYPE), C7706dCi.a(dsF.d)), dpD.a(dsA.a(short[].class), C7706dCi.f()), dpD.a(dsA.a(dpO.class), C7706dCi.d(dpO.d)), dpD.a(dsA.a(dpP.class), C7706dCi.o()), dpD.a(dsA.a(Byte.TYPE), C7706dCi.a(C8623dsl.a)), dpD.a(dsA.a(byte[].class), C7706dCi.c()), dpD.a(dsA.a(dpF.class), C7706dCi.d(dpF.c)), dpD.a(dsA.a(dpI.class), C7706dCi.h()), dpD.a(dsA.a(Boolean.TYPE), C7706dCi.d(C8624dsm.a)), dpD.a(dsA.a(boolean[].class), C7706dCi.b()), dpD.a(dsA.a(dpR.class), C7706dCi.e(dpR.c)), dpD.a(dsA.a(Void.class), C7706dCi.g()), dpD.a(dsA.a(duI.class), C7706dCi.e(duI.d)));
        a = c;
    }

    public static final InterfaceC7707dCj e(String str, AbstractC7709dCl abstractC7709dCl) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) abstractC7709dCl, "");
        b(str);
        return new dDV(str, abstractC7709dCl);
    }

    private static final void b(String str) {
        boolean a2;
        String h;
        boolean a3;
        for (InterfaceC8660dtv<? extends Object> interfaceC8660dtv : a.keySet()) {
            String b = interfaceC8660dtv.b();
            C8632dsu.d((Object) b);
            String d = d(b);
            a2 = C8691duz.a(str, "kotlin." + d, true);
            if (!a2) {
                a3 = C8691duz.a(str, d, true);
                if (a3) {
                }
            }
            h = C8681dup.h("\n                The name of serial descriptor should uniquely identify associated serializer.\n                For serial name " + str + " there already exist " + d(d) + "Serializer.\n                Please refer to SerialDescriptor documentation for additional information.\n            ");
            throw new IllegalArgumentException(h);
        }
    }

    private static final String d(String str) {
        if (str.length() > 0) {
            StringBuilder sb = new StringBuilder();
            char charAt = str.charAt(0);
            sb.append((Object) (Character.isLowerCase(charAt) ? C8675duj.d(charAt) : String.valueOf(charAt)));
            String substring = str.substring(1);
            C8632dsu.a(substring, "");
            sb.append(substring);
            return sb.toString();
        }
        return str;
    }

    public static final <T> dBT<T> b(InterfaceC8660dtv<T> interfaceC8660dtv) {
        C8632dsu.c((Object) interfaceC8660dtv, "");
        return (dBT<T>) a.get(interfaceC8660dtv);
    }
}
