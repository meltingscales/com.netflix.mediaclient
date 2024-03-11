package androidx.compose.runtime;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import o.C8627dsp;
import o.C8632dsu;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class ParcelableSnapshotMutableState<T> extends SnapshotMutableStateImpl<T> implements Parcelable {
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<ParcelableSnapshotMutableState<Object>> CREATOR = new Parcelable.ClassLoaderCreator<ParcelableSnapshotMutableState<Object>>() { // from class: androidx.compose.runtime.ParcelableSnapshotMutableState$Companion$CREATOR$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.ClassLoaderCreator
        public ParcelableSnapshotMutableState<Object> createFromParcel(Parcel parcel, ClassLoader classLoader) {
            SnapshotMutationPolicy neverEqualPolicy;
            if (classLoader == null) {
                classLoader = ParcelableSnapshotMutableState$Companion$CREATOR$1.class.getClassLoader();
            }
            Object readValue = parcel.readValue(classLoader);
            int readInt = parcel.readInt();
            if (readInt == 0) {
                neverEqualPolicy = SnapshotStateKt.neverEqualPolicy();
            } else if (readInt == 1) {
                neverEqualPolicy = SnapshotStateKt.structuralEqualityPolicy();
            } else if (readInt == 2) {
                neverEqualPolicy = SnapshotStateKt.referentialEqualityPolicy();
            } else {
                throw new IllegalStateException("Unsupported MutableState policy " + readInt + " was restored");
            }
            return new ParcelableSnapshotMutableState<>(readValue, neverEqualPolicy);
        }

        @Override // android.os.Parcelable.Creator
        public ParcelableSnapshotMutableState<Object> createFromParcel(Parcel parcel) {
            return createFromParcel(parcel, (ClassLoader) null);
        }

        @Override // android.os.Parcelable.Creator
        public ParcelableSnapshotMutableState<Object>[] newArray(int i) {
            return new ParcelableSnapshotMutableState[i];
        }
    };

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public ParcelableSnapshotMutableState(T t, SnapshotMutationPolicy<T> snapshotMutationPolicy) {
        super(t, snapshotMutationPolicy);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int i2;
        parcel.writeValue(getValue());
        SnapshotMutationPolicy<T> policy = getPolicy();
        if (C8632dsu.c(policy, SnapshotStateKt.neverEqualPolicy())) {
            i2 = 0;
        } else if (C8632dsu.c(policy, SnapshotStateKt.structuralEqualityPolicy())) {
            i2 = 1;
        } else if (!C8632dsu.c(policy, SnapshotStateKt.referentialEqualityPolicy())) {
            throw new IllegalStateException("Only known types of MutableState's SnapshotMutationPolicy are supported");
        } else {
            i2 = 2;
        }
        parcel.writeInt(i2);
    }

    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(C8627dsp c8627dsp) {
            this();
        }

        private Companion() {
        }
    }
}
