package o;

import android.content.Context;
import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.net.NetworkRequestType;
import com.netflix.mediaclient.service.webclient.model.leafs.ConfigData;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: o.aSc  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C1892aSc extends aRV<ConfigData> {
    private final InterfaceC1813aPe a;
    private boolean d;
    private List<String> e;
    private final boolean l;

    @Override // o.AbstractC5039brI
    public List<String> L() {
        return this.e;
    }

    @Override // o.AbstractC5042brL
    public boolean O() {
        return this.d;
    }

    @Override // o.AbstractC5042brL
    public boolean X() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1892aSc(Context context, List<String> list, boolean z, InterfaceC1813aPe interfaceC1813aPe, boolean z2) {
        super(context);
        this.e = list;
        this.d = z;
        this.a = interfaceC1813aPe;
        this.l = z2;
    }

    @Override // com.netflix.android.volley.Request
    public Object y() {
        return NetworkRequestType.CONFIG;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC5039brI
    /* renamed from: c */
    public ConfigData e(String str, String str2) {
        return aRZ.e(((AbstractC5039brI) this).g, str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC5042brL
    /* renamed from: d */
    public void a(ConfigData configData) {
        InterfaceC1813aPe interfaceC1813aPe = this.a;
        if (interfaceC1813aPe != null) {
            interfaceC1813aPe.d(configData, InterfaceC1078Nw.aJ);
        }
    }

    @Override // o.AbstractC5042brL
    public void d(Status status) {
        InterfaceC1813aPe interfaceC1813aPe = this.a;
        if (interfaceC1813aPe != null) {
            interfaceC1813aPe.d(null, status);
        }
    }

    @Override // o.aRV, o.AbstractC5039brI, o.AbstractC5042brL, com.netflix.android.volley.Request
    public Map<String, String> j() {
        Map<String, String> j = super.j();
        if (j == null) {
            j = new HashMap<>();
        }
        aRZ.c(j, ((AbstractC5039brI) this).g, this.l);
        return j;
    }

    @Override // o.AbstractC5039brI, o.AbstractC5042brL
    public String a(String str) {
        String Z = Z();
        StringBuilder sb = new StringBuilder(str);
        sb.append(C8168dfL.d("method", K(), "?"));
        if (Q()) {
            sb.append(C8168dfL.d("materialize", "true", "&"));
        }
        sb.append(Z);
        C8190dfh c8190dfh = (C8190dfh) ((AbstractC5039brI) this).h.c();
        for (String str2 : c8190dfh.keySet()) {
            for (String str3 : c8190dfh.c(str2)) {
                sb.append(C8168dfL.d(str2, URLEncoder.encode(str3), "&"));
            }
        }
        String J2 = J();
        if (C8168dfL.h(J2)) {
            sb.append(J2);
        }
        d(sb);
        String sb2 = sb.toString();
        C1044Mm.d("nf_config_data", "FetchConfigDataWebRequest URL = %s", sb2);
        return sb2;
    }
}
