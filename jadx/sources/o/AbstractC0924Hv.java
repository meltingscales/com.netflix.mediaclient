package o;

import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import com.netflix.mediaclient.api.logging.error.ErrorType;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import o.InterfaceC1598aHf;
import o.InterfaceC1601aHi;

/* renamed from: o.Hv  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC0924Hv<T> implements InterfaceC0911Hi {
    public static final c a = new c(null);
    private final List<T> b;
    private final AtomicBoolean c;
    private final C0915Hm d;
    private final long e;
    private final SQLiteDatabase f;
    private final String h;

    protected abstract void d(SQLiteStatement sQLiteStatement, T t, long j);

    public AbstractC0924Hv(C0915Hm c0915Hm, String str, long j) {
        C8632dsu.c((Object) c0915Hm, "");
        C8632dsu.c((Object) str, "");
        this.d = c0915Hm;
        this.h = str;
        this.e = j;
        this.f = c0915Hm.d();
        this.c = new AtomicBoolean(false);
        this.b = new ArrayList();
    }

    /* renamed from: o.Hv$c */
    /* loaded from: classes3.dex */
    public static final class c extends C1045Mp {
        public /* synthetic */ c(C8627dsp c8627dsp) {
            this();
        }

        private c() {
            super("SqliteDiskCacheTransaction");
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void b(T t) {
        C8632dsu.c((Object) t, "");
        this.b.add(t);
    }

    @Override // o.InterfaceC0911Hi
    public void b(boolean z) {
        Map d;
        Map k;
        Throwable th;
        Map d2;
        Map k2;
        Throwable th2;
        Map d3;
        Map k3;
        Throwable th3;
        Map d4;
        Map k4;
        Throwable th4;
        if (this.c.getAndSet(true)) {
            return;
        }
        if (!(!this.b.isEmpty())) {
            a.getLogTag();
            return;
        }
        List<T> list = this.b;
        if (z) {
            list = C8576dqs.U(list);
        }
        C0915Hm c0915Hm = this.d;
        long j = this.e;
        SQLiteDatabase d5 = c0915Hm.d();
        if (d5 != null) {
            try {
                try {
                    d5.beginTransaction();
                    SQLiteStatement compileStatement = d5.compileStatement(this.h);
                    for (T t : list) {
                        C8632dsu.d(compileStatement);
                        d(compileStatement, t, j);
                    }
                    a.getLogTag();
                    c0915Hm.getLogTag();
                    d5.setTransactionSuccessful();
                    try {
                        d5.endTransaction();
                        c0915Hm.getLogTag();
                        dpR dpr = dpR.c;
                    } catch (Exception e) {
                        InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
                        ErrorType errorType = ErrorType.n;
                        d4 = dqE.d();
                        k4 = dqE.k(d4);
                        C1596aHd c1596aHd = new C1596aHd(null, e, errorType, true, k4, false, false, 96, null);
                        ErrorType errorType2 = c1596aHd.a;
                        if (errorType2 != null) {
                            c1596aHd.e.put("errorType", errorType2.c());
                            String b = c1596aHd.b();
                            if (b != null) {
                                String c2 = errorType2.c();
                                c1596aHd.a(c2 + " " + b);
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
                } catch (Exception e2) {
                    InterfaceC1598aHf.c cVar2 = InterfaceC1598aHf.a;
                    ErrorType errorType3 = ErrorType.n;
                    d = dqE.d();
                    k = dqE.k(d);
                    C1596aHd c1596aHd2 = new C1596aHd(null, e2, errorType3, true, k, false, false, 96, null);
                    ErrorType errorType4 = c1596aHd2.a;
                    if (errorType4 != null) {
                        c1596aHd2.e.put("errorType", errorType4.c());
                        String b2 = c1596aHd2.b();
                        if (b2 != null) {
                            String c3 = errorType4.c();
                            c1596aHd2.a(c3 + " " + b2);
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
                        return;
                    } else {
                        dVar2.e().b(c1596aHd2, th);
                        return;
                    }
                }
            } catch (SQLException e3) {
                InterfaceC1598aHf.c cVar3 = InterfaceC1598aHf.a;
                ErrorType errorType5 = ErrorType.n;
                d2 = dqE.d();
                k2 = dqE.k(d2);
                C1596aHd c1596aHd3 = new C1596aHd(null, e3, errorType5, true, k2, false, false, 96, null);
                ErrorType errorType6 = c1596aHd3.a;
                if (errorType6 != null) {
                    c1596aHd3.e.put("errorType", errorType6.c());
                    String b3 = c1596aHd3.b();
                    if (b3 != null) {
                        String c4 = errorType6.c();
                        c1596aHd3.a(c4 + " " + b3);
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
                    a4.e(c1596aHd3, th2);
                } else {
                    dVar3.e().b(c1596aHd3, th2);
                }
                try {
                    d5.endTransaction();
                    c0915Hm.getLogTag();
                    dpR dpr2 = dpR.c;
                } catch (Exception e4) {
                    InterfaceC1598aHf.c cVar4 = InterfaceC1598aHf.a;
                    ErrorType errorType7 = ErrorType.n;
                    d3 = dqE.d();
                    k3 = dqE.k(d3);
                    C1596aHd c1596aHd4 = new C1596aHd(null, e4, errorType7, true, k3, false, false, 96, null);
                    ErrorType errorType8 = c1596aHd4.a;
                    if (errorType8 != null) {
                        c1596aHd4.e.put("errorType", errorType8.c());
                        String b4 = c1596aHd4.b();
                        if (b4 != null) {
                            String c5 = errorType8.c();
                            c1596aHd4.a(c5 + " " + b4);
                        }
                    }
                    if (c1596aHd4.b() != null && c1596aHd4.i != null) {
                        th3 = new Throwable(c1596aHd4.b(), c1596aHd4.i);
                    } else if (c1596aHd4.b() != null) {
                        th3 = new Throwable(c1596aHd4.b());
                    } else {
                        th3 = c1596aHd4.i;
                        if (th3 == null) {
                            th3 = new Throwable("Handled exception with no message");
                        } else if (th3 == null) {
                            throw new IllegalArgumentException("Required value was null.".toString());
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
            }
            c0915Hm.d(d5);
        }
    }

    @Override // o.InterfaceC0911Hi, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.c.getAndSet(true);
        this.d.d(this.f);
    }
}
