package com.google.android.play.core.install;

/* loaded from: classes5.dex */
final class NativeInstallStateUpdateListener implements InstallStateUpdatedListener {
    NativeInstallStateUpdateListener() {
    }

    @Override // com.google.android.play.core.listener.StateUpdatedListener
    public native void onStateUpdate(InstallState installState);
}
