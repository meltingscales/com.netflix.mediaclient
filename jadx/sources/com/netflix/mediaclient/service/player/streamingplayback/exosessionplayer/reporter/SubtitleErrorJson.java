package com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.reporter;

import android.net.Uri;
import androidx.media3.common.Format;
import com.google.gson.annotations.SerializedName;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;

/* loaded from: classes3.dex */
public class SubtitleErrorJson extends BaseEventJson {
    @SerializedName(SignupConstants.Field.URL)
    protected String a;
    @SerializedName("subtitletype")
    protected SubtitleType c;
    @SerializedName("dlid")
    protected String e;

    /* loaded from: classes3.dex */
    protected enum SubtitleType {
        TEXT,
        IMAGE
    }

    protected SubtitleErrorJson() {
    }

    public SubtitleErrorJson(String str, String str2, String str3, String str4, String str5) {
        super("subtitleerror", str, str2, str3, str4, str5);
    }

    public SubtitleErrorJson c(Format format) {
        this.e = format.id;
        if ("application/nflx-cmisc".equals(format.sampleMimeType)) {
            this.c = SubtitleType.IMAGE;
        } else {
            this.c = SubtitleType.TEXT;
        }
        return this;
    }

    public SubtitleErrorJson a(Uri uri) {
        this.a = uri.toString();
        return this;
    }
}
