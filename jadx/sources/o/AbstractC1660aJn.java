package o;

import com.netflix.cl.model.SummaryStatistics;
import com.netflix.mediaclient.performance.api.capture.CaptureType;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: o.aJn  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC1660aJn {
    private InterfaceC1658aJl a;
    private boolean b;
    private final CaptureType c;

    public abstract void a();

    public final boolean b() {
        return this.b;
    }

    public JSONObject c() {
        return null;
    }

    public final CaptureType d() {
        return this.c;
    }

    public abstract boolean e();

    public void f() {
        this.b = true;
    }

    public void h() {
        this.b = false;
    }

    public abstract Map<String, SummaryStatistics> i();

    public AbstractC1660aJn(CaptureType captureType) {
        C8632dsu.c((Object) captureType, "");
        this.c = captureType;
    }

    public void j() {
        InterfaceC1658aJl interfaceC1658aJl = this.a;
        if (interfaceC1658aJl != null) {
            interfaceC1658aJl.a(this);
        }
    }
}
