package com.netflix.mediaclient.ui.mylist.impl.tab;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import o.C8600drp;
import o.C8632dsu;
import o.InterfaceC8598drn;

/* loaded from: classes4.dex */
public final class MyListTabItems implements Parcelable {
    public static final Parcelable.Creator<MyListTabItems> CREATOR = new Creator();
    private final Type a;
    private final ArrayList<Type> d;

    /* loaded from: classes4.dex */
    public static final class Creator implements Parcelable.Creator<MyListTabItems> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: c */
        public final MyListTabItems[] newArray(int i) {
            return new MyListTabItems[i];
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: d */
        public final MyListTabItems createFromParcel(Parcel parcel) {
            C8632dsu.c((Object) parcel, "");
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i = 0; i != readInt; i++) {
                arrayList.add(Type.CREATOR.createFromParcel(parcel));
            }
            return new MyListTabItems(arrayList, Type.CREATOR.createFromParcel(parcel));
        }
    }

    public final ArrayList<Type> c() {
        return this.d;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final Type e() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof MyListTabItems) {
            MyListTabItems myListTabItems = (MyListTabItems) obj;
            return C8632dsu.c(this.d, myListTabItems.d) && this.a == myListTabItems.a;
        }
        return false;
    }

    public int hashCode() {
        return (this.d.hashCode() * 31) + this.a.hashCode();
    }

    public String toString() {
        ArrayList<Type> arrayList = this.d;
        Type type = this.a;
        return "MyListTabItems(types=" + arrayList + ", selectedItem=" + type + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C8632dsu.c((Object) parcel, "");
        ArrayList<Type> arrayList = this.d;
        parcel.writeInt(arrayList.size());
        Iterator<Type> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
        this.a.writeToParcel(parcel, i);
    }

    public MyListTabItems(ArrayList<Type> arrayList, Type type) {
        C8632dsu.c((Object) arrayList, "");
        C8632dsu.c((Object) type, "");
        this.d = arrayList;
        this.a = type;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes4.dex */
    public static final class Type implements Parcelable {
        public static final Parcelable.Creator<Type> CREATOR;
        private static final /* synthetic */ InterfaceC8598drn b;
        private static final /* synthetic */ Type[] d;
        public static final Type a = new Type("GAME", 0);
        public static final Type e = new Type("VIDEO", 1);

        /* loaded from: classes4.dex */
        public static final class Creator implements Parcelable.Creator<Type> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public final Type createFromParcel(Parcel parcel) {
                C8632dsu.c((Object) parcel, "");
                return Type.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c */
            public final Type[] newArray(int i) {
                return new Type[i];
            }
        }

        private static final /* synthetic */ Type[] c() {
            return new Type[]{a, e};
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) d.clone();
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            C8632dsu.c((Object) parcel, "");
            parcel.writeString(name());
        }

        private Type(String str, int i) {
        }

        static {
            Type[] c = c();
            d = c;
            b = C8600drp.e(c);
            CREATOR = new Creator();
        }
    }
}
