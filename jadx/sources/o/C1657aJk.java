package o;

import com.netflix.mediaclient.ngpstore.api.NgpStoreApi;

/* renamed from: o.aJk  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1657aJk extends AbstractC1647aJa {
    @Override // com.netflix.mediaclient.ngpstore.api.NgpStoreApi
    public void readDeviceIdStore(NgpStoreApi.e<NgpStoreApi.a> eVar) {
        new C1651aJe(this, eVar).c();
    }

    @Override // com.netflix.mediaclient.ngpstore.api.NgpStoreApi
    public void readSsoStore(NgpStoreApi.e<NgpStoreApi.c> eVar) {
        new C1652aJf(this, eVar).c();
    }

    @Override // com.netflix.mediaclient.ngpstore.api.NgpStoreApi
    public void readLogoutStore(NgpStoreApi.e<NgpStoreApi.d> eVar) {
        new C1649aJc(this, eVar).c();
    }

    @Override // com.netflix.mediaclient.ngpstore.api.NgpStoreApi
    public void writeDeviceIdStore(NgpStoreApi.a aVar) {
        new C1648aJb(this, aVar).d();
    }

    @Override // com.netflix.mediaclient.ngpstore.api.NgpStoreApi
    public void writeSsoStore(NgpStoreApi.c cVar) {
        new C1650aJd(this, cVar).d();
    }

    @Override // com.netflix.mediaclient.ngpstore.api.NgpStoreApi
    public void writeLogoutStore(NgpStoreApi.d dVar) {
        new C1654aJh(this, dVar).d();
    }
}
