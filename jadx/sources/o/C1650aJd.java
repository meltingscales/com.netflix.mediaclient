package o;

import com.netflix.mediaclient.ngpstore.api.NgpStoreApi;
import com.netflix.mediaclient.ngpstore.impl.storage.cp.NgpContentProvider;

/* renamed from: o.aJd  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
class C1650aJd extends aIZ<NgpStoreApi.c> {
    @Override // o.aIZ
    public String c() {
        return NgpContentProvider.COL_NGP_SSO_STORE;
    }

    public C1650aJd(AbstractC1647aJa abstractC1647aJa, NgpStoreApi.c cVar) {
        super(abstractC1647aJa, cVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.aIZ
    /* renamed from: d */
    public String e(NgpStoreApi.c cVar) {
        return e().toJson(cVar);
    }
}
