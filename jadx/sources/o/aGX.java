package o;

import com.netflix.mediaclient.service.user.UserAgent;
import java.util.List;

/* loaded from: classes3.dex */
public final class aGX extends C1045Mp {
    public static final aGX e = new aGX();

    private aGX() {
        super("nf_local_discovery");
    }

    public final boolean e() {
        InterfaceC5283bvo j;
        UserAgent k = AbstractApplicationC1040Mh.getInstance().i().k();
        if (k == null || (j = k.j()) == null) {
            return false;
        }
        return j.isKidsProfile();
    }

    public final String a() {
        UserAgent k = AbstractApplicationC1040Mh.getInstance().i().k();
        if (k != null) {
            return k.a();
        }
        return null;
    }

    public final boolean d(String str, List<String> list) {
        C8632dsu.c((Object) list, "");
        if (str == null) {
            return false;
        }
        boolean e2 = C8135def.e.e(list, str, true);
        getLogTag();
        return e2;
    }
}
