package o;

import com.netflix.mediaclient.ngpstore.api.NgpStoreApi;
import com.netflix.mediaclient.ngpstore.impl.storage.cp.NgpContentProvider;

/* renamed from: o.aJe  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
class C1651aJe extends aIU<NgpStoreApi.a> {
    @Override // o.aIU
    public String d() {
        return NgpContentProvider.COL_NGP_DEVICE_ID_STORE;
    }

    public C1651aJe(AbstractC1647aJa abstractC1647aJa, NgpStoreApi.e<NgpStoreApi.a> eVar) {
        super(abstractC1647aJa, eVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.aIU
    /* renamed from: c */
    public NgpStoreApi.a d(String str) {
        return (NgpStoreApi.a) e().fromJson(str, (Class<Object>) NgpStoreApi.a.class);
    }
}
