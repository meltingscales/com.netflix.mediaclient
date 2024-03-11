package o;

import android.content.Context;
import com.netflix.mediaclient.StatusCode;

/* renamed from: o.bMu  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C3845bMu implements InterfaceC1905aSp {
    private C1907aSr b;
    private Context d;

    @Override // o.InterfaceC1905aSp
    public C1907aSr a() {
        return this.b;
    }

    @Override // o.InterfaceC1905aSp
    public Runnable c() {
        return null;
    }

    @Override // o.InterfaceC1905aSp
    public int d() {
        return 0;
    }

    public C3845bMu(Context context, StatusCode statusCode, final boolean z) {
        this.d = context;
        this.b = new C1907aSr("", context.getString(com.netflix.mediaclient.ui.R.o.dl, Integer.valueOf(statusCode.getValue())), context.getString(com.netflix.mediaclient.ui.R.o.f13253fi), new Runnable() { // from class: o.bMu.3
            @Override // java.lang.Runnable
            public void run() {
                try {
                    C1044Mm.e("ErrorManager", "Waiting 1.5 second to exit app");
                    if (!z) {
                        wait(1500L);
                    }
                } catch (Exception e) {
                    C1044Mm.j("ErrorManager", "Wait is interrupted", e);
                }
                C1044Mm.e("ErrorManager", "Kill app");
                C8054ddD.e(C3845bMu.this.d);
            }
        });
    }
}
