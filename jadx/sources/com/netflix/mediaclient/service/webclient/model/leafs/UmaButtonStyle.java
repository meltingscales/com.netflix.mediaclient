package com.netflix.mediaclient.service.webclient.model.leafs;

import android.graphics.Color;
import android.text.TextUtils;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.SerializedName;
import com.netflix.mediaclient.service.webclient.model.leafs.AutoValue_UmaButtonStyle;

/* loaded from: classes.dex */
public abstract class UmaButtonStyle {
    @SerializedName("buttonColor")
    public abstract String buttonColor();

    @SerializedName("textColor")
    public abstract String textColor();

    public static Integer toColorInt(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return Integer.valueOf(Color.parseColor("#" + str));
    }

    public static TypeAdapter<UmaButtonStyle> typeAdapter(Gson gson) {
        return new AutoValue_UmaButtonStyle.GsonTypeAdapter(gson);
    }
}
