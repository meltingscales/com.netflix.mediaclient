package com.netflix.mediaclient.service.webclient.model.leafs;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.netflix.mediaclient.service.webclient.model.leafs.AutoValue_UmaAlert;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public abstract class UmaAlert {
    public static final String ICON_ERROR = "error";
    public static final String ICON_INFO = "info";
    public static final String ICON_WARN = "warn";
    public static final String ICON_WHATSAPP = "whatsapp";
    private static final long UMA_STALE_TIMEOUT_MILLIS = TimeUnit.MINUTES.toMillis(10);
    private boolean mConsumed = false;

    /* loaded from: classes.dex */
    public enum Device {
        TABLET
    }

    /* loaded from: classes.dex */
    public enum ModalPlacement {
        CENTER,
        BOTTOM
    }

    /* loaded from: classes.dex */
    public enum Template {
        WHITE_MODAL,
        STANDARD,
        FLEXIBLE,
        THEMED_PROMO,
        COLLECTIONS,
        MONEYBALL_DRIVEN
    }

    public abstract int abTestCell();

    public abstract int abTestId();

    public abstract String backgroundAction();

    public abstract String backgroundImageUrlHigh();

    public abstract String backgroundImageUrlLow();

    public abstract String backgroundImageUrlMedium();

    public abstract boolean bannerAlert();

    public abstract String bannerBody();

    public abstract List<UmaCta> bannerCtas();

    public abstract String bannerIcon();

    public abstract String bannerTitle();

    public abstract String bannerTrackingInfo();

    public abstract String bannerUmsAlertRenderFeedback();

    public abstract List<Device> blockedDevicesList();

    public abstract boolean blocking();

    public abstract String body();

    public abstract UmaStyle bodyTextStyle();

    public abstract List<UmaCta> ctas();

    public abstract String flow();

    public abstract String footer();

    public abstract List<UmaCta> headerCtas();

    public abstract String headline();

    public abstract UmaStyle headlineTextStyle();

    public abstract String icon();

    public boolean isConsumed() {
        return this.mConsumed;
    }

    public abstract String locale();

    public abstract String messageGuid();

    public abstract long messageId();

    public abstract String messageName();

    public abstract boolean modalAlert();

    public abstract UmaModalAttributes modalAttributes();

    public abstract ModalPlacement modalPlacement();

    public abstract String mode();

    public abstract UmaMultiMonthOffer multiMonthOffer();

    public abstract UmaPresentAt presentAt();

    public void setConsumed(boolean z) {
        this.mConsumed = z;
    }

    public abstract boolean showOnBackgroundActionSuccess();

    public abstract boolean suppressForBackgroundAction();

    public abstract boolean suppressOnAppLaunch();

    public abstract String templateId();

    public abstract String themeName();

    public abstract UmaTimer timer();

    public abstract long timestamp();

    public abstract String title();

    public abstract UmaStyle titleTextStyle();

    public abstract boolean tooltipAlert();

    public abstract String tooltipAnchor();

    public abstract String tooltipBody();

    public abstract List<UmaCta> tooltipCtas();

    public abstract String tooltipIcon();

    public abstract String tooltipTitle();

    public abstract String trackingInfo();

    public abstract String umsAlertRenderFeedback();

    public static TypeAdapter<UmaAlert> typeAdapter(Gson gson) {
        return new AutoValue_UmaAlert.GsonTypeAdapter(gson).setDefaultCtas(Collections.emptyList()).setDefaultBannerCtas(Collections.emptyList());
    }

    public boolean isStale() {
        return System.currentTimeMillis() - timestamp() > UMA_STALE_TIMEOUT_MILLIS;
    }

    public boolean isKidsEligible() {
        return getTemplateType() == Template.COLLECTIONS || getTemplateType() == Template.FLEXIBLE;
    }

    public Template getTemplateType() {
        if ("white_modal".equals(templateId())) {
            return Template.WHITE_MODAL;
        }
        if ("themed_promo".equals(templateId())) {
            return Template.THEMED_PROMO;
        }
        if ("collections".equals(templateId())) {
            return Template.COLLECTIONS;
        }
        if ("flexible".equals(templateId())) {
            return Template.FLEXIBLE;
        }
        if ("moneyball_driven".equals(templateId())) {
            return Template.MONEYBALL_DRIVEN;
        }
        return Template.STANDARD;
    }
}
