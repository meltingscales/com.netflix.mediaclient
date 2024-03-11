package com.airbnb.epoxy;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.View;
import androidx.collection.LongSparseArray;
import o.C1511aE;
import o.C8938gE;

/* loaded from: classes2.dex */
public class ViewHolderState extends LongSparseArray<ViewState> implements Parcelable {
    public static final Parcelable.Creator<ViewHolderState> CREATOR = new Parcelable.Creator<ViewHolderState>() { // from class: com.airbnb.epoxy.ViewHolderState.1
        @Override // android.os.Parcelable.Creator
        /* renamed from: d */
        public ViewHolderState[] newArray(int i) {
            return new ViewHolderState[i];
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public ViewHolderState createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            ViewHolderState viewHolderState = new ViewHolderState(readInt);
            for (int i = 0; i < readInt; i++) {
                viewHolderState.put(parcel.readLong(), (ViewState) parcel.readParcelable(ViewState.class.getClassLoader()));
            }
            return viewHolderState;
        }
    };

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public ViewHolderState() {
    }

    private ViewHolderState(int i) {
        super(i);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int size = size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            parcel.writeLong(keyAt(i2));
            parcel.writeParcelable(valueAt(i2), 0);
        }
    }

    public void b(C1511aE c1511aE) {
        if (c1511aE.a().f()) {
            ViewState viewState = get(c1511aE.getItemId());
            if (viewState == null) {
                viewState = new ViewState();
            }
            viewState.d(c1511aE.itemView);
            put(c1511aE.getItemId(), viewState);
        }
    }

    public void c(C1511aE c1511aE) {
        if (c1511aE.a().f()) {
            ViewState viewState = get(c1511aE.getItemId());
            if (viewState != null) {
                viewState.b(c1511aE.itemView);
            } else {
                c1511aE.d();
            }
        }
    }

    /* loaded from: classes2.dex */
    public static class ViewState extends SparseArray<Parcelable> implements Parcelable {
        public static final Parcelable.Creator<ViewState> CREATOR = new Parcelable.ClassLoaderCreator<ViewState>() { // from class: com.airbnb.epoxy.ViewHolderState.ViewState.1
            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: d */
            public ViewState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                int readInt = parcel.readInt();
                int[] iArr = new int[readInt];
                parcel.readIntArray(iArr);
                return new ViewState(readInt, iArr, parcel.readParcelableArray(classLoader));
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: d */
            public ViewState createFromParcel(Parcel parcel) {
                return createFromParcel(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: e */
            public ViewState[] newArray(int i) {
                return new ViewState[i];
            }
        };

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public ViewState() {
        }

        private ViewState(int i, int[] iArr, Parcelable[] parcelableArr) {
            super(i);
            for (int i2 = 0; i2 < i; i2++) {
                put(iArr[i2], parcelableArr[i2]);
            }
        }

        public void d(View view) {
            int id = view.getId();
            c(view);
            view.saveHierarchyState(this);
            view.setId(id);
        }

        public void b(View view) {
            int id = view.getId();
            c(view);
            view.restoreHierarchyState(this);
            view.setId(id);
        }

        private void c(View view) {
            if (view.getId() == -1) {
                view.setId(C8938gE.d.d);
            }
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            int size = size();
            int[] iArr = new int[size];
            Parcelable[] parcelableArr = new Parcelable[size];
            for (int i2 = 0; i2 < size; i2++) {
                iArr[i2] = keyAt(i2);
                parcelableArr[i2] = valueAt(i2);
            }
            parcel.writeInt(size);
            parcel.writeIntArray(iArr);
            parcel.writeParcelableArray(parcelableArr, i);
        }
    }
}
