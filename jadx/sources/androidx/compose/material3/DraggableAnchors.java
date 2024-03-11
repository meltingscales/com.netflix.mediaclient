package androidx.compose.material3;

/* loaded from: classes.dex */
public interface DraggableAnchors<T> {
    T closestAnchor(float f);

    T closestAnchor(float f, boolean z);

    boolean hasAnchorFor(T t);

    float maxAnchor();

    float minAnchor();

    float positionOf(T t);
}
