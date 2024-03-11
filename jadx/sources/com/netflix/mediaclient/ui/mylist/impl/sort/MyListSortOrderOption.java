package com.netflix.mediaclient.ui.mylist.impl.sort;

import android.os.Parcel;
import android.os.Parcelable;
import com.netflix.mediaclient.graphql.models.type.MyListSort;
import o.C6956cnA;
import o.C8627dsp;
import o.C8632dsu;

/* loaded from: classes4.dex */
public abstract class MyListSortOrderOption implements Parcelable {
    private final MyListSort a;
    private final int b;
    private final int e;

    public /* synthetic */ MyListSortOrderOption(int i, int i2, MyListSort myListSort, C8627dsp c8627dsp) {
        this(i, i2, myListSort);
    }

    public final int b() {
        return this.e;
    }

    public final int d() {
        return this.b;
    }

    public final MyListSort e() {
        return this.a;
    }

    private MyListSortOrderOption(int i, int i2, MyListSort myListSort) {
        this.b = i;
        this.e = i2;
        this.a = myListSort;
    }

    /* loaded from: classes4.dex */
    public static final class Suggested extends MyListSortOrderOption {
        public static final Suggested a = new Suggested();
        public static final Parcelable.Creator<Suggested> CREATOR = new Creator();

        /* loaded from: classes4.dex */
        public static final class Creator implements Parcelable.Creator<Suggested> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: d */
            public final Suggested[] newArray(int i) {
                return new Suggested[i];
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: e */
            public final Suggested createFromParcel(Parcel parcel) {
                C8632dsu.c((Object) parcel, "");
                parcel.readInt();
                return Suggested.a;
            }
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            C8632dsu.c((Object) parcel, "");
            parcel.writeInt(1);
        }

        private Suggested() {
            super(C6956cnA.c.E, C6956cnA.c.l, MyListSort.b, null);
        }
    }

    /* loaded from: classes4.dex */
    public static final class DateAdded extends MyListSortOrderOption {
        public static final DateAdded c = new DateAdded();
        public static final Parcelable.Creator<DateAdded> CREATOR = new Creator();

        /* loaded from: classes4.dex */
        public static final class Creator implements Parcelable.Creator<DateAdded> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public final DateAdded createFromParcel(Parcel parcel) {
                C8632dsu.c((Object) parcel, "");
                parcel.readInt();
                return DateAdded.c;
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c */
            public final DateAdded[] newArray(int i) {
                return new DateAdded[i];
            }
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            C8632dsu.c((Object) parcel, "");
            parcel.writeInt(1);
        }

        private DateAdded() {
            super(C6956cnA.c.F, C6956cnA.c.m, MyListSort.d, null);
        }
    }

    /* loaded from: classes4.dex */
    public static final class Alphabetical extends MyListSortOrderOption {
        public static final Alphabetical b = new Alphabetical();
        public static final Parcelable.Creator<Alphabetical> CREATOR = new Creator();

        /* loaded from: classes4.dex */
        public static final class Creator implements Parcelable.Creator<Alphabetical> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: c */
            public final Alphabetical[] newArray(int i) {
                return new Alphabetical[i];
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: d */
            public final Alphabetical createFromParcel(Parcel parcel) {
                C8632dsu.c((Object) parcel, "");
                parcel.readInt();
                return Alphabetical.b;
            }
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            C8632dsu.c((Object) parcel, "");
            parcel.writeInt(1);
        }

        private Alphabetical() {
            super(C6956cnA.c.C, C6956cnA.c.h, MyListSort.c, null);
        }
    }

    /* loaded from: classes4.dex */
    public static final class ReleaseDate extends MyListSortOrderOption {
        public static final ReleaseDate a = new ReleaseDate();
        public static final Parcelable.Creator<ReleaseDate> CREATOR = new Creator();

        /* loaded from: classes4.dex */
        public static final class Creator implements Parcelable.Creator<ReleaseDate> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public final ReleaseDate createFromParcel(Parcel parcel) {
                C8632dsu.c((Object) parcel, "");
                parcel.readInt();
                return ReleaseDate.a;
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public final ReleaseDate[] newArray(int i) {
                return new ReleaseDate[i];
            }
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            C8632dsu.c((Object) parcel, "");
            parcel.writeInt(1);
        }

        private ReleaseDate() {
            super(C6956cnA.c.H, C6956cnA.c.n, MyListSort.a, null);
        }
    }
}
