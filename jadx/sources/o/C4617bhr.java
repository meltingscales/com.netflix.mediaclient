package o;

import android.os.Handler;
import androidx.media3.common.Format;
import androidx.media3.exoplayer.source.chunk.BaseMediaChunk;
import com.netflix.mediaclient.event.IStreamPresenting;
import com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.aseinterface.IAsePlayerState;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import o.InterfaceC4610bhk;

/* renamed from: o.bhr  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C4617bhr {
    private final Handler a;
    private final IAsePlayerState c;
    private final InterfaceC4610bhk e;
    private final int i;
    private final String b = "ChunkTracker";
    private final List<C4688bjI> d = new CopyOnWriteArrayList();

    public C4617bhr(int i, IAsePlayerState iAsePlayerState, InterfaceC4610bhk interfaceC4610bhk, Handler handler) {
        this.c = iAsePlayerState;
        this.i = i;
        this.e = interfaceC4610bhk;
        this.a = handler;
    }

    public void b(C4688bjI c4688bjI) {
        if (this.d.add(c4688bjI)) {
            C1044Mm.d("ChunkTracker", "SampleStream %s added.", c4688bjI);
        }
    }

    public void c(C4688bjI c4688bjI) {
        if (this.d.remove(c4688bjI)) {
            C1044Mm.d("ChunkTracker", "SampleStream %s removed.", c4688bjI);
        }
    }

    public List<IAsePlayerState.a> a() {
        ArrayList arrayList = new ArrayList();
        for (C4688bjI c4688bjI : this.d) {
            for (BaseMediaChunk baseMediaChunk : c4688bjI.e()) {
                arrayList.add(new IAsePlayerState.a(this.i, baseMediaChunk));
            }
        }
        return arrayList;
    }

    public IAsePlayerState.a c() {
        BaseMediaChunk b = b();
        if (b != null) {
            return new IAsePlayerState.a(this.i, b);
        }
        return null;
    }

    public long e(long j) {
        if (this.d.isEmpty()) {
            return -9223372036854775807L;
        }
        long j2 = 0;
        boolean z = true;
        for (C4688bjI c4688bjI : this.d) {
            j2 += c4688bjI.a(z ? j : Long.MIN_VALUE);
            z = false;
        }
        return j2;
    }

    public long d(long j) {
        long j2 = 0;
        boolean z = true;
        for (C4688bjI c4688bjI : this.d) {
            j2 += c4688bjI.d(z ? j : Long.MIN_VALUE);
            z = false;
        }
        return j2;
    }

    private BaseMediaChunk b() {
        try {
            List<C4688bjI> list = this.d;
            C4688bjI c4688bjI = list.isEmpty() ? null : list.get(list.size() - 1);
            BaseMediaChunk d = c4688bjI != null ? c4688bjI.d() : null;
            if (d != null || list.size() <= 1) {
                return d;
            }
            C4688bjI c4688bjI2 = list.get(list.size() - 2);
            return c4688bjI2 != null ? c4688bjI2.d() : null;
        } catch (IndexOutOfBoundsException unused) {
            return null;
        }
    }

    public void d(final Format format, final long j) {
        int i = this.i;
        if (i == 2) {
            this.a.post(new Runnable() { // from class: o.bhp
                @Override // java.lang.Runnable
                public final void run() {
                    C4617bhr.this.d(j, format);
                }
            });
        } else if (i == 1) {
            this.a.post(new Runnable() { // from class: o.bhq
                @Override // java.lang.Runnable
                public final void run() {
                    C4617bhr.this.c(j, format);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d(long j, Format format) {
        this.e.a(androidx.media3.common.C.usToMs(j), new InterfaceC4610bhk.b(format.id, format.bitrate, this.i));
        this.e.a(new C4622bhw(IStreamPresenting.StreamType.VIDEO, format.id));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(long j, Format format) {
        this.e.a(androidx.media3.common.C.usToMs(j), new InterfaceC4610bhk.b(format.id, format.bitrate, this.i));
        this.e.a(new C4622bhw(IStreamPresenting.StreamType.AUDIO, format.id));
    }
}
