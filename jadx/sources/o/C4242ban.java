package o;

import com.netflix.mediaclient.service.offline.agent.CreateRequest;
import com.netflix.mediaclient.servicemgr.interface_.VideoType;
import com.netflix.mediaclient.util.PlayContext;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: o.ban  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C4242ban {
    public final VideoType a;
    public final boolean b;
    public final CreateRequest.DownloadRequestType c;
    public final PlayContext d;
    public final String e;
    public String i;

    public void d(String str) {
        this.i = str;
    }

    public C4242ban(String str, PlayContext playContext, VideoType videoType, boolean z, CreateRequest.DownloadRequestType downloadRequestType) {
        this.i = "";
        this.e = str;
        this.d = playContext;
        this.a = videoType;
        this.b = z;
        this.c = downloadRequestType;
    }

    public C4242ban(String str, PlayContext playContext, VideoType videoType, boolean z) {
        this(str, playContext, videoType, z, CreateRequest.DownloadRequestType.UserInitiated);
    }
}
