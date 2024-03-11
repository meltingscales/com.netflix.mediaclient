package o;

import java.util.List;

/* loaded from: classes3.dex */
public final class JV {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(InterfaceC1242Ud interfaceC1242Ud, List<InterfaceC1242Ud> list) {
        list.add(a(interfaceC1242Ud));
        list.add(b(interfaceC1242Ud));
        list.add(e(interfaceC1242Ud));
        list.add(d(interfaceC1242Ud));
        list.add(c(interfaceC1242Ud));
    }

    private static final InterfaceC1242Ud a(InterfaceC1242Ud interfaceC1242Ud) {
        InterfaceC1242Ud d = interfaceC1242Ud.d(IE.b("listItem", IE.c("summary", "detail")));
        C8632dsu.a(d, "");
        return d;
    }

    private static final InterfaceC1242Ud d(InterfaceC1242Ud interfaceC1242Ud) {
        InterfaceC1242Ud d = interfaceC1242Ud.d(IE.b("listItem", "topNode", "episodes", "current", "detail"));
        C8632dsu.a(d, "");
        return d;
    }

    private static final InterfaceC1242Ud b(InterfaceC1242Ud interfaceC1242Ud) {
        InterfaceC1242Ud d = interfaceC1242Ud.d(IE.b("listItem", "topNode", IE.c("summary", "detail", "inRemindMeQueue", "inQueue", "artworkColors", "tags", "synopsisDP", "advisories")));
        C8632dsu.a(d, "");
        return d;
    }

    private static final InterfaceC1242Ud e(InterfaceC1242Ud interfaceC1242Ud) {
        InterfaceC1242Ud d = interfaceC1242Ud.d(IE.b("listItem", "topNode", "brandAndGenreBadge"));
        C8632dsu.a(d, "");
        return d;
    }

    private static final InterfaceC1242Ud c(InterfaceC1242Ud interfaceC1242Ud) {
        InterfaceC1242Ud d = interfaceC1242Ud.d(IE.b("itemEvidence"));
        C8632dsu.a(d, "");
        return d;
    }
}
