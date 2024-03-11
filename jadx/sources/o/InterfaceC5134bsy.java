package o;

import android.content.Intent;
import com.netflix.cl.model.AppView;

/* renamed from: o.bsy  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC5134bsy extends InterfaceC5104bsU {
    boolean handleCommand(Intent intent, InterfaceC1912aSw interfaceC1912aSw);

    void informServiceStartedOnGcmInfo();

    boolean isOptIn();

    void report(boolean z, AppView appView);
}
