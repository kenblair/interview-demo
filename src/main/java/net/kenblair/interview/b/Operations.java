package net.kenblair.interview.b;

import java.util.Collection;

public interface Operations {

    /**
     * Build a collection that is the intersection of {@code c1} and {@code c2}.
     *
     * @param c1 The first collection.
     * @param c2 The second collection.
     * @return The intersection of the first and second collection.
     */
    public Collection<String> intersect(Collection<String> c1, Collection<String> c2);

    /**
     * Build a collection that is the union of {@code c1} and {@code c2}.
     *
     * @param c1 The first collection.
     * @param c2 The second collection.
     * @return The union of the first and second collection.
     */
    public Collection<String> union(Collection<String> c1, Collection<String> c2);

}
