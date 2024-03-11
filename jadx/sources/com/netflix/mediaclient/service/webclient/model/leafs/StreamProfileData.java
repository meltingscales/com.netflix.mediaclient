package com.netflix.mediaclient.service.webclient.model.leafs;

import com.google.gson.annotations.SerializedName;
import o.C8627dsp;
import o.C8632dsu;

/* loaded from: classes4.dex */
public final class StreamProfileData {
    @SerializedName("al1CellularCap")
    private BwCap al1CellularCap;
    @SerializedName("av1CellularCap")
    private BwCap av1CellularCap;
    @SerializedName("ce3CellularCap")
    private BwCap ce3CellularCap;
    @SerializedName("ce4CellularCap")
    private BwCap ce4CellularCap;
    @SerializedName("liveCellularCap")
    private BwCap liveCellularCap;
    public static final Companion Companion = new Companion(null);
    private static final int DEFAULT_CELLULAR_AUTO_KBPS = 600;
    private static final int DEFAULT_MANUAL_VIDEO_BITRATE_LOW = 400;
    private static final BwCap BW_CAP_DEFAULT = new BwCap(600, 400);

    public final BwCap getAl1CellularCap() {
        return this.al1CellularCap;
    }

    public final BwCap getAv1CellularCap() {
        return this.av1CellularCap;
    }

    public final BwCap getCe3CellularCap() {
        return this.ce3CellularCap;
    }

    public final BwCap getCe4CellularCap() {
        return this.ce4CellularCap;
    }

    public final BwCap getLiveCellularCap() {
        return this.liveCellularCap;
    }

    public final void setAl1CellularCap(BwCap bwCap) {
        C8632dsu.c((Object) bwCap, "");
        this.al1CellularCap = bwCap;
    }

    public final void setAv1CellularCap(BwCap bwCap) {
        C8632dsu.c((Object) bwCap, "");
        this.av1CellularCap = bwCap;
    }

    public final void setCe3CellularCap(BwCap bwCap) {
        C8632dsu.c((Object) bwCap, "");
        this.ce3CellularCap = bwCap;
    }

    public final void setCe4CellularCap(BwCap bwCap) {
        C8632dsu.c((Object) bwCap, "");
        this.ce4CellularCap = bwCap;
    }

    public final void setLiveCellularCap(BwCap bwCap) {
        C8632dsu.c((Object) bwCap, "");
        this.liveCellularCap = bwCap;
    }

    public StreamProfileData() {
        BwCap bwCap = BW_CAP_DEFAULT;
        this.ce3CellularCap = bwCap;
        this.al1CellularCap = bwCap;
        this.av1CellularCap = bwCap;
        this.ce4CellularCap = bwCap;
        this.liveCellularCap = bwCap;
    }

    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(C8627dsp c8627dsp) {
            this();
        }

        private Companion() {
        }

        public final int getDEFAULT_CELLULAR_AUTO_KBPS() {
            return StreamProfileData.DEFAULT_CELLULAR_AUTO_KBPS;
        }

        public final int getDEFAULT_MANUAL_VIDEO_BITRATE_LOW() {
            return StreamProfileData.DEFAULT_MANUAL_VIDEO_BITRATE_LOW;
        }

        public final BwCap getBW_CAP_DEFAULT() {
            return StreamProfileData.BW_CAP_DEFAULT;
        }
    }
}
