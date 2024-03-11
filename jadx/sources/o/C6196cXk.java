package o;

import android.content.Context;
import com.netflix.cl.ExtLogger;
import com.netflix.cl.Logger;
import com.netflix.cl.model.AppView;
import com.netflix.cl.model.MaturityLevel;
import com.netflix.cl.model.ProfileSettings;
import com.netflix.cl.model.TrackingInfo;
import com.netflix.cl.model.event.session.AddProfileEnded;
import com.netflix.cl.model.event.session.action.AddProfile;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.api.logging.error.ErrorType;
import com.netflix.mediaclient.service.webclient.model.leafs.AccountData;
import com.netflix.mediaclient.service.webclient.model.leafs.UmaCta;
import com.netflix.mediaclient.servicemgr.ServiceManager;
import com.netflix.mediaclient.ui.ums.UserMessageAreaView;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import o.AbstractC5164btb;
import o.C6196cXk;
import o.C8569dql;
import o.C8576dqs;
import o.C8632dsu;
import o.InterfaceC1598aHf;
import o.InterfaceC1601aHi;
import o.InterfaceC5283bvo;
import o.dpR;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: o.cXk  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6196cXk {
    public static final a b = new a(null);
    public static final int d = 8;
    private final NetflixActivity a;
    private boolean c;
    private final b e;
    private List<String> f;

    /* renamed from: o.cXk$c */
    /* loaded from: classes5.dex */
    public interface c {
        void e(boolean z, String str);
    }

    public C6196cXk(UmaCta umaCta, UserMessageAreaView userMessageAreaView) {
        List<String> i;
        boolean g;
        Map d2;
        Map k;
        Throwable th;
        C8632dsu.c((Object) umaCta, "");
        C8632dsu.c((Object) userMessageAreaView, "");
        b bVar = new b(false, null, null, false, null, null, null, 127, null);
        this.e = bVar;
        Context context = userMessageAreaView.getContext();
        C8632dsu.a(context, "");
        NetflixActivity netflixActivity = (NetflixActivity) C9737vz.e(context, NetflixActivity.class);
        this.a = netflixActivity;
        i = C8569dql.i();
        this.f = i;
        String parameters = umaCta.parameters();
        if (parameters != null) {
            g = C8691duz.g(parameters);
            if (g || C8054ddD.l(netflixActivity)) {
                return;
            }
            try {
                JSONObject jSONObject = new JSONObject(umaCta.parameters());
                if (jSONObject.has("profile_guid")) {
                    bVar.a(jSONObject.getString("profile_guid"));
                }
                bVar.a(jSONObject.optBoolean("should_auto_create_kids_profile", false));
                bVar.c(umaCta.trackingInfo());
                if (bVar.b()) {
                    bVar.e(jSONObject.getString("new_profile_name"));
                    bVar.b(jSONObject.getString("new_avatar_name"));
                    bVar.c(jSONObject.getBoolean("new_kids_zone"));
                    bVar.e(Integer.valueOf(jSONObject.getInt("new_maturity_level")));
                    List<? extends InterfaceC5283bvo> e = netflixActivity.getServiceManager().e();
                    if (e != null) {
                        ArrayList arrayList = new ArrayList();
                        for (InterfaceC5283bvo interfaceC5283bvo : e) {
                            String profileGuid = interfaceC5283bvo.getProfileGuid();
                            if (profileGuid != null) {
                                arrayList.add(profileGuid);
                            }
                        }
                        this.f = arrayList;
                    }
                }
                this.c = true;
            } catch (JSONException e2) {
                InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
                d2 = dqE.d();
                k = dqE.k(d2);
                C1596aHd c1596aHd = new C1596aHd("Error while parsing CTA params for profile switch UMA", e2, null, true, k, false, false, 96, null);
                ErrorType errorType = c1596aHd.a;
                if (errorType != null) {
                    c1596aHd.e.put("errorType", errorType.c());
                    String b2 = c1596aHd.b();
                    if (b2 != null) {
                        String c2 = errorType.c();
                        c1596aHd.a(c2 + " " + b2);
                    }
                }
                if (c1596aHd.b() != null && c1596aHd.i != null) {
                    th = new Throwable(c1596aHd.b(), c1596aHd.i);
                } else if (c1596aHd.b() != null) {
                    th = new Throwable(c1596aHd.b());
                } else {
                    th = c1596aHd.i;
                    if (th == null) {
                        th = new Throwable("Handled exception with no message");
                    } else if (th == null) {
                        throw new IllegalArgumentException("Required value was null.".toString());
                    }
                }
                InterfaceC1601aHi.d dVar = InterfaceC1601aHi.c;
                InterfaceC1598aHf a2 = dVar.a();
                if (a2 != null) {
                    a2.e(c1596aHd, th);
                } else {
                    dVar.e().b(c1596aHd, th);
                }
            }
        }
    }

    /* renamed from: o.cXk$a */
    /* loaded from: classes5.dex */
    public static final class a {
        public /* synthetic */ a(C8627dsp c8627dsp) {
            this();
        }

        private a() {
        }
    }

    /* renamed from: o.cXk$b */
    /* loaded from: classes5.dex */
    public static final class b {
        private String a;
        private boolean b;
        private boolean c;
        private Integer d;
        private String e;
        private String f;
        private String j;

        public b() {
            this(false, null, null, false, null, null, null, 127, null);
        }

        public final Integer a() {
            return this.d;
        }

        public final void a(String str) {
            this.j = str;
        }

        public final void a(boolean z) {
            this.b = z;
        }

        public final void b(String str) {
            this.a = str;
        }

        public final boolean b() {
            return this.b;
        }

        public final String c() {
            return this.e;
        }

        public final void c(String str) {
            this.f = str;
        }

        public final void c(boolean z) {
            this.c = z;
        }

        public final String d() {
            return this.a;
        }

        public final void e(Integer num) {
            this.d = num;
        }

        public final void e(String str) {
            this.e = str;
        }

        public final boolean e() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                b bVar = (b) obj;
                return this.b == bVar.b && C8632dsu.c((Object) this.j, (Object) bVar.j) && C8632dsu.c((Object) this.e, (Object) bVar.e) && this.c == bVar.c && C8632dsu.c((Object) this.a, (Object) bVar.a) && C8632dsu.c(this.d, bVar.d) && C8632dsu.c((Object) this.f, (Object) bVar.f);
            }
            return false;
        }

        public final String f() {
            return this.j;
        }

        public final String h() {
            return this.f;
        }

        public int hashCode() {
            int hashCode = Boolean.hashCode(this.b);
            String str = this.j;
            int hashCode2 = str == null ? 0 : str.hashCode();
            String str2 = this.e;
            int hashCode3 = str2 == null ? 0 : str2.hashCode();
            int hashCode4 = Boolean.hashCode(this.c);
            String str3 = this.a;
            int hashCode5 = str3 == null ? 0 : str3.hashCode();
            Integer num = this.d;
            int hashCode6 = num == null ? 0 : num.hashCode();
            String str4 = this.f;
            return (((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + (str4 != null ? str4.hashCode() : 0);
        }

        public String toString() {
            boolean z = this.b;
            String str = this.j;
            String str2 = this.e;
            boolean z2 = this.c;
            String str3 = this.a;
            Integer num = this.d;
            String str4 = this.f;
            return "CtaParams(needsProfileCreation=" + z + ", profileGuid=" + str + ", newProfileName=" + str2 + ", newKidsProfile=" + z2 + ", newAvatarName=" + str3 + ", newMaturityLevel=" + num + ", trackingInfo=" + str4 + ")";
        }

        public b(boolean z, String str, String str2, boolean z2, String str3, Integer num, String str4) {
            this.b = z;
            this.j = str;
            this.e = str2;
            this.c = z2;
            this.a = str3;
            this.d = num;
            this.f = str4;
        }

        public /* synthetic */ b(boolean z, String str, String str2, boolean z2, String str3, Integer num, String str4, int i, C8627dsp c8627dsp) {
            this((i & 1) != 0 ? false : z, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? true : z2, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : num, (i & 64) == 0 ? str4 : null);
        }
    }

    public final boolean e() {
        return this.e.b();
    }

    public final String b() {
        return this.e.f();
    }

    public final void c(final c cVar) {
        C8632dsu.c((Object) cVar, "");
        if (!this.c) {
            cVar.e(false, null);
        } else {
            C1645aIz.a(this.a, new drM<ServiceManager, dpR>() { // from class: com.netflix.mediaclient.ui.ums.UmaProfileCreationHelper$handleProfileCreation$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // o.drM
                public /* synthetic */ dpR invoke(ServiceManager serviceManager) {
                    d(serviceManager);
                    return dpR.c;
                }

                public final void d(ServiceManager serviceManager) {
                    C6196cXk.b bVar;
                    C6196cXk.b bVar2;
                    C6196cXk.b bVar3;
                    C6196cXk.b bVar4;
                    C8632dsu.c((Object) serviceManager, "");
                    bVar = C6196cXk.this.e;
                    String c2 = bVar.c();
                    bVar2 = C6196cXk.this.e;
                    boolean e = bVar2.e();
                    bVar3 = C6196cXk.this.e;
                    String d2 = bVar3.d();
                    bVar4 = C6196cXk.this.e;
                    Integer a2 = bVar4.a();
                    final C6196cXk c6196cXk = C6196cXk.this;
                    final C6196cXk.c cVar2 = cVar;
                    serviceManager.a(c2, e, d2, a2, new AbstractC5164btb() { // from class: com.netflix.mediaclient.ui.ums.UmaProfileCreationHelper$handleProfileCreation$1.1
                        @Override // o.AbstractC5164btb, o.InterfaceC5094bsK
                        public void d(Status status, AccountData accountData) {
                            List list;
                            Collection i;
                            List list2;
                            List g;
                            Object x;
                            String str = null;
                            if (status == null || accountData == null || status.i()) {
                                C6196cXk.this.b(status, null);
                                cVar2.e(false, null);
                                return;
                            }
                            list = C6196cXk.this.f;
                            if (!list.isEmpty()) {
                                List<InterfaceC5283bvo> userProfiles = accountData.getUserProfiles();
                                if (userProfiles == null) {
                                    i = C8569dql.i();
                                } else {
                                    i = new ArrayList();
                                    for (InterfaceC5283bvo interfaceC5283bvo : userProfiles) {
                                        String profileGuid = interfaceC5283bvo.getProfileGuid();
                                        if (profileGuid != null) {
                                            i.add(profileGuid);
                                        }
                                    }
                                }
                                list2 = C6196cXk.this.f;
                                g = C8576dqs.g((Iterable) i, (Iterable) list2);
                                x = C8576dqs.x(g);
                                str = (String) x;
                            }
                            C6196cXk.this.b(status, str);
                            cVar2.e(true, str);
                        }
                    });
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b(Status status, String str) {
        boolean g;
        ProfileSettings c2 = c(str);
        AddProfile addProfile = new AddProfile(AppView.umsAlertButton, null, c2, null, new TrackingInfo() { // from class: o.cXg
            @Override // com.netflix.cl.model.JsonSerializer
            public final JSONObject toJSONObject() {
                JSONObject e;
                e = C6196cXk.e(C6196cXk.this);
                return e;
            }
        });
        Logger logger = Logger.INSTANCE;
        logger.startSession(addProfile);
        if (status != null && !status.i() && str != null) {
            g = C8691duz.g(str);
            if (!g) {
                logger.endSession(new AddProfileEnded(addProfile, str, c2));
                return;
            }
        }
        ExtLogger.INSTANCE.failedAction(Long.valueOf(addProfile.getId()), C8169dfM.b(status));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final JSONObject e(C6196cXk c6196cXk) {
        C8632dsu.c((Object) c6196cXk, "");
        String h = c6196cXk.e.h();
        return new JSONObject(h != null ? h : "");
    }

    private final ProfileSettings c(String str) {
        InterfaceC5283bvo interfaceC5283bvo;
        List<String> secondaryLanguages;
        Object obj;
        List<? extends InterfaceC5283bvo> e = this.a.getServiceManager().e();
        if (e != null) {
            Iterator<T> it = e.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (C8632dsu.c((Object) ((InterfaceC5283bvo) obj).getProfileGuid(), (Object) str)) {
                    break;
                }
            }
            interfaceC5283bvo = (InterfaceC5283bvo) obj;
        } else {
            interfaceC5283bvo = null;
        }
        return new ProfileSettings(interfaceC5283bvo != null ? Boolean.valueOf(!interfaceC5283bvo.disableVideoMerchAutoPlay()) : null, this.e.d(), null, (interfaceC5283bvo == null || (secondaryLanguages = interfaceC5283bvo.getSecondaryLanguages()) == null) ? null : (String[]) secondaryLanguages.toArray(new String[0]), c(this.e.a()), interfaceC5283bvo != null ? interfaceC5283bvo.getLanguagesInCsv() : null, interfaceC5283bvo != null ? Boolean.valueOf(interfaceC5283bvo.isAutoPlayEnabled()) : null, Boolean.valueOf(this.e.e()));
    }

    private final MaturityLevel c(Integer num) {
        if (num == null) {
            return MaturityLevel.adults;
        }
        return num.intValue() <= 40 ? MaturityLevel.littleKids : num.intValue() <= 70 ? MaturityLevel.olderKids : num.intValue() <= 96 ? MaturityLevel.teens : MaturityLevel.adults;
    }
}
