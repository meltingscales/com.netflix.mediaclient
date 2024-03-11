package o;

import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.net.NetworkRequestType;
import com.netflix.mediaclient.service.webclient.model.leafs.LogoutResponse;
import java.util.List;
import o.C8632dsu;

/* renamed from: o.bqZ  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5003bqZ extends aZC<LogoutResponse> {
    public static final e a = new e(null);
    private final String d;
    private final b e;

    /* renamed from: o.bqZ$b */
    /* loaded from: classes4.dex */
    public interface b {
        void b(String str, Status status);

        void c(String str);
    }

    @Override // o.aZC
    public String M() {
        return this.d;
    }

    public C5003bqZ(b bVar) {
        C8632dsu.c((Object) bVar, "");
        this.e = bVar;
        String b2 = aZG.b.b("\nmutation StreamingAppLogout { streamingAppLogout {\n  ... on StreamingAppLogoutSuccess { message }\n  ... on StreamingAppLogoutFailure { reason }\n}}\n");
        this.d = b2;
        c(NetworkRequestType.STREAMING_APP_LOGOUT);
        C1044Mm.a("nf_LogoutRequest", "Query: %s ", b2);
    }

    /* renamed from: o.bqZ$e */
    /* loaded from: classes4.dex */
    public static final class e {
        public /* synthetic */ e(C8627dsp c8627dsp) {
            this();
        }

        private e() {
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.aZC
    /* renamed from: a */
    public LogoutResponse j(String str) {
        C8632dsu.c((Object) str, "");
        C1044Mm.a("nf_LogoutRequest", "String response to parse:  %s", str);
        try {
            return new LogoutResponse(str);
        } catch (Throwable th) {
            C1044Mm.b("nf_LogoutRequest", th, "Failed to get SSO token", new Object[0]);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.aZE
    /* renamed from: d */
    public void a(LogoutResponse logoutResponse) {
        String d;
        LogoutResponse.RootResponse rootResponse;
        LogoutResponse.RootResponse rootResponse2;
        LogoutResponse.Data data;
        LogoutResponse.StreamingAppLogout streamingAppLogout;
        LogoutResponse.RootResponse rootResponse3;
        LogoutResponse.Data data2;
        LogoutResponse.StreamingAppLogout streamingAppLogout2;
        List<LogoutResponse.Error> list = null;
        String str = (logoutResponse == null || (rootResponse3 = logoutResponse.response) == null || (data2 = rootResponse3.data) == null || (streamingAppLogout2 = data2.streamingAppLogout) == null) ? null : streamingAppLogout2.message;
        String str2 = (logoutResponse == null || (rootResponse2 = logoutResponse.response) == null || (data = rootResponse2.data) == null || (streamingAppLogout = data.streamingAppLogout) == null) ? null : streamingAppLogout.reason;
        if (logoutResponse != null && (rootResponse = logoutResponse.response) != null) {
            list = rootResponse.errors;
        }
        List<LogoutResponse.Error> list2 = list;
        C1044Mm.e("nf_LogoutRequest", "onSuccess:: message: " + str + ", reason: " + str2);
        if (list2 != null) {
            b bVar = this.e;
            d = C8576dqs.d(list2, "\n", null, null, 0, null, new drM<LogoutResponse.Error, CharSequence>() { // from class: com.netflix.mediaclient.service.user.volley.LogoutRequest$onSuccess$1
                @Override // o.drM
                /* renamed from: a */
                public final CharSequence invoke(LogoutResponse.Error error) {
                    String str3 = error.message;
                    C8632dsu.a(str3, "");
                    return str3;
                }
            }, 30, null);
            bVar.b(d, InterfaceC1078Nw.aj);
        } else if (str != null) {
            this.e.c(str);
        } else {
            this.e.b(str2, InterfaceC1078Nw.aj);
        }
    }

    @Override // o.aZE
    public void e(Status status) {
        if (status == null) {
            this.e.b(null, InterfaceC1078Nw.aj);
        } else {
            this.e.b(null, status);
        }
    }
}
