package o;

import com.netflix.mediaclient.latencytracker.api.UiLatencyMarker;
import javax.inject.Inject;

/* renamed from: o.aCu  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1478aCu implements InterfaceC1474aCq {
    private final UiLatencyMarker e;

    public final UiLatencyMarker e() {
        return this.e;
    }

    @Inject
    public C1478aCu(UiLatencyMarker uiLatencyMarker) {
        C8632dsu.c((Object) uiLatencyMarker, "");
        this.e = uiLatencyMarker;
    }

    @Override // o.InterfaceC1474aCq
    public void c() {
        this.e.b(UiLatencyMarker.Mark.PREPARE_END);
    }

    @Override // o.InterfaceC1474aCq
    public void a() {
        this.e.b(UiLatencyMarker.Mark.QUEUED_START);
    }

    @Override // o.InterfaceC1474aCq
    public void d() {
        this.e.b(UiLatencyMarker.Mark.QUEUED_END);
    }
}
