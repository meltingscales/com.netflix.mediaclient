package o;

import android.content.Context;
import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.api.res.AssetType;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import o.C1079Nx;

/* renamed from: o.bcX  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C4332bcX extends AbstractC4323bcO {
    private AtomicBoolean a;
    private RandomAccessFile b;
    private AtomicBoolean c;
    private final Context d;
    private final InterfaceC4325bcQ e;
    private final String f;
    private InterfaceC4942bpR g;
    private final ArrayList<String> i;
    private final long j;

    @Override // o.AbstractC4323bcO
    protected RandomAccessFile e() {
        return this.b;
    }

    @Override // o.AbstractC4323bcO, o.InterfaceC4326bcR
    public /* bridge */ /* synthetic */ ByteBuffer b(int i) {
        return super.b(i);
    }

    public C4332bcX(long j, InterfaceC4942bpR interfaceC4942bpR, C4540bgT[] c4540bgTArr, InterfaceC4325bcQ interfaceC4325bcQ) {
        this.c = new AtomicBoolean(false);
        this.a = new AtomicBoolean(false);
        this.i = new ArrayList<>(4);
        this.d = AbstractApplicationC1040Mh.d();
        this.f = "bif.tmp";
        this.g = interfaceC4942bpR;
        this.j = j;
        this.e = interfaceC4325bcQ;
        int i = 0;
        while (true) {
            if (i >= c4540bgTArr.length) {
                i = -1;
                break;
            }
            String[] b = c4540bgTArr[i].b();
            if (c4540bgTArr[i].d() == 1.0f) {
                for (int i2 = 0; i2 < b.length; i2++) {
                    C1044Mm.a("BifManager", "preferred url%d == %s", Integer.valueOf(i2), b[i2]);
                    this.i.add(b[i2]);
                }
            } else {
                i++;
            }
        }
        for (int i3 = 0; i3 < c4540bgTArr.length; i3++) {
            if (i != i3) {
                for (String str : c4540bgTArr[i3].b()) {
                    this.i.add(str);
                }
            }
        }
        C1044Mm.a("BifManager", "%d TrickplayUrls entities with %d urls", Integer.valueOf(c4540bgTArr.length), Integer.valueOf(this.i.size()));
        a();
    }

    public C4332bcX(InterfaceC4942bpR interfaceC4942bpR, String str) {
        this.c = new AtomicBoolean(false);
        this.a = new AtomicBoolean(false);
        ArrayList<String> arrayList = new ArrayList<>(4);
        this.i = arrayList;
        this.f = "mdxbif.tmp";
        this.d = AbstractApplicationC1040Mh.d();
        this.g = interfaceC4942bpR;
        arrayList.add(str);
        this.j = 0L;
        this.e = null;
        a();
    }

    private void a() {
        if (this.i.size() > 0) {
            d(this.i.get(0), 1);
        } else {
            C1044Mm.d("BifManager", "Unable to download Bif, no URLs!");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(String str, final int i) {
        InterfaceC4943bpS interfaceC4943bpS = new InterfaceC4943bpS() { // from class: o.bcX.3
            @Override // o.InterfaceC4943bpS
            public void b(String str2, String str3, long j, long j2, Status status) {
            }

            @Override // o.InterfaceC4943bpS
            public void b(String str2, String str3, Status status) {
            }

            @Override // o.InterfaceC4943bpS
            public void d(String str2, byte[] bArr, Status status) {
                if (C4332bcX.this.a.get()) {
                    return;
                }
                if (status.i()) {
                    C1044Mm.j("BifManager", "Resource %s could not be fetched or retrieved from cache, status %d", str2, Integer.valueOf(status.c().getValue()));
                    if (i < C4332bcX.this.i.size()) {
                        String str3 = (String) C4332bcX.this.i.get(i);
                        if (C4332bcX.this.a.get()) {
                            C1044Mm.e("BifManager", "Fetch was canceled, stop");
                            return;
                        }
                        C1044Mm.a("BifManager", "Try to fetch %d URL %s", Integer.valueOf(i), str3);
                        C4332bcX.this.d(str3, i + 1);
                        return;
                    }
                    C1044Mm.d("BifManager", "We fail to download bif completely, all URLs failed");
                    return;
                }
                Object[] objArr = new Object[3];
                objArr[0] = str2;
                objArr[1] = Integer.valueOf(bArr != null ? bArr.length : -1);
                objArr[2] = Integer.valueOf(status.c().getValue());
                C1044Mm.a("BifManager", "Resource %s fetched, size %d, status %d", objArr);
                if (C4332bcX.this.e != null) {
                    C4332bcX.this.e.d(C4332bcX.this.j, bArr != null ? bArr.length : 0L);
                }
                C4332bcX.this.c(bArr);
            }
        };
        InterfaceC4942bpR interfaceC4942bpR = this.g;
        if (interfaceC4942bpR != null) {
            interfaceC4942bpR.b(str, AssetType.bif, interfaceC4943bpS);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(final byte[] bArr) {
        new C1071Np().d(new C1079Nx.b() { // from class: o.bcU
            @Override // o.C1079Nx.b
            public final void run() {
                C4332bcX.this.e(bArr);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0088 A[Catch: Exception -> 0x008b, TRY_LEAVE, TryCatch #3 {Exception -> 0x008b, blocks: (B:35:0x0083, B:37:0x0088), top: B:44:0x0083 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0083 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void e(byte[] r6) {
        /*
            r5 = this;
            r0 = 0
            r1 = 0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L67 java.io.IOException -> L6a
            r2.<init>()     // Catch: java.lang.Throwable -> L67 java.io.IOException -> L6a
            android.content.Context r3 = r5.d     // Catch: java.lang.Throwable -> L67 java.io.IOException -> L6a
            java.io.File r3 = r3.getFilesDir()     // Catch: java.lang.Throwable -> L67 java.io.IOException -> L6a
            r2.append(r3)     // Catch: java.lang.Throwable -> L67 java.io.IOException -> L6a
            java.lang.String r3 = "/"
            r2.append(r3)     // Catch: java.lang.Throwable -> L67 java.io.IOException -> L6a
            java.lang.String r3 = r5.f     // Catch: java.lang.Throwable -> L67 java.io.IOException -> L6a
            r2.append(r3)     // Catch: java.lang.Throwable -> L67 java.io.IOException -> L6a
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L67 java.io.IOException -> L6a
            android.content.Context r3 = r5.d     // Catch: java.lang.Throwable -> L67 java.io.IOException -> L6a
            java.lang.String r4 = r5.f     // Catch: java.lang.Throwable -> L67 java.io.IOException -> L6a
            java.io.FileOutputStream r3 = r3.openFileOutput(r4, r0)     // Catch: java.lang.Throwable -> L67 java.io.IOException -> L6a
            r3.write(r6)     // Catch: java.lang.Throwable -> L5f java.io.IOException -> L63
            android.content.Context r6 = r5.d     // Catch: java.lang.Throwable -> L5f java.io.IOException -> L63
            java.lang.String r4 = r5.f     // Catch: java.lang.Throwable -> L5f java.io.IOException -> L63
            java.io.FileInputStream r1 = r6.openFileInput(r4)     // Catch: java.lang.Throwable -> L5f java.io.IOException -> L63
            boolean r6 = r5.d(r1)     // Catch: java.lang.Throwable -> L5f java.io.IOException -> L63
            if (r6 == 0) goto L46
            java.io.RandomAccessFile r6 = new java.io.RandomAccessFile     // Catch: java.lang.Throwable -> L5f java.io.IOException -> L63
            java.lang.String r4 = "r"
            r6.<init>(r2, r4)     // Catch: java.lang.Throwable -> L5f java.io.IOException -> L63
            r5.b = r6     // Catch: java.lang.Throwable -> L5f java.io.IOException -> L63
            java.util.concurrent.atomic.AtomicBoolean r6 = r5.c     // Catch: java.lang.Throwable -> L5f java.io.IOException -> L63
            r2 = 1
            r6.set(r2)     // Catch: java.lang.Throwable -> L5f java.io.IOException -> L63
        L46:
            monitor-enter(r5)     // Catch: java.lang.Throwable -> L5f java.io.IOException -> L63
            java.util.concurrent.atomic.AtomicBoolean r6 = r5.a     // Catch: java.lang.Throwable -> L5c
            boolean r6 = r6.get()     // Catch: java.lang.Throwable -> L5c
            if (r6 == 0) goto L52
            r5.b()     // Catch: java.lang.Throwable -> L5c
        L52:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L5c
            r3.close()     // Catch: java.lang.Exception -> L7f
            if (r1 == 0) goto L7f
            r1.close()     // Catch: java.lang.Exception -> L7f
            goto L7f
        L5c:
            r6 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L5c
            throw r6     // Catch: java.lang.Throwable -> L5f java.io.IOException -> L63
        L5f:
            r6 = move-exception
            r2 = r1
            r1 = r3
            goto L81
        L63:
            r6 = move-exception
            r2 = r1
            r1 = r3
            goto L6c
        L67:
            r6 = move-exception
            r2 = r1
            goto L81
        L6a:
            r6 = move-exception
            r2 = r1
        L6c:
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch: java.lang.Throwable -> L80
            java.lang.String r3 = "BifManager"
            java.lang.String r4 = "loadBifIndexAsync has exception"
            o.C1044Mm.b(r3, r6, r4, r0)     // Catch: java.lang.Throwable -> L80
            if (r1 == 0) goto L7a
            r1.close()     // Catch: java.lang.Exception -> L7f
        L7a:
            if (r2 == 0) goto L7f
            r2.close()     // Catch: java.lang.Exception -> L7f
        L7f:
            return
        L80:
            r6 = move-exception
        L81:
            if (r1 == 0) goto L86
            r1.close()     // Catch: java.lang.Exception -> L8b
        L86:
            if (r2 == 0) goto L8b
            r2.close()     // Catch: java.lang.Exception -> L8b
        L8b:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C4332bcX.e(byte[]):void");
    }

    @Override // o.AbstractC4323bcO
    protected boolean c() {
        return this.c.get();
    }

    @Override // o.InterfaceC4326bcR
    public void d() {
        synchronized (this) {
            this.a.set(true);
            b();
            C1044Mm.e("BifManager", "released");
        }
    }

    private void b() {
        RandomAccessFile randomAccessFile = this.b;
        if (randomAccessFile != null) {
            try {
                randomAccessFile.close();
            } catch (IOException e) {
                C1044Mm.b("BifManager", e, "close file " + e, new Object[0]);
            }
        }
        this.d.deleteFile(this.f);
    }
}
