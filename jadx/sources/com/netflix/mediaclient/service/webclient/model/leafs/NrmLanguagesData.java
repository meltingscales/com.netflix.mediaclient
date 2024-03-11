package com.netflix.mediaclient.service.webclient.model.leafs;

import com.google.gson.annotations.SerializedName;
import o.C8118deO;
import o.C8168dfL;

/* loaded from: classes4.dex */
public class NrmLanguagesData {
    private static final String TAG = "nf_languages_nrm";
    @SerializedName("default")
    public String defaultLanguage;
    @SerializedName("localizedNames")
    public String[] localizedNames;
    @SerializedName("tags")
    public String[] tags;

    public static NrmLanguagesData fromJsonString(String str) {
        if (C8168dfL.g(str)) {
            return null;
        }
        return (NrmLanguagesData) C8118deO.a().fromJson(str, (Class<Object>) NrmLanguagesData.class);
    }

    public String toJsonString() {
        return C8118deO.a().toJson(this);
    }
}
