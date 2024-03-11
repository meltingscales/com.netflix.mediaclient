package o;

import android.content.Context;
import android.database.SQLException;
import com.google.gson.Gson;
import com.netflix.mediaclient.api.logging.error.ErrorType;
import java.io.Closeable;
import java.util.Map;
import o.InterfaceC1598aHf;
import o.InterfaceC1601aHi;

/* renamed from: o.Ho  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0917Ho extends C1045Mp implements InterfaceC0908Hf, Closeable {
    private final Gson a;
    private final C0915Hm d;
    private final C0916Hn e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0917Ho(Context context, Gson gson, C0916Hn c0916Hn) {
        super("SqliteDiskCache");
        Map d;
        Map k;
        Throwable th;
        C0915Hm c0915Hm;
        C8632dsu.c((Object) context, "");
        C8632dsu.c((Object) gson, "");
        C8632dsu.c((Object) c0916Hn, "");
        this.a = gson;
        this.e = c0916Hn;
        try {
            c0915Hm = new C0915Hm(new C0922Ht(context, c0916Hn));
        } catch (SQLException e) {
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
            c0915Hm = null;
        }
        this.d = c0915Hm;
    }

    @Override // o.InterfaceC0908Hf, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        C0915Hm c0915Hm = this.d;
        if (c0915Hm != null) {
            c0915Hm.e();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    @Override // o.InterfaceC0908Hf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public o.InterfaceC0912Hj d(long r19) {
        /*
            Method dump skipped, instructions count: 351
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C0917Ho.d(long):o.Hj");
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    @Override // o.InterfaceC0908Hf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public o.InterfaceC0913Hk c(long r21) {
        /*
            Method dump skipped, instructions count: 356
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C0917Ho.c(long):o.Hk");
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    @Override // o.InterfaceC0908Hf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public o.InterfaceC0909Hg e(long r18) {
        /*
            Method dump skipped, instructions count: 349
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C0917Ho.e(long):o.Hg");
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    @Override // o.InterfaceC0908Hf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public o.InterfaceC0914Hl b() {
        /*
            Method dump skipped, instructions count: 344
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C0917Ho.b():o.Hl");
    }
}
