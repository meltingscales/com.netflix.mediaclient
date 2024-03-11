package org.chromium.net;

/* loaded from: classes5.dex */
public class ApiVersion {
    private static final int API_LEVEL = 24;
    private static final String CRONET_VERSION = "113.0.5672.61";
    private static final String LAST_CHANGE = "565e0525ff2f7bc0e5e29d04579ded84718ab14f-refs/branch-heads/5672@{#909}";
    private static final int MIN_COMPATIBLE_API_LEVEL = 3;

    public static int getApiLevel() {
        return 3;
    }

    public static String getCronetVersion() {
        return CRONET_VERSION;
    }

    public static String getLastChange() {
        return LAST_CHANGE;
    }

    public static int getMaximumAvailableApiLevel() {
        return 24;
    }

    private ApiVersion() {
    }

    public static String getCronetVersionWithLastChange() {
        return "113.0.5672.61@565e0525";
    }
}
