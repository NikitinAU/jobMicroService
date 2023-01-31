package dr0n.mappers;

import dr0n.Tag;
import dr0n.persistent.model.TagEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface TagToEntityMapper {
    TagEntity tagToTagEntity(Tag tag);
    Tag tagEntityToTag(TagEntity tagEntity);
}
