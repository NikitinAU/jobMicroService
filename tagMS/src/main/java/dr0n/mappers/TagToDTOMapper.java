package dr0n.mappers;
import dr0n.Tag;
import dr0n.controller.TagRequest;


public interface TagToDTOMapper {
    Tag addTagRequestToTag(TagRequest tagRequest);
}
