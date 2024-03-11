package o;

import com.netflix.android.volley.Request;
import com.netflix.mediaclient.android.app.Status;
import java.util.ArrayList;
import java.util.List;
import o.C8143den;

/* renamed from: o.Km  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C0993Km extends IT {
    private final String f;
    private final String g;

    @Override // o.IT
    protected boolean u() {
        return true;
    }

    @Override // o.IT
    protected boolean x() {
        return true;
    }

    public <T extends InterfaceC0943Io> C0993Km(C0954Iz<?> c0954Iz, String str, String str2, InterfaceC1757aNc interfaceC1757aNc) {
        super("LogPrePlayImpression", c0954Iz, interfaceC1757aNc);
        this.f = str;
        this.g = str2;
    }

    @Override // o.IT
    protected void d(List<InterfaceC1242Ud> list) {
        list.add(IE.b("prePlay", this.f, "prePlayImpression"));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.IT
    public Request.Priority b() {
        return Request.Priority.LOW;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.IT
    public List<C8143den.d> c() {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(new C8143den.d("impressionData", this.g));
        return arrayList;
    }

    @Override // o.IT
    protected void a(InterfaceC1757aNc interfaceC1757aNc, C1244Uf c1244Uf) {
        interfaceC1757aNc.a(true, (Status) InterfaceC1078Nw.aJ);
    }

    @Override // o.IT
    protected void a(InterfaceC1757aNc interfaceC1757aNc, Status status) {
        interfaceC1757aNc.a(false, status);
    }
}
