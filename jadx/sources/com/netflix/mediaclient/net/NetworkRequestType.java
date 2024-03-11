package com.netflix.mediaclient.net;

/* loaded from: classes.dex */
public enum NetworkRequestType {
    PLAY_MANIFEST,
    PLAY_LICENSE,
    PLAY_PREFETCH_MANIFEST,
    PLAY_PREFETCH_LICENSE,
    PLAY_ADBREAK_HYDRATION,
    PLAY_OTHER,
    BROWSE_PREFETCH,
    BROWSE,
    BROWSE_LOG,
    CONFIG,
    AUI,
    PING,
    PDS_EVENT,
    PDS_KEEP_ALIVE,
    PDS_KEEP_ALIVE_BACKGROUND,
    LOG_CL,
    LOG_CLV2,
    LOG_ADV_ID,
    LOG_PRESENTATION,
    LOG_BLOB,
    LOG,
    RELEASE_LICENSE,
    API,
    LOG_VOIP,
    CONFIG_VOIP,
    VERIFY_LOGIN,
    CONTENT_AUDIO,
    CONTENT_VIDEO,
    CONTENT_AUDIO_PREFETCH,
    CONTENT_VIDEO_PREFETCH,
    CONTENT_AUDIO_DOWNLOAD,
    CONTENT_VIDEO_DOWNLOAD,
    CONTENT_TRICKPLAY_DOWNLOAD,
    CONTENT_SUBTITLES_DOWNLOAD,
    CONTENT_SUBTITLES,
    CONTENT_BOXART,
    PROXY_ESN,
    DP_PREFETCH,
    GRAPHQL,
    FALKOR_REQUEST,
    CREATE_SSO_TOKEN,
    STREAMING_APP_LOGOUT,
    RENEW_SSO_TOKEN,
    APPBOOT,
    FTL_PROBE,
    MDX_LOCAL,
    PRIVATE_SUBNET,
    UNKNOWN;

    public static NetworkRequestType d(String str) {
        NetworkRequestType[] values;
        if (str == null) {
            return null;
        }
        for (NetworkRequestType networkRequestType : values()) {
            if (str.equals(networkRequestType.name())) {
                return networkRequestType;
            }
        }
        if (str.startsWith("java.lang.Object")) {
            return API;
        }
        return null;
    }
}
