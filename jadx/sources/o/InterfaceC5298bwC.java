package o;

import android.content.Context;
import android.os.Handler;
import com.netflix.mediaclient.service.offline.agent.CreateRequest;
import com.netflix.mediaclient.service.user.UserAgent;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* renamed from: o.bwC  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC5298bwC {
    void a(Map<String, C4240bal> map);

    boolean a(String str);

    InterfaceC4245baq b(InterfaceC4208baF interfaceC4208baF, UserAgent userAgent);

    void b(Handler handler);

    InterfaceC4251baw c(InterfaceC4208baF interfaceC4208baF);

    InterfaceC5206buQ c(String str);

    void c(Map<String, InterfaceC5206buQ> map, List<InterfaceC5206buQ> list);

    InterfaceC4247bas d(Handler handler, Context context, InterfaceC5098bsO interfaceC5098bsO, boolean z, InterfaceC4208baF interfaceC4208baF);

    void d(List<String> list, InterfaceC4243bao interfaceC4243bao);

    void d(Map<String, InterfaceC5206buQ> map);

    void d(InterfaceC5283bvo interfaceC5283bvo, CreateRequest createRequest, int i);

    String e(long j, Locale locale);
}
