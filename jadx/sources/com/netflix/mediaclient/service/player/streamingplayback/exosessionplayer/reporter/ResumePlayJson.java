package com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.reporter;

import com.google.gson.annotations.SerializedName;
import com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.reporter.CurrentNetworkInfo;
import com.netflix.mediaclient.servicemgr.interface_.player.playlist.PlaylistTimestamp;
import o.InterfaceC4660bih;

/* loaded from: classes3.dex */
public class ResumePlayJson extends BaseEventJson {
    @SerializedName("mnc")
    protected Integer U;
    @SerializedName("cdnid")
    protected Integer V;
    @SerializedName("mcc")
    protected Integer W;
    @SerializedName("cdnname")
    protected String X;
    @SerializedName("playdelay")
    protected Long Y;
    @SerializedName("reason")
    protected Reason Z;
    @SerializedName("carrier")
    protected String a;
    @SerializedName("repos_reason")
    protected String aa;
    @SerializedName("netspec")
    protected CurrentNetworkInfo.NetSpec ab;
    @SerializedName("nettype")
    protected CurrentNetworkInfo.NetType ac;
    @SerializedName("actualbw")
    protected Long c;
    @SerializedName("actualbt")
    protected Long e;

    /* loaded from: classes3.dex */
    public enum Reason {
        REPOS,
        REBUFFER,
        SKIP
    }

    public ResumePlayJson a(Long l) {
        this.c = l;
        return this;
    }

    public ResumePlayJson a(String str) {
        this.aa = str;
        return this;
    }

    public ResumePlayJson b(Reason reason) {
        this.Z = reason;
        return this;
    }

    public ResumePlayJson c(Long l) {
        this.Y = l;
        return this;
    }

    public ResumePlayJson e(Long l) {
        this.e = l;
        return this;
    }

    protected ResumePlayJson() {
    }

    public ResumePlayJson(String str, String str2, String str3, String str4, String str5) {
        super("resumeplay", str, str2, str3, str4, str5);
    }

    public ResumePlayJson e(long j, PlaylistTimestamp playlistTimestamp) {
        super.c(j, playlistTimestamp);
        return this;
    }

    public ResumePlayJson a(InterfaceC4660bih.e eVar) {
        if (eVar != null) {
            this.V = Integer.valueOf(eVar.m);
            InterfaceC4660bih.d[] dVarArr = eVar.c;
            int length = dVarArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                InterfaceC4660bih.d dVar = dVarArr[i];
                if (this.V.equals(Integer.valueOf(dVar.b))) {
                    this.X = dVar.j;
                    break;
                }
                i++;
            }
        }
        return this;
    }

    public ResumePlayJson d(CurrentNetworkInfo currentNetworkInfo) {
        if (currentNetworkInfo != null) {
            this.a = currentNetworkInfo.e();
            this.W = currentNetworkInfo.b();
            this.U = currentNetworkInfo.h();
            this.ac = currentNetworkInfo.j();
            this.ab = currentNetworkInfo.f();
        }
        return this;
    }

    public ResumePlayJson a(long j) {
        c(j);
        return this;
    }
}
