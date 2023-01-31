package dr0n.controller;

import dr0n.Tag;
import dr0n.mappers.TagToDTOMapper;
import dr0n.service.TagService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/tags")
@RequiredArgsConstructor
public class TagController {
    private final TagService tagService;
    private final TagToDTOMapper tagToDTOMapper;

    @GetMapping(value = "/{id}")
    public Tag getTagById(@PathVariable Long id){
        return tagService.getById(id);
    }

    @GetMapping
    public List<Tag> getAllTags(){
        return tagService.getAllTags();
    }

    @PostMapping
    public void addTag(TagRequest tagRequest){
        tagService.addTag(tagToDTOMapper.addTagRequestToTag(tagRequest));
    }
}
