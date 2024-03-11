package com.netflix.mediaclient.acquisition.screens.creditDebit;

import android.net.Uri;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import java.util.Locale;
import javax.inject.Inject;
import javax.inject.Named;
import o.C8632dsu;
import o.C8691duz;
import o.InterfaceC8554dpx;

/* loaded from: classes3.dex */
public final class EmvcoDataService {
    public static final int $stable = 8;
    private final String emvco3dsAuthenticationResponseURL;
    private final String emvco3dsAuthenticationWindowSize;
    private final InterfaceC8554dpx<Locale> locale;
    private final String webViewBaseUrl;

    public final String getEmvco3dsAuthenticationResponseURL() {
        return this.emvco3dsAuthenticationResponseURL;
    }

    public final String getEmvco3dsAuthenticationWindowSize() {
        return this.emvco3dsAuthenticationWindowSize;
    }

    @Inject
    public EmvcoDataService(@Named("webViewBaseUrl") String str, InterfaceC8554dpx<Locale> interfaceC8554dpx) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) interfaceC8554dpx, "");
        this.webViewBaseUrl = str;
        this.locale = interfaceC8554dpx;
        this.emvco3dsAuthenticationResponseURL = "https://" + str + "/emvco3ds/stepUpAuthentication/callback";
        this.emvco3dsAuthenticationWindowSize = "01";
    }

    public final String buildDeviceDataCollectionFallbackUrl(String str) {
        String b;
        C8632dsu.c((Object) str, "");
        String locale = this.locale.getValue().toString();
        C8632dsu.a(locale, "");
        b = C8691duz.b(locale, "_", "-", false, 4, (Object) null);
        String builder = Uri.parse(this.webViewBaseUrl).buildUpon().appendEncodedPath(SignupConstants.WebViewPaths.EMVCO_DATA_COLLECTION_FALLBACK_PATH).appendQueryParameter(SignupConstants.Key.NETFLIX_CLIENT_PLATFORM, SignupConstants.AndroidPlatform.ANDROID_NATIVE).appendQueryParameter("esn", str).appendQueryParameter("locale", b).toString();
        C8632dsu.a(builder, "");
        return builder;
    }
}
