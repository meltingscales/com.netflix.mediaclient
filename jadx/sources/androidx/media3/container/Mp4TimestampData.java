package androidx.media3.container;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.common.Metadata;
import com.google.common.primitives.Longs;

/* loaded from: classes2.dex */
public final class Mp4TimestampData implements Metadata.Entry {
    public static final Parcelable.Creator<Mp4TimestampData> CREATOR = new Parcelable.Creator<Mp4TimestampData>() { // from class: androidx.media3.container.Mp4TimestampData.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Mp4TimestampData createFromParcel(Parcel parcel) {
            return new Mp4TimestampData(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Mp4TimestampData[] newArray(int i) {
            return new Mp4TimestampData[i];
        }
    };
    public final long creationTimestampSeconds;
    public final long modificationTimestampSeconds;
    public final long timescale;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public Mp4TimestampData(long j, long j2, long j3) {
        this.creationTimestampSeconds = j;
        this.modificationTimestampSeconds = j2;
        this.timescale = j3;
    }

    private Mp4TimestampData(Parcel parcel) {
        this.creationTimestampSeconds = parcel.readLong();
        this.modificationTimestampSeconds = parcel.readLong();
        this.timescale = parcel.readLong();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Mp4TimestampData) {
            Mp4TimestampData mp4TimestampData = (Mp4TimestampData) obj;
            return this.creationTimestampSeconds == mp4TimestampData.creationTimestampSeconds && this.modificationTimestampSeconds == mp4TimestampData.modificationTimestampSeconds && this.timescale == mp4TimestampData.timescale;
        }
        return false;
    }

    public int hashCode() {
        int hashCode = Longs.hashCode(this.creationTimestampSeconds);
        return ((((hashCode + 527) * 31) + Longs.hashCode(this.modificationTimestampSeconds)) * 31) + Longs.hashCode(this.timescale);
    }

    public String toString() {
        return "Mp4Timestamp: creation time=" + this.creationTimestampSeconds + ", modification time=" + this.modificationTimestampSeconds + ", timescale=" + this.timescale;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.creationTimestampSeconds);
        parcel.writeLong(this.modificationTimestampSeconds);
        parcel.writeLong(this.timescale);
    }
}
