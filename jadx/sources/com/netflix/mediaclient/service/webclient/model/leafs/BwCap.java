package com.netflix.mediaclient.service.webclient.model.leafs;

import com.google.gson.annotations.SerializedName;

/* loaded from: classes.dex */
public final class BwCap {
    @SerializedName("auto")
    private int auto;
    @SerializedName("low")
    private int low;

    public static /* synthetic */ BwCap copy$default(BwCap bwCap, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = bwCap.auto;
        }
        if ((i3 & 2) != 0) {
            i2 = bwCap.low;
        }
        return bwCap.copy(i, i2);
    }

    public final int component1() {
        return this.auto;
    }

    public final int component2() {
        return this.low;
    }

    public final BwCap copy(int i, int i2) {
        return new BwCap(i, i2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof BwCap) {
            BwCap bwCap = (BwCap) obj;
            return this.auto == bwCap.auto && this.low == bwCap.low;
        }
        return false;
    }

    public final int getAuto() {
        return this.auto;
    }

    public final int getLow() {
        return this.low;
    }

    public int hashCode() {
        return (Integer.hashCode(this.auto) * 31) + Integer.hashCode(this.low);
    }

    public final void setAuto(int i) {
        this.auto = i;
    }

    public final void setLow(int i) {
        this.low = i;
    }

    public String toString() {
        int i = this.auto;
        int i2 = this.low;
        return "BwCap(auto=" + i + ", low=" + i2 + ")";
    }

    public BwCap(int i, int i2) {
        this.auto = i;
        this.low = i2;
    }
}
