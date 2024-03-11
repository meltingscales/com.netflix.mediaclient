package o;

import android.database.sqlite.SQLiteDatabase;
import android.os.Handler;
import android.os.HandlerThread;
import com.netflix.mediaclient.api.logging.error.ErrorType;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import o.C0915Hm;
import o.InterfaceC1598aHf;
import o.InterfaceC1601aHi;

/* renamed from: o.Hm  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0915Hm extends C1045Mp {
    private int a;
    private final InterfaceC8554dpx b;
    private final C0922Ht c;
    private final InterfaceC8554dpx d;
    private final AtomicBoolean e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0915Hm(C0922Ht c0922Ht) {
        super("SqliteDb");
        InterfaceC8554dpx b;
        InterfaceC8554dpx b2;
        C8632dsu.c((Object) c0922Ht, "");
        this.c = c0922Ht;
        b = dpB.b(new drO<HandlerThread>() { // from class: com.netflix.falcor.impl.cache.sqlite.SqliteDb$sqlWriteHandlerThread$2
            @Override // o.drO
            /* renamed from: d */
            public final HandlerThread invoke() {
                return new HandlerThread("falcor-SqlDiskCacheWriter");
            }
        });
        this.d = b;
        b2 = dpB.b(new drO<Handler>() { // from class: com.netflix.falcor.impl.cache.sqlite.SqliteDb$sqlWriteHandler$2
            {
                super(0);
            }

            @Override // o.drO
            /* renamed from: b */
            public final Handler invoke() {
                HandlerThread g;
                g = C0915Hm.this.g();
                g.start();
                return new Handler(g.getLooper());
            }
        });
        this.b = b2;
        this.e = new AtomicBoolean(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final HandlerThread g() {
        return (HandlerThread) this.d.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Handler b() {
        return (Handler) this.b.getValue();
    }

    public final boolean c() {
        return !this.e.get();
    }

    public final SQLiteDatabase a() {
        Map d;
        Map k;
        Throwable th;
        SQLiteDatabase sQLiteDatabase;
        boolean z;
        synchronized (this) {
            getLogTag();
            try {
                sQLiteDatabase = this.c.getReadableDatabase();
                z = this.e.get();
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
                        c1596aHd.a(errorType2.c() + " " + b);
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
            if (sQLiteDatabase != null && sQLiteDatabase.isOpen() && (!z)) {
                this.a++;
                getLogTag();
            }
            sQLiteDatabase = null;
        }
        return sQLiteDatabase;
    }

    public final SQLiteDatabase d() {
        Map d;
        Map k;
        Throwable th;
        SQLiteDatabase sQLiteDatabase;
        boolean z;
        synchronized (this) {
            getLogTag();
            try {
                sQLiteDatabase = this.c.getWritableDatabase();
                z = this.e.get();
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
                        c1596aHd.a(errorType2.c() + " " + b);
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
            if (sQLiteDatabase != null && sQLiteDatabase.isOpen() && (!z)) {
                this.a++;
                getLogTag();
            }
            sQLiteDatabase = null;
        }
        return sQLiteDatabase;
    }

    public final void d(SQLiteDatabase sQLiteDatabase) {
        synchronized (this) {
            if (sQLiteDatabase != null) {
                this.a--;
                getLogTag();
                if (this.a <= 0 && this.e.get()) {
                    getLogTag();
                    this.c.close();
                }
            }
        }
    }

    public final void e() {
        synchronized (this) {
            getLogTag();
            this.e.set(true);
            if (this.a <= 0) {
                getLogTag();
                this.c.close();
            }
        }
    }
}
