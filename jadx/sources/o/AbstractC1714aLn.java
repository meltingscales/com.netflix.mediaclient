package o;

import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.protocol.nflx.BaseNflxHandler;
import com.netflix.mediaclient.protocol.nflx.NflxHandler;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: o.aLn  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC1714aLn extends BaseNflxHandler {
    public AbstractC1714aLn(NetflixActivity netflixActivity, Map<String, String> map) {
        super(netflixActivity, map);
    }

    @Override // com.netflix.mediaclient.protocol.nflx.BaseNflxHandler
    public NflxHandler.Response d(String str, String str2, String str3) {
        C1044Mm.e("NflxHandler", "handleMovieFromTinyUrl");
        return NflxHandler.Response.NOT_HANDLING;
    }

    @Override // com.netflix.mediaclient.protocol.nflx.BaseNflxHandler
    public NflxHandler.Response c(String str, String str2, String str3) {
        C1044Mm.e("NflxHandler", "handleEpisodeFromTinyUrl");
        return NflxHandler.Response.NOT_HANDLING;
    }
}
