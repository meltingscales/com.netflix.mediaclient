package com.netflix.mediaclient.service.webclient.model.leafs;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.mediaclient.service.webclient.model.leafs.UmaCta;
import com.netflix.model.leafs.originals.interactive.template.VisualStateDefinition;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class AutoValue_UmaCta extends C$AutoValue_UmaCta {
    AutoValue_UmaCta(final String str, final String str2, final UmaCta.CtaType ctaType, final List<UmaCtaInputGroup> list, final String str3, final String str4, final String str5, final String str6, final String str7, final String str8, final String str9, final String str10, final UmaButtonStyle umaButtonStyle, final boolean z, final boolean z2, final boolean z3) {
        new UmaCta(str, str2, ctaType, list, str3, str4, str5, str6, str7, str8, str9, str10, umaButtonStyle, z, z2, z3) { // from class: com.netflix.mediaclient.service.webclient.model.leafs.$AutoValue_UmaCta
            private final String action;
            private final String actionType;
            private final boolean autoLogin;
            private final String callback;
            private final UmaCta.CtaType ctaType;
            private final String failureMessage;
            private final String fallbackUrl;
            private final List<UmaCtaInputGroup> inputGroup;
            private final boolean openLinkInWebView;
            private final String parameters;
            private final boolean selected;
            private final UmaButtonStyle style;
            private final String successMessage;
            private final String text;
            private final String trackingInfo;
            private final String umsAlertCtaFeedback;

            @Override // com.netflix.mediaclient.service.webclient.model.leafs.UmaCta
            public String action() {
                return this.action;
            }

            @Override // com.netflix.mediaclient.service.webclient.model.leafs.UmaCta
            public String actionType() {
                return this.actionType;
            }

            @Override // com.netflix.mediaclient.service.webclient.model.leafs.UmaCta
            public boolean autoLogin() {
                return this.autoLogin;
            }

            @Override // com.netflix.mediaclient.service.webclient.model.leafs.UmaCta
            public String callback() {
                return this.callback;
            }

            @Override // com.netflix.mediaclient.service.webclient.model.leafs.UmaCta
            public UmaCta.CtaType ctaType() {
                return this.ctaType;
            }

            @Override // com.netflix.mediaclient.service.webclient.model.leafs.UmaCta
            public String failureMessage() {
                return this.failureMessage;
            }

            @Override // com.netflix.mediaclient.service.webclient.model.leafs.UmaCta
            public String fallbackUrl() {
                return this.fallbackUrl;
            }

            @Override // com.netflix.mediaclient.service.webclient.model.leafs.UmaCta
            public List<UmaCtaInputGroup> inputGroup() {
                return this.inputGroup;
            }

            @Override // com.netflix.mediaclient.service.webclient.model.leafs.UmaCta
            public boolean openLinkInWebView() {
                return this.openLinkInWebView;
            }

            @Override // com.netflix.mediaclient.service.webclient.model.leafs.UmaCta
            public String parameters() {
                return this.parameters;
            }

            @Override // com.netflix.mediaclient.service.webclient.model.leafs.UmaCta
            public boolean selected() {
                return this.selected;
            }

            @Override // com.netflix.mediaclient.service.webclient.model.leafs.UmaCta
            public UmaButtonStyle style() {
                return this.style;
            }

            @Override // com.netflix.mediaclient.service.webclient.model.leafs.UmaCta
            public String successMessage() {
                return this.successMessage;
            }

            @Override // com.netflix.mediaclient.service.webclient.model.leafs.UmaCta
            public String text() {
                return this.text;
            }

            @Override // com.netflix.mediaclient.service.webclient.model.leafs.UmaCta
            public String trackingInfo() {
                return this.trackingInfo;
            }

            @Override // com.netflix.mediaclient.service.webclient.model.leafs.UmaCta
            public String umsAlertCtaFeedback() {
                return this.umsAlertCtaFeedback;
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.text = str;
                this.action = str2;
                this.ctaType = ctaType;
                this.inputGroup = list;
                this.actionType = str3;
                this.callback = str4;
                this.trackingInfo = str5;
                this.successMessage = str6;
                this.failureMessage = str7;
                this.fallbackUrl = str8;
                this.umsAlertCtaFeedback = str9;
                this.parameters = str10;
                this.style = umaButtonStyle;
                this.selected = z;
                this.autoLogin = z2;
                this.openLinkInWebView = z3;
            }

            public String toString() {
                return "UmaCta{text=" + this.text + ", action=" + this.action + ", ctaType=" + this.ctaType + ", inputGroup=" + this.inputGroup + ", actionType=" + this.actionType + ", callback=" + this.callback + ", trackingInfo=" + this.trackingInfo + ", successMessage=" + this.successMessage + ", failureMessage=" + this.failureMessage + ", fallbackUrl=" + this.fallbackUrl + ", umsAlertCtaFeedback=" + this.umsAlertCtaFeedback + ", parameters=" + this.parameters + ", style=" + this.style + ", selected=" + this.selected + ", autoLogin=" + this.autoLogin + ", openLinkInWebView=" + this.openLinkInWebView + "}";
            }

            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (obj instanceof UmaCta) {
                    UmaCta umaCta = (UmaCta) obj;
                    String str11 = this.text;
                    if (str11 != null ? str11.equals(umaCta.text()) : umaCta.text() == null) {
                        String str12 = this.action;
                        if (str12 != null ? str12.equals(umaCta.action()) : umaCta.action() == null) {
                            UmaCta.CtaType ctaType2 = this.ctaType;
                            if (ctaType2 != null ? ctaType2.equals(umaCta.ctaType()) : umaCta.ctaType() == null) {
                                List<UmaCtaInputGroup> list2 = this.inputGroup;
                                if (list2 != null ? list2.equals(umaCta.inputGroup()) : umaCta.inputGroup() == null) {
                                    String str13 = this.actionType;
                                    if (str13 != null ? str13.equals(umaCta.actionType()) : umaCta.actionType() == null) {
                                        String str14 = this.callback;
                                        if (str14 != null ? str14.equals(umaCta.callback()) : umaCta.callback() == null) {
                                            String str15 = this.trackingInfo;
                                            if (str15 != null ? str15.equals(umaCta.trackingInfo()) : umaCta.trackingInfo() == null) {
                                                String str16 = this.successMessage;
                                                if (str16 != null ? str16.equals(umaCta.successMessage()) : umaCta.successMessage() == null) {
                                                    String str17 = this.failureMessage;
                                                    if (str17 != null ? str17.equals(umaCta.failureMessage()) : umaCta.failureMessage() == null) {
                                                        String str18 = this.fallbackUrl;
                                                        if (str18 != null ? str18.equals(umaCta.fallbackUrl()) : umaCta.fallbackUrl() == null) {
                                                            String str19 = this.umsAlertCtaFeedback;
                                                            if (str19 != null ? str19.equals(umaCta.umsAlertCtaFeedback()) : umaCta.umsAlertCtaFeedback() == null) {
                                                                String str20 = this.parameters;
                                                                if (str20 != null ? str20.equals(umaCta.parameters()) : umaCta.parameters() == null) {
                                                                    UmaButtonStyle umaButtonStyle2 = this.style;
                                                                    if (umaButtonStyle2 != null ? umaButtonStyle2.equals(umaCta.style()) : umaCta.style() == null) {
                                                                        if (this.selected == umaCta.selected() && this.autoLogin == umaCta.autoLogin() && this.openLinkInWebView == umaCta.openLinkInWebView()) {
                                                                            return true;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    return false;
                }
                return false;
            }

            public int hashCode() {
                String str11 = this.text;
                int hashCode = str11 == null ? 0 : str11.hashCode();
                String str12 = this.action;
                int hashCode2 = str12 == null ? 0 : str12.hashCode();
                UmaCta.CtaType ctaType2 = this.ctaType;
                int hashCode3 = ctaType2 == null ? 0 : ctaType2.hashCode();
                List<UmaCtaInputGroup> list2 = this.inputGroup;
                int hashCode4 = list2 == null ? 0 : list2.hashCode();
                String str13 = this.actionType;
                int hashCode5 = str13 == null ? 0 : str13.hashCode();
                String str14 = this.callback;
                int hashCode6 = str14 == null ? 0 : str14.hashCode();
                String str15 = this.trackingInfo;
                int hashCode7 = str15 == null ? 0 : str15.hashCode();
                String str16 = this.successMessage;
                int hashCode8 = str16 == null ? 0 : str16.hashCode();
                String str17 = this.failureMessage;
                int hashCode9 = str17 == null ? 0 : str17.hashCode();
                String str18 = this.fallbackUrl;
                int hashCode10 = str18 == null ? 0 : str18.hashCode();
                String str19 = this.umsAlertCtaFeedback;
                int hashCode11 = str19 == null ? 0 : str19.hashCode();
                String str20 = this.parameters;
                int hashCode12 = str20 == null ? 0 : str20.hashCode();
                UmaButtonStyle umaButtonStyle2 = this.style;
                int hashCode13 = umaButtonStyle2 != null ? umaButtonStyle2.hashCode() : 0;
                int i = this.selected ? 1231 : 1237;
                return ((((((((((((((((((((((((((((((hashCode ^ 1000003) * 1000003) ^ hashCode2) * 1000003) ^ hashCode3) * 1000003) ^ hashCode4) * 1000003) ^ hashCode5) * 1000003) ^ hashCode6) * 1000003) ^ hashCode7) * 1000003) ^ hashCode8) * 1000003) ^ hashCode9) * 1000003) ^ hashCode10) * 1000003) ^ hashCode11) * 1000003) ^ hashCode12) * 1000003) ^ hashCode13) * 1000003) ^ i) * 1000003) ^ (this.autoLogin ? 1231 : 1237)) * 1000003) ^ (this.openLinkInWebView ? 1231 : 1237);
            }
        };
    }

    /* loaded from: classes.dex */
    public static final class GsonTypeAdapter extends TypeAdapter<UmaCta> {
        private final TypeAdapter<String> actionAdapter;
        private final TypeAdapter<String> actionTypeAdapter;
        private final TypeAdapter<Boolean> autoLoginAdapter;
        private final TypeAdapter<String> callbackAdapter;
        private final TypeAdapter<UmaCta.CtaType> ctaTypeAdapter;
        private final TypeAdapter<String> failureMessageAdapter;
        private final TypeAdapter<String> fallbackUrlAdapter;
        private final TypeAdapter<List<UmaCtaInputGroup>> inputGroupAdapter;
        private final TypeAdapter<Boolean> openLinkInWebViewAdapter;
        private final TypeAdapter<String> parametersAdapter;
        private final TypeAdapter<Boolean> selectedAdapter;
        private final TypeAdapter<UmaButtonStyle> styleAdapter;
        private final TypeAdapter<String> successMessageAdapter;
        private final TypeAdapter<String> textAdapter;
        private final TypeAdapter<String> trackingInfoAdapter;
        private final TypeAdapter<String> umsAlertCtaFeedbackAdapter;
        private String defaultText = null;
        private String defaultAction = null;
        private UmaCta.CtaType defaultCtaType = null;
        private List<UmaCtaInputGroup> defaultInputGroup = null;
        private String defaultActionType = null;
        private String defaultCallback = null;
        private String defaultTrackingInfo = null;
        private String defaultSuccessMessage = null;
        private String defaultFailureMessage = null;
        private String defaultFallbackUrl = null;
        private String defaultUmsAlertCtaFeedback = null;
        private String defaultParameters = null;
        private UmaButtonStyle defaultStyle = null;
        private boolean defaultSelected = false;
        private boolean defaultAutoLogin = false;
        private boolean defaultOpenLinkInWebView = false;

        public GsonTypeAdapter setDefaultAction(String str) {
            this.defaultAction = str;
            return this;
        }

        public GsonTypeAdapter setDefaultActionType(String str) {
            this.defaultActionType = str;
            return this;
        }

        public GsonTypeAdapter setDefaultAutoLogin(boolean z) {
            this.defaultAutoLogin = z;
            return this;
        }

        public GsonTypeAdapter setDefaultCallback(String str) {
            this.defaultCallback = str;
            return this;
        }

        public GsonTypeAdapter setDefaultCtaType(UmaCta.CtaType ctaType) {
            this.defaultCtaType = ctaType;
            return this;
        }

        public GsonTypeAdapter setDefaultFailureMessage(String str) {
            this.defaultFailureMessage = str;
            return this;
        }

        public GsonTypeAdapter setDefaultFallbackUrl(String str) {
            this.defaultFallbackUrl = str;
            return this;
        }

        public GsonTypeAdapter setDefaultInputGroup(List<UmaCtaInputGroup> list) {
            this.defaultInputGroup = list;
            return this;
        }

        public GsonTypeAdapter setDefaultOpenLinkInWebView(boolean z) {
            this.defaultOpenLinkInWebView = z;
            return this;
        }

        public GsonTypeAdapter setDefaultParameters(String str) {
            this.defaultParameters = str;
            return this;
        }

        public GsonTypeAdapter setDefaultSelected(boolean z) {
            this.defaultSelected = z;
            return this;
        }

        public GsonTypeAdapter setDefaultStyle(UmaButtonStyle umaButtonStyle) {
            this.defaultStyle = umaButtonStyle;
            return this;
        }

        public GsonTypeAdapter setDefaultSuccessMessage(String str) {
            this.defaultSuccessMessage = str;
            return this;
        }

        public GsonTypeAdapter setDefaultText(String str) {
            this.defaultText = str;
            return this;
        }

        public GsonTypeAdapter setDefaultTrackingInfo(String str) {
            this.defaultTrackingInfo = str;
            return this;
        }

        public GsonTypeAdapter setDefaultUmsAlertCtaFeedback(String str) {
            this.defaultUmsAlertCtaFeedback = str;
            return this;
        }

        public GsonTypeAdapter(Gson gson) {
            this.textAdapter = gson.getAdapter(String.class);
            this.actionAdapter = gson.getAdapter(String.class);
            this.ctaTypeAdapter = gson.getAdapter(UmaCta.CtaType.class);
            this.inputGroupAdapter = gson.getAdapter(TypeToken.getParameterized(List.class, UmaCtaInputGroup.class));
            this.actionTypeAdapter = gson.getAdapter(String.class);
            this.callbackAdapter = gson.getAdapter(String.class);
            this.trackingInfoAdapter = gson.getAdapter(String.class);
            this.successMessageAdapter = gson.getAdapter(String.class);
            this.failureMessageAdapter = gson.getAdapter(String.class);
            this.fallbackUrlAdapter = gson.getAdapter(String.class);
            this.umsAlertCtaFeedbackAdapter = gson.getAdapter(String.class);
            this.parametersAdapter = gson.getAdapter(String.class);
            this.styleAdapter = gson.getAdapter(UmaButtonStyle.class);
            this.selectedAdapter = gson.getAdapter(Boolean.class);
            this.autoLoginAdapter = gson.getAdapter(Boolean.class);
            this.openLinkInWebViewAdapter = gson.getAdapter(Boolean.class);
        }

        @Override // com.google.gson.TypeAdapter
        public void write(JsonWriter jsonWriter, UmaCta umaCta) {
            if (umaCta == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginObject();
            jsonWriter.name("text");
            this.textAdapter.write(jsonWriter, umaCta.text());
            jsonWriter.name(SignupConstants.Error.DEBUG_INFO_ACTION);
            this.actionAdapter.write(jsonWriter, umaCta.action());
            jsonWriter.name("ctaType");
            this.ctaTypeAdapter.write(jsonWriter, umaCta.ctaType());
            jsonWriter.name("inputGroup");
            this.inputGroupAdapter.write(jsonWriter, umaCta.inputGroup());
            jsonWriter.name("actionType");
            this.actionTypeAdapter.write(jsonWriter, umaCta.actionType());
            jsonWriter.name("callback");
            this.callbackAdapter.write(jsonWriter, umaCta.callback());
            jsonWriter.name("trackingInfo");
            this.trackingInfoAdapter.write(jsonWriter, umaCta.trackingInfo());
            jsonWriter.name("successMessage");
            this.successMessageAdapter.write(jsonWriter, umaCta.successMessage());
            jsonWriter.name("failureMessage");
            this.failureMessageAdapter.write(jsonWriter, umaCta.failureMessage());
            jsonWriter.name("fallbackUrl");
            this.fallbackUrlAdapter.write(jsonWriter, umaCta.fallbackUrl());
            jsonWriter.name("umsAlertCtaFeedback");
            this.umsAlertCtaFeedbackAdapter.write(jsonWriter, umaCta.umsAlertCtaFeedback());
            jsonWriter.name("parameters");
            this.parametersAdapter.write(jsonWriter, umaCta.parameters());
            jsonWriter.name("style");
            this.styleAdapter.write(jsonWriter, umaCta.style());
            jsonWriter.name(VisualStateDefinition.ELEMENT_STATE.SELECTED);
            this.selectedAdapter.write(jsonWriter, Boolean.valueOf(umaCta.selected()));
            jsonWriter.name("autoLogin");
            this.autoLoginAdapter.write(jsonWriter, Boolean.valueOf(umaCta.autoLogin()));
            jsonWriter.name("openLinkInWebView");
            this.openLinkInWebViewAdapter.write(jsonWriter, Boolean.valueOf(umaCta.openLinkInWebView()));
            jsonWriter.endObject();
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.gson.TypeAdapter
        public UmaCta read(JsonReader jsonReader) {
            char c;
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            jsonReader.beginObject();
            String str = this.defaultText;
            String str2 = this.defaultAction;
            UmaCta.CtaType ctaType = this.defaultCtaType;
            List<UmaCtaInputGroup> list = this.defaultInputGroup;
            String str3 = this.defaultActionType;
            String str4 = this.defaultCallback;
            String str5 = this.defaultTrackingInfo;
            String str6 = this.defaultSuccessMessage;
            String str7 = this.defaultFailureMessage;
            String str8 = this.defaultFallbackUrl;
            String str9 = this.defaultUmsAlertCtaFeedback;
            String str10 = this.defaultParameters;
            UmaButtonStyle umaButtonStyle = this.defaultStyle;
            boolean z = this.defaultSelected;
            boolean z2 = this.defaultAutoLogin;
            boolean z3 = this.defaultOpenLinkInWebView;
            String str11 = str2;
            UmaCta.CtaType ctaType2 = ctaType;
            List<UmaCtaInputGroup> list2 = list;
            String str12 = str3;
            String str13 = str4;
            String str14 = str5;
            String str15 = str6;
            String str16 = str7;
            String str17 = str8;
            String str18 = str9;
            String str19 = str10;
            UmaButtonStyle umaButtonStyle2 = umaButtonStyle;
            boolean z4 = z;
            String str20 = str;
            boolean z5 = z2;
            while (jsonReader.hasNext()) {
                String nextName = jsonReader.nextName();
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                } else {
                    nextName.hashCode();
                    switch (nextName.hashCode()) {
                        case -1884240891:
                            if (nextName.equals("trackingInfo")) {
                                c = 0;
                                break;
                            }
                            c = 65535;
                            break;
                        case -1704954083:
                            if (nextName.equals("failureMessage")) {
                                c = 1;
                                break;
                            }
                            c = 65535;
                            break;
                        case -1422950858:
                            if (nextName.equals(SignupConstants.Error.DEBUG_INFO_ACTION)) {
                                c = 2;
                                break;
                            }
                            c = 65535;
                            break;
                        case -1161977420:
                            if (nextName.equals("umsAlertCtaFeedback")) {
                                c = 3;
                                break;
                            }
                            c = 65535;
                            break;
                        case -864423376:
                            if (nextName.equals("openLinkInWebView")) {
                                c = 4;
                                break;
                            }
                            c = 65535;
                            break;
                        case -172220347:
                            if (nextName.equals("callback")) {
                                c = 5;
                                break;
                            }
                            c = 65535;
                            break;
                        case 3556653:
                            if (nextName.equals("text")) {
                                c = 6;
                                break;
                            }
                            c = 65535;
                            break;
                        case 109780401:
                            if (nextName.equals("style")) {
                                c = 7;
                                break;
                            }
                            c = 65535;
                            break;
                        case 458736106:
                            if (nextName.equals("parameters")) {
                                c = '\b';
                                break;
                            }
                            c = 65535;
                            break;
                        case 773759789:
                            if (nextName.equals("fallbackUrl")) {
                                c = '\t';
                                break;
                            }
                            c = 65535;
                            break;
                        case 1081736554:
                            if (nextName.equals("ctaType")) {
                                c = '\n';
                                break;
                            }
                            c = 65535;
                            break;
                        case 1191572123:
                            if (nextName.equals(VisualStateDefinition.ELEMENT_STATE.SELECTED)) {
                                c = 11;
                                break;
                            }
                            c = 65535;
                            break;
                        case 1219092100:
                            if (nextName.equals("successMessage")) {
                                c = '\f';
                                break;
                            }
                            c = 65535;
                            break;
                        case 1364458709:
                            if (nextName.equals("inputGroup")) {
                                c = '\r';
                                break;
                            }
                            c = 65535;
                            break;
                        case 1643599610:
                            if (nextName.equals("autoLogin")) {
                                c = 14;
                                break;
                            }
                            c = 65535;
                            break;
                        case 1851881104:
                            if (nextName.equals("actionType")) {
                                c = 15;
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
                            str14 = this.trackingInfoAdapter.read(jsonReader);
                            continue;
                        case 1:
                            str16 = this.failureMessageAdapter.read(jsonReader);
                            continue;
                        case 2:
                            str11 = this.actionAdapter.read(jsonReader);
                            continue;
                        case 3:
                            str18 = this.umsAlertCtaFeedbackAdapter.read(jsonReader);
                            continue;
                        case 4:
                            z3 = this.openLinkInWebViewAdapter.read(jsonReader).booleanValue();
                            continue;
                        case 5:
                            str13 = this.callbackAdapter.read(jsonReader);
                            continue;
                        case 6:
                            str20 = this.textAdapter.read(jsonReader);
                            continue;
                        case 7:
                            umaButtonStyle2 = this.styleAdapter.read(jsonReader);
                            continue;
                        case '\b':
                            str19 = this.parametersAdapter.read(jsonReader);
                            continue;
                        case '\t':
                            str17 = this.fallbackUrlAdapter.read(jsonReader);
                            continue;
                        case '\n':
                            ctaType2 = this.ctaTypeAdapter.read(jsonReader);
                            continue;
                        case 11:
                            z4 = this.selectedAdapter.read(jsonReader).booleanValue();
                            continue;
                        case '\f':
                            str15 = this.successMessageAdapter.read(jsonReader);
                            continue;
                        case '\r':
                            list2 = this.inputGroupAdapter.read(jsonReader);
                            continue;
                        case 14:
                            z5 = this.autoLoginAdapter.read(jsonReader).booleanValue();
                            continue;
                        case 15:
                            str12 = this.actionTypeAdapter.read(jsonReader);
                            continue;
                        default:
                            jsonReader.skipValue();
                            continue;
                    }
                }
            }
            jsonReader.endObject();
            return new AutoValue_UmaCta(str20, str11, ctaType2, list2, str12, str13, str14, str15, str16, str17, str18, str19, umaButtonStyle2, z4, z5, z3);
        }
    }
}
