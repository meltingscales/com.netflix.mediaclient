package androidx.emoji2.text;

import android.graphics.Typeface;
import android.util.SparseArray;
import androidx.core.os.TraceCompat;
import androidx.core.util.Preconditions;
import androidx.emoji2.text.flatbuffer.MetadataList;
import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public final class MetadataRepo {
    private final char[] mEmojiCharArray;
    private final MetadataList mMetadataList;
    private final Node mRootNode = new Node(1024);
    private final Typeface mTypeface;

    public char[] getEmojiCharArray() {
        return this.mEmojiCharArray;
    }

    public MetadataList getMetadataList() {
        return this.mMetadataList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Node getRootNode() {
        return this.mRootNode;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Typeface getTypeface() {
        return this.mTypeface;
    }

    private MetadataRepo(Typeface typeface, MetadataList metadataList) {
        this.mTypeface = typeface;
        this.mMetadataList = metadataList;
        this.mEmojiCharArray = new char[metadataList.listLength() * 2];
        constructIndex(metadataList);
    }

    public static MetadataRepo create(Typeface typeface, ByteBuffer byteBuffer) {
        try {
            TraceCompat.beginSection("EmojiCompat.MetadataRepo.create");
            return new MetadataRepo(typeface, MetadataListReader.read(byteBuffer));
        } finally {
            TraceCompat.endSection();
        }
    }

    private void constructIndex(MetadataList metadataList) {
        int listLength = metadataList.listLength();
        for (int i = 0; i < listLength; i++) {
            TypefaceEmojiRasterizer typefaceEmojiRasterizer = new TypefaceEmojiRasterizer(this, i);
            Character.toChars(typefaceEmojiRasterizer.getId(), this.mEmojiCharArray, i * 2);
            put(typefaceEmojiRasterizer);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int getMetadataVersion() {
        return this.mMetadataList.version();
    }

    void put(TypefaceEmojiRasterizer typefaceEmojiRasterizer) {
        Preconditions.checkNotNull(typefaceEmojiRasterizer, "emoji metadata cannot be null");
        Preconditions.checkArgument(typefaceEmojiRasterizer.getCodepointsLength() > 0, "invalid metadata codepoint length");
        this.mRootNode.put(typefaceEmojiRasterizer, 0, typefaceEmojiRasterizer.getCodepointsLength() - 1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static class Node {
        private final SparseArray<Node> mChildren;
        private TypefaceEmojiRasterizer mData;

        /* JADX INFO: Access modifiers changed from: package-private */
        public final TypefaceEmojiRasterizer getData() {
            return this.mData;
        }

        private Node() {
            this(1);
        }

        Node(int i) {
            this.mChildren = new SparseArray<>(i);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public Node get(int i) {
            SparseArray<Node> sparseArray = this.mChildren;
            if (sparseArray == null) {
                return null;
            }
            return sparseArray.get(i);
        }

        void put(TypefaceEmojiRasterizer typefaceEmojiRasterizer, int i, int i2) {
            Node node = get(typefaceEmojiRasterizer.getCodepointAt(i));
            if (node == null) {
                node = new Node();
                this.mChildren.put(typefaceEmojiRasterizer.getCodepointAt(i), node);
            }
            if (i2 > i) {
                node.put(typefaceEmojiRasterizer, i + 1, i2);
            } else {
                node.mData = typefaceEmojiRasterizer;
            }
        }
    }
}
