package o;

import com.bugsnag.android.DeviceIdFilePersistence$loadDeviceIdInternal$1;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.channels.OverlappingFileLockException;
import java.util.UUID;

/* renamed from: o.kV  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9167kV implements InterfaceC9164kS {
    public static final c c = new c(null);
    private final InterfaceC9200lB a;
    private final File b;
    private final C9282me<C9165kT> d;
    private final drO<UUID> e;

    public C9167kV(File file, drO<UUID> dro, InterfaceC9200lB interfaceC9200lB) {
        this.b = file;
        this.e = dro;
        this.a = interfaceC9200lB;
        try {
            file.createNewFile();
        } catch (Throwable th) {
            this.a.e("Failed to created device ID file", th);
        }
        this.d = new C9282me<>(this.b);
    }

    @Override // o.InterfaceC9164kS
    public String c(boolean z) {
        try {
            C9165kT b = b();
            if ((b == null ? null : b.a()) != null) {
                return b.a();
            }
            if (z) {
                return d(this.e.invoke());
            }
            return null;
        } catch (Throwable th) {
            this.a.e("Failed to load device ID", th);
            return null;
        }
    }

    private final C9165kT b() {
        if (this.b.length() > 0) {
            try {
                return this.d.d(new DeviceIdFilePersistence$loadDeviceIdInternal$1(C9165kT.a));
            } catch (Throwable th) {
                this.a.e("Failed to load device ID", th);
                return null;
            }
        }
        return null;
    }

    private final String d(UUID uuid) {
        try {
            FileChannel channel = new FileOutputStream(this.b).getChannel();
            String e = e(channel, uuid);
            C8608drx.a(channel, null);
            return e;
        } catch (IOException e2) {
            this.a.e("Failed to persist device ID", e2);
            return null;
        }
    }

    private final String e(FileChannel fileChannel, UUID uuid) {
        String a;
        FileLock a2 = a(fileChannel);
        String str = null;
        if (a2 == null) {
            return null;
        }
        try {
            C9165kT b = b();
            if (b != null) {
                str = b.a();
            }
            if (str != null) {
                a = b.a();
            } else {
                C9165kT c9165kT = new C9165kT(uuid.toString());
                this.d.a(c9165kT);
                a = c9165kT.a();
            }
            return a;
        } finally {
            a2.release();
        }
    }

    private final FileLock a(FileChannel fileChannel) {
        for (int i = 0; i < 20; i++) {
            try {
                return fileChannel.tryLock();
            } catch (OverlappingFileLockException unused) {
                Thread.sleep(25L);
            }
        }
        return null;
    }

    /* renamed from: o.kV$c */
    /* loaded from: classes2.dex */
    public static final class c {
        public /* synthetic */ c(C8627dsp c8627dsp) {
            this();
        }

        private c() {
        }
    }
}
