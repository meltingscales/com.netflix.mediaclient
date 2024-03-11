package com.netflix.mediaclient.service.webclient.model.leafs;

import android.os.Parcel;

/* loaded from: classes4.dex */
public class ListSummary {
    private int length;

    public int getLength() {
        return this.length;
    }

    public void setLength(int i) {
        this.length = i;
    }

    public ListSummary(int i) {
        this.length = i;
    }

    protected ListSummary(Parcel parcel) {
        this.length = parcel.readInt();
    }

    protected void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.length);
    }
}
