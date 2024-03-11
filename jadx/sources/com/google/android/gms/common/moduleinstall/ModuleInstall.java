package com.google.android.gms.common.moduleinstall;

import android.content.Context;
import com.google.android.gms.common.moduleinstall.internal.zay;

/* loaded from: classes5.dex */
public final class ModuleInstall {
    public static ModuleInstallClient getClient(Context context) {
        return new zay(context);
    }
}
