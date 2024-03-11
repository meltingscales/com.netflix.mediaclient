package com.netflix.mediaclient.service.logging.logblob;

/* loaded from: classes3.dex */
public enum LogBlobType {
    OFFLINE_CDN_URL_DOWNLOAD("offlinedlreport"),
    OFFLINE_LOGBLOB_TYPE("offline"),
    MDX_LOGBLOB_TYPE("mdx"),
    NETWORK_DIAGNOSIS("NetworkDiagnostics"),
    MAINTENANCE_JOB("maintenance"),
    FTL_SESSION("ftlsession"),
    CRONET_DISABLED("cronet_disabled"),
    DynamicModule("dynamicModule"),
    AppUpdate("appUpdate"),
    SafetyNet("safetyNet"),
    PlayIntegrity("playIntegrity"),
    FTL_RECOVERY("ftlerror"),
    SignupLanguage("signupLanguage"),
    VuiCommand("vuiCommand"),
    LanguageUserOverride("languageUserOverride"),
    JapaneseFonts("japaneseFonts"),
    CrashReport("crashreport"),
    SurfaceViewTimeOut("surfaceViewTimeOut"),
    CdxLatency("cdxlatency"),
    CdxLogImplicintPairing("ImplicitlyPairable"),
    WidevineMetrics("widevineMetrics"),
    CompanionMode("companionMode");
    
    private final String x;

    public String a() {
        return this.x;
    }

    LogBlobType(String str) {
        this.x = str;
    }
}
