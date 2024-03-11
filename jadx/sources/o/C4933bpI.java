package o;

import android.content.Context;
import com.netflix.mediaclient.service.pservice.PDiskData;
import java.io.File;
import o.InterfaceC8248dgm;

/* renamed from: o.bpI  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4933bpI {
    public static final Boolean a = Boolean.FALSE;
    private static final Object d = new Object();

    /* renamed from: o.bpI$d */
    /* loaded from: classes4.dex */
    public static class d {
        public void d(PDiskData pDiskData) {
            if (C4933bpI.a.booleanValue()) {
                C1044Mm.e("nf_preapp_dataRepo", "onDataLoaded - diskData.print");
                pDiskData.print();
            }
        }
    }

    public static void d(final Context context, final d dVar) {
        C1044Mm.e("nf_preapp_dataRepo", "starting load from Disk");
        InterfaceC8248dgm e2 = e(context);
        a aVar = new a(e2, dVar) { // from class: o.bpI.1
            @Override // o.InterfaceC8248dgm.b
            public void d(InterfaceC8248dgm.d[] dVarArr) {
                if (dVarArr != null && dVarArr.length > 0) {
                    C4933bpI.e(context, d(), dVarArr, dVar);
                    return;
                }
                C1044Mm.e("nf_preapp_dataRepo", "No saved preAppData found.");
                e().d(null);
            }
        };
        synchronized (d) {
            e2.c(aVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void e(final Context context, InterfaceC8248dgm interfaceC8248dgm, InterfaceC8248dgm.d[] dVarArr, d dVar) {
        if (dVarArr == null || dVarArr.length < 1) {
            C1044Mm.e("nf_preapp_dataRepo", "No saved data found");
            dVar.d(null);
            return;
        }
        interfaceC8248dgm.c(dVarArr[0].e(), new e(dVar) { // from class: o.bpI.3
            @Override // o.InterfaceC8248dgm.e
            public void d(String str, String str2, byte[] bArr, long j) {
                PDiskData pDiskData;
                Throwable th;
                PDiskData pDiskData2 = null;
                if (bArr == null || bArr.length < 1) {
                    C1044Mm.d("nf_preapp_dataRepo", "We failed to retrieve payload.");
                } else {
                    try {
                        pDiskData = PDiskData.fromJsonString(new String(bArr, "utf-8"));
                    } catch (Throwable th2) {
                        pDiskData = null;
                        th = th2;
                    }
                    try {
                        C1044Mm.e("nf_preapp_dataRepo", "onDataLoaded: previous version " + pDiskData.version);
                        if (pDiskData.version < 3) {
                            C1044Mm.e("nf_preapp_dataRepo", "onDataLoaded: sanitizing");
                            pDiskData.sanitize();
                            C4933bpI.d(context, pDiskData.toJsonString(), null);
                        }
                        if (C4933bpI.a.booleanValue()) {
                            C1044Mm.e("nf_preapp_dataRepo", "onDataLoaded - diskData.print");
                            pDiskData.print();
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        C1044Mm.e("nf_preapp_dataRepo", "Failed to build object from stored data.", th);
                        pDiskData2 = pDiskData;
                        a().d(pDiskData2);
                    }
                    pDiskData2 = pDiskData;
                }
                a().d(pDiskData2);
            }
        });
    }

    /* renamed from: o.bpI$a */
    /* loaded from: classes4.dex */
    static abstract class a implements InterfaceC8248dgm.b {
        private final d b;
        private final InterfaceC8248dgm e;

        public InterfaceC8248dgm d() {
            return this.e;
        }

        public d e() {
            return this.b;
        }

        public a(InterfaceC8248dgm interfaceC8248dgm, d dVar) {
            this.b = dVar;
            this.e = interfaceC8248dgm;
        }
    }

    /* renamed from: o.bpI$e */
    /* loaded from: classes4.dex */
    static abstract class e implements InterfaceC8248dgm.e {
        private final d c;

        public d a() {
            return this.c;
        }

        public e(d dVar) {
            this.c = dVar;
        }
    }

    private static InterfaceC8248dgm e(Context context) {
        File file = new File(context.getFilesDir(), PDiskData.REPOSITORY_DIR);
        if (!file.isDirectory()) {
            file.mkdirs();
        }
        return new C8249dgn(file);
    }

    public static void d(Context context, String str, InterfaceC8248dgm.c cVar) {
        InterfaceC8248dgm e2 = e(context);
        try {
            C1044Mm.e("nf_preapp_dataRepo", "saving payload to file: REPOSITORY_FILE_NAME");
            a.booleanValue();
            synchronized (d) {
                e2.a(PDiskData.REPOSITORY_FILE_NAME, str.getBytes("utf-8"), null, cVar);
            }
        } catch (Throwable th) {
            C1044Mm.e("nf_preapp_dataRepo", "Failed to save payload to repository", th);
        }
    }

    public static void a(Context context) {
        if (a.booleanValue()) {
            C1044Mm.e("nf_preapp_dataRepo", String.format("clearDiskData", new Object[0]));
        }
        InterfaceC8248dgm e2 = e(context);
        synchronized (d) {
            e2.a();
        }
    }
}
