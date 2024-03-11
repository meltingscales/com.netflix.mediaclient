package o;

import com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.reporter.EndPlayJson;

/* renamed from: o.bng  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
class C4851bng extends EndPlayJson {
    public C4851bng(String str, String str2, String str3, String str4, String str5, long j) {
        super("midplay", str, str2, str3, str4, str5, j);
        this.af = EndPlayJson.EndReason.PLAYING;
    }
}
