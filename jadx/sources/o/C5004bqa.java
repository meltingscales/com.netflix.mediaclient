package o;

import com.netflix.mediaclient.service.configuration.persistent.fastproperty.Config_FastProperty_MobileOnly;
import com.netflix.mediaclient.service.user.UserAgent;

/* renamed from: o.bqa  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5004bqa {
    C5004bqa() {
    }

    public static void d(boolean z, UserAgent userAgent, InterfaceC5128bss interfaceC5128bss) {
        if (z) {
            C1044Mm.e("mobileOnlyRestrictions", "Mobile only plan, check restrictions...");
            if (C8151dev.c()) {
                C1044Mm.d("mobileOnlyRestrictions", "Amazon tablets are not allowed to be used for Mobile Only plan!");
                c(userAgent, interfaceC5128bss);
                return;
            } else if (C8150deu.d() || C8150deu.e()) {
                C1044Mm.d("mobileOnlyRestrictions", "Android STB or TV is not allowed for Mobile Only plan!");
                c(userAgent, interfaceC5128bss);
                return;
            } else {
                d(userAgent, interfaceC5128bss, true);
                return;
            }
        }
        C1044Mm.e("mobileOnlyRestrictions", "Not mobile only plan.");
    }

    private static void d(UserAgent userAgent, InterfaceC5128bss interfaceC5128bss, boolean z) {
        if (Config_FastProperty_MobileOnly.isClientCheckEnabled()) {
            return;
        }
        C1044Mm.j("mobileOnlyRestrictions", "Client check is NOT approved. Skip for now");
    }

    private static void c(UserAgent userAgent, InterfaceC5128bss interfaceC5128bss) {
        interfaceC5128bss.b(aMH.c().a().a(AbstractApplicationC1040Mh.d(), C8187dfe.e.a(), userAgent));
    }
}
