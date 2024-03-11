package o;

import com.netflix.mediaclient.util.l10n.AdChoicesHelper$fetchAdChoiceUrl$1;
import io.reactivex.Single;
import io.reactivex.SingleSource;
import io.reactivex.functions.Function;
import javax.inject.Inject;
import o.aCE;

/* renamed from: o.dht  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C8308dht {
    private final aCI a;

    @Inject
    public C8308dht(aCI aci) {
        C8632dsu.c((Object) aci, "");
        this.a = aci;
    }

    public final Single<String> b(String str) {
        if (str == null) {
            Single<String> just = Single.just("");
            C8632dsu.a(just, "");
            return just;
        }
        Single e = aCE.d.e(this.a, new YT("cross-platform-ui", "showAdChoicesFooter"), null, null, false, 14, null);
        final AdChoicesHelper$fetchAdChoiceUrl$1 adChoicesHelper$fetchAdChoiceUrl$1 = new AdChoicesHelper$fetchAdChoiceUrl$1(this, str);
        Single<String> flatMap = e.flatMap(new Function() { // from class: o.dhr
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                SingleSource e2;
                e2 = C8308dht.e(drM.this, obj);
                return e2;
            }
        });
        C8632dsu.a(flatMap, "");
        return flatMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SingleSource e(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        C8632dsu.c(obj, "");
        return (SingleSource) drm.invoke(obj);
    }
}
