package androidx.media3.exoplayer.trackselection;

import androidx.media3.common.TrackGroup;
import androidx.media3.common.Tracks;
import androidx.media3.exoplayer.source.TrackGroupArray;
import androidx.media3.exoplayer.trackselection.MappingTrackSelector;
import com.google.common.collect.ImmutableList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes2.dex */
public final class TrackSelectionUtil {
    public static Tracks buildTracks(MappingTrackSelector.MappedTrackInfo mappedTrackInfo, TrackSelection[] trackSelectionArr) {
        List[] listArr = new List[trackSelectionArr.length];
        for (int i = 0; i < trackSelectionArr.length; i++) {
            TrackSelection trackSelection = trackSelectionArr[i];
            listArr[i] = trackSelection != null ? ImmutableList.of(trackSelection) : ImmutableList.of();
        }
        return buildTracks(mappedTrackInfo, listArr);
    }

    public static Tracks buildTracks(MappingTrackSelector.MappedTrackInfo mappedTrackInfo, List<? extends TrackSelection>[] listArr) {
        boolean z;
        ImmutableList.Builder builder = new ImmutableList.Builder();
        for (int i = 0; i < mappedTrackInfo.getRendererCount(); i++) {
            TrackGroupArray trackGroups = mappedTrackInfo.getTrackGroups(i);
            List<? extends TrackSelection> list = listArr[i];
            for (int i2 = 0; i2 < trackGroups.length; i2++) {
                TrackGroup trackGroup = trackGroups.get(i2);
                boolean z2 = mappedTrackInfo.getAdaptiveSupport(i, i2, false) != 0;
                int i3 = trackGroup.length;
                int[] iArr = new int[i3];
                boolean[] zArr = new boolean[i3];
                for (int i4 = 0; i4 < trackGroup.length; i4++) {
                    iArr[i4] = mappedTrackInfo.getTrackSupport(i, i2, i4);
                    int i5 = 0;
                    while (true) {
                        if (i5 >= list.size()) {
                            z = false;
                            break;
                        }
                        TrackSelection trackSelection = list.get(i5);
                        if (trackSelection.getTrackGroup().equals(trackGroup) && trackSelection.indexOf(i4) != -1) {
                            z = true;
                            break;
                        }
                        i5++;
                    }
                    zArr[i4] = z;
                }
                builder.add((ImmutableList.Builder) new Tracks.Group(trackGroup, z2, iArr, zArr));
            }
        }
        TrackGroupArray unmappedTrackGroups = mappedTrackInfo.getUnmappedTrackGroups();
        for (int i6 = 0; i6 < unmappedTrackGroups.length; i6++) {
            TrackGroup trackGroup2 = unmappedTrackGroups.get(i6);
            int[] iArr2 = new int[trackGroup2.length];
            Arrays.fill(iArr2, 0);
            builder.add((ImmutableList.Builder) new Tracks.Group(trackGroup2, false, iArr2, new boolean[trackGroup2.length]));
        }
        return new Tracks(builder.build());
    }
}
