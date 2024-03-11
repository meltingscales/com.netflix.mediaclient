package com.netflix.mediaclient.service.offline.agent;

import com.netflix.mediaclient.servicemgr.interface_.VideoType;
import com.netflix.mediaclient.util.PlayContext;
import o.C8168dfL;
import o.C8193dfk;

/* loaded from: classes.dex */
public class CreateRequest {
    public final VideoType a;
    public String b;
    public final PlayContext c;
    public final DownloadRequestType d;
    public final String e;
    private boolean g;
    private final String h;
    private final String j;

    public String b() {
        return this.j;
    }

    public String d() {
        return this.h;
    }

    public void e(boolean z) {
        this.g = z;
    }

    public boolean e() {
        return this.g;
    }

    /* loaded from: classes3.dex */
    public enum DownloadRequestType {
        Unknown("unknown", false),
        SmartDownload("smartdownload", true),
        UserInitiated("userinitiated", false),
        Scheduled("scheduled", false),
        DownloadForYou("downloadforyou", true);
        
        private final String h;
        private final boolean i;

        public String a() {
            return this.h;
        }

        public boolean e() {
            return this.i;
        }

        DownloadRequestType(String str, boolean z) {
            this.h = str;
            this.i = z;
        }

        public static DownloadRequestType a(String str) {
            DownloadRequestType[] values;
            for (DownloadRequestType downloadRequestType : values()) {
                if (downloadRequestType.a().equals(str)) {
                    return downloadRequestType;
                }
            }
            return Unknown;
        }
    }

    public CreateRequest(String str, VideoType videoType, PlayContext playContext) {
        this(str, videoType, playContext, "", DownloadRequestType.UserInitiated);
    }

    public CreateRequest(String str, VideoType videoType, PlayContext playContext, String str2, DownloadRequestType downloadRequestType) {
        this.g = false;
        this.e = str;
        this.c = playContext;
        this.a = videoType;
        this.b = str2;
        this.d = downloadRequestType;
        this.h = C8193dfk.a();
        this.j = C8193dfk.c();
    }

    public void c(String str) {
        if (C8168dfL.g(this.b) && C8168dfL.h(str)) {
            this.b = str;
        }
    }
}
