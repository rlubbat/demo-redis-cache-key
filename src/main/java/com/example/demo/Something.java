package com.example.demo;

import java.util.Objects;
import java.util.StringJoiner;

/**
 * @author Stephane Nicoll
 */
public class Something {
    private final String name;

    public Something(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
        Something something = (Something) o;
        return Objects.equals(name, something.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", this.getClass().getSimpleName() + "[", "]")
                .add("name = " + name)
                .toString();
    }
}
