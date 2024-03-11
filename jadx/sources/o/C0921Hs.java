package o;

import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import com.netflix.mediaclient.api.logging.error.ErrorType;
import java.util.Map;
import o.InterfaceC0914Hl;
import o.InterfaceC1598aHf;
import o.InterfaceC1601aHi;

/* renamed from: o.Hs  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0921Hs implements InterfaceC0914Hl {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int a = 1;
    private static int b;
    private static long b$s3$104;
    public static final e e;
    private final SQLiteDatabase c;
    private final C0915Hm d;

    static {
        b();
        e = new e(null);
        int i = b + 49;
        a = i % 128;
        int i2 = i % 2;
    }

    static void b() {
        b$s3$104 = -2157858723091817450L;
    }

    public C0921Hs(C0915Hm c0915Hm) {
        C8632dsu.c((Object) c0915Hm, "");
        this.d = c0915Hm;
        this.c = c0915Hm.d();
    }

    @Override // o.InterfaceC0914Hl
    public void b(long j, long j2, InterfaceC0905Hc interfaceC0905Hc) {
        int i = 2 % 2;
        int i2 = a + 53;
        b = i2 % 128;
        int i3 = i2 % 2;
        InterfaceC0914Hl.c.b(this, j, j2, interfaceC0905Hc);
        int i4 = a + 105;
        b = i4 % 128;
        int i5 = i4 % 2;
    }

    /* renamed from: o.Hs$e */
    /* loaded from: classes3.dex */
    public static final class e extends C1045Mp {
        public /* synthetic */ e(C8627dsp c8627dsp) {
            this();
        }

        private e() {
            super("SqliteDiskCache");
        }
    }

    @Override // o.InterfaceC0914Hl, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        int i = 2 % 2;
        int i2 = a + 15;
        b = i2 % 128;
        int i3 = i2 % 2;
        this.d.d(this.c);
        int i4 = a + 45;
        b = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 48 / 0;
        }
    }

    @Override // o.InterfaceC0914Hl
    public boolean e() {
        Map d;
        Map k;
        Throwable th;
        Map d2;
        Map k2;
        Throwable th2;
        Map d3;
        Map k3;
        Throwable th3;
        Integer num;
        Map d4;
        Map k4;
        Throwable th4;
        int i = 2 % 2;
        C0915Hm c0915Hm = this.d;
        SQLiteDatabase d5 = c0915Hm.d();
        Integer num2 = null;
        if (d5 != null) {
            try {
                try {
                    d5.beginTransaction();
                    Object[] objArr = new Object[1];
                    f(62939, new char[]{3790}, objArr);
                    num = Integer.valueOf(d5.delete("falcor_leafs", ((String) objArr[0]).intern(), null));
                    c0915Hm.getLogTag();
                    d5.setTransactionSuccessful();
                    try {
                        d5.endTransaction();
                        c0915Hm.getLogTag();
                        dpR dpr = dpR.c;
                    } catch (Exception e2) {
                        InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
                        ErrorType errorType = ErrorType.n;
                        d4 = dqE.d();
                        k4 = dqE.k(d4);
                        C1596aHd c1596aHd = new C1596aHd(null, e2, errorType, true, k4, false, false, 96, null);
                        ErrorType errorType2 = c1596aHd.a;
                        if (errorType2 != null) {
                            c1596aHd.e.put("errorType", errorType2.c());
                            String b2 = c1596aHd.b();
                            if (b2 != null) {
                                c1596aHd.a(errorType2.c() + " " + b2);
                            }
                        }
                        if (c1596aHd.b() != null && c1596aHd.i != null) {
                            th4 = new Throwable(c1596aHd.b(), c1596aHd.i);
                        } else if (c1596aHd.b() != null) {
                            th4 = new Throwable(c1596aHd.b());
                        } else {
                            th4 = c1596aHd.i;
                            if (th4 == null) {
                                th4 = new Throwable("Handled exception with no message");
                            } else if (th4 == null) {
                                throw new IllegalArgumentException("Required value was null.".toString());
                            }
                        }
                        InterfaceC1601aHi.d dVar = InterfaceC1601aHi.c;
                        InterfaceC1598aHf a2 = dVar.a();
                        if (a2 != null) {
                            a2.e(c1596aHd, th4);
                        } else {
                            dVar.e().b(c1596aHd, th4);
                        }
                    }
                } catch (Exception e3) {
                    InterfaceC1598aHf.c cVar2 = InterfaceC1598aHf.a;
                    ErrorType errorType3 = ErrorType.n;
                    d = dqE.d();
                    k = dqE.k(d);
                    C1596aHd c1596aHd2 = new C1596aHd(null, e3, errorType3, true, k, false, false, 96, null);
                    ErrorType errorType4 = c1596aHd2.a;
                    if (errorType4 != null) {
                        c1596aHd2.e.put("errorType", errorType4.c());
                        String b3 = c1596aHd2.b();
                        if (b3 != null) {
                            c1596aHd2.a(errorType4.c() + " " + b3);
                        }
                    }
                    if (c1596aHd2.b() != null && c1596aHd2.i != null) {
                        th = new Throwable(c1596aHd2.b(), c1596aHd2.i);
                    } else if (c1596aHd2.b() != null) {
                        th = new Throwable(c1596aHd2.b());
                    } else {
                        Throwable th5 = c1596aHd2.i;
                        if (th5 == null) {
                            th = new Throwable("Handled exception with no message");
                        } else if (th5 == null) {
                            throw new IllegalArgumentException("Required value was null.".toString());
                        } else {
                            th = th5;
                        }
                    }
                    InterfaceC1601aHi.d dVar2 = InterfaceC1601aHi.c;
                    InterfaceC1598aHf a3 = dVar2.a();
                    if (a3 != null) {
                        a3.e(c1596aHd2, th);
                    } else {
                        dVar2.e().b(c1596aHd2, th);
                    }
                }
            } catch (SQLException e4) {
                InterfaceC1598aHf.c cVar3 = InterfaceC1598aHf.a;
                ErrorType errorType5 = ErrorType.n;
                d2 = dqE.d();
                k2 = dqE.k(d2);
                C1596aHd c1596aHd3 = new C1596aHd(null, e4, errorType5, true, k2, false, false, 96, null);
                ErrorType errorType6 = c1596aHd3.a;
                if (errorType6 != null) {
                    c1596aHd3.e.put("errorType", errorType6.c());
                    String b4 = c1596aHd3.b();
                    if (b4 != null) {
                        c1596aHd3.a(errorType6.c() + " " + b4);
                    }
                }
                if (c1596aHd3.b() != null && c1596aHd3.i != null) {
                    th2 = new Throwable(c1596aHd3.b(), c1596aHd3.i);
                } else if (c1596aHd3.b() != null) {
                    th2 = new Throwable(c1596aHd3.b());
                } else {
                    th2 = c1596aHd3.i;
                    if (th2 == null) {
                        th2 = new Throwable("Handled exception with no message");
                    } else if (th2 == null) {
                        throw new IllegalArgumentException("Required value was null.".toString());
                    }
                }
                InterfaceC1601aHi.d dVar3 = InterfaceC1601aHi.c;
                InterfaceC1598aHf a4 = dVar3.a();
                if (a4 != null) {
                    int i2 = a + 111;
                    b = i2 % 128;
                    if (i2 % 2 != 0) {
                        a4.e(c1596aHd3, th2);
                        throw null;
                    }
                    a4.e(c1596aHd3, th2);
                } else {
                    dVar3.e().b(c1596aHd3, th2);
                }
                try {
                    d5.endTransaction();
                    c0915Hm.getLogTag();
                    dpR dpr2 = dpR.c;
                } catch (Exception e5) {
                    InterfaceC1598aHf.c cVar4 = InterfaceC1598aHf.a;
                    ErrorType errorType7 = ErrorType.n;
                    d3 = dqE.d();
                    k3 = dqE.k(d3);
                    C1596aHd c1596aHd4 = new C1596aHd(null, e5, errorType7, true, k3, false, false, 96, null);
                    ErrorType errorType8 = c1596aHd4.a;
                    if (errorType8 != null) {
                        c1596aHd4.e.put("errorType", errorType8.c());
                        String b5 = c1596aHd4.b();
                        if (b5 != null) {
                            c1596aHd4.a(errorType8.c() + " " + b5);
                        }
                    }
                    if (c1596aHd4.b() != null && c1596aHd4.i != null) {
                        th3 = new Throwable(c1596aHd4.b(), c1596aHd4.i);
                    } else if (c1596aHd4.b() != null) {
                        th3 = new Throwable(c1596aHd4.b());
                    } else {
                        th3 = c1596aHd4.i;
                        if (th3 != null) {
                            int i3 = b + 111;
                            a = i3 % 128;
                            int i4 = i3 % 2;
                            if (th3 == null) {
                                throw new IllegalArgumentException("Required value was null.".toString());
                            }
                        } else {
                            th3 = new Throwable("Handled exception with no message");
                        }
                    }
                    InterfaceC1601aHi.d dVar4 = InterfaceC1601aHi.c;
                    InterfaceC1598aHf a5 = dVar4.a();
                    if (a5 != null) {
                        a5.e(c1596aHd4, th3);
                    } else {
                        dVar4.e().b(c1596aHd4, th3);
                    }
                }
                num = null;
            }
            c0915Hm.d(d5);
            num2 = num;
        }
        e eVar = e;
        eVar.getLogTag();
        d();
        eVar.getLogTag();
        if (num2 != null) {
            num2.intValue();
        }
        return num2 != null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x0247, code lost:
        throw new java.lang.IllegalArgumentException("Required value was null.".toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0237, code lost:
        if (r0 != null) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x023b, code lost:
        if (r0 != null) goto L114;
     */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0256 A[Catch: Exception -> 0x0315, TryCatch #9 {Exception -> 0x0315, blocks: (B:108:0x0262, B:103:0x024e, B:105:0x0256, B:106:0x025a, B:100:0x023e, B:101:0x0247, B:102:0x0248, B:66:0x01a0, B:5:0x0028, B:41:0x00fd, B:43:0x0120, B:45:0x012f, B:46:0x0148, B:48:0x014e, B:50:0x0152, B:61:0x0184, B:64:0x0195, B:65:0x0199, B:51:0x015e, B:53:0x0164, B:54:0x016e, B:58:0x0175, B:59:0x017e, B:60:0x017f), top: B:188:0x0028, inners: #3, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:106:0x025a A[Catch: Exception -> 0x0315, TryCatch #9 {Exception -> 0x0315, blocks: (B:108:0x0262, B:103:0x024e, B:105:0x0256, B:106:0x025a, B:100:0x023e, B:101:0x0247, B:102:0x0248, B:66:0x01a0, B:5:0x0028, B:41:0x00fd, B:43:0x0120, B:45:0x012f, B:46:0x0148, B:48:0x014e, B:50:0x0152, B:61:0x0184, B:64:0x0195, B:65:0x0199, B:51:0x015e, B:53:0x0164, B:54:0x016e, B:58:0x0175, B:59:0x017e, B:60:0x017f), top: B:188:0x0028, inners: #3, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0338  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0366  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0385  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x038f  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x03b7  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x03ce  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x03dc  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x03e1  */
    @Override // o.InterfaceC0914Hl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int a(long r33) {
        /*
            Method dump skipped, instructions count: 995
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C0921Hs.a(long):int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:162:0x0380, code lost:
        if (r0.i != null) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x0385, code lost:
        if (r0.i != null) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x0387, code lost:
        r1 = new java.lang.Throwable(r0.b(), r0.i);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00ac, code lost:
        if (r13.i != null) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00b4, code lost:
        if (r13.i != null) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00b6, code lost:
        r0 = new java.lang.Throwable(r13.b(), r13.i);
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0245 A[Catch: Exception -> 0x00fe, TryCatch #2 {Exception -> 0x00fe, blocks: (B:105:0x0251, B:10:0x004b, B:12:0x006e, B:14:0x007d, B:15:0x0096, B:19:0x00a7, B:21:0x00ab, B:29:0x00b6, B:40:0x00e8, B:42:0x00f0, B:43:0x00f5, B:27:0x00b2, B:30:0x00c2, B:32:0x00c8, B:33:0x00d2, B:37:0x00d9, B:38:0x00e2, B:39:0x00e3, B:79:0x01b0, B:81:0x01d0, B:83:0x01df, B:84:0x01f8, B:87:0x0207, B:89:0x020b, B:100:0x023d, B:102:0x0245, B:103:0x0249, B:90:0x0217, B:92:0x021d, B:93:0x0227, B:97:0x022e, B:98:0x0237, B:99:0x0238, B:75:0x01a4, B:5:0x001f, B:51:0x010a, B:53:0x012d, B:55:0x013c, B:56:0x0155, B:58:0x015b, B:60:0x015f, B:71:0x0191, B:73:0x0199, B:74:0x019d, B:61:0x016b, B:63:0x0171, B:64:0x017b, B:68:0x0182, B:69:0x018b, B:70:0x018c, B:6:0x003f), top: B:196:0x001f, inners: #0, #5, #6, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0249 A[Catch: Exception -> 0x00fe, TryCatch #2 {Exception -> 0x00fe, blocks: (B:105:0x0251, B:10:0x004b, B:12:0x006e, B:14:0x007d, B:15:0x0096, B:19:0x00a7, B:21:0x00ab, B:29:0x00b6, B:40:0x00e8, B:42:0x00f0, B:43:0x00f5, B:27:0x00b2, B:30:0x00c2, B:32:0x00c8, B:33:0x00d2, B:37:0x00d9, B:38:0x00e2, B:39:0x00e3, B:79:0x01b0, B:81:0x01d0, B:83:0x01df, B:84:0x01f8, B:87:0x0207, B:89:0x020b, B:100:0x023d, B:102:0x0245, B:103:0x0249, B:90:0x0217, B:92:0x021d, B:93:0x0227, B:97:0x022e, B:98:0x0237, B:99:0x0238, B:75:0x01a4, B:5:0x001f, B:51:0x010a, B:53:0x012d, B:55:0x013c, B:56:0x0155, B:58:0x015b, B:60:0x015f, B:71:0x0191, B:73:0x0199, B:74:0x019d, B:61:0x016b, B:63:0x0171, B:64:0x017b, B:68:0x0182, B:69:0x018b, B:70:0x018c, B:6:0x003f), top: B:196:0x001f, inners: #0, #5, #6, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:180:0x03d4  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x03ea  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x03f6  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x03fb  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0407  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00f0 A[Catch: Exception -> 0x00fe, TryCatch #2 {Exception -> 0x00fe, blocks: (B:105:0x0251, B:10:0x004b, B:12:0x006e, B:14:0x007d, B:15:0x0096, B:19:0x00a7, B:21:0x00ab, B:29:0x00b6, B:40:0x00e8, B:42:0x00f0, B:43:0x00f5, B:27:0x00b2, B:30:0x00c2, B:32:0x00c8, B:33:0x00d2, B:37:0x00d9, B:38:0x00e2, B:39:0x00e3, B:79:0x01b0, B:81:0x01d0, B:83:0x01df, B:84:0x01f8, B:87:0x0207, B:89:0x020b, B:100:0x023d, B:102:0x0245, B:103:0x0249, B:90:0x0217, B:92:0x021d, B:93:0x0227, B:97:0x022e, B:98:0x0237, B:99:0x0238, B:75:0x01a4, B:5:0x001f, B:51:0x010a, B:53:0x012d, B:55:0x013c, B:56:0x0155, B:58:0x015b, B:60:0x015f, B:71:0x0191, B:73:0x0199, B:74:0x019d, B:61:0x016b, B:63:0x0171, B:64:0x017b, B:68:0x0182, B:69:0x018b, B:70:0x018c, B:6:0x003f), top: B:196:0x001f, inners: #0, #5, #6, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00f5 A[Catch: Exception -> 0x00fe, TRY_LEAVE, TryCatch #2 {Exception -> 0x00fe, blocks: (B:105:0x0251, B:10:0x004b, B:12:0x006e, B:14:0x007d, B:15:0x0096, B:19:0x00a7, B:21:0x00ab, B:29:0x00b6, B:40:0x00e8, B:42:0x00f0, B:43:0x00f5, B:27:0x00b2, B:30:0x00c2, B:32:0x00c8, B:33:0x00d2, B:37:0x00d9, B:38:0x00e2, B:39:0x00e3, B:79:0x01b0, B:81:0x01d0, B:83:0x01df, B:84:0x01f8, B:87:0x0207, B:89:0x020b, B:100:0x023d, B:102:0x0245, B:103:0x0249, B:90:0x0217, B:92:0x021d, B:93:0x0227, B:97:0x022e, B:98:0x0237, B:99:0x0238, B:75:0x01a4, B:5:0x001f, B:51:0x010a, B:53:0x012d, B:55:0x013c, B:56:0x0155, B:58:0x015b, B:60:0x015f, B:71:0x0191, B:73:0x0199, B:74:0x019d, B:61:0x016b, B:63:0x0171, B:64:0x017b, B:68:0x0182, B:69:0x018b, B:70:0x018c, B:6:0x003f), top: B:196:0x001f, inners: #0, #5, #6, #7 }] */
    @Override // o.InterfaceC0914Hl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int d(long r34, long r36) {
        /*
            Method dump skipped, instructions count: 1035
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C0921Hs.d(long, long):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00d1  */
    @Override // o.InterfaceC0914Hl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int d() {
        /*
            Method dump skipped, instructions count: 237
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C0921Hs.d():int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0097, code lost:
        if (r1.i != null) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x009c, code lost:
        if (r1.i != null) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x009e, code lost:
        r2 = new java.lang.Throwable(r1.b(), r1.i);
     */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00f8  */
    @Override // o.InterfaceC0914Hl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void c() {
        /*
            Method dump skipped, instructions count: 268
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C0921Hs.c():void");
    }

    private static void f(int i, char[] cArr, Object[] objArr) {
        int i2 = 2 % 2;
        C9570sA c9570sA = new C9570sA();
        c9570sA.c = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        c9570sA.b = 0;
        while (c9570sA.b < cArr.length) {
            int i3 = $11 + 79;
            $10 = i3 % 128;
            int i4 = i3 % 2;
            jArr[c9570sA.b] = (cArr[c9570sA.b] ^ (c9570sA.b * c9570sA.c)) ^ (b$s3$104 ^ 9155903258561237737L);
            c9570sA.b++;
        }
        char[] cArr2 = new char[length];
        c9570sA.b = 0;
        while (c9570sA.b < cArr.length) {
            int i5 = $11 + 121;
            $10 = i5 % 128;
            int i6 = i5 % 2;
            cArr2[c9570sA.b] = (char) jArr[c9570sA.b];
            c9570sA.b++;
            int i7 = $10 + 77;
            $11 = i7 % 128;
            if (i7 % 2 == 0) {
                int i8 = 3 / 4;
            }
        }
        objArr[0] = new String(cArr2);
    }
}
