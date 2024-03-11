package com.netflix.mediaclient.partner;

import android.content.Context;
import o.C8157dfA;
import o.C8159dfC;
import o.C8168dfL;

/* loaded from: classes3.dex */
public final class PartnerInstallType {

    /* loaded from: classes3.dex */
    public enum InstallType {
        PRELOAD("preload"),
        POSTLOAD("postload"),
        PAI_PRELOAD("gpai"),
        REGULAR("regular");
        
        private final String f;

        public String a() {
            return this.f;
        }

        InstallType(String str) {
            this.f = str;
        }
    }

    public static InstallType b(Context context) {
        if (C8157dfA.b(context, "isPaiPreload", false)) {
            return InstallType.PAI_PRELOAD;
        }
        if (C8159dfC.d(context)) {
            return InstallType.PRELOAD;
        }
        if (C8157dfA.b(context, "isPostLoaded", false)) {
            return InstallType.POSTLOAD;
        }
        return InstallType.REGULAR;
    }

    public static boolean e(String str) {
        if (C8168dfL.g(str)) {
            return false;
        }
        return !C8168dfL.d(str, InstallType.REGULAR.a());
    }
}
