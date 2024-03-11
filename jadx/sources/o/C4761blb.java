package o;

import androidx.media3.common.util.Util;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: o.blb  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4761blb {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final C1045Mp b$729240f0;
    private static long e$s69$206 = 0;
    private static int h = 0;
    private static int i = 1;
    private C4845bna a;
    private final Gson e = C8118deO.a();
    private final Map<String, Object> c = new ConcurrentHashMap();
    private final CopyOnWriteArrayList<InterfaceC4740bkZ> d = new CopyOnWriteArrayList<>();

    static {
        c();
        try {
            Object[] objArr = {null};
            Object obj = C4755bkv.q.get(-1191095750);
            if (obj == null) {
                obj = ((Class) C4755bkv.b((char) 0, 7, 1130)).getDeclaredConstructor(C8627dsp.class);
                C4755bkv.q.put(-1191095750, obj);
            }
            b$729240f0 = (C1045Mp) ((Constructor) obj).newInstance(objArr);
            int i2 = i + 33;
            h = i2 % 128;
            int i3 = i2 % 2;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    public static final long b(Map<String, ? extends List<String>> map) {
        int i2 = 2 % 2;
        int i3 = h + 45;
        i = i3 % 128;
        int i4 = i3 % 2;
        C1045Mp c1045Mp = b$729240f0;
        try {
            Object[] objArr = {map};
            Object obj = C4755bkv.q.get(-1090839984);
            if (obj == null) {
                obj = ((Class) C4755bkv.b((char) 0, 7, 1130)).getMethod("c", Map.class);
                C4755bkv.q.put(-1090839984, obj);
            }
            long longValue = ((Long) ((Method) obj).invoke(c1045Mp, objArr)).longValue();
            int i5 = i + 19;
            h = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 22 / 0;
            }
            return longValue;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    static void c() {
        e$s69$206 = 8489343112670065390L;
    }

    public static /* synthetic */ void d(InterfaceC4740bkZ interfaceC4740bkZ, int i2, C4760bla c4760bla) {
        int i3 = 2 % 2;
        int i4 = i + 57;
        h = i4 % 128;
        int i5 = i4 % 2;
        a(interfaceC4740bkZ, i2, c4760bla);
        int i6 = h + 51;
        i = i6 % 128;
        int i7 = i6 % 2;
    }

    public final void b(C4845bna c4845bna) {
        int i2 = 2 % 2;
        int i3 = h + 25;
        int i4 = i3 % 128;
        i = i4;
        if (i3 % 2 == 0) {
            this.a = c4845bna;
            int i5 = 71 / 0;
        } else {
            this.a = c4845bna;
        }
        int i6 = i4 + 97;
        h = i6 % 128;
        int i7 = i6 % 2;
    }

    public final void d(InterfaceC4740bkZ interfaceC4740bkZ) {
        int i2 = 2 % 2;
        int i3 = h + 85;
        i = i3 % 128;
        int i4 = i3 % 2;
        C8632dsu.c((Object) interfaceC4740bkZ, "");
        this.d.add(interfaceC4740bkZ);
        int i5 = h + 125;
        i = i5 % 128;
        int i6 = i5 % 2;
    }

    public final void e(InterfaceC4740bkZ interfaceC4740bkZ) {
        int i2 = 2 % 2;
        int i3 = h + 103;
        i = i3 % 128;
        if (i3 % 2 == 0) {
            C8632dsu.c((Object) interfaceC4740bkZ, "");
            this.d.remove(interfaceC4740bkZ);
            throw null;
        }
        C8632dsu.c((Object) interfaceC4740bkZ, "");
        this.d.remove(interfaceC4740bkZ);
        int i4 = i + 25;
        h = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 74 / 0;
        }
    }

    public final void b(String str) {
        int i2 = 2 % 2;
        int i3 = i + 33;
        h = i3 % 128;
        int i4 = i3 % 2;
        c("pbcid", str);
        if (i4 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean d() {
        int i2 = 2 % 2;
        int i3 = i + 101;
        h = i3 % 128;
        int i4 = i3 % 2;
        boolean containsKey = this.c.containsKey("pbcid");
        int i5 = i + 105;
        h = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 92 / 0;
        }
        return containsKey;
    }

    public final void d(String str) {
        int i2 = 2 % 2;
        int i3 = h + 21;
        i = i3 % 128;
        int i4 = i3 % 2;
        Object obj = null;
        c("s_xid", str);
        if (i4 == 0) {
            throw null;
        }
        int i5 = i + 43;
        h = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public final void c(boolean z) {
        String str;
        int i2 = 2 % 2;
        if (z) {
            Object[] objArr = new Object[1];
            f(0, new char[]{22501, 45382, 6453, 38336, 22484}, objArr);
            str = ((String) objArr[0]).intern();
            int i3 = i + 105;
            h = i3 % 128;
            int i4 = i3 % 2;
        } else {
            int i5 = h + 1;
            i = i5 % 128;
            int i6 = i5 % 2;
            str = "0";
        }
        c("dl", str);
    }

    private final void a() {
        long j;
        int i2 = 2 % 2;
        C4845bna c4845bna = this.a;
        if (c4845bna != null) {
            int i3 = h + 49;
            i = i3 % 128;
            if (i3 % 2 == 0) {
                j = c4845bna.d();
                int i4 = 29 / 0;
            } else {
                j = c4845bna.d();
            }
        } else {
            j = 0;
        }
        c("tm", String.valueOf(j));
        int i5 = h + 49;
        i = i5 % 128;
        int i6 = i5 % 2;
    }

    public final void e(int i2, int i3, int i4) {
        int i5 = 2 % 2;
        int i6 = i + 27;
        h = i6 % 128;
        if (i6 % 2 == 0) {
            c("cpr_ss", String.valueOf(i2));
            c("cpr_ca", String.valueOf(i3));
            c("cpr_rec", String.valueOf(i4));
            return;
        }
        c("cpr_ss", String.valueOf(i2));
        c("cpr_ca", String.valueOf(i3));
        c("cpr_rec", String.valueOf(i4));
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final Map<String, List<String>> b(int i2, long j, Map<String, ? extends List<String>> map) {
        Map<String, List<String>> d;
        Object obj;
        List d2;
        Object f;
        Map<String, List<String>> d3;
        Map<String, List<String>> d4;
        Map<String, List<String>> d5;
        List e;
        List e2;
        List e3;
        Map<String, List<String>> c;
        boolean i3;
        List d6;
        int i4 = 2 % 2;
        C8632dsu.c((Object) map, "");
        List<String> list = map.get("X-TCP-Info");
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            for (String str : list) {
                d6 = duD.d((CharSequence) str, new String[]{";"}, false, 0, 6, (Object) null);
                C8571dqn.b(arrayList, d6);
            }
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                i3 = C8691duz.i((String) obj, "sc=", false, 2, null);
                if (!(!i3)) {
                    break;
                }
            }
            String str2 = (String) obj;
            if (str2 != null) {
                int i5 = i + 105;
                h = i5 % 128;
                int i6 = i5 % 2;
                d2 = duD.d((CharSequence) str2, new String[]{"="}, false, 2, 2, (Object) null);
                if (d2 != null) {
                    f = C8576dqs.f((List<? extends Object>) d2, 1);
                    String str3 = (String) f;
                    if (str3 != null) {
                        int i7 = h + 11;
                        i = i7 % 128;
                        int i8 = i7 % 2;
                        Object obj2 = this.c.get("pbcid");
                        if (obj2 != null) {
                            int i9 = h + 77;
                            i = i9 % 128;
                            if (i9 % 2 == 0) {
                                try {
                                    Object obj3 = C4755bkv.q.get(64603334);
                                    if (obj3 == null) {
                                        obj3 = ((Class) C4755bkv.b((char) 57941, 5, 1142)).getMethod("e", null);
                                        C4755bkv.q.put(64603334, obj3);
                                    }
                                    CharSequence charSequence = (CharSequence) ((Method) obj3).invoke(obj2, null);
                                    throw null;
                                } catch (Throwable th) {
                                    Throwable cause = th.getCause();
                                    if (cause != null) {
                                        throw cause;
                                    }
                                    throw th;
                                }
                            }
                            try {
                                Object obj4 = C4755bkv.q.get(64603334);
                                if (obj4 == null) {
                                    obj4 = ((Class) C4755bkv.b((char) 57941, 5, 1142)).getMethod("e", null);
                                    C4755bkv.q.put(64603334, obj4);
                                }
                                CharSequence charSequence2 = (CharSequence) ((Method) obj4).invoke(obj2, null);
                                if (charSequence2 != null) {
                                    if (charSequence2.length() == 0 || str3.length() == 0) {
                                        d4 = dqE.d();
                                        return d4;
                                    }
                                    byte[] d7 = C8071ddU.d(str3);
                                    C8632dsu.a(d7, "");
                                    Charset charset = StandardCharsets.UTF_8;
                                    C8632dsu.a(charset, "");
                                    try {
                                        Object[] objArr = {new String(d7, charset), charSequence2};
                                        Object obj5 = C4755bkv.q.get(-537094853);
                                        if (obj5 == null) {
                                            obj5 = ((Class) C4755bkv.b((char) 0, 5, 1137)).getMethod("e", String.class, String.class);
                                            C4755bkv.q.put(-537094853, obj5);
                                        }
                                        String str4 = (String) ((Method) obj5).invoke(null, objArr);
                                        b$729240f0.getLogTag();
                                        try {
                                            C4760bla c4760bla = (C4760bla) this.e.fromJson(str4, (Class<Object>) C4760bla.class);
                                            long j2 = -9223372036854775807L;
                                            if (j == -9223372036854775807L) {
                                                int i10 = h + 57;
                                                i = i10 % 128;
                                                int i11 = i10 % 2;
                                            } else {
                                                j2 = c4760bla.c() - Util.usToMs(j);
                                            }
                                            for (InterfaceC4740bkZ interfaceC4740bkZ : this.d) {
                                                Object[] objArr2 = {interfaceC4740bkZ, Integer.valueOf(i2), c4760bla};
                                                Object obj6 = C4755bkv.q.get(-854621242);
                                                if (obj6 == null) {
                                                    obj6 = ((Class) C4755bkv.b((char) 5952, 5, 1125)).getDeclaredConstructor(InterfaceC4740bkZ.class, Integer.TYPE, C4760bla.class);
                                                    C4755bkv.q.put(-854621242, obj6);
                                                }
                                                C8187dfe.c((Runnable) ((Constructor) obj6).newInstance(objArr2));
                                            }
                                            e = C8566dqi.e(str4);
                                            e2 = C8566dqi.e(String.valueOf(c4760bla.c()));
                                            e3 = C8566dqi.e(String.valueOf(j2));
                                            c = dqE.c(dpD.a("x-nflx-decoded-sc", e), dpD.a("x-sc-ts", e2), dpD.a("x-sc-edge", e3));
                                            return c;
                                        } catch (Exception unused) {
                                            d5 = dqE.d();
                                            return d5;
                                        }
                                    } catch (Throwable th2) {
                                        Throwable cause2 = th2.getCause();
                                        if (cause2 != null) {
                                            throw cause2;
                                        }
                                        throw th2;
                                    }
                                }
                            } catch (Throwable th3) {
                                Throwable cause3 = th3.getCause();
                                if (cause3 != null) {
                                    throw cause3;
                                }
                                throw th3;
                            }
                        }
                        d3 = dqE.d();
                        return d3;
                    }
                }
            }
        }
        d = dqE.d();
        return d;
    }

    private static final void a(InterfaceC4740bkZ interfaceC4740bkZ, int i2, C4760bla c4760bla) {
        int i3 = 2 % 2;
        int i4 = h + 5;
        i = i4 % 128;
        int i5 = i4 % 2;
        C8632dsu.d(c4760bla);
        interfaceC4740bkZ.e(i2, c4760bla);
        if (i5 == 0) {
            int i6 = 65 / 0;
        }
        int i7 = i + 55;
        h = i7 % 128;
        int i8 = i7 % 2;
    }

    public final boolean e(Map<String, ? extends List<String>> map) {
        Object obj;
        Object obj2;
        List d;
        Object f;
        Object obj3;
        boolean i2;
        List d2;
        int i3 = 2 % 2;
        C8632dsu.c((Object) map, "");
        List<String> list = map.get("X-TCP-Info");
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            for (String str : list) {
                d2 = duD.d((CharSequence) str, new String[]{";"}, false, 0, 6, (Object) null);
                C8571dqn.b(arrayList, d2);
            }
            Iterator it = arrayList.iterator();
            while (true) {
                obj = null;
                if (!it.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it.next();
                i2 = C8691duz.i((String) obj2, "sc=", false, 2, null);
                if (i2) {
                    break;
                }
            }
            String str2 = (String) obj2;
            if (str2 != null) {
                int i4 = h + 33;
                i = i4 % 128;
                int i5 = i4 % 2;
                d = duD.d((CharSequence) str2, new String[]{"="}, false, 2, 2, (Object) null);
                if (d != null) {
                    int i6 = h + 57;
                    i = i6 % 128;
                    int i7 = i6 % 2;
                    f = C8576dqs.f((List<? extends Object>) d, 1);
                    String str3 = (String) f;
                    if (str3 != null && (obj3 = this.c.get("pbcid")) != null) {
                        try {
                            Object obj4 = C4755bkv.q.get(64603334);
                            if (obj4 == null) {
                                obj4 = ((Class) C4755bkv.b((char) 57941, 5, 1142)).getMethod("e", null);
                                C4755bkv.q.put(64603334, obj4);
                            }
                            CharSequence charSequence = (CharSequence) ((Method) obj4).invoke(obj3, null);
                            if (charSequence != null) {
                                if (charSequence.length() == 0 || str3.length() == 0) {
                                    int i8 = i + 49;
                                    h = i8 % 128;
                                    if (i8 % 2 == 0) {
                                        return false;
                                    }
                                    obj.hashCode();
                                    throw null;
                                }
                                byte[] d3 = C8071ddU.d(str3);
                                C8632dsu.a(d3, "");
                                Charset charset = StandardCharsets.UTF_8;
                                C8632dsu.a(charset, "");
                                try {
                                    Object[] objArr = {new String(d3, charset), charSequence};
                                    Object obj5 = C4755bkv.q.get(-537094853);
                                    if (obj5 == null) {
                                        obj5 = ((Class) C4755bkv.b((char) 0, 5, 1137)).getMethod("e", String.class, String.class);
                                        C4755bkv.q.put(-537094853, obj5);
                                    }
                                    try {
                                        if (((C4760bla) this.e.fromJson((String) ((Method) obj5).invoke(null, objArr), (Class<Object>) C4760bla.class)) != null) {
                                            return true;
                                        }
                                    } catch (JsonSyntaxException unused) {
                                    } catch (Exception e) {
                                        throw e;
                                    }
                                } catch (Throwable th) {
                                    Throwable cause = th.getCause();
                                    if (cause != null) {
                                        throw cause;
                                    }
                                    throw th;
                                }
                            }
                        } catch (Throwable th2) {
                            Throwable cause2 = th2.getCause();
                            if (cause2 != null) {
                                throw cause2;
                            }
                            throw th2;
                        }
                    }
                }
            }
        }
        return false;
    }

    private final void c(String str, String str2) {
        Object obj;
        int i2 = 2 % 2;
        int i3 = i + 45;
        h = i3 % 128;
        int i4 = i3 % 2;
        Object obj2 = this.c.get(str);
        if (obj2 != null) {
            int i5 = h + 83;
            i = i5 % 128;
            int i6 = i5 % 2;
            try {
                Object obj3 = C4755bkv.q.get(64600451);
                if (obj3 == null) {
                    obj3 = ((Class) C4755bkv.b((char) 57941, 5, 1142)).getMethod("b", null);
                    C4755bkv.q.put(64600451, obj3);
                }
                obj = ((Method) obj3).invoke(obj2, null);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        } else {
            int i7 = i + 21;
            h = i7 % 128;
            int i8 = i7 % 2;
            obj = null;
        }
        if (C8632dsu.c(str2, obj)) {
            return;
        }
        if (str2 != null) {
            Map<String, Object> map = this.c;
            try {
                Object[] objArr = {str2, null, 2, null};
                Object obj4 = C4755bkv.q.get(1830588848);
                if (obj4 == null) {
                    obj4 = ((Class) C4755bkv.b((char) 57941, 5, 1142)).getDeclaredConstructor(String.class, String.class, Integer.TYPE, C8627dsp.class);
                    C4755bkv.q.put(1830588848, obj4);
                }
                map.put(str, ((Constructor) obj4).newInstance(objArr));
                return;
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 == null) {
                    throw th2;
                }
                throw cause2;
            }
        }
        this.c.remove(str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x0136, code lost:
        if (o.C8632dsu.c((java.lang.Object) r12, (java.lang.Object) "s_xid") != false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x013d, code lost:
        if (o.C8632dsu.c((java.lang.Object) r12, (java.lang.Object) "s_xid") != false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0140, code lost:
        r13 = o.C4755bkv.q.get(64603334);
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x014a, code lost:
        if (r13 == null) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x014d, code lost:
        r13 = ((java.lang.Class) o.C4755bkv.b(57941, 5, 1142)).getMethod("e", null);
        o.C4755bkv.q.put(64603334, r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0160, code lost:
        r0 = (java.lang.String) ((java.lang.reflect.Method) r13).invoke(r11, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0169, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x016a, code lost:
        r2 = r0.getCause();
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x016e, code lost:
        if (r2 != null) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0170, code lost:
        throw r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0171, code lost:
        throw r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.String b() {
        /*
            Method dump skipped, instructions count: 564
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C4761blb.b():java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0044 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.Map<java.lang.String, java.lang.String> e() {
        /*
            r5 = this;
            r0 = 2
            int r1 = r0 % r0
            r5.a()
            r1 = 0
            java.lang.String r2 = r5.b()     // Catch: java.lang.Exception -> L35
            if (r2 == 0) goto L30
            int r3 = o.C4761blb.i
            int r3 = r3 + 103
            int r4 = r3 % 128
            o.C4761blb.h = r4
            int r3 = r3 % r0
            java.lang.String r4 = "x-nflx-sc"
            if (r3 != 0) goto L25
            kotlin.Pair r2 = o.dpD.a(r4, r2)     // Catch: java.lang.Exception -> L35
            java.util.Map r2 = o.dqF.e(r2)     // Catch: java.lang.Exception -> L35
            if (r2 != 0) goto L39
            goto L30
        L25:
            kotlin.Pair r2 = o.dpD.a(r4, r2)     // Catch: java.lang.Exception -> L35
            o.dqF.e(r2)     // Catch: java.lang.Exception -> L35
            r1.hashCode()
            throw r1
        L30:
            java.util.Map r2 = o.dqF.c()     // Catch: java.lang.Exception -> L35
            goto L39
        L35:
            java.util.Map r2 = o.dqF.c()
        L39:
            int r3 = o.C4761blb.i
            int r3 = r3 + 67
            int r4 = r3 % 128
            o.C4761blb.h = r4
            int r3 = r3 % r0
            if (r3 != 0) goto L45
            return r2
        L45:
            r1.hashCode()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C4761blb.e():java.util.Map");
    }

    private static void f(int i2, char[] cArr, Object[] objArr) {
        int i3 = 2 % 2;
        C9586sT c9586sT = new C9586sT();
        char[] b = C9586sT.b(e$s69$206 ^ 7567248728798573470L, cArr, i2);
        c9586sT.d = 4;
        while (c9586sT.d < b.length) {
            int i4 = $11 + 107;
            $10 = i4 % 128;
            int i5 = i4 % 2;
            c9586sT.b = c9586sT.d - 4;
            b[c9586sT.d] = (char) ((b[c9586sT.d] ^ b[c9586sT.d % 4]) ^ (c9586sT.b * (e$s69$206 ^ 7567248728798573470L)));
            c9586sT.d++;
        }
        String str = new String(b, 4, b.length - 4);
        int i6 = $11 + 25;
        $10 = i6 % 128;
        int i7 = i6 % 2;
        objArr[0] = str;
    }
}
