package o;

import android.util.Pair;
import androidx.media3.common.Timeline;
import androidx.media3.common.TrackGroup;
import androidx.media3.exoplayer.RendererConfiguration;
import androidx.media3.exoplayer.source.MediaSource;
import androidx.media3.exoplayer.source.TrackGroupArray;
import androidx.media3.exoplayer.trackselection.ExoTrackSelection;
import androidx.media3.exoplayer.trackselection.MappingTrackSelector;
import com.netflix.mediaclient.service.player.common.NetflixIdMetadataEntry;
import java.lang.reflect.Constructor;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.function.Consumer;

/* renamed from: o.bkO  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C4737bkO extends MappingTrackSelector {
    private String a;
    private final List<C4582bhI> b = new CopyOnWriteArrayList();
    private int c = 1;
    private int d = 1;
    private final ExoTrackSelection.Factory e;
    private String i;

    public C4737bkO(ExoTrackSelection.Factory factory) {
        this.e = factory;
    }

    public void c(C4582bhI c4582bhI) {
        this.b.add(c4582bhI);
    }

    public void a(String str, int i) {
        if (Objects.equals(str, this.a)) {
            return;
        }
        this.a = str;
        this.c = i;
        invalidate();
    }

    public void c(String str, int i) {
        if (Objects.equals(str, this.i)) {
            return;
        }
        if (i != this.d) {
            List<C4582bhI> list = this.b;
            try {
                Object[] objArr = {Integer.valueOf(i)};
                Object obj = C4755bkv.q.get(442888936);
                if (obj == null) {
                    obj = ((Class) C4755bkv.b((char) 0, 5, 1074)).getDeclaredConstructor(Integer.TYPE);
                    C4755bkv.q.put(442888936, obj);
                }
                list.forEach((Consumer) ((Constructor) obj).newInstance(objArr));
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        this.i = str;
        this.d = i;
        invalidate();
    }

    public void e() {
        if (this.i == null && this.a == null) {
            return;
        }
        this.i = null;
        this.d = 1;
        this.a = null;
        this.c = 1;
        invalidate();
    }

    @Override // androidx.media3.exoplayer.trackselection.MappingTrackSelector
    public Pair<RendererConfiguration[], ExoTrackSelection[]> selectTracks(MappingTrackSelector.MappedTrackInfo mappedTrackInfo, int[][][] iArr, int[] iArr2, MediaSource.MediaPeriodId mediaPeriodId, Timeline timeline) {
        int rendererCount = mappedTrackInfo.getRendererCount();
        ExoTrackSelection.Definition[] definitionArr = new ExoTrackSelection.Definition[rendererCount];
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        for (int i = 0; i < mappedTrackInfo.getRendererCount(); i++) {
            int rendererType = mappedTrackInfo.getRendererType(i);
            if (rendererType == 1) {
                if (!z) {
                    definitionArr[i] = e(mappedTrackInfo, i, this.a, this.c, true);
                }
                z |= definitionArr[i] != null;
            } else if (rendererType == 2) {
                if (!z2) {
                    TrackGroupArray trackGroups = mappedTrackInfo.getTrackGroups(i);
                    if (trackGroups.length > 0) {
                        definitionArr[i] = c(trackGroups.get(0), 1);
                    }
                }
                z2 |= definitionArr[i] != null;
            } else if (rendererType == 3) {
                if (!z3) {
                    definitionArr[i] = e(mappedTrackInfo, i, this.i, this.d, false);
                }
                z3 |= definitionArr[i] != null;
            }
        }
        ExoTrackSelection[] createTrackSelections = this.e.createTrackSelections(definitionArr, getBandwidthMeter(), mediaPeriodId, timeline);
        RendererConfiguration[] rendererConfigurationArr = new RendererConfiguration[rendererCount];
        for (int i2 = 0; i2 < createTrackSelections.length; i2++) {
            if (createTrackSelections[i2] != null) {
                rendererConfigurationArr[i2] = RendererConfiguration.DEFAULT;
            }
        }
        return Pair.create(rendererConfigurationArr, createTrackSelections);
    }

    private static ExoTrackSelection.Definition e(MappingTrackSelector.MappedTrackInfo mappedTrackInfo, int i, String str, int i2, boolean z) {
        int i3;
        TrackGroupArray trackGroups = mappedTrackInfo.getTrackGroups(i);
        if (trackGroups == null) {
            return null;
        }
        if (str != null) {
            i3 = 0;
            while (i3 < trackGroups.length) {
                TrackGroup trackGroup = trackGroups.get(i3);
                if (trackGroup.length > 0 && str.equals(NetflixIdMetadataEntry.e(trackGroup.getFormat(0)).e())) {
                    break;
                }
                i3++;
            }
        }
        i3 = -1;
        if (i3 == -1 && (str == null || z)) {
            int i4 = 0;
            while (true) {
                if (i4 >= trackGroups.length) {
                    break;
                }
                TrackGroup trackGroup2 = trackGroups.get(i4);
                if (trackGroup2.length > 0 && (trackGroup2.getFormat(0).selectionFlags & 1) != 0) {
                    i3 = i4;
                    break;
                }
                i4++;
            }
        }
        if (z && i3 == -1 && trackGroups.length == 1) {
            C1044Mm.j("NetflixDefaultTrackSelector", "unable to find default track - selecting only track in list");
            i3 = 0;
        }
        if (i3 == -1) {
            return null;
        }
        TrackGroup trackGroup3 = trackGroups.get(i3);
        if (mappedTrackInfo.getAdaptiveSupport(i, i3, false) == 16) {
            return c(trackGroup3, i2);
        }
        return new ExoTrackSelection.Definition(trackGroup3, new int[]{0}, i2);
    }

    private static ExoTrackSelection.Definition c(TrackGroup trackGroup, int i) {
        int i2 = trackGroup.length;
        int[] iArr = new int[i2];
        for (int i3 = 0; i3 < trackGroup.length; i3++) {
            iArr[i3] = i3;
        }
        if (i2 > 0) {
            return new ExoTrackSelection.Definition(trackGroup, iArr, i);
        }
        return null;
    }
}
