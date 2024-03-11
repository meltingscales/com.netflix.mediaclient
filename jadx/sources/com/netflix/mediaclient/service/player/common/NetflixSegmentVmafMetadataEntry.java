package com.netflix.mediaclient.service.player.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.common.Format;
import androidx.media3.common.Metadata;
import com.netflix.mediaclient.media.manifest.SegmentVmaf;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public class NetflixSegmentVmafMetadataEntry implements Metadata.Entry {
    public static final Parcelable.Creator<NetflixSegmentVmafMetadataEntry> CREATOR = new Parcelable.Creator<NetflixSegmentVmafMetadataEntry>() { // from class: com.netflix.mediaclient.service.player.common.NetflixSegmentVmafMetadataEntry.1
        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public NetflixSegmentVmafMetadataEntry createFromParcel(Parcel parcel) {
            return new NetflixSegmentVmafMetadataEntry(Collections.emptyList());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: d */
        public NetflixSegmentVmafMetadataEntry[] newArray(int i) {
            return new NetflixSegmentVmafMetadataEntry[i];
        }
    };
    private final List<SegmentVmaf> c;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
    }

    public NetflixSegmentVmafMetadataEntry(List<SegmentVmaf> list) {
        this.c = list;
    }

    public boolean equals(Object obj) {
        if (obj instanceof NetflixSegmentVmafMetadataEntry) {
            return this.c.equals(((NetflixSegmentVmafMetadataEntry) obj).c);
        }
        return false;
    }

    public int b(long j) {
        int size = this.c.size() - 1;
        if (j > this.c.get(size).offsetMs()) {
            return this.c.get(size).vmaf();
        }
        int i = 0;
        if (j < this.c.get(0).offsetMs()) {
            return this.c.get(0).vmaf();
        }
        while (i <= size) {
            int i2 = (i + size) >>> 1;
            SegmentVmaf segmentVmaf = this.c.get(i2);
            SegmentVmaf segmentVmaf2 = i2 == this.c.size() + (-1) ? null : this.c.get(i2 + 1);
            if (segmentVmaf.offsetMs() > j) {
                size = i2 - 1;
            } else if (segmentVmaf2 == null || segmentVmaf2.offsetMs() >= j) {
                return segmentVmaf.vmaf();
            } else {
                i = i2 + 1;
            }
        }
        return -1;
    }

    public static int c(Format format, long j) {
        if (format == null || format.metadata == null) {
            return -1;
        }
        for (int i = 0; i < format.metadata.length(); i++) {
            if (format.metadata.get(i) instanceof NetflixSegmentVmafMetadataEntry) {
                return ((NetflixSegmentVmafMetadataEntry) format.metadata.get(i)).b(j);
            }
        }
        return -1;
    }

    public static List<SegmentVmaf> e(Format format) {
        if (format == null || format.metadata == null) {
            return null;
        }
        for (int i = 0; i < format.metadata.length(); i++) {
            if (format.metadata.get(i) instanceof NetflixSegmentVmafMetadataEntry) {
                return ((NetflixSegmentVmafMetadataEntry) format.metadata.get(i)).c;
            }
        }
        return null;
    }
}
