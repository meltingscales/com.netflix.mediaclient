package o;

import com.netflix.cl.Logger;
import com.netflix.cl.model.AppView;
import com.netflix.cl.model.TrackingInfo;
import com.netflix.cl.model.context.SelectedProfileAvatarModel;
import com.netflix.cl.model.event.discrete.Presented;
import com.netflix.cl.model.event.session.Focus;
import com.netflix.cl.model.event.session.command.ChangeValueCommand;
import com.netflix.mediaclient.clutils.CLv2Utils;
import org.json.JSONObject;

/* renamed from: o.cOu  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5960cOu {
    public static final C5960cOu b = new C5960cOu();

    private C5960cOu() {
    }

    public final void c(InterfaceC5159btW interfaceC5159btW, TrackingInfo trackingInfo) {
        C8632dsu.c((Object) interfaceC5159btW, "");
        C8632dsu.c((Object) trackingInfo, "");
        Logger.INSTANCE.logEvent(new Presented(AppView.profileAvatar, Boolean.valueOf(interfaceC5159btW.getUrl() == null), trackingInfo));
    }

    public final void a(TrackingInfo trackingInfo, String str) {
        C8632dsu.c((Object) trackingInfo, "");
        if (str == null) {
            str = "";
        }
        CLv2Utils.INSTANCE.e(new Focus(AppView.profileAvatar, trackingInfo), new ChangeValueCommand(str));
        Logger.INSTANCE.addContext(new SelectedProfileAvatarModel(trackingInfo));
    }

    public final TrackingInfo c(final String str) {
        return new TrackingInfo() { // from class: o.cOw
            @Override // com.netflix.cl.model.JsonSerializer
            public final JSONObject toJSONObject() {
                JSONObject b2;
                b2 = C5960cOu.b(str);
                return b2;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final JSONObject b(String str) {
        return new JSONObject().put("uuid", str);
    }

    public final void c() {
        Logger.INSTANCE.removeExclusiveContext("SelectedProfileAvatarModel");
    }
}
