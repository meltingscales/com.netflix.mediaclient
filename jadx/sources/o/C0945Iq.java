package o;

import java.util.Set;

/* renamed from: o.Iq  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0945Iq implements InterfaceC0907He {
    public static final C0945Iq b = new C0945Iq();
    private static final Set<String> d;

    private C0945Iq() {
    }

    static {
        Set<String> d2;
        d2 = dqN.d("lolopi", "postPlayExperiences", "notifications", "notificationsList", "nonMemberVideos", "searchPage", "searchPageV2", "preQuerySearchV3", "newSearch", "searchByReference");
        d = d2;
    }

    @Override // o.InterfaceC0907He
    public boolean e(String str) {
        C8632dsu.c((Object) str, "");
        return !d.contains(str);
    }
}
