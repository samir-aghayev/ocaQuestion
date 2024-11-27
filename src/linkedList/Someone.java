package linkedList;

public class Someone {
    private String name;
    private String surName;

    private Someone() {
    }

    public String getName() {
        return name;
    }

    public String getSurName() {
        return surName;
    }

    @Override
    public String toString() {
        return "Someone{name='%s', surName='%s'}".formatted(name, surName);
    }

    public static class SomeoneBuilder {
        private final Someone someone;

        public SomeoneBuilder() {
            someone = new Someone();
        }

        public Someone build() {
            return someone;
        }


        public SomeoneBuilder name(String name) {
            someone.name = name;
            return this;
        }


        public SomeoneBuilder surName(String surName) {
            someone.surName = surName;
            return this;
        }
    }
}
