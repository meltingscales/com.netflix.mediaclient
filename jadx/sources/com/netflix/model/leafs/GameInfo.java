package com.netflix.model.leafs;

import com.netflix.mediaclient.servicemgr.interface_.GameDetails;
import com.netflix.model.leafs.VideoInfo;
import java.util.List;
import o.InterfaceC5223buh;
import o.InterfaceC8319diD;

/* loaded from: classes5.dex */
public interface GameInfo {

    /* loaded from: classes5.dex */
    public interface GameDetail extends InterfaceC8319diD {
        String getAppStoreUrl();

        String getCompatibility();

        String getConnectivityRequirements();

        String getDeveloper();

        List<String> getLanguages();

        Integer getMaxNumberOfPlayers();

        Integer getMinAndroidSdkVersion();

        Integer getMinMemoryGb();

        Integer getMinNumProcessors();

        Integer getMinNumberOfPlayers();

        List<String> getModes();

        String getMotionBillboardVideoId();

        Integer getNumberOfPlayers();

        GameDetails.Orientation getOrientation();

        Integer getReleaseYear();

        Boolean getSupportsControllers();

        Boolean getSupportsInGameChat();

        Boolean getSupportsOfflineMode();

        String getSynopsis();

        String getVersion();
    }

    /* loaded from: classes5.dex */
    public interface GameScreenshot extends InterfaceC8319diD {
        String getScreenshotKey();

        String getScreenshotUrl();
    }

    /* loaded from: classes5.dex */
    public interface GameSummary extends VideoInfo.Summary, InterfaceC5223buh {
        String getCertification();

        String getGenre();

        String getHeroImageUrl();

        String getPackageName();

        Integer getSizeInMbs();

        String getTitleTreatmentImageUrl();
    }
}
