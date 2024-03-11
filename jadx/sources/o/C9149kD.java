package o;

import android.util.Log;

/* renamed from: o.kD  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9149kD implements InterfaceC9200lB {
    public static final C9149kD d = new C9149kD();

    private C9149kD() {
    }

    @Override // o.InterfaceC9200lB
    public void c(String str) {
        Log.e("Bugsnag", str);
    }

    @Override // o.InterfaceC9200lB
    public void c(String str, Throwable th) {
        Log.e("Bugsnag", str, th);
    }

    @Override // o.InterfaceC9200lB
    public void d(String str) {
        Log.w("Bugsnag", str);
    }

    @Override // o.InterfaceC9200lB
    public void e(String str, Throwable th) {
        Log.w("Bugsnag", str, th);
    }

    @Override // o.InterfaceC9200lB
    public void a(String str) {
        Log.i("Bugsnag", str);
    }

    @Override // o.InterfaceC9200lB
    public void b(String str) {
        Log.d("Bugsnag", str);
    }

    @Override // o.InterfaceC9200lB
    public void d(String str, Throwable th) {
        Log.d("Bugsnag", str, th);
    }
}
