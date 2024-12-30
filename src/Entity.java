import java.util.Objects;

public abstract class Entity {
    @Override
    public abstract String toString();

    @Override
    public abstract boolean equals(Object obj);

    @Override
    public abstract int hashCode();
}
