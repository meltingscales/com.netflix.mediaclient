package o;

import android.app.Activity;
import android.content.Context;
import com.netflix.mediaclient.servicemgr.interface_.LoMo;
import com.netflix.mediaclient.servicemgr.interface_.TrailerItem;
import com.netflix.mediaclient.ui.miniplayer.api.MiniPlayerVideoGroupViewModel;
import java.util.List;

/* loaded from: classes5.dex */
public interface cYB {
    boolean a(LoMo loMo);

    Integer b(int i);

    void b();

    void b(InterfaceC2023aX interfaceC2023aX);

    void b(InterfaceC2023aX interfaceC2023aX, LoMo loMo, int i, int i2, boolean z, boolean z2, drO<dpR> dro);

    Integer c(int i);

    InterfaceC6234cYv c(Activity activity, C9935zP c9935zP, MiniPlayerVideoGroupViewModel miniPlayerVideoGroupViewModel, C6652chO c6652chO, bLW blw, bLU blu, boolean z, cYA cya, InterfaceC5303bwH interfaceC5303bwH);

    void d();

    void d(Context context, InterfaceC2023aX interfaceC2023aX, List<TrailerItem.a> list, drM<? super Integer, dpR> drm);

    void e(int i, int i2);

    boolean e(LoMo loMo);
}
