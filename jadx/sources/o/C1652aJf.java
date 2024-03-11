package o;

import com.netflix.mediaclient.ngpstore.api.NgpStoreApi;
import com.netflix.mediaclient.ngpstore.impl.storage.cp.NgpContentProvider;

/* renamed from: o.aJf  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
class C1652aJf extends aIU<NgpStoreApi.c> {
    @Override // o.aIU
    public String d() {
        return NgpContentProvider.COL_NGP_SSO_STORE;
    }

    public C1652aJf(AbstractC1647aJa abstractC1647aJa, NgpStoreApi.e<NgpStoreApi.c> eVar) {
        super(abstractC1647aJa, eVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.aIU
    /* renamed from: c */
    public NgpStoreApi.c d(String str) {
        return (NgpStoreApi.c) e().fromJson(str, (Class<Object>) NgpStoreApi.c.class);
    }
}
