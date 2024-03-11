package com.netflix.mediaclient.ui.profileviewingrestrictions.impl;

import o.C8600drp;
import o.InterfaceC8598drn;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class ProfileViewingRestrictionsPage {
    private static final /* synthetic */ InterfaceC8598drn d;
    private static final /* synthetic */ ProfileViewingRestrictionsPage[] f;
    public static final ProfileViewingRestrictionsPage c = new ProfileViewingRestrictionsPage("RESTRICTIONS_MENU", 0);
    public static final ProfileViewingRestrictionsPage e = new ProfileViewingRestrictionsPage("MATURITY_RATING", 1);
    public static final ProfileViewingRestrictionsPage b = new ProfileViewingRestrictionsPage("BLOCKED_TITLES", 2);
    public static final ProfileViewingRestrictionsPage a = new ProfileViewingRestrictionsPage("LOADING", 3);

    private static final /* synthetic */ ProfileViewingRestrictionsPage[] d() {
        return new ProfileViewingRestrictionsPage[]{c, e, b, a};
    }

    public static ProfileViewingRestrictionsPage valueOf(String str) {
        return (ProfileViewingRestrictionsPage) Enum.valueOf(ProfileViewingRestrictionsPage.class, str);
    }

    public static ProfileViewingRestrictionsPage[] values() {
        return (ProfileViewingRestrictionsPage[]) f.clone();
    }

    private ProfileViewingRestrictionsPage(String str, int i) {
    }

    static {
        ProfileViewingRestrictionsPage[] d2 = d();
        f = d2;
        d = C8600drp.e(d2);
    }
}
