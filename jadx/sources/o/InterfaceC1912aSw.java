package o;

import com.netflix.mediaclient.browse.api.task.TaskMode;
import com.netflix.mediaclient.service.pushnotification.MessageData;
import com.netflix.mediaclient.servicemgr.PlayLocationType;
import com.netflix.mediaclient.servicemgr.interface_.LoMo;
import com.netflix.mediaclient.servicemgr.interface_.VideoType;
import com.netflix.model.leafs.advisory.ContentAction;
import java.util.List;

/* renamed from: o.aSw  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC1912aSw {
    void a(LoMo loMo, int i, int i2, boolean z, InterfaceC1757aNc interfaceC1757aNc, String str);

    void b(String str, ContentAction contentAction);

    void b(String str, String str2, boolean z, TaskMode taskMode, InterfaceC1757aNc interfaceC1757aNc, String str3, Boolean bool);

    aSI c();

    void c(String str, String str2, boolean z, TaskMode taskMode, InterfaceC1757aNc interfaceC1757aNc, String str3);

    void d(int i, boolean z, InterfaceC1757aNc interfaceC1757aNc);

    void d(String str, TaskMode taskMode, InterfaceC1757aNc interfaceC1757aNc);

    void d(List<String> list, InterfaceC1757aNc interfaceC1757aNc);

    <T extends IO> void d(T t, InterfaceC1757aNc interfaceC1757aNc);

    <T> void d(InterfaceC0986Kf<T> interfaceC0986Kf, InterfaceC1755aNa<T> interfaceC1755aNa);

    void e(String str, VideoType videoType, PlayLocationType playLocationType, InterfaceC1757aNc interfaceC1757aNc);

    void e(String str, String str2, TaskMode taskMode, InterfaceC1757aNc interfaceC1757aNc, String str3);

    void e(String str, String str2, String str3, String str4);

    void e(String str, String str2, boolean z, TaskMode taskMode, InterfaceC1757aNc interfaceC1757aNc, String str3, Boolean bool);

    void e(boolean z, boolean z2, boolean z3, MessageData messageData);

    boolean isReady();
}
