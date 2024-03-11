package com.google.android.play.core.appupdate;

/* loaded from: classes2.dex */
public abstract class AppUpdateOptions {

    /* loaded from: classes2.dex */
    public static abstract class Builder {
        public abstract AppUpdateOptions build();

        public abstract Builder setAllowAssetPackDeletion(boolean z);
    }

    public static AppUpdateOptions defaultOptions(int i) {
        return newBuilder(i).build();
    }

    public static Builder newBuilder(int i) {
        zzv zzvVar = new zzv();
        zzvVar.setAppUpdateType(i);
        zzvVar.setAllowAssetPackDeletion(false);
        return zzvVar;
    }

    public abstract boolean allowAssetPackDeletion();

    public abstract int appUpdateType();
}
