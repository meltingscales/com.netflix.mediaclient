package o;

import android.content.Context;
import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.net.NetworkRequestType;
import com.netflix.mediaclient.service.webclient.model.leafs.VoipCallConfigData;
import java.util.List;

/* renamed from: o.aSh  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
class C1897aSh extends aRV<VoipCallConfigData> {
    private List<String> a;
    private boolean d;
    private boolean e;
    private InterfaceC1832aPx k;

    @Override // o.AbstractC5039brI
    public List<String> L() {
        return this.a;
    }

    @Override // o.AbstractC5042brL
    public boolean O() {
        return this.e;
    }

    @Override // o.AbstractC5042brL
    public boolean X() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1897aSh(Context context, List<String> list, boolean z, boolean z2, InterfaceC1832aPx interfaceC1832aPx) {
        super(context);
        this.a = list;
        this.e = z;
        this.k = interfaceC1832aPx;
        this.d = z2;
    }

    @Override // o.AbstractC5042brL
    public String J() {
        StringBuilder sb = new StringBuilder();
        sb.append(C8179dfW.e("supportedSdks", "DIRECT"));
        sb.append(C8179dfW.e("loggedIn", this.d ? "true" : "false"));
        String a = C8284dhV.a();
        if (C8168dfL.h(a)) {
            sb.append(C8179dfW.e("nfvdid", a));
        }
        C1044Mm.a("nf_voip_config_data", "optional params: %s", sb.toString());
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC5039brI
    /* renamed from: a */
    public VoipCallConfigData e(String str, String str2) {
        return aRZ.a(str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC5042brL
    /* renamed from: c */
    public void a(VoipCallConfigData voipCallConfigData) {
        InterfaceC1832aPx interfaceC1832aPx = this.k;
        if (interfaceC1832aPx != null) {
            interfaceC1832aPx.c(voipCallConfigData, InterfaceC1078Nw.aJ);
        }
        this.k = null;
    }

    @Override // o.AbstractC5042brL
    public void d(Status status) {
        InterfaceC1832aPx interfaceC1832aPx = this.k;
        if (interfaceC1832aPx != null) {
            interfaceC1832aPx.c(null, status);
        }
        this.k = null;
    }

    @Override // com.netflix.android.volley.Request
    public Object y() {
        return NetworkRequestType.CONFIG_VOIP;
    }

    @Override // o.AbstractC5039brI, o.AbstractC5042brL
    public String a(String str) {
        String Z = Z();
        StringBuilder sb = new StringBuilder(str);
        sb.append(C8168dfL.d("method", K(), "?"));
        sb.append(Z);
        C8190dfh c8190dfh = (C8190dfh) ((AbstractC5039brI) this).h.c();
        for (String str2 : c8190dfh.keySet()) {
            for (String str3 : c8190dfh.c(str2)) {
                sb.append(C8168dfL.d(str2, str3, "&"));
            }
        }
        String J2 = J();
        if (C8168dfL.h(J2)) {
            sb.append(J2);
        }
        d(sb);
        String sb2 = sb.toString();
        C1044Mm.d("nf_voip_config_data", "FetchConfigDataWebRequest URL = %s", sb2);
        return sb2;
    }
}
