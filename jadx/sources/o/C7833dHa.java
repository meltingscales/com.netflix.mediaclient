package o;

import java.io.EOFException;
import java.util.ArrayList;
import java.util.List;
import okio.ByteString;

/* renamed from: o.dHa  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7833dHa {
    private static final ByteString c;
    private static final ByteString d;

    static {
        ByteString.b bVar = ByteString.c;
        d = bVar.e("\"\\");
        c = bVar.e("\t ,=");
    }

    public static final List<C7807dGb> d(C7819dGn c7819dGn, String str) {
        boolean a;
        C8632dsu.d(c7819dGn, "");
        C8632dsu.d((Object) str, "");
        ArrayList arrayList = new ArrayList();
        int c2 = c7819dGn.c();
        for (int i = 0; i < c2; i++) {
            a = C8691duz.a(str, c7819dGn.c(i), true);
            if (a) {
                try {
                    b(new C7872dIo().b(c7819dGn.a(i)), arrayList);
                } catch (EOFException e) {
                    dHG.i.b().d("Unable to parse challenge", 5, e);
                }
            }
        }
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x0085, code lost:
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0085, code lost:
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final void b(o.C7872dIo r7, java.util.List<o.C7807dGb> r8) {
        /*
        L0:
            r0 = 0
            r1 = r0
        L2:
            if (r1 != 0) goto Le
            b(r7)
            java.lang.String r1 = c(r7)
            if (r1 != 0) goto Le
            return
        Le:
            boolean r2 = b(r7)
            java.lang.String r3 = c(r7)
            if (r3 != 0) goto L2c
            boolean r7 = r7.m()
            if (r7 != 0) goto L1f
            return
        L1f:
            o.dGb r7 = new o.dGb
            java.util.Map r0 = o.dqF.c()
            r7.<init>(r1, r0)
            r8.add(r7)
            return
        L2c:
            r4 = 61
            byte r4 = (byte) r4
            int r5 = o.dGB.a(r7, r4)
            boolean r6 = b(r7)
            if (r2 != 0) goto L68
            if (r6 != 0) goto L41
            boolean r2 = r7.m()
            if (r2 == 0) goto L68
        L41:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r3)
            java.lang.String r3 = "="
            java.lang.String r3 = o.C8684dus.b(r3, r5)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.util.Map r0 = java.util.Collections.singletonMap(r0, r2)
            java.lang.String r2 = ""
            o.C8632dsu.b(r0, r2)
            o.dGb r2 = new o.dGb
            r2.<init>(r1, r0)
            r8.add(r2)
            goto L0
        L68:
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            r2.<init>()
            int r6 = o.dGB.a(r7, r4)
            int r5 = r5 + r6
        L72:
            if (r3 != 0) goto L83
            java.lang.String r3 = c(r7)
            boolean r5 = b(r7)
            if (r5 == 0) goto L7f
            goto L85
        L7f:
            int r5 = o.dGB.a(r7, r4)
        L83:
            if (r5 != 0) goto L90
        L85:
            o.dGb r4 = new o.dGb
            r4.<init>(r1, r2)
            r8.add(r4)
            r1 = r3
            goto L2
        L90:
            r6 = 1
            if (r5 <= r6) goto L94
            return
        L94:
            boolean r6 = b(r7)
            if (r6 == 0) goto L9b
            return
        L9b:
            r6 = 34
            byte r6 = (byte) r6
            boolean r6 = a(r7, r6)
            if (r6 == 0) goto La9
            java.lang.String r6 = d(r7)
            goto Lad
        La9:
            java.lang.String r6 = c(r7)
        Lad:
            if (r6 == 0) goto Lc7
            java.lang.Object r3 = r2.put(r3, r6)
            java.lang.String r3 = (java.lang.String) r3
            if (r3 == 0) goto Lb8
            return
        Lb8:
            boolean r3 = b(r7)
            if (r3 != 0) goto Lc5
            boolean r3 = r7.m()
            if (r3 != 0) goto Lc5
            return
        Lc5:
            r3 = r0
            goto L72
        Lc7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C7833dHa.b(o.dIo, java.util.List):void");
    }

    private static final boolean b(C7872dIo c7872dIo) {
        boolean z = false;
        while (!c7872dIo.m()) {
            byte a = c7872dIo.a(0L);
            if (a == 9 || a == 32) {
                c7872dIo.l();
            } else if (a != 44) {
                break;
            } else {
                c7872dIo.l();
                z = true;
            }
        }
        return z;
    }

    private static final boolean a(C7872dIo c7872dIo, byte b) {
        return !c7872dIo.m() && c7872dIo.a(0L) == b;
    }

    private static final String d(C7872dIo c7872dIo) {
        byte b = (byte) 34;
        if (c7872dIo.l() != b) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        C7872dIo c7872dIo2 = new C7872dIo();
        while (true) {
            long d2 = c7872dIo.d(d);
            if (d2 == -1) {
                return null;
            }
            if (c7872dIo.a(d2) == b) {
                c7872dIo2.a(c7872dIo, d2);
                c7872dIo.l();
                return c7872dIo2.v();
            } else if (c7872dIo.D() == d2 + 1) {
                return null;
            } else {
                c7872dIo2.a(c7872dIo, d2);
                c7872dIo.l();
                c7872dIo2.a(c7872dIo, 1L);
            }
        }
    }

    private static final String c(C7872dIo c7872dIo) {
        long d2 = c7872dIo.d(c);
        if (d2 == -1) {
            d2 = c7872dIo.D();
        }
        if (d2 != 0) {
            return c7872dIo.b(d2);
        }
        return null;
    }

    public static final void b(InterfaceC7812dGg interfaceC7812dGg, C7818dGm c7818dGm, C7819dGn c7819dGn) {
        C8632dsu.d(interfaceC7812dGg, "");
        C8632dsu.d(c7818dGm, "");
        C8632dsu.d(c7819dGn, "");
        if (interfaceC7812dGg == InterfaceC7812dGg.e) {
            return;
        }
        List<C7813dGh> b = C7813dGh.c.b(c7818dGm, c7819dGn);
        if (b.isEmpty()) {
            return;
        }
        interfaceC7812dGg.d(c7818dGm, b);
    }

    public static final boolean d(C7824dGs c7824dGs) {
        boolean a;
        C8632dsu.d(c7824dGs, "");
        if (C8632dsu.c((Object) c7824dGs.n().i(), (Object) "HEAD")) {
            return false;
        }
        int c2 = c7824dGs.c();
        if (((c2 >= 100 && c2 < 200) || c2 == 204 || c2 == 304) && dGB.e(c7824dGs) == -1) {
            a = C8691duz.a("chunked", C7824dGs.c(c7824dGs, "Transfer-Encoding", null, 2, null), true);
            if (!a) {
                return false;
            }
        }
        return true;
    }
}
