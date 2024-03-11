package o;

import com.netflix.cl.model.AppView;
import com.netflix.cl.model.TrackingInfo;
import com.netflix.cl.model.event.session.Focus;
import com.netflix.cl.model.event.session.command.CancelCommand;
import com.netflix.cl.model.event.session.command.Command;
import com.netflix.cl.model.event.session.command.SelectCommand;
import com.netflix.mediaclient.clutils.CLv2Utils;
import o.C8632dsu;
import org.json.JSONObject;

/* renamed from: o.cdb  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6453cdb implements TE {
    @Override // o.TE
    public void b() {
        CLv2Utils.INSTANCE.b(new Focus(AppView.closeButton, null), (Command) new CancelCommand(), false);
    }

    @Override // o.TE
    public void b(final String str, boolean z) {
        C8632dsu.c((Object) str, "");
        final drO<JSONObject> dro = new drO<JSONObject>() { // from class: com.netflix.mediaclient.ui.lolomo.genregeddon.GenreSelectionsLoggingHelper$logSelectionItemClicked$trackingInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // o.drO
            /* renamed from: b */
            public final JSONObject invoke() {
                return new JSONObject().put("genreId", C8632dsu.c((Object) str, (Object) "lolomo") ? "all" : str);
            }
        };
        CLv2Utils.INSTANCE.b(new Focus(AppView.categorySelectorItem, new TrackingInfo() { // from class: o.cdc
            @Override // com.netflix.cl.model.JsonSerializer
            public final JSONObject toJSONObject() {
                JSONObject c;
                c = C6453cdb.c(drO.this);
                return c;
            }
        }), new SelectCommand(), z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final JSONObject c(drO dro) {
        C8632dsu.c((Object) dro, "");
        return (JSONObject) dro.invoke();
    }
}
