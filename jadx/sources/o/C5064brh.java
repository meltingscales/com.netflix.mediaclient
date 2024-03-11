package o;

import android.content.Context;
import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.service.webclient.model.leafs.AccountData;
import com.netflix.mediaclient.servicemgr.NetflixDataRequest;
import java.util.List;
import java.util.Map;

/* renamed from: o.brh  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5064brh extends AbstractC1900aSk<AccountData> {
    public static final b d = new b(null);
    private final String a;
    private final InterfaceC4986bqI g;
    private final InterfaceC5284bvp j;

    @Override // o.AbstractC1902aSm
    public String e() {
        return "call";
    }

    @Override // o.AbstractC1902aSm
    public boolean h() {
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5064brh(Context context, NetflixDataRequest.Transport transport, String str, InterfaceC5284bvp interfaceC5284bvp, InterfaceC4986bqI interfaceC4986bqI) {
        super(context, transport, "UpdateUserProfileSubtitlesRequest");
        C8632dsu.c((Object) context, "");
        C8632dsu.c((Object) transport, "");
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) interfaceC5284bvp, "");
        C8632dsu.c((Object) interfaceC4986bqI, "");
        this.j = interfaceC5284bvp;
        this.g = interfaceC4986bqI;
        this.a = "[\"profiles\",\"" + str + "\",\"editSubtitles\"]";
    }

    /* renamed from: o.brh$b */
    /* loaded from: classes4.dex */
    public static final class b extends C1045Mp {
        public /* synthetic */ b(C8627dsp c8627dsp) {
            this();
        }

        private b() {
            super("nf_service_user_profile_subtitles_request");
        }
    }

    @Override // o.AbstractC1902aSm
    public List<String> c() {
        List<String> e;
        e = C8566dqi.e(this.a);
        return e;
    }

    @Override // o.AbstractC1902aSm
    public Map<String, String> b() {
        Map<String, String> b2 = super.b();
        C8632dsu.d(b2);
        b2.put("param", this.j.toJsonObject().toString());
        if (C8153dex.C()) {
            b2.put("enableKidsBrandRealignment", "true");
        }
        return b2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC1902aSm
    /* renamed from: a */
    public void b(AccountData accountData) {
        this.g.e(accountData, InterfaceC1078Nw.aJ);
    }

    @Override // o.AbstractC1902aSm
    public void e(Status status) {
        C8632dsu.c((Object) status, "");
        this.g.e((AccountData) null, status);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC1902aSm
    /* renamed from: c */
    public AccountData e(String str, String str2) {
        C8632dsu.c((Object) str, "");
        d.getLogTag();
        AccountData b2 = C5062brf.b(str, false);
        C8632dsu.a(b2, "");
        return b2;
    }
}
