package dr0n.service;

import dr0n.mappers.TagToEntityMapper;
import dr0n.persistent.model.TagEntity;
import dr0n.persistent.repository.TagRepository;
import lombok.RequiredArgsConstructor;
import dr0n.Tag;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class DefaultTagService implements TagService{
    private final TagRepository tagRepository;
    private final TagToEntityMapper tagToEntityMapper;

    @Override
    public Tag getById(Long id) {
        TagEntity tagEntity = tagRepository.findById(id).orElse(null);
        return tagToEntityMapper.tagEntityToTag(tagEntity);
    }

    @Override
    public List<Tag> getAllTags() {
        Iterable<TagEntity> iterable = tagRepository.findAll();
        ArrayList<Tag> tags = new ArrayList<>();
        for (TagEntity tagEntity : iterable){
            tags.add(tagToEntityMapper.tagEntityToTag(tagEntity));
        }
        return tags;
    }

    @Override
    public void addTag(Tag tag) {
        TagEntity tagEntity = tagToEntityMapper.tagToTagEntity(tag);
        tagRepository.save(tagEntity);
    }
}
