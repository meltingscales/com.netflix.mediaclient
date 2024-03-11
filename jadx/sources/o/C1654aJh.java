package o;

import com.netflix.mediaclient.ngpstore.api.NgpStoreApi;
import com.netflix.mediaclient.ngpstore.impl.storage.cp.NgpContentProvider;

/* renamed from: o.aJh  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
class C1654aJh extends aIZ<NgpStoreApi.d> {
    @Override // o.aIZ
    public String c() {
        return NgpContentProvider.COL_LOGOUT_STORE;
    }

    public C1654aJh(AbstractC1647aJa abstractC1647aJa, NgpStoreApi.d dVar) {
        super(abstractC1647aJa, dVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.aIZ
    /* renamed from: c */
    public String e(NgpStoreApi.d dVar) {
        return e().toJson(dVar);
    }
}
