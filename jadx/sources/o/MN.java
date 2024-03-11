package o;

import android.content.Context;
import com.netflix.mediaclient.NetflixApplication;
import com.netflix.mediaclient.service.configuration.persistent.fastproperty.ConfigFastPropertyFeatureControlConfig;
import com.netflix.mediaclient.service.configuration.persistent.fastproperty.Config_FastProperty_DarkKidsTheme;
import com.netflix.mediaclient.service.configuration.persistent.fastproperty.Config_FastProperty_Interactive;
import com.netflix.mediaclient.service.configuration.persistent.fastproperty.Config_FastProperty_Interactive_Data;
import com.netflix.mediaclient.service.user.UserAgent;
import dagger.hilt.EntryPoint;
import dagger.hilt.InstallIn;
import org.linphone.BuildConfig;

/* loaded from: classes3.dex */
public final class MN implements aOZ {
    public static final MN b = new MN();

    @EntryPoint
    @InstallIn({aFU.class})
    /* loaded from: classes3.dex */
    public interface c {
        InterfaceC8351dij d();
    }

    private MN() {
    }

    @Override // o.aOZ
    public void b(Context context, InterfaceC8195dfm<String, String> interfaceC8195dfm) {
        boolean g;
        String d;
        C8632dsu.c((Object) context, "");
        C8632dsu.c((Object) interfaceC8195dfm, "");
        StringBuffer stringBuffer = new StringBuffer(Config_FastProperty_Interactive.Companion.b());
        g = C8691duz.g(stringBuffer);
        if (!g) {
            interfaceC8195dfm.put("disabledInteractiveTitleList", stringBuffer.toString());
        }
        if (!Config_FastProperty_Interactive_Data.Companion.c()) {
            interfaceC8195dfm.put("interactive_data", "false");
        }
        if (C8171dfO.e()) {
            interfaceC8195dfm.put("liteCfg", "true");
        }
        if (C8171dfO.c()) {
            interfaceC8195dfm.put("qddp", "true");
        }
        UserAgent k = AbstractApplicationC1040Mh.getInstance().i().k();
        InterfaceC5283bvo j = k != null ? k.j() : null;
        if (j != null && j.isKidsProfile()) {
            interfaceC8195dfm.put("prfType", j.getProfileType().toString());
            interfaceC8195dfm.put("kidsFavRow", "true");
            if (!Config_FastProperty_DarkKidsTheme.Companion.b()) {
                interfaceC8195dfm.put("kidsDark", "false");
            }
        }
        if (C8153dex.d()) {
            interfaceC8195dfm.put("supportsGames", "true");
        }
        if (C8153dex.u()) {
            d = C8576dqs.d(C1589aGx.d(context).e(), ",", null, null, 0, null, null, 62, null);
            interfaceC8195dfm.put("installedGamesPackageNames", d);
        }
        if (NetflixApplication.v()) {
            interfaceC8195dfm.put("buildType", BuildConfig.BUILD_TYPE);
        }
        String o2 = ConfigFastPropertyFeatureControlConfig.Companion.o();
        if (o2 != null) {
            interfaceC8195dfm.put("confidentialExpiryOverride", o2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x009b, code lost:
        if (r5 != false) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0134  */
    @Override // o.aOZ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.util.Map<java.lang.String, java.lang.String> a() {
        /*
            Method dump skipped, instructions count: 380
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.MN.a():java.util.Map");
    }
}
