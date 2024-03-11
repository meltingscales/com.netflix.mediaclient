package o;

import java.util.ArrayList;
import java.util.List;
import o.C8632dsu;
import o.InterfaceC9145k;
import o.InterfaceC9357o;
import o.InterfaceC9569s;
import o.dpR;

/* renamed from: o.jg  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9125jg {
    public static final InterfaceC9126jh e(InterfaceC9569s interfaceC9569s) {
        C8632dsu.c((Object) interfaceC9569s, "");
        C9127ji.c(interfaceC9569s, c());
        final ArrayList arrayList = new ArrayList();
        try {
            InterfaceC9569s.e.a(interfaceC9569s, null, "SELECT name FROM sqlite_master WHERE type='table' ORDER BY name;", new drM<InterfaceC9145k, InterfaceC9357o<dpR>>() { // from class: com.apollographql.apollo3.cache.normalized.sql.internal.FactoryHelpersKt$createRecordDatabase$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // o.drM
                /* renamed from: c */
                public final InterfaceC9357o<dpR> invoke(InterfaceC9145k interfaceC9145k) {
                    C8632dsu.c((Object) interfaceC9145k, "");
                    while (interfaceC9145k.c().d().booleanValue()) {
                        List<String> list = arrayList;
                        String e = interfaceC9145k.e(0);
                        if (e == null) {
                            e = "";
                        }
                        list.add(e);
                    }
                    return InterfaceC9357o.d.d(InterfaceC9357o.e.e());
                }
            }, 0, null, 16, null);
        } catch (Exception e) {
            C9137js.d().invoke(new Exception("An exception occurred while looking up the table names", e));
        }
        if (!arrayList.isEmpty() && !arrayList.contains("records")) {
            throw new IllegalStateException(("Apollo: Cannot find the 'records' table? (found '" + arrayList + "' instead)").toString());
        }
        return new C9124jf(InterfaceC9128jj.d.a(interfaceC9569s).d());
    }

    public static final InterfaceC9410p<InterfaceC9357o.d<dpR>> c() {
        return InterfaceC9128jj.d.a();
    }
}
