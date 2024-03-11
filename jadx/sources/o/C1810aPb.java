package o;

import android.content.Context;
import com.netflix.mediaclient.service.player.StreamProfileType;
import com.netflix.mediaclient.service.webclient.model.leafs.AccountConfigData;
import com.netflix.mediaclient.service.webclient.model.leafs.BwCap;
import com.netflix.mediaclient.service.webclient.model.leafs.OfflineCodecPrefData;
import com.netflix.mediaclient.service.webclient.model.leafs.SearchResultsSimilarityAlgorithm;
import com.netflix.mediaclient.service.webclient.model.leafs.StreamProfileData;
import com.netflix.mediaclient.service.webclient.model.leafs.StreamingCodecPrefData;

/* renamed from: o.aPb  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C1810aPb {
    private static String b = "nf_configuration_account";
    private Context a;
    private AccountConfigData d;

    public void d(AccountConfigData accountConfigData) {
        this.d = accountConfigData;
    }

    public C1810aPb(Context context) {
        this.a = context;
        try {
            d(AccountConfigData.fromJsonString(C8157dfA.e(context, "accountConfig", (String) null)));
        } catch (IllegalArgumentException e) {
            C8197dfo c8197dfo = new C8197dfo();
            c8197dfo.a("accountConfig");
            c8197dfo.a();
            c8197dfo.d();
            throw e;
        }
    }

    public void a() {
        C8197dfo c8197dfo = new C8197dfo();
        c8197dfo.b("accountConfig", null);
        c8197dfo.a("bw_user_control_auto", -1);
        c8197dfo.a("bw_user_manual_setting", -1);
        c8197dfo.a();
    }

    public boolean c() {
        AccountConfigData accountConfigData = this.d;
        if (accountConfigData == null) {
            return true;
        }
        return accountConfigData.getCastEnabled();
    }

    public boolean h() {
        AccountConfigData accountConfigData = this.d;
        if (accountConfigData == null) {
            return false;
        }
        return accountConfigData.toDisableSuspendPlay();
    }

    public void c(AccountConfigData accountConfigData) {
        if (accountConfigData == null) {
            C1044Mm.d(b, "accountConfig obj is null - ignore overwrite");
            return;
        }
        C8157dfA.a(this.a, "accountConfig", accountConfigData.toJsonString());
        d(accountConfigData);
    }

    public BwCap c(StreamProfileType streamProfileType) {
        AccountConfigData accountConfigData = this.d;
        return accountConfigData != null ? accountConfigData.getBwCap(streamProfileType) : StreamProfileData.Companion.getBW_CAP_DEFAULT();
    }

    public StreamingCodecPrefData i() {
        AccountConfigData accountConfigData = this.d;
        if (accountConfigData == null) {
            return null;
        }
        return accountConfigData.getStreamingCodecPrefData();
    }

    public OfflineCodecPrefData e() {
        AccountConfigData accountConfigData = this.d;
        if (accountConfigData == null) {
            return null;
        }
        return accountConfigData.getOfflineCodecPrefData();
    }

    public String d() {
        AccountConfigData accountConfigData = this.d;
        if (accountConfigData == null) {
            return null;
        }
        return accountConfigData.getPreAppWidgetExperience();
    }

    public String b() {
        AccountConfigData accountConfigData = this.d;
        if (accountConfigData == null) {
            return null;
        }
        return accountConfigData.getPreAppPartnerExperience();
    }

    public boolean g() {
        AccountConfigData accountConfigData = this.d;
        if (accountConfigData == null) {
            return true;
        }
        return !accountConfigData.isVoipEnabledOnAccount();
    }

    public String f() {
        AccountConfigData accountConfigData = this.d;
        if (accountConfigData == null) {
            return null;
        }
        return accountConfigData.getUserPin();
    }

    public SearchResultsSimilarityAlgorithm j() {
        AccountConfigData accountConfigData = this.d;
        if (accountConfigData == null) {
            return null;
        }
        return accountConfigData.getSearchResultsSimilarityAlgorithm();
    }
}
