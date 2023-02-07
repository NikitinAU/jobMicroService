package dr0n.mappers;

import dr0n.Tag;
import dr0n.persistent.model.TagEntity;

public interface TagToEntityMapper {
    TagEntity tagToTagEntity(Tag tag);
    Tag tagEntityToTag(TagEntity tagEntity);
}
