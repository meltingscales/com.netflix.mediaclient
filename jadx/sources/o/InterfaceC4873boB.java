package o;

import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.media.PreferredLanguageData;
import com.netflix.mediaclient.servicemgr.IPlayer;
import java.util.List;

/* renamed from: o.boB  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC4873boB {

    /* renamed from: o.boB$a */
    /* loaded from: classes4.dex */
    public interface a {
        void a(long j, Status status);

        void d(long j, InterfaceC4525bgE interfaceC4525bgE, boolean z);
    }

    InterfaceC4900boc a();

    void b(List<Long> list, a aVar, C4877boF c4877boF, boolean z, aHT aht);

    void d();

    void d(long j, PreferredLanguageData preferredLanguageData);

    IPlayer.PlaybackType e(List<Long> list);
}
