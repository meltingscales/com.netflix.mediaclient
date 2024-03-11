package o;

import android.content.Context;
import android.net.ConnectivityManager;
import kotlin.Result;

/* renamed from: o.kG  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9152kG implements InterfaceC9147kB {
    private final InterfaceC9147kB a;
    private final ConnectivityManager b;

    public C9152kG(Context context, drX<? super Boolean, ? super String, dpR> drx) {
        InterfaceC9147kB c9146kA;
        ConnectivityManager b = C9148kC.b(context);
        this.b = b;
        if (b == null) {
            c9146kA = C9290mm.e;
        } else {
            c9146kA = new C9146kA(b, drx);
        }
        this.a = c9146kA;
    }

    @Override // o.InterfaceC9147kB
    public void e() {
        try {
            Result.c cVar = Result.e;
            this.a.e();
            Result.e(dpR.c);
        } catch (Throwable th) {
            Result.c cVar2 = Result.e;
            Result.e(C8556dpz.a(th));
        }
    }

    @Override // o.InterfaceC9147kB
    public boolean c() {
        Object e;
        try {
            Result.c cVar = Result.e;
            e = Result.e(Boolean.valueOf(this.a.c()));
        } catch (Throwable th) {
            Result.c cVar2 = Result.e;
            e = Result.e(C8556dpz.a(th));
        }
        if (Result.d(e) != null) {
            e = Boolean.TRUE;
        }
        return ((Boolean) e).booleanValue();
    }

    @Override // o.InterfaceC9147kB
    public String b() {
        Object e;
        try {
            Result.c cVar = Result.e;
            e = Result.e(this.a.b());
        } catch (Throwable th) {
            Result.c cVar2 = Result.e;
            e = Result.e(C8556dpz.a(th));
        }
        if (Result.d(e) != null) {
            e = "unknown";
        }
        return (String) e;
    }
}
