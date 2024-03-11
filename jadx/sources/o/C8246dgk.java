package o;

import android.os.Build;
import com.google.android.gms.auth.blockstore.BlockstoreClient;
import com.google.android.gms.auth.blockstore.DeleteBytesRequest;
import com.google.android.gms.auth.blockstore.RetrieveBytesRequest;
import com.google.android.gms.auth.blockstore.RetrieveBytesResponse;
import com.google.android.gms.auth.blockstore.StoreBytesData;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.List;
import javax.inject.Inject;
import o.C8246dgk;
import o.C8632dsu;
import o.C8674dui;
import o.dpR;

/* renamed from: o.dgk  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C8246dgk {
    public static final b d = new b(null);
    private final BlockstoreClient a;

    /* renamed from: o.dgk$c */
    /* loaded from: classes5.dex */
    public interface c {
        void a();

        void e(Exception exc);
    }

    /* renamed from: o.dgk$e */
    /* loaded from: classes5.dex */
    public interface e {
        void c(Exception exc);

        void c(String str, boolean z);
    }

    @Inject
    public C8246dgk(BlockstoreClient blockstoreClient) {
        C8632dsu.c((Object) blockstoreClient, "");
        this.a = blockstoreClient;
    }

    public final void c(String str, final c cVar) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) cVar, "");
        StoreBytesData.Builder builder = new StoreBytesData.Builder();
        byte[] bytes = str.getBytes(C8674dui.i);
        C8632dsu.a(bytes, "");
        final StoreBytesData.Builder key = builder.setBytes(bytes).setKey("LOGIN_TOKEN_BLOCK_STORE_KEY");
        C8632dsu.a(key, "");
        this.a.isEndToEndEncryptionAvailable().addOnCompleteListener(new OnCompleteListener() { // from class: o.dgp
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                C8246dgk.a(StoreBytesData.Builder.this, this, cVar, task);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(com.google.android.gms.auth.blockstore.StoreBytesData.Builder r2, o.C8246dgk r3, final o.C8246dgk.c r4, com.google.android.gms.tasks.Task r5) {
        /*
            java.lang.String r0 = ""
            o.C8632dsu.c(r2, r0)
            o.C8632dsu.c(r3, r0)
            o.C8632dsu.c(r4, r0)
            o.C8632dsu.c(r5, r0)
            boolean r1 = r5.isSuccessful()
            if (r1 == 0) goto L25
            java.lang.Object r5 = r5.getResult()
            o.C8632dsu.a(r5, r0)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L25
            r5 = 1
            goto L26
        L25:
            r5 = 0
        L26:
            r2.setShouldBackupToCloud(r5)
            com.google.android.gms.auth.blockstore.BlockstoreClient r5 = r3.a
            com.google.android.gms.auth.blockstore.StoreBytesData r2 = r2.build()
            com.google.android.gms.tasks.Task r2 = r5.storeBytes(r2)
            o.dgi r5 = new o.dgi
            com.netflix.mediaclient.util.data.DeviceUpgradeTokenBlockStore$storeLoginToken$2$1 r1 = new com.netflix.mediaclient.util.data.DeviceUpgradeTokenBlockStore$storeLoginToken$2$1
            r1.<init>()
            r5.<init>()
            com.google.android.gms.tasks.Task r2 = r2.addOnSuccessListener(r5)
            o.dgl r5 = new o.dgl
            r5.<init>()
            r2.addOnFailureListener(r5)
            java.lang.String r2 = r3.d()
            if (r2 == 0) goto L73
            com.google.android.gms.auth.blockstore.StoreBytesData$Builder r4 = new com.google.android.gms.auth.blockstore.StoreBytesData$Builder
            r4.<init>()
            java.nio.charset.Charset r5 = o.C8674dui.i
            byte[] r2 = r2.getBytes(r5)
            o.C8632dsu.a(r2, r0)
            com.google.android.gms.auth.blockstore.StoreBytesData$Builder r2 = r4.setBytes(r2)
            java.lang.String r4 = "DEVICE_INFO_BLOCK_STORE_KEY"
            com.google.android.gms.auth.blockstore.StoreBytesData$Builder r2 = r2.setKey(r4)
            o.C8632dsu.a(r2, r0)
            com.google.android.gms.auth.blockstore.BlockstoreClient r3 = r3.a
            com.google.android.gms.auth.blockstore.StoreBytesData r2 = r2.build()
            r3.storeBytes(r2)
        L73:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C8246dgk.a(com.google.android.gms.auth.blockstore.StoreBytesData$Builder, o.dgk, o.dgk$c, com.google.android.gms.tasks.Task):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        drm.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(c cVar, Exception exc) {
        C8632dsu.c((Object) cVar, "");
        C8632dsu.c((Object) exc, "");
        cVar.e(exc);
    }

    public final void d(final e eVar) {
        List<String> e2;
        List<String> e3;
        C8632dsu.c((Object) eVar, "");
        RetrieveBytesRequest.Builder builder = new RetrieveBytesRequest.Builder();
        e2 = C8566dqi.e("LOGIN_TOKEN_BLOCK_STORE_KEY");
        RetrieveBytesRequest build = builder.setKeys(e2).build();
        C8632dsu.a(build, "");
        RetrieveBytesRequest.Builder builder2 = new RetrieveBytesRequest.Builder();
        e3 = C8566dqi.e("DEVICE_INFO_BLOCK_STORE_KEY");
        RetrieveBytesRequest build2 = builder2.setKeys(e3).build();
        C8632dsu.a(build2, "");
        final Task<RetrieveBytesResponse> addOnFailureListener = this.a.retrieveBytes(build).addOnFailureListener(new OnFailureListener() { // from class: o.dgq
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                C8246dgk.d(C8246dgk.e.this, exc);
            }
        });
        C8632dsu.a(addOnFailureListener, "");
        final Task<RetrieveBytesResponse> addOnFailureListener2 = this.a.retrieveBytes(build2).addOnFailureListener(new OnFailureListener() { // from class: o.dgo
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                C8246dgk.b(C8246dgk.e.this, exc);
            }
        });
        C8632dsu.a(addOnFailureListener2, "");
        Task whenAllSuccess = Tasks.whenAllSuccess(addOnFailureListener, addOnFailureListener2);
        final drM<List<RetrieveBytesRequest>, dpR> drm = new drM<List<RetrieveBytesRequest>, dpR>() { // from class: com.netflix.mediaclient.util.data.DeviceUpgradeTokenBlockStore$retrieveLoginToken$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(List<RetrieveBytesRequest> list) {
                e(list);
                return dpR.c;
            }

            public final void e(List<RetrieveBytesRequest> list) {
                String str;
                String d2;
                boolean z;
                String d3;
                RetrieveBytesResponse.BlockstoreData blockstoreData = addOnFailureListener.getResult().getBlockstoreDataMap().get("LOGIN_TOKEN_BLOCK_STORE_KEY");
                String str2 = null;
                if (blockstoreData != null) {
                    byte[] bytes = blockstoreData.getBytes();
                    C8632dsu.a(bytes, "");
                    str = new String(bytes, C8674dui.i);
                } else {
                    str = null;
                }
                if (str == null) {
                    if (addOnFailureListener.getResult().getBlockstoreDataMap().containsKey("LOGIN_TOKEN_BLOCK_STORE_KEY")) {
                        C8246dgk.e eVar2 = eVar;
                        C8246dgk.b bVar = C8246dgk.d;
                        eVar2.c(new Exception("no login token is stored"));
                        return;
                    }
                    C8246dgk.e eVar3 = eVar;
                    C8246dgk.b bVar2 = C8246dgk.d;
                    eVar3.c(new Exception("stored token is null"));
                    return;
                }
                C8246dgk.d.getLogTag();
                RetrieveBytesResponse.BlockstoreData blockstoreData2 = addOnFailureListener2.getResult().getBlockstoreDataMap().get("DEVICE_INFO_BLOCK_STORE_KEY");
                if (blockstoreData2 != null) {
                    byte[] bytes2 = blockstoreData2.getBytes();
                    C8632dsu.a(bytes2, "");
                    str2 = new String(bytes2, C8674dui.i);
                }
                d2 = this.d();
                if (d2 != null && str2 != null) {
                    d3 = this.d();
                    if (!C8632dsu.c((Object) str2, (Object) d3)) {
                        z = true;
                        eVar.c(str, z);
                    }
                }
                z = false;
                eVar.c(str, z);
            }
        };
        whenAllSuccess.addOnSuccessListener(new OnSuccessListener() { // from class: o.dgr
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                C8246dgk.d(drM.this, obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(e eVar, Exception exc) {
        C8632dsu.c((Object) eVar, "");
        C8632dsu.c((Object) exc, "");
        eVar.c(exc);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(e eVar, Exception exc) {
        C8632dsu.c((Object) eVar, "");
        C8632dsu.c((Object) exc, "");
        eVar.c(exc);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        drm.invoke(obj);
    }

    public final void a() {
        List<String> e2;
        List<String> e3;
        DeleteBytesRequest.Builder builder = new DeleteBytesRequest.Builder();
        e2 = C8566dqi.e("LOGIN_TOKEN_BLOCK_STORE_KEY");
        DeleteBytesRequest build = builder.setKeys(e2).build();
        C8632dsu.a(build, "");
        DeleteBytesRequest.Builder builder2 = new DeleteBytesRequest.Builder();
        e3 = C8566dqi.e("DEVICE_INFO_BLOCK_STORE_KEY");
        DeleteBytesRequest build2 = builder2.setKeys(e3).build();
        C8632dsu.a(build2, "");
        BlockstoreClient blockstoreClient = this.a;
        blockstoreClient.deleteBytes(build);
        blockstoreClient.deleteBytes(build2);
        d.getLogTag();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String d() {
        String str;
        String str2 = Build.BRAND;
        if (str2 == null || (str = Build.MODEL) == null) {
            return null;
        }
        return str2 + "_" + str;
    }

    /* renamed from: o.dgk$b */
    /* loaded from: classes5.dex */
    public static final class b extends C1045Mp {
        public /* synthetic */ b(C8627dsp c8627dsp) {
            this();
        }

        private b() {
            super("LoginTokenBlockStore");
        }
    }
}
