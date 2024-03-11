package o;

import com.google.gson.JsonObject;
import com.netflix.falkor.FalkorException;
import com.netflix.mediaclient.service.user.UserAgent;
import com.netflix.mediaclient.service.webclient.model.leafs.AccountData;
import com.netflix.mediaclient.service.webclient.model.leafs.ListSummary;
import com.netflix.mediaclient.service.webclient.model.leafs.SubtitlePreference;
import com.netflix.mediaclient.service.webclient.model.leafs.UserAccount;
import com.netflix.mediaclient.service.webclient.model.leafs.UserProfile;
import java.util.ArrayList;

/* renamed from: o.brf  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5062brf {
    public static AccountData b(String str, boolean z) {
        JsonObject e = C0946Ir.e("nf_service_user", str);
        if (C8118deO.e(e)) {
            throw new FalkorException("UserProfiles empty!!!");
        }
        try {
            JsonObject asJsonObject = e.getAsJsonObject("profilesListV2");
            int length = asJsonObject.has("summary") ? ((ListSummary) C8118deO.e(asJsonObject, "summary", (Class<Object>) ListSummary.class)).getLength() : 5;
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < length; i++) {
                String num = Integer.toString(i);
                if (asJsonObject.has(num)) {
                    JsonObject asJsonObject2 = asJsonObject.getAsJsonObject(num);
                    UserProfile userProfile = new UserProfile();
                    UserProfile.Summary summary = (UserProfile.Summary) C8118deO.e(asJsonObject2, "summary", (Class<Object>) UserProfile.Summary.class);
                    userProfile.summary = summary;
                    if (summary == null || !userProfile.isProfileGuidValid()) {
                        InterfaceC1598aHf.a("UserUtils: Got empty summary for a profile.");
                        InterfaceC1597aHe.b(new C1596aHd("SPY-35474 - user profile summary is empty").e("userProfileSummary", userProfile.summary == null ? "null" : "isProfileGuidNUllOrBlank=" + C8168dfL.g(userProfile.getProfileGuid())));
                    } else {
                        userProfile.subtitlePreference = (InterfaceC5284bvp) C8118deO.e(asJsonObject2, "subtitlePreference", (Class<Object>) SubtitlePreference.class);
                        C8177dfU.a(userProfile, i, "parse");
                        arrayList.add(userProfile);
                    }
                }
            }
            AccountData accountData = new AccountData(arrayList, str);
            if (z) {
                try {
                    JsonObject asJsonObject3 = e.getAsJsonObject("user");
                    if (asJsonObject3 != null) {
                        UserAccount userAccount = new UserAccount();
                        UserAccount.Summary summary2 = (UserAccount.Summary) C8118deO.e(asJsonObject3, "summary", (Class<Object>) UserAccount.Summary.class);
                        userAccount.summary = summary2;
                        if (summary2 == null || C8168dfL.g(userAccount.getUserGuid())) {
                            throw new FalkorException("response missing summary" + str);
                        }
                        userAccount.subtitleDefaults = (SubtitlePreference) C8118deO.e(asJsonObject3, "subtitleDefaults", (Class<Object>) SubtitlePreference.class);
                        accountData.setUserAccount(userAccount);
                    }
                } catch (Exception e2) {
                    C1044Mm.b("nf_service_user", "String response to parse = " + str);
                    throw new FalkorException("response missing user json objects", e2);
                }
            }
            return accountData;
        } catch (Exception e3) {
            C1044Mm.b("nf_service_user", "String response to parse = " + str);
            throw new FalkorException("response missing user json objects", e3);
        }
    }

    public static boolean d() {
        UserAgent k = AbstractApplicationC1040Mh.getInstance().i().k();
        return k != null && k.c();
    }
}
