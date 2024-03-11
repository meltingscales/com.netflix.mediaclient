package o;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: o.bcT  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C4328bcT extends AbstractC4323bcO {
    private Thread a;
    private RandomAccessFile c;
    private AtomicBoolean d = new AtomicBoolean(false);

    @Override // o.AbstractC4323bcO
    protected RandomAccessFile e() {
        return this.c;
    }

    @Override // o.AbstractC4323bcO, o.InterfaceC4326bcR
    public /* bridge */ /* synthetic */ ByteBuffer b(int i) {
        return super.b(i);
    }

    public C4328bcT(final String str) {
        Thread thread = new Thread(new Runnable() { // from class: o.bcT.5
            @Override // java.lang.Runnable
            public void run() {
                try {
                    String str2 = str;
                    String substring = (str2 == null || !str2.startsWith("file://")) ? str : str.substring(7);
                    if (C4328bcT.this.d(new FileInputStream(substring))) {
                        C4328bcT.this.c = new RandomAccessFile(substring, "r");
                        C4328bcT.this.d.set(true);
                    }
                } catch (FileNotFoundException unused) {
                }
            }
        }, "OfflineBifManagerThread");
        this.a = thread;
        thread.start();
    }

    @Override // o.AbstractC4323bcO
    protected boolean c() {
        return this.d.get();
    }

    @Override // o.InterfaceC4326bcR
    public void d() {
        this.a.interrupt();
        try {
            this.a.join();
        } catch (InterruptedException e) {
            C1044Mm.b("OfflineBifManager", e, "release " + e, new Object[0]);
        }
        RandomAccessFile randomAccessFile = this.c;
        if (randomAccessFile != null) {
            try {
                randomAccessFile.close();
            } catch (IOException e2) {
                C1044Mm.b("OfflineBifManager", e2, "close file " + e2, new Object[0]);
            }
        }
        C1044Mm.e("OfflineBifManager", "released");
    }
}
