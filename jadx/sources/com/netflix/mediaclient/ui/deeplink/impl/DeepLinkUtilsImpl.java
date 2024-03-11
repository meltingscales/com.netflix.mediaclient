package com.netflix.mediaclient.ui.deeplink.impl;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.netflix.cl.model.secondscreen.ConnectionSource;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.protocol.nflx.NflxHandler;
import com.netflix.mediaclient.service.configuration.persistent.fastproperty.Config_FastProperty_LocaleSpecificSharing;
import com.netflix.mediaclient.ui.gamecontrollermagicpath.api.MagicPathUiType;
import com.netflix.mediaclient.ui.launch.NetflixComLaunchActivity;
import dagger.Binds;
import dagger.Module;
import dagger.hilt.InstallIn;
import dagger.hilt.android.qualifiers.ApplicationContext;
import dagger.hilt.components.SingletonComponent;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Pair;
import o.C1045Mp;
import o.C1726aLz;
import o.C8141del;
import o.C8310dhv;
import o.C8566dqi;
import o.C8569dql;
import o.C8627dsp;
import o.C8632dsu;
import o.InterfaceC3859bNh;
import o.InterfaceC6704ciN;
import o.bEY;
import o.dpD;
import o.dqE;

/* loaded from: classes4.dex */
public final class DeepLinkUtilsImpl implements bEY {
    public static final e d = new e(null);
    private static final Map<String, List<String>> e;
    private final InterfaceC3859bNh a;
    private final InterfaceC6704ciN b;
    private final Context c;

    @Module
    @InstallIn({SingletonComponent.class})
    /* loaded from: classes6.dex */
    public interface DeepLinkModule {
        @Binds
        bEY d(DeepLinkUtilsImpl deepLinkUtilsImpl);
    }

    @Inject
    public DeepLinkUtilsImpl(@ApplicationContext Context context, InterfaceC6704ciN interfaceC6704ciN, InterfaceC3859bNh interfaceC3859bNh) {
        C8632dsu.c((Object) context, "");
        C8632dsu.c((Object) interfaceC6704ciN, "");
        C8632dsu.c((Object) interfaceC3859bNh, "");
        this.c = context;
        this.b = interfaceC6704ciN;
        this.a = interfaceC3859bNh;
    }

    /* loaded from: classes4.dex */
    public static final class e extends C1045Mp {
        public /* synthetic */ e(C8627dsp c8627dsp) {
            this();
        }

        private e() {
            super("DeepLinkApplicationImpl");
        }
    }

    static {
        List j;
        List e2;
        List e3;
        List j2;
        List e4;
        List j3;
        List j4;
        List e5;
        List e6;
        List e7;
        List e8;
        List e9;
        List e10;
        List e11;
        List e12;
        List e13;
        List e14;
        List e15;
        List e16;
        List j5;
        List e17;
        List e18;
        List e19;
        List e20;
        List e21;
        List e22;
        List j6;
        Map<String, List<String>> c;
        j = C8569dql.j("eg-ar", "eg-ar", "sa-ar", "ae-ar", "ae-ar", "dz-ar", "bh-ar", "kw-ar", "iq-ar", "jo-ar", "lb-ar", "ly-ar", "ma-ar", "om-ar", "qa-ar", "tn-ar");
        Pair a = dpD.a("ar", j);
        e2 = C8566dqi.e("cz-cs");
        Pair a2 = dpD.a("cs", e2);
        e3 = C8566dqi.e("dk-da");
        Pair a3 = dpD.a("da", e3);
        j2 = C8569dql.j("de-de", "at-de");
        Pair a4 = dpD.a("de", j2);
        e4 = C8566dqi.e("gr-el");
        Pair a5 = dpD.a("el", e4);
        j3 = C8569dql.j("us-en", "gb-en", "in-en", "au-en");
        Pair a6 = dpD.a(SignupConstants.Language.ENGLISH_EN, j3);
        j4 = C8569dql.j("es-es", "mx-es");
        Pair a7 = dpD.a(SignupConstants.Language.SPANISH_ES, j4);
        e5 = C8566dqi.e("fi-fi");
        Pair a8 = dpD.a("fi", e5);
        e6 = C8566dqi.e("fr-fr");
        Pair a9 = dpD.a(SignupConstants.Field.REGION_FR, e6);
        e7 = C8566dqi.e("il-he");
        Pair a10 = dpD.a("he", e7);
        e8 = C8566dqi.e("hr-hr");
        Pair a11 = dpD.a("hr", e8);
        e9 = C8566dqi.e("id-id");
        Pair a12 = dpD.a(SignupConstants.Field.LANG_ID, e9);
        e10 = C8566dqi.e("it-it");
        Pair a13 = dpD.a("it", e10);
        e11 = C8566dqi.e("ja-jp");
        Pair a14 = dpD.a("jp", e11);
        e12 = C8566dqi.e("kr-ko");
        Pair a15 = dpD.a("ko", e12);
        e13 = C8566dqi.e("my-ms");
        Pair a16 = dpD.a("ms", e13);
        e14 = C8566dqi.e("no-nb");
        Pair a17 = dpD.a("nb", e14);
        e15 = C8566dqi.e("nl-nl");
        Pair a18 = dpD.a(SignupConstants.Field.REGION_NL, e15);
        e16 = C8566dqi.e("pl-pl");
        Pair a19 = dpD.a("pl", e16);
        j5 = C8569dql.j("br-pt", "pt-pt");
        Pair a20 = dpD.a("pt", j5);
        e17 = C8566dqi.e("ro-ro");
        Pair a21 = dpD.a("ro", e17);
        e18 = C8566dqi.e("ru-ru");
        Pair a22 = dpD.a("ru", e18);
        e19 = C8566dqi.e("se-sv");
        Pair a23 = dpD.a("sv", e19);
        e20 = C8566dqi.e("ke-sw");
        Pair a24 = dpD.a("sw", e20);
        e21 = C8566dqi.e("th-th");
        Pair a25 = dpD.a("th", e21);
        e22 = C8566dqi.e("tr-tr");
        Pair a26 = dpD.a("tr", e22);
        j6 = C8569dql.j("tw-zh", "hk-zh");
        c = dqE.c(a, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15, a16, a17, a18, a19, a20, a21, a22, a23, a24, a25, a26, dpD.a("zh", j6));
        e = c;
    }

    @Override // o.bEY
    public String a(String str, String str2, String str3, String str4, String str5, int i) {
        String str6 = "";
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) str2, "");
        C8632dsu.c((Object) str3, "");
        Locale c = C8310dhv.c();
        C8632dsu.a(c, "");
        if (str5 == null) {
            str5 = a(c);
        }
        if (str4 == null) {
            str4 = "13747225";
        }
        if (i != 0) {
            str6 = "&t=" + i;
        }
        if (str5 != null && str6.length() == 0) {
            return "https://www.netflix.com/" + str5 + "/" + str + "/" + str2 + "?s=a&trkid=" + str4 + "&trg=" + str3 + "&vlang=" + c.getLanguage();
        }
        return "https://www.netflix.com/" + str + "/" + str2 + "?s=a&trkid=" + str4 + str6 + "&trg=" + str3;
    }

    private final String a(Locale locale) {
        if (Config_FastProperty_LocaleSpecificSharing.Companion.c()) {
            List<String> list = e.get(locale.getLanguage());
            String country = locale.getCountry();
            C8632dsu.a(country, "");
            Locale locale2 = Locale.US;
            C8632dsu.a(locale2, "");
            String lowerCase = country.toLowerCase(locale2);
            C8632dsu.a(lowerCase, "");
            String language = locale.getLanguage();
            C8632dsu.a(language, "");
            C8632dsu.a(locale2, "");
            String lowerCase2 = language.toLowerCase(locale2);
            C8632dsu.a(lowerCase2, "");
            String str = lowerCase + "-" + lowerCase2;
            if (list == null) {
                return null;
            }
            if (list.size() == 1) {
                String substring = list.get(0).substring(0, 2);
                C8632dsu.a(substring, "");
                return substring;
            } else if (list.contains(str)) {
                String substring2 = str.substring(0, 2);
                C8632dsu.a(substring2, "");
                return substring2;
            } else {
                String substring3 = list.get(0).substring(0, 2);
                C8632dsu.a(substring3, "");
                return substring3;
            }
        }
        return null;
    }

    @Override // o.bEY
    public boolean b(NflxHandler nflxHandler) {
        C8632dsu.c((Object) nflxHandler, "");
        return !(nflxHandler instanceof C1726aLz);
    }

    @Override // o.bEY
    public Intent b(Uri uri) {
        C8632dsu.c((Object) uri, "");
        return new Intent("android.intent.action.VIEW", uri, this.c, NetflixComLaunchActivity.class);
    }

    @Override // o.bEY
    public boolean a(Activity activity) {
        C8632dsu.c((Object) activity, "");
        return activity instanceof NetflixComLaunchActivity;
    }

    @Override // o.bEY
    public void a(Activity activity, String str, ConnectionSource connectionSource) {
        C8632dsu.c((Object) activity, "");
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) connectionSource, "");
        Object e2 = C8141del.e(activity, NetflixActivity.class);
        C8632dsu.a(e2, "");
        NetflixActivity netflixActivity = (NetflixActivity) e2;
        netflixActivity.startActivity(this.b.d(activity, str, connectionSource));
        netflixActivity.overridePendingTransition(0, 0);
    }

    @Override // o.bEY
    public void e(Activity activity, Map<String, String> map) {
        C8632dsu.c((Object) activity, "");
        C8632dsu.c((Object) map, "");
        Object e2 = C8141del.e(activity, NetflixActivity.class);
        C8632dsu.a(e2, "");
        NetflixActivity netflixActivity = (NetflixActivity) e2;
        netflixActivity.startActivity(this.b.b(activity, map));
        netflixActivity.overridePendingTransition(0, 0);
    }

    @Override // o.bEY
    public void b(Activity activity, String str) {
        C8632dsu.c((Object) activity, "");
        C8632dsu.c((Object) str, "");
        this.a.d(activity, MagicPathUiType.e, str);
    }
}
