package com.netflix.mediaclient.service.webclient.model.leafs;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.netflix.mediaclient.service.webclient.model.leafs.AutoValue_UmaCta;
import java.util.List;

/* loaded from: classes.dex */
public abstract class UmaCta {
    public static final String ACTION_COLLECT_PHONE = "COLLECT_PHONE";
    public static final String ACTION_CONNECT_TO_WHATSAPP = "CONNECT_TO_WHATSAPP";
    public static final String ACTION_COPY_LINK = "COPY_LINK";
    public static final String ACTION_COPY_TEXT = "COPY_TEXT";
    public static final String ACTION_CREATE_ACCOUNT = "CREATE_ACCOUNT";
    public static final String ACTION_CREATE_PROFILE_KIDS = "CREATE_PROFILE_KIDS";
    public static final String ACTION_DISMISS = "DISMISS";
    public static final String ACTION_EMAIL_CODE_VALIDATION = "EMAIL_CODE_VALIDATION";
    public static final String ACTION_NOT_NOW = "NOT_NOW";
    public static final String ACTION_PLAN_ACKNOWLEDGE = "PLAN_ACKNOWLEDGE";
    public static final String ACTION_PLAN_SELECT = "PLAN_SELECT";
    public static final String ACTION_PRICE_ACKNOWLEDGE = "PRICE_ACKNOWLEDGE";
    public static final String ACTION_PROFILE_GATE = "PROFILE_GATE";
    public static final String ACTION_PROFILE_SWITCH = "PROFILE_SWITCH";
    public static final String ACTION_REFER_FRIENDS = "REFER_FRIENDS";
    public static final String ACTION_RESTART_MEMBERSHIP = "RESTART_MEMBERSHIP";
    public static final String ACTION_RETRY_PAYMENT = "RETRY_PAYMENT";
    public static final String ACTION_SIGN_OUT = "SIGN_OUT";
    public static final String ACTION_SMS_CODE_VALIDATION = "SMS_CODE_VALIDATION";
    public static final String ACTION_TOU_AGREE = "TOU_AGREE";
    public static final String ACTION_TYPE_APP_REDIRECT = "APP_REDIRECT";
    public static final String ACTION_TYPE_BACKGROUND_CALL = "BACKGROUND_CALL";
    public static final String ACTION_TYPE_LINK = "LINK";
    public static final String ACTION_TYPE_UMS_IMPRESSION = "UMS_IMPRESSION";
    public static final String ACTION_UNPAUSE_MEMBERSHIP = "UNPAUSE_MEMBERSHIP";
    public static final String ACTION_VIEW_COLLECTION = "VIEW_COLLECTION";
    public static final String CALLBACK_ACKNOWLEDGED = "ACKNOWLEDGED";
    public static final String MANAGE_PRIMARY_LOCATION = "MANAGE_PRIMARY_LOCATION";
    public static final String MHU_TRAVEL_ALLOW_OTP = "TRAVEL_ALLOW_OTP";

    /* loaded from: classes.dex */
    public enum CtaType {
        BUTTON,
        CLOSE,
        CLICKABLE_TEXT,
        FAKE_INPUT,
        COPY_BUTTON
    }

    public abstract String action();

    public abstract String actionType();

    public abstract boolean autoLogin();

    public abstract String callback();

    public abstract CtaType ctaType();

    public abstract String failureMessage();

    public abstract String fallbackUrl();

    public abstract List<UmaCtaInputGroup> inputGroup();

    public abstract boolean openLinkInWebView();

    public abstract String parameters();

    public abstract boolean selected();

    public abstract UmaButtonStyle style();

    public abstract String successMessage();

    public abstract String text();

    public abstract String trackingInfo();

    public abstract String umsAlertCtaFeedback();

    public static TypeAdapter<UmaCta> typeAdapter(Gson gson) {
        return new AutoValue_UmaCta.GsonTypeAdapter(gson);
    }
}
