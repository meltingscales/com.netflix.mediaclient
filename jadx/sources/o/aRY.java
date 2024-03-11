package o;

import android.content.Context;
import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.net.NetworkRequestType;
import com.netflix.mediaclient.service.webclient.model.leafs.ConfigData;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
class aRY extends aRX<ConfigData> {
    private final List<String> a;
    private final InterfaceC1813aPe d;
    private final Context e;
    private final boolean y;

    @Override // o.AbstractC2100aZw
    public List<String> J() {
        return this.a;
    }

    @Override // o.aRX
    protected String S() {
        return "FetchConfigDataMslRequest";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public aRY(Context context, List<String> list, InterfaceC1813aPe interfaceC1813aPe, boolean z) {
        this.e = context;
        this.a = list;
        this.d = interfaceC1813aPe;
        this.y = z;
    }

    @Override // o.aRX, com.netflix.android.volley.Request
    public Object y() {
        return NetworkRequestType.CONFIG;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC2100aZw
    /* renamed from: i */
    public ConfigData a(String str) {
        return aRZ.e(this.e, str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.aZE
    /* renamed from: b */
    public void a(ConfigData configData) {
        InterfaceC1813aPe interfaceC1813aPe = this.d;
        if (interfaceC1813aPe != null) {
            interfaceC1813aPe.d(configData, InterfaceC1078Nw.aJ);
        }
    }

    @Override // o.aZE
    public void e(Status status) {
        InterfaceC1813aPe interfaceC1813aPe = this.d;
        if (interfaceC1813aPe != null) {
            interfaceC1813aPe.d(null, status);
        }
    }

    @Override // o.aRX, o.aZE, com.netflix.android.volley.Request
    public Map<String, String> j() {
        Map<String, String> j = super.j();
        aRZ.c(j, this.e, this.y);
        return j;
    }
}
