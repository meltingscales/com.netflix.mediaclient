package o;

import android.content.Context;
import com.netflix.mediaclient.ngpstore.api.NgpStoreApi;

/* renamed from: o.aPr  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1826aPr {

    /* renamed from: o.aPr$c */
    /* loaded from: classes3.dex */
    public interface c {
        void d(NgpStoreApi.a aVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(Context context, NgpStoreApi ngpStoreApi, String str) {
        NgpStoreApi.a aVar = new NgpStoreApi.a();
        aVar.b = str;
        aVar.c = System.currentTimeMillis();
        aVar.e = context.getPackageName();
        ngpStoreApi.writeDeviceIdStore(aVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void d(NgpStoreApi ngpStoreApi, final c cVar) {
        ngpStoreApi.readDeviceIdStore(new NgpStoreApi.e<NgpStoreApi.a>() { // from class: o.aPr.1
            @Override // com.netflix.mediaclient.ngpstore.api.NgpStoreApi.e
            /* renamed from: c  reason: avoid collision after fix types in other method */
            public void d(NgpStoreApi.a aVar) {
                c.this.d(aVar);
            }

            @Override // com.netflix.mediaclient.ngpstore.api.NgpStoreApi.e
            /* renamed from: a */
            public boolean c(NgpStoreApi.a aVar) {
                return aVar != null && C8168dfL.h(aVar.b);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void c(NgpStoreApi ngpStoreApi, Context context, String str) {
        NgpStoreApi.c cVar = new NgpStoreApi.c();
        cVar.a = System.currentTimeMillis();
        cVar.e = str;
        cVar.b = context.getPackageName();
        ngpStoreApi.writeSsoStore(cVar);
    }

    public static void d(NgpStoreApi ngpStoreApi, Context context) {
        NgpStoreApi.d dVar = new NgpStoreApi.d();
        long currentTimeMillis = System.currentTimeMillis();
        dVar.a = currentTimeMillis;
        dVar.d = currentTimeMillis;
        dVar.b = context.getPackageName();
        ngpStoreApi.writeLogoutStore(dVar);
    }
}
