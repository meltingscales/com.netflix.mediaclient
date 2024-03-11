package o;

import androidx.media3.exoplayer.source.LoadEventInfo;
import androidx.media3.exoplayer.source.MediaLoadData;
import androidx.media3.exoplayer.source.MediaSource;
import androidx.media3.exoplayer.source.MediaSourceEventListener;
import com.netflix.mediaclient.service.configuration.persistent.fastproperty.ConfigFastPropertyC4PlayerControls;
import java.io.IOException;

/* renamed from: o.biT  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4646biT {
    public static final e a = new e(null);
    private final InterfaceC4640biN c;
    private final c d;

    /* renamed from: o.biT$c */
    /* loaded from: classes3.dex */
    public interface c {
        void d(String str, C4651biY c4651biY, IOException iOException, boolean z);
    }

    public final InterfaceC4640biN a() {
        return this.c;
    }

    public C4646biT(c cVar, InterfaceC4640biN interfaceC4640biN) {
        C8632dsu.c((Object) cVar, "");
        this.d = cVar;
        this.c = interfaceC4640biN;
    }

    public final b c(String str, C4651biY c4651biY) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) c4651biY, "");
        if (ConfigFastPropertyC4PlayerControls.Companion.c()) {
            return new b(this, str, c4651biY);
        }
        return null;
    }

    /* renamed from: o.biT$b */
    /* loaded from: classes3.dex */
    public final class b implements MediaSourceEventListener {
        final /* synthetic */ C4646biT a;
        private final String d;
        private final C4651biY e;

        public b(C4646biT c4646biT, String str, C4651biY c4651biY) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) c4651biY, "");
            this.a = c4646biT;
            this.d = str;
            this.e = c4651biY;
        }

        @Override // androidx.media3.exoplayer.source.MediaSourceEventListener
        public void onLoadError(int i, MediaSource.MediaPeriodId mediaPeriodId, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData, IOException iOException, boolean z) {
            C8632dsu.c((Object) loadEventInfo, "");
            C8632dsu.c((Object) mediaLoadData, "");
            C8632dsu.c((Object) iOException, "");
            c cVar = this.a.d;
            if (cVar != null) {
                cVar.d(this.d, this.e, iOException, z);
            }
        }
    }

    /* renamed from: o.biT$e */
    /* loaded from: classes3.dex */
    public static final class e extends C1045Mp {
        public /* synthetic */ e(C8627dsp c8627dsp) {
            this();
        }

        private e() {
            super("AdsErrorHandler");
        }
    }
}
