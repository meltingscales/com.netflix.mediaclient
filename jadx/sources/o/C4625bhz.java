package o;

import androidx.media3.exoplayer.source.LoadEventInfo;
import androidx.media3.exoplayer.source.MediaLoadData;
import androidx.media3.exoplayer.source.MediaSource;
import androidx.media3.exoplayer.source.MediaSourceEventListener;
import java.io.IOException;
import o.InterfaceC4660bih;

/* renamed from: o.bhz  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C4625bhz implements MediaSourceEventListener {
    private Object[] b;
    private final c c;
    private boolean d;
    private final long e;

    /* renamed from: o.bhz$c */
    /* loaded from: classes3.dex */
    public interface c {
        void a(long j);

        void c(long j, int i, InterfaceC4660bih.l lVar);

        void c(long j, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData);
    }

    private C4625bhz(long j, c cVar) {
        this.d = false;
        this.e = j;
        this.c = cVar;
        this.b = new Object[2];
    }

    @Override // androidx.media3.exoplayer.source.MediaSourceEventListener
    public void onLoadStarted(int i, MediaSource.MediaPeriodId mediaPeriodId, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
        if (!this.d) {
            this.d = true;
            c cVar = this.c;
            if (cVar != null) {
                cVar.a(this.e);
            }
        }
        Object obj = mediaLoadData.trackSelectionData;
        if (obj instanceof InterfaceC4660bih.l) {
            Object[] objArr = this.b;
            int i2 = mediaLoadData.trackType;
            if (objArr[i2 - 1] != obj) {
                c cVar2 = this.c;
                if (cVar2 != null) {
                    cVar2.c(this.e, i2, (InterfaceC4660bih.l) obj);
                }
                this.b[mediaLoadData.trackType - 1] = mediaLoadData.trackSelectionData;
            }
        }
    }

    @Override // androidx.media3.exoplayer.source.MediaSourceEventListener
    public void onLoadError(int i, MediaSource.MediaPeriodId mediaPeriodId, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData, IOException iOException, boolean z) {
        c cVar;
        if (mediaLoadData.trackType != 3 || (cVar = this.c) == null) {
            return;
        }
        cVar.c(this.e, loadEventInfo, mediaLoadData);
    }

    /* renamed from: o.bhz$b */
    /* loaded from: classes3.dex */
    public static class b {
        private final c b;

        public b(c cVar) {
            this.b = cVar;
        }

        public C4625bhz a(long j) {
            return new C4625bhz(j, this.b);
        }
    }
}
