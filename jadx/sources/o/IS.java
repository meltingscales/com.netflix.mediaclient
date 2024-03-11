package o;

import android.text.TextUtils;
import com.netflix.android.volley.Request;
import com.netflix.mediaclient.android.app.Status;
import java.util.List;

/* loaded from: classes3.dex */
public abstract class IS extends IV {
    private final String g;
    private final boolean h;
    private final C0953Iy j;

    public IS(String str, C0954Iz<?> c0954Iz, IG ig, C0953Iy c0953Iy, String str2, boolean z, InterfaceC1757aNc interfaceC1757aNc) {
        super(str, c0954Iz, ig, interfaceC1757aNc);
        this.g = str2;
        this.h = z;
        this.j = c0953Iy;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.IT
    public Request.Priority b() {
        return this.h ? Request.Priority.LOW : super.b();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.IT
    public void f() {
        super.f();
        if (TextUtils.isEmpty(this.g) || !this.h) {
            return;
        }
        C1044Mm.a("BaseFetchDetailsTask", "Prefetch DP request in-flight for %s ", this.g);
        C1909aSt.e(this.g);
    }

    @Override // o.IT
    protected Object d() {
        return C1909aSt.a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.IT
    public void d(List<InterfaceC1242Ud> list) {
        if (this.h) {
            return;
        }
        C1909aSt.a(this.g);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.IT
    public void a(InterfaceC1757aNc interfaceC1757aNc, C1244Uf c1244Uf) {
        D();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.IT
    public void a(InterfaceC1757aNc interfaceC1757aNc, Status status) {
        D();
    }

    private final void D() {
        if (TextUtils.isEmpty(this.g) || !this.h) {
            return;
        }
        C1044Mm.a("BaseFetchDetailsTask", "Prefetch DP request in-flight for %s completed", this.g);
        C1909aSt.d(this.g);
        this.j.a();
    }
}
