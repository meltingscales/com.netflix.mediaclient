package o;

import android.util.Log;
import java.util.HashSet;
import java.util.Set;

/* renamed from: o.eY  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C8852eY implements InterfaceC6584cg {
    private static final Set<String> a = new HashSet();

    @Override // o.InterfaceC6584cg
    public void b(String str) {
        c(str, null);
    }

    public void c(String str, Throwable th) {
        if (C3550bC.a) {
            Log.d("LOTTIE", str, th);
        }
    }

    @Override // o.InterfaceC6584cg
    public void d(String str) {
        d(str, null);
    }

    @Override // o.InterfaceC6584cg
    public void d(String str, Throwable th) {
        Set<String> set = a;
        if (set.contains(str)) {
            return;
        }
        Log.w("LOTTIE", str, th);
        set.add(str);
    }

    @Override // o.InterfaceC6584cg
    public void b(String str, Throwable th) {
        if (C3550bC.a) {
            Log.d("LOTTIE", str, th);
        }
    }
}
