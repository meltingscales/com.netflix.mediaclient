package androidx.compose.ui.input.pointer;

import androidx.compose.ui.geometry.Offset;
import com.netflix.android.org.json.zip.JSONzip;
import java.util.List;
import o.C8569dql;
import o.C8627dsp;

/* loaded from: classes.dex */
public final class PointerInputChange {
    private List<HistoricalChange> _historical;
    private ConsumedData consumed;
    private final long id;
    private long originalEventPosition;
    private final long position;
    private final boolean pressed;
    private final float pressure;
    private final long previousPosition;
    private final boolean previousPressed;
    private final long previousUptimeMillis;
    private final long scrollDelta;
    private final int type;
    private final long uptimeMillis;

    public /* synthetic */ PointerInputChange(long j, long j2, long j3, boolean z, float f, long j4, long j5, boolean z2, boolean z3, int i, long j6, C8627dsp c8627dsp) {
        this(j, j2, j3, z, f, j4, j5, z2, z3, i, j6);
    }

    public /* synthetic */ PointerInputChange(long j, long j2, long j3, boolean z, float f, long j4, long j5, boolean z2, boolean z3, int i, List list, long j6, long j7, C8627dsp c8627dsp) {
        this(j, j2, j3, z, f, j4, j5, z2, z3, i, list, j6, j7);
    }

    /* renamed from: getId-J3iCeTQ  reason: not valid java name */
    public final long m1727getIdJ3iCeTQ() {
        return this.id;
    }

    /* renamed from: getOriginalEventPosition-F1C5BW0$ui_release  reason: not valid java name */
    public final long m1728getOriginalEventPositionF1C5BW0$ui_release() {
        return this.originalEventPosition;
    }

    /* renamed from: getPosition-F1C5BW0  reason: not valid java name */
    public final long m1729getPositionF1C5BW0() {
        return this.position;
    }

    public final boolean getPressed() {
        return this.pressed;
    }

    public final float getPressure() {
        return this.pressure;
    }

    /* renamed from: getPreviousPosition-F1C5BW0  reason: not valid java name */
    public final long m1730getPreviousPositionF1C5BW0() {
        return this.previousPosition;
    }

    public final boolean getPreviousPressed() {
        return this.previousPressed;
    }

    /* renamed from: getScrollDelta-F1C5BW0  reason: not valid java name */
    public final long m1731getScrollDeltaF1C5BW0() {
        return this.scrollDelta;
    }

    /* renamed from: getType-T8wyACA  reason: not valid java name */
    public final int m1732getTypeT8wyACA() {
        return this.type;
    }

    public final long getUptimeMillis() {
        return this.uptimeMillis;
    }

    private PointerInputChange(long j, long j2, long j3, boolean z, float f, long j4, long j5, boolean z2, boolean z3, int i, long j6) {
        this.id = j;
        this.uptimeMillis = j2;
        this.position = j3;
        this.pressed = z;
        this.pressure = f;
        this.previousUptimeMillis = j4;
        this.previousPosition = j5;
        this.previousPressed = z2;
        this.type = i;
        this.scrollDelta = j6;
        this.originalEventPosition = Offset.Companion.m1149getZeroF1C5BW0();
        this.consumed = new ConsumedData(z3, z3);
    }

    public /* synthetic */ PointerInputChange(long j, long j2, long j3, boolean z, float f, long j4, long j5, boolean z2, boolean z3, int i, long j6, int i2, C8627dsp c8627dsp) {
        this(j, j2, j3, z, f, j4, j5, z2, z3, (i2 & 512) != 0 ? PointerType.Companion.m1761getTouchT8wyACA() : i, (i2 & 1024) != 0 ? Offset.Companion.m1149getZeroF1C5BW0() : j6, null);
    }

    private PointerInputChange(long j, long j2, long j3, boolean z, float f, long j4, long j5, boolean z2, boolean z3, int i, List<HistoricalChange> list, long j6, long j7) {
        this(j, j2, j3, z, f, j4, j5, z2, z3, i, j6, null);
        this._historical = list;
        this.originalEventPosition = j7;
    }

    public final List<HistoricalChange> getHistorical() {
        List<HistoricalChange> i;
        List<HistoricalChange> list = this._historical;
        if (list == null) {
            i = C8569dql.i();
            return i;
        }
        return list;
    }

    public final boolean isConsumed() {
        return this.consumed.getDownChange() || this.consumed.getPositionChange();
    }

    public final void consume() {
        this.consumed.setDownChange(true);
        this.consumed.setPositionChange(true);
    }

    /* renamed from: copy-OHpmEuE  reason: not valid java name */
    public final PointerInputChange m1726copyOHpmEuE(long j, long j2, long j3, boolean z, long j4, long j5, boolean z2, int i, List<HistoricalChange> list, long j6) {
        return m1723copy8H9lfAM$default(this, j, j2, j3, 0L, z, this.pressure, j4, j5, z2, i, list, j6, 8, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: copy-8H9lfAM$default  reason: not valid java name */
    public static /* synthetic */ PointerInputChange m1723copy8H9lfAM$default(PointerInputChange pointerInputChange, long j, long j2, long j3, long j4, boolean z, float f, long j5, long j6, boolean z2, int i, List list, long j7, int i2, Object obj) {
        return pointerInputChange.m1725copy8H9lfAM((i2 & 1) != 0 ? pointerInputChange.id : j, (i2 & 2) != 0 ? pointerInputChange.uptimeMillis : j2, (i2 & 4) != 0 ? pointerInputChange.position : j3, (i2 & 8) != 0 ? pointerInputChange.originalEventPosition : j4, (i2 & 16) != 0 ? pointerInputChange.pressed : z, (i2 & 32) != 0 ? pointerInputChange.pressure : f, (i2 & 64) != 0 ? pointerInputChange.previousUptimeMillis : j5, (i2 & 128) != 0 ? pointerInputChange.previousPosition : j6, (i2 & JSONzip.end) != 0 ? pointerInputChange.previousPressed : z2, (i2 & 512) != 0 ? pointerInputChange.type : i, (i2 & 1024) != 0 ? pointerInputChange.getHistorical() : list, (i2 & 2048) != 0 ? pointerInputChange.scrollDelta : j7);
    }

    /* renamed from: copy-8H9lfAM  reason: not valid java name */
    public final PointerInputChange m1725copy8H9lfAM(long j, long j2, long j3, long j4, boolean z, float f, long j5, long j6, boolean z2, int i, List<HistoricalChange> list, long j7) {
        PointerInputChange pointerInputChange = new PointerInputChange(j, j2, j3, z, f, j5, j6, z2, false, i, list, j7, j4, null);
        pointerInputChange.consumed = this.consumed;
        return pointerInputChange;
    }

    public String toString() {
        return "PointerInputChange(id=" + ((Object) PointerId.m1721toStringimpl(this.id)) + ", uptimeMillis=" + this.uptimeMillis + ", position=" + ((Object) Offset.m1144toStringimpl(this.position)) + ", pressed=" + this.pressed + ", pressure=" + this.pressure + ", previousUptimeMillis=" + this.previousUptimeMillis + ", previousPosition=" + ((Object) Offset.m1144toStringimpl(this.previousPosition)) + ", previousPressed=" + this.previousPressed + ", isConsumed=" + isConsumed() + ", type=" + ((Object) PointerType.m1756toStringimpl(this.type)) + ", historical=" + getHistorical() + ",scrollDelta=" + ((Object) Offset.m1144toStringimpl(this.scrollDelta)) + ')';
    }
}
