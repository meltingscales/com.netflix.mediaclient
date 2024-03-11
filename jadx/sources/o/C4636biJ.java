package o;

import android.os.Handler;
import android.os.Message;
import androidx.media3.common.PriorityTaskManager;
import androidx.media3.datasource.DataSource;
import androidx.media3.datasource.DataSpec;
import androidx.media3.datasource.PriorityDataSource;
import androidx.media3.datasource.cache.CacheDataSource;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;

/* renamed from: o.biJ  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C4636biJ {
    private final CacheDataSource a;
    private final InterfaceC4800bmi c;
    private final CacheDataSource d;
    private final C4677biy e;
    private final Handler f;
    private final PriorityTaskManager g;
    private final DataSource i;
    private Queue<b> h = new LinkedList();
    private Handler.Callback b = new Handler.Callback() { // from class: o.biJ.3
        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what != 4096) {
                return true;
            }
            C4636biJ.this.b();
            return true;
        }
    };

    /* renamed from: o.biJ$d */
    /* loaded from: classes3.dex */
    public interface d<T> {
        void c();

        void c(T t);
    }

    public C4636biJ(C4677biy c4677biy, InterfaceC4793bmb interfaceC4793bmb, PriorityTaskManager priorityTaskManager) {
        this.f = new Handler(c4677biy.f(), this.b);
        this.e = c4677biy;
        this.g = priorityTaskManager;
        InterfaceC4800bmi c = interfaceC4793bmb.c(null, null, new C4653bia(10000, 10000, 8192, false));
        this.c = c;
        if (priorityTaskManager != null) {
            this.i = interfaceC4793bmb.e(new PriorityDataSource(c, priorityTaskManager, -1000));
        } else {
            this.i = interfaceC4793bmb.e(c);
        }
        this.a = new CacheDataSource(c4677biy, this.i, 3);
        this.d = new CacheDataSource(c4677biy, interfaceC4793bmb.e(c), 3);
    }

    public void e(DataSpec dataSpec, boolean z, d<Void> dVar) {
        synchronized (this.h) {
            this.h.add(new b(dataSpec, null, false, z, dVar));
        }
        this.f.sendEmptyMessage(4096);
    }

    public void a(DataSpec dataSpec, InterfaceC4834bnP interfaceC4834bnP, d<byte[]> dVar) {
        synchronized (this.h) {
            this.h.add(new b(dataSpec, interfaceC4834bnP, true, false, dVar));
        }
        this.f.sendEmptyMessage(4096);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00cd A[Catch: all -> 0x0068, TRY_LEAVE, TryCatch #3 {all -> 0x0068, blocks: (B:14:0x001f, B:16:0x0023, B:18:0x0034, B:20:0x0038, B:21:0x003b, B:17:0x002c, B:30:0x006c, B:32:0x0085, B:39:0x0092, B:41:0x00ab, B:50:0x00ba, B:52:0x00cd), top: B:68:0x001f, inners: #6, #5 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void b() {
        /*
            Method dump skipped, instructions count: 235
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C4636biJ.b():void");
    }

    private long d(DataSpec dataSpec, boolean z) {
        DataSpec dataSpec2 = dataSpec;
        byte[] bArr = new byte[8192];
        long j = dataSpec2.absoluteStreamPosition;
        long j2 = dataSpec2.length;
        CacheDataSource cacheDataSource = z ? this.d : this.a;
        long j3 = 0;
        while (true) {
            if (!z) {
                PriorityTaskManager priorityTaskManager = this.g;
                if (priorityTaskManager != null) {
                    priorityTaskManager.proceed(-1000);
                }
            }
            try {
                break;
            } catch (PriorityTaskManager.PriorityTooLowException unused) {
                try {
                    long j4 = j2 - 0;
                    C1044Mm.d("nf_cache", "prefetch interrupted after reading %s bytes. rescheduling %d remaining", 0L, Long.valueOf(j4));
                    long j5 = j + 0;
                    DataSpec dataSpec3 = new DataSpec(dataSpec2.uri, dataSpec2.httpBody, j5, j5, j4, dataSpec2.key, dataSpec2.flags);
                    C4632biF.a(cacheDataSource);
                    dataSpec2 = dataSpec3;
                } finally {
                    C4632biF.a(cacheDataSource);
                }
            }
        }
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        cacheDataSource.open(dataSpec2);
        while (j3 != j2) {
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            int read = cacheDataSource.read(bArr, 0, (int) Math.min(8192, j2 - j3));
            if (read == -1) {
                return j3;
            }
            j3 += read;
        }
        return j3;
    }

    private byte[] b(DataSpec dataSpec, InterfaceC4834bnP interfaceC4834bnP) {
        int i = (int) dataSpec.length;
        byte[] bArr = new byte[i];
        try {
            this.c.e(interfaceC4834bnP);
            this.a.open(dataSpec);
            int i2 = 0;
            do {
                int read = this.a.read(bArr, i2, i - i2);
                i2 += read;
                if (read <= 0) {
                    break;
                }
            } while (i2 < i);
            this.c.e(null);
            try {
                this.a.close();
            } catch (IOException | NullPointerException e) {
                C1044Mm.b("nf_cache", e, "encountered error when closing cache data source during prefetch", new Object[0]);
            }
            return bArr;
        } catch (Throwable th) {
            this.c.e(null);
            try {
                this.a.close();
            } catch (IOException | NullPointerException e2) {
                C1044Mm.b("nf_cache", e2, "encountered error when closing cache data source during prefetch", new Object[0]);
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o.biJ$b */
    /* loaded from: classes3.dex */
    public static class b {
        public final boolean a;
        public final DataSpec b;
        public final boolean c;
        public final d d;
        public final InterfaceC4834bnP e;

        public b(DataSpec dataSpec, InterfaceC4834bnP interfaceC4834bnP, boolean z, boolean z2, d dVar) {
            this.b = dataSpec;
            this.e = interfaceC4834bnP;
            this.d = dVar;
            this.a = z;
            this.c = z2;
        }
    }
}
