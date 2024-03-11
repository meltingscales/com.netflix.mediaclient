package com.netflix.model.leafs;

import o.InterfaceC5223buh;

/* loaded from: classes5.dex */
public interface VideoInfo {

    /* loaded from: classes5.dex */
    public interface GameAssets {
        String getAppIconUrl();

        String getGameTag();
    }

    /* loaded from: classes5.dex */
    public interface HorzBillboardArt {
        Integer getHeight();

        String getKey();

        String getUrl();

        Integer getWidth();
    }

    /* loaded from: classes5.dex */
    public interface KidsSummary extends Summary, InterfaceC5223buh {
    }

    /* loaded from: classes5.dex */
    public interface LogoBrandedHorizontal {
        String getUrl();
    }

    /* loaded from: classes5.dex */
    public interface Sharing {
        String getBoxArtUrl();

        String getTitleLogoUrl();

        String getVerticalBillboardUrl();
    }

    /* loaded from: classes5.dex */
    public interface Summary {
        String getBoxartUrl();

        String getCertificationBoardId();

        String getCertificationLevel();

        String getCertificationValue();

        int getDisplayRuntime();

        String getSeasonNumLabel();

        String getSynopsis();

        String getYear();
    }

    /* loaded from: classes5.dex */
    public interface TallPanelArt {
        String getImageTypeIdentifier();

        String getUrl();
    }

    /* loaded from: classes5.dex */
    public interface TimeCodes {
        TimeCodesData getTimeCodesData();
    }

    /* loaded from: classes5.dex */
    public interface TopTenBoxart {
        String getBoxartId();

        String getUrl();
    }
}
