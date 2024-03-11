package o;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import android.os.Handler;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.netflix.falcor.impl.cache.sqlite.LeafRecordType;
import com.netflix.mediaclient.api.logging.error.ErrorType;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import o.InterfaceC1598aHf;
import o.InterfaceC1601aHi;

/* renamed from: o.Hr  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0920Hr implements InterfaceC0912Hj {
    public static final e c = new e(null);
    private final List<Integer> a;
    private final long b;
    private final C0916Hn e;
    private final C0915Hm f;
    private final SQLiteDatabase h;
    private final List<Integer> j;

    /* renamed from: o.Hr$b */
    /* loaded from: classes3.dex */
    public final /* synthetic */ class b {
        public static final /* synthetic */ int[] d;

        static {
            int[] iArr = new int[LeafRecordType.values().length];
            try {
                iArr[LeafRecordType.ATOM_STRING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LeafRecordType.ATOM_NUMBER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[LeafRecordType.ATOM_BOOLEAN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[LeafRecordType.ATOM_NULL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[LeafRecordType.ATOM_JSON.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[LeafRecordType.REF.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[LeafRecordType.UNDEFINED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[LeafRecordType.ERROR.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[LeafRecordType.LEAFY_OBJECT.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            d = iArr;
        }
    }

    public C0920Hr(C0915Hm c0915Hm, C0916Hn c0916Hn, long j) {
        C8632dsu.c((Object) c0915Hm, "");
        C8632dsu.c((Object) c0916Hn, "");
        this.f = c0915Hm;
        this.e = c0916Hn;
        this.b = j;
        SQLiteDatabase a = c0915Hm.a();
        this.h = a;
        if (a != null) {
            a.beginTransaction();
        }
        this.j = new ArrayList();
        this.a = new ArrayList();
    }

    /* renamed from: o.Hr$e */
    /* loaded from: classes3.dex */
    public static final class e extends C1045Mp {
        public /* synthetic */ e(C8627dsp c8627dsp) {
            this();
        }

        private e() {
            super("SqliteDiskCacheReader");
        }
    }

    /* renamed from: o.Hr$c */
    /* loaded from: classes3.dex */
    public static final class c implements Runnable {
        final /* synthetic */ List b;
        final /* synthetic */ SQLiteDatabase c;
        final /* synthetic */ long d;
        final /* synthetic */ C0915Hm e;

        public c(C0915Hm c0915Hm, SQLiteDatabase sQLiteDatabase, long j, List list) {
            this.e = c0915Hm;
            this.c = sQLiteDatabase;
            this.d = j;
            this.b = list;
        }

        @Override // java.lang.Runnable
        public final void run() {
            Map d;
            Map k;
            Throwable th;
            C0915Hm c0915Hm = this.e;
            SQLiteDatabase sQLiteDatabase = this.c;
            long j = this.d;
            if (sQLiteDatabase != null) {
                try {
                    SQLiteStatement compileStatement = sQLiteDatabase.compileStatement("UPDATE falcor_leafs SET access_time = ? WHERE path_hashcode = ?");
                    for (Number number : this.b) {
                        int intValue = number.intValue();
                        compileStatement.bindLong(1, j);
                        compileStatement.bindLong(2, intValue);
                        compileStatement.executeUpdateDelete();
                    }
                    c0915Hm.d(sQLiteDatabase);
                } catch (Exception e) {
                    InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
                    ErrorType errorType = ErrorType.n;
                    d = dqE.d();
                    k = dqE.k(d);
                    C1596aHd c1596aHd = new C1596aHd(null, e, errorType, true, k, false, false, 96, null);
                    ErrorType errorType2 = c1596aHd.a;
                    if (errorType2 != null) {
                        c1596aHd.e.put("errorType", errorType2.c());
                        String b = c1596aHd.b();
                        if (b != null) {
                            String c = errorType2.c();
                            c1596aHd.a(c + " " + b);
                        }
                    }
                    if (c1596aHd.b() != null && c1596aHd.i != null) {
                        th = new Throwable(c1596aHd.b(), c1596aHd.i);
                    } else if (c1596aHd.b() != null) {
                        th = new Throwable(c1596aHd.b());
                    } else {
                        th = c1596aHd.i;
                        if (th == null) {
                            th = new Throwable("Handled exception with no message");
                        } else if (th == null) {
                            throw new IllegalArgumentException("Required value was null.".toString());
                        }
                    }
                    InterfaceC1601aHi.d dVar = InterfaceC1601aHi.c;
                    InterfaceC1598aHf a = dVar.a();
                    if (a != null) {
                        a.e(c1596aHd, th);
                    } else {
                        dVar.e().b(c1596aHd, th);
                    }
                }
            }
        }
    }

    /* renamed from: o.Hr$d */
    /* loaded from: classes3.dex */
    public static final class d implements Runnable {
        final /* synthetic */ long a;
        final /* synthetic */ List b;
        final /* synthetic */ SQLiteDatabase c;
        final /* synthetic */ C0915Hm d;

        public d(C0915Hm c0915Hm, SQLiteDatabase sQLiteDatabase, long j, List list) {
            this.d = c0915Hm;
            this.c = sQLiteDatabase;
            this.a = j;
            this.b = list;
        }

        @Override // java.lang.Runnable
        public final void run() {
            Map d;
            Map k;
            Throwable th;
            C0915Hm c0915Hm = this.d;
            SQLiteDatabase sQLiteDatabase = this.c;
            if (sQLiteDatabase != null) {
                try {
                    SQLiteStatement compileStatement = sQLiteDatabase.compileStatement("DELETE FROM falcor_leafs  WHERE path_hashcode = ?");
                    for (Number number : this.b) {
                        compileStatement.bindLong(1, number.intValue());
                        compileStatement.executeUpdateDelete();
                    }
                    c0915Hm.d(sQLiteDatabase);
                } catch (Exception e) {
                    InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
                    ErrorType errorType = ErrorType.n;
                    d = dqE.d();
                    k = dqE.k(d);
                    C1596aHd c1596aHd = new C1596aHd(null, e, errorType, true, k, false, false, 96, null);
                    ErrorType errorType2 = c1596aHd.a;
                    if (errorType2 != null) {
                        c1596aHd.e.put("errorType", errorType2.c());
                        String b = c1596aHd.b();
                        if (b != null) {
                            String c = errorType2.c();
                            c1596aHd.a(c + " " + b);
                        }
                    }
                    if (c1596aHd.b() != null && c1596aHd.i != null) {
                        th = new Throwable(c1596aHd.b(), c1596aHd.i);
                    } else if (c1596aHd.b() != null) {
                        th = new Throwable(c1596aHd.b());
                    } else {
                        th = c1596aHd.i;
                        if (th == null) {
                            th = new Throwable("Handled exception with no message");
                        } else if (th == null) {
                            throw new IllegalArgumentException("Required value was null.".toString());
                        }
                    }
                    InterfaceC1601aHi.d dVar = InterfaceC1601aHi.c;
                    InterfaceC1598aHf a = dVar.a();
                    if (a != null) {
                        a.e(c1596aHd, th);
                    } else {
                        dVar.e().b(c1596aHd, th);
                    }
                }
            }
        }
    }

    private final String a(String str, int i) {
        String c2;
        Map d2;
        Map k;
        Throwable th;
        if (i < 1) {
            InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
            d2 = dqE.d();
            k = dqE.k(d2);
            C1596aHd c1596aHd = new C1596aHd("SqliteDiskCacheReader.constructQueryString: Wrong argument < 1.", null, null, true, k, false, false, 96, null);
            ErrorType errorType = c1596aHd.a;
            if (errorType != null) {
                c1596aHd.e.put("errorType", errorType.c());
                String b2 = c1596aHd.b();
                if (b2 != null) {
                    String c3 = errorType.c();
                    c1596aHd.a(c3 + " " + b2);
                }
            }
            if (c1596aHd.b() != null && c1596aHd.i != null) {
                th = new Throwable(c1596aHd.b(), c1596aHd.i);
            } else if (c1596aHd.b() != null) {
                th = new Throwable(c1596aHd.b());
            } else {
                th = c1596aHd.i;
                if (th == null) {
                    th = new Throwable("Handled exception with no message");
                } else if (th == null) {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
            }
            InterfaceC1601aHi.d dVar = InterfaceC1601aHi.c;
            InterfaceC1598aHf a = dVar.a();
            if (a != null) {
                a.e(c1596aHd, th);
            } else {
                dVar.e().b(c1596aHd, th);
            }
            return "SELECT path_hashcode, type, expires, timestamp, size, write_time, value FROM falcor_leafs WHERE path = ?";
        }
        c2 = C8691duz.c(",?", i);
        return str + c2 + ")";
    }

    private final HZ a(String str, int i, LeafRecordType leafRecordType, Long l, Long l2, Integer num, long j, String str2) {
        HZ hm;
        Map d2;
        Map k;
        Throwable th;
        String str3 = str2;
        switch (b.d[leafRecordType.ordinal()]) {
            case 1:
                if (str3 != null) {
                    return new HW(str3);
                }
                return new HM("string cannot be null", null, null, null, 14, null);
            case 2:
                if (str3 != null) {
                    Number c2 = C0919Hq.c(str2);
                    if (c2 != null) {
                        return HP.a(c2);
                    }
                    hm = new HM("Cannot parser number from string: '" + str3 + "'", null, null, null, 14, null);
                    break;
                } else {
                    return new HM("number cannot be null", null, null, null, 14, null);
                }
            case 3:
                return new HN(str3 != null ? Boolean.parseBoolean(str2) : false);
            case 4:
                return HQ.a;
            case 5:
                if (str3 != null) {
                    JsonElement parse = new JsonParser().parse(str3);
                    C8632dsu.d(parse);
                    return new HH(parse, l, l2, num, Long.valueOf(j), false, 32, null);
                }
                return new HM("atom json value cannot be null", null, null, null, 14, null);
            case 6:
                if (str3 != null) {
                    AbstractC0935Ig<GW> d3 = GV.d(str2);
                    if (d3 != null) {
                        hm = new HX(d3, l, l2, num);
                        break;
                    } else {
                        hm = new HM("reference: cannot parse path: '" + str3 + "'", null, null, null, 14, null);
                        break;
                    }
                } else {
                    return new HM("reference: path is null", null, null, null, 14, null);
                }
            case 7:
                hm = new HV(l);
                break;
            case 8:
                if (str3 == null) {
                    str3 = "null";
                }
                return new HM(str3, l, l2, num);
            case 9:
                if (str3 != null) {
                    try {
                        return HB.a(false, 1, null).e(str3);
                    } catch (Exception e2) {
                        String str4 = "error while parsing json: path: " + str + ", error:  " + e2 + "\n" + str3;
                        InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
                        ErrorType errorType = ErrorType.n;
                        d2 = dqE.d();
                        k = dqE.k(d2);
                        C1596aHd c1596aHd = new C1596aHd(null, e2, errorType, true, k, false, false, 96, null);
                        ErrorType errorType2 = c1596aHd.a;
                        if (errorType2 != null) {
                            c1596aHd.e.put("errorType", errorType2.c());
                            String b2 = c1596aHd.b();
                            if (b2 != null) {
                                c1596aHd.a(errorType2.c() + " " + b2);
                            }
                        }
                        if (c1596aHd.b() != null && c1596aHd.i != null) {
                            th = new Throwable(c1596aHd.b(), c1596aHd.i);
                        } else if (c1596aHd.b() != null) {
                            th = new Throwable(c1596aHd.b());
                        } else {
                            th = c1596aHd.i;
                            if (th == null) {
                                th = new Throwable("Handled exception with no message");
                            } else if (th == null) {
                                throw new IllegalArgumentException("Required value was null.".toString());
                            }
                        }
                        InterfaceC1601aHi.d dVar = InterfaceC1601aHi.c;
                        InterfaceC1598aHf a = dVar.a();
                        if (a != null) {
                            a.e(c1596aHd, th);
                        } else {
                            dVar.e().b(c1596aHd, th);
                        }
                        hm = new HM(str4, null, null, null, 14, null);
                        break;
                    }
                } else {
                    return new HM("leafy object value is null", null, null, null, 14, null);
                }
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        return hm;
    }

    private final void c(List<Integer> list, long j) {
        C0915Hm c0915Hm;
        SQLiteDatabase d2;
        Handler b2;
        if (!(!list.isEmpty()) || (d2 = (c0915Hm = this.f).d()) == null) {
            return;
        }
        b2 = c0915Hm.b();
        b2.post(new d(c0915Hm, d2, j, list));
    }

    private final void a(List<Integer> list, long j) {
        C0915Hm c0915Hm;
        SQLiteDatabase d2;
        Handler b2;
        if (!(!list.isEmpty()) || (d2 = (c0915Hm = this.f).d()) == null) {
            return;
        }
        b2 = c0915Hm.b();
        b2.post(new c(c0915Hm, d2, j, list));
    }

    @Override // o.InterfaceC0912Hj, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        Throwable th;
        Throwable th2;
        synchronized (this) {
            SQLiteDatabase sQLiteDatabase = this.h;
            if (sQLiteDatabase != null) {
                if (sQLiteDatabase.isOpen()) {
                    sQLiteDatabase.endTransaction();
                    if (this.f.c()) {
                        a(this.j, this.b);
                        c(this.a, this.b);
                        this.f.d(sQLiteDatabase);
                    } else {
                        InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
                        C1596aHd b2 = new C1596aHd("Trying to close already closed DB for SqliteDiskCacheReade when readableDb was still open?", null, null, false, null, false, false, 126, null).b(ErrorType.n).b(false);
                        ErrorType errorType = b2.a;
                        if (errorType != null) {
                            b2.e.put("errorType", errorType.c());
                            String b3 = b2.b();
                            if (b3 != null) {
                                String c2 = errorType.c();
                                b2.a(c2 + " " + b3);
                            }
                        }
                        if (b2.b() != null && b2.i != null) {
                            th2 = new Throwable(b2.b(), b2.i);
                        } else if (b2.b() != null) {
                            th2 = new Throwable(b2.b());
                        } else {
                            th2 = b2.i;
                            if (th2 == null) {
                                th2 = new Throwable("Handled exception with no message");
                            } else if (th2 == null) {
                                throw new IllegalArgumentException("Required value was null.".toString());
                            }
                        }
                        InterfaceC1601aHi.d dVar = InterfaceC1601aHi.c;
                        InterfaceC1598aHf a = dVar.a();
                        if (a != null) {
                            a.e(b2, th2);
                        } else {
                            dVar.e().b(b2, th2);
                        }
                    }
                } else {
                    InterfaceC1598aHf.c cVar2 = InterfaceC1598aHf.a;
                    C1596aHd b4 = new C1596aHd("Trying to close already closed DB for SqliteDiskCacheReader", null, null, false, null, false, false, 126, null).b(ErrorType.n).b(false);
                    ErrorType errorType2 = b4.a;
                    if (errorType2 != null) {
                        b4.e.put("errorType", errorType2.c());
                        String b5 = b4.b();
                        if (b5 != null) {
                            String c3 = errorType2.c();
                            b4.a(c3 + " " + b5);
                        }
                    }
                    if (b4.b() != null && b4.i != null) {
                        th = new Throwable(b4.b(), b4.i);
                    } else if (b4.b() != null) {
                        th = new Throwable(b4.b());
                    } else {
                        th = b4.i;
                        if (th == null) {
                            th = new Throwable("Handled exception with no message");
                        } else if (th == null) {
                            throw new IllegalArgumentException("Required value was null.".toString());
                        }
                    }
                    InterfaceC1601aHi.d dVar2 = InterfaceC1601aHi.c;
                    InterfaceC1598aHf a2 = dVar2.a();
                    if (a2 != null) {
                        a2.e(b4, th);
                    } else {
                        dVar2.e().b(b4, th);
                    }
                }
            }
        }
    }

    private final Integer c(Cursor cursor, int i) {
        if (cursor.isNull(i)) {
            return null;
        }
        return Integer.valueOf(cursor.getInt(i));
    }

    private final Long a(Cursor cursor, int i) {
        if (cursor.isNull(i)) {
            return null;
        }
        return Long.valueOf(cursor.getLong(i));
    }

    private final String b(Cursor cursor, int i) {
        if (cursor.isNull(i)) {
            return null;
        }
        return cursor.getString(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00df A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r13v0, types: [java.lang.Throwable] */
    @Override // o.InterfaceC0912Hj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.util.Map<java.lang.String, o.HZ> e(java.util.List<java.lang.String> r27, o.InterfaceC0906Hd r28) {
        /*
            Method dump skipped, instructions count: 444
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C0920Hr.e(java.util.List, o.Hd):java.util.Map");
    }
}
