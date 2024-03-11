package com.netflix.mediaclient.util.l10n;

import com.netflix.mediaclient.graphql.models.type.CountryCode;
import com.netflix.mediaclient.util.l10n.AdChoicesHelper$fetchAdChoiceUrl$1;
import io.reactivex.Single;
import io.reactivex.SingleSource;
import io.reactivex.functions.Function;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import o.C8308dht;
import o.C8632dsu;
import o.C8954gU;
import o.YT;
import o.aCE;
import o.aCI;
import o.drM;

/* loaded from: classes5.dex */
public final class AdChoicesHelper$fetchAdChoiceUrl$1 extends Lambda implements drM<C8954gU<YT.b>, SingleSource<? extends String>> {
    final /* synthetic */ String b;
    final /* synthetic */ C8308dht d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdChoicesHelper$fetchAdChoiceUrl$1(C8308dht c8308dht, String str) {
        super(1);
        this.d = c8308dht;
        this.b = str;
    }

    @Override // o.drM
    /* renamed from: c */
    public final SingleSource<? extends String> invoke(C8954gU<YT.b> c8954gU) {
        aCI aci;
        boolean z;
        YT.j b;
        YT.j b2;
        YT.c a;
        CountryCode b3;
        C8632dsu.c((Object) c8954gU, "");
        YT.b bVar = c8954gU.d;
        Object obj = null;
        if (bVar != null) {
            String str = this.b;
            List<YT.a> c = bVar.c();
            if (c != null) {
                Iterator<T> it = c.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    YT.a aVar = (YT.a) next;
                    if (C8632dsu.c((Object) ((aVar == null || (b2 = aVar.b()) == null || (a = b2.a()) == null || (b3 = a.b()) == null) ? null : b3.a()), (Object) str)) {
                        obj = next;
                        break;
                    }
                }
                YT.a aVar2 = (YT.a) obj;
                if (aVar2 != null && (b = aVar2.b()) != null) {
                    z = C8632dsu.c(b.b(), Boolean.TRUE);
                    obj = Boolean.valueOf(z);
                }
            }
            z = false;
            obj = Boolean.valueOf(z);
        }
        if (C8632dsu.c(obj, Boolean.TRUE)) {
            aci = this.d.a;
            Single e = aCE.d.e(aci, new YT("cross-platform-ui", "showAdChoicesFooterUrl"), null, null, false, 14, null);
            final String str2 = this.b;
            final drM<C8954gU<YT.b>, String> drm = new drM<C8954gU<YT.b>, String>() { // from class: com.netflix.mediaclient.util.l10n.AdChoicesHelper$fetchAdChoiceUrl$1.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // o.drM
                /* renamed from: b */
                public final String invoke(C8954gU<YT.b> c8954gU2) {
                    Object obj2;
                    YT.g c2;
                    Object d;
                    YT.g c3;
                    YT.e e2;
                    CountryCode d2;
                    C8632dsu.c((Object) c8954gU2, "");
                    YT.b bVar2 = c8954gU2.d;
                    if (bVar2 != null) {
                        String str3 = str2;
                        List<YT.a> c4 = bVar2.c();
                        String str4 = null;
                        if (c4 != null) {
                            Iterator<T> it2 = c4.iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    obj2 = null;
                                    break;
                                }
                                obj2 = it2.next();
                                YT.a aVar3 = (YT.a) obj2;
                                if (C8632dsu.c((Object) ((aVar3 == null || (c3 = aVar3.c()) == null || (e2 = c3.e()) == null || (d2 = e2.d()) == null) ? null : d2.a()), (Object) str3)) {
                                    break;
                                }
                            }
                            YT.a aVar4 = (YT.a) obj2;
                            if (aVar4 != null && (c2 = aVar4.c()) != null && (d = c2.d()) != null) {
                                str4 = d.toString();
                            }
                        }
                        return str4 == null ? "" : str4;
                    }
                    return "";
                }
            };
            return e.map(new Function() { // from class: o.dhs
                @Override // io.reactivex.functions.Function
                public final Object apply(Object obj2) {
                    String d;
                    d = AdChoicesHelper$fetchAdChoiceUrl$1.d(drM.this, obj2);
                    return d;
                }
            });
        }
        return Single.just("");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String d(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        C8632dsu.c(obj, "");
        return (String) drm.invoke(obj);
    }
}
