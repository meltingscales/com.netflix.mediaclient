package o;

import android.media.AudioManager;
import android.media.Spatializer;
import android.media.Spatializer$OnHeadTrackerAvailableListener;
import java.util.concurrent.Executor;

/* renamed from: o.ddJ  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8060ddJ extends C1045Mp implements Spatializer$OnHeadTrackerAvailableListener {
    private static boolean d;
    public static final d e = new d(null);

    public C8060ddJ() {
        super("AudioSpatialUtil");
        Spatializer spatializer;
        boolean isHeadTrackerAvailable;
        Spatializer spatializer2;
        Executor mainExecutor;
        Object systemService = AbstractApplicationC1040Mh.d().getSystemService("audio");
        C8632dsu.d(systemService);
        AudioManager audioManager = (AudioManager) systemService;
        spatializer = audioManager.getSpatializer();
        isHeadTrackerAvailable = spatializer.isHeadTrackerAvailable();
        boolean z = false;
        d = (isHeadTrackerAvailable || C8157dfA.b(AbstractApplicationC1040Mh.d(), "headtracking_observed", false)) ? true : true;
        getLogTag();
        if (d) {
            return;
        }
        spatializer2 = audioManager.getSpatializer();
        mainExecutor = AbstractApplicationC1040Mh.d().getMainExecutor();
        spatializer2.addOnHeadTrackerAvailableListener(mainExecutor, C8063ddM.d(this));
    }

    public void onHeadTrackerAvailableChanged(Spatializer spatializer, boolean z) {
        C8632dsu.c((Object) spatializer, "");
        if (z) {
            d = true;
            C8157dfA.d(AbstractApplicationC1040Mh.d(), "headtracking_observed", true);
        }
        getLogTag();
    }

    /* renamed from: o.ddJ$d */
    /* loaded from: classes5.dex */
    public static final class d {
        public /* synthetic */ d(C8627dsp c8627dsp) {
            this();
        }

        private d() {
        }

        public final boolean c() {
            return C8060ddJ.d;
        }
    }
}
