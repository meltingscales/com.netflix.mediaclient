package o;

import com.netflix.android.org.json.zip.JSONzip;
import com.netflix.mediaclient.service.webclient.model.leafs.SubtitlePreference;
import com.netflix.mediaclient.service.webclient.model.leafs.UserAccount;
import com.netflix.mediaclient.service.webclient.model.leafs.UserAccountConstants;
import j$.time.Instant;
import o.XP;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class aEU extends UserAccount {
    public static final a b = new a(null);
    private final XP.d c;

    @Override // com.netflix.mediaclient.service.webclient.model.leafs.UserAccount
    public SubtitlePreference getSubtitleDefaults() {
        return null;
    }

    public aEU(XP.d dVar) {
        this.c = dVar;
    }

    /* loaded from: classes3.dex */
    public static final class a extends C1045Mp {
        public /* synthetic */ a(C8627dsp c8627dsp) {
            this();
        }

        private a() {
            super("GraphQlUserAccount");
        }
    }

    @Override // com.netflix.mediaclient.service.webclient.model.leafs.UserAccount, o.InterfaceC5282bvn
    public String getCountryOfSignUp() {
        XP.c c;
        XP.d dVar = this.c;
        if (dVar == null || (c = dVar.c()) == null) {
            return null;
        }
        return c.b();
    }

    @Override // com.netflix.mediaclient.service.webclient.model.leafs.UserAccount, o.InterfaceC5282bvn
    public String getUserGuid() {
        XP.d dVar = this.c;
        if (dVar != null) {
            return dVar.a();
        }
        return null;
    }

    @Override // com.netflix.mediaclient.service.webclient.model.leafs.UserAccount, o.InterfaceC5282bvn
    public long memberSince() {
        Instant b2;
        try {
            XP.d dVar = this.c;
            if (dVar != null && (b2 = dVar.b()) != null) {
                return b2.b();
            }
        } catch (ArithmeticException unused) {
        }
        return 0L;
    }

    @Override // com.netflix.mediaclient.service.webclient.model.leafs.UserAccount, o.InterfaceC5282bvn
    public boolean isAgeVerified() {
        Boolean g;
        XP.d dVar = this.c;
        if (dVar == null || (g = dVar.g()) == null) {
            return false;
        }
        return g.booleanValue();
    }

    @Override // com.netflix.mediaclient.service.webclient.model.leafs.UserAccount, o.InterfaceC5282bvn
    public boolean canCreateUserProfile() {
        Boolean e;
        XP.d dVar = this.c;
        if (dVar == null || (e = dVar.e()) == null) {
            return false;
        }
        return e.booleanValue();
    }

    @Override // com.netflix.mediaclient.service.webclient.model.leafs.UserAccount, o.InterfaceC5282bvn
    public InterfaceC5282bvn updateCanCreateUserProfile(boolean z) {
        if (canCreateUserProfile() == z) {
            return null;
        }
        XP.d dVar = this.c;
        return new aEU(dVar != null ? dVar.e((r20 & 1) != 0 ? dVar.c : null, (r20 & 2) != 0 ? dVar.d : Boolean.valueOf(z), (r20 & 4) != 0 ? dVar.b : null, (r20 & 8) != 0 ? dVar.e : null, (r20 & 16) != 0 ? dVar.a : null, (r20 & 32) != 0 ? dVar.i : null, (r20 & 64) != 0 ? dVar.h : null, (r20 & 128) != 0 ? dVar.g : null, (r20 & JSONzip.end) != 0 ? dVar.f : null) : null);
    }

    @Override // com.netflix.mediaclient.service.webclient.model.leafs.UserAccount, o.InterfaceC5282bvn
    public boolean isNotActiveOrOnHold() {
        Boolean h;
        XP.d dVar = this.c;
        if (dVar == null || (h = dVar.h()) == null) {
            return false;
        }
        return h.booleanValue();
    }

    @Override // com.netflix.mediaclient.service.webclient.model.leafs.UserAccount, o.InterfaceC5282bvn
    public boolean isMobileOnlyPlan() {
        XP.a d;
        Boolean e;
        XP.d dVar = this.c;
        if (dVar == null || (d = dVar.d()) == null || (e = d.e()) == null) {
            return false;
        }
        return e.booleanValue();
    }

    @Override // com.netflix.mediaclient.service.webclient.model.leafs.UserAccount
    public String toString() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(UserAccountConstants.FIELD_USER_GUID, getUserGuid());
            jSONObject.put(UserAccountConstants.FIELD_MEMBER_SINCE, memberSince());
            jSONObject.put(UserAccountConstants.FIELD_SIGNUP_COUNTRY, getCountryOfSignUp());
            jSONObject.put(UserAccountConstants.FIELD_AGE_VERIFIED, isAgeVerified());
            jSONObject.put(UserAccountConstants.FIELD_MOBILE_ONLY_PLAN, isMobileOnlyPlan());
            jSONObject.put(UserAccountConstants.FIELD_NOT_ACTIVE_OR_HOLD, isNotActiveOrOnHold());
            SubtitlePreference subtitlePreference = this.subtitleDefaults;
            if (subtitlePreference != null) {
                jSONObject.put(SubtitlePreference.FIELD_SUBTITLE_OVERRIDE, subtitlePreference.toString());
            }
            jSONObject.put(UserAccountConstants.FIELD_CAN_CREATE_USER_PROFILE, canCreateUserProfile());
        } catch (JSONException unused) {
        }
        b.getLogTag();
        String jSONObject2 = jSONObject.toString();
        C8632dsu.a(jSONObject2, "");
        return jSONObject2;
    }
}
