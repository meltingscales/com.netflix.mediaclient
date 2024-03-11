package com.netflix.mediaclient.service.api.core;

/* loaded from: classes.dex */
public enum ModuleInstallState {
    STATE_FAILED(0, "unknown"),
    STATE_PENDING(1, "pending"),
    STATE_USER_CONFIRMATION(8, "userConfirmation"),
    STATE_DOWNLOADING(2, "downloading"),
    STATE_DOWNLOADED(3, "downloaded"),
    STATE_INSTALLING(4, "installing"),
    STATE_INSTALLED(5, "installed"),
    STATE_CANCELING(9, "failed"),
    STATE_CANCELED(7, "cancelled"),
    STATE_ON_ERROR(107, "onError");
    
    private final String k;
    private final int l;

    private int e() {
        return this.l;
    }

    public String d() {
        return this.k;
    }

    ModuleInstallState(int i, String str) {
        this.l = i;
        this.k = str;
    }

    public static String a(int i) {
        ModuleInstallState[] values;
        for (ModuleInstallState moduleInstallState : values()) {
            if (moduleInstallState != null && moduleInstallState.e() == i) {
                return moduleInstallState.k;
            }
        }
        return null;
    }
}
