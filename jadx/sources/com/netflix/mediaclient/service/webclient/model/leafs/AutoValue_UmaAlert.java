package com.netflix.mediaclient.service.webclient.model.leafs;

import androidx.appcompat.widget.ActivityChooserModel;
import com.fasterxml.jackson.core.JsonFactory;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.netflix.android.org.json.zip.JSONzip;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.mediaclient.service.pushnotification.Payload;
import com.netflix.mediaclient.service.webclient.model.leafs.UmaAlert;
import java.util.List;
import org.chromium.net.ConnectionSubtype;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class AutoValue_UmaAlert extends C$AutoValue_UmaAlert {
    AutoValue_UmaAlert(final int i, final int i2, final String str, final String str2, final String str3, final long j, final String str4, final String str5, final String str6, final String str7, final String str8, final String str9, final boolean z, final boolean z2, final boolean z3, final boolean z4, final UmaPresentAt umaPresentAt, final String str10, final String str11, final boolean z5, final boolean z6, final boolean z7, final String str12, final String str13, final String str14, final String str15, final UmaModalAttributes umaModalAttributes, final String str16, final String str17, final UmaStyle umaStyle, final UmaStyle umaStyle2, final String str18, final String str19, final String str20, final String str21, final UmaStyle umaStyle3, final String str22, final List<UmaCta> list, final List<UmaCta> list2, final List<UmaCta> list3, final List<UmaCta> list4, final String str23, final String str24, final String str25, final String str26, final long j2, final UmaTimer umaTimer, final UmaMultiMonthOffer umaMultiMonthOffer, final String str27, final UmaAlert.ModalPlacement modalPlacement, final List<UmaAlert.Device> list5) {
        new UmaAlert(i, i2, str, str2, str3, j, str4, str5, str6, str7, str8, str9, z, z2, z3, z4, umaPresentAt, str10, str11, z5, z6, z7, str12, str13, str14, str15, umaModalAttributes, str16, str17, umaStyle, umaStyle2, str18, str19, str20, str21, umaStyle3, str22, list, list2, list3, list4, str23, str24, str25, str26, j2, umaTimer, umaMultiMonthOffer, str27, modalPlacement, list5) { // from class: com.netflix.mediaclient.service.webclient.model.leafs.$AutoValue_UmaAlert
            private final int abTestCell;
            private final int abTestId;
            private final String backgroundAction;
            private final String backgroundImageUrlHigh;
            private final String backgroundImageUrlLow;
            private final String backgroundImageUrlMedium;
            private final boolean bannerAlert;
            private final String bannerBody;
            private final List<UmaCta> bannerCtas;
            private final String bannerIcon;
            private final String bannerTitle;
            private final String bannerTrackingInfo;
            private final String bannerUmsAlertRenderFeedback;
            private final List<UmaAlert.Device> blockedDevicesList;
            private final boolean blocking;
            private final String body;
            private final UmaStyle bodyTextStyle;
            private final List<UmaCta> ctas;
            private final String flow;
            private final String footer;
            private final List<UmaCta> headerCtas;
            private final String headline;
            private final UmaStyle headlineTextStyle;
            private final String icon;
            private final String locale;
            private final String messageGuid;
            private final long messageId;
            private final String messageName;
            private final boolean modalAlert;
            private final UmaModalAttributes modalAttributes;
            private final UmaAlert.ModalPlacement modalPlacement;
            private final String mode;
            private final UmaMultiMonthOffer multiMonthOffer;
            private final UmaPresentAt presentAt;
            private final boolean showOnBackgroundActionSuccess;
            private final boolean suppressForBackgroundAction;
            private final boolean suppressOnAppLaunch;
            private final String templateId;
            private final String themeName;
            private final UmaTimer timer;
            private final long timestamp;
            private final String title;
            private final UmaStyle titleTextStyle;
            private final boolean tooltipAlert;
            private final String tooltipAnchor;
            private final String tooltipBody;
            private final List<UmaCta> tooltipCtas;
            private final String tooltipIcon;
            private final String tooltipTitle;
            private final String trackingInfo;
            private final String umsAlertRenderFeedback;

            @Override // com.netflix.mediaclient.service.webclient.model.leafs.UmaAlert
            public int abTestCell() {
                return this.abTestCell;
            }

            @Override // com.netflix.mediaclient.service.webclient.model.leafs.UmaAlert
            public int abTestId() {
                return this.abTestId;
            }

            @Override // com.netflix.mediaclient.service.webclient.model.leafs.UmaAlert
            public String backgroundAction() {
                return this.backgroundAction;
            }

            @Override // com.netflix.mediaclient.service.webclient.model.leafs.UmaAlert
            public String backgroundImageUrlHigh() {
                return this.backgroundImageUrlHigh;
            }

            @Override // com.netflix.mediaclient.service.webclient.model.leafs.UmaAlert
            public String backgroundImageUrlLow() {
                return this.backgroundImageUrlLow;
            }

            @Override // com.netflix.mediaclient.service.webclient.model.leafs.UmaAlert
            public String backgroundImageUrlMedium() {
                return this.backgroundImageUrlMedium;
            }

            @Override // com.netflix.mediaclient.service.webclient.model.leafs.UmaAlert
            public boolean bannerAlert() {
                return this.bannerAlert;
            }

            @Override // com.netflix.mediaclient.service.webclient.model.leafs.UmaAlert
            public String bannerBody() {
                return this.bannerBody;
            }

            @Override // com.netflix.mediaclient.service.webclient.model.leafs.UmaAlert
            public List<UmaCta> bannerCtas() {
                return this.bannerCtas;
            }

            @Override // com.netflix.mediaclient.service.webclient.model.leafs.UmaAlert
            public String bannerIcon() {
                return this.bannerIcon;
            }

            @Override // com.netflix.mediaclient.service.webclient.model.leafs.UmaAlert
            public String bannerTitle() {
                return this.bannerTitle;
            }

            @Override // com.netflix.mediaclient.service.webclient.model.leafs.UmaAlert
            public String bannerTrackingInfo() {
                return this.bannerTrackingInfo;
            }

            @Override // com.netflix.mediaclient.service.webclient.model.leafs.UmaAlert
            public String bannerUmsAlertRenderFeedback() {
                return this.bannerUmsAlertRenderFeedback;
            }

            @Override // com.netflix.mediaclient.service.webclient.model.leafs.UmaAlert
            public List<UmaAlert.Device> blockedDevicesList() {
                return this.blockedDevicesList;
            }

            @Override // com.netflix.mediaclient.service.webclient.model.leafs.UmaAlert
            public boolean blocking() {
                return this.blocking;
            }

            @Override // com.netflix.mediaclient.service.webclient.model.leafs.UmaAlert
            public String body() {
                return this.body;
            }

            @Override // com.netflix.mediaclient.service.webclient.model.leafs.UmaAlert
            public UmaStyle bodyTextStyle() {
                return this.bodyTextStyle;
            }

            @Override // com.netflix.mediaclient.service.webclient.model.leafs.UmaAlert
            public List<UmaCta> ctas() {
                return this.ctas;
            }

            @Override // com.netflix.mediaclient.service.webclient.model.leafs.UmaAlert
            public String flow() {
                return this.flow;
            }

            @Override // com.netflix.mediaclient.service.webclient.model.leafs.UmaAlert
            public String footer() {
                return this.footer;
            }

            @Override // com.netflix.mediaclient.service.webclient.model.leafs.UmaAlert
            public List<UmaCta> headerCtas() {
                return this.headerCtas;
            }

            @Override // com.netflix.mediaclient.service.webclient.model.leafs.UmaAlert
            public String headline() {
                return this.headline;
            }

            @Override // com.netflix.mediaclient.service.webclient.model.leafs.UmaAlert
            public UmaStyle headlineTextStyle() {
                return this.headlineTextStyle;
            }

            @Override // com.netflix.mediaclient.service.webclient.model.leafs.UmaAlert
            public String icon() {
                return this.icon;
            }

            @Override // com.netflix.mediaclient.service.webclient.model.leafs.UmaAlert
            public String locale() {
                return this.locale;
            }

            @Override // com.netflix.mediaclient.service.webclient.model.leafs.UmaAlert
            public String messageGuid() {
                return this.messageGuid;
            }

            @Override // com.netflix.mediaclient.service.webclient.model.leafs.UmaAlert
            public long messageId() {
                return this.messageId;
            }

            @Override // com.netflix.mediaclient.service.webclient.model.leafs.UmaAlert
            public String messageName() {
                return this.messageName;
            }

            @Override // com.netflix.mediaclient.service.webclient.model.leafs.UmaAlert
            public boolean modalAlert() {
                return this.modalAlert;
            }

            @Override // com.netflix.mediaclient.service.webclient.model.leafs.UmaAlert
            public UmaModalAttributes modalAttributes() {
                return this.modalAttributes;
            }

            @Override // com.netflix.mediaclient.service.webclient.model.leafs.UmaAlert
            public UmaAlert.ModalPlacement modalPlacement() {
                return this.modalPlacement;
            }

            @Override // com.netflix.mediaclient.service.webclient.model.leafs.UmaAlert
            public String mode() {
                return this.mode;
            }

            @Override // com.netflix.mediaclient.service.webclient.model.leafs.UmaAlert
            public UmaMultiMonthOffer multiMonthOffer() {
                return this.multiMonthOffer;
            }

            @Override // com.netflix.mediaclient.service.webclient.model.leafs.UmaAlert
            public UmaPresentAt presentAt() {
                return this.presentAt;
            }

            @Override // com.netflix.mediaclient.service.webclient.model.leafs.UmaAlert
            public boolean showOnBackgroundActionSuccess() {
                return this.showOnBackgroundActionSuccess;
            }

            @Override // com.netflix.mediaclient.service.webclient.model.leafs.UmaAlert
            public boolean suppressForBackgroundAction() {
                return this.suppressForBackgroundAction;
            }

            @Override // com.netflix.mediaclient.service.webclient.model.leafs.UmaAlert
            public boolean suppressOnAppLaunch() {
                return this.suppressOnAppLaunch;
            }

            @Override // com.netflix.mediaclient.service.webclient.model.leafs.UmaAlert
            public String templateId() {
                return this.templateId;
            }

            @Override // com.netflix.mediaclient.service.webclient.model.leafs.UmaAlert
            public String themeName() {
                return this.themeName;
            }

            @Override // com.netflix.mediaclient.service.webclient.model.leafs.UmaAlert
            public UmaTimer timer() {
                return this.timer;
            }

            @Override // com.netflix.mediaclient.service.webclient.model.leafs.UmaAlert
            public long timestamp() {
                return this.timestamp;
            }

            @Override // com.netflix.mediaclient.service.webclient.model.leafs.UmaAlert
            public String title() {
                return this.title;
            }

            @Override // com.netflix.mediaclient.service.webclient.model.leafs.UmaAlert
            public UmaStyle titleTextStyle() {
                return this.titleTextStyle;
            }

            @Override // com.netflix.mediaclient.service.webclient.model.leafs.UmaAlert
            public boolean tooltipAlert() {
                return this.tooltipAlert;
            }

            @Override // com.netflix.mediaclient.service.webclient.model.leafs.UmaAlert
            public String tooltipAnchor() {
                return this.tooltipAnchor;
            }

            @Override // com.netflix.mediaclient.service.webclient.model.leafs.UmaAlert
            public String tooltipBody() {
                return this.tooltipBody;
            }

            @Override // com.netflix.mediaclient.service.webclient.model.leafs.UmaAlert
            public List<UmaCta> tooltipCtas() {
                return this.tooltipCtas;
            }

            @Override // com.netflix.mediaclient.service.webclient.model.leafs.UmaAlert
            public String tooltipIcon() {
                return this.tooltipIcon;
            }

            @Override // com.netflix.mediaclient.service.webclient.model.leafs.UmaAlert
            public String tooltipTitle() {
                return this.tooltipTitle;
            }

            @Override // com.netflix.mediaclient.service.webclient.model.leafs.UmaAlert
            public String trackingInfo() {
                return this.trackingInfo;
            }

            @Override // com.netflix.mediaclient.service.webclient.model.leafs.UmaAlert
            public String umsAlertRenderFeedback() {
                return this.umsAlertRenderFeedback;
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.abTestCell = i;
                this.abTestId = i2;
                this.locale = str;
                this.templateId = str2;
                this.messageName = str3;
                this.messageId = j;
                this.messageGuid = str4;
                this.icon = str5;
                this.bannerIcon = str6;
                this.tooltipIcon = str7;
                this.tooltipAnchor = str8;
                this.tooltipBody = str9;
                this.blocking = z;
                this.modalAlert = z2;
                this.bannerAlert = z3;
                this.tooltipAlert = z4;
                this.presentAt = umaPresentAt;
                this.flow = str10;
                this.mode = str11;
                this.suppressOnAppLaunch = z5;
                this.suppressForBackgroundAction = z6;
                this.showOnBackgroundActionSuccess = z7;
                this.backgroundAction = str12;
                this.backgroundImageUrlHigh = str13;
                this.backgroundImageUrlMedium = str14;
                this.backgroundImageUrlLow = str15;
                this.modalAttributes = umaModalAttributes;
                this.headline = str16;
                this.title = str17;
                this.headlineTextStyle = umaStyle;
                this.titleTextStyle = umaStyle2;
                this.bannerTitle = str18;
                this.tooltipTitle = str19;
                this.body = str20;
                this.footer = str21;
                this.bodyTextStyle = umaStyle3;
                this.bannerBody = str22;
                this.headerCtas = list;
                this.ctas = list2;
                this.bannerCtas = list3;
                this.tooltipCtas = list4;
                this.trackingInfo = str23;
                this.bannerTrackingInfo = str24;
                this.umsAlertRenderFeedback = str25;
                this.bannerUmsAlertRenderFeedback = str26;
                this.timestamp = j2;
                this.timer = umaTimer;
                this.multiMonthOffer = umaMultiMonthOffer;
                this.themeName = str27;
                this.modalPlacement = modalPlacement;
                this.blockedDevicesList = list5;
            }

            public String toString() {
                return "UmaAlert{abTestCell=" + this.abTestCell + ", abTestId=" + this.abTestId + ", locale=" + this.locale + ", templateId=" + this.templateId + ", messageName=" + this.messageName + ", messageId=" + this.messageId + ", messageGuid=" + this.messageGuid + ", icon=" + this.icon + ", bannerIcon=" + this.bannerIcon + ", tooltipIcon=" + this.tooltipIcon + ", tooltipAnchor=" + this.tooltipAnchor + ", tooltipBody=" + this.tooltipBody + ", blocking=" + this.blocking + ", modalAlert=" + this.modalAlert + ", bannerAlert=" + this.bannerAlert + ", tooltipAlert=" + this.tooltipAlert + ", presentAt=" + this.presentAt + ", flow=" + this.flow + ", mode=" + this.mode + ", suppressOnAppLaunch=" + this.suppressOnAppLaunch + ", suppressForBackgroundAction=" + this.suppressForBackgroundAction + ", showOnBackgroundActionSuccess=" + this.showOnBackgroundActionSuccess + ", backgroundAction=" + this.backgroundAction + ", backgroundImageUrlHigh=" + this.backgroundImageUrlHigh + ", backgroundImageUrlMedium=" + this.backgroundImageUrlMedium + ", backgroundImageUrlLow=" + this.backgroundImageUrlLow + ", modalAttributes=" + this.modalAttributes + ", headline=" + this.headline + ", title=" + this.title + ", headlineTextStyle=" + this.headlineTextStyle + ", titleTextStyle=" + this.titleTextStyle + ", bannerTitle=" + this.bannerTitle + ", tooltipTitle=" + this.tooltipTitle + ", body=" + this.body + ", footer=" + this.footer + ", bodyTextStyle=" + this.bodyTextStyle + ", bannerBody=" + this.bannerBody + ", headerCtas=" + this.headerCtas + ", ctas=" + this.ctas + ", bannerCtas=" + this.bannerCtas + ", tooltipCtas=" + this.tooltipCtas + ", trackingInfo=" + this.trackingInfo + ", bannerTrackingInfo=" + this.bannerTrackingInfo + ", umsAlertRenderFeedback=" + this.umsAlertRenderFeedback + ", bannerUmsAlertRenderFeedback=" + this.bannerUmsAlertRenderFeedback + ", timestamp=" + this.timestamp + ", timer=" + this.timer + ", multiMonthOffer=" + this.multiMonthOffer + ", themeName=" + this.themeName + ", modalPlacement=" + this.modalPlacement + ", blockedDevicesList=" + this.blockedDevicesList + "}";
            }

            public boolean equals(Object obj) {
                String str28;
                String str29;
                String str30;
                String str31;
                String str32;
                String str33;
                String str34;
                String str35;
                String str36;
                UmaPresentAt umaPresentAt2;
                String str37;
                String str38;
                String str39;
                String str40;
                String str41;
                String str42;
                UmaModalAttributes umaModalAttributes2;
                String str43;
                String str44;
                UmaStyle umaStyle4;
                UmaStyle umaStyle5;
                String str45;
                String str46;
                String str47;
                String str48;
                UmaStyle umaStyle6;
                String str49;
                List<UmaCta> list6;
                List<UmaCta> list7;
                List<UmaCta> list8;
                List<UmaCta> list9;
                String str50;
                String str51;
                String str52;
                String str53;
                UmaTimer umaTimer2;
                UmaMultiMonthOffer umaMultiMonthOffer2;
                String str54;
                UmaAlert.ModalPlacement modalPlacement2;
                if (obj == this) {
                    return true;
                }
                if (obj instanceof UmaAlert) {
                    UmaAlert umaAlert = (UmaAlert) obj;
                    if (this.abTestCell == umaAlert.abTestCell() && this.abTestId == umaAlert.abTestId() && ((str28 = this.locale) != null ? str28.equals(umaAlert.locale()) : umaAlert.locale() == null) && ((str29 = this.templateId) != null ? str29.equals(umaAlert.templateId()) : umaAlert.templateId() == null) && ((str30 = this.messageName) != null ? str30.equals(umaAlert.messageName()) : umaAlert.messageName() == null) && this.messageId == umaAlert.messageId() && ((str31 = this.messageGuid) != null ? str31.equals(umaAlert.messageGuid()) : umaAlert.messageGuid() == null) && ((str32 = this.icon) != null ? str32.equals(umaAlert.icon()) : umaAlert.icon() == null) && ((str33 = this.bannerIcon) != null ? str33.equals(umaAlert.bannerIcon()) : umaAlert.bannerIcon() == null) && ((str34 = this.tooltipIcon) != null ? str34.equals(umaAlert.tooltipIcon()) : umaAlert.tooltipIcon() == null) && ((str35 = this.tooltipAnchor) != null ? str35.equals(umaAlert.tooltipAnchor()) : umaAlert.tooltipAnchor() == null) && ((str36 = this.tooltipBody) != null ? str36.equals(umaAlert.tooltipBody()) : umaAlert.tooltipBody() == null) && this.blocking == umaAlert.blocking() && this.modalAlert == umaAlert.modalAlert() && this.bannerAlert == umaAlert.bannerAlert() && this.tooltipAlert == umaAlert.tooltipAlert() && ((umaPresentAt2 = this.presentAt) != null ? umaPresentAt2.equals(umaAlert.presentAt()) : umaAlert.presentAt() == null) && ((str37 = this.flow) != null ? str37.equals(umaAlert.flow()) : umaAlert.flow() == null) && ((str38 = this.mode) != null ? str38.equals(umaAlert.mode()) : umaAlert.mode() == null) && this.suppressOnAppLaunch == umaAlert.suppressOnAppLaunch() && this.suppressForBackgroundAction == umaAlert.suppressForBackgroundAction() && this.showOnBackgroundActionSuccess == umaAlert.showOnBackgroundActionSuccess() && ((str39 = this.backgroundAction) != null ? str39.equals(umaAlert.backgroundAction()) : umaAlert.backgroundAction() == null) && ((str40 = this.backgroundImageUrlHigh) != null ? str40.equals(umaAlert.backgroundImageUrlHigh()) : umaAlert.backgroundImageUrlHigh() == null) && ((str41 = this.backgroundImageUrlMedium) != null ? str41.equals(umaAlert.backgroundImageUrlMedium()) : umaAlert.backgroundImageUrlMedium() == null) && ((str42 = this.backgroundImageUrlLow) != null ? str42.equals(umaAlert.backgroundImageUrlLow()) : umaAlert.backgroundImageUrlLow() == null) && ((umaModalAttributes2 = this.modalAttributes) != null ? umaModalAttributes2.equals(umaAlert.modalAttributes()) : umaAlert.modalAttributes() == null) && ((str43 = this.headline) != null ? str43.equals(umaAlert.headline()) : umaAlert.headline() == null) && ((str44 = this.title) != null ? str44.equals(umaAlert.title()) : umaAlert.title() == null) && ((umaStyle4 = this.headlineTextStyle) != null ? umaStyle4.equals(umaAlert.headlineTextStyle()) : umaAlert.headlineTextStyle() == null) && ((umaStyle5 = this.titleTextStyle) != null ? umaStyle5.equals(umaAlert.titleTextStyle()) : umaAlert.titleTextStyle() == null) && ((str45 = this.bannerTitle) != null ? str45.equals(umaAlert.bannerTitle()) : umaAlert.bannerTitle() == null) && ((str46 = this.tooltipTitle) != null ? str46.equals(umaAlert.tooltipTitle()) : umaAlert.tooltipTitle() == null) && ((str47 = this.body) != null ? str47.equals(umaAlert.body()) : umaAlert.body() == null) && ((str48 = this.footer) != null ? str48.equals(umaAlert.footer()) : umaAlert.footer() == null) && ((umaStyle6 = this.bodyTextStyle) != null ? umaStyle6.equals(umaAlert.bodyTextStyle()) : umaAlert.bodyTextStyle() == null) && ((str49 = this.bannerBody) != null ? str49.equals(umaAlert.bannerBody()) : umaAlert.bannerBody() == null) && ((list6 = this.headerCtas) != null ? list6.equals(umaAlert.headerCtas()) : umaAlert.headerCtas() == null) && ((list7 = this.ctas) != null ? list7.equals(umaAlert.ctas()) : umaAlert.ctas() == null) && ((list8 = this.bannerCtas) != null ? list8.equals(umaAlert.bannerCtas()) : umaAlert.bannerCtas() == null) && ((list9 = this.tooltipCtas) != null ? list9.equals(umaAlert.tooltipCtas()) : umaAlert.tooltipCtas() == null) && ((str50 = this.trackingInfo) != null ? str50.equals(umaAlert.trackingInfo()) : umaAlert.trackingInfo() == null) && ((str51 = this.bannerTrackingInfo) != null ? str51.equals(umaAlert.bannerTrackingInfo()) : umaAlert.bannerTrackingInfo() == null) && ((str52 = this.umsAlertRenderFeedback) != null ? str52.equals(umaAlert.umsAlertRenderFeedback()) : umaAlert.umsAlertRenderFeedback() == null) && ((str53 = this.bannerUmsAlertRenderFeedback) != null ? str53.equals(umaAlert.bannerUmsAlertRenderFeedback()) : umaAlert.bannerUmsAlertRenderFeedback() == null) && this.timestamp == umaAlert.timestamp() && ((umaTimer2 = this.timer) != null ? umaTimer2.equals(umaAlert.timer()) : umaAlert.timer() == null) && ((umaMultiMonthOffer2 = this.multiMonthOffer) != null ? umaMultiMonthOffer2.equals(umaAlert.multiMonthOffer()) : umaAlert.multiMonthOffer() == null) && ((str54 = this.themeName) != null ? str54.equals(umaAlert.themeName()) : umaAlert.themeName() == null) && ((modalPlacement2 = this.modalPlacement) != null ? modalPlacement2.equals(umaAlert.modalPlacement()) : umaAlert.modalPlacement() == null)) {
                        List<UmaAlert.Device> list10 = this.blockedDevicesList;
                        if (list10 == null) {
                            if (umaAlert.blockedDevicesList() == null) {
                                return true;
                            }
                        } else if (list10.equals(umaAlert.blockedDevicesList())) {
                            return true;
                        }
                    }
                    return false;
                }
                return false;
            }

            public int hashCode() {
                int hashCode;
                int i3;
                int i4;
                int i5 = this.abTestCell;
                int i6 = this.abTestId;
                String str28 = this.locale;
                int hashCode2 = str28 == null ? 0 : str28.hashCode();
                String str29 = this.templateId;
                int hashCode3 = str29 == null ? 0 : str29.hashCode();
                String str30 = this.messageName;
                int hashCode4 = str30 == null ? 0 : str30.hashCode();
                long j3 = this.messageId;
                int i7 = (int) (j3 ^ (j3 >>> 32));
                String str31 = this.messageGuid;
                int hashCode5 = str31 == null ? 0 : str31.hashCode();
                String str32 = this.icon;
                int hashCode6 = str32 == null ? 0 : str32.hashCode();
                String str33 = this.bannerIcon;
                int hashCode7 = str33 == null ? 0 : str33.hashCode();
                String str34 = this.tooltipIcon;
                int hashCode8 = str34 == null ? 0 : str34.hashCode();
                String str35 = this.tooltipAnchor;
                int hashCode9 = str35 == null ? 0 : str35.hashCode();
                String str36 = this.tooltipBody;
                int hashCode10 = str36 == null ? 0 : str36.hashCode();
                int i8 = this.blocking ? 1231 : 1237;
                int i9 = this.modalAlert ? 1231 : 1237;
                int i10 = this.bannerAlert ? 1231 : 1237;
                int i11 = this.tooltipAlert ? 1231 : 1237;
                UmaPresentAt umaPresentAt2 = this.presentAt;
                int hashCode11 = umaPresentAt2 == null ? 0 : umaPresentAt2.hashCode();
                String str37 = this.flow;
                int hashCode12 = str37 == null ? 0 : str37.hashCode();
                String str38 = this.mode;
                int hashCode13 = str38 == null ? 0 : str38.hashCode();
                int i12 = this.suppressOnAppLaunch ? 1231 : 1237;
                int i13 = this.suppressForBackgroundAction ? 1231 : 1237;
                int i14 = this.showOnBackgroundActionSuccess ? 1231 : 1237;
                String str39 = this.backgroundAction;
                int hashCode14 = str39 == null ? 0 : str39.hashCode();
                String str40 = this.backgroundImageUrlHigh;
                int hashCode15 = str40 == null ? 0 : str40.hashCode();
                String str41 = this.backgroundImageUrlMedium;
                int hashCode16 = str41 == null ? 0 : str41.hashCode();
                String str42 = this.backgroundImageUrlLow;
                int hashCode17 = str42 == null ? 0 : str42.hashCode();
                UmaModalAttributes umaModalAttributes2 = this.modalAttributes;
                int hashCode18 = umaModalAttributes2 == null ? 0 : umaModalAttributes2.hashCode();
                String str43 = this.headline;
                int hashCode19 = str43 == null ? 0 : str43.hashCode();
                String str44 = this.title;
                int hashCode20 = str44 == null ? 0 : str44.hashCode();
                UmaStyle umaStyle4 = this.headlineTextStyle;
                int hashCode21 = umaStyle4 == null ? 0 : umaStyle4.hashCode();
                UmaStyle umaStyle5 = this.titleTextStyle;
                int hashCode22 = umaStyle5 == null ? 0 : umaStyle5.hashCode();
                String str45 = this.bannerTitle;
                int hashCode23 = str45 == null ? 0 : str45.hashCode();
                String str46 = this.tooltipTitle;
                int hashCode24 = str46 == null ? 0 : str46.hashCode();
                String str47 = this.body;
                int hashCode25 = str47 == null ? 0 : str47.hashCode();
                String str48 = this.footer;
                int hashCode26 = str48 == null ? 0 : str48.hashCode();
                UmaStyle umaStyle6 = this.bodyTextStyle;
                int hashCode27 = umaStyle6 == null ? 0 : umaStyle6.hashCode();
                String str49 = this.bannerBody;
                int hashCode28 = str49 == null ? 0 : str49.hashCode();
                List<UmaCta> list6 = this.headerCtas;
                int hashCode29 = list6 == null ? 0 : list6.hashCode();
                List<UmaCta> list7 = this.ctas;
                int hashCode30 = list7 == null ? 0 : list7.hashCode();
                List<UmaCta> list8 = this.bannerCtas;
                int hashCode31 = list8 == null ? 0 : list8.hashCode();
                List<UmaCta> list9 = this.tooltipCtas;
                int hashCode32 = list9 == null ? 0 : list9.hashCode();
                String str50 = this.trackingInfo;
                int hashCode33 = str50 == null ? 0 : str50.hashCode();
                String str51 = this.bannerTrackingInfo;
                int hashCode34 = str51 == null ? 0 : str51.hashCode();
                String str52 = this.umsAlertRenderFeedback;
                int hashCode35 = str52 == null ? 0 : str52.hashCode();
                String str53 = this.bannerUmsAlertRenderFeedback;
                if (str53 == null) {
                    i3 = hashCode10;
                    i4 = i8;
                    hashCode = 0;
                } else {
                    hashCode = str53.hashCode();
                    i3 = hashCode10;
                    i4 = i8;
                }
                long j4 = this.timestamp;
                int i15 = (int) (j4 ^ (j4 >>> 32));
                UmaTimer umaTimer2 = this.timer;
                int hashCode36 = umaTimer2 == null ? 0 : umaTimer2.hashCode();
                UmaMultiMonthOffer umaMultiMonthOffer2 = this.multiMonthOffer;
                int hashCode37 = umaMultiMonthOffer2 == null ? 0 : umaMultiMonthOffer2.hashCode();
                String str54 = this.themeName;
                int hashCode38 = str54 == null ? 0 : str54.hashCode();
                UmaAlert.ModalPlacement modalPlacement2 = this.modalPlacement;
                int hashCode39 = modalPlacement2 == null ? 0 : modalPlacement2.hashCode();
                List<UmaAlert.Device> list10 = this.blockedDevicesList;
                return ((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((i5 ^ 1000003) * 1000003) ^ i6) * 1000003) ^ hashCode2) * 1000003) ^ hashCode3) * 1000003) ^ hashCode4) * 1000003) ^ i7) * 1000003) ^ hashCode5) * 1000003) ^ hashCode6) * 1000003) ^ hashCode7) * 1000003) ^ hashCode8) * 1000003) ^ hashCode9) * 1000003) ^ i3) * 1000003) ^ i4) * 1000003) ^ i9) * 1000003) ^ i10) * 1000003) ^ i11) * 1000003) ^ hashCode11) * 1000003) ^ hashCode12) * 1000003) ^ hashCode13) * 1000003) ^ i12) * 1000003) ^ i13) * 1000003) ^ i14) * 1000003) ^ hashCode14) * 1000003) ^ hashCode15) * 1000003) ^ hashCode16) * 1000003) ^ hashCode17) * 1000003) ^ hashCode18) * 1000003) ^ hashCode19) * 1000003) ^ hashCode20) * 1000003) ^ hashCode21) * 1000003) ^ hashCode22) * 1000003) ^ hashCode23) * 1000003) ^ hashCode24) * 1000003) ^ hashCode25) * 1000003) ^ hashCode26) * 1000003) ^ hashCode27) * 1000003) ^ hashCode28) * 1000003) ^ hashCode29) * 1000003) ^ hashCode30) * 1000003) ^ hashCode31) * 1000003) ^ hashCode32) * 1000003) ^ hashCode33) * 1000003) ^ hashCode34) * 1000003) ^ hashCode35) * 1000003) ^ hashCode) * 1000003) ^ i15) * 1000003) ^ hashCode36) * 1000003) ^ hashCode37) * 1000003) ^ hashCode38) * 1000003) ^ hashCode39) * 1000003) ^ (list10 == null ? 0 : list10.hashCode());
            }
        };
    }

    /* loaded from: classes.dex */
    public static final class GsonTypeAdapter extends TypeAdapter<UmaAlert> {
        private final TypeAdapter<Integer> abTestCellAdapter;
        private final TypeAdapter<Integer> abTestIdAdapter;
        private final TypeAdapter<String> backgroundActionAdapter;
        private final TypeAdapter<String> backgroundImageUrlHighAdapter;
        private final TypeAdapter<String> backgroundImageUrlLowAdapter;
        private final TypeAdapter<String> backgroundImageUrlMediumAdapter;
        private final TypeAdapter<Boolean> bannerAlertAdapter;
        private final TypeAdapter<String> bannerBodyAdapter;
        private final TypeAdapter<List<UmaCta>> bannerCtasAdapter;
        private final TypeAdapter<String> bannerIconAdapter;
        private final TypeAdapter<String> bannerTitleAdapter;
        private final TypeAdapter<String> bannerTrackingInfoAdapter;
        private final TypeAdapter<String> bannerUmsAlertRenderFeedbackAdapter;
        private final TypeAdapter<List<UmaAlert.Device>> blockedDevicesListAdapter;
        private final TypeAdapter<Boolean> blockingAdapter;
        private final TypeAdapter<String> bodyAdapter;
        private final TypeAdapter<UmaStyle> bodyTextStyleAdapter;
        private final TypeAdapter<List<UmaCta>> ctasAdapter;
        private final TypeAdapter<String> flowAdapter;
        private final TypeAdapter<String> footerAdapter;
        private final TypeAdapter<List<UmaCta>> headerCtasAdapter;
        private final TypeAdapter<String> headlineAdapter;
        private final TypeAdapter<UmaStyle> headlineTextStyleAdapter;
        private final TypeAdapter<String> iconAdapter;
        private final TypeAdapter<String> localeAdapter;
        private final TypeAdapter<String> messageGuidAdapter;
        private final TypeAdapter<Long> messageIdAdapter;
        private final TypeAdapter<String> messageNameAdapter;
        private final TypeAdapter<Boolean> modalAlertAdapter;
        private final TypeAdapter<UmaModalAttributes> modalAttributesAdapter;
        private final TypeAdapter<UmaAlert.ModalPlacement> modalPlacementAdapter;
        private final TypeAdapter<String> modeAdapter;
        private final TypeAdapter<UmaMultiMonthOffer> multiMonthOfferAdapter;
        private final TypeAdapter<UmaPresentAt> presentAtAdapter;
        private final TypeAdapter<Boolean> showOnBackgroundActionSuccessAdapter;
        private final TypeAdapter<Boolean> suppressForBackgroundActionAdapter;
        private final TypeAdapter<Boolean> suppressOnAppLaunchAdapter;
        private final TypeAdapter<String> templateIdAdapter;
        private final TypeAdapter<String> themeNameAdapter;
        private final TypeAdapter<UmaTimer> timerAdapter;
        private final TypeAdapter<Long> timestampAdapter;
        private final TypeAdapter<String> titleAdapter;
        private final TypeAdapter<UmaStyle> titleTextStyleAdapter;
        private final TypeAdapter<Boolean> tooltipAlertAdapter;
        private final TypeAdapter<String> tooltipAnchorAdapter;
        private final TypeAdapter<String> tooltipBodyAdapter;
        private final TypeAdapter<List<UmaCta>> tooltipCtasAdapter;
        private final TypeAdapter<String> tooltipIconAdapter;
        private final TypeAdapter<String> tooltipTitleAdapter;
        private final TypeAdapter<String> trackingInfoAdapter;
        private final TypeAdapter<String> umsAlertRenderFeedbackAdapter;
        private int defaultAbTestCell = 0;
        private int defaultAbTestId = 0;
        private String defaultLocale = null;
        private String defaultTemplateId = null;
        private String defaultMessageName = null;
        private long defaultMessageId = 0;
        private String defaultMessageGuid = null;
        private String defaultIcon = null;
        private String defaultBannerIcon = null;
        private String defaultTooltipIcon = null;
        private String defaultTooltipAnchor = null;
        private String defaultTooltipBody = null;
        private boolean defaultBlocking = false;
        private boolean defaultModalAlert = false;
        private boolean defaultBannerAlert = false;
        private boolean defaultTooltipAlert = false;
        private UmaPresentAt defaultPresentAt = null;
        private String defaultFlow = null;
        private String defaultMode = null;
        private boolean defaultSuppressOnAppLaunch = false;
        private boolean defaultSuppressForBackgroundAction = false;
        private boolean defaultShowOnBackgroundActionSuccess = false;
        private String defaultBackgroundAction = null;
        private String defaultBackgroundImageUrlHigh = null;
        private String defaultBackgroundImageUrlMedium = null;
        private String defaultBackgroundImageUrlLow = null;
        private UmaModalAttributes defaultModalAttributes = null;
        private String defaultHeadline = null;
        private String defaultTitle = null;
        private UmaStyle defaultHeadlineTextStyle = null;
        private UmaStyle defaultTitleTextStyle = null;
        private String defaultBannerTitle = null;
        private String defaultTooltipTitle = null;
        private String defaultBody = null;
        private String defaultFooter = null;
        private UmaStyle defaultBodyTextStyle = null;
        private String defaultBannerBody = null;
        private List<UmaCta> defaultHeaderCtas = null;
        private List<UmaCta> defaultCtas = null;
        private List<UmaCta> defaultBannerCtas = null;
        private List<UmaCta> defaultTooltipCtas = null;
        private String defaultTrackingInfo = null;
        private String defaultBannerTrackingInfo = null;
        private String defaultUmsAlertRenderFeedback = null;
        private String defaultBannerUmsAlertRenderFeedback = null;
        private long defaultTimestamp = 0;
        private UmaTimer defaultTimer = null;
        private UmaMultiMonthOffer defaultMultiMonthOffer = null;
        private String defaultThemeName = null;
        private UmaAlert.ModalPlacement defaultModalPlacement = null;
        private List<UmaAlert.Device> defaultBlockedDevicesList = null;

        public GsonTypeAdapter setDefaultAbTestCell(int i) {
            this.defaultAbTestCell = i;
            return this;
        }

        public GsonTypeAdapter setDefaultAbTestId(int i) {
            this.defaultAbTestId = i;
            return this;
        }

        public GsonTypeAdapter setDefaultBackgroundAction(String str) {
            this.defaultBackgroundAction = str;
            return this;
        }

        public GsonTypeAdapter setDefaultBackgroundImageUrlHigh(String str) {
            this.defaultBackgroundImageUrlHigh = str;
            return this;
        }

        public GsonTypeAdapter setDefaultBackgroundImageUrlLow(String str) {
            this.defaultBackgroundImageUrlLow = str;
            return this;
        }

        public GsonTypeAdapter setDefaultBackgroundImageUrlMedium(String str) {
            this.defaultBackgroundImageUrlMedium = str;
            return this;
        }

        public GsonTypeAdapter setDefaultBannerAlert(boolean z) {
            this.defaultBannerAlert = z;
            return this;
        }

        public GsonTypeAdapter setDefaultBannerBody(String str) {
            this.defaultBannerBody = str;
            return this;
        }

        public GsonTypeAdapter setDefaultBannerCtas(List<UmaCta> list) {
            this.defaultBannerCtas = list;
            return this;
        }

        public GsonTypeAdapter setDefaultBannerIcon(String str) {
            this.defaultBannerIcon = str;
            return this;
        }

        public GsonTypeAdapter setDefaultBannerTitle(String str) {
            this.defaultBannerTitle = str;
            return this;
        }

        public GsonTypeAdapter setDefaultBannerTrackingInfo(String str) {
            this.defaultBannerTrackingInfo = str;
            return this;
        }

        public GsonTypeAdapter setDefaultBannerUmsAlertRenderFeedback(String str) {
            this.defaultBannerUmsAlertRenderFeedback = str;
            return this;
        }

        public GsonTypeAdapter setDefaultBlockedDevicesList(List<UmaAlert.Device> list) {
            this.defaultBlockedDevicesList = list;
            return this;
        }

        public GsonTypeAdapter setDefaultBlocking(boolean z) {
            this.defaultBlocking = z;
            return this;
        }

        public GsonTypeAdapter setDefaultBody(String str) {
            this.defaultBody = str;
            return this;
        }

        public GsonTypeAdapter setDefaultBodyTextStyle(UmaStyle umaStyle) {
            this.defaultBodyTextStyle = umaStyle;
            return this;
        }

        public GsonTypeAdapter setDefaultCtas(List<UmaCta> list) {
            this.defaultCtas = list;
            return this;
        }

        public GsonTypeAdapter setDefaultFlow(String str) {
            this.defaultFlow = str;
            return this;
        }

        public GsonTypeAdapter setDefaultFooter(String str) {
            this.defaultFooter = str;
            return this;
        }

        public GsonTypeAdapter setDefaultHeaderCtas(List<UmaCta> list) {
            this.defaultHeaderCtas = list;
            return this;
        }

        public GsonTypeAdapter setDefaultHeadline(String str) {
            this.defaultHeadline = str;
            return this;
        }

        public GsonTypeAdapter setDefaultHeadlineTextStyle(UmaStyle umaStyle) {
            this.defaultHeadlineTextStyle = umaStyle;
            return this;
        }

        public GsonTypeAdapter setDefaultIcon(String str) {
            this.defaultIcon = str;
            return this;
        }

        public GsonTypeAdapter setDefaultLocale(String str) {
            this.defaultLocale = str;
            return this;
        }

        public GsonTypeAdapter setDefaultMessageGuid(String str) {
            this.defaultMessageGuid = str;
            return this;
        }

        public GsonTypeAdapter setDefaultMessageId(long j) {
            this.defaultMessageId = j;
            return this;
        }

        public GsonTypeAdapter setDefaultMessageName(String str) {
            this.defaultMessageName = str;
            return this;
        }

        public GsonTypeAdapter setDefaultModalAlert(boolean z) {
            this.defaultModalAlert = z;
            return this;
        }

        public GsonTypeAdapter setDefaultModalAttributes(UmaModalAttributes umaModalAttributes) {
            this.defaultModalAttributes = umaModalAttributes;
            return this;
        }

        public GsonTypeAdapter setDefaultModalPlacement(UmaAlert.ModalPlacement modalPlacement) {
            this.defaultModalPlacement = modalPlacement;
            return this;
        }

        public GsonTypeAdapter setDefaultMode(String str) {
            this.defaultMode = str;
            return this;
        }

        public GsonTypeAdapter setDefaultMultiMonthOffer(UmaMultiMonthOffer umaMultiMonthOffer) {
            this.defaultMultiMonthOffer = umaMultiMonthOffer;
            return this;
        }

        public GsonTypeAdapter setDefaultPresentAt(UmaPresentAt umaPresentAt) {
            this.defaultPresentAt = umaPresentAt;
            return this;
        }

        public GsonTypeAdapter setDefaultShowOnBackgroundActionSuccess(boolean z) {
            this.defaultShowOnBackgroundActionSuccess = z;
            return this;
        }

        public GsonTypeAdapter setDefaultSuppressForBackgroundAction(boolean z) {
            this.defaultSuppressForBackgroundAction = z;
            return this;
        }

        public GsonTypeAdapter setDefaultSuppressOnAppLaunch(boolean z) {
            this.defaultSuppressOnAppLaunch = z;
            return this;
        }

        public GsonTypeAdapter setDefaultTemplateId(String str) {
            this.defaultTemplateId = str;
            return this;
        }

        public GsonTypeAdapter setDefaultThemeName(String str) {
            this.defaultThemeName = str;
            return this;
        }

        public GsonTypeAdapter setDefaultTimer(UmaTimer umaTimer) {
            this.defaultTimer = umaTimer;
            return this;
        }

        public GsonTypeAdapter setDefaultTimestamp(long j) {
            this.defaultTimestamp = j;
            return this;
        }

        public GsonTypeAdapter setDefaultTitle(String str) {
            this.defaultTitle = str;
            return this;
        }

        public GsonTypeAdapter setDefaultTitleTextStyle(UmaStyle umaStyle) {
            this.defaultTitleTextStyle = umaStyle;
            return this;
        }

        public GsonTypeAdapter setDefaultTooltipAlert(boolean z) {
            this.defaultTooltipAlert = z;
            return this;
        }

        public GsonTypeAdapter setDefaultTooltipAnchor(String str) {
            this.defaultTooltipAnchor = str;
            return this;
        }

        public GsonTypeAdapter setDefaultTooltipBody(String str) {
            this.defaultTooltipBody = str;
            return this;
        }

        public GsonTypeAdapter setDefaultTooltipCtas(List<UmaCta> list) {
            this.defaultTooltipCtas = list;
            return this;
        }

        public GsonTypeAdapter setDefaultTooltipIcon(String str) {
            this.defaultTooltipIcon = str;
            return this;
        }

        public GsonTypeAdapter setDefaultTooltipTitle(String str) {
            this.defaultTooltipTitle = str;
            return this;
        }

        public GsonTypeAdapter setDefaultTrackingInfo(String str) {
            this.defaultTrackingInfo = str;
            return this;
        }

        public GsonTypeAdapter setDefaultUmsAlertRenderFeedback(String str) {
            this.defaultUmsAlertRenderFeedback = str;
            return this;
        }

        public GsonTypeAdapter(Gson gson) {
            this.abTestCellAdapter = gson.getAdapter(Integer.class);
            this.abTestIdAdapter = gson.getAdapter(Integer.class);
            this.localeAdapter = gson.getAdapter(String.class);
            this.templateIdAdapter = gson.getAdapter(String.class);
            this.messageNameAdapter = gson.getAdapter(String.class);
            this.messageIdAdapter = gson.getAdapter(Long.class);
            this.messageGuidAdapter = gson.getAdapter(String.class);
            this.iconAdapter = gson.getAdapter(String.class);
            this.bannerIconAdapter = gson.getAdapter(String.class);
            this.tooltipIconAdapter = gson.getAdapter(String.class);
            this.tooltipAnchorAdapter = gson.getAdapter(String.class);
            this.tooltipBodyAdapter = gson.getAdapter(String.class);
            this.blockingAdapter = gson.getAdapter(Boolean.class);
            this.modalAlertAdapter = gson.getAdapter(Boolean.class);
            this.bannerAlertAdapter = gson.getAdapter(Boolean.class);
            this.tooltipAlertAdapter = gson.getAdapter(Boolean.class);
            this.presentAtAdapter = gson.getAdapter(UmaPresentAt.class);
            this.flowAdapter = gson.getAdapter(String.class);
            this.modeAdapter = gson.getAdapter(String.class);
            this.suppressOnAppLaunchAdapter = gson.getAdapter(Boolean.class);
            this.suppressForBackgroundActionAdapter = gson.getAdapter(Boolean.class);
            this.showOnBackgroundActionSuccessAdapter = gson.getAdapter(Boolean.class);
            this.backgroundActionAdapter = gson.getAdapter(String.class);
            this.backgroundImageUrlHighAdapter = gson.getAdapter(String.class);
            this.backgroundImageUrlMediumAdapter = gson.getAdapter(String.class);
            this.backgroundImageUrlLowAdapter = gson.getAdapter(String.class);
            this.modalAttributesAdapter = gson.getAdapter(UmaModalAttributes.class);
            this.headlineAdapter = gson.getAdapter(String.class);
            this.titleAdapter = gson.getAdapter(String.class);
            this.headlineTextStyleAdapter = gson.getAdapter(UmaStyle.class);
            this.titleTextStyleAdapter = gson.getAdapter(UmaStyle.class);
            this.bannerTitleAdapter = gson.getAdapter(String.class);
            this.tooltipTitleAdapter = gson.getAdapter(String.class);
            this.bodyAdapter = gson.getAdapter(String.class);
            this.footerAdapter = gson.getAdapter(String.class);
            this.bodyTextStyleAdapter = gson.getAdapter(UmaStyle.class);
            this.bannerBodyAdapter = gson.getAdapter(String.class);
            this.headerCtasAdapter = gson.getAdapter(TypeToken.getParameterized(List.class, UmaCta.class));
            this.ctasAdapter = gson.getAdapter(TypeToken.getParameterized(List.class, UmaCta.class));
            this.bannerCtasAdapter = gson.getAdapter(TypeToken.getParameterized(List.class, UmaCta.class));
            this.tooltipCtasAdapter = gson.getAdapter(TypeToken.getParameterized(List.class, UmaCta.class));
            this.trackingInfoAdapter = gson.getAdapter(String.class);
            this.bannerTrackingInfoAdapter = gson.getAdapter(String.class);
            this.umsAlertRenderFeedbackAdapter = gson.getAdapter(String.class);
            this.bannerUmsAlertRenderFeedbackAdapter = gson.getAdapter(String.class);
            this.timestampAdapter = gson.getAdapter(Long.class);
            this.timerAdapter = gson.getAdapter(UmaTimer.class);
            this.multiMonthOfferAdapter = gson.getAdapter(UmaMultiMonthOffer.class);
            this.themeNameAdapter = gson.getAdapter(String.class);
            this.modalPlacementAdapter = gson.getAdapter(UmaAlert.ModalPlacement.class);
            this.blockedDevicesListAdapter = gson.getAdapter(TypeToken.getParameterized(List.class, UmaAlert.Device.class));
        }

        @Override // com.google.gson.TypeAdapter
        public void write(JsonWriter jsonWriter, UmaAlert umaAlert) {
            if (umaAlert == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginObject();
            jsonWriter.name("abTestCell");
            this.abTestCellAdapter.write(jsonWriter, Integer.valueOf(umaAlert.abTestCell()));
            jsonWriter.name("abTestId");
            this.abTestIdAdapter.write(jsonWriter, Integer.valueOf(umaAlert.abTestId()));
            jsonWriter.name("locale");
            this.localeAdapter.write(jsonWriter, umaAlert.locale());
            jsonWriter.name("templateId");
            this.templateIdAdapter.write(jsonWriter, umaAlert.templateId());
            jsonWriter.name("messageName");
            this.messageNameAdapter.write(jsonWriter, umaAlert.messageName());
            jsonWriter.name("messageId");
            this.messageIdAdapter.write(jsonWriter, Long.valueOf(umaAlert.messageId()));
            jsonWriter.name(Payload.PARAM_MESSAGE_GUID);
            this.messageGuidAdapter.write(jsonWriter, umaAlert.messageGuid());
            jsonWriter.name("icon");
            this.iconAdapter.write(jsonWriter, umaAlert.icon());
            jsonWriter.name("bannerIcon");
            this.bannerIconAdapter.write(jsonWriter, umaAlert.bannerIcon());
            jsonWriter.name("tooltipIcon");
            this.tooltipIconAdapter.write(jsonWriter, umaAlert.tooltipIcon());
            jsonWriter.name("tooltipAnchor");
            this.tooltipAnchorAdapter.write(jsonWriter, umaAlert.tooltipAnchor());
            jsonWriter.name("tooltipBody");
            this.tooltipBodyAdapter.write(jsonWriter, umaAlert.tooltipBody());
            jsonWriter.name("blocking");
            this.blockingAdapter.write(jsonWriter, Boolean.valueOf(umaAlert.blocking()));
            jsonWriter.name("modalAlert");
            this.modalAlertAdapter.write(jsonWriter, Boolean.valueOf(umaAlert.modalAlert()));
            jsonWriter.name("bannerAlert");
            this.bannerAlertAdapter.write(jsonWriter, Boolean.valueOf(umaAlert.bannerAlert()));
            jsonWriter.name("tooltipAlert");
            this.tooltipAlertAdapter.write(jsonWriter, Boolean.valueOf(umaAlert.tooltipAlert()));
            jsonWriter.name("presentAt");
            this.presentAtAdapter.write(jsonWriter, umaAlert.presentAt());
            jsonWriter.name("flow");
            this.flowAdapter.write(jsonWriter, umaAlert.flow());
            jsonWriter.name("mode");
            this.modeAdapter.write(jsonWriter, umaAlert.mode());
            jsonWriter.name("suppressOnAppLaunch");
            this.suppressOnAppLaunchAdapter.write(jsonWriter, Boolean.valueOf(umaAlert.suppressOnAppLaunch()));
            jsonWriter.name("suppressForBackgroundAction");
            this.suppressForBackgroundActionAdapter.write(jsonWriter, Boolean.valueOf(umaAlert.suppressForBackgroundAction()));
            jsonWriter.name("showOnBackgroundActionSuccess");
            this.showOnBackgroundActionSuccessAdapter.write(jsonWriter, Boolean.valueOf(umaAlert.showOnBackgroundActionSuccess()));
            jsonWriter.name("backgroundAction");
            this.backgroundActionAdapter.write(jsonWriter, umaAlert.backgroundAction());
            jsonWriter.name("backgroundImageUrlHigh");
            this.backgroundImageUrlHighAdapter.write(jsonWriter, umaAlert.backgroundImageUrlHigh());
            jsonWriter.name("backgroundImageUrlMedium");
            this.backgroundImageUrlMediumAdapter.write(jsonWriter, umaAlert.backgroundImageUrlMedium());
            jsonWriter.name("backgroundImageUrlLow");
            this.backgroundImageUrlLowAdapter.write(jsonWriter, umaAlert.backgroundImageUrlLow());
            jsonWriter.name("modalAttributes");
            this.modalAttributesAdapter.write(jsonWriter, umaAlert.modalAttributes());
            jsonWriter.name("headline");
            this.headlineAdapter.write(jsonWriter, umaAlert.headline());
            jsonWriter.name(SignupConstants.Field.VIDEO_TITLE);
            this.titleAdapter.write(jsonWriter, umaAlert.title());
            jsonWriter.name("headlineTextStyle");
            this.headlineTextStyleAdapter.write(jsonWriter, umaAlert.headlineTextStyle());
            jsonWriter.name("titleTextStyle");
            this.titleTextStyleAdapter.write(jsonWriter, umaAlert.titleTextStyle());
            jsonWriter.name("bannerTitle");
            this.bannerTitleAdapter.write(jsonWriter, umaAlert.bannerTitle());
            jsonWriter.name("tooltipTitle");
            this.tooltipTitleAdapter.write(jsonWriter, umaAlert.tooltipTitle());
            jsonWriter.name("body");
            this.bodyAdapter.write(jsonWriter, umaAlert.body());
            jsonWriter.name("footer");
            this.footerAdapter.write(jsonWriter, umaAlert.footer());
            jsonWriter.name("bodyTextStyle");
            this.bodyTextStyleAdapter.write(jsonWriter, umaAlert.bodyTextStyle());
            jsonWriter.name("bannerBody");
            this.bannerBodyAdapter.write(jsonWriter, umaAlert.bannerBody());
            jsonWriter.name("headerCtas");
            this.headerCtasAdapter.write(jsonWriter, umaAlert.headerCtas());
            jsonWriter.name("ctas");
            this.ctasAdapter.write(jsonWriter, umaAlert.ctas());
            jsonWriter.name("bannerCtas");
            this.bannerCtasAdapter.write(jsonWriter, umaAlert.bannerCtas());
            jsonWriter.name("tooltipCtas");
            this.tooltipCtasAdapter.write(jsonWriter, umaAlert.tooltipCtas());
            jsonWriter.name("trackingInfo");
            this.trackingInfoAdapter.write(jsonWriter, umaAlert.trackingInfo());
            jsonWriter.name("bannerTrackingInfo");
            this.bannerTrackingInfoAdapter.write(jsonWriter, umaAlert.bannerTrackingInfo());
            jsonWriter.name("umsAlertRenderFeedback");
            this.umsAlertRenderFeedbackAdapter.write(jsonWriter, umaAlert.umsAlertRenderFeedback());
            jsonWriter.name("bannerUmsAlertRenderFeedback");
            this.bannerUmsAlertRenderFeedbackAdapter.write(jsonWriter, umaAlert.bannerUmsAlertRenderFeedback());
            jsonWriter.name("timestamp");
            this.timestampAdapter.write(jsonWriter, Long.valueOf(umaAlert.timestamp()));
            jsonWriter.name("timer");
            this.timerAdapter.write(jsonWriter, umaAlert.timer());
            jsonWriter.name("multiMonthOffer");
            this.multiMonthOfferAdapter.write(jsonWriter, umaAlert.multiMonthOffer());
            jsonWriter.name("themeName");
            this.themeNameAdapter.write(jsonWriter, umaAlert.themeName());
            jsonWriter.name("modalPlacement");
            this.modalPlacementAdapter.write(jsonWriter, umaAlert.modalPlacement());
            jsonWriter.name("blockedDevicesList");
            this.blockedDevicesListAdapter.write(jsonWriter, umaAlert.blockedDevicesList());
            jsonWriter.endObject();
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.gson.TypeAdapter
        public UmaAlert read(JsonReader jsonReader) {
            char c;
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            jsonReader.beginObject();
            int i = this.defaultAbTestCell;
            int i2 = this.defaultAbTestId;
            String str = this.defaultLocale;
            String str2 = this.defaultTemplateId;
            String str3 = this.defaultMessageName;
            long j = this.defaultMessageId;
            String str4 = this.defaultMessageGuid;
            String str5 = this.defaultIcon;
            String str6 = this.defaultBannerIcon;
            String str7 = this.defaultTooltipIcon;
            String str8 = this.defaultTooltipAnchor;
            String str9 = this.defaultTooltipBody;
            boolean z = this.defaultBlocking;
            boolean z2 = this.defaultModalAlert;
            boolean z3 = this.defaultBannerAlert;
            boolean z4 = this.defaultTooltipAlert;
            UmaPresentAt umaPresentAt = this.defaultPresentAt;
            String str10 = this.defaultFlow;
            String str11 = this.defaultMode;
            boolean z5 = this.defaultSuppressOnAppLaunch;
            boolean z6 = this.defaultSuppressForBackgroundAction;
            boolean z7 = this.defaultShowOnBackgroundActionSuccess;
            String str12 = this.defaultBackgroundAction;
            String str13 = this.defaultBackgroundImageUrlHigh;
            String str14 = this.defaultBackgroundImageUrlMedium;
            String str15 = this.defaultBackgroundImageUrlLow;
            UmaModalAttributes umaModalAttributes = this.defaultModalAttributes;
            String str16 = this.defaultHeadline;
            String str17 = this.defaultTitle;
            UmaStyle umaStyle = this.defaultHeadlineTextStyle;
            UmaStyle umaStyle2 = this.defaultTitleTextStyle;
            String str18 = this.defaultBannerTitle;
            String str19 = this.defaultTooltipTitle;
            String str20 = this.defaultBody;
            String str21 = this.defaultFooter;
            UmaStyle umaStyle3 = this.defaultBodyTextStyle;
            String str22 = this.defaultBannerBody;
            List<UmaCta> list = this.defaultHeaderCtas;
            List<UmaCta> list2 = this.defaultCtas;
            List<UmaCta> list3 = this.defaultBannerCtas;
            List<UmaCta> list4 = this.defaultTooltipCtas;
            String str23 = this.defaultTrackingInfo;
            String str24 = this.defaultBannerTrackingInfo;
            String str25 = this.defaultUmsAlertRenderFeedback;
            String str26 = this.defaultBannerUmsAlertRenderFeedback;
            long j2 = this.defaultTimestamp;
            UmaTimer umaTimer = this.defaultTimer;
            UmaMultiMonthOffer umaMultiMonthOffer = this.defaultMultiMonthOffer;
            String str27 = this.defaultThemeName;
            UmaAlert.ModalPlacement modalPlacement = this.defaultModalPlacement;
            List<UmaAlert.Device> list5 = this.defaultBlockedDevicesList;
            UmaMultiMonthOffer umaMultiMonthOffer2 = umaMultiMonthOffer;
            String str28 = str;
            String str29 = str2;
            String str30 = str3;
            long j3 = j;
            String str31 = str4;
            String str32 = str5;
            String str33 = str6;
            String str34 = str7;
            String str35 = str8;
            String str36 = str9;
            boolean z8 = z;
            int i3 = i;
            boolean z9 = z2;
            boolean z10 = z3;
            boolean z11 = z4;
            UmaPresentAt umaPresentAt2 = umaPresentAt;
            String str37 = str10;
            String str38 = str11;
            boolean z12 = z5;
            boolean z13 = z6;
            boolean z14 = z7;
            String str39 = str12;
            String str40 = str13;
            String str41 = str14;
            String str42 = str15;
            UmaModalAttributes umaModalAttributes2 = umaModalAttributes;
            String str43 = str16;
            String str44 = str17;
            UmaStyle umaStyle4 = umaStyle;
            UmaStyle umaStyle5 = umaStyle2;
            String str45 = str18;
            String str46 = str19;
            String str47 = str20;
            String str48 = str21;
            UmaStyle umaStyle6 = umaStyle3;
            String str49 = str22;
            List<UmaCta> list6 = list;
            List<UmaCta> list7 = list2;
            List<UmaCta> list8 = list3;
            List<UmaCta> list9 = list4;
            String str50 = str23;
            String str51 = str24;
            String str52 = str25;
            int i4 = i2;
            String str53 = str26;
            long j4 = j2;
            UmaTimer umaTimer2 = umaTimer;
            String str54 = str27;
            UmaAlert.ModalPlacement modalPlacement2 = modalPlacement;
            while (jsonReader.hasNext()) {
                String nextName = jsonReader.nextName();
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                } else {
                    nextName.hashCode();
                    switch (nextName.hashCode()) {
                        case -1934772848:
                            if (nextName.equals("bannerAlert")) {
                                c = 0;
                                break;
                            }
                            c = 65535;
                            break;
                        case -1917301108:
                            if (nextName.equals("bannerTitle")) {
                                c = 1;
                                break;
                            }
                            c = 65535;
                            break;
                        case -1884240891:
                            if (nextName.equals("trackingInfo")) {
                                c = 2;
                                break;
                            }
                            c = 65535;
                            break;
                        case -1674242016:
                            if (nextName.equals("suppressOnAppLaunch")) {
                                c = 3;
                                break;
                            }
                            c = 65535;
                            break;
                        case -1500525596:
                            if (nextName.equals("modalAttributes")) {
                                c = 4;
                                break;
                            }
                            c = 65535;
                            break;
                        case -1472904529:
                            if (nextName.equals("modalAlert")) {
                                c = 5;
                                break;
                            }
                            c = 65535;
                            break;
                        case -1440013438:
                            if (nextName.equals("messageId")) {
                                c = 6;
                                break;
                            }
                            c = 65535;
                            break;
                        case -1268861541:
                            if (nextName.equals("footer")) {
                                c = 7;
                                break;
                            }
                            c = 65535;
                            break;
                        case -1115058732:
                            if (nextName.equals("headline")) {
                                c = '\b';
                                break;
                            }
                            c = 65535;
                            break;
                        case -1097462182:
                            if (nextName.equals("locale")) {
                                c = '\t';
                                break;
                            }
                            c = 65535;
                            break;
                        case -1087056427:
                            if (nextName.equals("multiMonthOffer")) {
                                c = '\n';
                                break;
                            }
                            c = 65535;
                            break;
                        case -1032210706:
                            if (nextName.equals("bannerBody")) {
                                c = 11;
                                break;
                            }
                            c = 65535;
                            break;
                        case -1032176209:
                            if (nextName.equals("bannerCtas")) {
                                c = '\f';
                                break;
                            }
                            c = 65535;
                            break;
                        case -1032013371:
                            if (nextName.equals("bannerIcon")) {
                                c = '\r';
                                break;
                            }
                            c = 65535;
                            break;
                        case -963016046:
                            if (nextName.equals("backgroundImageUrlLow")) {
                                c = 14;
                                break;
                            }
                            c = 65535;
                            break;
                        case -921944498:
                            if (nextName.equals("presentAt")) {
                                c = 15;
                                break;
                            }
                            c = 65535;
                            break;
                        case -873484496:
                            if (nextName.equals(Payload.PARAM_MESSAGE_GUID)) {
                                c = 16;
                                break;
                            }
                            c = 65535;
                            break;
                        case -873295054:
                            if (nextName.equals("messageName")) {
                                c = 17;
                                break;
                            }
                            c = 65535;
                            break;
                        case -664572875:
                            if (nextName.equals("blocking")) {
                                c = 18;
                                break;
                            }
                            c = 65535;
                            break;
                        case -208213320:
                            if (nextName.equals("modalPlacement")) {
                                c = 19;
                                break;
                            }
                            c = 65535;
                            break;
                        case -129452296:
                            if (nextName.equals("suppressForBackgroundAction")) {
                                c = 20;
                                break;
                            }
                            c = 65535;
                            break;
                        case 3029410:
                            if (nextName.equals("body")) {
                                c = 21;
                                break;
                            }
                            c = 65535;
                            break;
                        case 3063907:
                            if (nextName.equals("ctas")) {
                                c = 22;
                                break;
                            }
                            c = 65535;
                            break;
                        case 3146030:
                            if (nextName.equals("flow")) {
                                c = 23;
                                break;
                            }
                            c = 65535;
                            break;
                        case 3226745:
                            if (nextName.equals("icon")) {
                                c = 24;
                                break;
                            }
                            c = 65535;
                            break;
                        case 3357091:
                            if (nextName.equals("mode")) {
                                c = 25;
                                break;
                            }
                            c = 65535;
                            break;
                        case 17192948:
                            if (nextName.equals("themeName")) {
                                c = 26;
                                break;
                            }
                            c = 65535;
                            break;
                        case 55126294:
                            if (nextName.equals("timestamp")) {
                                c = 27;
                                break;
                            }
                            c = 65535;
                            break;
                        case 110364485:
                            if (nextName.equals("timer")) {
                                c = 28;
                                break;
                            }
                            c = 65535;
                            break;
                        case 110371416:
                            if (nextName.equals(SignupConstants.Field.VIDEO_TITLE)) {
                                c = 29;
                                break;
                            }
                            c = 65535;
                            break;
                        case 196825881:
                            if (nextName.equals("tooltipAlert")) {
                                c = 30;
                                break;
                            }
                            c = 65535;
                            break;
                        case 211148324:
                            if (nextName.equals("backgroundImageUrlHigh")) {
                                c = 31;
                                break;
                            }
                            c = 65535;
                            break;
                        case 214297621:
                            if (nextName.equals("tooltipTitle")) {
                                c = ' ';
                                break;
                            }
                            c = 65535;
                            break;
                        case 293496917:
                            if (nextName.equals("abTestCell")) {
                                c = '!';
                                break;
                            }
                            c = 65535;
                            break;
                        case 321010956:
                            if (nextName.equals("titleTextStyle")) {
                                c = JsonFactory.DEFAULT_QUOTE_CHAR;
                                break;
                            }
                            c = 65535;
                            break;
                        case 831589582:
                            if (nextName.equals("abTestId")) {
                                c = '#';
                                break;
                            }
                            c = 65535;
                            break;
                        case 837665861:
                            if (nextName.equals("tooltipBody")) {
                                c = '$';
                                break;
                            }
                            c = 65535;
                            break;
                        case 837700358:
                            if (nextName.equals("tooltipCtas")) {
                                c = '%';
                                break;
                            }
                            c = 65535;
                            break;
                        case 837863196:
                            if (nextName.equals("tooltipIcon")) {
                                c = '&';
                                break;
                            }
                            c = 65535;
                            break;
                        case 983683331:
                            if (nextName.equals("showOnBackgroundActionSuccess")) {
                                c = '\'';
                                break;
                            }
                            c = 65535;
                            break;
                        case 1166030161:
                            if (nextName.equals("bannerTrackingInfo")) {
                                c = '(';
                                break;
                            }
                            c = 65535;
                            break;
                        case 1178051844:
                            if (nextName.equals("backgroundAction")) {
                                c = ')';
                                break;
                            }
                            c = 65535;
                            break;
                        case 1189443447:
                            if (nextName.equals("backgroundImageUrlMedium")) {
                                c = '*';
                                break;
                            }
                            c = 65535;
                            break;
                        case 1304010549:
                            if (nextName.equals("templateId")) {
                                c = '+';
                                break;
                            }
                            c = 65535;
                            break;
                        case 1399867100:
                            if (nextName.equals("umsAlertRenderFeedback")) {
                                c = ',';
                                break;
                            }
                            c = 65535;
                            break;
                        case 1625273743:
                            if (nextName.equals("blockedDevicesList")) {
                                c = '-';
                                break;
                            }
                            c = 65535;
                            break;
                        case 1705508112:
                            if (nextName.equals("headlineTextStyle")) {
                                c = '.';
                                break;
                            }
                            c = 65535;
                            break;
                        case 1808412824:
                            if (nextName.equals("tooltipAnchor")) {
                                c = '/';
                                break;
                            }
                            c = 65535;
                            break;
                        case 1977026704:
                            if (nextName.equals("headerCtas")) {
                                c = '0';
                                break;
                            }
                            c = 65535;
                            break;
                        case 2034993448:
                            if (nextName.equals("bannerUmsAlertRenderFeedback")) {
                                c = '1';
                                break;
                            }
                            c = 65535;
                            break;
                        case 2100082946:
                            if (nextName.equals("bodyTextStyle")) {
                                c = '2';
                                break;
                            }
                            c = 65535;
                            break;
                        default:
                            c = 65535;
                            break;
                    }
                    switch (c) {
                        case 0:
                            z10 = this.bannerAlertAdapter.read(jsonReader).booleanValue();
                            continue;
                        case 1:
                            str45 = this.bannerTitleAdapter.read(jsonReader);
                            continue;
                        case 2:
                            str50 = this.trackingInfoAdapter.read(jsonReader);
                            continue;
                        case 3:
                            z12 = this.suppressOnAppLaunchAdapter.read(jsonReader).booleanValue();
                            continue;
                        case 4:
                            umaModalAttributes2 = this.modalAttributesAdapter.read(jsonReader);
                            continue;
                        case 5:
                            z9 = this.modalAlertAdapter.read(jsonReader).booleanValue();
                            continue;
                        case 6:
                            j3 = this.messageIdAdapter.read(jsonReader).longValue();
                            continue;
                        case 7:
                            str48 = this.footerAdapter.read(jsonReader);
                            continue;
                        case '\b':
                            str43 = this.headlineAdapter.read(jsonReader);
                            continue;
                        case '\t':
                            str28 = this.localeAdapter.read(jsonReader);
                            continue;
                        case '\n':
                            umaMultiMonthOffer2 = this.multiMonthOfferAdapter.read(jsonReader);
                            continue;
                        case 11:
                            str49 = this.bannerBodyAdapter.read(jsonReader);
                            continue;
                        case '\f':
                            list8 = this.bannerCtasAdapter.read(jsonReader);
                            continue;
                        case '\r':
                            str33 = this.bannerIconAdapter.read(jsonReader);
                            continue;
                        case 14:
                            str42 = this.backgroundImageUrlLowAdapter.read(jsonReader);
                            continue;
                        case 15:
                            umaPresentAt2 = this.presentAtAdapter.read(jsonReader);
                            continue;
                        case 16:
                            str31 = this.messageGuidAdapter.read(jsonReader);
                            continue;
                        case 17:
                            str30 = this.messageNameAdapter.read(jsonReader);
                            continue;
                        case 18:
                            z8 = this.blockingAdapter.read(jsonReader).booleanValue();
                            continue;
                        case 19:
                            modalPlacement2 = this.modalPlacementAdapter.read(jsonReader);
                            continue;
                        case 20:
                            z13 = this.suppressForBackgroundActionAdapter.read(jsonReader).booleanValue();
                            continue;
                        case 21:
                            str47 = this.bodyAdapter.read(jsonReader);
                            continue;
                        case 22:
                            list7 = this.ctasAdapter.read(jsonReader);
                            continue;
                        case 23:
                            str37 = this.flowAdapter.read(jsonReader);
                            continue;
                        case 24:
                            str32 = this.iconAdapter.read(jsonReader);
                            continue;
                        case 25:
                            str38 = this.modeAdapter.read(jsonReader);
                            continue;
                        case 26:
                            str54 = this.themeNameAdapter.read(jsonReader);
                            continue;
                        case ConnectionSubtype.SUBTYPE_10_GIGABIT_ETHERNET /* 27 */:
                            j4 = this.timestampAdapter.read(jsonReader).longValue();
                            continue;
                        case ConnectionSubtype.SUBTYPE_WIFI_B /* 28 */:
                            umaTimer2 = this.timerAdapter.read(jsonReader);
                            continue;
                        case ConnectionSubtype.SUBTYPE_WIFI_G /* 29 */:
                            str44 = this.titleAdapter.read(jsonReader);
                            continue;
                        case ConnectionSubtype.SUBTYPE_WIFI_N /* 30 */:
                            z11 = this.tooltipAlertAdapter.read(jsonReader).booleanValue();
                            continue;
                        case ConnectionSubtype.SUBTYPE_WIFI_AC /* 31 */:
                            str40 = this.backgroundImageUrlHighAdapter.read(jsonReader);
                            continue;
                        case ' ':
                            str46 = this.tooltipTitleAdapter.read(jsonReader);
                            continue;
                        case '!':
                            i3 = this.abTestCellAdapter.read(jsonReader).intValue();
                            continue;
                        case '\"':
                            umaStyle5 = this.titleTextStyleAdapter.read(jsonReader);
                            continue;
                        case '#':
                            i4 = this.abTestIdAdapter.read(jsonReader).intValue();
                            continue;
                        case '$':
                            str36 = this.tooltipBodyAdapter.read(jsonReader);
                            continue;
                        case '%':
                            list9 = this.tooltipCtasAdapter.read(jsonReader);
                            continue;
                        case '&':
                            str34 = this.tooltipIconAdapter.read(jsonReader);
                            continue;
                        case '\'':
                            z14 = this.showOnBackgroundActionSuccessAdapter.read(jsonReader).booleanValue();
                            continue;
                        case JSONzip.substringLimit /* 40 */:
                            str51 = this.bannerTrackingInfoAdapter.read(jsonReader);
                            continue;
                        case ')':
                            str39 = this.backgroundActionAdapter.read(jsonReader);
                            continue;
                        case '*':
                            str41 = this.backgroundImageUrlMediumAdapter.read(jsonReader);
                            continue;
                        case '+':
                            str29 = this.templateIdAdapter.read(jsonReader);
                            continue;
                        case ',':
                            str52 = this.umsAlertRenderFeedbackAdapter.read(jsonReader);
                            continue;
                        case '-':
                            list5 = this.blockedDevicesListAdapter.read(jsonReader);
                            continue;
                        case '.':
                            umaStyle4 = this.headlineTextStyleAdapter.read(jsonReader);
                            continue;
                        case '/':
                            str35 = this.tooltipAnchorAdapter.read(jsonReader);
                            continue;
                        case '0':
                            list6 = this.headerCtasAdapter.read(jsonReader);
                            continue;
                        case '1':
                            str53 = this.bannerUmsAlertRenderFeedbackAdapter.read(jsonReader);
                            continue;
                        case ActivityChooserModel.DEFAULT_HISTORY_MAX_LENGTH /* 50 */:
                            umaStyle6 = this.bodyTextStyleAdapter.read(jsonReader);
                            continue;
                        default:
                            jsonReader.skipValue();
                            continue;
                    }
                }
            }
            jsonReader.endObject();
            return new AutoValue_UmaAlert(i3, i4, str28, str29, str30, j3, str31, str32, str33, str34, str35, str36, z8, z9, z10, z11, umaPresentAt2, str37, str38, z12, z13, z14, str39, str40, str41, str42, umaModalAttributes2, str43, str44, umaStyle4, umaStyle5, str45, str46, str47, str48, umaStyle6, str49, list6, list7, list8, list9, str50, str51, str52, str53, j4, umaTimer2, umaMultiMonthOffer2, str54, modalPlacement2, list5);
        }
    }
}
