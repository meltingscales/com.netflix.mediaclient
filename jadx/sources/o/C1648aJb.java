package o;

import com.netflix.mediaclient.ngpstore.api.NgpStoreApi;
import com.netflix.mediaclient.ngpstore.impl.storage.cp.NgpContentProvider;

/* renamed from: o.aJb  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
class C1648aJb extends aIZ<NgpStoreApi.a> {
    @Override // o.aIZ
    public String c() {
        return NgpContentProvider.COL_NGP_DEVICE_ID_STORE;
    }

    public C1648aJb(AbstractC1647aJa abstractC1647aJa, NgpStoreApi.a aVar) {
        super(abstractC1647aJa, aVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.aIZ
    /* renamed from: a */
    public String e(NgpStoreApi.a aVar) {
        return e().toJson(aVar);
    }
}
