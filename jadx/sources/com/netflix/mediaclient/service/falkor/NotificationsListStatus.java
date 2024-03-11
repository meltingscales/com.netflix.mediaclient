package com.netflix.mediaclient.service.falkor;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Objects;

/* loaded from: classes3.dex */
public class NotificationsListStatus implements Parcelable {
    private final int b;
    private final int d;
    private final String e;
    public static final NotificationsListStatus a = new NotificationsListStatus(0, 0, "");
    public static final Parcelable.Creator<NotificationsListStatus> CREATOR = new Parcelable.Creator<NotificationsListStatus>() { // from class: com.netflix.mediaclient.service.falkor.NotificationsListStatus.1
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public NotificationsListStatus createFromParcel(Parcel parcel) {
            return new NotificationsListStatus(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: e */
        public NotificationsListStatus[] newArray(int i) {
            return new NotificationsListStatus[i];
        }
    };

    public int a() {
        return this.d;
    }

    public boolean b() {
        return this.b > 0;
    }

    public String c() {
        return this.e;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int e() {
        return this.b;
    }

    public NotificationsListStatus(int i, int i2, String str) {
        this.b = i;
        this.d = i2;
        this.e = str;
    }

    protected NotificationsListStatus(Parcel parcel) {
        this.b = parcel.readInt();
        this.d = parcel.readInt();
        String readString = parcel.readString();
        this.e = readString == null ? "" : readString;
    }

    public String toString() {
        return "NotificationStatus unread:" + this.b + ", total:" + this.d + ", profileGuid:" + this.e;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.b);
        parcel.writeInt(this.d);
        parcel.writeString(this.e);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        NotificationsListStatus notificationsListStatus = (NotificationsListStatus) obj;
        return this.b == notificationsListStatus.b && this.d == notificationsListStatus.d && Objects.equals(this.e, notificationsListStatus.e);
    }

    public int hashCode() {
        int i = this.b;
        int i2 = this.d;
        return Objects.hash(Integer.valueOf(i), Integer.valueOf(i2), this.e);
    }
}
