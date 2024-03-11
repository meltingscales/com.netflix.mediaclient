package androidx.constraintlayout.compose;

import o.C8632dsu;
import o.drM;

/* loaded from: classes.dex */
public interface Dimension {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* loaded from: classes.dex */
    public interface Coercible extends Dimension {
    }

    /* loaded from: classes.dex */
    public interface MaxCoercible extends Dimension {
    }

    /* loaded from: classes.dex */
    public interface MinCoercible extends Dimension {
    }

    /* loaded from: classes.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public final Dimension getWrapContent() {
            return new DimensionDescription(new drM<State, androidx.constraintlayout.core.state.Dimension>() { // from class: androidx.constraintlayout.compose.Dimension$Companion$wrapContent$1
                @Override // o.drM
                public final androidx.constraintlayout.core.state.Dimension invoke(State state) {
                    C8632dsu.c((Object) state, "");
                    androidx.constraintlayout.core.state.Dimension Fixed = androidx.constraintlayout.core.state.Dimension.Fixed(androidx.constraintlayout.core.state.Dimension.WRAP_DIMENSION);
                    C8632dsu.a(Fixed, "");
                    return Fixed;
                }
            });
        }

        public final Coercible getFillToConstraints() {
            return new DimensionDescription(new drM<State, androidx.constraintlayout.core.state.Dimension>() { // from class: androidx.constraintlayout.compose.Dimension$Companion$fillToConstraints$1
                @Override // o.drM
                public final androidx.constraintlayout.core.state.Dimension invoke(State state) {
                    C8632dsu.c((Object) state, "");
                    androidx.constraintlayout.core.state.Dimension Suggested = androidx.constraintlayout.core.state.Dimension.Suggested(androidx.constraintlayout.core.state.Dimension.SPREAD_DIMENSION);
                    C8632dsu.a(Suggested, "");
                    return Suggested;
                }
            });
        }
    }
}
