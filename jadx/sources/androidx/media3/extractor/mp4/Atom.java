package androidx.media3.extractor.mp4;

import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.Util;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.chromium.net.PrivateKeyType;

/* loaded from: classes2.dex */
abstract class Atom {
    public static final int TYPE_sdtp = Util.getIntegerCodeForString("sdtp");
    public final int type;

    public static int parseFullAtomFlags(int i) {
        return i & 16777215;
    }

    public static int parseFullAtomVersion(int i) {
        return (i >> 24) & PrivateKeyType.INVALID;
    }

    public Atom(int i) {
        this.type = i;
    }

    public String toString() {
        return getAtomTypeString(this.type);
    }

    /* loaded from: classes2.dex */
    static final class LeafAtom extends Atom {
        public final ParsableByteArray data;

        public LeafAtom(int i, ParsableByteArray parsableByteArray) {
            super(i);
            this.data = parsableByteArray;
        }
    }

    /* loaded from: classes2.dex */
    static final class ContainerAtom extends Atom {
        public final List<ContainerAtom> containerChildren;
        public final long endPosition;
        public final List<LeafAtom> leafChildren;

        public ContainerAtom(int i, long j) {
            super(i);
            this.endPosition = j;
            this.leafChildren = new ArrayList();
            this.containerChildren = new ArrayList();
        }

        public void add(LeafAtom leafAtom) {
            this.leafChildren.add(leafAtom);
        }

        public void add(ContainerAtom containerAtom) {
            this.containerChildren.add(containerAtom);
        }

        public LeafAtom getLeafAtomOfType(int i) {
            int size = this.leafChildren.size();
            for (int i2 = 0; i2 < size; i2++) {
                LeafAtom leafAtom = this.leafChildren.get(i2);
                if (leafAtom.type == i) {
                    return leafAtom;
                }
            }
            return null;
        }

        public ContainerAtom getContainerAtomOfType(int i) {
            int size = this.containerChildren.size();
            for (int i2 = 0; i2 < size; i2++) {
                ContainerAtom containerAtom = this.containerChildren.get(i2);
                if (containerAtom.type == i) {
                    return containerAtom;
                }
            }
            return null;
        }

        @Override // androidx.media3.extractor.mp4.Atom
        public String toString() {
            return Atom.getAtomTypeString(this.type) + " leaves: " + Arrays.toString(this.leafChildren.toArray()) + " containers: " + Arrays.toString(this.containerChildren.toArray());
        }
    }

    public static String getAtomTypeString(int i) {
        return "" + ((char) ((i >> 24) & PrivateKeyType.INVALID)) + ((char) ((i >> 16) & PrivateKeyType.INVALID)) + ((char) ((i >> 8) & PrivateKeyType.INVALID)) + ((char) (i & PrivateKeyType.INVALID));
    }
}
