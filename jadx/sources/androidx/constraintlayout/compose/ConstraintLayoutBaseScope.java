package androidx.constraintlayout.compose;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o.C8632dsu;
import o.dpR;
import o.drM;

/* loaded from: classes.dex */
public abstract class ConstraintLayoutBaseScope {
    private int helpersHashCode;
    private final List<drM<State, dpR>> tasks = new ArrayList();
    private final int HelpersStartId = 1000;
    private int helperId = 1000;

    public final int getHelpersHashCode() {
        return this.helpersHashCode;
    }

    public void reset() {
        this.tasks.clear();
        this.helperId = this.HelpersStartId;
        this.helpersHashCode = 0;
    }

    /* loaded from: classes.dex */
    public static final class VerticalAnchor {
        private final Object id;
        private final int index;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof VerticalAnchor) {
                VerticalAnchor verticalAnchor = (VerticalAnchor) obj;
                return C8632dsu.c(this.id, verticalAnchor.id) && this.index == verticalAnchor.index;
            }
            return false;
        }

        public final Object getId$compose_release() {
            return this.id;
        }

        public final int getIndex$compose_release() {
            return this.index;
        }

        public int hashCode() {
            return (this.id.hashCode() * 31) + Integer.hashCode(this.index);
        }

        public String toString() {
            return "VerticalAnchor(id=" + this.id + ", index=" + this.index + ')';
        }

        public VerticalAnchor(Object obj, int i) {
            C8632dsu.c(obj, "");
            this.id = obj;
            this.index = i;
        }
    }

    /* loaded from: classes.dex */
    public static final class HorizontalAnchor {
        private final Object id;
        private final int index;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof HorizontalAnchor) {
                HorizontalAnchor horizontalAnchor = (HorizontalAnchor) obj;
                return C8632dsu.c(this.id, horizontalAnchor.id) && this.index == horizontalAnchor.index;
            }
            return false;
        }

        public final Object getId$compose_release() {
            return this.id;
        }

        public final int getIndex$compose_release() {
            return this.index;
        }

        public int hashCode() {
            return (this.id.hashCode() * 31) + Integer.hashCode(this.index);
        }

        public String toString() {
            return "HorizontalAnchor(id=" + this.id + ", index=" + this.index + ')';
        }

        public HorizontalAnchor(Object obj, int i) {
            C8632dsu.c(obj, "");
            this.id = obj;
            this.index = i;
        }
    }

    /* loaded from: classes.dex */
    public static final class BaselineAnchor {
        private final Object id;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof BaselineAnchor) && C8632dsu.c(this.id, ((BaselineAnchor) obj).id);
        }

        public int hashCode() {
            return this.id.hashCode();
        }

        public String toString() {
            return "BaselineAnchor(id=" + this.id + ')';
        }

        public BaselineAnchor(Object obj) {
            C8632dsu.c(obj, "");
            this.id = obj;
        }
    }

    public final void applyTo(State state) {
        C8632dsu.c((Object) state, "");
        Iterator<T> it = this.tasks.iterator();
        while (it.hasNext()) {
            ((drM) it.next()).invoke(state);
        }
    }
}
