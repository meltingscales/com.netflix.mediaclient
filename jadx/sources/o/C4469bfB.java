package o;

import android.os.Handler;
import com.netflix.mediaclient.StatusCode;
import com.netflix.mediaclient.android.app.NetflixStatus;
import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.media.PreferredLanguageData;
import com.netflix.model.leafs.originals.interactive.template.VisualStateDefinition;
import java.util.List;
import o.C4469bfB;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: o.bfB  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4469bfB implements InterfaceC4900boc {
    public static final c c = new c(null);
    private final C4390bdc b;
    private final Handler e;

    public final Handler d() {
        return this.e;
    }

    public C4469bfB(C4390bdc c4390bdc, Handler handler) {
        C8632dsu.c((Object) c4390bdc, "");
        C8632dsu.c((Object) handler, "");
        this.b = c4390bdc;
        this.e = handler;
    }

    /* renamed from: o.bfB$c */
    /* loaded from: classes3.dex */
    public static final class c extends C1045Mp {
        public /* synthetic */ c(C8627dsp c8627dsp) {
            this();
        }

        private c() {
            super("AdBreakHydration");
        }
    }

    @Override // o.InterfaceC4900boc
    public void e(long j, final String str, String str2, String str3, final C4877boF c4877boF, InterfaceC4901bod interfaceC4901bod, final aHT aht) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) str2, "");
        C8632dsu.c((Object) str3, "");
        C8632dsu.c((Object) c4877boF, "");
        C8632dsu.c((Object) interfaceC4901bod, "");
        boolean z = c4877boF.i;
        String str4 = c4877boF.h;
        PreferredLanguageData preferredLanguageData = c4877boF.f;
        String audioCode = preferredLanguageData != null ? preferredLanguageData.getAudioCode() : null;
        PreferredLanguageData preferredLanguageData2 = c4877boF.f;
        String subtitleCode = preferredLanguageData2 != null ? preferredLanguageData2.getSubtitleCode() : null;
        PreferredLanguageData preferredLanguageData3 = c4877boF.f;
        String valueOf = String.valueOf(preferredLanguageData3 != null ? preferredLanguageData3.isAssistive() : null);
        C4884boM b = c4877boF.b(Long.valueOf(j));
        String b2 = b != null ? b.b() : null;
        C4884boM b3 = c4877boF.b(Long.valueOf(j));
        final C4395bdh c4395bdh = new C4395bdh(j, false, z, str4, null, audioCode, subtitleCode, valueOf, b2, b3 != null ? b3.c() : null, str2, str3);
        final a aVar = new a(interfaceC4901bod);
        this.e.post(new Runnable() { // from class: o.bfz
            @Override // java.lang.Runnable
            public final void run() {
                C4469bfB.a(C4469bfB.this, str, c4395bdh, c4877boF, aVar, aht);
            }
        });
    }

    /* renamed from: o.bfB$a */
    /* loaded from: classes3.dex */
    public static final class a extends AbstractC4397bdj {
        final /* synthetic */ InterfaceC4901bod b;

        a(InterfaceC4901bod interfaceC4901bod) {
            this.b = interfaceC4901bod;
        }

        @Override // o.InterfaceC4389bdb
        public void c(final JSONObject jSONObject, final Status status) {
            C8632dsu.c((Object) status, "");
            Handler d = C4469bfB.this.d();
            final InterfaceC4901bod interfaceC4901bod = this.b;
            d.post(new Runnable() { // from class: o.bfH
                @Override // java.lang.Runnable
                public final void run() {
                    C4469bfB.a.e(Status.this, jSONObject, interfaceC4901bod);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void e(Status status, JSONObject jSONObject, InterfaceC4901bod interfaceC4901bod) {
            NetflixStatus netflixStatus;
            JSONArray optJSONArray;
            C8632dsu.c((Object) status, "");
            C8632dsu.c((Object) interfaceC4901bod, "");
            if (status.j()) {
                if (jSONObject != null) {
                    try {
                        optJSONArray = jSONObject.optJSONArray(VisualStateDefinition.ELEMENT_STATE.RESULT);
                    } catch (Exception e) {
                        netflixStatus = new NetflixStatus(StatusCode.ADBREAK_PARSE_ERROR, e);
                    }
                } else {
                    optJSONArray = null;
                }
                if (optJSONArray != null) {
                    optJSONArray.length();
                }
                if (optJSONArray != null && optJSONArray.length() == 1) {
                    JSONObject optJSONObject = optJSONArray.optJSONObject(0);
                    JSONObject jSONObject2 = optJSONObject != null ? optJSONObject.getJSONObject("adverts") : null;
                    JSONObject optJSONObject2 = optJSONArray.optJSONObject(0);
                    JSONArray jSONArray = optJSONObject2 != null ? optJSONObject2.getJSONArray("auxiliaryManifests") : null;
                    AbstractC4473bfF a = C4563bgq.a(jSONObject2);
                    List<AbstractC4566bgt> d = C4563bgq.d(jSONArray);
                    C8632dsu.d(d);
                    interfaceC4901bod.e(new C4902boe(status, d, a));
                    return;
                }
            }
            netflixStatus = status;
            C4469bfB.c.getLogTag();
            interfaceC4901bod.e(new C4902boe(netflixStatus, null, null, 6, null));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C4469bfB c4469bfB, String str, C4395bdh c4395bdh, C4877boF c4877boF, AbstractC4397bdj abstractC4397bdj, aHT aht) {
        C8632dsu.c((Object) c4469bfB, "");
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) c4395bdh, "");
        C8632dsu.c((Object) c4877boF, "");
        C8632dsu.c((Object) abstractC4397bdj, "");
        c4469bfB.b.b(str, c4395bdh, c4877boF.c, abstractC4397bdj, aht);
    }
}
