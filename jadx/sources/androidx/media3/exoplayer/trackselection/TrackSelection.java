package androidx.media3.exoplayer.trackselection;

import androidx.media3.common.Format;
import androidx.media3.common.TrackGroup;

/* loaded from: classes2.dex */
public interface TrackSelection {
    Format getFormat(int i);

    int getIndexInTrackGroup(int i);

    TrackGroup getTrackGroup();

    int indexOf(int i);

    int indexOf(Format format);

    int length();
}
