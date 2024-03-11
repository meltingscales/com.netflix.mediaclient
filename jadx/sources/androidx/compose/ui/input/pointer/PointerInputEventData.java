package androidx.compose.ui.input.pointer;

import androidx.compose.ui.geometry.Offset;
import java.util.List;
import o.C8627dsp;
import o.C8632dsu;

/* loaded from: classes.dex */
public final class PointerInputEventData {
    private final boolean down;
    private final List<HistoricalChange> historical;
    private final long id;
    private final boolean issuesEnterExit;
    private final long originalEventPosition;
    private final long position;
    private final long positionOnScreen;
    private final float pressure;
    private final long scrollDelta;
    private final int type;
    private final long uptime;

    public /* synthetic */ PointerInputEventData(long j, long j2, long j3, long j4, boolean z, float f, int i, boolean z2, List list, long j5, long j6, C8627dsp c8627dsp) {
        this(j, j2, j3, j4, z, f, i, z2, list, j5, j6);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PointerInputEventData) {
            PointerInputEventData pointerInputEventData = (PointerInputEventData) obj;
            return PointerId.m1719equalsimpl0(this.id, pointerInputEventData.id) && this.uptime == pointerInputEventData.uptime && Offset.m1134equalsimpl0(this.positionOnScreen, pointerInputEventData.positionOnScreen) && Offset.m1134equalsimpl0(this.position, pointerInputEventData.position) && this.down == pointerInputEventData.down && Float.compare(this.pressure, pointerInputEventData.pressure) == 0 && PointerType.m1754equalsimpl0(this.type, pointerInputEventData.type) && this.issuesEnterExit == pointerInputEventData.issuesEnterExit && C8632dsu.c(this.historical, pointerInputEventData.historical) && Offset.m1134equalsimpl0(this.scrollDelta, pointerInputEventData.scrollDelta) && Offset.m1134equalsimpl0(this.originalEventPosition, pointerInputEventData.originalEventPosition);
        }
        return false;
    }

    public final boolean getDown() {
        return this.down;
    }

    public final List<HistoricalChange> getHistorical() {
        return this.historical;
    }

    /* renamed from: getId-J3iCeTQ  reason: not valid java name */
    public final long m1734getIdJ3iCeTQ() {
        return this.id;
    }

    public final boolean getIssuesEnterExit() {
        return this.issuesEnterExit;
    }

    /* renamed from: getOriginalEventPosition-F1C5BW0  reason: not valid java name */
    public final long m1735getOriginalEventPositionF1C5BW0() {
        return this.originalEventPosition;
    }

    /* renamed from: getPosition-F1C5BW0  reason: not valid java name */
    public final long m1736getPositionF1C5BW0() {
        return this.position;
    }

    /* renamed from: getPositionOnScreen-F1C5BW0  reason: not valid java name */
    public final long m1737getPositionOnScreenF1C5BW0() {
        return this.positionOnScreen;
    }

    public final float getPressure() {
        return this.pressure;
    }

    /* renamed from: getScrollDelta-F1C5BW0  reason: not valid java name */
    public final long m1738getScrollDeltaF1C5BW0() {
        return this.scrollDelta;
    }

    /* renamed from: getType-T8wyACA  reason: not valid java name */
    public final int m1739getTypeT8wyACA() {
        return this.type;
    }

    public final long getUptime() {
        return this.uptime;
    }

    public int hashCode() {
        return (((((((((((((((((((PointerId.m1720hashCodeimpl(this.id) * 31) + Long.hashCode(this.uptime)) * 31) + Offset.m1139hashCodeimpl(this.positionOnScreen)) * 31) + Offset.m1139hashCodeimpl(this.position)) * 31) + Boolean.hashCode(this.down)) * 31) + Float.hashCode(this.pressure)) * 31) + PointerType.m1755hashCodeimpl(this.type)) * 31) + Boolean.hashCode(this.issuesEnterExit)) * 31) + this.historical.hashCode()) * 31) + Offset.m1139hashCodeimpl(this.scrollDelta)) * 31) + Offset.m1139hashCodeimpl(this.originalEventPosition);
    }

    public String toString() {
        return "PointerInputEventData(id=" + ((Object) PointerId.m1721toStringimpl(this.id)) + ", uptime=" + this.uptime + ", positionOnScreen=" + ((Object) Offset.m1144toStringimpl(this.positionOnScreen)) + ", position=" + ((Object) Offset.m1144toStringimpl(this.position)) + ", down=" + this.down + ", pressure=" + this.pressure + ", type=" + ((Object) PointerType.m1756toStringimpl(this.type)) + ", issuesEnterExit=" + this.issuesEnterExit + ", historical=" + this.historical + ", scrollDelta=" + ((Object) Offset.m1144toStringimpl(this.scrollDelta)) + ", originalEventPosition=" + ((Object) Offset.m1144toStringimpl(this.originalEventPosition)) + ')';
    }

    private PointerInputEventData(long j, long j2, long j3, long j4, boolean z, float f, int i, boolean z2, List<HistoricalChange> list, long j5, long j6) {
        this.id = j;
        this.uptime = j2;
        this.positionOnScreen = j3;
        this.position = j4;
        this.down = z;
        this.pressure = f;
        this.type = i;
        this.issuesEnterExit = z2;
        this.historical = list;
        this.scrollDelta = j5;
        this.originalEventPosition = j6;
    }
}
