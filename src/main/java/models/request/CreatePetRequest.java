package models.request;

import java.util.ArrayList;
import java.util.List;

public class CreatePetRequest {
    public Integer id;
    public Category category;
    public String name;
    public List<String> photoUrls;
    public List<Tag> tags;
    public String status;

    private CreatePetRequest(Builder builder) {
        id = builder.id;
        category = builder.category;
        name = builder.name;
        photoUrls = builder.photoUrls;
        tags = builder.tags;
        status = builder.status;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static class Category {
        public Integer id;
        public String name;

        private Category(Builder builder) {
            id = builder.id;
            name = builder.name;
        }

        public static Builder newBuilder() {
            return new Builder();
        }

        public static final class Builder {
            private Integer id = 0;
            private String name = "categoryName";

            private Builder() {
            }

            public Builder withId(Integer val) {
                id = val;
                return this;
            }

            public Builder withName(String val) {
                name = val;
                return this;
            }

            public Category build() {
                return new Category(this);
            }
        }
    }

    public static class Tag {
        public Integer id;
        public String name;

        private Tag(Builder builder) {
            id = builder.id;
            name = builder.name;
        }

        public static Builder newBuilder() {
            return new Builder();
        }

        public static final class Builder {
            private Integer id = 0;
            private String name = "tagName";

            private Builder() {
            }

            public Builder withId(Integer val) {
                id = val;
                return this;
            }

            public Builder withName(String val) {
                name = val;
                return this;
            }

            public Tag build() {
                return new Tag(this);
            }
        }
    }

    public static final class Builder {
        private Integer id;
        private Category category;
        private String name;
        private List<String> photoUrls = new ArrayList<>();
        private List<Tag> tags = new ArrayList<>();
        private String status;

        private Builder() {
        }

        public Builder withId(Integer val) {
            id = val;
            return this;
        }

        public Builder withCategory(Category val) {
            category = val;
            return this;
        }

        public Builder withName(String val) {
            name = val;
            return this;
        }

        public Builder withPhotoUrls(List<String> val) {
            photoUrls = val;
            return this;
        }

        public Builder addPhotoUrls() {
            photoUrls.add("photoUrl");
            return this;
        }

        public Builder withTags(List<Tag> val) {
            tags = val;
            return this;
        }

        public Builder addTags(Tag val) {
            tags.add(val);
            return this;
        }

        public Builder withStatus(String val) {
            status = val;
            return this;
        }

        public CreatePetRequest build() {
            return new CreatePetRequest(this);
        }
    }
}
