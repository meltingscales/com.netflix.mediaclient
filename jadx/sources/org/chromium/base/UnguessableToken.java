package org.chromium.base;

import android.os.Parcel;
import android.os.Parcelable;
import org.chromium.base.annotations.CalledByNative;

/* loaded from: classes6.dex */
public class UnguessableToken implements Parcelable {
    public static final Parcelable.Creator<UnguessableToken> CREATOR = new Parcelable.Creator<UnguessableToken>() { // from class: org.chromium.base.UnguessableToken.1
        @Override // android.os.Parcelable.Creator
        public UnguessableToken createFromParcel(Parcel parcel) {
            long readLong = parcel.readLong();
            long readLong2 = parcel.readLong();
            if (readLong == 0 || readLong2 == 0) {
                return null;
            }
            return new UnguessableToken(readLong, readLong2);
        }

        @Override // android.os.Parcelable.Creator
        public UnguessableToken[] newArray(int i) {
            return new UnguessableToken[i];
        }
    };
    private final long mHigh;
    private final long mLow;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @CalledByNative
    public long getHighForSerialization() {
        return this.mHigh;
    }

    @CalledByNative
    public long getLowForSerialization() {
        return this.mLow;
    }

    public int hashCode() {
        long j = this.mLow;
        long j2 = this.mHigh;
        return (((int) (j ^ (j >>> 32))) * 31) + ((int) ((j2 >>> 32) ^ j2));
    }

    private UnguessableToken(long j, long j2) {
        this.mHigh = j;
        this.mLow = j2;
    }

    @CalledByNative
    private static UnguessableToken create(long j, long j2) {
        return new UnguessableToken(j, j2);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.mHigh);
        parcel.writeLong(this.mLow);
    }

    public boolean equals(Object obj) {
        if (obj != null && getClass() == obj.getClass()) {
            UnguessableToken unguessableToken = (UnguessableToken) obj;
            if (unguessableToken.mHigh == this.mHigh && unguessableToken.mLow == this.mLow) {
                return true;
            }
        }
        return false;
    }

    @CalledByNative
    private UnguessableToken parcelAndUnparcelForTesting() {
        Parcel obtain = Parcel.obtain();
        writeToParcel(obtain, 0);
        obtain.setDataPosition(0);
        UnguessableToken createFromParcel = CREATOR.createFromParcel(obtain);
        obtain.recycle();
        return createFromParcel;
    }
}