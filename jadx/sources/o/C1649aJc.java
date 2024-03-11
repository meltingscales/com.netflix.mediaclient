package o;

import com.netflix.mediaclient.ngpstore.api.NgpStoreApi;
import com.netflix.mediaclient.ngpstore.impl.storage.cp.NgpContentProvider;

/* renamed from: o.aJc  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
class C1649aJc extends aIU<NgpStoreApi.d> {
    @Override // o.aIU
    public String d() {
        return NgpContentProvider.COL_LOGOUT_STORE;
    }

    public C1649aJc(AbstractC1647aJa abstractC1647aJa, NgpStoreApi.e<NgpStoreApi.d> eVar) {
        super(abstractC1647aJa, eVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.aIU
    /* renamed from: c */
    public NgpStoreApi.d d(String str) {
        return (NgpStoreApi.d) e().fromJson(str, (Class<Object>) NgpStoreApi.d.class);
    }
}
