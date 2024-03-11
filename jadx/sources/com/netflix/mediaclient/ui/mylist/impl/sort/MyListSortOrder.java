package com.netflix.mediaclient.ui.mylist.impl.sort;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import o.C8627dsp;
import o.C8632dsu;

/* loaded from: classes4.dex */
public abstract class MyListSortOrder implements Parcelable {
    private final List<MyListSortOrderOption> a;

    public /* synthetic */ MyListSortOrder(List list, C8627dsp c8627dsp) {
        this(list);
    }

    public final List<MyListSortOrderOption> b() {
        return this.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private MyListSortOrder(List<? extends MyListSortOrderOption> list) {
        this.a = list;
    }

    /* loaded from: classes4.dex */
    public static final class Default extends MyListSortOrder {
        public static final Default b = new Default();
        public static final Parcelable.Creator<Default> CREATOR = new Creator();

        /* loaded from: classes4.dex */
        public static final class Creator implements Parcelable.Creator<Default> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public final Default createFromParcel(Parcel parcel) {
                C8632dsu.c((Object) parcel, "");
                parcel.readInt();
                return Default.b;
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: e */
            public final Default[] newArray(int i) {
                return new Default[i];
            }
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Default) {
                Default r3 = (Default) obj;
                return true;
            }
            return false;
        }

        public int hashCode() {
            return 572575685;
        }

        public String toString() {
            return "Default";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            C8632dsu.c((Object) parcel, "");
            parcel.writeInt(1);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private Default() {
            /*
                r3 = this;
                r0 = 4
                com.netflix.mediaclient.ui.mylist.impl.sort.MyListSortOrderOption[] r0 = new com.netflix.mediaclient.ui.mylist.impl.sort.MyListSortOrderOption[r0]
                r1 = 0
                com.netflix.mediaclient.ui.mylist.impl.sort.MyListSortOrderOption$Suggested r2 = com.netflix.mediaclient.ui.mylist.impl.sort.MyListSortOrderOption.Suggested.a
                r0[r1] = r2
                r1 = 1
                com.netflix.mediaclient.ui.mylist.impl.sort.MyListSortOrderOption$DateAdded r2 = com.netflix.mediaclient.ui.mylist.impl.sort.MyListSortOrderOption.DateAdded.c
                r0[r1] = r2
                r1 = 2
                com.netflix.mediaclient.ui.mylist.impl.sort.MyListSortOrderOption$Alphabetical r2 = com.netflix.mediaclient.ui.mylist.impl.sort.MyListSortOrderOption.Alphabetical.b
                r0[r1] = r2
                r1 = 3
                com.netflix.mediaclient.ui.mylist.impl.sort.MyListSortOrderOption$ReleaseDate r2 = com.netflix.mediaclient.ui.mylist.impl.sort.MyListSortOrderOption.ReleaseDate.a
                r0[r1] = r2
                java.util.List r0 = o.C8570dqm.b(r0)
                r1 = 0
                r3.<init>(r0, r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.netflix.mediaclient.ui.mylist.impl.sort.MyListSortOrder.Default.<init>():void");
        }
    }
}
