package o;

import com.google.gson.JsonSyntaxException;
import com.netflix.mediaclient.service.configuration.persistent.fastproperty.Config_FastProperty_Ddr;
import com.netflix.mediaclient.service.user.UserAgent;
import com.netflix.mediaclient.servicemgr.ZuulAgent;
import dagger.assisted.Assisted;
import dagger.assisted.AssistedInject;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class aWF implements aWC {
    public static final c b = new c(null);
    private final UserAgent a;
    private final ZuulAgent d;
    private final aWA e;
    private final b h;
    private String i;

    private final void d(JSONObject jSONObject) {
    }

    @AssistedInject
    public aWF(@Assisted ZuulAgent zuulAgent, @Assisted UserAgent userAgent, @Assisted aWA awa) {
        C8632dsu.c((Object) zuulAgent, "");
        C8632dsu.c((Object) userAgent, "");
        C8632dsu.c((Object) awa, "");
        this.d = zuulAgent;
        this.a = userAgent;
        this.e = awa;
        b bVar = new b();
        this.h = bVar;
        C1044Mm.e("nf_ddr", "DdrManagerImpl:: created...");
        zuulAgent.d(bVar);
    }

    public final boolean d(String str) {
        JSONObject optJSONObject;
        C8632dsu.c((Object) str, "");
        try {
            optJSONObject = new JSONObject(str).optJSONObject("payload");
        } catch (JsonSyntaxException unused) {
        }
        if (optJSONObject != null && C8632dsu.c((Object) optJSONObject.optString("category"), (Object) "zuulDDRMsg")) {
            String optString = optJSONObject.optString("type");
            if (optString != null) {
                int hashCode = optString.hashCode();
                if (hashCode != 112346427) {
                    if (hashCode != 1564404406) {
                        if (hashCode == 2085799616 && optString.equals("zuulinfo")) {
                            c(str);
                            return true;
                        }
                    } else if (optString.equals("challengeOpStatus")) {
                        d(optJSONObject);
                        return true;
                    }
                } else if (optString.equals("challengeReq")) {
                    e(str);
                    return true;
                }
            }
            C1044Mm.a("nf_ddr", "unsupported DDR message. type=" + optString);
            return false;
        }
        C1044Mm.j("nf_ddr", "unsupported by DDR = " + str);
        return false;
    }

    private final void c(String str) {
        String e = C2020aWx.c.e(str);
        if (e != null) {
            this.i = e;
        }
    }

    private final void e(String str) {
        if (Config_FastProperty_Ddr.Companion.d()) {
            C2022aWz c2 = C2020aWx.c.c(str);
            if (c2 != null) {
                C1044Mm.a("nf_ddr", "calling sendAssociateRequest2");
                this.e.d(c2);
                return;
            }
            return;
        }
        C2022aWz a = C2020aWx.c.a(str);
        if (a != null) {
            C1044Mm.a("nf_ddr", "calling sendAssociateRequest");
            this.e.d(a);
        }
    }

    @Override // o.aWC
    public boolean c(JSONObject jSONObject) {
        C8632dsu.c((Object) jSONObject, "");
        String optString = jSONObject.optString("type");
        if (C8632dsu.c((Object) "deviceChallengeRequest", (Object) optString)) {
            C2021aWy c2 = C2020aWx.c.c(jSONObject, this.i);
            if (c2 != null) {
                this.e.e(c2);
            }
            return true;
        } else if (C8632dsu.c((Object) "dcq", (Object) optString)) {
            if (Config_FastProperty_Ddr.Companion.b()) {
                C2021aWy d = C2020aWx.c.d(jSONObject, this.i);
                if (d != null) {
                    this.e.e(d);
                }
            } else {
                C2021aWy c3 = C2020aWx.c.c(jSONObject, this.i);
                if (c3 != null) {
                    this.e.e(c3);
                }
            }
            return true;
        } else if (C8632dsu.c((Object) "deviceChallengeResponse", (Object) optString)) {
            aWD c4 = C2020aWx.c.c(jSONObject);
            if (c4 != null) {
                String e = c4.e();
                C1044Mm.a("nf_ddr", "handleDdrMessageFromLocalDevice:: sending challengeResponse to Zuul jsonData=" + e);
                this.d.b(e);
            }
            return true;
        } else if (C8632dsu.c((Object) "dcr", (Object) optString)) {
            aWD a = C2020aWx.c.a(jSONObject);
            if (a != null) {
                String e2 = a.e();
                C1044Mm.a("nf_ddr", "handleDdrMessageFromLocalDevice2:: sending challengeResponse to Zuul jsonData=" + e2);
                this.d.b(e2);
            }
            return true;
        } else {
            C1044Mm.j("nf_ddr", "handleDdrRequestFromLocalDevice unsupported type=" + optString);
            return false;
        }
    }

    /* loaded from: classes3.dex */
    public static final class c {
        public /* synthetic */ c(C8627dsp c8627dsp) {
            this();
        }

        private c() {
        }
    }

    /* loaded from: classes3.dex */
    public final class b implements InterfaceC5171bti {
        @Override // o.InterfaceC5171bti
        public boolean a() {
            return false;
        }

        public b() {
        }

        @Override // o.InterfaceC5171bti
        public boolean e(String str) {
            C8632dsu.c((Object) str, "");
            C1044Mm.e("nf_ddr", "handleMessage: " + str);
            return aWF.this.d(str);
        }

        @Override // o.InterfaceC5171bti
        public void b(ZuulAgent.e eVar) {
            C8632dsu.c((Object) eVar, "");
            C1044Mm.e("nf_ddr", "onOpen");
            String e = C2020aWx.c.e(aWF.this.d.b(), aWF.this.a.a());
            if (e != null) {
                aWF awf = aWF.this;
                C1044Mm.e("nf_ddr", "onOpen: sending message " + e);
                awf.d.b(e);
            }
        }

        @Override // o.InterfaceC5171bti
        public void b() {
            C1044Mm.e("nf_ddr", "onClose");
        }
    }
}
