package o;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.netflix.mediaclient.media.Watermark;
import com.netflix.mediaclient.media.manifest.Location;
import com.netflix.mediaclient.media.manifest.ManifestLimitedLicense;
import com.netflix.mediaclient.media.manifest.SegmentVmaf;
import com.netflix.mediaclient.media.manifest.Snippet;
import com.netflix.mediaclient.media.manifest.Snippets;
import com.netflix.mediaclient.media.manifest.Stream;
import com.netflix.mediaclient.media.manifest.Url;
import com.netflix.mediaclient.media.manifest.VideoTrack;
import com.netflix.mediaclient.service.player.manifest.LiveMetadata;
import com.netflix.mediaclient.service.webclient.model.leafs.BreadcrumbLoggingSpecification;
import com.netflix.mediaclient.service.webclient.model.leafs.ConsolidatedLoggingSessionSpecification;
import com.netflix.mediaclient.service.webclient.model.leafs.DeviceConfigData;
import com.netflix.mediaclient.service.webclient.model.leafs.ErrorLoggingSpecification;
import com.netflix.mediaclient.service.webclient.model.leafs.ExoConfigOverride;
import com.netflix.mediaclient.service.webclient.model.leafs.FtlConfig;
import com.netflix.mediaclient.service.webclient.model.leafs.FtlTarget;
import com.netflix.mediaclient.service.webclient.model.leafs.MdeConfig;
import com.netflix.mediaclient.service.webclient.model.leafs.MinusoneConfig;
import com.netflix.mediaclient.service.webclient.model.leafs.OfflineCodecPrefData;
import com.netflix.mediaclient.service.webclient.model.leafs.OfflineConfig;
import com.netflix.mediaclient.service.webclient.model.leafs.PartnerIntegrationConfig;
import com.netflix.mediaclient.service.webclient.model.leafs.PdsAndLogblobConfig;
import com.netflix.mediaclient.service.webclient.model.leafs.ResolveSimpleUrlPatternResponse;
import com.netflix.mediaclient.service.webclient.model.leafs.SearchResultsSimilarityAlgorithm;
import com.netflix.mediaclient.service.webclient.model.leafs.SfinderConfig;
import com.netflix.mediaclient.service.webclient.model.leafs.StreamingCodecPrefData;
import com.netflix.mediaclient.service.webclient.model.leafs.StreamingConfigOverride;
import com.netflix.mediaclient.service.webclient.model.leafs.Threshold;
import com.netflix.mediaclient.service.webclient.model.leafs.UmaAlert;
import com.netflix.mediaclient.service.webclient.model.leafs.UmaBackgroundStyle;
import com.netflix.mediaclient.service.webclient.model.leafs.UmaButtonStyle;
import com.netflix.mediaclient.service.webclient.model.leafs.UmaCta;
import com.netflix.mediaclient.service.webclient.model.leafs.UmaCtaInputGroup;
import com.netflix.mediaclient.service.webclient.model.leafs.UmaDimensions;
import com.netflix.mediaclient.service.webclient.model.leafs.UmaImageDetails;
import com.netflix.mediaclient.service.webclient.model.leafs.UmaImagePosition;
import com.netflix.mediaclient.service.webclient.model.leafs.UmaModalAttributes;
import com.netflix.mediaclient.service.webclient.model.leafs.UmaMultiMonthOffer;
import com.netflix.mediaclient.service.webclient.model.leafs.UmaMultiMonthOfferChoice;
import com.netflix.mediaclient.service.webclient.model.leafs.UmaMultiMonthOfferData;
import com.netflix.mediaclient.service.webclient.model.leafs.UmaPadding;
import com.netflix.mediaclient.service.webclient.model.leafs.UmaPresentAt;
import com.netflix.mediaclient.service.webclient.model.leafs.UmaStyle;
import com.netflix.mediaclient.service.webclient.model.leafs.UmaTimer;
import com.netflix.mediaclient.service.webclient.model.leafs.UpdateProductChoiceResponse;
import com.netflix.mediaclient.service.webclient.model.leafs.VoipConfiguration;
import com.netflix.model.survey.Survey;
import com.netflix.model.survey.SurveyQuestion;

/* renamed from: o.Mj  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1041Mj extends AbstractC1036Md {
    @Override // com.google.gson.TypeAdapterFactory
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
        Class<? super T> rawType = typeToken.getRawType();
        if (AbstractC4518bfy.class.isAssignableFrom(rawType)) {
            return (TypeAdapter<T>) AbstractC4518bfy.e(gson);
        }
        if (AbstractC4468bfA.class.isAssignableFrom(rawType)) {
            return (TypeAdapter<T>) AbstractC4468bfA.d(gson);
        }
        if (AbstractC4470bfC.class.isAssignableFrom(rawType)) {
            return (TypeAdapter<T>) AbstractC4470bfC.c(gson);
        }
        if (AbstractC4473bfF.class.isAssignableFrom(rawType)) {
            return (TypeAdapter<T>) AbstractC4473bfF.b(gson);
        }
        if (AbstractC4472bfE.class.isAssignableFrom(rawType)) {
            return (TypeAdapter<T>) AbstractC4472bfE.a(gson);
        }
        if (BreadcrumbLoggingSpecification.class.isAssignableFrom(rawType)) {
            return (TypeAdapter<T>) BreadcrumbLoggingSpecification.typeAdapter(gson);
        }
        if (AbstractC4554bgh.class.isAssignableFrom(rawType)) {
            return (TypeAdapter<T>) AbstractC4554bgh.d(gson);
        }
        if (AbstractC4556bgj.class.isAssignableFrom(rawType)) {
            return (TypeAdapter<T>) AbstractC4556bgj.e(gson);
        }
        if (ConsolidatedLoggingSessionSpecification.class.isAssignableFrom(rawType)) {
            return (TypeAdapter<T>) ConsolidatedLoggingSessionSpecification.typeAdapter(gson);
        }
        if (AbstractC4558bgl.class.isAssignableFrom(rawType)) {
            return (TypeAdapter<T>) AbstractC4558bgl.e(gson);
        }
        if (NV.class.isAssignableFrom(rawType)) {
            return (TypeAdapter<T>) NV.b(gson);
        }
        if (AbstractC4562bgp.class.isAssignableFrom(rawType)) {
            return (TypeAdapter<T>) AbstractC4562bgp.a(gson);
        }
        if (DeviceConfigData.class.isAssignableFrom(rawType)) {
            return (TypeAdapter<T>) DeviceConfigData.typeAdapter(gson);
        }
        if (NX.class.isAssignableFrom(rawType)) {
            return (TypeAdapter<T>) NX.e(gson);
        }
        if (AbstractC4560bgn.class.isAssignableFrom(rawType)) {
            return (TypeAdapter<T>) AbstractC4560bgn.c(gson);
        }
        if (ErrorLoggingSpecification.class.isAssignableFrom(rawType)) {
            return (TypeAdapter<T>) ErrorLoggingSpecification.typeAdapter(gson);
        }
        if (ExoConfigOverride.class.isAssignableFrom(rawType)) {
            return (TypeAdapter<T>) ExoConfigOverride.typeAdapter(gson);
        }
        if (FtlConfig.class.isAssignableFrom(rawType)) {
            return (TypeAdapter<T>) FtlConfig.typeAdapter(gson);
        }
        if (FtlTarget.class.isAssignableFrom(rawType)) {
            return (TypeAdapter<T>) FtlTarget.typeAdapter(gson);
        }
        if (AbstractC4559bgm.class.isAssignableFrom(rawType)) {
            return (TypeAdapter<T>) AbstractC4559bgm.e(gson);
        }
        if (AbstractC4561bgo.class.isAssignableFrom(rawType)) {
            return (TypeAdapter<T>) AbstractC4561bgo.c(gson);
        }
        if (LiveMetadata.class.isAssignableFrom(rawType)) {
            return (TypeAdapter<T>) LiveMetadata.a(gson);
        }
        if (Location.class.isAssignableFrom(rawType)) {
            return (TypeAdapter<T>) Location.typeAdapter(gson);
        }
        if (ManifestLimitedLicense.class.isAssignableFrom(rawType)) {
            return (TypeAdapter<T>) ManifestLimitedLicense.typeAdapter(gson);
        }
        if (AbstractC4564bgr.class.isAssignableFrom(rawType)) {
            return (TypeAdapter<T>) AbstractC4564bgr.d(gson);
        }
        if (MdeConfig.class.isAssignableFrom(rawType)) {
            return (TypeAdapter<T>) MdeConfig.typeAdapter(gson);
        }
        if (AbstractC4567bgu.class.isAssignableFrom(rawType)) {
            return (TypeAdapter<T>) AbstractC4567bgu.c(gson);
        }
        if (MinusoneConfig.class.isAssignableFrom(rawType)) {
            return (TypeAdapter<T>) MinusoneConfig.typeAdapter(gson);
        }
        if (AbstractC4565bgs.class.isAssignableFrom(rawType)) {
            return (TypeAdapter<T>) AbstractC4565bgs.a(gson);
        }
        if (OfflineCodecPrefData.class.isAssignableFrom(rawType)) {
            return (TypeAdapter<T>) OfflineCodecPrefData.typeAdapter(gson);
        }
        if (OfflineConfig.class.isAssignableFrom(rawType)) {
            return (TypeAdapter<T>) OfflineConfig.typeAdapter(gson);
        }
        if (PartnerIntegrationConfig.class.isAssignableFrom(rawType)) {
            return (TypeAdapter<T>) PartnerIntegrationConfig.typeAdapter(gson);
        }
        if (PdsAndLogblobConfig.class.isAssignableFrom(rawType)) {
            return (TypeAdapter<T>) PdsAndLogblobConfig.typeAdapter(gson);
        }
        if (AbstractC4528bgH.class.isAssignableFrom(rawType)) {
            return (TypeAdapter<T>) AbstractC4528bgH.e(gson);
        }
        if (AbstractC4530bgJ.class.isAssignableFrom(rawType)) {
            return (TypeAdapter<T>) AbstractC4530bgJ.a(gson);
        }
        if (ResolveSimpleUrlPatternResponse.class.isAssignableFrom(rawType)) {
            return (TypeAdapter<T>) ResolveSimpleUrlPatternResponse.typeAdapter(gson);
        }
        if (SearchResultsSimilarityAlgorithm.class.isAssignableFrom(rawType)) {
            return (TypeAdapter<T>) SearchResultsSimilarityAlgorithm.typeAdapter(gson);
        }
        if (AbstractC4531bgK.class.isAssignableFrom(rawType)) {
            return (TypeAdapter<T>) AbstractC4531bgK.b(gson);
        }
        if (AbstractC4529bgI.class.isAssignableFrom(rawType)) {
            return (TypeAdapter<T>) AbstractC4529bgI.e(gson);
        }
        if (SegmentVmaf.class.isAssignableFrom(rawType)) {
            return (TypeAdapter<T>) SegmentVmaf.typeAdapter(gson);
        }
        if (AbstractC4534bgN.class.isAssignableFrom(rawType)) {
            return (TypeAdapter<T>) AbstractC4534bgN.e(gson);
        }
        if (SfinderConfig.class.isAssignableFrom(rawType)) {
            return (TypeAdapter<T>) SfinderConfig.typeAdapter(gson);
        }
        if (Snippet.class.isAssignableFrom(rawType)) {
            return (TypeAdapter<T>) Snippet.typeAdapter(gson);
        }
        if (Snippets.class.isAssignableFrom(rawType)) {
            return (TypeAdapter<T>) Snippets.typeAdapter(gson);
        }
        if (AbstractC4535bgO.class.isAssignableFrom(rawType)) {
            return (TypeAdapter<T>) AbstractC4535bgO.b(gson);
        }
        if (AbstractC4532bgL.class.isAssignableFrom(rawType)) {
            return (TypeAdapter<T>) AbstractC4532bgL.c(gson);
        }
        if (Stream.class.isAssignableFrom(rawType)) {
            return (TypeAdapter<T>) Stream.typeAdapter(gson);
        }
        if (StreamingCodecPrefData.class.isAssignableFrom(rawType)) {
            return (TypeAdapter<T>) StreamingCodecPrefData.typeAdapter(gson);
        }
        if (StreamingConfigOverride.class.isAssignableFrom(rawType)) {
            return (TypeAdapter<T>) StreamingConfigOverride.typeAdapter(gson);
        }
        if (AbstractC4536bgP.class.isAssignableFrom(rawType)) {
            return (TypeAdapter<T>) AbstractC4536bgP.d(gson);
        }
        if (Survey.class.isAssignableFrom(rawType)) {
            return (TypeAdapter<T>) Survey.a(gson);
        }
        if (SurveyQuestion.class.isAssignableFrom(rawType)) {
            return (TypeAdapter<T>) SurveyQuestion.a(gson);
        }
        if (Threshold.class.isAssignableFrom(rawType)) {
            return (TypeAdapter<T>) Threshold.typeAdapter(gson);
        }
        if (AbstractC4533bgM.class.isAssignableFrom(rawType)) {
            return (TypeAdapter<T>) AbstractC4533bgM.c(gson);
        }
        if (AbstractC4537bgQ.class.isAssignableFrom(rawType)) {
            return (TypeAdapter<T>) AbstractC4537bgQ.c(gson);
        }
        if (AbstractC4541bgU.class.isAssignableFrom(rawType)) {
            return (TypeAdapter<T>) AbstractC4541bgU.c(gson);
        }
        if (AbstractC4539bgS.class.isAssignableFrom(rawType)) {
            return (TypeAdapter<T>) AbstractC4539bgS.b(gson);
        }
        if (UmaAlert.class.isAssignableFrom(rawType)) {
            return (TypeAdapter<T>) UmaAlert.typeAdapter(gson);
        }
        if (UmaBackgroundStyle.class.isAssignableFrom(rawType)) {
            return (TypeAdapter<T>) UmaBackgroundStyle.typeAdapter(gson);
        }
        if (UmaButtonStyle.class.isAssignableFrom(rawType)) {
            return (TypeAdapter<T>) UmaButtonStyle.typeAdapter(gson);
        }
        if (UmaCta.class.isAssignableFrom(rawType)) {
            return (TypeAdapter<T>) UmaCta.typeAdapter(gson);
        }
        if (UmaCtaInputGroup.class.isAssignableFrom(rawType)) {
            return (TypeAdapter<T>) UmaCtaInputGroup.typeAdapter(gson);
        }
        if (UmaDimensions.class.isAssignableFrom(rawType)) {
            return (TypeAdapter<T>) UmaDimensions.typeAdapter(gson);
        }
        if (UmaImageDetails.class.isAssignableFrom(rawType)) {
            return (TypeAdapter<T>) UmaImageDetails.typeAdapter(gson);
        }
        if (UmaImagePosition.class.isAssignableFrom(rawType)) {
            return (TypeAdapter<T>) UmaImagePosition.typeAdapter(gson);
        }
        if (UmaModalAttributes.class.isAssignableFrom(rawType)) {
            return (TypeAdapter<T>) UmaModalAttributes.typeAdapter(gson);
        }
        if (UmaMultiMonthOffer.class.isAssignableFrom(rawType)) {
            return (TypeAdapter<T>) UmaMultiMonthOffer.typeAdapter(gson);
        }
        if (UmaMultiMonthOfferChoice.class.isAssignableFrom(rawType)) {
            return (TypeAdapter<T>) UmaMultiMonthOfferChoice.typeAdapter(gson);
        }
        if (UmaMultiMonthOfferData.class.isAssignableFrom(rawType)) {
            return (TypeAdapter<T>) UmaMultiMonthOfferData.typeAdapter(gson);
        }
        if (UmaPadding.class.isAssignableFrom(rawType)) {
            return (TypeAdapter<T>) UmaPadding.typeAdapter(gson);
        }
        if (UmaPresentAt.class.isAssignableFrom(rawType)) {
            return (TypeAdapter<T>) UmaPresentAt.typeAdapter(gson);
        }
        if (UmaStyle.class.isAssignableFrom(rawType)) {
            return (TypeAdapter<T>) UmaStyle.typeAdapter(gson);
        }
        if (UmaTimer.class.isAssignableFrom(rawType)) {
            return (TypeAdapter<T>) UmaTimer.typeAdapter(gson);
        }
        if (UpdateProductChoiceResponse.class.isAssignableFrom(rawType)) {
            return (TypeAdapter<T>) UpdateProductChoiceResponse.typeAdapter(gson);
        }
        if (Url.class.isAssignableFrom(rawType)) {
            return (TypeAdapter<T>) Url.typeAdapter(gson);
        }
        if (VideoTrack.class.isAssignableFrom(rawType)) {
            return (TypeAdapter<T>) VideoTrack.typeAdapter(gson);
        }
        if (AbstractC5079brw.class.isAssignableFrom(rawType)) {
            return (TypeAdapter<T>) AbstractC5079brw.a(gson);
        }
        if (VoipConfiguration.class.isAssignableFrom(rawType)) {
            return (TypeAdapter<T>) VoipConfiguration.typeAdapter(gson);
        }
        if (Watermark.class.isAssignableFrom(rawType)) {
            return (TypeAdapter<T>) Watermark.typeAdapter(gson);
        }
        return null;
    }
}
