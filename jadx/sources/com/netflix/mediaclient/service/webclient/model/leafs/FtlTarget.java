package com.netflix.mediaclient.service.webclient.model.leafs;

import android.text.TextUtils;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.SerializedName;
import com.netflix.mediaclient.service.webclient.model.leafs.AutoValue_FtlTarget;
import com.netflix.mediaclient.service.webclient.model.leafs.C$AutoValue_FtlTarget;
import o.InterfaceC9818xE;

/* loaded from: classes.dex */
public abstract class FtlTarget implements InterfaceC9818xE {

    /* loaded from: classes.dex */
    public static abstract class Builder {
        public abstract FtlTarget build();

        public abstract Builder host(String str);

        public abstract Builder name(String str);
    }

    @Override // o.InterfaceC9818xE
    @SerializedName("host")
    public abstract String host();

    @Override // o.InterfaceC9818xE
    @SerializedName("name")
    public abstract String name();

    public static TypeAdapter<FtlTarget> typeAdapter(Gson gson) {
        return new AutoValue_FtlTarget.GsonTypeAdapter(gson);
    }

    public static Builder builder() {
        return new C$AutoValue_FtlTarget.Builder();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean isValid() {
        return !TextUtils.isEmpty(name()) && (!TextUtils.isEmpty(host()) && host().endsWith(".netflix.com"));
    }
}
