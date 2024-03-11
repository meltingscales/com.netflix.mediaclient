package o;

import com.netflix.mediaclient.service.offline.agent.CreateRequest;
import com.netflix.mediaclient.servicemgr.interface_.VideoType;

/* renamed from: o.cwg  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C7463cwg extends C7460cwd {
    private final String a;

    @Override // o.C7460cwd, o.InterfaceC5175btm
    public String getTitle() {
        return this.a;
    }

    public C7463cwg(C7460cwd c7460cwd, String str) {
        super(c7460cwd.W(), c7460cwd.ax(), c7460cwd.aB());
        this.a = str;
    }

    @Override // o.C7460cwd, o.InterfaceC5175btm
    public VideoType getType() {
        return VideoType.SEASON;
    }

    @Override // o.C7460cwd
    public int V() {
        return VideoType.SEASON.getKey();
    }

    @Override // o.C7460cwd, o.InterfaceC5206buQ
    public CreateRequest.DownloadRequestType s() {
        return CreateRequest.DownloadRequestType.Unknown;
    }
}
