package dr0n.mappers;
import dr0n.Tag;
import dr0n.controller.TagRequest;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface TagToDTOMapper {
    Tag addTagRequestToTag(TagRequest tagRequest);
}
