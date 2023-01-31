package dr0n.service;

import dr0n.Tag;

import java.util.List;

public interface TagService {
    Tag getById(Long id);
    List<Tag> getAllTags();
    void addTag(Tag tag);
}
