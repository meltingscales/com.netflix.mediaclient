package o;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.os.SystemClock;
import android.view.Surface;
import androidx.media3.common.util.TraceUtil;
import androidx.media3.decoder.CryptoInfo;
import androidx.media3.exoplayer.mediacodec.MediaCodecAdapter;
import java.nio.ByteBuffer;
import java.util.LinkedList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* renamed from: o.bed  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C4444bed implements MediaCodecAdapter, Handler.Callback {
    protected final MediaCodec a;
    protected RuntimeException c;
    protected Handler d;
    protected HandlerThread e;
    private Surface j = null;
    protected final LinkedList<Integer> b = new LinkedList<>();

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    public boolean needsReconfiguration() {
        return false;
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 1) {
            c((c) message.obj);
            return false;
        } else if (i != 2) {
            return false;
        } else {
            a();
            return false;
        }
    }

    /* renamed from: o.bed$d */
    /* loaded from: classes3.dex */
    public static final class d implements MediaCodecAdapter.Factory {
        @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter.Factory
        public MediaCodecAdapter createAdapter(MediaCodecAdapter.Configuration configuration) {
            MediaCodec mediaCodec;
            String str = configuration.codecInfo.name;
            C4444bed c4444bed = null;
            try {
                TraceUtil.beginSection("createCodec:" + str);
                mediaCodec = MediaCodec.createByCodecName(str);
                try {
                    C4444bed c4444bed2 = new C4444bed(mediaCodec);
                    try {
                        TraceUtil.endSection();
                        TraceUtil.beginSection("configureCodec");
                        c4444bed2.c(configuration.mediaFormat, configuration.surface, configuration.crypto, configuration.flags);
                        TraceUtil.endSection();
                        TraceUtil.beginSection("startCodec");
                        c4444bed2.c();
                        TraceUtil.endSection();
                        return c4444bed2;
                    } catch (Exception e) {
                        e = e;
                        c4444bed = c4444bed2;
                        if (c4444bed != null) {
                            c4444bed.release();
                        } else if (mediaCodec != null) {
                            mediaCodec.release();
                        }
                        throw e;
                    }
                } catch (Exception e2) {
                    e = e2;
                }
            } catch (Exception e3) {
                e = e3;
                mediaCodec = null;
            }
        }
    }

    protected C4444bed(MediaCodec mediaCodec) {
        this.a = mediaCodec;
    }

    public void c(MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto, int i) {
        this.a.configure(mediaFormat, surface, mediaCrypto, i);
    }

    public void c() {
        this.a.start();
        if (this.e == null) {
            this.e = new HandlerThread("NetflixMediaCodecVideoRenderer#" + SystemClock.elapsedRealtime(), -16);
            this.b.clear();
            this.e.start();
        }
        if (this.d == null) {
            this.d = new Handler(this.e.getLooper(), this);
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    public int dequeueInputBufferIndex() {
        if (this.d == null) {
            return this.a.dequeueInputBuffer(0L);
        }
        synchronized (this.b) {
            if (!this.b.isEmpty()) {
                return this.b.removeFirst().intValue();
            }
            Handler handler = this.d;
            if (handler == null || handler.hasMessages(2)) {
                return -1;
            }
            this.d.obtainMessage(2).sendToTarget();
            return -1;
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    public int dequeueOutputBufferIndex(MediaCodec.BufferInfo bufferInfo) {
        int dequeueOutputBuffer;
        do {
            dequeueOutputBuffer = this.a.dequeueOutputBuffer(bufferInfo, 0L);
        } while (dequeueOutputBuffer == -3);
        return dequeueOutputBuffer;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    public MediaFormat getOutputFormat() {
        return this.a.getOutputFormat();
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    public ByteBuffer getInputBuffer(int i) {
        return this.a.getInputBuffer(i);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    public ByteBuffer getOutputBuffer(int i) {
        return this.a.getOutputBuffer(i);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    public void queueInputBuffer(int i, int i2, int i3, long j, int i4) {
        this.a.queueInputBuffer(i, i2, i3, j, i4);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    public void queueSecureInputBuffer(int i, int i2, CryptoInfo cryptoInfo, long j, int i3) {
        if (this.d == null) {
            this.a.queueSecureInputBuffer(i, i2, cryptoInfo.getFrameworkCryptoInfo(), j, i3);
            return;
        }
        this.d.obtainMessage(1, new c(i, i2, b(cryptoInfo), new e(cryptoInfo.encryptedBlocks, cryptoInfo.clearBlocks), j, i3)).sendToTarget();
        RuntimeException c2 = c((RuntimeException) null);
        if (c2 instanceof RuntimeException) {
            throw c2;
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    public void releaseOutputBuffer(int i, boolean z) {
        this.a.releaseOutputBuffer(i, z);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    public void releaseOutputBuffer(int i, long j) {
        this.a.releaseOutputBuffer(i, j);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    public void flush() {
        if (this.d != null) {
            final CountDownLatch countDownLatch = new CountDownLatch(1);
            this.d.postAtFrontOfQueue(new Runnable() { // from class: o.bei
                @Override // java.lang.Runnable
                public final void run() {
                    C4444bed.this.b(countDownLatch);
                }
            });
            try {
                countDownLatch.await(1L, TimeUnit.SECONDS);
            } catch (InterruptedException e2) {
                C1044Mm.b("NetflixMediaCodecAdapter", e2, "interrupted waiting for clearInput", new Object[0]);
            }
        }
        synchronized (this.b) {
            this.a.flush();
            this.b.clear();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(CountDownLatch countDownLatch) {
        this.d.removeMessages(1);
        this.d.removeMessages(2);
        countDownLatch.countDown();
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    public void release() {
        this.d = null;
        HandlerThread handlerThread = this.e;
        if (handlerThread != null) {
            handlerThread.quit();
            try {
                C1044Mm.e("NetflixMediaCodecAdapter", this.e.toString() + " finishing...");
                this.e.join(500L);
                C1044Mm.e("NetflixMediaCodecAdapter", this.e.toString() + " should finished.");
            } catch (InterruptedException unused) {
                C1044Mm.j("NetflixMediaCodecAdapter", this.e.toString() + " fails to join.");
            }
            this.e = null;
        }
        this.b.clear();
        this.a.release();
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    public void setOnFrameRenderedListener(final MediaCodecAdapter.OnFrameRenderedListener onFrameRenderedListener, Handler handler) {
        this.a.setOnFrameRenderedListener(new MediaCodec.OnFrameRenderedListener() { // from class: o.bej
            @Override // android.media.MediaCodec.OnFrameRenderedListener
            public final void onFrameRendered(MediaCodec mediaCodec, long j, long j2) {
                C4444bed.this.a(onFrameRenderedListener, mediaCodec, j, j2);
            }
        }, handler);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(MediaCodecAdapter.OnFrameRenderedListener onFrameRenderedListener, MediaCodec mediaCodec, long j, long j2) {
        onFrameRenderedListener.onFrameRendered(this, j, j2);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    public void setOutputSurface(Surface surface) {
        this.a.setOutputSurface(surface);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    public void setParameters(Bundle bundle) {
        this.a.setParameters(bundle);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    public void setVideoScalingMode(int i) {
        this.a.setVideoScalingMode(i);
    }

    protected void c(c cVar) {
        try {
            this.a.queueSecureInputBuffer(cVar.d, cVar.a, cVar.c.getFrameworkCryptoInfo(), cVar.h, cVar.b);
        } catch (IllegalStateException unused) {
            C1044Mm.d("NetflixMediaCodecAdapter", "ignore IllegalStateException on queueSecureInputBuffer.");
        } catch (RuntimeException e2) {
            c(e2);
        }
    }

    protected void a() {
        int dequeueInputBuffer;
        synchronized (this.b) {
            do {
                try {
                    dequeueInputBuffer = this.a.dequeueInputBuffer(0L);
                    if (dequeueInputBuffer >= 0) {
                        this.b.add(Integer.valueOf(dequeueInputBuffer));
                        continue;
                    }
                } catch (Exception unused) {
                }
            } while (dequeueInputBuffer >= 0);
        }
        Handler handler = this.d;
        if (handler != null) {
            handler.removeMessages(2);
        }
    }

    protected RuntimeException c(RuntimeException runtimeException) {
        RuntimeException runtimeException2;
        synchronized (this) {
            runtimeException2 = this.c;
            this.c = runtimeException;
        }
        return runtimeException2;
    }

    private static CryptoInfo b(CryptoInfo cryptoInfo) {
        CryptoInfo cryptoInfo2 = new CryptoInfo();
        cryptoInfo2.set(cryptoInfo.numSubSamples, (int[]) cryptoInfo.numBytesOfClearData.clone(), (int[]) cryptoInfo.numBytesOfEncryptedData.clone(), (byte[]) cryptoInfo.key.clone(), (byte[]) cryptoInfo.iv.clone(), cryptoInfo.mode, cryptoInfo.encryptedBlocks, cryptoInfo.clearBlocks);
        return cryptoInfo2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: o.bed$c */
    /* loaded from: classes3.dex */
    public static class c {
        final int a;
        final int b;
        final CryptoInfo c;
        final int d;
        final e e;
        final long h;

        public c(int i, int i2, CryptoInfo cryptoInfo, e eVar, long j, int i3) {
            this.d = i;
            this.a = i2;
            this.c = cryptoInfo;
            this.h = j;
            this.b = i3;
            this.e = eVar;
        }
    }

    /* renamed from: o.bed$e */
    /* loaded from: classes3.dex */
    public static class e {
        public int c;
        public int d;

        public e(int i, int i2) {
            this.c = i;
            this.d = i2;
        }
    }
}
