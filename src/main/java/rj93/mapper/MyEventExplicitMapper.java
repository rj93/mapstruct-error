package rj93.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import rj93.model.source.MyEvent;
import rj93.model.target.MyEventDto;

@Mapper(uses = EventMapper.class)
public interface MyEventExplicitMapper {

    @Mappings({
            @Mapping(target = "eventId", source = "id"),
            @Mapping(target = "draftSupported", source = "event", qualifiedByName = "supportsDraft"),
            @Mapping(target = "eventName", source = "eventName"),
    })
    MyEventDto map(MyEvent event);
}
