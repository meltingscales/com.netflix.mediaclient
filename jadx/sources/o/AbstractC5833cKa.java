package o;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import com.netflix.cl.model.AppView;
import com.netflix.cl.model.TrackingInfo;
import com.netflix.cl.model.context.CLContext;
import o.C5838cKf;
import org.json.JSONObject;

/* renamed from: o.cKa  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC5833cKa {
    private final ColorDrawable b;
    private C5838cKf.b c;
    private final Runnable d;
    private boolean e;

    public abstract TrackingInfo a(JSONObject jSONObject);

    public abstract InterfaceC5281bvm a();

    public final void a(boolean z) {
        this.e = z;
    }

    public abstract Integer b();

    public abstract String c();

    public abstract Integer d();

    public final void e(int i) {
    }

    public final void e(C5838cKf.b bVar) {
        this.c = bVar;
    }

    public abstract boolean e();

    public CLContext f() {
        return null;
    }

    public JSONObject g() {
        return null;
    }

    public abstract View i();

    public abstract InterfaceC5177bto j();

    public void k() {
    }

    public final boolean l() {
        return this.e;
    }

    public AbstractC5833cKa() {
        boolean z = C5838cKf.b;
        this.b = z ? new ColorDrawable(Color.argb(200, 0, 0, 0)) : null;
        this.d = z ? new Runnable() { // from class: o.cKj
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC5833cKa.b(AbstractC5833cKa.this);
            }
        } : null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(AbstractC5833cKa abstractC5833cKa) {
        C8632dsu.c((Object) abstractC5833cKa, "");
        abstractC5833cKa.i().setForeground(null);
    }

    public AppView h() {
        return AppView.boxArt;
    }

    public final void o() {
        C5838cKf.b bVar = this.c;
        if (bVar != null) {
            C8187dfe.e(bVar);
            this.c = null;
        }
    }
}
